
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Currency
 * <p>
 * Represents a currency with an identifier.
 */
public class Currency {

    @JsonProperty("id")
    private Long mId;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

}
