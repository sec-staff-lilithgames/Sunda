package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dm {

    /* renamed from: jd, reason: collision with root package name */
    private long f21505jd;
    public long jpo;

    private dm(boolean z10) {
        if (z10) {
            my();
        }
    }

    public static dm jd() {
        return new dm(true);
    }

    public static dm wqx() {
        return new dm(false);
    }

    public long cm() {
        return SystemClock.elapsedRealtime() - this.f21505jd;
    }

    public boolean jj() {
        return this.f21505jd > 0;
    }

    public long jpo() {
        return this.f21505jd;
    }

    public void my() {
        this.jpo = System.currentTimeMillis();
        this.f21505jd = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return String.valueOf(this.jpo);
    }

    public long jpo(dm dmVar) {
        return Math.abs(dmVar.f21505jd - this.f21505jd);
    }
}
