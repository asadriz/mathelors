package com.example.venturedive.mathlers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MethlorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methlor);

        Intent intent=getIntent();
        String a=intent.getStringExtra("1");
        String b=intent.getStringExtra("2");
        String c=intent.getStringExtra("3");
        TextView tv=(TextView)findViewById(R.id.text1);
        tv.append(intent.getStringExtra("3"));



        Toast.makeText(MethlorActivity.this,a+" ", Toast.LENGTH_LONG).show();


    }
}
