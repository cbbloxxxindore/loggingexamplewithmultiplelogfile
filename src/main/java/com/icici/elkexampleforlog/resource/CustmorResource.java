package com.icici.elkexampleforlog.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustmorResource {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustmorResource.class);
    @GetMapping("/getcustmor")
    public ResponseEntity<String> getCustomer()
    {
        LOGGER.info("custmor is find by its id ");
        LOGGER.info("if cutmor is exist return custmor");

        LOGGER.info("custmor is created");

        return ResponseEntity.ok("custmor is created");
    }
}
