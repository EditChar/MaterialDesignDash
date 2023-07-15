package com.example.materialdesigndash.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.materialdesigndash.Domains.TrendsDomain;
import com.example.materialdesigndash.R;

import java.util.ArrayList;

public class TrendsAdapter extends RecyclerView.Adapter<TrendsAdapter.ViewHolder> {

    ArrayList<TrendsDomain> items;
    Context context;

    public TrendsAdapter(ArrayList<TrendsDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View infalter = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trend_list,parent,false);
        context = parent.getContext();
        return new ViewHolder(infalter);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendsAdapter.ViewHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.subTitle.setText(items.get(position).getSubTitle());

        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicAdress(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, subTitle;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTxt);
            subTitle = itemView.findViewById(R.id.subtitleTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
