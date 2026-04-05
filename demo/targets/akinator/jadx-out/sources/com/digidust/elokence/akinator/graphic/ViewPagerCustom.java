package com.digidust.elokence.akinator.graphic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import da.s;
import o9.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ViewPagerCustom extends ViewPager {

    /* renamed from: b, reason: collision with root package name */
    public s f21753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21754c;

    public ViewPagerCustom(Context context) {
        super(context);
        this.f21754c = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s sVar;
        if (motionEvent.getAction() == 0 && (sVar = this.f21753b) != null) {
            ((w0) sVar).onInterceptTouchEvent();
        }
        return this.f21754c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21754c && super.onTouchEvent(motionEvent);
    }

    public void setOnInterceptTouchEventListener(s sVar) {
        this.f21753b = sVar;
    }

    public void setPagingEnabled(boolean z10) {
        this.f21754c = z10;
    }

    public ViewPagerCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21754c = true;
    }
}
