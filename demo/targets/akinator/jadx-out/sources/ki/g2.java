package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g2 {

    /* renamed from: b, reason: collision with root package name */
    public static final g2 f71267b;

    /* renamed from: c, reason: collision with root package name */
    public static final g2 f71268c;

    /* renamed from: e, reason: collision with root package name */
    public static final g2 f71269e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g2[] f71270f;

    static {
        g2 g2Var = new g2("INCOMPLETE", 0);
        f71267b = g2Var;
        g2 g2Var2 = new g2("JAVA", 1);
        f71268c = g2Var2;
        g2 g2Var3 = new g2("NATIVE", 2);
        f71269e = g2Var3;
        f71270f = new g2[]{g2Var, g2Var2, g2Var3};
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f71270f.clone();
    }
}
