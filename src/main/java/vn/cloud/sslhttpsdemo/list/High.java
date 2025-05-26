
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * High
 * <p>
 * Represents the highest price entry in a financial dataset, including price, time, and trading volume.
 */
public class High {

    @JsonProperty("price")
    private Double mPrice;
    @JsonProperty("time")
    private String mTime;
    @JsonProperty("tradingVolume")
    private Object mTradingVolume;

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

    public Object getTradingVolume() {
        return mTradingVolume;
    }

    public void setTradingVolume(Object tradingVolume) {
        mTradingVolume = tradingVolume;
    }

}
