package xv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f93567c;

    /* renamed from: e, reason: collision with root package name */
    public static final a1 f93568e;

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f93569f;

    /* renamed from: g, reason: collision with root package name */
    public static final a1 f93570g;

    /* renamed from: h, reason: collision with root package name */
    public static final a1 f93571h;

    /* renamed from: i, reason: collision with root package name */
    public static final a1 f93572i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a1[] f93573j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cv.a f93574k;

    /* renamed from: b, reason: collision with root package name */
    public final String f93575b;

    static {
        a1 a1Var = new a1("TLS_1_3", 0, "TLSv1.3");
        f93568e = a1Var;
        a1 a1Var2 = new a1("TLS_1_2", 1, "TLSv1.2");
        f93569f = a1Var2;
        a1 a1Var3 = new a1("TLS_1_1", 2, "TLSv1.1");
        f93570g = a1Var3;
        a1 a1Var4 = new a1("TLS_1_0", 3, "TLSv1");
        f93571h = a1Var4;
        a1 a1Var5 = new a1("SSL_3_0", 4, "SSLv3");
        f93572i = a1Var5;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4, a1Var5};
        f93573j = a1VarArr;
        f93574k = cv.b.enumEntries(a1VarArr);
        f93567c = new z0(null);
    }

    public a1(String str, int i10, String str2) {
        this.f93575b = str2;
    }

    public static final a1 forJavaName(String str) {
        return f93567c.forJavaName(str);
    }

    public static cv.a getEntries() {
        return f93574k;
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f93573j.clone();
    }

    @tu.f
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m7881deprecated_javaName() {
        return this.f93575b;
    }

    public final String javaName() {
        return this.f93575b;
    }
}
