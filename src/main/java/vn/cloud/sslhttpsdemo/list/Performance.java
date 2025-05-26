
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Performance
 * <p>
 * Represents the performance of a financial instrument, including intraday price movements.
 */
public class Performance {

    @JsonProperty("intraday")
    private Intraday mIntraday;

    public Intraday getIntraday() {
        return mIntraday;
    }

    public void setIntraday(Intraday intraday) {
        mIntraday = intraday;
    }

}
