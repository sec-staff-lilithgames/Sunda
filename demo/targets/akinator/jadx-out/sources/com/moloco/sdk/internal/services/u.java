package com.moloco.sdk.internal.services;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f47174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47176c;

    public u(String applicationName, String packageName, String version) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationName, "applicationName");
        kotlin.jvm.internal.e0.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.e0.checkNotNullParameter(version, "version");
        this.f47174a = applicationName;
        this.f47175b = packageName;
        this.f47176c = version;
    }

    public final String a() {
        return this.f47174a;
    }

    public final String b() {
        return this.f47175b;
    }

    public final String c() {
        return this.f47176c;
    }
}
