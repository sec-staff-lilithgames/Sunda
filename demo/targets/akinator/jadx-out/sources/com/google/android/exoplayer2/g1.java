package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g1 implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final String f27496e = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27497f = new com.bytedance.adsdk.ugeno.zz.cm.a(10);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f27498b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27499c;

    public g1(f1 f1Var) {
        this.f27498b = f1Var.f27463a;
        this.f27499c = f1Var.f27464b;
    }

    public f1 buildUpon() {
        return new f1(this.f27498b).setAdsId(this.f27499c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f27498b.equals(g1Var.f27498b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27499c, g1Var.f27499c);
    }

    public int hashCode() {
        int iHashCode = this.f27498b.hashCode() * 31;
        Object obj = this.f27499c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f27496e, this.f27498b);
        return bundle;
    }
}
