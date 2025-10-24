package com.baycpp.wavegenerator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by baycpp on 2025/10/24.
 */

public class Wave extends View {
    protected Path path;
    protected Paint paint;
    protected int color, width, height;
    protected float amplitude, wavelength, y, period, time, velocity;
    protected boolean position;

    public Wave(Context context) {
        this(context, null, 0);
    }
    public Wave(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public Wave(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.Wave);

        color = ta.getColor(R.styleable.Wave_wColor, Color.BLUE);
        amplitude = ta.getFloat(R.styleable.Wave_wAmplitude, 1f) * 100;
        wavelength = ta.getFloat(R.styleable.Wave_wLength, 8f) * 100;
        velocity = ta.getFloat(R.styleable.Wave_wVelocity, 0.5f) * 100;
        position = ta.getBoolean(R.styleable.Wave_mRight, false);

        path = new Path();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        time = 0f;
        period = wavelength / velocity;

        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(6f);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        width = getWidth(); // x
        height = getHeight(); // y

        path.reset();
        path.moveTo(0, height / 2f);

        for (int x = 0; x < width; x++) {
            if (position)
                y = (float) (height / 2f + amplitude * Math.sin((Math.PI * 2 / wavelength * x) + (Math.PI * 2 / period * time)));
            else
                y = (float) (height / 2f + amplitude * Math.sin((Math.PI * 2 / wavelength * x) - (Math.PI * 2 / period * time)));
            path.lineTo(x, y);
        }

        path.lineTo(width, height);
        path.lineTo(0, height);
        path.close();

        canvas.drawPath(path, paint);

        time += 0.2f;
        invalidate();
    }
}
