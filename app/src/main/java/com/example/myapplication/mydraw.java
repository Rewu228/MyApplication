package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Артур on 07.10.2017.
 */

public class mydraw extends View {
    int N = 50;
    int[] x = new int[N];
    int[] y = new int[N];
    int[] r = new int[N];
    int[] vx = new int[N];
    int[] vy = new int[N];
    int[] blue = new int[N];
    int[] red = new int[N];
    int[] green = new int[N];

    Paint paint = new Paint();
    boolean started = false;
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if (!started){
            for(int i = 0; i < N ; i++){
                x[i] = (int) (Math.random()*canvas.getWidth());
                y[i] = (int) (Math.random()*canvas.getHeight());
                r[i] = (int) (Math.random()*20) + 30;
                vx[i] = (int) (Math.random()*5) + 5;
                vy[i] = (int) (Math.random()*5) + 5;
                green[i] = (int) (Math.random()*255);
                red[i] = (int) (Math.random()*255);
                blue[i] = (int) (Math.random()*255);
            }
            started =  true;
        }
        for (int i = 0; i < N ; i++){
            paint.setColor(Color.rgb(red[i], green[i], blue[i]));
            canvas.drawCircle(x[i], y[i], r[i], paint);
        }
        for (int i = 0; i < N; i++){
            x[i] += vx[i];
            y[i] += vy[i];
            if (x[i] < 0 || x[i] > canvas.getWidth() - r[i]){
                vx[i] = -vx[i];
            }
            if (y[i] < 0 || y[i] > canvas.getHeight() - r[i]){
                vy[i] = -vy[i];
            }
        }
        invalidate();

    }
    public mydraw(Context context) {
        super(context);
    }
}
