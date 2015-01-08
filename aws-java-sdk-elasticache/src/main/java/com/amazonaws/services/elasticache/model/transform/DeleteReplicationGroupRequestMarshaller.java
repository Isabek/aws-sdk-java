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
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Delete Replication Group Request Marshaller
 */
public class DeleteReplicationGroupRequestMarshaller implements Marshaller<Request<DeleteReplicationGroupRequest>, DeleteReplicationGroupRequest> {

    public Request<DeleteReplicationGroupRequest> marshall(DeleteReplicationGroupRequest deleteReplicationGroupRequest) {

        if (deleteReplicationGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteReplicationGroupRequest> request = new DefaultRequest<DeleteReplicationGroupRequest>(deleteReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DeleteReplicationGroup");
        request.addParameter("Version", "2014-09-30");

        if (deleteReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(deleteReplicationGroupRequest.getReplicationGroupId()));
        }
        if (deleteReplicationGroupRequest.isRetainPrimaryCluster() != null) {
            request.addParameter("RetainPrimaryCluster", StringUtils.fromBoolean(deleteReplicationGroupRequest.isRetainPrimaryCluster()));
        }
        if (deleteReplicationGroupRequest.getFinalSnapshotIdentifier() != null) {
            request.addParameter("FinalSnapshotIdentifier", StringUtils.fromString(deleteReplicationGroupRequest.getFinalSnapshotIdentifier()));
        }

        return request;
    }
}
