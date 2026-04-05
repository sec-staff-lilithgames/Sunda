package o5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: b, reason: collision with root package name */
    public static final g2 f77579b;

    /* renamed from: c, reason: collision with root package name */
    public static final g2 f77580c;

    /* renamed from: e, reason: collision with root package name */
    public static final g2 f77581e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g2[] f77582f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f77583g;

    static {
        g2 g2Var = new g2("DEFERRED", 0);
        f77579b = g2Var;
        g2 g2Var2 = new g2("IMMEDIATE", 1);
        f77580c = g2Var2;
        g2 g2Var3 = new g2("EXCLUSIVE", 2);
        f77581e = g2Var3;
        g2[] g2VarArr = {g2Var, g2Var2, g2Var3};
        f77582f = g2VarArr;
        f77583g = cv.b.enumEntries(g2VarArr);
    }

    public static cv.a getEntries() {
        return f77583g;
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f77582f.clone();
    }
}
