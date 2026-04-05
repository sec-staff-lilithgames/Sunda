package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f86740b;

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f86741c;

    /* renamed from: e, reason: collision with root package name */
    public static final l1 f86742e;

    /* renamed from: f, reason: collision with root package name */
    public static final l1 f86743f;

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f86744g;

    /* renamed from: h, reason: collision with root package name */
    public static final l1 f86745h;

    /* renamed from: i, reason: collision with root package name */
    public static final l1 f86746i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ l1[] f86747j;

    static {
        l1 l1Var = new l1("GETTER", 0);
        f86740b = l1Var;
        l1 l1Var2 = new l1("SETTER", 1);
        f86741c = l1Var2;
        l1 l1Var3 = new l1("FIELD", 2);
        f86742e = l1Var3;
        l1 l1Var4 = new l1("IS_GETTER", 3);
        f86743f = l1Var4;
        l1 l1Var5 = new l1("CREATOR", 4);
        f86744g = l1Var5;
        l1 l1Var6 = new l1("SCALAR_CONSTRUCTOR", 5);
        f86745h = l1Var6;
        l1 l1Var7 = new l1("NONE", 6);
        l1 l1Var8 = new l1("ALL", 7);
        f86746i = l1Var8;
        f86747j = new l1[]{l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7, l1Var8};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) f86747j.clone();
    }

    public boolean creatorEnabled() {
        return this == f86744g || this == f86746i;
    }

    public boolean fieldEnabled() {
        return this == f86742e || this == f86746i;
    }

    public boolean getterEnabled() {
        return this == f86740b || this == f86746i;
    }

    public boolean isGetterEnabled() {
        return this == f86743f || this == f86746i;
    }

    public boolean scalarConstructorEnabled() {
        return this == f86745h || this == f86746i;
    }

    public boolean setterEnabled() {
        return this == f86741c || this == f86746i;
    }
}
