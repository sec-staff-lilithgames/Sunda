package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f47617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47618b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47619c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47620d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47621e;

    /* renamed from: f, reason: collision with root package name */
    public final String f47622f;

    /* renamed from: g, reason: collision with root package name */
    public final String f47623g;

    public a0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f47617a = str;
        this.f47618b = str2;
        this.f47619c = str3;
        this.f47620d = str4;
        this.f47621e = str5;
        this.f47622f = str6;
        this.f47623g = str7;
    }

    public final String a() {
        return this.f47617a;
    }

    public final String b() {
        return this.f47618b;
    }

    public final String c() {
        return this.f47619c;
    }

    public final String d() {
        return this.f47620d;
    }

    public final String e() {
        return this.f47621e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f47617a, a0Var.f47617a) && kotlin.jvm.internal.e0.areEqual(this.f47618b, a0Var.f47618b) && kotlin.jvm.internal.e0.areEqual(this.f47619c, a0Var.f47619c) && kotlin.jvm.internal.e0.areEqual(this.f47620d, a0Var.f47620d) && kotlin.jvm.internal.e0.areEqual(this.f47621e, a0Var.f47621e) && kotlin.jvm.internal.e0.areEqual(this.f47622f, a0Var.f47622f) && kotlin.jvm.internal.e0.areEqual(this.f47623g, a0Var.f47623g);
    }

    public final String f() {
        return this.f47622f;
    }

    public final String g() {
        return this.f47623g;
    }

    public final String h() {
        return this.f47617a;
    }

    public int hashCode() {
        String str = this.f47617a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47618b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47619c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f47620d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f47621e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f47622f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f47623g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.f47618b;
    }

    public final String j() {
        return this.f47619c;
    }

    public final String k() {
        return this.f47621e;
    }

    public final String l() {
        return this.f47620d;
    }

    public final String m() {
        return this.f47622f;
    }

    public final String n() {
        return this.f47623g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DEC(appIconUri=");
        sb2.append(this.f47617a);
        sb2.append(", appName=");
        sb2.append(this.f47618b);
        sb2.append(", ctaText=");
        sb2.append(this.f47619c);
        sb2.append(", ctaUrl=");
        sb2.append(this.f47620d);
        sb2.append(", ctaTrackingUrl=");
        sb2.append(this.f47621e);
        sb2.append(", impressionTrackingUrl=");
        sb2.append(this.f47622f);
        sb2.append(", skipToDECTrackingUrl=");
        return o2.q(sb2, this.f47623g, ')');
    }

    public final a0 a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new a0(str, str2, str3, str4, str5, str6, str7);
    }

    public static /* synthetic */ a0 a(a0 a0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = a0Var.f47617a;
        }
        if ((i10 & 2) != 0) {
            str2 = a0Var.f47618b;
        }
        if ((i10 & 4) != 0) {
            str3 = a0Var.f47619c;
        }
        if ((i10 & 8) != 0) {
            str4 = a0Var.f47620d;
        }
        if ((i10 & 16) != 0) {
            str5 = a0Var.f47621e;
        }
        if ((i10 & 32) != 0) {
            str6 = a0Var.f47622f;
        }
        if ((i10 & 64) != 0) {
            str7 = a0Var.f47623g;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return a0Var.a(str, str2, str11, str4, str10, str8, str9);
    }
}
