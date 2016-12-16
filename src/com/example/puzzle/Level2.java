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

public class Level2 extends Activity implements OnClickListener{
	ImageButton level2tb1,level2tb2,level2tb3,level2tb4,level2tb5;
	Drawable ilevel2tb1,ilevel2tb2,ilevel2tb3,ilevel2tb4,ilevel2tb5;
	boolean isdone=false;
protected void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.level2);
	MainActivity.currentLevel=2;
	
	level2tb1=(ImageButton) findViewById(R.id.imageButton6);
	level2tb2=(ImageButton) findViewById(R.id.imageButton7);
		
	level2tb3=(ImageButton) findViewById(R.id.imageButton8);
	
	level2tb4=(ImageButton) findViewById(R.id.imageButton9);
	
	level2tb5=(ImageButton) findViewById(R.id.imageButton10);
	
	ilevel2tb1=level2tb1.getDrawable();
	ilevel2tb2=level2tb2.getDrawable();
	ilevel2tb3=level2tb3.getDrawable();
	ilevel2tb4=level2tb4.getDrawable();
	ilevel2tb5=level2tb5.getDrawable();
	
	init();
	
	level2tb1.setOnClickListener(this);
	level2tb2.setOnClickListener(this);
	level2tb3.setOnClickListener(this);
	level2tb4.setOnClickListener(this);
	level2tb5.setOnClickListener(this);


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
public void onClick(View v) {
	if(v.equals(level2tb1))
	{
		if(imagesAreEqual(drawableToBitmap(level2tb2.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb1,level2tb2);

		if(imagesAreEqual(drawableToBitmap(level2tb3.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb1,level2tb3);
		
	}
	if(v.equals(level2tb2))
	{
		if(imagesAreEqual(drawableToBitmap(level2tb1.getDrawable()),drawableToBitmap(ilevel2tb5) ))
			shuffle(level2tb2,level2tb1);

		if(imagesAreEqual(drawableToBitmap(level2tb4.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb2,level2tb4);
		
	}
	if(v.equals(level2tb3))
	{
		if(imagesAreEqual(drawableToBitmap(level2tb1.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb3,level2tb1);
		
		if(imagesAreEqual(drawableToBitmap(level2tb4.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb3,level2tb4);
		
	}
	if(v.equals(level2tb4))
	{
	
		if(imagesAreEqual(drawableToBitmap(level2tb3.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb4,level2tb3);
		
		if(imagesAreEqual(drawableToBitmap(level2tb2.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb4,level2tb2);
		
		if(imagesAreEqual(drawableToBitmap(level2tb5.getDrawable()),drawableToBitmap(ilevel2tb5)))
		shuffle(level2tb4,level2tb5);

	}
	if(v.equals(level2tb5))
	{
		
		if(imagesAreEqual(drawableToBitmap(level2tb4.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		shuffle(level2tb5,level2tb4);
		
	}
	
	if(done())
	{
		Intent i=new Intent(Level2.this,Win.class);
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

	if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(ilevel2tb1) ))
	id=R.drawable.birdfirst;
	
	if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(ilevel2tb2) ))
		id=R.drawable.birdsecond;

	if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(ilevel2tb3) ))
		id=R.drawable.birdthird;
	
	if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(ilevel2tb4) ))
		id=R.drawable.birdzfouth;
	
	if(imagesAreEqual(drawableToBitmap(b.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		id=R.drawable.nonebird;
	
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
	for(int i=0;i<=4&&!done;i++)
	{
		
		int r=(int)((Math.random()*10)%5);
		
	  switch(r)
	  {
	  	case 1 :    level2tb1.setImageResource(R.drawable.nonebird);
	  				level2tb2.setImageResource(R.drawable.birdsecond);
	  				level2tb3.setImageResource(R.drawable.birdfirst);
	  				level2tb4.setImageResource(R.drawable.birdthird);
	  				level2tb5.setImageResource(R.drawable.birdzfouth);
	  				done=true;
	  				break;
	  
	  	case 2:	    level2tb1.setImageResource(R.drawable.birdsecond);
	  				level2tb2.setImageResource(R.drawable.nonebird);
	  				level2tb3.setImageResource(R.drawable.birdfirst);
	  				level2tb4.setImageResource(R.drawable.birdthird);
	  				level2tb5.setImageResource(R.drawable.birdzfouth);
	  				done=true;
	  				break;
	  	case 3 : 	level2tb1.setImageResource(R.drawable.birdsecond);
	  				level2tb2.setImageResource(R.drawable.birdthird);
	  				level2tb3.setImageResource(R.drawable.birdfirst);
	  				level2tb4.setImageResource(R.drawable.nonebird);
	  				level2tb5.setImageResource(R.drawable.birdzfouth);
	  				done=true;
	  				break;
	  	case 4: 	level2tb1.setImageResource(R.drawable.birdsecond);
					level2tb2.setImageResource(R.drawable.birdthird);
					level2tb3.setImageResource(R.drawable.birdfirst);
					level2tb4.setImageResource(R.drawable.birdzfouth);
					level2tb5.setImageResource(R.drawable.nonebird);
					done=true;
					break;
	  	default :done=false;
	  				break;
	  }
	}

 

}
public boolean done()
{
	if(imagesAreEqual(drawableToBitmap(level2tb1.getDrawable()),drawableToBitmap(ilevel2tb1) ))
	  if(imagesAreEqual(drawableToBitmap(level2tb2.getDrawable()),drawableToBitmap(ilevel2tb2) ))
	     if(imagesAreEqual(drawableToBitmap(level2tb3.getDrawable()),drawableToBitmap(ilevel2tb3) ))
		  if(imagesAreEqual(drawableToBitmap(level2tb4.getDrawable()),drawableToBitmap(ilevel2tb4) ))
		     if(imagesAreEqual(drawableToBitmap(level2tb5.getDrawable()),drawableToBitmap(ilevel2tb5) ))
		    	 	return true;
			
	return false;
}
}
