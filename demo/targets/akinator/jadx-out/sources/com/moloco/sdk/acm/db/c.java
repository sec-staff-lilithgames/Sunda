package com.moloco.sdk.acm.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f45520b = new c("TIMER", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f45521c = new c("COUNT", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f45522e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f45523f;

    static {
        c[] cVarArrA = a();
        f45522e = cVarArrA;
        f45523f = cv.b.enumEntries(cVarArrA);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f45520b, f45521c};
    }

    public static cv.a b() {
        return f45523f;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f45522e.clone();
    }
}
