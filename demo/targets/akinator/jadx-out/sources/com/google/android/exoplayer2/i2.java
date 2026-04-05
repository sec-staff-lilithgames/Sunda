package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i2 extends x2 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f27526f = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: g, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27527g = new com.bytedance.adsdk.ugeno.zz.cm.a(19);

    /* renamed from: e, reason: collision with root package name */
    public final float f27528e;

    public i2() {
        this.f27528e = -1.0f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i2) {
            return this.f27528e == ((i2) obj).f27528e;
        }
        return false;
    }

    public float getPercent() {
        return this.f27528e;
    }

    public int hashCode() {
        return mh.h1.hashCode(Float.valueOf(this.f27528e));
    }

    @Override // com.google.android.exoplayer2.x2
    public boolean isRated() {
        return this.f27528e != -1.0f;
    }

    @Override // com.google.android.exoplayer2.x2, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(x2.f28710b, 1);
        bundle.putFloat(f27526f, this.f27528e);
        return bundle;
    }

    public i2(float f10) {
        com.google.android.exoplayer2.util.a.checkArgument(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f27528e = f10;
    }
}
