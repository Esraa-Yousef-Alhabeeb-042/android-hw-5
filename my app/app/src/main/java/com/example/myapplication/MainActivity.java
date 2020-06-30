package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText job = findViewById(R.id.job);
        final EditText phone = findViewById(R.id.phone);
        final EditText email = findViewById(R.id.mail);
        Button next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, com.example.myapplication.MainActivity2.class);
                next.putExtra("info1",name.getText().toString());
                next.putExtra("info2",age.getText().toString());
                next.putExtra("info3",job.getText().toString());
                next.putExtra("info4",phone.getText().toString());
                next.putExtra("info5",email.getText().toString());
            }
        });
    }
}
