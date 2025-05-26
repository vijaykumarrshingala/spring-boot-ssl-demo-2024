
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Accumulated {

    @JsonProperty("numberTrades")
    private Long mNumberTrades;
    @JsonProperty("tradingValue")
    private Double mTradingValue;
    @JsonProperty("tradingVolume")
    private Long mTradingVolume;
    @JsonProperty("volumeWeightedAveragePrice")
    private Double mVolumeWeightedAveragePrice;

    public Long getNumberTrades() {
        return mNumberTrades;
    }

    public void setNumberTrades(Long numberTrades) {
        mNumberTrades = numberTrades;
    }

    public Double getTradingValue() {
        return mTradingValue;
    }

    public void setTradingValue(Double tradingValue) {
        mTradingValue = tradingValue;
    }

    public Long getTradingVolume() {
        return mTradingVolume;
    }

    public void setTradingVolume(Long tradingVolume) {
        mTradingVolume = tradingVolume;
    }

    public Double getVolumeWeightedAveragePrice() {
        return mVolumeWeightedAveragePrice;
    }

    public void setVolumeWeightedAveragePrice(Double volumeWeightedAveragePrice) {
        mVolumeWeightedAveragePrice = volumeWeightedAveragePrice;
    }

}
