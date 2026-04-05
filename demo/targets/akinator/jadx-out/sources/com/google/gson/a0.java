package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f29910b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f29911c;

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f29912e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a0[] f29913f;

    static {
        a0 a0Var = new a0("ALLOW", 0);
        f29910b = a0Var;
        a0 a0Var2 = new a0("INDECISIVE", 1);
        a0 a0Var3 = new a0("BLOCK_INACCESSIBLE", 2);
        f29911c = a0Var3;
        a0 a0Var4 = new a0("BLOCK_ALL", 3);
        f29912e = a0Var4;
        f29913f = new a0[]{a0Var, a0Var2, a0Var3, a0Var4};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f29913f.clone();
    }
}
