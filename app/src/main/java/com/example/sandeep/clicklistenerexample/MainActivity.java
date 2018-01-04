package com.example.sandeep.clicklistenerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnOne;
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne=findViewById(R.id.btn_one);
        btnTwo=findViewById(R.id.btn_two);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"this is first way to use click listener",Toast.LENGTH_LONG).show();
            }
        });

        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"this is second way to use click listener",Toast.LENGTH_LONG).show();
    }


    public void btnClick(View view){
        Toast.makeText(this,"third way to use click Listener",Toast.LENGTH_LONG).show();
    }

}
