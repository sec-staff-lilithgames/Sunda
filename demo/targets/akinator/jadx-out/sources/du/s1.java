package du;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public static final s1 f52840b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s1[] f52841c;

    static {
        s1 s1Var = new s1("INSTANCE", 0);
        f52840b = s1Var;
        f52841c = new s1[]{s1Var};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f52841c.clone();
    }

    @Override // st.o
    public mt.b0 apply(mt.t0 t0Var) {
        return new t2(t0Var);
    }
}
