package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f80476b;

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f80477c;

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f80478e;

    /* renamed from: f, reason: collision with root package name */
    public static final t1 f80479f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t1[] f80480g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f80481h;

    static {
        t1 t1Var = new t1("IGNORED", 0);
        f80476b = t1Var;
        t1 t1Var2 = new t1("SCHEDULED", 1);
        f80477c = t1Var2;
        t1 t1Var3 = new t1("DEFERRED", 2);
        f80478e = t1Var3;
        t1 t1Var4 = new t1("IMMINENT", 3);
        f80479f = t1Var4;
        t1[] t1VarArr = {t1Var, t1Var2, t1Var3, t1Var4};
        f80480g = t1VarArr;
        f80481h = cv.b.enumEntries(t1VarArr);
    }

    public static cv.a getEntries() {
        return f80481h;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) f80480g.clone();
    }
}
