package com.londonappbrewery.magiceightball;

import android.graphics.drawable.RippleDrawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAsk = findViewById(R.id.btn_ask);
        final ImageView eightBall = findViewById(R.id.img_eightBall);

        final int [] eightBalls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btnAsk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Random rng = new Random();
                eightBall.setImageResource(eightBalls[rng.nextInt(eightBalls.length)]);
            }
        });
    }
}
