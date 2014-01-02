package com.therbom.asport;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class User1TrainingConditieActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user1_training_conditie);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user1_training_conditie, menu);
		return true;
	}
	
	public void goBack(View view) {
		Intent intent = new Intent(User1TrainingConditieActivity.this, MainUser1Activity.class);
        startActivity(intent);
	}

}
