package com.dinas.dinaskesehatanbelitung.model.covidupdate;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Total {

    @SerializedName("jumlah_positif")
    @Expose
    private Integer jumlahPositif;
    @SerializedName("jumlah_dirawat")
    @Expose
    private Integer jumlahDirawat;
    @SerializedName("jumlah_sembuh")
    @Expose
    private Integer jumlahSembuh;
    @SerializedName("jumlah_meninggal")
    @Expose
    private Integer jumlahMeninggal;

    public Integer getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(Integer jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public Integer getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(Integer jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public Integer getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(Integer jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public Integer getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(Integer jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

}