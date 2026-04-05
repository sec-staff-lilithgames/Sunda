package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 extends x2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f27334g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27335h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: i, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27336i = new com.bytedance.adsdk.ugeno.zz.cm.a(8);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27337e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27338f;

    public b1() {
        this.f27337e = false;
        this.f27338f = false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f27338f == b1Var.f27338f && this.f27337e == b1Var.f27337e;
    }

    public int hashCode() {
        return mh.h1.hashCode(Boolean.valueOf(this.f27337e), Boolean.valueOf(this.f27338f));
    }

    public boolean isHeart() {
        return this.f27338f;
    }

    @Override // com.google.android.exoplayer2.x2
    public boolean isRated() {
        return this.f27337e;
    }

    @Override // com.google.android.exoplayer2.x2, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(x2.f28710b, 0);
        bundle.putBoolean(f27334g, this.f27337e);
        bundle.putBoolean(f27335h, this.f27338f);
        return bundle;
    }

    public b1(boolean z10) {
        this.f27337e = true;
        this.f27338f = z10;
    }
}
