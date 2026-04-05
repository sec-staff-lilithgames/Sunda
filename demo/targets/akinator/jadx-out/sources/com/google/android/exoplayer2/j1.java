package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j1 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final j1 f27541h = new i1().build();

    /* renamed from: i, reason: collision with root package name */
    public static final String f27542i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f27543j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f27544k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27545l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27546m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: n, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27547n = new com.bytedance.adsdk.ugeno.zz.cm.a(11);

    /* renamed from: b, reason: collision with root package name */
    public final long f27548b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27549c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27550e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27551f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27552g;

    public j1(i1 i1Var) {
        this.f27548b = i1Var.f27521a;
        this.f27549c = i1Var.f27522b;
        this.f27550e = i1Var.f27523c;
        this.f27551f = i1Var.f27524d;
        this.f27552g = i1Var.f27525e;
    }

    public i1 buildUpon() {
        i1 i1Var = new i1();
        i1Var.f27521a = this.f27548b;
        i1Var.f27522b = this.f27549c;
        i1Var.f27523c = this.f27550e;
        i1Var.f27524d = this.f27551f;
        i1Var.f27525e = this.f27552g;
        return i1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f27548b == j1Var.f27548b && this.f27549c == j1Var.f27549c && this.f27550e == j1Var.f27550e && this.f27551f == j1Var.f27551f && this.f27552g == j1Var.f27552g;
    }

    public int hashCode() {
        long j10 = this.f27548b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f27549c;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f27550e ? 1 : 0)) * 31) + (this.f27551f ? 1 : 0)) * 31) + (this.f27552g ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        j1 j1Var = f27541h;
        long j10 = j1Var.f27548b;
        long j11 = this.f27548b;
        if (j11 != j10) {
            bundle.putLong(f27542i, j11);
        }
        long j12 = j1Var.f27549c;
        long j13 = this.f27549c;
        if (j13 != j12) {
            bundle.putLong(f27543j, j13);
        }
        boolean z10 = j1Var.f27550e;
        boolean z11 = this.f27550e;
        if (z11 != z10) {
            bundle.putBoolean(f27544k, z11);
        }
        boolean z12 = j1Var.f27551f;
        boolean z13 = this.f27551f;
        if (z13 != z12) {
            bundle.putBoolean(f27545l, z13);
        }
        boolean z14 = j1Var.f27552g;
        boolean z15 = this.f27552g;
        if (z15 != z14) {
            bundle.putBoolean(f27546m, z15);
        }
        return bundle;
    }
}
