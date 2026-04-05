package mh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d2 implements q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f74601b;

    /* renamed from: c, reason: collision with root package name */
    public static final a2 f74602c;

    /* renamed from: e, reason: collision with root package name */
    public static final b2 f74603e;

    /* renamed from: f, reason: collision with root package name */
    public static final c2 f74604f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d2[] f74605g;

    static {
        z1 z1Var = new z1();
        f74601b = z1Var;
        a2 a2Var = new a2();
        f74602c = a2Var;
        b2 b2Var = new b2();
        f74603e = b2Var;
        c2 c2Var = new c2();
        f74604f = c2Var;
        f74605g = new d2[]{z1Var, a2Var, b2Var, c2Var};
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f74605g.clone();
    }

    public abstract /* synthetic */ boolean apply(Object obj);
}
