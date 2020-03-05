package com.example.haiqal.crudsqlitehaiqallanjutan;


import  android.content.Context;
import  android.database.sqlite.SQLiteDatabase;
import  android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
/**
 * Created by Haiqal on 14/04/2018.
 */

public class
dbconfig extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "biodatamahasiswa.db";
    private static final int DATABASE_VERSION = 1;

    public dbconfig (Context context){
        super (context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null)";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}