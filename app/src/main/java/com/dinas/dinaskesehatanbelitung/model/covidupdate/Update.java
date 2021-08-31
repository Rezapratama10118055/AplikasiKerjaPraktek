package com.dinas.dinaskesehatanbelitung.model.covidupdate;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Update {

    @SerializedName("penambahan")
    @Expose
    private Penambahan penambahan;
    @SerializedName("harian")
    @Expose
    private List<Harian> harian = null;
    @SerializedName("total")
    @Expose
    private Total total;

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }

    public List<Harian> getHarian() {
        return harian;
    }

    public void setHarian(List<Harian> harian) {
        this.harian = harian;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

}
