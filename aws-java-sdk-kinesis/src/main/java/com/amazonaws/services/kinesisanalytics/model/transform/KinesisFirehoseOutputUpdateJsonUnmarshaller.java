/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KinesisFirehoseOutputUpdate JSON Unmarshaller
 */
public class KinesisFirehoseOutputUpdateJsonUnmarshaller implements Unmarshaller<KinesisFirehoseOutputUpdate, JsonUnmarshallerContext> {

    public KinesisFirehoseOutputUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        KinesisFirehoseOutputUpdate kinesisFirehoseOutputUpdate = new KinesisFirehoseOutputUpdate();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ResourceARNUpdate", targetDepth)) {
                    context.nextToken();
                    kinesisFirehoseOutputUpdate.setResourceARNUpdate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleARNUpdate", targetDepth)) {
                    context.nextToken();
                    kinesisFirehoseOutputUpdate.setRoleARNUpdate(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kinesisFirehoseOutputUpdate;
    }

    private static KinesisFirehoseOutputUpdateJsonUnmarshaller instance;

    public static KinesisFirehoseOutputUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KinesisFirehoseOutputUpdateJsonUnmarshaller();
        return instance;
    }
}
