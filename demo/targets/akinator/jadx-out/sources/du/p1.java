package du;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p1 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f52814b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p1[] f52815c;

    static {
        p1 p1Var = new p1("INSTANCE", 0);
        f52814b = p1Var;
        f52815c = new p1[]{p1Var};
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f52815c.clone();
    }

    @Override // st.o
    public tw.b apply(mt.t0 t0Var) {
        return new r2(t0Var);
    }
}
