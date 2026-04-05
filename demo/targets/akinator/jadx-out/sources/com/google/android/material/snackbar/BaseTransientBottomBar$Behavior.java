package com.google.android.material.snackbar;

import ah.b;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: m, reason: collision with root package name */
    public final b f29389m = new b(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean canSwipeDismissView(View view) {
        return this.f29389m.canSwipeDismissView(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f29389m.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
