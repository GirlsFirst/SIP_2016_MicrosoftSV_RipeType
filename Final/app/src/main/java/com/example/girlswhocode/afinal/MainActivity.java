package com.example.girlswhocode.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public Button banana;
    public Button mango;
    public Button strawberry;
    public Button lemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMessageButton();
    }


    private void setupMessageButton(){
        Button messageButton = (Button) findViewById(R.id.button1);
        Button messageButton2 = (Button) findViewById(R.id.button2);
        Button messageButton3 = (Button) findViewById(R.id.button3);
        Button messageButton4 = (Button) findViewById(R.id.button4);
        messageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(MainActivity.this, newActivity.class);
                startActivity(toy);
            }
        });
        messageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(MainActivity.this, newActivity2.class);
                startActivity(toy);
            }
        });
        messageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(MainActivity.this, newActivity3.class);
                startActivity(toy);
            }
        });
        messageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(MainActivity.this, newActivity4.class);
                startActivity(toy);
            }
        });
    }
}