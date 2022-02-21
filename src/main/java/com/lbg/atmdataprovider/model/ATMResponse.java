package com.lbg.atmdataprovider.model;

import com.lbg.atmdataprovider.client.model.response.ATMItem;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ATMResponse {
    private String identification;
    private ATMItem atm;
}
