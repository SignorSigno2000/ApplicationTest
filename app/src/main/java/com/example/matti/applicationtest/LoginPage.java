package com.example.matti.applicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    private Button button;
    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        button = (Button) findViewById(R.id.confirmButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }

        });
    }

    public void openMainActivity(){
        eText=(EditText)findViewById(R.id.emailText);
        String strText = eText.getText().toString();
        eText=(EditText)findViewById(R.id.passwordText);
        String strTextP = eText.getText().toString();
        if(strText.toString().equalsIgnoreCase("")){

            Toast toast=Toast.makeText(getApplicationContext(), "Inserisci una mail valida", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(strTextP.toString().equalsIgnoreCase("")){
            Toast toast=Toast.makeText(getApplicationContext(), "Inserisci una password valida", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(!strText.toString().equalsIgnoreCase("prova@test.it"))
        {
            Toast toast=Toast.makeText(getApplicationContext(), "La mail è sbagliata", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(!strTextP.toString().equals((String)"TEST")){
            Toast toast=Toast.makeText(getApplicationContext(), "La password è sbagliata", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

}
