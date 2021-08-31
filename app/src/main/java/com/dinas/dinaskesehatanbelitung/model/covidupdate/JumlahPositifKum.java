package com.dinas.dinaskesehatanbelitung.model.covidupdate;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class JumlahPositifKum {

    @SerializedName("value")
    @Expose
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
