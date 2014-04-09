package com.itcarlow.dietapplication52;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static android.provider.BaseColumns._ID;



	public class Handler_sqlite extends SQLiteOpenHelper
	
	{
	public Handler_sqlite(Context ctx)
	{
		super(ctx, "MyBase", null, 1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		String query = "CREATE TABLE users ("+_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + "user TEXT, password TEXT);";
		db.execSQL(query);
		
		
		
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		db.execSQL("DROP TABLE IF EXISTS users");
		onCreate(db);
		
	}
	
	public void insertReg(String user, String pass)
	{
		ContentValues values = new ContentValues();
		values.put("user", user);
		values.put("password", pass);
		this.getWritableDatabase().insert("users", null, values);
	}


	
	
	
	
	

}
