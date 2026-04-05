package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f49337a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f49338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49339c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49340d;

    /* renamed from: e, reason: collision with root package name */
    public final j f49341e;

    public i(String str, Integer num, String str2, String str3, j child) {
        e0.checkNotNullParameter(child, "child");
        this.f49337a = str;
        this.f49338b = num;
        this.f49339c = str2;
        this.f49340d = str3;
        this.f49341e = child;
    }

    public final String a() {
        return this.f49337a;
    }

    public final Integer b() {
        return this.f49338b;
    }

    public final String c() {
        return this.f49339c;
    }

    public final String d() {
        return this.f49340d;
    }

    public final j e() {
        return this.f49341e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e0.areEqual(this.f49337a, iVar.f49337a) && e0.areEqual(this.f49338b, iVar.f49338b) && e0.areEqual(this.f49339c, iVar.f49339c) && e0.areEqual(this.f49340d, iVar.f49340d) && e0.areEqual(this.f49341e, iVar.f49341e);
    }

    public final String f() {
        return this.f49339c;
    }

    public final String g() {
        return this.f49340d;
    }

    public final j h() {
        return this.f49341e;
    }

    public int hashCode() {
        String str = this.f49337a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f49338b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f49339c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49340d;
        return this.f49341e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f49337a;
    }

    public final Integer j() {
        return this.f49338b;
    }

    public String toString() {
        return "Creative(id=" + this.f49337a + ", sequence=" + this.f49338b + ", adId=" + this.f49339c + ", apiFramework=" + this.f49340d + ", child=" + this.f49341e + ')';
    }

    public final i a(String str, Integer num, String str2, String str3, j child) {
        e0.checkNotNullParameter(child, "child");
        return new i(str, num, str2, str3, child);
    }

    public static /* synthetic */ i a(i iVar, String str, Integer num, String str2, String str3, j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f49337a;
        }
        if ((i10 & 2) != 0) {
            num = iVar.f49338b;
        }
        if ((i10 & 4) != 0) {
            str2 = iVar.f49339c;
        }
        if ((i10 & 8) != 0) {
            str3 = iVar.f49340d;
        }
        if ((i10 & 16) != 0) {
            jVar = iVar.f49341e;
        }
        j jVar2 = jVar;
        String str4 = str2;
        return iVar.a(str, num, str4, str3, jVar2);
    }
}
