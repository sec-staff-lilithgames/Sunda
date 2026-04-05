package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f97282b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f97283c;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f97284e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c0[] f97285f;

    static {
        c0 c0Var = new c0("Measuring", 0);
        f97282b = c0Var;
        c0 c0Var2 = new c0("LayingOut", 1);
        f97283c = c0Var2;
        c0 c0Var3 = new c0("Idle", 2);
        f97284e = c0Var3;
        f97285f = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f97285f.clone();
    }
}
