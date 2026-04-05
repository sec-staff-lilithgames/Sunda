package tm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f86992b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f86993c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f86994e;

    static {
        b0 b0Var = new b0("Static", 0);
        f86992b = b0Var;
        b0 b0Var2 = new b0("Video", 1);
        b0 b0Var3 = new b0("Rewarded", 2);
        f86993c = b0Var3;
        f86994e = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f86994e.clone();
    }
}
