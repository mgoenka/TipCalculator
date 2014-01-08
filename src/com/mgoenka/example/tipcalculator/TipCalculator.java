package com.mgoenka.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class TipCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
	
	public void onTen(View v) {
		// Generating an alert in Android
		Toast.makeText(getBaseContext(), "1", Toast.LENGTH_SHORT).show();
	}

	public void onFifteen(View v) {
		// Generating an alert in Android
		Toast.makeText(getBaseContext(), "2", Toast.LENGTH_SHORT).show();
	}

	public void onTwenty(View v) {
		// Generating an alert in Android
		Toast.makeText(getBaseContext(), "3", Toast.LENGTH_SHORT).show();
	}

}
