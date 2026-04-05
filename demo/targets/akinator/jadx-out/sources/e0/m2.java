package e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: b, reason: collision with root package name */
    public static final m2 f53183b;

    /* renamed from: c, reason: collision with root package name */
    public static final m2 f53184c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m2[] f53185e;

    static {
        m2 m2Var = new m2("Vertical", 0);
        f53183b = m2Var;
        m2 m2Var2 = new m2("Horizontal", 1);
        f53184c = m2Var2;
        f53185e = new m2[]{m2Var, m2Var2};
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) f53185e.clone();
    }
}
