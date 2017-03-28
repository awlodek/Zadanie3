package com.example.przemcio.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class obrazek extends Activity {

    public Button but1;
    public void init()
    {
        but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent toy= new Intent(obrazek.this,MainActivity.class);
                startActivity(toy);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrazek);

        Button zmienObrazek = (Button) findViewById(R.id.button4);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button powrot = (Button) findViewById(R.id.button);
        Button poprzedni = (Button) findViewById(R.id.button7);


        zmienObrazek.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imageView.setImageResource(R.drawable.android2);

            }
        });

        poprzedni.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imageView.setImageResource(R.drawable.android);

            }
        });
        powrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
