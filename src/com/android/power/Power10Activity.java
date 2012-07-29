package com.android.power;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class Power10Activity extends Activity {
    /** Called when the activity is first created. */

	private ImageView imgview;
	private Button button_letsgetstarted;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1_intro);
        initControl();
    }
    
    public void initControl() {
    	button_letsgetstarted = (Button)findViewById(R.id.button1_letsgetstarted);
    	button_letsgetstarted.setGravity(Gravity.CENTER);
    	button_letsgetstarted.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { letsGetStartedOnClick(); }});
    	
    	imgview = (ImageView)findViewById(R.id.colorbar);
    	imgview.setScaleType(ScaleType.FIT_XY);
    }    
    
    private void letsGetStartedOnClick() {
    	Intent myIntent = new Intent();
		myIntent.setClass(this, Question_home.class);
		startActivityForResult(myIntent,0);
    }
}