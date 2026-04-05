package com.bytedance.sdk.openadsdk.api.nativeAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGImageItem {

    /* renamed from: cm, reason: collision with root package name */
    private float f19468cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f19469jd;
    private final int jpo;
    private final String wqx;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.jpo = i10;
        this.f19469jd = i11;
        this.wqx = str;
        this.f19468cm = f10;
    }

    public float getDuration() {
        return this.f19468cm;
    }

    public int getHeight() {
        return this.jpo;
    }

    public String getImageUrl() {
        return this.wqx;
    }

    public int getWidth() {
        return this.f19469jd;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
