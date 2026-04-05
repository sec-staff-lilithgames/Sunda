package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.K5;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    public static final K5 Companion = new K5();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f31567a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f31568b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31569c;

    /* renamed from: d, reason: collision with root package name */
    public float f31570d;

    /* renamed from: e, reason: collision with root package name */
    public float f31571e;

    public InMobiMovableRelativeLayout(Context context) {
        super(context);
        this.f31567a = new WeakReference(null);
        this.f31569c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f31567a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f31568b == null) {
            this.f31568b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        ViewGroup viewGroup;
        e0.checkNotNullParameter(ev2, "ev");
        if (this.f31569c) {
            float rawX = ev2.getRawX();
            float rawY = ev2.getRawY();
            int action = ev2.getAction();
            if (action == 0) {
                this.f31570d = rawX;
                this.f31571e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f31567a.get()) != null) {
                float f10 = rawX - this.f31570d;
                int top = (int) (getTop() + (rawY - this.f31571e));
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min((int) (getLeft() + f10), width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f31570d = rawX;
                this.f31571e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev2);
    }

    public final void resetPosition() {
        setLayoutParams(this.f31568b);
    }

    public final void setIsMovable(boolean z10) {
        this.f31569c = z10;
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31567a = new WeakReference(null);
        this.f31569c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31567a = new WeakReference(null);
        this.f31569c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
