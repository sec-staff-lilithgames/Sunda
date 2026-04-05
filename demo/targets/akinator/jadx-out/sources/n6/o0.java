package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f75776b;

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f75777c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o0[] f75778e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75779f;

    static {
        o0 o0Var = new o0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f75776b = o0Var;
        o0 o0Var2 = new o0("DROP_WORK_REQUEST", 1);
        f75777c = o0Var2;
        o0[] o0VarArr = {o0Var, o0Var2};
        f75778e = o0VarArr;
        f75779f = cv.b.enumEntries(o0VarArr);
    }

    public static cv.a getEntries() {
        return f75779f;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f75778e.clone();
    }
}
