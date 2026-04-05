package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f86767b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f86768c;

    /* renamed from: e, reason: collision with root package name */
    public static final s f86769e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f86770f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f86771g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f86772h;

    /* renamed from: i, reason: collision with root package name */
    public static final s f86773i;

    /* renamed from: j, reason: collision with root package name */
    public static final s f86774j;

    /* renamed from: k, reason: collision with root package name */
    public static final s f86775k;

    /* renamed from: l, reason: collision with root package name */
    public static final s f86776l;

    /* renamed from: m, reason: collision with root package name */
    public static final s f86777m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s[] f86778n;

    static {
        s sVar = new s("BINARY", 0);
        f86767b = sVar;
        s sVar2 = new s("BOOLEAN", 1);
        s sVar3 = new s("NUMBER", 2);
        f86768c = sVar3;
        s sVar4 = new s("NUMBER_FLOAT", 3);
        f86769e = sVar4;
        s sVar5 = new s("NUMBER_INT", 4);
        f86770f = sVar5;
        s sVar6 = new s("STRING", 5);
        f86771g = sVar6;
        s sVar7 = new s("SCALAR", 6);
        f86772h = sVar7;
        s sVar8 = new s("ARRAY", 7);
        f86773i = sVar8;
        s sVar9 = new s("OBJECT", 8);
        f86774j = sVar9;
        s sVar10 = new s("ANY", 9);
        f86775k = sVar10;
        s sVar11 = new s("NATURAL", 10);
        f86776l = sVar11;
        s sVar12 = new s("POJO", 11);
        f86777m = sVar12;
        f86778n = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f86778n.clone();
    }

    public boolean isNumeric() {
        return this == f86768c || this == f86770f || this == f86769e;
    }

    public boolean isStructured() {
        return this == f86774j || this == f86773i || this == f86777m;
    }

    public static boolean isNumeric(s sVar) {
        return sVar != null && sVar.isNumeric();
    }

    public static boolean isStructured(s sVar) {
        return sVar != null && sVar.isStructured();
    }
}
