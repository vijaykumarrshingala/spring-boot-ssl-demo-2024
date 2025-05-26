
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValueUnit
 * <p>
 * Represents a unit of value with an identifier.
 */
public class ValueUnit {

    @JsonProperty("id")
    private Long mId;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

}
