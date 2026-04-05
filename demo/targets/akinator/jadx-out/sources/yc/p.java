package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f94331b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f94332c;

    /* renamed from: e, reason: collision with root package name */
    public static final p f94333e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f94334f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f94335g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f94336h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f94337i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f94338j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f94339k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p[] f94340l;

    static {
        p pVar = new p("ARRAY", 0);
        f94331b = pVar;
        p pVar2 = new p("BINARY", 1);
        f94332c = pVar2;
        p pVar3 = new p("BOOLEAN", 2);
        f94333e = pVar3;
        p pVar4 = new p("MISSING", 3);
        f94334f = pVar4;
        p pVar5 = new p("NULL", 4);
        f94335g = pVar5;
        p pVar6 = new p("NUMBER", 5);
        f94336h = pVar6;
        p pVar7 = new p("OBJECT", 6);
        f94337i = pVar7;
        p pVar8 = new p("POJO", 7);
        f94338j = pVar8;
        p pVar9 = new p("STRING", 8);
        f94339k = pVar9;
        f94340l = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f94340l.clone();
    }
}
