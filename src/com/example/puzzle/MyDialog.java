package com.example.puzzle;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyDialog extends Dialog implements android.view.View.OnClickListener {
	

	public MyDialog(Activity a)
	{
		super(a);
	}
   	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
  
     	super.onCreate(savedInstanceState);
        setContentView(R.layout.showdialog);
        setTitle("Help");
        ImageButton ig=(ImageButton) findViewById(R.id.dialogbutton);
        ig.setOnClickListener((android.view.View.OnClickListener) this);
        if(MainActivity.currentLevel==1)
        {
        	ig.setImageResource(R.drawable.maintb);
        }
        if(MainActivity.currentLevel==2)
        {
        	ig.setImageResource(R.drawable.img);
        }
        if(MainActivity.currentLevel==3)
        {
        	ig.setImageResource(R.drawable.maindessert);
        }
        if(MainActivity.currentLevel==4)
        {
        	ig.setImageResource(R.drawable.mainrain);
        }
        if(MainActivity.currentLevel==5)
        {
        	ig.setImageResource(R.drawable.mainparrots);
        } 
        if(MainActivity.currentLevel==6)
        {
        	ig.setImageResource(R.drawable.mainautumn);
        }
        if(MainActivity.currentLevel==7)
        {
        	ig.setImageResource(R.drawable.mainfish);
        }
        if(MainActivity.currentLevel==8)
        {
        	ig.setImageResource(R.drawable.mainpenguins);
        }     
        if(MainActivity.currentLevel==9)
        {
        	ig.setImageResource(R.drawable.mainsea);
        }
        if(MainActivity.currentLevel==10)
        {
        	ig.setImageResource(R.drawable.mainbench);
        }
	}
	public void onClick(View v)
	{

		dismiss();
	}
}
