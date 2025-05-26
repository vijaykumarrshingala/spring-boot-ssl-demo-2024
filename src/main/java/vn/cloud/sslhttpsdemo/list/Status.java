
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status
 * <p>
 * Represents the status of a request, including a code, details, encrypted details, and an identifier.
 */
public class Status {

    @JsonProperty("code")
    private String mCode;
    @JsonProperty("details")
    private Object mDetails;
    @JsonProperty("encryptedDetails")
    private Object mEncryptedDetails;
    @JsonProperty("identifier")
    private Object mIdentifier;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public Object getDetails() {
        return mDetails;
    }

    public void setDetails(Object details) {
        mDetails = details;
    }

    public Object getEncryptedDetails() {
        return mEncryptedDetails;
    }

    public void setEncryptedDetails(Object encryptedDetails) {
        mEncryptedDetails = encryptedDetails;
    }

    public Object getIdentifier() {
        return mIdentifier;
    }

    public void setIdentifier(Object identifier) {
        mIdentifier = identifier;
    }

}
