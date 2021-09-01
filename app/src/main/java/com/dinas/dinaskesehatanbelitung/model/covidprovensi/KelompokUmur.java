package com.dinas.dinaskesehatanbelitung.model.covidprovensi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KelompokUmur {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("doc_count")
    @Expose
    private Integer docCount;
    @SerializedName("usia")
    @Expose
    private Usia usia;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public Usia getUsia() {
        return usia;
    }

    public void setUsia(Usia usia) {
        this.usia = usia;
    }

}