package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f3 extends x2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f27487g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27488h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: i, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27489i = new com.bytedance.adsdk.ugeno.zz.cm.a(21);

    /* renamed from: e, reason: collision with root package name */
    public final int f27490e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27491f;

    public f3(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        this.f27490e = i10;
        this.f27491f = -1.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return this.f27490e == f3Var.f27490e && this.f27491f == f3Var.f27491f;
    }

    public int getMaxStars() {
        return this.f27490e;
    }

    public float getStarRating() {
        return this.f27491f;
    }

    public int hashCode() {
        return mh.h1.hashCode(Integer.valueOf(this.f27490e), Float.valueOf(this.f27491f));
    }

    @Override // com.google.android.exoplayer2.x2
    public boolean isRated() {
        return this.f27491f != -1.0f;
    }

    @Override // com.google.android.exoplayer2.x2, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(x2.f28710b, 2);
        bundle.putInt(f27487g, this.f27490e);
        bundle.putFloat(f27488h, this.f27491f);
        return bundle;
    }

    public f3(int i10, float f10) {
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        com.google.android.exoplayer2.util.a.checkArgument(z10, "starRating is out of range [0, maxStars]");
        this.f27490e = i10;
        this.f27491f = f10;
    }
}
