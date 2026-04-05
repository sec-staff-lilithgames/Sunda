package com.bytedance.sdk.openadsdk.component.xyk;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private long f20097cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f20098jd;
    private float jpo;
    private boolean wqx;

    public float jd() {
        return this.jpo;
    }

    public void jpo(boolean z10) {
        this.wqx = z10;
    }

    public long wqx() {
        return this.f20098jd;
    }

    public void jd(long j10) {
        this.f20098jd = j10;
    }

    public long jpo() {
        return this.f20097cm;
    }

    public void jpo(long j10) {
        this.f20097cm = j10;
    }

    public void jpo(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append(C3191e4.i.f36531e);
        this.jpo = f10;
    }
}
