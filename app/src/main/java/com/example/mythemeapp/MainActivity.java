package com.example.mythemeapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_click;
    EditText ed_checkCustomer;
    String ed_checkCustomerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);

        setContentView(R.layout.activity_main);

        btn_click = findViewById(R.id.btn_clickkkk);
        ed_checkCustomer = findViewById(R.id.ed_customerCheck);


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_checkCustomerText = ed_checkCustomer.getText().toString();
                if (ed_checkCustomerText.equalsIgnoreCase("Islamic")) {
                    Utils.changeToTheme(MainActivity.this, Utils.THEME_WHITE);
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);


                }
            }




        });
    }
    
}