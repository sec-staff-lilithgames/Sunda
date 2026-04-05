package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o1 implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final String f27852k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27853l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27854m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: n, reason: collision with root package name */
    public static final String f27855n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: o, reason: collision with root package name */
    public static final String f27856o = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: p, reason: collision with root package name */
    public static final String f27857p = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);

    /* renamed from: q, reason: collision with root package name */
    public static final String f27858q = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);

    /* renamed from: r, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27859r = new com.bytedance.adsdk.ugeno.zz.cm.a(14);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f27860b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27861c;

    /* renamed from: e, reason: collision with root package name */
    public final m1 f27862e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f27863f;

    /* renamed from: g, reason: collision with root package name */
    public final List f27864g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27865h;

    /* renamed from: i, reason: collision with root package name */
    public final b5 f27866i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f27867j;

    public o1(Uri uri, String str, m1 m1Var, g1 g1Var, List list, String str2, b5 b5Var, Object obj) {
        this.f27860b = uri;
        this.f27861c = str;
        this.f27862e = m1Var;
        this.f27863f = g1Var;
        this.f27864g = list;
        this.f27865h = str2;
        this.f27866i = b5Var;
        x4 x4VarBuilder = b5.builder();
        for (int i10 = 0; i10 < b5Var.size(); i10++) {
            s1 s1VarBuildUpon = ((t1) b5Var.get(i10)).buildUpon();
            s1VarBuildUpon.getClass();
            x4VarBuilder.add((Object) new r1(s1VarBuildUpon));
        }
        x4VarBuilder.build();
        this.f27867j = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f27860b.equals(o1Var.f27860b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27861c, o1Var.f27861c) && com.google.android.exoplayer2.util.n1.areEqual(this.f27862e, o1Var.f27862e) && com.google.android.exoplayer2.util.n1.areEqual(this.f27863f, o1Var.f27863f) && this.f27864g.equals(o1Var.f27864g) && com.google.android.exoplayer2.util.n1.areEqual(this.f27865h, o1Var.f27865h) && this.f27866i.equals(o1Var.f27866i) && com.google.android.exoplayer2.util.n1.areEqual(this.f27867j, o1Var.f27867j);
    }

    public int hashCode() {
        int iHashCode = this.f27860b.hashCode() * 31;
        String str = this.f27861c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m1 m1Var = this.f27862e;
        int iHashCode3 = (iHashCode2 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        g1 g1Var = this.f27863f;
        int iHashCode4 = (this.f27864g.hashCode() + ((iHashCode3 + (g1Var == null ? 0 : g1Var.hashCode())) * 31)) * 31;
        String str2 = this.f27865h;
        int iHashCode5 = (this.f27866i.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f27867j;
        return iHashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f27852k, this.f27860b);
        String str = this.f27861c;
        if (str != null) {
            bundle.putString(f27853l, str);
        }
        m1 m1Var = this.f27862e;
        if (m1Var != null) {
            bundle.putBundle(f27854m, m1Var.toBundle());
        }
        g1 g1Var = this.f27863f;
        if (g1Var != null) {
            bundle.putBundle(f27855n, g1Var.toBundle());
        }
        List list = this.f27864g;
        if (!list.isEmpty()) {
            bundle.putParcelableArrayList(f27856o, com.google.android.exoplayer2.util.c.toBundleArrayList(list));
        }
        String str2 = this.f27865h;
        if (str2 != null) {
            bundle.putString(f27857p, str2);
        }
        b5 b5Var = this.f27866i;
        if (!b5Var.isEmpty()) {
            bundle.putParcelableArrayList(f27858q, com.google.android.exoplayer2.util.c.toBundleArrayList(b5Var));
        }
        return bundle;
    }
}
