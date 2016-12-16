package com.example.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Win extends Activity implements OnClickListener{
	Button bcon;
	MediaPlayer mp;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.win);
		bcon = (Button) findViewById(R.id.button11);
		bcon.setOnClickListener(this);
		mp=MediaPlayer.create(Win.this, R.raw.applause);
		mp.start();
	}
	@Override
	public void onClick(View v)
	{
		if(MainActivity.currentLevel==1)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level2.class);
			startActivity(i);
			finish();
		}
		if(MainActivity.currentLevel==2)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level3.class);
			startActivity(i);
			finish();
		}
		if(MainActivity.currentLevel==3)
		{ 
			mp.stop();
			Intent i=new Intent(Win.this, Level4.class);
			startActivity(i);
			finish();
			
		}		
		if(MainActivity.currentLevel==4)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level5.class);
			startActivity(i);
			finish();
		}
		if(MainActivity.currentLevel==5)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level6.class);
			startActivity(i);
			finish();
			
		}
		if(MainActivity.currentLevel==6)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level7.class);
			startActivity(i);
			finish();
		}
		if(MainActivity.currentLevel==7)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level8.class);
			startActivity(i);
			finish();
			
		}
		if(MainActivity.currentLevel==8)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level9.class);
			startActivity(i);
			finish();
			
		}
		if(MainActivity.currentLevel==9)
		{
			mp.stop();
			Intent i=new Intent(Win.this, Level10.class);
			startActivity(i);
			finish();
			
		}	
		if(MainActivity.currentLevel==10)
		{
			mp.stop();
			finish();
			
		}	

	}

}
