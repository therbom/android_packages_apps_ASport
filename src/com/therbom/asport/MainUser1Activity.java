package com.therbom.asport;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainUser1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user1_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_user1, menu);
		return true;
	}
	
	public void setTrainingActivity(View view) {
		Intent intent = new Intent(MainUser1Activity.this, TrainingUser1Activity.class);
        startActivity(intent);
	}

}
