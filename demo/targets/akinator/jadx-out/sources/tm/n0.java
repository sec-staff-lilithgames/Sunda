package tm;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f87102b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f87103c;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f87104e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f87105f;

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f87106g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n0[] f87107h;

    static {
        n0 n0Var = new n0("LOADING", 0);
        f87102b = n0Var;
        n0 n0Var2 = new n0("DEFAULT", 1);
        f87103c = n0Var2;
        n0 n0Var3 = new n0("RESIZED", 2);
        f87104e = n0Var3;
        n0 n0Var4 = new n0("EXPANDED", 3);
        f87105f = n0Var4;
        n0 n0Var5 = new n0("HIDDEN", 4);
        f87106g = n0Var5;
        f87107h = new n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f87107h.clone();
    }

    public String toJsString() {
        return toString().toLowerCase(Locale.US);
    }
}
