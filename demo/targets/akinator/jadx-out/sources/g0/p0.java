package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f56549b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f56550c;

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f56551e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p0[] f56552f;

    static {
        p0 p0Var = new p0("Vertical", 0);
        f56549b = p0Var;
        p0 p0Var2 = new p0("Horizontal", 1);
        f56550c = p0Var2;
        p0 p0Var3 = new p0("Both", 2);
        f56551e = p0Var3;
        f56552f = new p0[]{p0Var, p0Var2, p0Var3};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f56552f.clone();
    }
}
