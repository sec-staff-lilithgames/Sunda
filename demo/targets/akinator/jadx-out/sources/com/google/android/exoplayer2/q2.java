package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q2 implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final String f27932l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27933m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: n, reason: collision with root package name */
    public static final String f27934n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: o, reason: collision with root package name */
    public static final String f27935o = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: p, reason: collision with root package name */
    public static final String f27936p = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: q, reason: collision with root package name */
    public static final String f27937q = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);

    /* renamed from: r, reason: collision with root package name */
    public static final String f27938r = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);

    /* renamed from: b, reason: collision with root package name */
    public final Object f27939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27940c;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f27941e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f27942f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27943g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27944h;

    /* renamed from: i, reason: collision with root package name */
    public final long f27945i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27946j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27947k;

    @Deprecated
    public q2(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this(obj, i10, u1.f28104i, obj2, i11, j10, j11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2.class == obj.getClass()) {
            q2 q2Var = (q2) obj;
            if (this.f27940c == q2Var.f27940c && this.f27943g == q2Var.f27943g && this.f27944h == q2Var.f27944h && this.f27945i == q2Var.f27945i && this.f27946j == q2Var.f27946j && this.f27947k == q2Var.f27947k && mh.h1.equal(this.f27939b, q2Var.f27939b) && mh.h1.equal(this.f27942f, q2Var.f27942f) && mh.h1.equal(this.f27941e, q2Var.f27941e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f27939b, Integer.valueOf(this.f27940c), this.f27941e, this.f27942f, Integer.valueOf(this.f27943g), Long.valueOf(this.f27944h), Long.valueOf(this.f27945i), Integer.valueOf(this.f27946j), Integer.valueOf(this.f27947k));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        return toBundle(true, true);
    }

    public q2(Object obj, int i10, u1 u1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f27939b = obj;
        this.f27940c = i10;
        this.f27941e = u1Var;
        this.f27942f = obj2;
        this.f27943g = i11;
        this.f27944h = j10;
        this.f27945i = j11;
        this.f27946j = i12;
        this.f27947k = i13;
    }

    public Bundle toBundle(boolean z10, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putInt(f27932l, z11 ? this.f27940c : 0);
        u1 u1Var = this.f27941e;
        if (u1Var != null && z10) {
            bundle.putBundle(f27933m, u1Var.toBundle());
        }
        bundle.putInt(f27934n, z11 ? this.f27943g : 0);
        bundle.putLong(f27935o, z10 ? this.f27944h : 0L);
        bundle.putLong(f27936p, z10 ? this.f27945i : 0L);
        bundle.putInt(f27937q, z10 ? this.f27946j : -1);
        bundle.putInt(f27938r, z10 ? this.f27947k : -1);
        return bundle;
    }
}
