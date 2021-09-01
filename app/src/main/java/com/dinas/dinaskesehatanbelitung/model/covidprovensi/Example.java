package com.dinas.dinaskesehatanbelitung.model.covidprovensi;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Example {

    @SerializedName("last_date")
    @Expose
    private String lastDate;
    @SerializedName("current_data")
    @Expose
    private Double currentData;
    @SerializedName("missing_data")
    @Expose
    private Double missingData;
    @SerializedName("tanpa_provinsi")
    @Expose
    private Integer tanpaProvinsi;
    @SerializedName("list_data")
    @Expose
    private List<ListDatum> listData = null;

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public Double getCurrentData() {
        return currentData;
    }

    public void setCurrentData(Double currentData) {
        this.currentData = currentData;
    }

    public Double getMissingData() {
        return missingData;
    }

    public void setMissingData(Double missingData) {
        this.missingData = missingData;
    }

    public Integer getTanpaProvinsi() {
        return tanpaProvinsi;
    }

    public void setTanpaProvinsi(Integer tanpaProvinsi) {
        this.tanpaProvinsi = tanpaProvinsi;
    }

    public List<ListDatum> getListData() {
        return listData;
    }

    public void setListData(List<ListDatum> listData) {
        this.listData = listData;
    }

}
