package com.dinas.dinaskesehatanbelitung.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dinas.dinaskesehatanbelitung.R;
import com.dinas.dinaskesehatanbelitung.model.Datum;

import java.util.List;

public class adapterCovid  extends RecyclerView.Adapter<adapterCovid.ViewHolder>  {

    private static final String TAG = "adapterCovid";
    List<Datum> examples;
    private Context context;




    public adapterCovid(List<Datum> example) {
        examples = example;
    }


    @NonNull
    @Override
    public adapterCovid.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardcovid,parent,false);
        return new adapterCovid.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterCovid.ViewHolder holder, int position) {
        Datum example = examples.get(position);
        holder.txpro.setText(example.getProvinsi());
        holder.txsem.setText(Integer.toString(example.getKasusSemb()));
        holder.txpos.setText(Integer.toString(example.getKasusPosi()));
        holder.txmen.setText(Integer.toString(example.getKasusMeni()));

    }

    @Override
    public int getItemCount() {
        return examples.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txpos,txmen,txsem,txpro;
        private CardView card_covid;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            card_covid = itemView.findViewById(R.id.card_cov);
            txpos = itemView.findViewById(R.id.kasuspositif);
            txmen = itemView.findViewById(R.id.meinggal);
            txpro = itemView.findViewById(R.id.provensi);
           txsem = itemView.findViewById(R.id.sembuh);

        }
    }
}
