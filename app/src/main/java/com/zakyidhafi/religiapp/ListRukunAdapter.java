package com.zakyidhafi.religiapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListRukunAdapter extends RecyclerView.Adapter<ListRukunAdapter.ListViewHolder> {
   private final ArrayList<Rukun> listRukun;

   public ListRukunAdapter(ArrayList<Rukun> list){
       this.listRukun = list;
   }

   private OnItemClickCallback onItemClickCallback;

   public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
       this.onItemClickCallback = onItemClickCallback;
   }

    @NonNull

    @Override
    public ListViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_rukun, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Rukun rukun = listRukun.get(position);
        Glide.with(holder.itemView.getContext())
                .load(rukun.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(rukun.getName());
        holder.tvDetail.setText(rukun.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listRukun.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listRukun.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
       ImageView imgPhoto;
       TextView tvName, tvDetail;

         ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_rukun);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback{
       void onItemClicked(Rukun rukun);
    }
}
