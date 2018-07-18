package com.example.kelvin.sqliteapps;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME ="student.db";
    public static final String TABLE_NAME ="student.table";
    public static final String COOL_1 ="ID";
    public static final String COOL_2 ="NAME";
    public static final String COOL_3 ="SURNAME";
    public static final String COOL_4 ="MARKS";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTERGER PRIMARY KEY AUTOINCREMENT,NAME TEXT ,SURNAME TEXT, MARKS INTERGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
    public boolean insertdata(String name,String surname, String marks){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(COOL_2,name);
        contentValues.put(COOL_3,surname);
        contentValues.put(COOL_4,marks);
        long result =db.insert(TABLE_NAME,null,contentValues);

        if (result == -1){
             return false;}
            else
                 return true;


    }
    public Cursor getAllData (){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;

    }
    public boolean updateData(String id,String name,String surname,String marks){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(COOL_2,name);
        contentValues.put(COOL_3,surname);
        contentValues .put(COOL_4,marks);
        db.update(TABLE_NAME, contentValues,"ID = ?",new String[] ( id ));
        return true;

        }

    }

