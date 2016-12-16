package com.example.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Level5 extends Activity implements OnClickListener {
	

	ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10;
	Drawable db1,db2,db3,db4,db5,db6,db7,db8,db9,db10;
	boolean isdone=false;
	protected void onCreate(Bundle savedInstanceState)
   {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.level5);
	MainActivity.currentLevel=5;
	
	ib1=(ImageButton) findViewById(R.id.parrotButton1);
	ib2=(ImageButton) findViewById(R.id.parrotButton2);
	ib3=(ImageButton) findViewById(R.id.parrotButton3);
	ib4=(ImageButton) findViewById(R.id.parrotButton4);
	ib5=(ImageButton) findViewById(R.id.parrotButton5);
	ib6=(ImageButton) findViewById(R.id.parrotButton6);
	ib7=(ImageButton) findViewById(R.id.parrotButton7);
	ib8=(ImageButton) findViewById(R.id.parrotButton8);
	ib9=(ImageButton) findViewById(R.id.parrotButton9);
	ib10=(ImageButton) findViewById(R.id.parrotButton10);
	
	db1=ib1.getDrawable();
	db2=ib2.getDrawable();
	db3=ib3.getDrawable();
	db4=ib4.getDrawable();
	db5=ib5.getDrawable();
	db6=ib6.getDrawable();
	db7=ib7.getDrawable();
	db8=ib8.getDrawable();
	db9=ib9.getDrawable();
	db10=ib10.getDrawable();

	init();
	
	ib1.setOnClickListener(this);
	ib2.setOnClickListener(this);
	ib3.setOnClickListener(this);
	ib4.setOnClickListener(this);
	ib5.setOnClickListener(this);
	ib6.setOnClickListener(this);
	ib7.setOnClickListener(this);
	ib8.setOnClickListener(this);
	ib9.setOnClickListener(this);
	ib10.setOnClickListener(this);

  }
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.mymenu, menu);
	    return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{

	    if(item.getItemId()==R.id.show_pic1)
	    {
	    	MyDialog d=new MyDialog(this);
		    d.show();
	    }
		
		return super.onOptionsItemSelected(item);
	}
	@Override
	public void onClick(View v)
	{
		if(v.equals(ib1))
		{
			if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib1,ib2);

				if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib1,ib4);

		}
		if(v.equals(ib2))
		{
			if(imagesAreEqual(drawableToBitmap(ib1.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib2,ib1);

				if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib2,ib3);

				if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib2,ib5);

		}
		if(v.equals(ib3))
		{
			if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib2,ib3);

				if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib3,ib6);
			
		}
		if(v.equals(ib4))
		{
			if(imagesAreEqual(drawableToBitmap(ib1.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib4,ib1);

				if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib4,ib5);

				if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib4,ib7);
			
		}
		if(v.equals(ib5))
		{
			if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib5,ib2);

				if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib5,ib4);

				if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib5,ib6);

				if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib5,ib8);

		}
		if(v.equals(ib6))
		{
			if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib6,ib3);

				if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib6,ib5);

				if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib6,ib9);

		}
		if(v.equals(ib7))
		{
			if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib7,ib4);

				if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib7,ib8);
			
		}
		if(v.equals(ib8))
		{
			if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib8,ib7);

				if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib8,ib5);
				
				if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db10) ))
					shuffle(ib8,ib9);
				
		}
		if(v.equals(ib9))
		{
			if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib9,ib6);

				if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib9,ib8);

				if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib9,ib10);
			
		}
		if(v.equals(ib10))
		{
			if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db10) ))
				shuffle(ib10,ib9);
			
		}
		if(done())
		{
			Intent i=new Intent(Level5.this,Win.class);
			startActivity(i);
			finish();	
		}

	}
	
	
	public void shuffle(ImageButton b1,ImageButton b2)
	{
		int b1id=checkImage(b1);
		int b2id=checkImage(b2);
		
	    b2.setImageResource(b1id);
		b1.setImageResource(b2id);

	}

	public int checkImage(ImageButton b)
	{
		int id = 0;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db1) ))
		id=R.drawable.parrots_01;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db2) ))
			id=R.drawable.parrots_02;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db3) ))
			id=R.drawable.parrots_03;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db4) ))
			id=R.drawable.parrots_04;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db5) ))
			id=R.drawable.parrots_05;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db6) ))
			id=R.drawable.parrots_06;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db7) ))
			id=R.drawable.parrots_07;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db8) ))
			id=R.drawable.parrots_08;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db9) ))
			id=R.drawable.parrots_09;

		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db10) ))
			id=R.drawable.parrotback;
		
		return id;
	}
	public static Bitmap drawableToBitmap (Drawable drawable)
	{
	    if (drawable instanceof BitmapDrawable)
	    {
	        return ((BitmapDrawable)drawable).getBitmap();
	    }

	    Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
	    Canvas canvas = new Canvas(bitmap); 
	    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	    drawable.draw(canvas);

	    return bitmap;
	}
	boolean imagesAreEqual(Bitmap i1, Bitmap i2)
	{
	    if (i1.getHeight() != i2.getHeight())
	    	return false;
	    if (i1.getWidth() != i2.getWidth())
	    	return false;

	    for (int y = 0; y < i1.getHeight(); ++y)
	       for (int x = 0; x < i1.getWidth(); ++x)
	            if (i1.getPixel(x, y) != i2.getPixel(x, y))
	            	return false;

	    return true;
	}
	public void init()
	{ 
		
		boolean done=false;
		for(int i=0;i<=6&&!done;i++)
		{
			
			int r=(int)((Math.random()*10)%3);
			
		  switch(r)
		  {
		  case 1 : ib1.setImageResource(R.drawable.parrots_05);
		  		   ib2.setImageResource(R.drawable.parrots_08);
		  		   ib3.setImageResource(R.drawable.parrots_01);
		  		   ib4.setImageResource(R.drawable.parrots_06);
		  		   ib5.setImageResource(R.drawable.parrots_02);
		  		   ib6.setImageResource(R.drawable.parrots_07);
		  		   ib7.setImageResource(R.drawable.parrots_04);
		  		   ib8.setImageResource(R.drawable.parrots_03);
		  		   ib9.setImageResource(R.drawable.parrots_09);
		  		   ib10.setImageResource(R.drawable.parrotback);
		  		   done=true;
		  		   break;
		  
		  case 2 : ib1.setImageResource(R.drawable.parrotback);
 		   ib2.setImageResource(R.drawable.parrots_05);
 		   ib3.setImageResource(R.drawable.parrots_01);
 		   ib4.setImageResource(R.drawable.parrots_02);
 		   ib5.setImageResource(R.drawable.parrots_08);
 		   ib6.setImageResource(R.drawable.parrots_07);
 		   ib7.setImageResource(R.drawable.parrots_06);
 		   ib8.setImageResource(R.drawable.parrots_04);
 		   ib9.setImageResource(R.drawable.parrots_03);
 		   ib10.setImageResource(R.drawable.parrots_09);
 		   done =true;
 		   break;
		  default :done=false;
		  				break;
		  }
		}

	 

	}
	public boolean done()
	{
		if(imagesAreEqual(drawableToBitmap(ib1.getDrawable()),drawableToBitmap(db1) ))
		  if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db2) ))
		     if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db3) ))
			  if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db4) ))
			     if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db5) ))
				     if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db6) ))
					     if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db7) ))
						     if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db8) ))
							     if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db9) ))
								     if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db10) ))
								    	 		return true;
				
		return false;
	}	
}
