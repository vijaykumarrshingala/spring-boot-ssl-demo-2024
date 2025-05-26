
package com.springboot.sample.dto.list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
/**
 * PricesResponse
 * <p>
 * Represents a response containing a list of prices and metadata.
 */

public class PricesResponse {

    @JsonProperty("data")
    private List<Datum> mData;
    @JsonProperty("meta")
    private Meta mMeta;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

}
