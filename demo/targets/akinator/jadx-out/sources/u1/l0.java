package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f87623b;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f87624c;

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f87625e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l0[] f87626f;

    static {
        l0 l0Var = new l0("Unknown", 0);
        f87623b = l0Var;
        l0 l0Var2 = new l0("Dispatching", 1);
        f87624c = l0Var2;
        l0 l0Var3 = new l0("NotDispatching", 2);
        f87625e = l0Var3;
        f87626f = new l0[]{l0Var, l0Var2, l0Var3};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f87626f.clone();
    }
}
