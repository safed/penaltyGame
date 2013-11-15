package com.project.android.penaltygame;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Activity_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Portait (Verticale)
 
		//setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		//Landscape (Orizzontale)
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//setContentView(R.layout.activity_1);
		
		setContentView(R.layout.activity_1);
		Button ShowActivity2Button = (Button) findViewById(R.id.btn_start);
        ShowActivity2Button.setOnClickListener(new View.OnClickListener() 
        	{
        		public void onClick(View view){
        			startActivity3();
        		}
        	}
       );
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_1, menu);
		return true;
	}
	
	private void startActivity3(){
    	Intent startTwo= new Intent(this, Activity3.class);
    	startActivity(startTwo);
    }

}
