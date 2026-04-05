package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u1 implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final u1 f28104i = new h1().build();

    /* renamed from: j, reason: collision with root package name */
    public static final String f28105j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f28106k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f28107l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f28108m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f28109n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f28110o = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);

    /* renamed from: p, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f28111p = new com.bytedance.adsdk.ugeno.zz.cm.a(9);

    /* renamed from: b, reason: collision with root package name */
    public final String f28112b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f28113c;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f28114e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f28115f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f28116g;

    /* renamed from: h, reason: collision with root package name */
    public final q1 f28117h;

    public u1(String str, k1 k1Var, o1 o1Var, n1 n1Var, w1 w1Var, q1 q1Var) {
        this.f28112b = str;
        this.f28113c = o1Var;
        this.f28114e = n1Var;
        this.f28115f = w1Var;
        this.f28116g = k1Var;
        this.f28117h = q1Var;
    }

    public static u1 fromUri(String str) {
        return new h1().setUri(str).build();
    }

    public final Bundle a(boolean z10) {
        o1 o1Var;
        Bundle bundle = new Bundle();
        String str = this.f28112b;
        if (!str.equals("")) {
            bundle.putString(f28105j, str);
        }
        n1 n1Var = n1.f27812h;
        n1 n1Var2 = this.f28114e;
        if (!n1Var2.equals(n1Var)) {
            bundle.putBundle(f28106k, n1Var2.toBundle());
        }
        w1 w1Var = w1.K;
        w1 w1Var2 = this.f28115f;
        if (!w1Var2.equals(w1Var)) {
            bundle.putBundle(f28107l, w1Var2.toBundle());
        }
        j1 j1Var = j1.f27541h;
        k1 k1Var = this.f28116g;
        if (!k1Var.equals(j1Var)) {
            bundle.putBundle(f28108m, k1Var.toBundle());
        }
        q1 q1Var = q1.f27924f;
        q1 q1Var2 = this.f28117h;
        if (!q1Var2.equals(q1Var)) {
            bundle.putBundle(f28109n, q1Var2.toBundle());
        }
        if (z10 && (o1Var = this.f28113c) != null) {
            bundle.putBundle(f28110o, o1Var.toBundle());
        }
        return bundle;
    }

    public h1 buildUpon() {
        h1 h1Var = new h1();
        h1Var.f27505d = this.f28116g.buildUpon();
        h1Var.f27502a = this.f28112b;
        h1Var.f27512k = this.f28115f;
        h1Var.f27513l = this.f28114e.buildUpon();
        h1Var.f27514m = this.f28117h;
        o1 o1Var = this.f28113c;
        if (o1Var != null) {
            h1Var.f27508g = o1Var.f27865h;
            h1Var.f27504c = o1Var.f27861c;
            h1Var.f27503b = o1Var.f27860b;
            h1Var.f27507f = o1Var.f27864g;
            h1Var.f27509h = o1Var.f27866i;
            h1Var.f27511j = o1Var.f27867j;
            m1 m1Var = o1Var.f27862e;
            h1Var.f27506e = m1Var != null ? m1Var.buildUpon() : new l1();
            h1Var.f27510i = o1Var.f27863f;
        }
        return h1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return com.google.android.exoplayer2.util.n1.areEqual(this.f28112b, u1Var.f28112b) && this.f28116g.equals(u1Var.f28116g) && com.google.android.exoplayer2.util.n1.areEqual(this.f28113c, u1Var.f28113c) && com.google.android.exoplayer2.util.n1.areEqual(this.f28114e, u1Var.f28114e) && com.google.android.exoplayer2.util.n1.areEqual(this.f28115f, u1Var.f28115f) && com.google.android.exoplayer2.util.n1.areEqual(this.f28117h, u1Var.f28117h);
    }

    public int hashCode() {
        int iHashCode = this.f28112b.hashCode() * 31;
        o1 o1Var = this.f28113c;
        return this.f28117h.hashCode() + ((this.f28115f.hashCode() + ((this.f28116g.hashCode() + ((this.f28114e.hashCode() + ((iHashCode + (o1Var != null ? o1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        return a(false);
    }

    public Bundle toBundleIncludeLocalConfiguration() {
        return a(true);
    }

    public static u1 fromUri(Uri uri) {
        return new h1().setUri(uri).build();
    }
}
