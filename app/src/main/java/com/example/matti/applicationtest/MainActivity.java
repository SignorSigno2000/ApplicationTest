package com.example.matti.applicationtest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.EmptyStackException;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast=Toast.makeText(getApplicationContext(), "I'm the main Activity", Toast.LENGTH_SHORT);
        toast.show();

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity1();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });

        button=
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this, A1.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, A2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, A3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, A4.class);
        startActivity(intent);
    }
}
