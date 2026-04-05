package com.bytedance.adsdk.jd.wqx;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final float f17524cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17525jd;
    private final String jpo;
    private Typeface my;
    private final String wqx;

    public wqx(String str, String str2, String str3, float f10) {
        this.jpo = str;
        this.f17525jd = str2;
        this.wqx = str3;
        this.f17524cm = f10;
    }

    public Typeface cm() {
        return this.my;
    }

    public String jd() {
        return this.f17525jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public String wqx() {
        return this.wqx;
    }

    public void jpo(Typeface typeface) {
        this.my = typeface;
    }
}
