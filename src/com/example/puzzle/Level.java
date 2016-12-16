package com.example.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Level extends Activity implements OnClickListener

{
	Button l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level);
	   l1=(Button) findViewById(R.id.button1);		
	   l2=(Button) findViewById(R.id.button2);		
	   l3=(Button) findViewById(R.id.button3);		
	   l4=(Button) findViewById(R.id.button4);		
	   l5=(Button) findViewById(R.id.button5);		
	   l6=(Button) findViewById(R.id.button6);		
	   l7=(Button) findViewById(R.id.button7);		
	   l8=(Button) findViewById(R.id.button8);		
	   l9=(Button) findViewById(R.id.button9);		
	   l10=(Button) findViewById(R.id.button10);		
		
	   l1.setOnClickListener(this);
	   l2.setOnClickListener(this);
	   l3.setOnClickListener(this);
	   l4.setOnClickListener(this);
	   l5.setOnClickListener(this);
	   l6.setOnClickListener(this);
	   l7.setOnClickListener(this);
	   l8.setOnClickListener(this);
	   l9.setOnClickListener(this);
	   l10.setOnClickListener(this);

	}

	@Override
	public void onClick(View v)
	{
		if(v.equals(l1))
		{
			Intent i1=new Intent(Level.this,Level1.class);
			startActivity(i1);
			
		}
		if(v.equals(l2))
		{
			Intent i1=new Intent(Level.this,Level2.class);
			startActivity(i1);

		}
		if(v.equals(l3))
		{
			Intent i1=new Intent(Level.this,Level3.class);
			startActivity(i1);
			
		}
		if(v.equals(l4))
		{
			Intent i1=new Intent(Level.this,Level4.class);
			startActivity(i1);
			
		}
		if(v.equals(l5))
		{
			Intent i1=new Intent(Level.this,Level5.class);
			startActivity(i1);
			
		}
		if(v.equals(l6))
		{
			Intent i1=new Intent(Level.this,Level6.class);
			startActivity(i1);
			
		}
		if(v.equals(l7))
		{
			Intent i1=new Intent(Level.this,Level7.class);
			startActivity(i1);
			
		}
		if(v.equals(l8))
		{
			Intent i1=new Intent(Level.this,Level8.class);
			startActivity(i1);
			
		}
		if(v.equals(l9))
		{
			Intent i1=new Intent(Level.this,Level9.class);
			startActivity(i1);
			
		}
		if(v.equals(l10))
		{
			Intent i1=new Intent(Level.this,Level10.class);
			startActivity(i1);
			
		}

	}


}
