package com.example.abida.ids_new;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MyAnimationDrawable extends AnimationDrawable {

    private volatile int duration[];//its volatile because another thread will update its value
    private int currentFrame;


    public MyAnimationDrawable()
    {
        currentFrame = 0;
        //setOneShot(true);
       // Context context = getApplicationContext();
    }

    //@Override
    public void run() {
        //this.setOneShot(true);
       // Toast.makeText(getActivity(),"aaaaa " + duration, Toast.LENGTH_LONG).show();

        int n = getNumberOfFrames();
        currentFrame++;
        if (currentFrame >= n) {
            currentFrame = 0;
            return;
        }

        selectDrawable(currentFrame);
        scheduleSelf(this, SystemClock.uptimeMillis() + duration[currentFrame]);
        //scheduleSelf(this, this.duration+ duration);

        //this.invalidateDrawable();
    }

    public void setDuration(int duration[])
    {
        this.duration = duration;
        //we have to do the following or the next frame will be displayed after the old duration
        unscheduleSelf(this);
        selectDrawable(currentFrame);
        scheduleSelf(this, SystemClock.uptimeMillis() + duration[currentFrame]);
    }

}