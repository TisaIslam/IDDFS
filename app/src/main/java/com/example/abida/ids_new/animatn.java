package com.example.abida.ids_new;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class animatn extends AppCompatActivity {

    private AnimationDrawable frameAnimation;
    String in;
    int duration[] ;
    MyAnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animatn);
        //Bundle extras = getIntent().getExtras();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        in = (String) getIntent().getExtras().get("name");


        ImageView iv = (ImageView) findViewById(R.id.gif);
       // iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));


        if (in.equals("a") || in.equals("A"))
            iv.setBackgroundResource(R.drawable.anim_a);

        else if (in.equals("b") || in.equals("B"))

            iv.setBackgroundResource(R.drawable.anim_b);
        else if (in.equals("c") || in.equals("C"))

            iv.setBackgroundResource(R.drawable.anim_c);
        else if (in.equals("d") || in.equals("D"))

            iv.setBackgroundResource(R.drawable.anim_d);
        else if (in.equals("e") || in.equals("E"))

            iv.setBackgroundResource(R.drawable.anim_e);
        else if (in.equals("f") || in.equals("F"))
          // iv.setImageResource(R.drawable.anim_f);
            iv.setBackgroundResource(R.drawable.anim_f);
        else if (in.equals("g") || in.equals("G"))

            iv.setBackgroundResource(R.drawable.anim_g);
        else if (in.equals("h") || in.equals("H"))

            iv.setBackgroundResource(R.drawable.anim_h);
       // frameAnimation.setOneShot(true);
       //iv.setScaleType(ImageView.ScaleType.FIT_XY);
        frameAnimation = (AnimationDrawable) iv.getBackground();
       // frameAnimation.setOneShot(true);
       // DisplayMetrics metrics = getApplicationContext().getResources().getDisplayMetrics();
        //int width = metrics.widthPixels;
        //int height = metrics.heightPixels;
       anim = new MyAnimationDrawable();

        duration= new int[frameAnimation.getNumberOfFrames()];
        for (int i=0;i<frameAnimation.getNumberOfFrames();i++) {
            anim.addFrame(frameAnimation.getFrame(i),frameAnimation.getDuration(i));
            duration[i]= frameAnimation.getDuration(i);
          //  anim.setBounds(0,0,width,height);
          //  anim.scheduleSelf(,frameAnimation.getDuration(i));
           // anim.setDuration(frameAnimation.getDuration(i));

        }
        //anim.getIntrinsicWidth();
        anim.setOneShot(true);

        iv.setImageDrawable(anim);
      anim.setDuration(duration);

       // frameAnimation.setVisible(true, true);

       // frameAnimation.start();
       // iv.setImageDrawable(anim);
        anim.setOneShot(true);
        final Button bt = (Button) findViewById(R.id.bt_an);
        bt.setOnTouchListener(new View.OnTouchListener() {
              @Override
              public boolean onTouch(View v, MotionEvent event) {
                  switch (event.getAction()) {
                      case MotionEvent.ACTION_DOWN:
                          bt.getBackground().setAlpha(100);

                          break;
                      case MotionEvent.ACTION_UP:


                          for (int i = 0; i < anim.getNumberOfFrames(); i++) {
                              duration[i]-=50;
                              //Toast.makeText(getApplicationContext(), " " + duration[i], Toast.LENGTH_LONG).show();
                          }


                          anim.setDuration(duration);
                          bt.getBackground().setAlpha(255);


                          break;
                      case MotionEvent.ACTION_MOVE:

                          break;

                      default:
                          break;
                  }
                  return false;
              }
          }
        );

          final  Button bt2 = (Button) findViewById(R.id.bt_an2);
            bt2.setOnTouchListener(new View.OnTouchListener() {
               @Override
               public boolean onTouch(View v, MotionEvent event) {
                   switch (event.getAction()) {
                       case MotionEvent.ACTION_DOWN:
                           bt2.getBackground().setAlpha(100);

                           break;
                       case MotionEvent.ACTION_UP:
                           for (int i = 0; i < anim.getNumberOfFrames(); i++) {
                               duration[i]+=50;
                              // Toast.makeText(getApplicationContext(), " " + duration[i], Toast.LENGTH_LONG).show();
                           }

                        //   Toast.makeText(getApplicationContext(), " " + duration, Toast.LENGTH_LONG).show();
                          // frameAnimation.setOneShot(true);
                           anim.setDuration(duration);
                           bt2.getBackground().setAlpha(255);


                           break;
                       case MotionEvent.ACTION_MOVE:

                           break;

                       default:
                           break;
                   }
                   return false;
               }
           }
            );



    }



}
