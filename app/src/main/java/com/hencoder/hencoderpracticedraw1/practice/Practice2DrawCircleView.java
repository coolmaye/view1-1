package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint paint1;
    private Paint paint2;
    private Path path;

    public Practice2DrawCircleView(Context context) {
        this(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint1 = new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setAntiAlias(true);

        paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3);

        path = new Path();

        path.addCircle(450, 310, 100, Path.Direction.CCW);
        path.addCircle(450, 310, 70, Path.Direction.CCW);
        path.setFillType(Path.FillType.EVEN_ODD);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(200, 100, 100, paint1);
        canvas.drawCircle(450, 100, 97, paint2);

            paint1.setColor(Color.BLUE);
            canvas.drawCircle(200, 310, 100, paint1);

            paint1.setColor(Color.BLACK);
            canvas.drawPath(path, paint1);

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

    }
}
