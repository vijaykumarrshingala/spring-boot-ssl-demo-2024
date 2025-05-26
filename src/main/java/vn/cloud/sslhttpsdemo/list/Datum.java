
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Datum
 * <p>
 * Represents a single data entry containing various financial metrics and identifiers.
 */
public class Datum {

    @JsonProperty("accumulated")
    private Accumulated mAccumulated;
    @JsonProperty("currency")
    private Currency mCurrency;
    @JsonProperty("first")
    private First mFirst;
    @JsonProperty("high")
    private High mHigh;
    @JsonProperty("idNotation")
    private String mIdNotation;
    @JsonProperty("latest")
    private Latest mLatest;
    @JsonProperty("low")
    private Low mLow;
    @JsonProperty("market")
    private Market mMarket;
    @JsonProperty("previousClose")
    private PreviousClose mPreviousClose;
    @JsonProperty("quality")
    private String mQuality;
    @JsonProperty("sourceIdentifier")
    private String mSourceIdentifier;
    @JsonProperty("status")
    private Status mStatus;
    @JsonProperty("valueUnit")
    private ValueUnit mValueUnit;

    public Accumulated getAccumulated() {
        return mAccumulated;
    }

    public void setAccumulated(Accumulated accumulated) {
        mAccumulated = accumulated;
    }

    public Currency getCurrency() {
        return mCurrency;
    }

    public void setCurrency(Currency currency) {
        mCurrency = currency;
    }

    public First getFirst() {
        return mFirst;
    }

    public void setFirst(First first) {
        mFirst = first;
    }

    public High getHigh() {
        return mHigh;
    }

    public void setHigh(High high) {
        mHigh = high;
    }

    public String getIdNotation() {
        return mIdNotation;
    }

    public void setIdNotation(String idNotation) {
        mIdNotation = idNotation;
    }

    public Latest getLatest() {
        return mLatest;
    }

    public void setLatest(Latest latest) {
        mLatest = latest;
    }

    public Low getLow() {
        return mLow;
    }

    public void setLow(Low low) {
        mLow = low;
    }

    public Market getMarket() {
        return mMarket;
    }

    public void setMarket(Market market) {
        mMarket = market;
    }

    public PreviousClose getPreviousClose() {
        return mPreviousClose;
    }

    public void setPreviousClose(PreviousClose previousClose) {
        mPreviousClose = previousClose;
    }

    public String getQuality() {
        return mQuality;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public String getSourceIdentifier() {
        return mSourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        mSourceIdentifier = sourceIdentifier;
    }

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
    }

    public ValueUnit getValueUnit() {
        return mValueUnit;
    }

    public void setValueUnit(ValueUnit valueUnit) {
        mValueUnit = valueUnit;
    }

}
