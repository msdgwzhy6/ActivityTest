package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class secondActivity extends Activity{

	@Override
	 protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setContentView(R.layout.second_layout);
		 
		// Intent intent = getIntent();
		// String data = intent.getStringExtra("FirstActivity");
		// Log.d("Test", data);
		 Button button2 = (Button)findViewById(R.id.button_2);
		 button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("secondActivity", "data_return");
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}
	
	@Override
	public void onBackPressed(){
		Intent intent = new Intent();
		intent.putExtra("secondActivity", "data_return");
		setResult(RESULT_OK, intent);
		finish();
	}
	
}
