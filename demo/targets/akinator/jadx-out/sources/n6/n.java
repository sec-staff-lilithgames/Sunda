package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f75767b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f75768c;

    /* renamed from: e, reason: collision with root package name */
    public static final n f75769e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f75770f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n[] f75771g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75772h;

    static {
        n nVar = new n("REPLACE", 0);
        f75767b = nVar;
        n nVar2 = new n("KEEP", 1);
        f75768c = nVar2;
        n nVar3 = new n("APPEND", 2);
        f75769e = nVar3;
        n nVar4 = new n("APPEND_OR_REPLACE", 3);
        f75770f = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f75771g = nVarArr;
        f75772h = cv.b.enumEntries(nVarArr);
    }

    public static cv.a getEntries() {
        return f75772h;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f75771g.clone();
    }
}
