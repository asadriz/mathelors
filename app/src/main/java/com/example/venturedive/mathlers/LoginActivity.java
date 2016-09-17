package com.example.venturedive.mathlers;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.xml.datatype.Duration;


public class LoginActivity extends Activity {
EditText ED_loginName,Ed_PASSWORD;
    Button Login_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ED_loginName = (EditText)findViewById(R.id.edusername);
        Ed_PASSWORD = (EditText)findViewById(R.id.edPassword);
        Login_Btn = (Button)findViewById(R.id.loginbutton);

        Login_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String user_name="asad", pass="12345";
                if(ED_loginName.getText().toString().equals(user_name) && Ed_PASSWORD.getText().toString().equals(pass))
                {
                    Intent intent =new Intent(LoginActivity.this,MainMenu.class);
                    intent.putExtra("key","value");
                    startActivity(intent);


                }
                else
                    Toast.makeText(LoginActivity.this,"Invalid user", Toast.LENGTH_LONG).show();
            }
        });



    }
}
