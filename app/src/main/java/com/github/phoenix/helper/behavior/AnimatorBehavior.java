package com.github.phoenix.helper.behavior;


import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.View;

public class AnimatorBehavior {

    public static final LinearOutSlowInInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();

    /**
     * 显示view
     *
     * @param view
     * @param viewPropertyAnimatorListener
     */
    public static void scaleShow(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        view.setVisibility(View.VISIBLE);
        ViewCompat.animate(view)
                .scaleX(1.0f)
                .scaleY(1.0f)
                .alpha(1.0f)
                .setDuration(800)
                .setListener(viewPropertyAnimatorListener)
                .setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR)
                .start();
    }

    /**
     * 隐藏view
     *
     * @param view
     * @param viewPropertyAnimatorListener
     */
    public static void scaleHide(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        ViewCompat.animate(view)
                .scaleX(0.0f)
                .scaleY(0.0f)
                .alpha(0.0f)
                .setDuration(800)
                .setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR)
                .setListener(viewPropertyAnimatorListener)
                .start();
    }
}
