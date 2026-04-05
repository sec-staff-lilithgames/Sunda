package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x6 {

    /* renamed from: b, reason: collision with root package name */
    public static final x6 f91190b;

    /* renamed from: c, reason: collision with root package name */
    public static final x6 f91191c;

    /* renamed from: e, reason: collision with root package name */
    public static final x6 f91192e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x6[] f91193f;

    static {
        x6 x6Var = new x6("FAKE", 0);
        f91190b = x6Var;
        x6 x6Var2 = new x6("MTLS", 1);
        f91191c = x6Var2;
        x6 x6Var3 = new x6("CUSTOM_MANAGERS", 2);
        f91192e = x6Var3;
        f91193f = new x6[]{x6Var, x6Var2, x6Var3};
    }

    public static x6 valueOf(String str) {
        return (x6) Enum.valueOf(x6.class, str);
    }

    public static x6[] values() {
        return (x6[]) f91193f.clone();
    }
}
