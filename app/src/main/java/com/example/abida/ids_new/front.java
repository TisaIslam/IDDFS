package com.example.abida.ids_new;

import android.content.Intent;
import android.os.Process;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnTouchListener;
import java.util.concurrent.Delayed;
import java.util.logging.Handler;

public class front extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

       final Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        b1.getBackground().setAlpha(100);

                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent = new Intent(getApplicationContext(), theory.class);
                        startActivity(intent);
                        b1.getBackground().setAlpha(255);


                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });


        final Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        b2.getBackground().setAlpha(100);

                        break;
                    case MotionEvent.ACTION_UP:
                startActivity(new Intent(getApplicationContext(), select_graph.class));
                        b2.getBackground().setAlpha(255);


                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        b3.getBackground().setAlpha(100);

                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), FAQ.class));
                        b3.getBackground().setAlpha(255);


                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });


        final Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        b4.getBackground().setAlpha(100);

                        break;
                    case MotionEvent.ACTION_UP:
                        finish();
                        /*Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);*/
                        b4.getBackground().setAlpha(255);


                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        b5.getBackground().setAlpha(100);

                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), credits.class));
                        /*Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);*/
                        b5.getBackground().setAlpha(255);


                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });


    }

    @Override
    protected void onDestroy() {
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }
}
