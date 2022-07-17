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
	
}

