package com.example.activitytest;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends Activity {
	@Override
	 protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setContentView(R.layout.first_layout);
		 
		 Button button1 = (Button)findViewById(R.id.button_1);
		 button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(FirstActivity.this, "This is Button_1", Toast.LENGTH_SHORT).show();
				//finish();
				Intent intent = new Intent(FirstActivity.this,secondActivity.class);
				//Intent intent = new Intent("com.example.activitytest.ACTION_START");
				//intent.addCategory("com.example.activitytest.MY_CATEGORY");
				//Intent intent = new Intent(Intent.ACTION_DIAL);
				//intent.setData(Uri.parse("tel:18868875399"));
				//String data = "password";
				//intent.putExtra("FirstActivity", data);
				startActivityForResult(intent, 1);
			}
		});
			
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode){
		case 1:
			if(resultCode == RESULT_OK){
				String dataString = data.getStringExtra("secondActivity");
				Log.d("Test", dataString);
			}
			break;
		default:
			break;
		}
		
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId())
		{
			case R.id.add_item:
				Toast.makeText(FirstActivity.this, "This is add_item", Toast.LENGTH_SHORT).show();
				break;
			case R.id.remove_item:
				Toast.makeText(FirstActivity.this, "This is remove_item", Toast.LENGTH_SHORT).show();
				break;
		    default:
		    	break;
		}
		
		return true;
	}
}
