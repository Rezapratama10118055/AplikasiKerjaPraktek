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

import com.dinas.dinaskesehatanbelitung.PenjelasanDetail;
import com.dinas.dinaskesehatanbelitung.R;

import java.util.List;

public class adapterBeritakesehatan extends RecyclerView.Adapter<adapterBeritakesehatan.ViewHolder>{
    private static final String TAG = "adapterBeritakesehatan";
   com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Data data;
    private Context context;


//
//    public adapterBeritakesehatan(com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example item_berita, Context context) {
//        this.mData = item_berita;
//        this.context = context;
//
//    }

    public adapterBeritakesehatan(com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Data item_berita, Context context) {
        this.data = item_berita;
        this.context = context;

    }


    @NonNull
    @Override
    public adapterBeritakesehatan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardberitala, parent, false);
        return new adapterBeritakesehatan.ViewHolder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterBeritakesehatan.ViewHolder holder, int position) {
        holder.Judul_berita.setText(data.getPosts().get(position).getTitle());
//        holder.Des_berita.setText(data.get(position).getDescription());
//        holder.link_berita.setText(data.get(position).getLink());


//        Glide.with(context)
//                .asBitmap()
//                .load(mData.get().get(position).getThumb())
//                .into(holder.gambarpencarian);

        holder.cdcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adapterBeritakesehatan.this.context, PenjelasanDetail.class);
//                intent.putExtra("kay",mData.getResults().get(position).getKey());
//                intent.putExtra("penjelasanLengkap",mData.getResults().get(position).getTitle());
//                intent.putExtra("porsi",mData.getResults().get(position).getServing());
//                intent.putExtra("kesulitan",mData.getResults().get(position).getDifficulty());
//                intent.putExtra("waktu",mData.getResults().get(position).getTimes());
//                intent.putExtra("gambar",mData.getResults().get(position).getThumb());

                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.getPosts().size();
    }







    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Judul_berita, Des_berita, link_berita, porsi;
        private ImageView gambarpencarian;
        private CardView cdcard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Judul_berita = itemView.findViewById(R.id.judulberitaye);
            Des_berita = itemView.findViewById(R.id.deskripsi_beritaye);
            link_berita = itemView.findViewById(R.id.linkberitaye);
            cdcard = itemView.findViewById(R.id.cardBeritaKesehatan);
        }


    }
}