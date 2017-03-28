package com.example.przemcio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    public Button but1;
    public void init()
    {
        but1=(Button)findViewById(R.id.button5);
        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent toy= new Intent(MainActivity.this,obrazek.class);
                startActivity(toy);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_app);
        init();



        Button button = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        final EditText Imie = (EditText)findViewById(R.id.editText2);
        final EditText Nazwisko = (EditText)findViewById(R.id.editText);
        Button submit = (Button)findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 3");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 2");

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView2 = (TextView) findViewById(R.id.textView4);
                textView2.setText(Nazwisko.getText().toString()+ " "+ Imie.getText().toString());

                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,obrazek.class);
                startActivity(intent);
        }
        });


    }
}
