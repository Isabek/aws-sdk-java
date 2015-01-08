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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Usage information for the identity pool.
 * </p>
 */
public class IdentityPoolUsage implements Serializable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * Number of sync sessions for the identity pool.
     */
    private Long syncSessionsCount;

    /**
     * Data storage information for the identity pool.
     */
    private Long dataStorage;

    /**
     * Date on which the identity pool was last modified.
     */
    private java.util.Date lastModifiedDate;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Number of sync sessions for the identity pool.
     *
     * @return Number of sync sessions for the identity pool.
     */
    public Long getSyncSessionsCount() {
        return syncSessionsCount;
    }
    
    /**
     * Number of sync sessions for the identity pool.
     *
     * @param syncSessionsCount Number of sync sessions for the identity pool.
     */
    public void setSyncSessionsCount(Long syncSessionsCount) {
        this.syncSessionsCount = syncSessionsCount;
    }
    
    /**
     * Number of sync sessions for the identity pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSessionsCount Number of sync sessions for the identity pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withSyncSessionsCount(Long syncSessionsCount) {
        this.syncSessionsCount = syncSessionsCount;
        return this;
    }

    /**
     * Data storage information for the identity pool.
     *
     * @return Data storage information for the identity pool.
     */
    public Long getDataStorage() {
        return dataStorage;
    }
    
    /**
     * Data storage information for the identity pool.
     *
     * @param dataStorage Data storage information for the identity pool.
     */
    public void setDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    /**
     * Data storage information for the identity pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataStorage Data storage information for the identity pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
        return this;
    }

    /**
     * Date on which the identity pool was last modified.
     *
     * @return Date on which the identity pool was last modified.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * Date on which the identity pool was last modified.
     *
     * @param lastModifiedDate Date on which the identity pool was last modified.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * Date on which the identity pool was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate Date on which the identity pool was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getSyncSessionsCount() != null) sb.append("SyncSessionsCount: " + getSyncSessionsCount() + ",");
        if (getDataStorage() != null) sb.append("DataStorage: " + getDataStorage() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionsCount() == null) ? 0 : getSyncSessionsCount().hashCode()); 
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IdentityPoolUsage == false) return false;
        IdentityPoolUsage other = (IdentityPoolUsage)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getSyncSessionsCount() == null ^ this.getSyncSessionsCount() == null) return false;
        if (other.getSyncSessionsCount() != null && other.getSyncSessionsCount().equals(this.getSyncSessionsCount()) == false) return false; 
        if (other.getDataStorage() == null ^ this.getDataStorage() == null) return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    