package com.example.nordshop.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.nordshop.exception.UserNotFoundException;


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
                "userName varchar(50)," +
                "senha varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists usuario");
    }

    public Boolean CheckUserNameAndPass(String username,String senha) throws UserNotFoundException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from usuario where userName=? and senha=?",new String[]{username,senha});
        if(cursor.getCount()>0) {
            return true;
        }
        else {
            throw  new UserNotFoundException();
        }
    }
}
