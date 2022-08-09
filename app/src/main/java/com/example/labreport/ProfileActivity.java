package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4;
    Button buttonLogout, buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        buttonUpdate = (Button) findViewById(R.id.buttonUpdate);

        textView1=(TextView) findViewById(R.id.textView1);
        textView1.setText(GlobalVariable.user);
        textView2=(TextView) findViewById(R.id.textView2);
        textView2.setText(GlobalVariable.mail);
        textView3=(TextView) findViewById(R.id.textView3);
        textView3.setText(GlobalVariable.number);
        textView4=(TextView) findViewById(R.id.textView4);
        textView4.setText(GlobalVariable.pass);


        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, UpdateActivity.class);
                startActivity(intent);
            }
        });


    }

}