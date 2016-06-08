package it.lutech.c2sense.pee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface ServiceMock {

    @WebMethod
    String activateRadio();

    @WebMethod
    String getDataConfiguration();

    @WebMethod
    String startPolling();

    @WebMethod
    String activateCAP();

    @WebMethod
    String activateAlertCheckingAndCAP();

}