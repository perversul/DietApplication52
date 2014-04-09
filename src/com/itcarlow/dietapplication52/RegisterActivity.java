package com.itcarlow.dietapplication52;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends Activity
{
Button nextButton;
TextView emailText, personText, passwordText;



@Override
protected void onCreate(Bundle savedInstanceState) 
{
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.persondetailsreg);

	nextButton = (Button) findViewById(R.id.nextButton);
	emailText = (TextView) findViewById(R.id.emailText);
	personText = (TextView) findViewById(R.id.personText);
	passwordText = (TextView) findViewById(R.id.passwordText);
	
	nextButton.setOnClickListener(new View.OnClickListener()
	{
		public void onClick(View v)
		{
			//Intent registerIntent = new Intent(RegisterActivity.this);
			//startActivity(registerIntent);
		}
	
});
	
}


}
