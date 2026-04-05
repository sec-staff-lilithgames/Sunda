package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e0 implements n {
    public static final e0 BEFORE_ROC;
    public static final e0 ROC;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0[] f68474a;

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f68474a.clone();
    }

    static {
        e0 e0Var = new e0("BEFORE_ROC", 0);
        BEFORE_ROC = e0Var;
        e0 e0Var2 = new e0("ROC", 1);
        ROC = e0Var2;
        f68474a = new e0[]{e0Var, e0Var2};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }
}
