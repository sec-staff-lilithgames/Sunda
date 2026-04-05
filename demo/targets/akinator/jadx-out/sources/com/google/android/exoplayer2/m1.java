package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m1 implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final String f27676k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27677l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27678m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: n, reason: collision with root package name */
    public static final String f27679n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: o, reason: collision with root package name */
    public static final String f27680o = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: p, reason: collision with root package name */
    public static final String f27681p = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);

    /* renamed from: q, reason: collision with root package name */
    public static final String f27682q = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);

    /* renamed from: r, reason: collision with root package name */
    public static final String f27683r = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(7);

    /* renamed from: s, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27684s = new com.bytedance.adsdk.ugeno.zz.cm.a(12);

    /* renamed from: b, reason: collision with root package name */
    public final UUID f27685b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f27686c;

    /* renamed from: e, reason: collision with root package name */
    public final m5 f27687e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27689g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27690h;

    /* renamed from: i, reason: collision with root package name */
    public final b5 f27691i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f27692j;

    public m1(l1 l1Var) {
        com.google.android.exoplayer2.util.a.checkState((l1Var.f27631f && l1Var.f27627b == null) ? false : true);
        this.f27685b = (UUID) com.google.android.exoplayer2.util.a.checkNotNull(l1Var.f27626a);
        this.f27686c = l1Var.f27627b;
        this.f27687e = l1Var.f27628c;
        this.f27688f = l1Var.f27629d;
        this.f27690h = l1Var.f27631f;
        this.f27689g = l1Var.f27630e;
        this.f27691i = l1Var.f27632g;
        byte[] bArr = l1Var.f27633h;
        this.f27692j = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public l1 buildUpon() {
        l1 l1Var = new l1();
        l1Var.f27626a = this.f27685b;
        l1Var.f27627b = this.f27686c;
        l1Var.f27628c = this.f27687e;
        l1Var.f27629d = this.f27688f;
        l1Var.f27630e = this.f27689g;
        l1Var.f27631f = this.f27690h;
        l1Var.f27632g = this.f27691i;
        l1Var.f27633h = this.f27692j;
        return l1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f27685b.equals(m1Var.f27685b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27686c, m1Var.f27686c) && com.google.android.exoplayer2.util.n1.areEqual(this.f27687e, m1Var.f27687e) && this.f27688f == m1Var.f27688f && this.f27690h == m1Var.f27690h && this.f27689g == m1Var.f27689g && this.f27691i.equals(m1Var.f27691i) && Arrays.equals(this.f27692j, m1Var.f27692j);
    }

    public byte[] getKeySetId() {
        byte[] bArr = this.f27692j;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = this.f27685b.hashCode() * 31;
        Uri uri = this.f27686c;
        return Arrays.hashCode(this.f27692j) + ((this.f27691i.hashCode() + ((((((((this.f27687e.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f27688f ? 1 : 0)) * 31) + (this.f27690h ? 1 : 0)) * 31) + (this.f27689g ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f27676k, this.f27685b.toString());
        Uri uri = this.f27686c;
        if (uri != null) {
            bundle.putParcelable(f27677l, uri);
        }
        m5 m5Var = this.f27687e;
        if (!m5Var.isEmpty()) {
            bundle.putBundle(f27678m, com.google.android.exoplayer2.util.c.stringMapToBundle(m5Var));
        }
        boolean z10 = this.f27688f;
        if (z10) {
            bundle.putBoolean(f27679n, z10);
        }
        boolean z11 = this.f27689g;
        if (z11) {
            bundle.putBoolean(f27680o, z11);
        }
        boolean z12 = this.f27690h;
        if (z12) {
            bundle.putBoolean(f27681p, z12);
        }
        b5 b5Var = this.f27691i;
        if (!b5Var.isEmpty()) {
            bundle.putIntegerArrayList(f27682q, new ArrayList<>(b5Var));
        }
        byte[] bArr = this.f27692j;
        if (bArr != null) {
            bundle.putByteArray(f27683r, bArr);
        }
        return bundle;
    }
}
