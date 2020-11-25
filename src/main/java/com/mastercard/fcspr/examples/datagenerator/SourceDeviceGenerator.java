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
import com.mastercard.fcspr.types.SourceDevice.SourceDevice;


import java.io.File;
import java.util.Random;

class SourceDeviceGenerator {

    private static final SourceDeviceGenerator ourInstance = new SourceDeviceGenerator();
    private final Random random;

    private SourceDevice[] sourceDevices;

    private int getIndex() {
        return random.nextInt(3);
    }

    static SourceDeviceGenerator getInstance() {
        return ourInstance;
    }

    private SourceDeviceGenerator() {
        final String DATAFILE = "src/main/resources/data/sourceDevice.json";
        final ObjectMapper mapper;
        random = new Random();
        mapper = new ObjectMapper();
        try {
            sourceDevices = mapper.readValue(new File(DATAFILE), SourceDevice[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    SourceDevice getNextSourceDevice() {
        return sourceDevices[getIndex()];
    }

}
