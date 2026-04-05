package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f86706b;

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f86707c;

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f86708e;

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f86709f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e1[] f86710g;

    /* JADX INFO: Fake field, exist only in values array */
    e1 EF0;

    static {
        e1 e1Var = new e1("SET", 0);
        e1 e1Var2 = new e1("SKIP", 1);
        f86706b = e1Var2;
        e1 e1Var3 = new e1("FAIL", 2);
        f86707c = e1Var3;
        e1 e1Var4 = new e1("AS_EMPTY", 3);
        f86708e = e1Var4;
        e1 e1Var5 = new e1("DEFAULT", 4);
        f86709f = e1Var5;
        f86710g = new e1[]{e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f86710g.clone();
    }
}
