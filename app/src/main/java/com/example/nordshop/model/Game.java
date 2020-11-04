package com.example.nordshop.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Game implements Parcelable{

    private String name;
    private String[] genre;
    private int id;
    private String image;

    public Game(JSONObject jsonObject){
        try{
            this.name = jsonObject.getString("name");
            this.id = jsonObject.getInt("id");
            this.image = jsonObject.getString("url_image");
            JSONArray jarr = jsonObject.getJSONArray("genre");
            this.genre = new String[jarr.length()];
            for(int i=0; i<jarr.length();i++){
                this.genre[i] = jarr.getJSONObject(i).getString("name");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    protected Game(Parcel in){

        id = in.readInt();
        name = in.readString();
        genre = in.createStringArray();
        image = in.readString();
    }

    public static final Creator<Game> CREATOR = new Creator<Game>(){

        @Override
        public Game createFromParcel(Parcel in) { return new Game(in);}

        @Override
        public Game[] newArray(int size) { return new Game[size];}
    };

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    public String[] getGenre() { return genre; }
    public int getNumberGenres(){ return genre.length; }
    public void setGenre(String[] genre) { this.genre = genre; }

    public int getId() {  return id; }

    public void setId(int id) {  this.id = id;  }

    public String getImage() {  return image; }

    public void setImage(String image) { this.image = image; }

    @Override
    public int describeContents() { return 0;}

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeStringArray(genre);
        parcel.writeString(image);
    }



}
