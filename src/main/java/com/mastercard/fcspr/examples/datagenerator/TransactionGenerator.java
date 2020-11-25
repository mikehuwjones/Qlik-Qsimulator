package com.mastercard.fcspr.examples.datagenerator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mastercard.fcspr.types.*;


import com.mastercard.fcspr.types.Dest.Dest;
import com.mastercard.fcspr.types.Settlement.Settlement;
import com.mastercard.fcspr.types.Source.Source;
import com.mastercard.fcspr.types.SourceDevice.SourceDevice;
import com.mastercard.fcspr.types.Transaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Random;

public class TransactionGenerator {
    private static final Logger logger = LogManager.getLogger();
    private static TransactionGenerator ourInstance = new TransactionGenerator();
    private final Random transIndex;
    private final Random transNumber;
    private final Random numberOfItems;
    private final Transaction[] transactions;


    public static TransactionGenerator getInstance() {
        return ourInstance;
    }

    private TransactionGenerator() {
        String DATAFILE = "src/main/resources/data/transaction.json";
        ObjectMapper mapper;
        transIndex = new Random();
        transNumber = new Random();
        numberOfItems = new Random();
        mapper = new ObjectMapper();
        try {
            transactions = mapper.readValue(new File(DATAFILE), Transaction[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int getIndex() {
        return transIndex.nextInt(3);
    }

    private int getNewTxeNumber() {
        return transNumber.nextInt(99999999) + 99999;
    }

    public Transaction getNextTransaction() {
        Transaction trans = transactions[getIndex()];
        //trans.setId(Integer.toString(getNewInvoiceNumber()));
        trans.setTime(System.currentTimeMillis());
        Dest destination = DestGenerator.getInstance().getNextDest();
        trans.setDest(destination);
        Source source = SourceGenerator.getInstance().getNextSource();
        trans.setSource(source);
        SourceDevice sourceDevice = SourceDeviceGenerator.getInstance().getNextSourceDevice();
        trans.setSourceDevice(sourceDevice);
        Settlement settlement = SettlementGenerator.getInstance().getNextSettlement();
        trans.setSettlement(settlement);

        logger.debug(trans);
        return trans;
    }
}
