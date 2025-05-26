
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * First
 * <p>
 * Represents the first price entry in a financial dataset, including price, time, and trading volume.
 */
public class First {

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
