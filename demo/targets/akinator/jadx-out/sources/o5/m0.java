package o5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f77652b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f77653c;

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f77654e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m0[] f77655f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f77656g;

    static {
        m0 m0Var = new m0("NO_OP", 0);
        f77652b = m0Var;
        m0 m0Var2 = new m0("ADD", 1);
        f77653c = m0Var2;
        m0 m0Var3 = new m0("REMOVE", 2);
        f77654e = m0Var3;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
        f77655f = m0VarArr;
        f77656g = cv.b.enumEntries(m0VarArr);
    }

    public static cv.a getEntries() {
        return f77656g;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f77655f.clone();
    }
}
