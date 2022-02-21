package com.lbg.atmdataprovider.client.exception;

/**
 * An exception that gets triggered for any failure to connect with the backend application
 * from {@code OpenBankingRestClient}.
 */
public class OpenBankingClientException extends Exception {

    public OpenBankingClientException(String message) {
        super(message);
    }

    public OpenBankingClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
