
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta
 * <p>
 * Represents metadata about the status of a request.
 */
public class Meta {

    @JsonProperty("status")
    private Status mStatus;

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
    }

}
