package org.example.bootlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.logging.Logger;


@RestController
public class PurchaseController {

//    private final Logger logger = Logger.getLogger(PurchaseController.class.getName());
    private final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    @PostMapping
    public void purchase() {
        System.out.println("purchase");
        logger.info("purchase");
        // verbose - debug - info - warn - error - critical
        // finest - fine - info - warning - severe
        try {
            throw new RuntimeException("purchase error");
        } catch (Exception e) {
            System.err.println(e.getMessage());
//            logger.severe(e.getMessage());
            logger.error(e.getMessage());
        }

    }
}
