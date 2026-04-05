package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final q1 f27924f = new p1().build();

    /* renamed from: g, reason: collision with root package name */
    public static final String f27925g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27926h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: i, reason: collision with root package name */
    public static final String f27927i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: j, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27928j = new com.bytedance.adsdk.ugeno.zz.cm.a(16);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f27929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27930c;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f27931e;

    public q1(p1 p1Var) {
        this.f27929b = p1Var.f27901a;
        this.f27930c = p1Var.f27902b;
        this.f27931e = p1Var.f27903c;
    }

    public p1 buildUpon() {
        p1 p1Var = new p1();
        p1Var.f27901a = this.f27929b;
        p1Var.f27902b = this.f27930c;
        p1Var.f27903c = this.f27931e;
        return p1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return com.google.android.exoplayer2.util.n1.areEqual(this.f27929b, q1Var.f27929b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27930c, q1Var.f27930c);
    }

    public int hashCode() {
        Uri uri = this.f27929b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f27930c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Uri uri = this.f27929b;
        if (uri != null) {
            bundle.putParcelable(f27925g, uri);
        }
        String str = this.f27930c;
        if (str != null) {
            bundle.putString(f27926h, str);
        }
        Bundle bundle2 = this.f27931e;
        if (bundle2 != null) {
            bundle.putBundle(f27927i, bundle2);
        }
        return bundle;
    }
}
