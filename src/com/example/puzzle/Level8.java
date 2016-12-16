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

public class Level8 extends Activity implements OnClickListener {

		ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17;
		Drawable db1,db2,db3,db4,db5,db6,db7,db8,db9,db10,db11,db12,db13,db14,db15,db16,db17;
		boolean isdone=false;
		protected void onCreate(Bundle savedInstanceState)
	   {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level8);
		MainActivity.currentLevel=8;
		ib1=(ImageButton) findViewById(R.id.penguinButton1);
		ib2=(ImageButton) findViewById(R.id.penguinButton2);
		ib3=(ImageButton) findViewById(R.id.penguinButton3);
		ib4=(ImageButton) findViewById(R.id.penguinButton4);
		ib5=(ImageButton) findViewById(R.id.penguinButton5);
		ib6=(ImageButton) findViewById(R.id.penguinButton6);
		ib7=(ImageButton) findViewById(R.id.penguinButton7);
		ib8=(ImageButton) findViewById(R.id.penguinButton8);
		ib9=(ImageButton) findViewById(R.id.penguinButton9);
		ib10=(ImageButton) findViewById(R.id.penguinButton10);
		ib11=(ImageButton) findViewById(R.id.penguinButton11);
		ib12=(ImageButton) findViewById(R.id.penguinButton12);
		ib13=(ImageButton) findViewById(R.id.penguinButton13);
		ib14=(ImageButton) findViewById(R.id.penguinButton14);
		ib15=(ImageButton) findViewById(R.id.penguinButton15);
		ib16=(ImageButton) findViewById(R.id.penguinButton16);
		ib17=(ImageButton) findViewById(R.id.penguinButton17);
		
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
		db11=ib11.getDrawable();
		db12=ib12.getDrawable();
		db13=ib13.getDrawable();
		db14=ib14.getDrawable();
		db15=ib15.getDrawable();
		db16=ib16.getDrawable();
		db17=ib17.getDrawable();

		
		
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
		ib11.setOnClickListener(this);
		ib12.setOnClickListener(this);
		ib13.setOnClickListener(this);
		ib14.setOnClickListener(this);
		ib15.setOnClickListener(this);
		ib16.setOnClickListener(this);
		ib17.setOnClickListener(this);

		
		init();
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
				if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib1,ib2);

					if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib1,ib5);

			}
			if(v.equals(ib2))
			{
				if(imagesAreEqual(drawableToBitmap(ib1.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib2,ib1);

					if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib2,ib3);

					if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib2,ib6);

			}
			if(v.equals(ib3))
			{
				if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib2,ib3);

					if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib3,ib4);
					
					if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db17) ))
						shuffle(ib3,ib7);
					
			}
			if(v.equals(ib4))
			{
				if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib4,ib3);

					if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib4,ib8);
				
			}
			if(v.equals(ib5))
			{
				if(imagesAreEqual(drawableToBitmap(ib1.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib5,ib1);

					if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib5,ib6);

					if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib5,ib9);

			}
			if(v.equals(ib6))
			{
				if(imagesAreEqual(drawableToBitmap(ib2.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib6,ib2);

					if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib6,ib5);

					if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib6,ib7);
					
					if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db17) ))
						shuffle(ib6,ib10);
					
			}
			if(v.equals(ib7))
			{
				if(imagesAreEqual(drawableToBitmap(ib3.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib7,ib3);

					if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib7,ib6);
				
					if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db17) ))
						shuffle(ib7,ib8);
					
					if(imagesAreEqual(drawableToBitmap(ib11.getDrawable()),drawableToBitmap(db17) ))
						shuffle(ib7,ib11);
					
			}
			if(v.equals(ib8))
			{
				if(imagesAreEqual(drawableToBitmap(ib4.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib8,ib4);

					if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib8,ib7);
					
					if(imagesAreEqual(drawableToBitmap(ib12.getDrawable()),drawableToBitmap(db17) ))
						shuffle(ib8,ib12);
					
			}
			if(v.equals(ib9))
			{
				if(imagesAreEqual(drawableToBitmap(ib5.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib9,ib5);

					if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib9,ib10);

					if(imagesAreEqual(drawableToBitmap(ib13.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib9,ib13);
				
			}
			if(v.equals(ib10))
			{
				if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib10,ib9);
				if(imagesAreEqual(drawableToBitmap(ib6.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib10,ib6);
				if(imagesAreEqual(drawableToBitmap(ib11.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib10,ib11);
				if(imagesAreEqual(drawableToBitmap(ib14.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib10,ib14);
			
			}
			if(v.equals(ib11))
			{
				if(imagesAreEqual(drawableToBitmap(ib7.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib11,ib7);
				if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib11,ib10);
				if(imagesAreEqual(drawableToBitmap(ib12.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib11,ib12);
				if(imagesAreEqual(drawableToBitmap(ib15.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib11,ib15);
				
			}
			if(v.equals(ib12))
			{
				if(imagesAreEqual(drawableToBitmap(ib8.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib12,ib8);
				if(imagesAreEqual(drawableToBitmap(ib11.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib12,ib11);
				if(imagesAreEqual(drawableToBitmap(ib16.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib12,ib16);
				}
			if(v.equals(ib13))
			{
				if(imagesAreEqual(drawableToBitmap(ib9.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib13,ib9);
				if(imagesAreEqual(drawableToBitmap(ib14.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib13,ib14);
				
			}
			if(v.equals(ib14))
			{
				if(imagesAreEqual(drawableToBitmap(ib10.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib14,ib10);
				if(imagesAreEqual(drawableToBitmap(ib13.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib14,ib13);
				if(imagesAreEqual(drawableToBitmap(ib15.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib14,ib15);
			
			}
		
			if(v.equals(ib15))
			{
				if(imagesAreEqual(drawableToBitmap(ib11.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib15,ib11);
				if(imagesAreEqual(drawableToBitmap(ib14.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib15,ib14);
				if(imagesAreEqual(drawableToBitmap(ib16.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib15,ib16);
			}
			if(v.equals(ib16))
			{
				if(imagesAreEqual(drawableToBitmap(ib12.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib16,ib12);
				if(imagesAreEqual(drawableToBitmap(ib15.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib16,ib15);
				if(imagesAreEqual(drawableToBitmap(ib17.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib16,ib17);
		
			}
			if(v.equals(ib17))
			{
				if(imagesAreEqual(drawableToBitmap(ib16.getDrawable()),drawableToBitmap(db17) ))
					shuffle(ib17,ib16);
			 
				
			}
				
			if(done())
			{
				Intent i=new Intent(Level8.this,Win.class);
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
			id=R.drawable.penguin_01;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db2) ))
				id=R.drawable.penguin_02;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db3) ))
				id=R.drawable.penguin_03;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db4) ))
				id=R.drawable.penguin_04;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db5) ))
				id=R.drawable.penguin_05;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db6) ))
				id=R.drawable.penguin_06;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db7) ))
				id=R.drawable.penguin_07;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db8) ))
				id=R.drawable.penguin_08;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db9) ))
				id=R.drawable.penguin_09;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db10) ))
				id=R.drawable.penguin_10;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db11) ))
				id=R.drawable.penguin_11;

			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db12) ))
				id=R.drawable.penguin_12;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db13) ))
				id=R.drawable.penguin_13;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db14) ))
				id=R.drawable.penguin_14;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db15) ))
				id=R.drawable.penguin_15;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db16) ))
				id=R.drawable.penguin_16;
			
			if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(db17) ))
				id=R.drawable.penguinback;

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

		
			  case 1 : ib1.setImageResource(R.drawable.penguin_11);
			  		   ib2.setImageResource(R.drawable.penguin_04);
			  		   ib3.setImageResource(R.drawable.penguin_06);
			  		   ib4.setImageResource(R.drawable.penguin_10);
			  		   ib5.setImageResource(R.drawable.penguin_02);
			  		   ib6.setImageResource(R.drawable.penguin_03);
			  		   ib7.setImageResource(R.drawable.penguin_13);
			  		   ib8.setImageResource(R.drawable.penguin_08);
			  		   ib9.setImageResource(R.drawable.penguin_05);
			  		   ib10.setImageResource(R.drawable.penguin_01);
			  		   ib11.setImageResource(R.drawable.penguin_07);
			  		   ib12.setImageResource(R.drawable.penguin_15);
			  		   ib13.setImageResource(R.drawable.penguin_09);
			  		   ib14.setImageResource(R.drawable.penguin_14);
			  		   ib15.setImageResource(R.drawable.penguin_12);
			  		   ib16.setImageResource(R.drawable.penguin_16);
			  		   ib17.setImageResource(R.drawable.penguinback);
			  		   break;
			  		   

			  case 2 : ib1.setImageResource(R.drawable.penguin_11);
			  		   ib2.setImageResource(R.drawable.penguin_04);
			  		   ib3.setImageResource(R.drawable.penguin_06);
			  		   ib4.setImageResource(R.drawable.penguin_10);
			  		   ib5.setImageResource(R.drawable.penguin_02);
			  		   ib6.setImageResource(R.drawable.penguin_12);
			  		   ib7.setImageResource(R.drawable.penguin_03);
			  		   ib8.setImageResource(R.drawable.penguin_08);
			  		   ib9.setImageResource(R.drawable.penguin_05);
			  		   ib10.setImageResource(R.drawable.penguin_07);
			  		   ib11.setImageResource(R.drawable.penguin_14);
			  		   ib12.setImageResource(R.drawable.penguin_15);
			  		   ib13.setImageResource(R.drawable.penguinback);
			  		   ib14.setImageResource(R.drawable.penguin_09);
			  		   ib15.setImageResource(R.drawable.penguin_01);
			  		   ib16.setImageResource(R.drawable.penguin_13);
			  		   ib17.setImageResource(R.drawable.penguin_16);
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
									    	  if(imagesAreEqual(drawableToBitmap(ib11.getDrawable()),drawableToBitmap(db11) ))
									    		  if(imagesAreEqual(drawableToBitmap(ib12.getDrawable()),drawableToBitmap(db12) ))
									    			  if(imagesAreEqual(drawableToBitmap(ib13.getDrawable()),drawableToBitmap(db13) ))
									    				  if(imagesAreEqual(drawableToBitmap(ib14.getDrawable()),drawableToBitmap(db14) ))
									    					  if(imagesAreEqual(drawableToBitmap(ib15.getDrawable()),drawableToBitmap(db15) ))
									    						  if(imagesAreEqual(drawableToBitmap(ib16.getDrawable()),drawableToBitmap(db16) ))
																	   	 		return true;
					
			return false;
		}	

	}