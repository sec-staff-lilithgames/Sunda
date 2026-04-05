package io.bidmachine.iab.vast;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f60481b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f60482c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f60483e;

    static {
        b0 b0Var = new b0("NonRewarded", 0);
        f60481b = b0Var;
        b0 b0Var2 = new b0("Rewarded", 1);
        f60482c = b0Var2;
        f60483e = new b0[]{b0Var, b0Var2};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f60483e.clone();
    }
}
