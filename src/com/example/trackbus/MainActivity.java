package com.example.trackbus;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	Handler h=new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		h.postDelayed(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,Home.class);
				startActivity(i);
				finish();
			}},1500);
		
	}
	// Declare static variables to hold string values for the names private  static final string DATABASE_NAME = "MyContacts.db";
	 private static final String TABLE_NAME = "ContactDetails";
	 // Declare an object of SQLiteDatabase
	 private SQLiteDatabase sqlDB;
	 // Write the following code inside the onCreate() method
	 // Open the database if it exists otherwise create the MyContacts database  
	 sqlDB=openOrCreateDatabase (DATABASE_NAME,SQLiteDatabase.CREATE_IF_NECESSARY, null);
	 // Create a table with three columns: columns id, name, and phone
	 sqlDB.execSQL("CREATE TABLE "+TABLE_NAME+"(id INTEGER PRIMARY KEY, Name TEXT, Phone LONG)");
}

