package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f88905b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g0[] f88906c;

    static {
        g0 g0Var = new g0("Inherit", 0);
        f88905b = g0Var;
        f88906c = new g0[]{g0Var, new g0("SecureOn", 1), new g0("SecureOff", 2)};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f88906c.clone();
    }
}
