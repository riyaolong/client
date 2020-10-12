/**
 * MyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.xlzhou.client.service;

public interface MyService extends javax.xml.rpc.Service {
    public String getMyServicePortAddress();

    public IService getMyServicePort() throws javax.xml.rpc.ServiceException;

    public IService getMyServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
