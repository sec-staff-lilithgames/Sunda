package com.bytedance.adsdk.jd.jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: jd, reason: collision with root package name */
    private int f17263jd;
    private float jpo;

    public void jpo(float f10) {
        float f11 = this.jpo + f10;
        this.jpo = f11;
        int i10 = this.f17263jd + 1;
        this.f17263jd = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.jpo = f11 / 2.0f;
            this.f17263jd = i10 / 2;
        }
    }
}
