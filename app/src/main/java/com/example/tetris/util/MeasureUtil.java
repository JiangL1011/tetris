package com.example.tetris.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class MeasureUtil {
    /**
     * dp转为px
     *
     * @param context  上下文
     * @param dipValue dp值
     */
    public static int dip2px(Context context, float dipValue) {
        Resources r = context.getResources();
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dipValue, r.getDisplayMetrics());
    }
}
