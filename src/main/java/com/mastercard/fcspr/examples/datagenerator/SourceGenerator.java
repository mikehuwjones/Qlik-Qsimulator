

package com.mastercard.fcspr.examples.datagenerator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mastercard.fcspr.types.Source.Source;

import java.io.File;
import java.util.Random;

class SourceGenerator {

    private static final SourceGenerator ourInstance = new SourceGenerator();
    private final Random random;

    private Source[] sources;

    private int getIndex() {
        return random.nextInt(3);
    }

    static SourceGenerator getInstance() {
        return ourInstance;
    }

    private SourceGenerator() {
        final String DATAFILE = "src/main/resources/data/source.json";
        final ObjectMapper mapper;
        random = new Random();
        mapper = new ObjectMapper();
        try {
            sources = mapper.readValue(new File(DATAFILE), Source[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    Source getNextSource() {
        return sources[getIndex()];
    }

}
