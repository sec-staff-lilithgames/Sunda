package bj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f9689b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f9690c;

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f9691e;

    /* renamed from: f, reason: collision with root package name */
    public static final z0 f9692f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z0[] f9693g;

    static {
        z0 z0Var = new z0("UNKNOWN_DISMISS_TYPE", 0);
        f9689b = z0Var;
        z0 z0Var2 = new z0("AUTO", 1);
        f9690c = z0Var2;
        z0 z0Var3 = new z0("CLICK", 2);
        f9691e = z0Var3;
        z0 z0Var4 = new z0("SWIPE", 3);
        f9692f = z0Var4;
        f9693g = new z0[]{z0Var, z0Var2, z0Var3, z0Var4};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f9693g.clone();
    }
}
