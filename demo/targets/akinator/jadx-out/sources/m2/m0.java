package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f73942b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f73943c;

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f73944e;

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f73945f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m0[] f73946g;

    static {
        m0 m0Var = new m0("StartInput", 0);
        f73942b = m0Var;
        m0 m0Var2 = new m0("StopInput", 1);
        f73943c = m0Var2;
        m0 m0Var3 = new m0("ShowKeyboard", 2);
        f73944e = m0Var3;
        m0 m0Var4 = new m0("HideKeyboard", 3);
        f73945f = m0Var4;
        f73946g = new m0[]{m0Var, m0Var2, m0Var3, m0Var4};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f73946g.clone();
    }
}
