package com.moloco.sdk.acm;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f45640a;

    /* renamed from: b, reason: collision with root package name */
    public String f45641b;

    /* renamed from: c, reason: collision with root package name */
    public long f45642c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f45643d;

    public i(String appId, String postAnalyticsUrl, long j10, Map<String, String> clientOptions) {
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        e0.checkNotNullParameter(clientOptions, "clientOptions");
        this.f45640a = appId;
        this.f45641b = postAnalyticsUrl;
        this.f45642c = j10;
        this.f45643d = clientOptions;
    }

    public final String a() {
        return this.f45640a;
    }

    public final String b() {
        return this.f45641b;
    }

    public final long c() {
        return this.f45642c;
    }

    public final Map<String, String> d() {
        return this.f45643d;
    }

    public final String e() {
        return this.f45640a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e0.areEqual(this.f45640a, iVar.f45640a) && e0.areEqual(this.f45641b, iVar.f45641b) && this.f45642c == iVar.f45642c && e0.areEqual(this.f45643d, iVar.f45643d);
    }

    public final Map<String, String> f() {
        return this.f45643d;
    }

    public final String g() {
        return this.f45641b;
    }

    public final long h() {
        return this.f45642c;
    }

    public int hashCode() {
        return this.f45643d.hashCode() + o2.d(o2.e(this.f45640a.hashCode() * 31, 31, this.f45641b), 31, this.f45642c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ACMConfig(appId=");
        sb2.append(this.f45640a);
        sb2.append(", postAnalyticsUrl=");
        sb2.append(this.f45641b);
        sb2.append(", requestPeriodSeconds=");
        sb2.append(this.f45642c);
        sb2.append(", clientOptions=");
        return j1.o2.q(sb2, this.f45643d, ')');
    }

    public final i a(String appId, String postAnalyticsUrl, long j10, Map<String, String> clientOptions) {
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        e0.checkNotNullParameter(clientOptions, "clientOptions");
        return new i(appId, postAnalyticsUrl, j10, clientOptions);
    }

    public static /* synthetic */ i a(i iVar, String str, String str2, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f45640a;
        }
        if ((i10 & 2) != 0) {
            str2 = iVar.f45641b;
        }
        if ((i10 & 4) != 0) {
            j10 = iVar.f45642c;
        }
        if ((i10 & 8) != 0) {
            map = iVar.f45643d;
        }
        Map map2 = map;
        return iVar.a(str, str2, j10, map2);
    }

    public final void a(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f45641b = str;
    }

    public final void a(long j10) {
        this.f45642c = j10;
    }

    public /* synthetic */ i(String str, String str2, long j10, Map map, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? 600L : j10, map);
    }
}
