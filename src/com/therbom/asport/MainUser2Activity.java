package com.therbom.asport;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainUser2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user2_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_user2, menu);
		return true;
	}

}
