package xv;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f93758c;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f93759e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f93760f;

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f93761g;

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f93762h;

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f93763i;

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f93764j;

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f93765k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n0[] f93766l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cv.a f93767m;

    /* renamed from: b, reason: collision with root package name */
    public final String f93768b;

    static {
        n0 n0Var = new n0("HTTP_1_0", 0, "http/1.0");
        f93759e = n0Var;
        n0 n0Var2 = new n0("HTTP_1_1", 1, "http/1.1");
        f93760f = n0Var2;
        n0 n0Var3 = new n0("SPDY_3", 2, "spdy/3.1");
        f93761g = n0Var3;
        n0 n0Var4 = new n0("HTTP_2", 3, "h2");
        f93762h = n0Var4;
        n0 n0Var5 = new n0("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f93763i = n0Var5;
        n0 n0Var6 = new n0("QUIC", 5, "quic");
        f93764j = n0Var6;
        n0 n0Var7 = new n0("HTTP_3", 6, "h3");
        f93765k = n0Var7;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7};
        f93766l = n0VarArr;
        f93767m = cv.b.enumEntries(n0VarArr);
        f93758c = new m0(null);
    }

    public n0(String str, int i10, String str2) {
        this.f93768b = str2;
    }

    public static final n0 get(String str) throws IOException {
        return f93758c.get(str);
    }

    public static cv.a getEntries() {
        return f93767m;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f93766l.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f93768b;
    }
}
