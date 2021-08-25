package com.dinas.dinaskesehatanbelitung.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dinas.dinaskesehatanbelitung.PenjelasanDetail;
import com.dinas.dinaskesehatanbelitung.R;
import com.dinas.dinaskesehatanbelitung.model.model;

import java.util.ArrayList;

public class adapterBerita extends RecyclerView.Adapter<adapterBerita.ViewHolder>{
    private static final String TAG = "adapterBerita";
    private ArrayList<model> dataItem;
    private Context mContext;


 public adapterBerita(ArrayList<model> dataItem, Context context){
        this.dataItem = dataItem;
        mContext = context;

    }



    @NonNull
    @Override
    public adapterBerita.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterBerita.ViewHolder holder, int position) {
        holder.judul.setText(dataItem.get(position).getJudul());
        holder.gambar.setImageResource(dataItem.get(position).getImage());
        holder.penjelasan.setText(dataItem.get(position).getPenjelasan());
        holder.katagori.setText(dataItem.get(position).getKatagori());
        holder.akun.setText(dataItem.get(position).getAkun());
        holder.time.setText(dataItem.get(position).getTanggal());


        holder.relativeCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(mContext, dataItem.get(position).getJudul(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, PenjelasanDetail.class);
                intent.putExtra("penjelasanLengkap", dataItem.get(position).getPenjelasanLengkap());
                intent.putExtra("image_name", dataItem.get(position).getJudul());
                intent.putExtra("image_url",dataItem.get(position).getImage());

                mContext.startActivity(intent);

            }
        });



        Glide.with(mContext)
                .asBitmap()
                .override(1200, 800)
                .centerCrop()
                .load(dataItem.get(position).getImage())
                .into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView judul,katagori,time,akun,penjelasan;
        private ImageView gambar;
        private CardView relativeCategories;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tvTitleberita);
            relativeCategories = itemView.findViewById(R.id.cvListgambar);
            gambar = itemView.findViewById(R.id.gambarni);
            katagori = itemView.findViewById(R.id.tvKatagori);
            time = itemView.findViewById(R.id.tvtime);
            akun = itemView.findViewById(R.id.tvakun);
            penjelasan = itemView.findViewById(R.id.tvPenjelasan);

        }
    }

}