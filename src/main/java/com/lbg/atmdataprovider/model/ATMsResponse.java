package com.lbg.atmdataprovider.model;

import com.lbg.atmdataprovider.client.model.response.ATMItem;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ATMsResponse {
    private String identification;
    private List<ATMItem> atms;
}
