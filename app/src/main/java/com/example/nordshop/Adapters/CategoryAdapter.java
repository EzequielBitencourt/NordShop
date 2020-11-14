/*package com.example.nordshop.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nordshop.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoriaViewHolder{

    private List<Category> categoryList;

    public CategoryAdapter(List<Category> categorias) {
        this.categoryList = categorias;
    }

    public CategoryAdapter.CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final LayoutCategoryBinding itemBinding = LayoutCategoryBinding.inflate(layoutInflater, parent, false);
        itemBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemBinding.getRoot().getContext(), GameList.class);
                intent.putExtra("idCategory",itemBinding.getCategory().id);
                itemBinding.getRoot().getContext().startActivity(intent);
            }
        });
        return new CategoriaViewHolder(itemBinding);
    }

    @Override
    public int getItemCount() { return categoryList.size();}

    @Override
    public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {
        holder.bind(categoryList.get(position));
    }

    public static class CategoriaViewHolder extends RecyclerView.ViewHolder {
        //aqui colocamos um item para binding. Estas classes são automaticamente criadas pelo Android
        LayoutCategoryBinding binding;
        // each data item is just a string in this case
        public View view;
        public CategoriaViewHolder(LayoutCategoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Category cat) {
            binding.setCategory(cat);
            binding.executePendingBindings();
        }
    }



}
*/