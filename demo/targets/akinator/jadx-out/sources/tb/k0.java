package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f86732b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f86733c;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f86734e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k0[] f86735f;

    static {
        k0 k0Var = new k0("AUTO", 0);
        f86732b = k0Var;
        k0 k0Var2 = new k0("READ_ONLY", 1);
        f86733c = k0Var2;
        k0 k0Var3 = new k0("WRITE_ONLY", 2);
        f86734e = k0Var3;
        f86735f = new k0[]{k0Var, k0Var2, k0Var3, new k0("READ_WRITE", 3)};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f86735f.clone();
    }
}
