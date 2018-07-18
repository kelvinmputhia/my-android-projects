package com.example.kelvin.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="student.db";
    public static final String TABLE_NAME="student_table";
    public static final String COOL_1 ="student.db";
    public static final String COOL_2  ="ID";
    public static final String COOL_3 = "SURNAME";
    public static final String COOL_4 ="MARKS";

    public DatabaseHelper(Context context)  {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table" +TABLE_NAME +"(ID INTERGER PRIMARY KEY AUTOINCREMENT,NAME TEXT SURNAME TEXT MARKS INTERGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldvesion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);

    }
}
