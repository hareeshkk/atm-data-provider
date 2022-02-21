package com.lbg.atmdataprovider.client;

import com.lbg.atmdataprovider.client.exception.OpenBankingClientException;
import com.lbg.atmdataprovider.client.model.response.ClientResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * A custom application client which utilises {@code RestTemplate } to connect with the backend application.
 * Configuration for {@code RestTemplate} is in {@code RestTemplate}.
 */
@Component
@Log4j2
public class OpenBankingRestClient {


    @Autowired
    private RestTemplate restTemplate;

    public ClientResponse getAllATMs(String openBankingAtmProviderUrl, String identifier) throws OpenBankingClientException {
        log.info("Calling " + openBankingAtmProviderUrl + " from OpenBankingRestClient.getAllATMs() with identifier " + identifier + " to fetch all ATM details");

        ResponseEntity<ClientResponse> atmDataEntity = restTemplate.getForEntity(openBankingAtmProviderUrl, ClientResponse.class);
        log.info("Received response from " + openBankingAtmProviderUrl + " with HTTP Code ::  " + atmDataEntity.getStatusCode());

        if (atmDataEntity.getStatusCode().equals(HttpStatus.OK)) {
            log.debug("Response data from " + openBankingAtmProviderUrl + " ::  " + atmDataEntity.getBody());
            return atmDataEntity.getBody();
        } else {
            log.error("Failed to get data from " + openBankingAtmProviderUrl + ". Status code received :: " + atmDataEntity.getStatusCode());
            throw new OpenBankingClientException("Failed to call open banking openBankingAtmProviderUrl.");
        }


    }


}
