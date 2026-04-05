package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t1 implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final String f28039j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f28040k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f28041l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f28042m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f28043n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f28044o = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);

    /* renamed from: p, reason: collision with root package name */
    public static final String f28045p = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);

    /* renamed from: q, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f28046q = new com.bytedance.adsdk.ugeno.zz.cm.a(17);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f28047b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28048c;

    /* renamed from: e, reason: collision with root package name */
    public final String f28049e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28051g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28052h;

    /* renamed from: i, reason: collision with root package name */
    public final String f28053i;

    public t1(Uri uri, String str, String str2, int i10, int i11, String str3) {
        this.f28047b = uri;
        this.f28048c = str;
        this.f28049e = str2;
        this.f28050f = i10;
        this.f28051g = i11;
        this.f28052h = str3;
        this.f28053i = null;
    }

    public s1 buildUpon() {
        s1 s1Var = new s1();
        s1Var.f28014a = this.f28047b;
        s1Var.f28015b = this.f28048c;
        s1Var.f28016c = this.f28049e;
        s1Var.f28017d = this.f28050f;
        s1Var.f28018e = this.f28051g;
        s1Var.f28019f = this.f28052h;
        s1Var.f28020g = this.f28053i;
        return s1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f28047b.equals(t1Var.f28047b) && com.google.android.exoplayer2.util.n1.areEqual(this.f28048c, t1Var.f28048c) && com.google.android.exoplayer2.util.n1.areEqual(this.f28049e, t1Var.f28049e) && this.f28050f == t1Var.f28050f && this.f28051g == t1Var.f28051g && com.google.android.exoplayer2.util.n1.areEqual(this.f28052h, t1Var.f28052h) && com.google.android.exoplayer2.util.n1.areEqual(this.f28053i, t1Var.f28053i);
    }

    public int hashCode() {
        int iHashCode = this.f28047b.hashCode() * 31;
        String str = this.f28048c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28049e;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28050f) * 31) + this.f28051g) * 31;
        String str3 = this.f28052h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28053i;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f28039j, this.f28047b);
        String str = this.f28048c;
        if (str != null) {
            bundle.putString(f28040k, str);
        }
        String str2 = this.f28049e;
        if (str2 != null) {
            bundle.putString(f28041l, str2);
        }
        int i10 = this.f28050f;
        if (i10 != 0) {
            bundle.putInt(f28042m, i10);
        }
        int i11 = this.f28051g;
        if (i11 != 0) {
            bundle.putInt(f28043n, i11);
        }
        String str3 = this.f28052h;
        if (str3 != null) {
            bundle.putString(f28044o, str3);
        }
        String str4 = this.f28053i;
        if (str4 != null) {
            bundle.putString(f28045p, str4);
        }
        return bundle;
    }

    public t1(s1 s1Var) {
        this.f28047b = s1Var.f28014a;
        this.f28048c = s1Var.f28015b;
        this.f28049e = s1Var.f28016c;
        this.f28050f = s1Var.f28017d;
        this.f28051g = s1Var.f28018e;
        this.f28052h = s1Var.f28019f;
        this.f28053i = s1Var.f28020g;
    }
}
