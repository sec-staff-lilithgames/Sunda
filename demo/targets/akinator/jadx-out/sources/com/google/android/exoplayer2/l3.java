package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l3 implements i {

    /* renamed from: c, reason: collision with root package name */
    public Object f27648c;

    /* renamed from: f, reason: collision with root package name */
    public Object f27650f;

    /* renamed from: g, reason: collision with root package name */
    public long f27651g;

    /* renamed from: h, reason: collision with root package name */
    public long f27652h;

    /* renamed from: i, reason: collision with root package name */
    public long f27653i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27654j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27655k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27656l;

    /* renamed from: m, reason: collision with root package name */
    public n1 f27657m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27658n;

    /* renamed from: o, reason: collision with root package name */
    public long f27659o;

    /* renamed from: p, reason: collision with root package name */
    public long f27660p;

    /* renamed from: q, reason: collision with root package name */
    public int f27661q;

    /* renamed from: r, reason: collision with root package name */
    public int f27662r;

    /* renamed from: s, reason: collision with root package name */
    public long f27663s;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f27640t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f27641u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final u1 f27642v = new h1().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();

    /* renamed from: w, reason: collision with root package name */
    public static final String f27643w = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: x, reason: collision with root package name */
    public static final String f27644x = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: y, reason: collision with root package name */
    public static final String f27645y = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: z, reason: collision with root package name */
    public static final String f27646z = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);
    public static final String A = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);
    public static final String B = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);
    public static final String C = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(7);
    public static final String D = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(8);
    public static final String E = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(9);
    public static final String F = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(10);
    public static final String G = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(11);
    public static final String H = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(12);
    public static final String I = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(13);

    /* renamed from: b, reason: collision with root package name */
    public Object f27647b = f27640t;

    /* renamed from: e, reason: collision with root package name */
    public u1 f27649e = f27642v;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3.class.equals(obj.getClass())) {
            l3 l3Var = (l3) obj;
            if (com.google.android.exoplayer2.util.n1.areEqual(this.f27647b, l3Var.f27647b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27649e, l3Var.f27649e) && com.google.android.exoplayer2.util.n1.areEqual(this.f27650f, l3Var.f27650f) && com.google.android.exoplayer2.util.n1.areEqual(this.f27657m, l3Var.f27657m) && this.f27651g == l3Var.f27651g && this.f27652h == l3Var.f27652h && this.f27653i == l3Var.f27653i && this.f27654j == l3Var.f27654j && this.f27655k == l3Var.f27655k && this.f27658n == l3Var.f27658n && this.f27659o == l3Var.f27659o && this.f27660p == l3Var.f27660p && this.f27661q == l3Var.f27661q && this.f27662r == l3Var.f27662r && this.f27663s == l3Var.f27663s) {
                return true;
            }
        }
        return false;
    }

    public long getCurrentUnixTimeMs() {
        return com.google.android.exoplayer2.util.n1.getNowUnixTimeMs(this.f27653i);
    }

    public long getDefaultPositionMs() {
        return com.google.android.exoplayer2.util.n1.usToMs(this.f27659o);
    }

    public long getDefaultPositionUs() {
        return this.f27659o;
    }

    public long getDurationMs() {
        return com.google.android.exoplayer2.util.n1.usToMs(this.f27660p);
    }

    public long getDurationUs() {
        return this.f27660p;
    }

    public long getPositionInFirstPeriodMs() {
        return com.google.android.exoplayer2.util.n1.usToMs(this.f27663s);
    }

    public long getPositionInFirstPeriodUs() {
        return this.f27663s;
    }

    public int hashCode() {
        int iHashCode = (this.f27649e.hashCode() + ((this.f27647b.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f27650f;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        n1 n1Var = this.f27657m;
        int iHashCode3 = (iHashCode2 + (n1Var != null ? n1Var.hashCode() : 0)) * 31;
        long j10 = this.f27651g;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f27652h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f27653i;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f27654j ? 1 : 0)) * 31) + (this.f27655k ? 1 : 0)) * 31) + (this.f27658n ? 1 : 0)) * 31;
        long j13 = this.f27659o;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f27660p;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f27661q) * 31) + this.f27662r) * 31;
        long j15 = this.f27663s;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public boolean isLive() {
        com.google.android.exoplayer2.util.a.checkState(this.f27656l == (this.f27657m != null));
        return this.f27657m != null;
    }

    public l3 set(Object obj, u1 u1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, n1 n1Var, long j13, long j14, int i10, int i11, long j15) {
        o1 o1Var;
        this.f27647b = obj;
        this.f27649e = u1Var != null ? u1Var : f27642v;
        this.f27648c = (u1Var == null || (o1Var = u1Var.f28113c) == null) ? null : o1Var.f27867j;
        this.f27650f = obj2;
        this.f27651g = j10;
        this.f27652h = j11;
        this.f27653i = j12;
        this.f27654j = z10;
        this.f27655k = z11;
        this.f27656l = n1Var != null;
        this.f27657m = n1Var;
        this.f27659o = j13;
        this.f27660p = j14;
        this.f27661q = i10;
        this.f27662r = i11;
        this.f27663s = j15;
        this.f27658n = false;
        return this;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!u1.f28104i.equals(this.f27649e)) {
            bundle.putBundle(f27643w, this.f27649e.toBundle());
        }
        long j10 = this.f27651g;
        if (j10 != C.TIME_UNSET) {
            bundle.putLong(f27644x, j10);
        }
        long j11 = this.f27652h;
        if (j11 != C.TIME_UNSET) {
            bundle.putLong(f27645y, j11);
        }
        long j12 = this.f27653i;
        if (j12 != C.TIME_UNSET) {
            bundle.putLong(f27646z, j12);
        }
        boolean z10 = this.f27654j;
        if (z10) {
            bundle.putBoolean(A, z10);
        }
        boolean z11 = this.f27655k;
        if (z11) {
            bundle.putBoolean(B, z11);
        }
        n1 n1Var = this.f27657m;
        if (n1Var != null) {
            bundle.putBundle(C, n1Var.toBundle());
        }
        boolean z12 = this.f27658n;
        if (z12) {
            bundle.putBoolean(D, z12);
        }
        long j13 = this.f27659o;
        if (j13 != 0) {
            bundle.putLong(E, j13);
        }
        long j14 = this.f27660p;
        if (j14 != C.TIME_UNSET) {
            bundle.putLong(F, j14);
        }
        int i10 = this.f27661q;
        if (i10 != 0) {
            bundle.putInt(G, i10);
        }
        int i11 = this.f27662r;
        if (i11 != 0) {
            bundle.putInt(H, i11);
        }
        long j15 = this.f27663s;
        if (j15 != 0) {
            bundle.putLong(I, j15);
        }
        return bundle;
    }
}
