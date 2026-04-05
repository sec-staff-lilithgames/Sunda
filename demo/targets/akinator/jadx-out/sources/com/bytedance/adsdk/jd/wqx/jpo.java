package com.bytedance.adsdk.jd.wqx;

import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final PointF f17514jd;
    private final PointF jpo;
    private final PointF wqx;

    public jpo() {
        this.jpo = new PointF();
        this.f17514jd = new PointF();
        this.wqx = new PointF();
    }

    public void jd(float f10, float f11) {
        this.f17514jd.set(f10, f11);
    }

    public void jpo(float f10, float f11) {
        this.jpo.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.wqx.x), Float.valueOf(this.wqx.y), Float.valueOf(this.jpo.x), Float.valueOf(this.jpo.y), Float.valueOf(this.f17514jd.x), Float.valueOf(this.f17514jd.y));
    }

    public void wqx(float f10, float f11) {
        this.wqx.set(f10, f11);
    }

    public PointF jd() {
        return this.f17514jd;
    }

    public PointF jpo() {
        return this.jpo;
    }

    public PointF wqx() {
        return this.wqx;
    }

    public jpo(PointF pointF, PointF pointF2, PointF pointF3) {
        this.jpo = pointF;
        this.f17514jd = pointF2;
        this.wqx = pointF3;
    }
}
