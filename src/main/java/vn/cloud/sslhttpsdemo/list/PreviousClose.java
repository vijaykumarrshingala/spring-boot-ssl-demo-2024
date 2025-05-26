
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviousClose
 * <p>
 * Represents the previous close price of a financial instrument.
 */
public class PreviousClose {

    @JsonProperty("price")
    private Double mPrice;
    @JsonProperty("time")
    private String mTime;

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double price) {
        mPrice = price;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

}
