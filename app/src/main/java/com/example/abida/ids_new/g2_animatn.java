package com.example.abida.ids_new;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class g2_animatn extends AppCompatActivity {

    private AnimationDrawable frameAnimation;
    String inp;
    int duration[] ;
    MyAnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2_animatn);
        //Bundle extras = getIntent().getExtras();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        inp = (String) getIntent().getExtras().get("name2");


        ImageView iv = (ImageView) findViewById(R.id.gif2);
        // iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));


        if (inp.equals("a") || inp.equals("A"))
            iv.setBackgroundResource(R.drawable.anim2_a);

        else if (inp.equals("b") || inp.equals("B"))

            iv.setBackgroundResource(R.drawable.anim2_b);
        else if (inp.equals("c") || inp.equals("C"))

            iv.setBackgroundResource(R.drawable.anim2_c);
        else if (inp.equals("d") || inp.equals("D"))

            iv.setBackgroundResource(R.drawable.anim2_d);
        else if (inp.equals("e") || inp.equals("E"))
            iv.setBackgroundResource(R.drawable.anim2_e);
        else
            Toast.makeText(getApplicationContext(), " Wrong input !! try a - e" , Toast.LENGTH_LONG).show();
            // iv.setImageResource(R.drawable.anim_f);
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
