package com.ironsource;

import java.util.Calendar;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3206f1 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3202ef f36671a;

    /* renamed from: b, reason: collision with root package name */
    private final W7 f36672b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36673c;

    /* renamed from: d, reason: collision with root package name */
    private final long f36674d;

    public C3206f1(EnumC3202ef recordType, W7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f36671a = recordType;
        this.f36672b = adProvider;
        this.f36673c = adInstanceId;
        this.f36674d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final String a() {
        return this.f36673c;
    }

    public final W7 b() {
        return this.f36672b;
    }

    public final Map<String, Object> c() {
        return uu.p1.mapOf(tu.e0.to(C3496va.f39116c, Integer.valueOf(this.f36672b.b())), tu.e0.to("ts", String.valueOf(this.f36674d)));
    }

    public final Map<String, Object> d() {
        return uu.p1.mapOf(tu.e0.to("aid", this.f36673c), tu.e0.to(C3496va.f39116c, Integer.valueOf(this.f36672b.b())), tu.e0.to("ts", String.valueOf(this.f36674d)), tu.e0.to("rt", Integer.valueOf(this.f36671a.ordinal())));
    }

    public final EnumC3202ef e() {
        return this.f36671a;
    }

    public final long f() {
        return this.f36674d;
    }
}
