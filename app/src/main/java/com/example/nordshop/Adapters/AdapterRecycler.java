package com.example.nordshop.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nordshop.R;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolderCatalogo> {

    private String[] data;

    public static class ViewHolderCatalogo extends RecyclerView.ViewHolder {
        public View fragment;
        public ViewHolderCatalogo(View v) {
            super(v);
            fragment = v;
        }
    }



    public AdapterRecycler(String[] data) { data = data;}

    @NonNull
    @Override

    public AdapterRecycler.ViewHolderCatalogo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler, parent, false);
        ViewHolderCatalogo vh = new ViewHolderCatalogo(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCatalogo holder, int position) {
        TextView tv = holder.fragment.findViewById(R.id.tvFragment);
        tv.setText((data[position]));
    }

    @Override
    public int getItemCount(){ return data.length;}

}
