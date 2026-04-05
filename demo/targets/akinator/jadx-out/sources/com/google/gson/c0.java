package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f29915b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f29916c;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f29917e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c0[] f29918f;

    static {
        c0 c0Var = new c0("LENIENT", 0);
        f29915b = c0Var;
        c0 c0Var2 = new c0("LEGACY_STRICT", 1);
        f29916c = c0Var2;
        c0 c0Var3 = new c0("STRICT", 2);
        f29917e = c0Var3;
        f29918f = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f29918f.clone();
    }
}
