package com.example.trackbus;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class Home extends Activity {

	 static final String DATABASE_NAME = "MyContacts.db";
	 private static final String TABLE_NAME = "ContactDetails";
	 
	 private SQLiteDatabase sqlDB;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		 sqlDB=openOrCreateDatabase (DATABASE_NAME,SQLiteDatabase.CREATE_IF_NECESSARY, null);
		 
		 sqlDB.execSQL("CREATE TABLE "+TABLE_NAME+"(id INTEGER PRIMARY KEY, Name TEXT, Phone LONG)");
	}
}
