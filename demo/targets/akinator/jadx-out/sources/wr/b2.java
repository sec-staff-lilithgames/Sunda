package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f90824b;

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f90825c;

    /* renamed from: e, reason: collision with root package name */
    public static final b2 f90826e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b2[] f90827f;

    /* JADX INFO: Fake field, exist only in values array */
    b2 EF0;

    static {
        b2 b2Var = new b2("CT_UNKNOWN", 0);
        b2 b2Var2 = new b2("CT_INFO", 1);
        f90824b = b2Var2;
        b2 b2Var3 = new b2("CT_WARNING", 2);
        f90825c = b2Var3;
        b2 b2Var4 = new b2("CT_ERROR", 3);
        f90826e = b2Var4;
        f90827f = new b2[]{b2Var, b2Var2, b2Var3, b2Var4};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f90827f.clone();
    }
}
