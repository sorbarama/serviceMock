package org.example.app.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "org.example.app.ws.ServiceMock")
public class ServiceMockImpl implements ServiceMock {

    private static Logger logger = LoggerFactory.getLogger(ServiceMockImpl.class);

    @Override
    public String activateRadio() {
        System.out.println("###################################");
        System.out.println("incoming call for activateRadio");
        System.out.println("###################################");

        int active = (int) (Math.random() * 100);
        logger.info(" ################################ ");
        logger.info(" #### active: " + active);
        logger.info(" ################################ ");

        String varActive = "Active";
        if(active > 50){
            varActive = "NonActive";
        }
        return "{\"response\": \"ok\", \"active\": \"" + varActive + "\"}";
    }

    @Override
    public String getDataConfiguration() {
        System.out.println("###################################");
        System.out.println("incoming call for getDataConfiguration");
        System.out.println("###################################");

        int activateAlert = (int) (Math.random() * 100);
        logger.info(" ################################ ");
        logger.info(" #### activateAlert: " + activateAlert);
        logger.info(" ################################ ");

        return "{\"response\": \"ok\", \"activateAlert\": \"" + (activateAlert > 10) + "\"}";
    }

    @Override
    public String startPolling() {
        System.out.println("###################################");
        System.out.println("incoming call for startPolling");
        System.out.println("###################################");

        int pollingStarted = (int) (Math.random() * 100);
        logger.info(" ################################ ");
        logger.info(" #### pollingStarted: " + pollingStarted);
        logger.info(" ################################ ");

        return "{\"response\": \"ok\", \"pollingStarted\": \"" + (pollingStarted > 20) + "\"}";
    }

    @Override
    public String activateCAP() {
        System.out.println("###################################");
        System.out.println("incoming call for activateCAP");
        System.out.println("###################################");

        logger.info(" ################################ ");
        logger.info(" #### activateCAP: true");
        logger.info(" ################################ ");

        return "{\"response\": \"ok\", \"activateCAP\": \"true\"}";
    }

    @Override
    public String activateAlertCheckingAndCAP() {
        System.out.println("###################################");
        System.out.println("incoming call for activateAlertCheckingAndCAP");
        System.out.println("###################################");

        logger.info(" ################################ ");
        logger.info(" #### activateAlertCheckingAndCAP: true");
        logger.info(" ################################ ");

        return "{\"response\": \"ok\", \"activateAlertCheckingAndCAP\": \"true\"}";
    }

}