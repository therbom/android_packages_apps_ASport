package com.therbom.asport;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }
    
    public void checkUser(View view) {
    	EditText mInputText = (EditText) findViewById(R.id.editText1);
    	String mInput = mInputText.getText().toString();
    	
    	if(mInput.equals("schutter")) {
    		Intent intent = new Intent(WelcomeActivity.this, MainUser1Activity.class);
            startActivity(intent);
    	} else if(mInput.equals("trainer")) {
    		Intent intent = new Intent(WelcomeActivity.this, MainUser2Activity.class);
            startActivity(intent);
    	} else {
    		Toast toast = Toast.makeText(getApplicationContext(), "Ongeldige gegevens", Toast.LENGTH_SHORT);
    		toast.show();
    	}
    	
    }
    
}
