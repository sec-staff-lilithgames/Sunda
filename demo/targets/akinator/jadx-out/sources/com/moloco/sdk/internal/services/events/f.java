package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47035b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47036c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47037d;

    public f(boolean z10, boolean z11, String appForegroundUrl, String appBackgroundUrl) {
        e0.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        e0.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f47034a = z10;
        this.f47035b = z11;
        this.f47036c = appForegroundUrl;
        this.f47037d = appBackgroundUrl;
    }

    public final boolean a() {
        return this.f47034a;
    }

    public final boolean b() {
        return this.f47035b;
    }

    public final String c() {
        return this.f47036c;
    }

    public final String d() {
        return this.f47037d;
    }

    public final String e() {
        return this.f47037d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f47034a == fVar.f47034a && this.f47035b == fVar.f47035b && e0.areEqual(this.f47036c, fVar.f47036c) && e0.areEqual(this.f47037d, fVar.f47037d);
    }

    public final String f() {
        return this.f47036c;
    }

    public final boolean g() {
        return this.f47034a;
    }

    public final boolean h() {
        return this.f47035b;
    }

    public int hashCode() {
        return this.f47037d.hashCode() + o2.e(com.google.android.gms.internal.play_billing.a.c(Boolean.hashCode(this.f47034a) * 31, 31, this.f47035b), 31, this.f47036c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserEventConfig(eventReportingEnabled=");
        sb2.append(this.f47034a);
        sb2.append(", userTrackingEnabled=");
        sb2.append(this.f47035b);
        sb2.append(", appForegroundUrl=");
        sb2.append(this.f47036c);
        sb2.append(", appBackgroundUrl=");
        return o2.q(sb2, this.f47037d, ')');
    }

    public final f a(boolean z10, boolean z11, String appForegroundUrl, String appBackgroundUrl) {
        e0.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        e0.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        return new f(z10, z11, appForegroundUrl, appBackgroundUrl);
    }

    public static /* synthetic */ f a(f fVar, boolean z10, boolean z11, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f47034a;
        }
        if ((i10 & 2) != 0) {
            z11 = fVar.f47035b;
        }
        if ((i10 & 4) != 0) {
            str = fVar.f47036c;
        }
        if ((i10 & 8) != 0) {
            str2 = fVar.f47037d;
        }
        return fVar.a(z10, z11, str, str2);
    }
}
