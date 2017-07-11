package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtils;

public class Practice11PieChartView extends View {

    private Paint mPaint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        mPaint.setColor(Color.RED);
        canvas.drawArc(new RectF(200, 50, 1000, 850), -180, 130, true, mPaint);
        mPaint.setColor(Color.rgb(255, 191, 67));
        canvas.drawArc(new RectF(260, 100, 1050, 850), -50, 50, true, mPaint);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(DensityUtils.dip2px(getContext(), 10));
        mPaint.setStrokeWidth(5);
        canvas.drawText("Lollipop", 10, 72, mPaint);
        canvas.drawLine(180, 70, 360, 70, mPaint);
        canvas.drawLine(360, 70, 380, 115, mPaint);
    }
}
