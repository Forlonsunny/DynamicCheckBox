package com.theoaktroop.dynamiccheckbox;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_main);

    final     LinearLayout ll = (LinearLayout) findViewById(R.id.layout);



        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
       Button b=new Button(this);
        b.setText("I can Create Dynamically CheckBoxButton");

        ll.addView(b);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 5; i++) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("CheckBox"+i);
                    ll.addView(cb);
                }
            }
        });

    }



}
