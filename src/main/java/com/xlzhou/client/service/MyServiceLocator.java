/**
 * MyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.xlzhou.client.service;

public class MyServiceLocator extends org.apache.axis.client.Service implements MyService {

    public MyServiceLocator() {
    }


    public MyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyServicePort
    private String MyServicePort_address = "http://localhost:8999/bywz/iserver";

    public String getMyServicePortAddress() {
        return MyServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String MyServicePortWSDDServiceName = "MyServicePort";

    public String getMyServicePortWSDDServiceName() {
        return MyServicePortWSDDServiceName;
    }

    public void setMyServicePortWSDDServiceName(String name) {
        MyServicePortWSDDServiceName = name;
    }

    public IService getMyServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyServicePort(endpoint);
    }

    public IService getMyServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MyServiceSoapBindingStub _stub = new MyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyServicePortEndpointAddress(String address) {
        MyServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IService.class.isAssignableFrom(serviceEndpointInterface)) {
                MyServiceSoapBindingStub _stub = new MyServiceSoapBindingStub(new java.net.URL(MyServicePort_address), this);
                _stub.setPortName(getMyServicePortWSDDServiceName());
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
        if ("MyServicePort".equals(inputPortName)) {
            return getMyServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.server.xlzhou.com/", "MyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.server.xlzhou.com/", "MyServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MyServicePort".equals(portName)) {
            setMyServicePortEndpointAddress(address);
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
