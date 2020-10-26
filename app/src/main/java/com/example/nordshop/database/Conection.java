package com.example.nordshop.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Conection extends SQLiteOpenHelper {

    private static  final String name ="banco.db";
    private static final int version = 1;

    public Conection( Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuario(" +
                "id integer primary key autoincrement," +
                "username varchar(50)," +
                "senha varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
