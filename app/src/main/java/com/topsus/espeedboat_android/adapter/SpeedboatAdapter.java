package com.topsus.espeedboat_android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.topsus.espeedboat_android.R;

import java.util.List;

public class SpeedboatAdapter extends RecyclerView.Adapter<SpeedboatAdapter.ViewHolder> {

    List<String>namaSpeedboat;
    List<String>kapasitas;

    Context context;

    public SpeedboatAdapter(List<String> namaSpeedboat, List<String> kapasitas, Context context) {
        this.namaSpeedboat = namaSpeedboat;
        this.kapasitas = kapasitas;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_speedboat_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(namaSpeedboat.get(position));
        holder.textView1.setText(kapasitas.get(position));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Otw Detail Speedboat", Toast.LENGTH_SHORT).show();

//                Intent intent =  new Intent(context, DetailRiwayatrgsActivity.class);
//                intent.putExtra("keluhan", pyktList.get(position));
//
//                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return namaSpeedboat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView, textView1;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.bukgedebuk);
            textView = itemView.findViewById(R.id.namaSpeedboatList);
            textView1 = itemView.findViewById(R.id.kapasitasSpeedboatList);
            linearLayout = itemView.findViewById(R.id.consrwtrgs);
        }
    }
}
