package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f46913a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46914b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46915c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46917e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46919g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46920h;

    public q(String sessionId, long j10, long j11, int i10, int i11, int i12, int i13, int i14) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        this.f46913a = sessionId;
        this.f46914b = j10;
        this.f46915c = j11;
        this.f46916d = i10;
        this.f46917e = i11;
        this.f46918f = i12;
        this.f46919g = i13;
        this.f46920h = i14;
    }

    public final String a() {
        return this.f46913a;
    }

    public final long b() {
        return this.f46914b;
    }

    public final long c() {
        return this.f46915c;
    }

    public final int d() {
        return this.f46916d;
    }

    public final int e() {
        return this.f46917e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return e0.areEqual(this.f46913a, qVar.f46913a) && this.f46914b == qVar.f46914b && this.f46915c == qVar.f46915c && this.f46916d == qVar.f46916d && this.f46917e == qVar.f46917e && this.f46918f == qVar.f46918f && this.f46919g == qVar.f46919g && this.f46920h == qVar.f46920h;
    }

    public final int f() {
        return this.f46918f;
    }

    public final int g() {
        return this.f46919g;
    }

    public final int h() {
        return this.f46920h;
    }

    public int hashCode() {
        return Integer.hashCode(this.f46920h) + e3.g.d(this.f46919g, e3.g.d(this.f46918f, e3.g.d(this.f46917e, e3.g.d(this.f46916d, o2.d(o2.d(this.f46913a.hashCode() * 31, 31, this.f46914b), 31, this.f46915c), 31), 31), 31), 31);
    }

    public final int i() {
        return this.f46916d;
    }

    public final int j() {
        return this.f46919g;
    }

    public final long k() {
        return this.f46915c;
    }

    public final int l() {
        return this.f46917e;
    }

    public final int m() {
        return this.f46918f;
    }

    public final int n() {
        return this.f46920h;
    }

    public final String o() {
        return this.f46913a;
    }

    public final long p() {
        return this.f46914b;
    }

    public final boolean q() {
        return this.f46913a.length() > 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IlrdSignal(sessionId=");
        sb2.append(this.f46913a);
        sb2.append(", sessionStartTs=");
        sb2.append(this.f46914b);
        sb2.append(", lastImpressionTs=");
        sb2.append(this.f46915c);
        sb2.append(", bannerImpressionCount=");
        sb2.append(this.f46916d);
        sb2.append(", mrecImpressionCount=");
        sb2.append(this.f46917e);
        sb2.append(", nativeImpressionCount=");
        sb2.append(this.f46918f);
        sb2.append(", interstitialImpressionCount=");
        sb2.append(this.f46919g);
        sb2.append(", rewardedImpressionCount=");
        return e3.g.m(sb2, this.f46920h, ')');
    }

    public final q a(String sessionId, long j10, long j11, int i10, int i11, int i12, int i13, int i14) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        return new q(sessionId, j10, j11, i10, i11, i12, i13, i14);
    }

    public static /* synthetic */ q a(q qVar, String str, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = qVar.f46913a;
        }
        if ((i15 & 2) != 0) {
            j10 = qVar.f46914b;
        }
        if ((i15 & 4) != 0) {
            j11 = qVar.f46915c;
        }
        if ((i15 & 8) != 0) {
            i10 = qVar.f46916d;
        }
        if ((i15 & 16) != 0) {
            i11 = qVar.f46917e;
        }
        if ((i15 & 32) != 0) {
            i12 = qVar.f46918f;
        }
        if ((i15 & 64) != 0) {
            i13 = qVar.f46919g;
        }
        if ((i15 & 128) != 0) {
            i14 = qVar.f46920h;
        }
        int i16 = i14;
        int i17 = i12;
        int i18 = i10;
        long j12 = j11;
        return qVar.a(str, j10, j12, i18, i11, i17, i13, i16);
    }
}
