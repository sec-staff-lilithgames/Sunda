package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f80522b;

    /* renamed from: c, reason: collision with root package name */
    public static final v2 f80523c;

    /* renamed from: e, reason: collision with root package name */
    public static final v2 f80524e;

    /* renamed from: f, reason: collision with root package name */
    public static final v2 f80525f;

    /* renamed from: g, reason: collision with root package name */
    public static final v2 f80526g;

    /* renamed from: h, reason: collision with root package name */
    public static final v2 f80527h;

    /* renamed from: i, reason: collision with root package name */
    public static final v2 f80528i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v2[] f80529j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cv.a f80530k;

    static {
        v2 v2Var = new v2("Invalid", 0);
        f80522b = v2Var;
        v2 v2Var2 = new v2("Cancelled", 1);
        f80523c = v2Var2;
        v2 v2Var3 = new v2("InitialPending", 2);
        f80524e = v2Var3;
        v2 v2Var4 = new v2("RecomposePending", 3);
        f80525f = v2Var4;
        v2 v2Var5 = new v2("Recomposing", 4);
        f80526g = v2Var5;
        v2 v2Var6 = new v2("ApplyPending", 5);
        f80527h = v2Var6;
        v2 v2Var7 = new v2("Applied", 6);
        f80528i = v2Var7;
        v2[] v2VarArr = {v2Var, v2Var2, v2Var3, v2Var4, v2Var5, v2Var6, v2Var7};
        f80529j = v2VarArr;
        f80530k = cv.b.enumEntries(v2VarArr);
    }

    public static cv.a getEntries() {
        return f80530k;
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) f80529j.clone();
    }
}
