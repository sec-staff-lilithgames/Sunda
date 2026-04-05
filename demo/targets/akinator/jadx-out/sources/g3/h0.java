package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f56973b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f56974c;

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f56975e;

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f56976f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h0[] f56977g;

    static {
        h0 h0Var = new h0("UNDEFINED", 0);
        f56973b = h0Var;
        h0 h0Var2 = new h0("SETUP", 1);
        f56974c = h0Var2;
        h0 h0Var3 = new h0("MOVING", 2);
        f56975e = h0Var3;
        h0 h0Var4 = new h0("FINISHED", 3);
        f56976f = h0Var4;
        f56977g = new h0[]{h0Var, h0Var2, h0Var3, h0Var4};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f56977g.clone();
    }
}
