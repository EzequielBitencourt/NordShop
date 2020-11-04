package com.example.nordshop.services;

import android.icu.util.ULocale;

import com.example.nordshop.model.Category;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CategoryFW {

    private static CategoryFW instance;
    private Map<Integer, Category> category;

    public CategoryFW(){ this.category = new HashMap<>(); }
    public static CategoryFW getInstance(){
        if(instance == null){
            instance = new CategoryFW();
        }
        return instance;
    }
    public void addCategory(Category category){
        this.category.put(category.getId(), category);
    }

    public Collection<Category> getCategory(){ return category.values(); }
    public Category getCategoryVyId(int id){ return category.get(id); }
    public Category getCategoryDescription(String description){
        Category dog = null;
        for(Category cat: category.values()){
            if(cat.getDescription().equals(description)){
                dog = cat;
            }
        }
        return dog;
    }
    public int getNumberCategory(){ return category.size();}
}
