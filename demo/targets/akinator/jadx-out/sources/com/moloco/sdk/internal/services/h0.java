package com.moloco.sdk.internal.services;

import b0.e2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f47050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47051b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47052c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47053d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47054e;

    /* renamed from: f, reason: collision with root package name */
    public final String f47055f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47056g;

    /* renamed from: h, reason: collision with root package name */
    public final String f47057h;

    /* renamed from: i, reason: collision with root package name */
    public final String f47058i;

    /* renamed from: j, reason: collision with root package name */
    public final float f47059j;

    /* renamed from: k, reason: collision with root package name */
    public final long f47060k;

    /* renamed from: l, reason: collision with root package name */
    public final String f47061l;

    /* renamed from: m, reason: collision with root package name */
    public final String f47062m;

    public h0(String manufacturer, String model, String hwVersion, boolean z10, String os2, String osVersion, int i10, String language, String mobileCarrier, float f10, long j10, String hardware, String brand) {
        kotlin.jvm.internal.e0.checkNotNullParameter(manufacturer, "manufacturer");
        kotlin.jvm.internal.e0.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.e0.checkNotNullParameter(hwVersion, "hwVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(os2, "os");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.e0.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        kotlin.jvm.internal.e0.checkNotNullParameter(hardware, "hardware");
        kotlin.jvm.internal.e0.checkNotNullParameter(brand, "brand");
        this.f47050a = manufacturer;
        this.f47051b = model;
        this.f47052c = hwVersion;
        this.f47053d = z10;
        this.f47054e = os2;
        this.f47055f = osVersion;
        this.f47056g = i10;
        this.f47057h = language;
        this.f47058i = mobileCarrier;
        this.f47059j = f10;
        this.f47060k = j10;
        this.f47061l = hardware;
        this.f47062m = brand;
    }

    public final String a() {
        return this.f47050a;
    }

    public final float b() {
        return this.f47059j;
    }

    public final long c() {
        return this.f47060k;
    }

    public final String d() {
        return this.f47061l;
    }

    public final String e() {
        return this.f47062m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f47050a, h0Var.f47050a) && kotlin.jvm.internal.e0.areEqual(this.f47051b, h0Var.f47051b) && kotlin.jvm.internal.e0.areEqual(this.f47052c, h0Var.f47052c) && this.f47053d == h0Var.f47053d && kotlin.jvm.internal.e0.areEqual(this.f47054e, h0Var.f47054e) && kotlin.jvm.internal.e0.areEqual(this.f47055f, h0Var.f47055f) && this.f47056g == h0Var.f47056g && kotlin.jvm.internal.e0.areEqual(this.f47057h, h0Var.f47057h) && kotlin.jvm.internal.e0.areEqual(this.f47058i, h0Var.f47058i) && Float.compare(this.f47059j, h0Var.f47059j) == 0 && this.f47060k == h0Var.f47060k && kotlin.jvm.internal.e0.areEqual(this.f47061l, h0Var.f47061l) && kotlin.jvm.internal.e0.areEqual(this.f47062m, h0Var.f47062m);
    }

    public final String f() {
        return this.f47051b;
    }

    public final String g() {
        return this.f47052c;
    }

    public final boolean h() {
        return this.f47053d;
    }

    public int hashCode() {
        return this.f47062m.hashCode() + o2.e(o2.d(e2.b(this.f47059j, o2.e(o2.e(e3.g.d(this.f47056g, o2.e(o2.e(com.google.android.gms.internal.play_billing.a.c(o2.e(o2.e(this.f47050a.hashCode() * 31, 31, this.f47051b), 31, this.f47052c), 31, this.f47053d), 31, this.f47054e), 31, this.f47055f), 31), 31, this.f47057h), 31, this.f47058i), 31), 31, this.f47060k), 31, this.f47061l);
    }

    public final String i() {
        return this.f47054e;
    }

    public final String j() {
        return this.f47055f;
    }

    public final int k() {
        return this.f47056g;
    }

    public final String l() {
        return this.f47057h;
    }

    public final String m() {
        return this.f47058i;
    }

    public final int n() {
        return this.f47056g;
    }

    public final String o() {
        return this.f47062m;
    }

    public final long p() {
        return this.f47060k;
    }

    public final String q() {
        return this.f47061l;
    }

    public final String r() {
        return this.f47052c;
    }

    public final String s() {
        return this.f47057h;
    }

    public final String t() {
        return this.f47050a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(manufacturer=");
        sb2.append(this.f47050a);
        sb2.append(", model=");
        sb2.append(this.f47051b);
        sb2.append(", hwVersion=");
        sb2.append(this.f47052c);
        sb2.append(", isTablet=");
        sb2.append(this.f47053d);
        sb2.append(", os=");
        sb2.append(this.f47054e);
        sb2.append(", osVersion=");
        sb2.append(this.f47055f);
        sb2.append(", apiLevel=");
        sb2.append(this.f47056g);
        sb2.append(", language=");
        sb2.append(this.f47057h);
        sb2.append(", mobileCarrier=");
        sb2.append(this.f47058i);
        sb2.append(", screenDensity=");
        sb2.append(this.f47059j);
        sb2.append(", dbtMs=");
        sb2.append(this.f47060k);
        sb2.append(", hardware=");
        sb2.append(this.f47061l);
        sb2.append(", brand=");
        return o2.q(sb2, this.f47062m, ')');
    }

    public final String u() {
        return this.f47058i;
    }

    public final String v() {
        return this.f47051b;
    }

    public final String w() {
        return this.f47054e;
    }

    public final String x() {
        return this.f47055f;
    }

    public final float y() {
        return this.f47059j;
    }

    public final boolean z() {
        return this.f47053d;
    }

    public final h0 a(String manufacturer, String model, String hwVersion, boolean z10, String os2, String osVersion, int i10, String language, String mobileCarrier, float f10, long j10, String hardware, String brand) {
        kotlin.jvm.internal.e0.checkNotNullParameter(manufacturer, "manufacturer");
        kotlin.jvm.internal.e0.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.e0.checkNotNullParameter(hwVersion, "hwVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(os2, "os");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.e0.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        kotlin.jvm.internal.e0.checkNotNullParameter(hardware, "hardware");
        kotlin.jvm.internal.e0.checkNotNullParameter(brand, "brand");
        return new h0(manufacturer, model, hwVersion, z10, os2, osVersion, i10, language, mobileCarrier, f10, j10, hardware, brand);
    }
}
