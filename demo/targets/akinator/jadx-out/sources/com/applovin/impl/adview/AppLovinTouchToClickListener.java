package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f13449a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13450b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13451c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f13452d;

    /* renamed from: e, reason: collision with root package name */
    private long f13453e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f13454f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13455g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f13456h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f13457i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, v4 v4Var, Context context, OnClickListener onClickListener) {
        this.f13449a = ((Long) kVar.a(v4.f15920f0)).longValue();
        this.f13450b = ((Integer) kVar.a(v4.f15928g0)).intValue();
        this.f13451c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.f15960k0)).intValue());
        this.f13452d = ClickRecognitionState.values()[((Integer) kVar.a(v4Var)).intValue()];
        this.f13456h = context;
        this.f13457i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f13457i.onClick(view, motionEvent);
        this.f13455g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f13455g && this.f13452d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f13455g && this.f13452d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f13452d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13453e;
                float fA = a(this.f13454f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f13455g) {
                    long j10 = this.f13449a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f13450b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f13452d != ClickRecognitionState.ACTION_DOWN) {
            this.f13453e = SystemClock.elapsedRealtime();
            this.f13454f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f13455g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private float a(float f10) {
        return f10 / this.f13456h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f13451c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f13456h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f13451c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
