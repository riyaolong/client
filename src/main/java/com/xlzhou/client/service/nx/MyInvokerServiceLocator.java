/**
 * MyInvokerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.xlzhou.client.service.nx;

public class MyInvokerServiceLocator extends org.apache.axis.client.Service implements MyInvokerService {

    public MyInvokerServiceLocator() {
    }


    public MyInvokerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyInvokerServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyInvokerPort
    private String MyInvokerPort_address = "http://localhost:8910/sendcard_war/services/Invoker";

    public String getMyInvokerPortAddress() {
        return MyInvokerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String MyInvokerPortWSDDServiceName = "MyInvokerPort";

    public String getMyInvokerPortWSDDServiceName() {
        return MyInvokerPortWSDDServiceName;
    }

    public void setMyInvokerPortWSDDServiceName(String name) {
        MyInvokerPortWSDDServiceName = name;
    }

    public MyInvoker getMyInvokerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyInvokerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyInvokerPort(endpoint);
    }

    public MyInvoker getMyInvokerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MyInvokerServiceSoapBindingStub _stub = new MyInvokerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyInvokerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyInvokerPortEndpointAddress(String address) {
        MyInvokerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MyInvoker.class.isAssignableFrom(serviceEndpointInterface)) {
                MyInvokerServiceSoapBindingStub _stub = new MyInvokerServiceSoapBindingStub(new java.net.URL(MyInvokerPort_address), this);
                _stub.setPortName(getMyInvokerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("MyInvokerPort".equals(inputPortName)) {
            return getMyInvokerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.boyasafe.com/", "MyInvokerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.boyasafe.com/", "MyInvokerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MyInvokerPort".equals(portName)) {
            setMyInvokerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
