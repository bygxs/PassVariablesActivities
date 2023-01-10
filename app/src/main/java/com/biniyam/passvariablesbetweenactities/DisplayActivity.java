package com.biniyam.passvariablesbetweenactities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int password = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);

        TextView textView1 = findViewById(R.id.tv_name);
        TextView textView2 = findViewById(R.id.tv_password);

        // now assign each values that were brought from MainActivity by setting then on to the textView displays
        textView1.setText(name);
        textView2.setText("" + password); //because this is an intiger "" is added to 'turn' it to string

        /*OBS: In the manifist, implement the back arrow <- in the child activity which is
        the display activity and the MainActivity is th parent activity by writing the following line
        to the Display Activity

        android:parentActivityName=".MainActivity"
        the complete line in the <activity tag looks like this
        ...
        android:name=".DisplayActivity" android:parentActivityName=".MainActivity"
        ...
     */
    }

}