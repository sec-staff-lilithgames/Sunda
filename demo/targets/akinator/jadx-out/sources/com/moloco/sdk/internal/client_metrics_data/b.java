package com.moloco.sdk.internal.client_metrics_data;

import hr.kNq.ikJMrW;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f45863c = new b(ikJMrW.nmQlndKhxSB, 0, "reason");

    /* renamed from: e, reason: collision with root package name */
    public static final b f45864e = new b("AdType", 1, "ad_type");

    /* renamed from: f, reason: collision with root package name */
    public static final b f45865f = new b("Result", 2, "result");

    /* renamed from: g, reason: collision with root package name */
    public static final b f45866g = new b("Country", 3, "country");

    /* renamed from: h, reason: collision with root package name */
    public static final b f45867h = new b("RetryAttempt", 4, "attempt");

    /* renamed from: i, reason: collision with root package name */
    public static final b f45868i = new b("Step", 5, "step");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f45869j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cv.a f45870k;

    /* renamed from: b, reason: collision with root package name */
    public final String f45871b;

    public b(String str, int i10, String str2) {
        this.f45871b = str2;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f45863c, f45864e, f45865f, f45866g, f45867h, f45868i};
    }

    public static cv.a b() {
        return f45870k;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45869j.clone();
    }

    public final String c() {
        return this.f45871b;
    }

    static {
        b[] bVarArrA = a();
        f45869j = bVarArrA;
        f45870k = cv.b.enumEntries(bVarArrA);
    }
}
