
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Latest
 * <p>
 * Represents the latest price information including performance, price, quote condition, time, trading value, and trading volume.
 */
public class Latest {

    @JsonProperty("performance")
    private Performance mPerformance;
    @JsonProperty("price")
    private Double mPrice;
    @JsonProperty("quoteCondition")
    private String mQuoteCondition;
    @JsonProperty("time")
    private String mTime;
    @JsonProperty("tradingValue")
    private Object mTradingValue;
    @JsonProperty("tradingVolume")
    private Object mTradingVolume;

    public Performance getPerformance() {
        return mPerformance;
    }

    public void setPerformance(Performance performance) {
        mPerformance = performance;
    }

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double price) {
        mPrice = price;
    }

    public String getQuoteCondition() {
        return mQuoteCondition;
    }

    public void setQuoteCondition(String quoteCondition) {
        mQuoteCondition = quoteCondition;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public Object getTradingValue() {
        return mTradingValue;
    }

    public void setTradingValue(Object tradingValue) {
        mTradingValue = tradingValue;
    }

    public Object getTradingVolume() {
        return mTradingVolume;
    }

    public void setTradingVolume(Object tradingVolume) {
        mTradingVolume = tradingVolume;
    }

}
