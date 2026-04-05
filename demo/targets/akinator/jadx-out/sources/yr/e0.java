package yr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f94876b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f94877c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e0[] f94878e;

    static {
        e0 e0Var = new e0("INBOUND", 0);
        f94876b = e0Var;
        e0 e0Var2 = new e0("OUTBOUND", 1);
        f94877c = e0Var2;
        f94878e = new e0[]{e0Var, e0Var2};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f94878e.clone();
    }
}
