package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f75680b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f75681c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f75682e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75683f;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        f75680b = aVar;
        a aVar2 = new a("LINEAR", 1);
        f75681c = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f75682e = aVarArr;
        f75683f = cv.b.enumEntries(aVarArr);
    }

    public static cv.a getEntries() {
        return f75683f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f75682e.clone();
    }
}
