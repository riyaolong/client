package com.xlzhou.client.test;

import com.xlzhou.client.service.MyService;
import com.xlzhou.client.service.MyServiceLocator;
import com.xlzhou.client.service.MyServiceSoapBindingStub;
import com.xlzhou.client.service.nx.MyInvokerService;
import com.xlzhou.client.service.nx.MyInvokerServiceLocator;
import com.xlzhou.client.service.nx.MyInvokerServiceSoapBindingStub;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * @Auther: zxl
 * @Date: 2020/9/7 - 09 - 07 - 15:55
 */
public class Demo {
    public static void main(String[] args) {
        MyService myService = new MyServiceLocator();
        try {
            MyServiceSoapBindingStub myServicePort = (MyServiceSoapBindingStub) myService.getMyServicePort();
            String admin = myServicePort.getStr("admin");
            System.out.println(admin);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

       

    }

    
    
}
