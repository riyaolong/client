/**
 * MyInvoker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.xlzhou.client.service.nx;

public interface MyInvoker extends java.rmi.Remote {
    public String cancle(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    public String creditDiscard(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    public String writeBack(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    public String getCreditCardData(String arg0) throws java.rmi.RemoteException;
    public String getData(String arg0) throws java.rmi.RemoteException;
    public String writeBackCredit(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    public String login(String arg0, String arg1) throws java.rmi.RemoteException;
    public String cancle2(String arg0) throws java.rmi.RemoteException;
    public String check(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    public String cancleCreditCardData(String arg0) throws java.rmi.RemoteException;
}
