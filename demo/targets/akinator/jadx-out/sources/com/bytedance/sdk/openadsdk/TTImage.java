package com.bytedance.sdk.openadsdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTImage {

    /* renamed from: cm, reason: collision with root package name */
    private double f19147cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f19148jd;
    private final int jpo;
    private final String wqx;

    public TTImage(int i10, int i11, String str, double d10) {
        this.jpo = i10;
        this.f19148jd = i11;
        this.wqx = str;
        this.f19147cm = d10;
    }

    public double getDuration() {
        return this.f19147cm;
    }

    public int getHeight() {
        return this.jpo;
    }

    public String getImageUrl() {
        return this.wqx;
    }

    public int getWidth() {
        return this.f19148jd;
    }

    public boolean isValid() {
        String str;
        return this.jpo > 0 && this.f19148jd > 0 && (str = this.wqx) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
