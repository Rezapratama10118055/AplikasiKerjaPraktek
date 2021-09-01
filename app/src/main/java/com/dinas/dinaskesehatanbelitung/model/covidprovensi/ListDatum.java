package com.dinas.dinaskesehatanbelitung.model.covidprovensi;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ListDatum {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("doc_count")
    @Expose
    private Double docCount;
    @SerializedName("jumlah_kasus")
    @Expose
    private Integer jumlahKasus;
    @SerializedName("jumlah_sembuh")
    @Expose
    private Integer jumlahSembuh;
    @SerializedName("jumlah_meninggal")
    @Expose
    private Integer jumlahMeninggal;
    @SerializedName("jumlah_dirawat")
    @Expose
    private Integer jumlahDirawat;
    @SerializedName("jenis_kelamin")
    @Expose
    private List<JenisKelamin> jenisKelamin = null;
    @SerializedName("kelompok_umur")
    @Expose
    private List<KelompokUmur> kelompokUmur = null;
    @SerializedName("lokasi")
    @Expose
    private Lokasi lokasi;
    @SerializedName("penambahan")
    @Expose
    private Penambahan penambahan;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getDocCount() {
        return docCount;
    }

    public void setDocCount(Double docCount) {
        this.docCount = docCount;
    }

    public Integer getJumlahKasus() {
        return jumlahKasus;
    }

    public void setJumlahKasus(Integer jumlahKasus) {
        this.jumlahKasus = jumlahKasus;
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

    public Integer getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(Integer jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public List<JenisKelamin> getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(List<JenisKelamin> jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public List<KelompokUmur> getKelompokUmur() {
        return kelompokUmur;
    }

    public void setKelompokUmur(List<KelompokUmur> kelompokUmur) {
        this.kelompokUmur = kelompokUmur;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }

}