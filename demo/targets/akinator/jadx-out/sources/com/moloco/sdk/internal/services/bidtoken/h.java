package com.moloco.sdk.internal.services.bidtoken;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f46839a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46840b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46841c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46842d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46843e;

    public h(String language, String osVersion, String make, String model, String hardwareVersion) {
        kotlin.jvm.internal.e0.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(make, "make");
        kotlin.jvm.internal.e0.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.e0.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.f46839a = language;
        this.f46840b = osVersion;
        this.f46841c = make;
        this.f46842d = model;
        this.f46843e = hardwareVersion;
    }

    public final String a() {
        return this.f46839a;
    }

    public final String b() {
        return this.f46840b;
    }

    public final String c() {
        return this.f46841c;
    }

    public final String d() {
        return this.f46842d;
    }

    public final String e() {
        return this.f46843e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f46839a, hVar.f46839a) && kotlin.jvm.internal.e0.areEqual(this.f46840b, hVar.f46840b) && kotlin.jvm.internal.e0.areEqual(this.f46841c, hVar.f46841c) && kotlin.jvm.internal.e0.areEqual(this.f46842d, hVar.f46842d) && kotlin.jvm.internal.e0.areEqual(this.f46843e, hVar.f46843e);
    }

    public final String f() {
        return this.f46843e;
    }

    public final String g() {
        return this.f46839a;
    }

    public final String h() {
        return this.f46841c;
    }

    public int hashCode() {
        return this.f46843e.hashCode() + o2.e(o2.e(o2.e(this.f46839a.hashCode() * 31, 31, this.f46840b), 31, this.f46841c), 31, this.f46842d);
    }

    public final String i() {
        return this.f46842d;
    }

    public final String j() {
        return this.f46840b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BidTokenDeviceRequestInfo(language=");
        sb2.append(this.f46839a);
        sb2.append(", osVersion=");
        sb2.append(this.f46840b);
        sb2.append(", make=");
        sb2.append(this.f46841c);
        sb2.append(", model=");
        sb2.append(this.f46842d);
        sb2.append(", hardwareVersion=");
        return o2.q(sb2, this.f46843e, ')');
    }

    public final h a(String language, String osVersion, String make, String model, String hardwareVersion) {
        kotlin.jvm.internal.e0.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(make, "make");
        kotlin.jvm.internal.e0.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.e0.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        return new h(language, osVersion, make, model, hardwareVersion);
    }

    public static /* synthetic */ h a(h hVar, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.f46839a;
        }
        if ((i10 & 2) != 0) {
            str2 = hVar.f46840b;
        }
        if ((i10 & 4) != 0) {
            str3 = hVar.f46841c;
        }
        if ((i10 & 8) != 0) {
            str4 = hVar.f46842d;
        }
        if ((i10 & 16) != 0) {
            str5 = hVar.f46843e;
        }
        String str6 = str5;
        String str7 = str3;
        return hVar.a(str, str2, str7, str4, str6);
    }
}
