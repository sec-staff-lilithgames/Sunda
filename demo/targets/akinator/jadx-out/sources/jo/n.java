package jo;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d {

    /* renamed from: e, reason: collision with root package name */
    public final m f69892e;

    /* renamed from: f, reason: collision with root package name */
    public final float f69893f;

    /* renamed from: g, reason: collision with root package name */
    public final GestureDetector f69894g;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f69890b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final PointF f69891c = new PointF();

    /* renamed from: h, reason: collision with root package name */
    public volatile float f69895h = 3.1415927f;

    public n(Context context, m mVar, float f10) {
        this.f69892e = mVar;
        this.f69893f = f10;
        this.f69894g = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f69890b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // jo.d
    public void onOrientationChange(float[] fArr, float f10) {
        this.f69895h = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f69890b.x) / this.f69893f;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f69890b;
        float f12 = (y10 - pointF.y) / this.f69893f;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f69895h;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f69891c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f69892e.onScrollChange(this.f69891c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f69892e.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f69894g.onTouchEvent(motionEvent);
    }
}
