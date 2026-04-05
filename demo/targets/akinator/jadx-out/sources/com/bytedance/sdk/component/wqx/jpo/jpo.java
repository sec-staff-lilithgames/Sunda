package com.bytedance.sdk.component.wqx.jpo;

import android.os.SystemClock;
import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    long f19013cm;

    /* renamed from: jd, reason: collision with root package name */
    long f19014jd;

    /* renamed from: jj, reason: collision with root package name */
    long f19015jj;
    long jpo = SystemClock.elapsedRealtime();
    long my;

    /* renamed from: qk, reason: collision with root package name */
    long f19016qk;
    long wqx;
    long xyk;

    public void au() {
        this.xyk = SystemClock.elapsedRealtime();
    }

    public long cm() {
        return this.jpo;
    }

    /* renamed from: if, reason: not valid java name */
    public long m422if() {
        return this.xyk;
    }

    public void jd() {
        this.f19013cm = SystemClock.elapsedRealtime();
    }

    public long jj() {
        return this.f19015jj;
    }

    public void jpo() {
        this.wqx = SystemClock.elapsedRealtime();
    }

    public void ju() {
        this.f19016qk = SystemClock.elapsedRealtime();
    }

    public void my() {
        this.f19015jj = SystemClock.elapsedRealtime();
    }

    public long oya() {
        return this.f19014jd;
    }

    public void prr() {
        this.f19014jd = SystemClock.elapsedRealtime();
    }

    public long qk() {
        return this.wqx;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestHttpTime{requestBuildTs=");
        sb2.append(this.jpo);
        sb2.append(", asyncCallExecTs=");
        sb2.append(this.f19014jd);
        sb2.append(", requestStartExecTs=");
        sb2.append(this.wqx);
        sb2.append(", requestConnectStartTs=");
        sb2.append(this.f19013cm);
        sb2.append(", requestConnectFinishTs=");
        sb2.append(this.my);
        sb2.append(", reqCallServerStartTs=");
        sb2.append(this.f19016qk);
        sb2.append(", reqCallServerFinishTs=");
        return g.n(sb2, this.xyk, AbstractJsonLexerKt.END_OBJ);
    }

    public void wqx() {
        this.my = SystemClock.elapsedRealtime();
    }

    public long xyk() {
        return this.f19013cm;
    }

    public long yd() {
        return this.f19016qk;
    }

    public long zz() {
        return this.my;
    }
}
