package ek;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f54609b;

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f54610c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p1[] f54611e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f54612f;

    static {
        p1 p1Var = new p1("GENERAL", 0);
        f54609b = p1Var;
        p1 p1Var2 = new p1("FALLBACK", 1);
        f54610c = p1Var2;
        p1[] p1VarArr = {p1Var, p1Var2};
        f54611e = p1VarArr;
        f54612f = cv.b.enumEntries(p1VarArr);
    }

    public static cv.a getEntries() {
        return f54612f;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f54611e.clone();
    }
}
