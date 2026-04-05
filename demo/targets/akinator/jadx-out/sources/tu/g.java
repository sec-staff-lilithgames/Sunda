package tu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f87378b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f87379c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cv.a f87380e;

    static {
        g gVar = new g("WARNING", 0);
        f87378b = gVar;
        g[] gVarArr = {gVar, new g("ERROR", 1), new g("HIDDEN", 2)};
        f87379c = gVarArr;
        f87380e = cv.b.enumEntries(gVarArr);
    }

    public static cv.a getEntries() {
        return f87380e;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f87379c.clone();
    }
}
