package com.example.xyzreader.ui;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by shailshah on 11/11/17.
 */

public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior {

    private static final String TAG = "ScrollAwareFABBehavior";

    public ScrollAwareFABBehavior(Context context, AttributeSet attrs) {
        super();
        Log.e(TAG,"ScrollAwareFABBehavior");
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout,
                               FloatingActionButton child, View target, int dxConsumed,
                               int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        // TODO Auto-generated method stub
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed,
                dxUnconsumed, dyUnconsumed);
        Log.e(TAG,"onNestedScroll called");
        if (dyConsumed > 0 && child.getVisibility() == View.VISIBLE) {
            Log.e(TAG,"child.hide()");
            child.hide();
        } else if (dyConsumed < 0 && child.getVisibility() != View.VISIBLE) {
            Log.e(TAG,"child.show()");
            child.show();
        }
    }
    }

