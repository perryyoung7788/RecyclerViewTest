package com.example.recyclerviewtest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<Country> countries;
    private Context context; // for send intent

    static class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView imageView;
        TextView textView;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            imageView = itemView.findViewById(R.id.iv_flag);
            textView = itemView.findViewById(R.id.iv_country);
        }
    }

    CountryAdapter(Context context, List<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.layout_in_recyclerview,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        // viewHolder.view include imageView and textView, and you can set Click event on whole view
        // or imageview only or textview only
        viewHolder.view.setOnClickListener(v -> {
            int position = viewHolder.getAdapterPosition();
            Country country = countries.get(position);
            Intent intent = new Intent(v.getContext(),WebActivity.class);
            intent.putExtra("countrydata",country);
            context.startActivity(intent);
        });
        viewHolder.imageView.setOnClickListener(v -> {
            int position = viewHolder.getAdapterPosition();
            Country country = countries.get(position);
            Intent intent = new Intent(v.getContext(),FlagActivity.class);
            intent.putExtra("countrydata",country);
            context.startActivity(intent);
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {
        Country country = countries.get(position);
        Picasso.get().load(country.getFlagLink()).into(holder.imageView);
        holder.textView.setText(country.getCountryName());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
