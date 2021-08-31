package com.dinas.dinaskesehatanbelitung.model.covidupdate;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Penambahan {

    @SerializedName("jumlah_positif")
    @Expose
    private Integer jumlahPositif;
    @SerializedName("jumlah_meninggal")
    @Expose
    private Integer jumlahMeninggal;
    @SerializedName("jumlah_sembuh")
    @Expose
    private Integer jumlahSembuh;
    @SerializedName("jumlah_dirawat")
    @Expose
    private Integer jumlahDirawat;
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("created")
    @Expose
    private String created;

    public Integer getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(Integer jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public Integer getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(Integer jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public Integer getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(Integer jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public Integer getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(Integer jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
