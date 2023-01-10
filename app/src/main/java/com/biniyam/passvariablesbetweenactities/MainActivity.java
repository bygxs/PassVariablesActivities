package com.biniyam.passvariablesbetweenactities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.biniyam.passvariablesbetweenactities.EXTRA_TEXT ";
    public static final String EXTRA_NUMBER = "com.biniyam.passvariablesbetweenactities.EXTRA_NUMBER ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisplayActivity();
            }
        });
    }

    public void openDisplayActivity(){
        EditText editTextName= findViewById(R.id.et_name);
        String name =  editTextName.getText().toString();

        EditText editTextPassword = findViewById(R.id.et_password);
        int password = Integer.parseInt (editTextPassword.getText().toString());

        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra(EXTRA_TEXT, name);
        intent.putExtra(EXTRA_NUMBER,password);
        startActivity(intent);

    }
}