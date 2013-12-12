package com.project.android.penaltygame;

import java.util.Random;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends FragmentActivity implements OnClickListener {

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
		
		btnLeft.setOnClickListener(this);
		btnRight.setOnClickListener(this);
		
		ImageView imgPlayer = (ImageView) findViewById(R.id.imgViewPlayer);
		imgPlayer.setBackgroundResource(R.drawable.p1);
					
	}
	
	/*
	 * Start playing
	 */
	public void run(int x) {
		ImageView imgPlayer = (ImageView) findViewById(R.id.imgViewPlayer);
		imgPlayer.setBackgroundResource(R.drawable.anim_player);
		AnimationDrawable playerAnim = (AnimationDrawable) imgPlayer.getBackground();
		
		playerAnim.start();		
	}
	
	
	/*
	 * Put the player in original position
	 * @param ImageView where set the first frame
	 */
	
	public void reset(ImageView iv) {
		iv.setBackgroundResource(R.drawable.p1);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	
	public void onClick(View v) {
		String where = ((Button) v).getText().toString();
		
		if(where == "btnRight") 
			run(0);
		if (where == "btnRight") 
			run(1);
		else
			run(2);
	}
	
	
	/*
	 * Generating a random int.
	 * Return a value between 0 and 2
	 */
	
	public int random() {
		Random r = new Random();
		return (r.nextInt(40)%3);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

}
