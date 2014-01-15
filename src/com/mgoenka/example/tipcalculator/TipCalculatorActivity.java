package com.mgoenka.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
	}
	
	protected String getTotal(View v, int percent) {
		EditText editText = (EditText)findViewById(R.id.etTotal);
		String editTextStr = editText.getText().toString();
		double tipTotal = Math.round(Float.parseFloat(editTextStr) * percent) / 100.0;
		
		return String.format("%.2f", tipTotal);
	}
	
	protected void displayTip(String tipTotal) {
		TextView tv = (TextView)findViewById(R.id.tvTip);
		tv.setText(getString(R.string.tip_total) + tipTotal);
	}
	
	public void onTen(View v) {
		displayTip(getTotal(v, 10));
	}

	public void onFifteen(View v) {
		displayTip(getTotal(v, 15));
	}

	public void onTwenty(View v) {
		displayTip(getTotal(v, 20));
	}

}
