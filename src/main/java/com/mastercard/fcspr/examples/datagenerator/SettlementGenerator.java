/*
 * Copyright (c) 2018. Prashant Kumar Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.mastercard.fcspr.examples.datagenerator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mastercard.fcspr.types.Settlement.Settlement;


import java.io.File;
import java.util.Random;

class SettlementGenerator {

    private static final SettlementGenerator ourInstance = new SettlementGenerator();
    private final Random random;

    private Settlement[] settlements;

    private int getIndex() {
        return random.nextInt(3);
    }

    static SettlementGenerator getInstance() {
        return ourInstance;
    }

    private SettlementGenerator() {
        final String DATAFILE = "src/main/resources/data/settlement.json";
        final ObjectMapper mapper;
        random = new Random();
        mapper = new ObjectMapper();
        try {
            settlements = mapper.readValue(new File(DATAFILE), Settlement[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    Settlement getNextSettlement() {
        return settlements[getIndex()];
    }

}
