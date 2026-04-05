package com.moloco.sdk.internal.configs;

import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f45896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45897b;

    public a(String reportingUrl, int i10) {
        e0.checkNotNullParameter(reportingUrl, "reportingUrl");
        this.f45896a = reportingUrl;
        this.f45897b = i10;
    }

    public final String a() {
        return this.f45896a;
    }

    public final int b() {
        return this.f45897b;
    }

    public final int c() {
        return this.f45897b;
    }

    public final String d() {
        return this.f45896a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f45896a, aVar.f45896a) && this.f45897b == aVar.f45897b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f45897b) + (this.f45896a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OperationalMetricsConfig(reportingUrl=");
        sb2.append(this.f45896a);
        sb2.append(", pollingIntervalSeconds=");
        return g.m(sb2, this.f45897b, ')');
    }

    public final a a(String reportingUrl, int i10) {
        e0.checkNotNullParameter(reportingUrl, "reportingUrl");
        return new a(reportingUrl, i10);
    }

    public static /* synthetic */ a a(a aVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f45896a;
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f45897b;
        }
        return aVar.a(str, i10);
    }
}
