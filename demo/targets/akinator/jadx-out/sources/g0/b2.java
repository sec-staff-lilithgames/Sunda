package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f56364b;

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f56365c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b2[] f56366e;

    static {
        b2 b2Var = new b2("Horizontal", 0);
        f56364b = b2Var;
        b2 b2Var2 = new b2("Vertical", 1);
        f56365c = b2Var2;
        f56366e = new b2[]{b2Var, b2Var2};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f56366e.clone();
    }
}
