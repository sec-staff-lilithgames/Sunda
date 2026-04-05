package bj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f9605b;

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f9606c;

    /* renamed from: e, reason: collision with root package name */
    public static final a1 f9607e;

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f9608f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a1[] f9609g;

    static {
        a1 a1Var = new a1("UNSPECIFIED_RENDER_ERROR", 0);
        f9605b = a1Var;
        a1 a1Var2 = new a1("IMAGE_FETCH_ERROR", 1);
        f9606c = a1Var2;
        a1 a1Var3 = new a1("IMAGE_DISPLAY_ERROR", 2);
        f9607e = a1Var3;
        a1 a1Var4 = new a1("IMAGE_UNSUPPORTED_FORMAT", 3);
        f9608f = a1Var4;
        f9609g = new a1[]{a1Var, a1Var2, a1Var3, a1Var4};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f9609g.clone();
    }
}
