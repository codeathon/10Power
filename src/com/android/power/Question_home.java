/**
 * 
 */
package com.android.power;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/**
 * @author rohit
 *
 */
public class Question_home extends Activity {
	
	private EditText Question1;
	private EditText Question2;
	private EditText Question3;
	private EditText Question4;
	private EditText Question5;
	private ImageView imgviewColorBar;
	
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.screen1_home);
	        initControl();
	}
	
	private void initControl() {
		Question1 = (EditText)findViewById(R.id.editText2_Question1);
		Question2 = (EditText)findViewById(R.id.editText2_Question2);
		Question3 = (EditText)findViewById(R.id.editText2_Question3);
		Question4 = (EditText)findViewById(R.id.editText2_Question4);
		Question5 = (EditText)findViewById(R.id.editText2_Question5);
		imgviewColorBar = (ImageView)findViewById(R.id.home_colorbar);
		
		imgviewColorBar.setScaleType(ScaleType.FIT_XY);
		
		Question1.setOnClickListener(new EditText.OnClickListener() { public void onClick(View v) { Question1OnClick(); }});
		Question2.setOnClickListener(new EditText.OnClickListener() { public void onClick(View v) { Question2OnClick(); }});
		Question3.setOnClickListener(new EditText.OnClickListener() { public void onClick(View v) { Question3OnClick(); }});
		Question4.setOnClickListener(new EditText.OnClickListener() { public void onClick(View v) { Question4OnClick(); }});
		Question5.setOnClickListener(new EditText.OnClickListener() { public void onClick(View v) { Question5OnClick(); }});		

	}

	protected void Question5OnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question5.class);
		startActivityForResult(myIntent,0);
	}

	protected void Question4OnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question4.class);
		startActivityForResult(myIntent,0);
	}

	protected void Question3OnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question3.class);
		startActivityForResult(myIntent,0);
	}

	protected void Question2OnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question2.class);
		startActivityForResult(myIntent,0);
	}

	protected void Question1OnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question1.class);
		startActivityForResult(myIntent,0);
	}
}
