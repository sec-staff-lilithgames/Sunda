package xr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f92748b;

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f92749c;

    /* renamed from: e, reason: collision with root package name */
    public static final l1 f92750e;

    /* renamed from: f, reason: collision with root package name */
    public static final l1 f92751f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l1[] f92752g;

    static {
        l1 l1Var = new l1("PROCESSED", 0);
        f92748b = l1Var;
        l1 l1Var2 = new l1("REFUSED", 1);
        f92749c = l1Var2;
        l1 l1Var3 = new l1("DROPPED", 2);
        f92750e = l1Var3;
        l1 l1Var4 = new l1("MISCARRIED", 3);
        f92751f = l1Var4;
        f92752g = new l1[]{l1Var, l1Var2, l1Var3, l1Var4};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) f92752g.clone();
    }
}
