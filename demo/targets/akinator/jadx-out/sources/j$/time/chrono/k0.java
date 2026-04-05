package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k0 implements n {
    public static final k0 BE;
    public static final k0 BEFORE_BE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k0[] f68491a;

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f68491a.clone();
    }

    static {
        k0 k0Var = new k0("BEFORE_BE", 0);
        BEFORE_BE = k0Var;
        k0 k0Var2 = new k0("BE", 1);
        BE = k0Var2;
        f68491a = new k0[]{k0Var, k0Var2};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }
}
