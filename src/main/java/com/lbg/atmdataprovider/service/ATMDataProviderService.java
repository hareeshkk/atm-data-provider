package com.lbg.atmdataprovider.service;

import com.lbg.atmdataprovider.builder.ATMResponseBuilder;
import com.lbg.atmdataprovider.builder.ATMsResponseBuilder;
import com.lbg.atmdataprovider.client.OpenBankingRestClient;
import com.lbg.atmdataprovider.client.exception.OpenBankingClientException;
import com.lbg.atmdataprovider.model.ATMResponse;
import com.lbg.atmdataprovider.model.ATMsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A class to hold any business logic available in any.
 * This class is using OpenBankingRestClient to call the backend rest service
 * and using builders to build necessary response structure.
 */
@Service
public class ATMDataProviderService {

    @Autowired
    private OpenBankingRestClient openBankingRestClient;

    @Autowired
    private ATMResponseBuilder atmResponseBuilder;

    @Autowired
    private ATMsResponseBuilder atmsResponseBuilder;

    public ATMsResponse getAllATMDetails(String url, String identification) throws OpenBankingClientException {
        return atmsResponseBuilder.build(openBankingRestClient.getAllATMs(url, identification), identification);

    }

    public ATMResponse getOneAtmDetails(String url, String identification) throws OpenBankingClientException {
        return atmResponseBuilder.build(openBankingRestClient.getAllATMs(url, identification), identification);

    }


}
