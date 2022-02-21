package com.lbg.atmdataprovider.builder;

import com.lbg.atmdataprovider.client.model.response.ATMItem;
import com.lbg.atmdataprovider.client.model.response.ClientResponse;
import com.lbg.atmdataprovider.model.ATMsResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ATMsResponseBuilder {

    public ATMsResponse build(ClientResponse clientResponse, String identifier) {
        ATMsResponse atmsResponse = new ATMsResponse();
        List<ATMItem> atms =
                clientResponse.getData().stream().flatMap(
                        data -> data.getBrand().stream().flatMap(
                                brand -> brand.getATM().stream()
                        )
                ).collect(Collectors.toList());
        atmsResponse.setAtms(atms);
        atmsResponse.setIdentification(identifier);
        return atmsResponse;
    }
}
