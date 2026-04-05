package av;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8222b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f8223c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f8224e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f8225f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f8226g;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f8222b = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f8223c = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f8224e = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f8225f = aVarArr;
        f8226g = cv.b.enumEntries(aVarArr);
    }

    public static cv.a getEntries() {
        return f8226g;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8225f.clone();
    }
}
