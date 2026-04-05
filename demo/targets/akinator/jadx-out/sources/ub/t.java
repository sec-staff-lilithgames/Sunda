package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final t f88356b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f88357c;

    /* renamed from: e, reason: collision with root package name */
    public static final t f88358e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f88359f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t[] f88360g;

    /* JADX INFO: Fake field, exist only in values array */
    t EF0;

    static {
        t tVar = new t("FLOAT16", 0);
        t tVar2 = new t("FLOAT32", 1);
        f88356b = tVar2;
        t tVar3 = new t("DOUBLE64", 2);
        f88357c = tVar3;
        t tVar4 = new t("BIG_DECIMAL", 3);
        f88358e = tVar4;
        t tVar5 = new t("UNKNOWN", 4);
        f88359f = tVar5;
        f88360g = new t[]{tVar, tVar2, tVar3, tVar4, tVar5};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f88360g.clone();
    }
}
