package io.odeeo.internal.s0;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import io.odeeo.internal.s0.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f66343c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66344d;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f66345e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f66341a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f66342b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    public volatile float f66346f = 3.1415927f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public j(Context context, a aVar, float f10) {
        this.f66343c = aVar;
        this.f66344d = f10;
        this.f66345e = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f66341a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // io.odeeo.internal.s0.d.a
    public void onOrientationChange(float[] fArr, float f10) {
        this.f66346f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f66341a.x) / this.f66344d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f66341a;
        float f12 = (y10 - pointF.y) / this.f66344d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f66346f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f66342b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f66343c.onScrollChange(this.f66342b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f66343c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f66345e.onTouchEvent(motionEvent);
    }
}
