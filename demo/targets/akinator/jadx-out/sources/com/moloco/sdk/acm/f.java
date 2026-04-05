package com.moloco.sdk.acm;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f45603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45604b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f45605c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45606d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f45607e;

    public f(String appId, String postAnalyticsUrl, Context context, long j10, Map<String, String> clientOptions) {
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(clientOptions, "clientOptions");
        this.f45603a = appId;
        this.f45604b = postAnalyticsUrl;
        this.f45605c = context;
        this.f45606d = j10;
        this.f45607e = clientOptions;
    }

    public static /* synthetic */ f copy$default(f fVar, String str, String str2, Context context, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fVar.f45603a;
        }
        if ((i10 & 2) != 0) {
            str2 = fVar.f45604b;
        }
        if ((i10 & 4) != 0) {
            context = fVar.f45605c;
        }
        if ((i10 & 8) != 0) {
            j10 = fVar.f45606d;
        }
        if ((i10 & 16) != 0) {
            map = fVar.f45607e;
        }
        Map map2 = map;
        Context context2 = context;
        return fVar.copy(str, str2, context2, j10, map2);
    }

    public final String component1() {
        return this.f45603a;
    }

    public final String component2() {
        return this.f45604b;
    }

    public final Context component3() {
        return this.f45605c;
    }

    public final long component4() {
        return this.f45606d;
    }

    public final Map<String, String> component5() {
        return this.f45607e;
    }

    public final f copy(String appId, String postAnalyticsUrl, Context context, long j10, Map<String, String> clientOptions) {
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(clientOptions, "clientOptions");
        return new f(appId, postAnalyticsUrl, context, j10, clientOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e0.areEqual(this.f45603a, fVar.f45603a) && e0.areEqual(this.f45604b, fVar.f45604b) && e0.areEqual(this.f45605c, fVar.f45605c) && this.f45606d == fVar.f45606d && e0.areEqual(this.f45607e, fVar.f45607e);
    }

    public final String getAppId() {
        return this.f45603a;
    }

    public final Map<String, String> getClientOptions() {
        return this.f45607e;
    }

    public final Context getContext() {
        return this.f45605c;
    }

    public final String getPostAnalyticsUrl() {
        return this.f45604b;
    }

    public final long getRequestPeriodSeconds() {
        return this.f45606d;
    }

    public int hashCode() {
        return this.f45607e.hashCode() + o2.d((this.f45605c.hashCode() + o2.e(this.f45603a.hashCode() * 31, 31, this.f45604b)) * 31, 31, this.f45606d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InitConfig(appId=");
        sb2.append(this.f45603a);
        sb2.append(", postAnalyticsUrl=");
        sb2.append(this.f45604b);
        sb2.append(", context=");
        sb2.append(this.f45605c);
        sb2.append(", requestPeriodSeconds=");
        sb2.append(this.f45606d);
        sb2.append(", clientOptions=");
        return j1.o2.q(sb2, this.f45607e, ')');
    }

    public /* synthetic */ f(String str, String str2, Context context, long j10, Map map, int i10, u uVar) {
        this(str, str2, context, (i10 & 8) != 0 ? 600L : j10, map);
    }
}
