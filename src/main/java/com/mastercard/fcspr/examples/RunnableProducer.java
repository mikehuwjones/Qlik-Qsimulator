package com.mastercard.fcspr.examples;

import com.mastercard.fcspr.examples.datagenerator.TransactionGenerator;
import com.mastercard.fcspr.types.Transaction;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

public class RunnableProducer implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private final AtomicBoolean stopper = new AtomicBoolean(false);
    private KafkaProducer<String, Transaction> producer;
    private String topicName;
    private TransactionGenerator transactionGenerator;
    private int produceSpeed;
    private int id;

    RunnableProducer(int id, KafkaProducer<String, Transaction> producer, String topicName, int produceSpeed) {
        this.id = id;
        this.producer = producer;
        this.topicName = topicName;
        this.produceSpeed = produceSpeed;
        this.transactionGenerator = com.mastercard.fcspr.examples.datagenerator.TransactionGenerator.getInstance();
    }
    @Override
    public void run() {
        try {
            logger.info("Starting producer thread - " + id);
            while (!stopper.get()) {
                Transaction transaction = transactionGenerator.getNextTransaction();
                //Transaction transaction = transactionGenerator.getNextTransaction();
                producer.send(new ProducerRecord<>(topicName, transaction.getId().toString(), transaction));
                Thread.sleep(produceSpeed);
            }

        } catch (Exception e) {
            logger.error("Exception in Producer thread - " + id);
            throw new RuntimeException(e);
        }

    }

    void shutdown() {
        logger.info("Shutting down producer thread - " + id);
        stopper.set(true);

    }
}
