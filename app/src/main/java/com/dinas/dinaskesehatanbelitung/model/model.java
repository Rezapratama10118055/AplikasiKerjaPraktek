package com.dinas.dinaskesehatanbelitung.model;

public class model {

    private int image;
    private String judul;
    private String penjelasan;
    private  String tanggal;
    private  String akun;
    private String penjelasanLengkap;
    private String katagori;

    public model(int image, String judul, String penjelasan,String penjelasanLengkap, String tanggal, String akun , String katagori) {
        this.image = image;
        this.judul = judul;
        this.penjelasanLengkap = penjelasanLengkap;
        this.penjelasan = penjelasan;
        this.tanggal = tanggal;
        this.akun = akun;
        this.katagori = katagori;

    }



    public int getImage() {
        return image;
    }


    public void setImage(int image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    public String getPenjelasanLengkap() {
        return penjelasanLengkap;
    }

    public void setPenjelasanLengkap(String penjelasanLengkap) {
        this.penjelasanLengkap = penjelasanLengkap;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getAkun() {
        return akun;
    }

    public void setAkun(String akun) {
        this.akun = akun;
    }

    public String getKatagori() {
        return katagori;
    }

    public void setKatagori(String katagori) {
        this.katagori = katagori;
    }


}
