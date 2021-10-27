package com.example.explicitintent;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivityTwo extends AppCompatActivity {
    TextView t1;
    Button btn_b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_b1 = (Button)findViewById(R.id.b1);

        t1 = (TextView) findViewById(R.id.s_username);

        Intent intent = getIntent();

        String user = intent.getStringExtra("username");
        t1.setTextColor(Color.GREEN);
        t1.setText(user);


        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });




    }
}

