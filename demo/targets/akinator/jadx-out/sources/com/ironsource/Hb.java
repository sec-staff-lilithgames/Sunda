package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Hb {

    /* renamed from: a, reason: collision with root package name */
    private final int f34583a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34584b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34585c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34586d;

    public Hb(JSONObject applicationLogger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f34583a = applicationLogger.optInt(Ib.f34672a, 3);
        this.f34584b = applicationLogger.optInt(Ib.f34673b, 3);
        this.f34585c = applicationLogger.optInt("console", 3);
        this.f34586d = applicationLogger.optBoolean(Ib.f34675d, false);
    }

    public final int a() {
        return this.f34585c;
    }

    public final int b() {
        return this.f34584b;
    }

    public final int c() {
        return this.f34583a;
    }

    public final boolean d() {
        return this.f34586d;
    }
}
