package x7;

import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f91754a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f91755b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f91756c;

    public a() {
        this.f91754a = new PointF();
        this.f91755b = new PointF();
        this.f91756c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f91754a;
    }

    public PointF getControlPoint2() {
        return this.f91755b;
    }

    public PointF getVertex() {
        return this.f91756c;
    }

    public void setControlPoint1(float f10, float f11) {
        this.f91754a.set(f10, f11);
    }

    public void setControlPoint2(float f10, float f11) {
        this.f91755b.set(f10, f11);
    }

    public void setFrom(a aVar) {
        PointF pointF = aVar.f91756c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = aVar.f91754a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f91755b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f10, float f11) {
        this.f91756c.set(f10, f11);
    }

    public String toString() {
        PointF pointF = this.f91756c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f91754a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f91755b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f91754a = pointF;
        this.f91755b = pointF2;
        this.f91756c = pointF3;
    }
}
