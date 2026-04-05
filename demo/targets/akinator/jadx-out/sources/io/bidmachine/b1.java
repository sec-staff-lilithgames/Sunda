package io.bidmachine;

import com.inmobi.unification.sdk.InitializationStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f60311b;

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f60312c;

    /* renamed from: e, reason: collision with root package name */
    public static final b1 f60313e;

    /* renamed from: f, reason: collision with root package name */
    public static final b1 f60314f;

    /* renamed from: g, reason: collision with root package name */
    public static final b1 f60315g;

    /* renamed from: h, reason: collision with root package name */
    public static final b1 f60316h;

    /* renamed from: i, reason: collision with root package name */
    public static final b1 f60317i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b1[] f60318j;

    static {
        b1 b1Var = new b1("Idle", 0);
        f60311b = b1Var;
        b1 b1Var2 = new b1("Requesting", 1);
        f60312c = b1Var2;
        b1 b1Var3 = new b1("Loading", 2);
        f60313e = b1Var3;
        b1 b1Var4 = new b1(InitializationStatus.SUCCESS, 3);
        f60314f = b1Var4;
        b1 b1Var5 = new b1("Failed", 4);
        f60315g = b1Var5;
        b1 b1Var6 = new b1("Destroyed", 5);
        f60316h = b1Var6;
        b1 b1Var7 = new b1("Expired", 6);
        f60317i = b1Var7;
        f60318j = new b1[]{b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f60318j.clone();
    }
}
