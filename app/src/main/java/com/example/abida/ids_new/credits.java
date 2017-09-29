package com.example.abida.ids_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final TextView tisa = (TextView) findViewById(R.id.tisa);
        final TextView nijhum = (TextView) findViewById(R.id.nijhum);
        final TextView barna = (TextView) findViewById(R.id.barna);
        final TextView abida = (TextView) findViewById(R.id.abida);

        tisa.startAnimation(AnimationUtils.loadAnimation(credits.this, android.R.anim.slide_in_left));
       long k=90000000;
        for(long i=0;i<k;i++);
       nijhum.startAnimation(AnimationUtils.loadAnimation(credits.this, android.R.anim.slide_in_left));

        for(long i=0;i<k;i++);
        barna.startAnimation(AnimationUtils.loadAnimation(credits.this, android.R.anim.slide_in_left));

        for(long i=0;i<k;i++);
        abida.startAnimation(AnimationUtils.loadAnimation(credits.this, android.R.anim.slide_in_left));
    }
}
