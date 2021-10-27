package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mLogin;
    EditText mUsername, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin = (Button) findViewById(R.id.b1);
        mUsername = (EditText) findViewById(R.id.etusername);
        mPassword = (EditText) findViewById(R.id.etpassword);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mUsername.getText().toString().equals("Ygay") && mPassword.getText().toString().equals("ygay123")) {
                    String str = "Welcome " + mUsername.getText().toString();
                    Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                    intent.putExtra("username", str);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}