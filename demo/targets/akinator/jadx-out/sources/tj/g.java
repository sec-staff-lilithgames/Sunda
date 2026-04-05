package tj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f86942b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f86943c;

    /* renamed from: e, reason: collision with root package name */
    public static final g f86944e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f86945f;

    static {
        g gVar = new g("BAD_CONFIG", 0);
        f86942b = gVar;
        g gVar2 = new g("UNAVAILABLE", 1);
        f86943c = gVar2;
        g gVar3 = new g("TOO_MANY_REQUESTS", 2);
        f86944e = gVar3;
        f86945f = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f86945f.clone();
    }
}
