package com.project.android.penaltygame;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_2);


		Button btnLeft = (Button) findViewById(R.id.btnLeft);
		Button btnRight = (Button) findViewById(R.id.btnRight);
		ImageView imgPlayer = (ImageView) findViewById(R.id.imgViewPlayer);
		imgPlayer.setBackgroundResource(R.drawable.p1);
				
		btnLeft.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ImageView imgPlayer = (ImageView) findViewById(R.id.imgViewPlayer);
				imgPlayer.setBackgroundResource(R.drawable.anim_player);
				AnimationDrawable playerAnim = (AnimationDrawable) imgPlayer.getBackground();
				
				playerAnim.start();
				imgPlayer.setBackgroundResource(R.drawable.p1);
				
			}
		});
		
		btnRight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ImageView imgPlayer = (ImageView) findViewById(R.id.imgViewPlayer);
				imgPlayer.setBackgroundResource(R.drawable.anim_player);
				AnimationDrawable playerAnim = (AnimationDrawable) imgPlayer.getBackground();
				
				playerAnim.start();
				
			}
		});		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

}
