package com.example.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Level1 extends Activity implements OnClickListener
{
	ImageButton tb1,tb2,tb3,tb4,tb5;
	Drawable itb1,itb2,itb3,itb4,itb5;
	boolean isdone=false;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level1);
		
		MainActivity.currentLevel=1;
		
		tb1=(ImageButton) findViewById(R.id.imageButton1);
		tb2=(ImageButton) findViewById(R.id.imageButton2);
			
		tb3=(ImageButton) findViewById(R.id.imageButton3);
		
		tb4=(ImageButton) findViewById(R.id.imageButton4);
		
		tb5=(ImageButton) findViewById(R.id.imageButton5);
		
		itb5=tb5.getDrawable();
		itb4=tb4.getDrawable();
		itb3=tb3.getDrawable();
		itb2=tb2.getDrawable();
		itb1=tb1.getDrawable();
		
		init();
		
		tb1.setOnClickListener(this);
		tb2.setOnClickListener(this);
		tb3.setOnClickListener(this);
		tb4.setOnClickListener(this);
		tb5.setOnClickListener(this);

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
	public void onClick(View view)
	{
		
		if(view.equals(tb1))
		{
			if(imagesAreEqual(drawableToBitmap(tb2.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb1,tb2);

			if(imagesAreEqual(drawableToBitmap(tb3.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb1,tb3);
			
		}
		if(view.equals(tb2))
		{
			if(imagesAreEqual(drawableToBitmap(tb1.getDrawable()),drawableToBitmap(itb5) ))
				shuffle(tb2,tb1);

			if(imagesAreEqual(drawableToBitmap(tb4.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb2,tb4);
			
		}
		if(view.equals(tb3))
		{
			if(imagesAreEqual(drawableToBitmap(tb1.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb3,tb1);
			
			if(imagesAreEqual(drawableToBitmap(tb4.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb3,tb4);
			
		}
		if(view.equals(tb4))
		{
		
			if(imagesAreEqual(drawableToBitmap(tb3.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb4,tb3);
			
			if(imagesAreEqual(drawableToBitmap(tb2.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb4,tb2);
			
			if(imagesAreEqual(drawableToBitmap(tb5.getDrawable()),drawableToBitmap(itb5)))
			shuffle(tb4,tb5);
	
		}
		if(view.equals(tb5))
		{
			
			if(imagesAreEqual(drawableToBitmap(tb4.getDrawable()),drawableToBitmap(itb5) ))
			shuffle(tb5,tb4);
			
		}
		
		if(done())
		{
			MainActivity.currentLevel=1;
			Intent i=new Intent(Level1.this,Win.class);
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
	
	public void init()
	{ 
		
		boolean done=false;
		for(int i=0;i<=4&&!done;i++)
		{
			
			int r=(int)((Math.random()*10)%5);
			
		  switch(r)
		  {
		  	case 1 :    tb1.setImageResource(R.drawable.none);
		  				tb2.setImageResource(R.drawable.tbt);
		  				tb3.setImageResource(R.drawable.tbo);
		  				tb4.setImageResource(R.drawable.tbth);
		  				tb5.setImageResource(R.drawable.tbfo);
		  				done=true;
		  				break;
		  
		  	case 2:	    tb1.setImageResource(R.drawable.tbt);
		  				tb2.setImageResource(R.drawable.none);
		  				tb3.setImageResource(R.drawable.tbo);
		  				tb4.setImageResource(R.drawable.tbth);
		  				tb5.setImageResource(R.drawable.tbfo);
		  				done=true;
		  				break;
		  	case 3 : 	tb1.setImageResource(R.drawable.tbt);
		  				tb2.setImageResource(R.drawable.tbth);
		  				tb3.setImageResource(R.drawable.tbo);
		  				tb4.setImageResource(R.drawable.none);
		  				tb5.setImageResource(R.drawable.tbfo);
		  				done=true;
		  				break;
		  	case 4: 	tb1.setImageResource(R.drawable.tbt);
						tb2.setImageResource(R.drawable.tbth);
						tb3.setImageResource(R.drawable.tbo);
						tb4.setImageResource(R.drawable.tbfo);
						tb5.setImageResource(R.drawable.none);
						done=true;
						break;
		  	default :done=false;
		  				break;
		  }
		}

	 
	
	}
	public int checkImage(ImageButton b)
	{
		int id = 0;
	
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(itb1) ))
		id=R.drawable.tbo;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(itb2) ))
			id=R.drawable.tbt;
	
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(itb3) ))
			id=R.drawable.tbth;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(itb4) ))
			id=R.drawable.tbfo;
		
		if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(itb5) ))
			id=R.drawable.none;
		
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
	
	public boolean done()
	{
		if(imagesAreEqual(drawableToBitmap(tb1.getDrawable()),drawableToBitmap(itb1) ))
		  if(imagesAreEqual(drawableToBitmap(tb2.getDrawable()),drawableToBitmap(itb2) ))
		     if(imagesAreEqual(drawableToBitmap(tb3.getDrawable()),drawableToBitmap(itb3) ))
			  if(imagesAreEqual(drawableToBitmap(tb4.getDrawable()),drawableToBitmap(itb4) ))
			     if(imagesAreEqual(drawableToBitmap(tb5.getDrawable()),drawableToBitmap(itb5) ))
			    	 	return true;
				
		return false;
	}
	
}
