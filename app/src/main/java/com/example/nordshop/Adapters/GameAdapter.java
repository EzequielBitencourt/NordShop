/*package com.example.nordshop.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nordshop.model.Game;

import java.util.List;

public class GameAdapter {
    private List<Game> games;

    public GameAdapter(List<Game> games) {this.games = games;}



    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        LayoutGameViewHolderBinding itemBinding = LayoutGameViewHolderBinding.inflate(layoutInflater, parent, false);
        return new GameAdapter.GameViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {holder.bind(games.get(position));}

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {
        LayoutGameViewHolderBinding binding;
        public View view;
        public GameViewHolder(LayoutGameViewHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Game game) {
            binding.setGame(game);
            binding.executePendingBindings();
        }
    }


}*/
