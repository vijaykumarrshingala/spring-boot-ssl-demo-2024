
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Market
 * <p>
 * Represents a market with an identifier.
 */
public class Market {

    @JsonProperty("id")
    private Long mId;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

}
