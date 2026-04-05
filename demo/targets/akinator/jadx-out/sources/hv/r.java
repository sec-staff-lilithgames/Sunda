package hv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f59245b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f59246c;

    /* renamed from: e, reason: collision with root package name */
    public static final r f59247e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r[] f59248f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f59249g;

    static {
        r rVar = new r("INCLUDE_DIRECTORIES", 0);
        f59245b = rVar;
        r rVar2 = new r("BREADTH_FIRST", 1);
        f59246c = rVar2;
        r rVar3 = new r("FOLLOW_LINKS", 2);
        f59247e = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        f59248f = rVarArr;
        f59249g = cv.b.enumEntries(rVarArr);
    }

    public static cv.a getEntries() {
        return f59249g;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f59248f.clone();
    }
}
