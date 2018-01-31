package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint;
    private Paint paint2;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //框子颜色的画笔
        paint = new Paint();
        paint.setColor(Color.parseColor("#72B916"));

        paint2 = new Paint();
        paint2.setTextSize(20);
        paint2.setColor(Color.WHITE);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //首先画最外面的框子

        canvas.drawLine(100, 100, 100, 400, paint2);
        canvas.drawLine(100, 400, 600, 400, paint2);

        //记录每一个柱子的起始位置
        int raw = 110;
        String[] item = {"Froy", "GB", "IOS", "JB", "KitKat", "L", "M"};
        int[] number = {400, 380, 380, 320, 300, 280, 350};

        for (int x = 0; x < 7; x++) {
            canvas.drawText(item[x], raw, 420, paint2);
            canvas.drawRect(raw-10,number[x],raw+50,400,paint);
            raw = raw + 70;
        }

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
