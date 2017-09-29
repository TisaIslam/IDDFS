package com.example.abida.ids_new;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class input extends AppCompatActivity {
    String inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        final EditText e1 = (EditText) findViewById(R.id.input);
       final  Button btn = (Button) findViewById(R.id.start);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
        public boolean onTouch(View v, MotionEvent event) {
             //String inp = e1.getText().toString();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    btn.getBackground().setAlpha(100);

                    break;
                case MotionEvent.ACTION_UP:
             Intent intent = new Intent(getApplicationContext(), animatn.class);
             String inp = e1.getText().toString();
             intent.putExtra("name", inp);
             startActivity(intent);

                    btn.getBackground().setAlpha(255);


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
}
