package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView info = findViewById(R.id.x);
        Bundle z = getIntent().getExtras();
        assert z != null;
        info.setText(z.getString("info1"));
        info.setText(z.getString("info2"));
        info.setText(z.getString("info3"));
        info.setText(z.getString("info4"));
        info.setText(z.getString("info5"));


    }
}
