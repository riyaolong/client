/**
 * MyInvokerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.xlzhou.client.service.nx;

public interface MyInvokerService extends javax.xml.rpc.Service {
    public String getMyInvokerPortAddress();

    public MyInvoker getMyInvokerPort() throws javax.xml.rpc.ServiceException;

    public MyInvoker getMyInvokerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
