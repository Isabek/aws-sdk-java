/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS handshake.
     * Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API Gateway validates
     * that certificates for integration endpoints are issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     * certificate. This is not recommended, but it enables you to use certificates that are signed by private
     * Certificate Authorities, or certificates that are self-signed.
     * </p>
     */
    private Boolean insecureSkipVerification;

    /**
     * <p>
     * Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS handshake.
     * Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API Gateway validates
     * that certificates for integration endpoints are issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     * certificate. This is not recommended, but it enables you to use certificates that are signed by private
     * Certificate Authorities, or certificates that are self-signed.
     * </p>
     * 
     * @param insecureSkipVerification
     *        Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS
     *        handshake. Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API
     *        Gateway validates that certificates for integration endpoints are issued by a <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *        >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     *        certificate. This is not recommended, but it enables you to use certificates that are signed by private
     *        Certificate Authorities, or certificates that are self-signed.
     */

    public void setInsecureSkipVerification(Boolean insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
    }

    /**
     * <p>
     * Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS handshake.
     * Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API Gateway validates
     * that certificates for integration endpoints are issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     * certificate. This is not recommended, but it enables you to use certificates that are signed by private
     * Certificate Authorities, or certificates that are self-signed.
     * </p>
     * 
     * @return Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS
     *         handshake. Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API
     *         Gateway validates that certificates for integration endpoints are issued by a <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *         >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     *         certificate. This is not recommended, but it enables you to use certificates that are signed by private
     *         Certificate Authorities, or certificates that are self-signed.
     */

    public Boolean getInsecureSkipVerification() {
        return this.insecureSkipVerification;
    }

    /**
     * <p>
     * Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS handshake.
     * Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API Gateway validates
     * that certificates for integration endpoints are issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     * certificate. This is not recommended, but it enables you to use certificates that are signed by private
     * Certificate Authorities, or certificates that are self-signed.
     * </p>
     * 
     * @param insecureSkipVerification
     *        Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS
     *        handshake. Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API
     *        Gateway validates that certificates for integration endpoints are issued by a <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *        >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     *        certificate. This is not recommended, but it enables you to use certificates that are signed by private
     *        Certificate Authorities, or certificates that are self-signed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsConfig withInsecureSkipVerification(Boolean insecureSkipVerification) {
        setInsecureSkipVerification(insecureSkipVerification);
        return this;
    }

    /**
     * <p>
     * Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS handshake.
     * Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API Gateway validates
     * that certificates for integration endpoints are issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     * certificate. This is not recommended, but it enables you to use certificates that are signed by private
     * Certificate Authorities, or certificates that are self-signed.
     * </p>
     * 
     * @return Specifies whether API Gateway skips trust chain validation of the server certificate during the TLS
     *         handshake. Supported only for <code>HTTP</code> and <code>HTTP_PROXY</code> integrations. By default, API
     *         Gateway validates that certificates for integration endpoints are issued by a <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *         >supported Certificate Authority</a>. If enabled, API Gateway skips trust chain validation of the server
     *         certificate. This is not recommended, but it enables you to use certificates that are signed by private
     *         Certificate Authorities, or certificates that are self-signed.
     */

    public Boolean isInsecureSkipVerification() {
        return this.insecureSkipVerification;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInsecureSkipVerification() != null)
            sb.append("InsecureSkipVerification: ").append(getInsecureSkipVerification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsConfig == false)
            return false;
        TlsConfig other = (TlsConfig) obj;
        if (other.getInsecureSkipVerification() == null ^ this.getInsecureSkipVerification() == null)
            return false;
        if (other.getInsecureSkipVerification() != null && other.getInsecureSkipVerification().equals(this.getInsecureSkipVerification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsecureSkipVerification() == null) ? 0 : getInsecureSkipVerification().hashCode());
        return hashCode;
    }

    @Override
    public TlsConfig clone() {
        try {
            return (TlsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.TlsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
