package com.lbg.atmdataprovider.controller;

import com.lbg.atmdataprovider.client.exception.OpenBankingClientException;
import com.lbg.atmdataprovider.model.ATMResponse;
import com.lbg.atmdataprovider.model.ATMsResponse;
import com.lbg.atmdataprovider.service.ATMDataProviderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.Instant;

/**
 * Entry point of API. All URL's should be configured here.
 */
@RestController
@RequestMapping("/api")
@Log4j2
public class AtmController {

    private final String OPEN_BANKING_ATM_DEFAULT_URL = "https://api.lloydsbank.com/open-banking/v2.2/atms";
    @Autowired
    private ATMDataProviderService atmDataProviderService;

    /**
     * 1.	Create a java spring-boot microservice using gradle exposing one GET method requiring two values:
     * "url": "https://api.lloydsbank.com/open-banking/v2.2/atms",
     * "identification":"30847300"
     * <p>
     * This should return the identification value as well as full details of ATMs from the opendata-v2.2#get-atms-2.2 api.
     * As per the requirement API has to take 2 input in GET. Hence using query params.
     * As per requirement API has to return full details of ATM's (multiple ATM). Hence returning all available ATMs without filtering.
     *
     * @param url
     * @param identification
     * @return
     * @throws OpenBankingClientException
     */
    @GetMapping("/atms")
    public ATMsResponse getAtmsDetails(@RequestParam String url, @RequestParam String identification) throws OpenBankingClientException {
        Instant startTime = Instant.now();
        log.info("Received request to fetch all ATM data");
        final ATMsResponse atmDetails = atmDataProviderService.getAllATMDetails(url, identification);
        log.debug("Responded with data ::  " + atmDetails);
        log.info("Responded within " + Duration.between(startTime, Instant.now()).toMillis() + " MS");
        return atmDetails;
    }

    /**
     * This API will take url as query parameter (requirement) and use the default url if not supplied.
     * This API will filter ATM data based on the identification provided in the request.
     *
     * @param url
     * @param identification
     * @return
     * @throws OpenBankingClientException
     */
    @GetMapping("/atms/{identification}")
    public ATMResponse getAtmDetails(@RequestParam(defaultValue = OPEN_BANKING_ATM_DEFAULT_URL) String url, @PathVariable String identification) throws OpenBankingClientException {
        Instant startTime = Instant.now();
        log.info("Received request to fetch one ATM data for identification = " + identification);
        final ATMResponse atmDetails = atmDataProviderService.getOneAtmDetails(url, identification);
        log.debug("Responded with data ::  " + atmDetails);
        log.info("Responded within " + Duration.between(startTime, Instant.now()).toMillis() + " MS");
        return atmDetails;
    }

}
