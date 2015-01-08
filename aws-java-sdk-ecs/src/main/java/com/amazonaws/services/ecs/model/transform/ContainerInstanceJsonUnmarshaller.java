/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Container Instance JSON Unmarshaller
 */
public class ContainerInstanceJsonUnmarshaller implements Unmarshaller<ContainerInstance, JsonUnmarshallerContext> {

    public ContainerInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerInstance containerInstance = new ContainerInstance();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("containerInstanceArn", targetDepth)) {
                    context.nextToken();
                    containerInstance.setContainerInstanceArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2InstanceId", targetDepth)) {
                    context.nextToken();
                    containerInstance.setEc2InstanceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("remainingResources", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRemainingResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("registeredResources", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRegisteredResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    containerInstance.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("agentConnected", targetDepth)) {
                    context.nextToken();
                    containerInstance.setAgentConnected(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return containerInstance;
    }

    private static ContainerInstanceJsonUnmarshaller instance;
    public static ContainerInstanceJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ContainerInstanceJsonUnmarshaller();
        return instance;
    }
}
    