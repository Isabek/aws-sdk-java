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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Enable M F A Device Request Marshaller
 */
public class EnableMFADeviceRequestMarshaller implements Marshaller<Request<EnableMFADeviceRequest>, EnableMFADeviceRequest> {

    public Request<EnableMFADeviceRequest> marshall(EnableMFADeviceRequest enableMFADeviceRequest) {

        if (enableMFADeviceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableMFADeviceRequest> request = new DefaultRequest<EnableMFADeviceRequest>(enableMFADeviceRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "EnableMFADevice");
        request.addParameter("Version", "2010-05-08");

        if (enableMFADeviceRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(enableMFADeviceRequest.getUserName()));
        }
        if (enableMFADeviceRequest.getSerialNumber() != null) {
            request.addParameter("SerialNumber", StringUtils.fromString(enableMFADeviceRequest.getSerialNumber()));
        }
        if (enableMFADeviceRequest.getAuthenticationCode1() != null) {
            request.addParameter("AuthenticationCode1", StringUtils.fromString(enableMFADeviceRequest.getAuthenticationCode1()));
        }
        if (enableMFADeviceRequest.getAuthenticationCode2() != null) {
            request.addParameter("AuthenticationCode2", StringUtils.fromString(enableMFADeviceRequest.getAuthenticationCode2()));
        }

        return request;
    }
}
