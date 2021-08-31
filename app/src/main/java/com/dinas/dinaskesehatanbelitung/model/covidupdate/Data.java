package com.dinas.dinaskesehatanbelitung.model.covidupdate;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("jumlah_odp")
    @Expose
    private Integer jumlahOdp;
    @SerializedName("jumlah_pdp")
    @Expose
    private Integer jumlahPdp;
    @SerializedName("total_spesimen")
    @Expose
    private Integer totalSpesimen;
    @SerializedName("total_spesimen_negatif")
    @Expose
    private Integer totalSpesimenNegatif;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJumlahOdp() {
        return jumlahOdp;
    }

    public void setJumlahOdp(Integer jumlahOdp) {
        this.jumlahOdp = jumlahOdp;
    }

    public Integer getJumlahPdp() {
        return jumlahPdp;
    }

    public void setJumlahPdp(Integer jumlahPdp) {
        this.jumlahPdp = jumlahPdp;
    }

    public Integer getTotalSpesimen() {
        return totalSpesimen;
    }

    public void setTotalSpesimen(Integer totalSpesimen) {
        this.totalSpesimen = totalSpesimen;
    }

    public Integer getTotalSpesimenNegatif() {
        return totalSpesimenNegatif;
    }

    public void setTotalSpesimenNegatif(Integer totalSpesimenNegatif) {
        this.totalSpesimenNegatif = totalSpesimenNegatif;
    }
}
