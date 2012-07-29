/**
 * 
 */
package com.android.power;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
/**
 * @author rohit
 *
 */
public class Question1 extends Activity {
	final int PICTURE_ACTIVITY = 1; // This is only really needed if you are catching the results of more than one activity.  It'll make sense later.

	@Override
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.screen2_question1);
	        final ImageButton cameraButton = (ImageButton)findViewById(R.id.camera_button); // Get a handle to the button so we can add a handler for the click event 
			cameraButton.setOnClickListener(new OnClickListener() {
				public void onClick(View v){
					Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); // Normally you would populate this with your custom intent.
					startActivityForResult(cameraIntent, PICTURE_ACTIVITY); // This will cause the onActivityResult event to fire once it's done
				}
			});
	    }
	    
	    @Override
		protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
			super.onActivityResult(requestCode, resultCode, intent);

			AlertDialog msgDialog;
			if (resultCode == RESULT_CANCELED) { // The user didn't like the photo.  ;_;
					msgDialog = createAlertDialog("Result", "you can try again!", "OK!");

			} else {
				/*
				This is where you would trap the requestCode (in this case PICTURE_ACTIVITY).  Seeing as how this is the ONLY 
				Activity that we are calling from THIS activity, it's kind of a moot point.  If you had more than one activity that
				you were calling for results, you would need to throw a switch statement in here or a bunch of if-then-else
				constructs.  Whatever floats your boat.
				*/
				msgDialog = createAlertDialog("ZOMG!", "YOU TOOK A PICTURE!  WITH YOUR PHONE! HOLY CRAP!", "I KNOW RITE??!?");

				Bitmap bmp = null;
				bmp = (Bitmap) getIntent().getExtras().get("data");


			}

			msgDialog.show();
		}

		private AlertDialog createAlertDialog(String title, String msg, String buttonText){
			AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
			AlertDialog msgDialog = dialogBuilder.create();
			msgDialog.setTitle(title);
			msgDialog.setMessage(msg);
			msgDialog.setButton(buttonText, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dialog, int idx){
					return; // Nothing to see here...
				}
			});

			return msgDialog;
		}
	 }
