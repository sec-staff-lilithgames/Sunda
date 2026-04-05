package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f88349b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f88350c;

    /* renamed from: e, reason: collision with root package name */
    public static final s f88351e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f88352f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f88353g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f88354h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s[] f88355i;

    static {
        s sVar = new s("INT", 0);
        f88349b = sVar;
        s sVar2 = new s("LONG", 1);
        f88350c = sVar2;
        s sVar3 = new s("BIG_INTEGER", 2);
        f88351e = sVar3;
        s sVar4 = new s("FLOAT", 3);
        f88352f = sVar4;
        s sVar5 = new s("DOUBLE", 4);
        f88353g = sVar5;
        s sVar6 = new s("BIG_DECIMAL", 5);
        f88354h = sVar6;
        f88355i = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f88355i.clone();
    }
}
