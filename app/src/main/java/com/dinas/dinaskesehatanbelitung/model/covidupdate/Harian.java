package com.dinas.dinaskesehatanbelitung.model.covidupdate;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Harian {

    @SerializedName("key_as_string")
    @Expose
    private String keyAsString;
    @SerializedName("key")
    @Expose
    private Long key;
    @SerializedName("doc_count")
    @Expose
    private Integer docCount;
    @SerializedName("jumlah_meninggal")
    @Expose
    private JumlahMeninggal jumlahMeninggal;
    @SerializedName("jumlah_sembuh")
    @Expose
    private JumlahSembuh jumlahSembuh;
    @SerializedName("jumlah_positif")
    @Expose
    private JumlahPositif jumlahPositif;
    @SerializedName("jumlah_dirawat")
    @Expose
    private JumlahDirawat jumlahDirawat;
    @SerializedName("jumlah_positif_kum")
    @Expose
    private JumlahPositifKum jumlahPositifKum;
    @SerializedName("jumlah_sembuh_kum")
    @Expose
    private JumlahSembuhKum jumlahSembuhKum;
    @SerializedName("jumlah_meninggal_kum")
    @Expose
    private JumlahMeninggalKum jumlahMeninggalKum;
    @SerializedName("jumlah_dirawat_kum")
    @Expose
    private JumlahDirawatKum jumlahDirawatKum;

    public String getKeyAsString() {
        return keyAsString;
    }

    public void setKeyAsString(String keyAsString) {
        this.keyAsString = keyAsString;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public JumlahMeninggal getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(JumlahMeninggal jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public JumlahSembuh getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(JumlahSembuh jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public JumlahPositif getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(JumlahPositif jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public JumlahDirawat getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(JumlahDirawat jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public JumlahPositifKum getJumlahPositifKum() {
        return jumlahPositifKum;
    }

    public void setJumlahPositifKum(JumlahPositifKum jumlahPositifKum) {
        this.jumlahPositifKum = jumlahPositifKum;
    }

    public JumlahSembuhKum getJumlahSembuhKum() {
        return jumlahSembuhKum;
    }

    public void setJumlahSembuhKum(JumlahSembuhKum jumlahSembuhKum) {
        this.jumlahSembuhKum = jumlahSembuhKum;
    }

    public JumlahMeninggalKum getJumlahMeninggalKum() {
        return jumlahMeninggalKum;
    }

    public void setJumlahMeninggalKum(JumlahMeninggalKum jumlahMeninggalKum) {
        this.jumlahMeninggalKum = jumlahMeninggalKum;
    }

    public JumlahDirawatKum getJumlahDirawatKum() {
        return jumlahDirawatKum;
    }

    public void setJumlahDirawatKum(JumlahDirawatKum jumlahDirawatKum) {
        this.jumlahDirawatKum = jumlahDirawatKum;
    }

}
