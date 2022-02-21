package com.lbg.atmdataprovider.builder;

import com.lbg.atmdataprovider.client.model.response.ATMItem;
import com.lbg.atmdataprovider.client.model.response.ClientResponse;
import com.lbg.atmdataprovider.model.ATMResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
@Log4j2
public class ATMResponseBuilder {

    public ATMResponse build(ClientResponse clientResponse, String identifier) {
        ATMResponse atmResponse = new ATMResponse();
        ATMItem atmData =
                clientResponse.getData().parallelStream().flatMap(
                        data -> data.getBrand().parallelStream().flatMap(
                                brand -> brand.getATM().parallelStream()
                        )
                ).filter(atm -> atm.getIdentification().equals(identifier)).findFirst().orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, " Identifier " + identifier + " Not found in the backend. Please check the data provided.")
                );
        atmResponse.setAtm(atmData);
        atmResponse.setIdentification(identifier);
        return atmResponse;
    }
}
