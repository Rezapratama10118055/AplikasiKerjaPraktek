package com.dinas.dinaskesehatanbelitung.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dinas.dinaskesehatanbelitung.PenjelasanDetail;
import com.dinas.dinaskesehatanbelitung.R;
import com.dinas.dinaskesehatanbelitung.model.modelgaleri;

import java.util.ArrayList;

public class adapterKamenkes extends RecyclerView.Adapter<adapterKamenkes.ViewHolder> {
    private static final String TAG = "adapterPelayanan";
    private ArrayList<modelgaleri> datagaleri;
    private Context mContext;


    public adapterKamenkes(ArrayList<modelgaleri> datagaleri, Context context) {
        this.datagaleri= datagaleri;
        mContext = context;

    }


    @NonNull
    @Override
    public adapterKamenkes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardgambar, parent, false);
        return new adapterKamenkes.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterKamenkes.ViewHolder holder, int position) {
//        holder.judul.setText(dataItem.get(position).getJudul());
        holder.gudanggaleri.setImageResource(datagaleri.get(position).getImagegaleri());
//        holder.penjelasan.setText(dataItem.get(position).getPenjelasan());
//        holder.katagori.setText(dataItem.get(position).getKatagori());
//        holder.akun.setText(dataItem.get(position).getAkun());
//        holder.time.setText(dataItem.get(position).getTanggal());


        holder.relativepelayanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Toast.makeText(mContext, dataItem.get(position).getJudul(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, PenjelasanDetail.class);
//                intent.putExtra("penjelasanLengkap", dataItem.get(position).getPenjelasanLengkap());
//                intent.putExtra("image_name", dataItem.get(position).getJudul());
                intent.putExtra("image_gambar", datagaleri.get(position).getImagegaleri());

                mContext.startActivity(intent);

            }
        });


        Glide.with(mContext)
                .asBitmap()
                .override(1200, 800)
                .centerCrop()
                .load(datagaleri.get(position).getImagegaleri())
                .into(holder.gudanggaleri);
    }

    @Override
    public int getItemCount() {
        return datagaleri.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView judul, katagori, time, akun, penjelasan;
        private ImageView gudanggaleri;
        private CardView relativepelayanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            judul = itemView.findViewById(R.id.tvTitleberita);
            relativepelayanan = itemView.findViewById(R.id.cvlistimg);
            gudanggaleri = itemView.findViewById(R.id.img_galeri);
//            katagori = itemView.findViewById(R.id.tvKatagori);
//            time = itemView.findViewById(R.id.tvtime);
//            akun = itemView.findViewById(R.id.tvakun);
//            penjelasan = itemView.findViewById(R.id.tvPenjelasan);

        }
    }

}


