package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtils;

public class Practice10HistogramView extends View {

    private Paint mPaint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawColor(Color.rgb(222, 222, 222));
        Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(100, 800);
        path.lineTo(1200, 800);
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, mPaint);
        mPaint.setTextSize(DensityUtils.dip2px(getContext(), 14));
        canvas.drawText("Froyo", 120, 850, mPaint);
        canvas.drawText("GB", 310, 850, mPaint);
        canvas.drawText("ICS", 500, 850, mPaint);
        canvas.drawText("JB", 690, 850, mPaint);
        mPaint.setTextSize(DensityUtils.dip2px(getContext(), 18));
        canvas.drawText("直方图", 450, 950, mPaint);
        Path path2 = new Path();
//        path2.moveTo(115, 802);
//        path2.lineTo(135, 802);
        path2.addRect(290, 760, 410, 800, Path.Direction.CW);
        path2.addRect(490, 760, 600, 800, Path.Direction.CW);
        path2.addRect(680, 600, 780, 800, Path.Direction.CW);
        mPaint.setColor(Color.rgb(108, 184, 63));
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path2, mPaint);
    }
}
