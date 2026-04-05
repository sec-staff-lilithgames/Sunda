package com.google.android.exoplayer2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i3 extends x2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f27529g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27530h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: i, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27531i = new com.bytedance.adsdk.ugeno.zz.cm.a(22);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27532e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27533f;

    public i3() {
        this.f27532e = false;
        this.f27533f = false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f27533f == i3Var.f27533f && this.f27532e == i3Var.f27532e;
    }

    public int hashCode() {
        return mh.h1.hashCode(Boolean.valueOf(this.f27532e), Boolean.valueOf(this.f27533f));
    }

    @Override // com.google.android.exoplayer2.x2
    public boolean isRated() {
        return this.f27532e;
    }

    public boolean isThumbsUp() {
        return this.f27533f;
    }

    @Override // com.google.android.exoplayer2.x2, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(x2.f28710b, 3);
        bundle.putBoolean(f27529g, this.f27532e);
        bundle.putBoolean(f27530h, this.f27533f);
        return bundle;
    }

    public i3(boolean z10) {
        this.f27532e = true;
        this.f27533f = z10;
    }
}
