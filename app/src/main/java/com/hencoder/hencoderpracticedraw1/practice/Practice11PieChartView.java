package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint;
    private Paint paint1;
    private float stopX;
    private float stopY;

    public Practice11PieChartView(Context context) {
        this(context, null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);

        paint1 = new Paint();
        paint1.setColor(Color.WHITE);
        paint.setTextSize(20);
        paint1.setStrokeWidth(10);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawArc(100,100,400,400,-170,130,true,paint);
        Path path = new Path();
        canvas.drawArc(100, 100, 400, 400, -170, 65, true, paint1);

        stopX = (float) ((150 + 40) * Math.cos(50 * Math.PI / 180));
        stopY = (float) ((150 + 40) * Math.sin(50 * Math.PI / 180));

        canvas.drawLine(250,250,stopX,stopY,paint1);
        canvas.drawPath(path, paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
