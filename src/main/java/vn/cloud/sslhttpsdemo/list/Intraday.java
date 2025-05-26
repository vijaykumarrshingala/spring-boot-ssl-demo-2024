
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Intraday
 * <p>
 * Represents intraday price movements with absolute and relative changes.
 */
public class Intraday {

    @JsonProperty("absolute")
    private Double mAbsolute;
    @JsonProperty("relative")
    private Double mRelative;

    public Double getAbsolute() {
        return mAbsolute;
    }

    public void setAbsolute(Double absolute) {
        mAbsolute = absolute;
    }

    public Double getRelative() {
        return mRelative;
    }

    public void setRelative(Double relative) {
        mRelative = relative;
    }

}
