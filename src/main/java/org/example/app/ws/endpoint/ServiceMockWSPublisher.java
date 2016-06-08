package org.example.app.ws.endpoint;

import org.example.app.ws.ServiceMockImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.xml.ws.Endpoint;

public class ServiceMockWSPublisher {

    @Autowired
    private static Environment environment;

    public static void main(String[] args) {

        String url = environment.getProperty("ServiceMockWS.url", "http://localhost:8080/serviceMock/ws/ServiceMock");
        Endpoint.publish(url, new ServiceMockImpl());
    }

}