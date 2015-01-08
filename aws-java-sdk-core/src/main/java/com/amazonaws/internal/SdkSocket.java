/*
 * Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SdkSocket extends Socket {
    private static final Log log = LogFactory.getLog(SdkSocket.class);

    private final Socket sock;

    public SdkSocket(Socket sock) {
        this.sock = sock;
        if (log.isDebugEnabled())
            log.debug("created: " + endpoint());
    }

    /**
     * Returns the endpoint in the format of "address:port"
     */
    private String endpoint() {
        return sock.getInetAddress() + ":" + sock.getPort();
    }

    @Override
    public void connect(SocketAddress endpoint) throws IOException {
        if (log.isDebugEnabled())
            log.debug("connecting to: " + endpoint);
        sock.connect(endpoint);
        if (log.isDebugEnabled())
            log.debug("connected to: " + endpoint());
    }

    @Override
    public void connect(SocketAddress endpoint, int timeout) throws IOException {
        if (log.isDebugEnabled())
            log.debug("connecting to: " + endpoint);
        sock.connect(endpoint, timeout);
        if (log.isDebugEnabled())
            log.debug("connected to: " + endpoint());
    }

    @Override
    public void bind(SocketAddress bindpoint) throws IOException {
        sock.bind(bindpoint);
    }

    @Override
    public InetAddress getInetAddress() {
        return sock.getInetAddress();
    }

    @Override
    public InetAddress getLocalAddress() {
        return sock.getLocalAddress();
    }

    @Override
    public int getPort() {
        return sock.getPort();
    }

    @Override
    public int getLocalPort() {
        return sock.getLocalPort();
    }

    @Override
    public SocketAddress getRemoteSocketAddress() {
        return sock.getRemoteSocketAddress();
    }

    @Override
    public SocketAddress getLocalSocketAddress() {
        return sock.getLocalSocketAddress();
    }

    @Override
    public SocketChannel getChannel() {
        return sock.getChannel();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return sock.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return sock.getOutputStream();
    }

    @Override
    public void setTcpNoDelay(boolean on) throws SocketException {
        sock.setTcpNoDelay(on);
    }

    @Override
    public boolean getTcpNoDelay() throws SocketException {
        return sock.getTcpNoDelay();
    }

    @Override
    public void setSoLinger(boolean on, int linger) throws SocketException {
        sock.setSoLinger(on, linger);
    }

    @Override
    public int getSoLinger() throws SocketException {
        return sock.getSoLinger();
    }

    @Override
    public void sendUrgentData(int data) throws IOException {
        sock.sendUrgentData(data);
    }

    @Override
    public void setOOBInline(boolean on) throws SocketException {
        sock.setOOBInline(on);
    }

    @Override
    public boolean getOOBInline() throws SocketException {
        return sock.getOOBInline();
    }

    @Override
    public void setSoTimeout(int timeout) throws SocketException {
        sock.setSoTimeout(timeout);
    }

    @Override
    public int getSoTimeout() throws SocketException {
        return sock.getSoTimeout();
    }

    @Override
    public void setSendBufferSize(int size) throws SocketException {
        sock.setSendBufferSize(size);
    }

    @Override
    public int getSendBufferSize() throws SocketException {
        return sock.getSendBufferSize();
    }

    @Override
    public void setReceiveBufferSize(int size) throws SocketException {
        sock.setReceiveBufferSize(size);
    }

    @Override
    public int getReceiveBufferSize() throws SocketException {
        return sock.getReceiveBufferSize();
    }

    @Override
    public void setKeepAlive(boolean on) throws SocketException {
        sock.setKeepAlive(on);
    }

    @Override
    public boolean getKeepAlive() throws SocketException {
        return sock.getKeepAlive();
    }

    @Override
    public void setTrafficClass(int tc) throws SocketException {
        sock.setTrafficClass(tc);
    }

    @Override
    public int getTrafficClass() throws SocketException {
        return sock.getTrafficClass();
    }

    @Override
    public void setReuseAddress(boolean on) throws SocketException {
        sock.setReuseAddress(on);
    }

    @Override
    public boolean getReuseAddress() throws SocketException {
        return sock.getReuseAddress();
    }

    @Override
    public void close() throws IOException {
        if (log.isDebugEnabled())
            log.debug("closing " + endpoint());
        sock.close();
    }

    @Override
    public void shutdownInput() throws IOException {
        if (log.isDebugEnabled())
            log.debug("shutting down input of " + endpoint());
        sock.shutdownInput();
    }

    @Override
    public void shutdownOutput() throws IOException {
        if (log.isDebugEnabled())
            log.debug("shutting down output of " + endpoint());
        sock.shutdownOutput();
    }

    @Override
    public String toString() {
        return sock.toString();
    }

    @Override
    public boolean isConnected() {
        return sock.isConnected();
    }

    @Override
    public boolean isBound() {
        return sock.isBound();
    }

    @Override
    public boolean isClosed() {
        return sock.isClosed();
    }

    @Override
    public boolean isInputShutdown() {
        return sock.isInputShutdown();
    }

    @Override
    public boolean isOutputShutdown() {
        return sock.isOutputShutdown();
    }

    @Override
    public void setPerformancePreferences(int connectionTime, int latency,
            int bandwidth) {
        sock.setPerformancePreferences(connectionTime, latency, bandwidth);
    }
}
