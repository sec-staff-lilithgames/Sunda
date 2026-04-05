package com.bytedance.adsdk.jd.qk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    private float f17438jd;
    private float jpo;

    public wqx(float f10, float f11) {
        this.jpo = f10;
        this.f17438jd = f11;
    }

    public float jd() {
        return this.f17438jd;
    }

    public float jpo() {
        return this.jpo;
    }

    public String toString() {
        return jpo() + "x" + jd();
    }

    public boolean jd(float f10, float f11) {
        return this.jpo == f10 && this.f17438jd == f11;
    }

    public void jpo(float f10, float f11) {
        this.jpo = f10;
        this.f17438jd = f11;
    }

    public wqx() {
        this(1.0f, 1.0f);
    }
}
