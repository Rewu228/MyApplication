package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Артур on 06.11.2017.
 */

public class Lears extends View {
    Balls balls = new Balls();
    public Lears(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
