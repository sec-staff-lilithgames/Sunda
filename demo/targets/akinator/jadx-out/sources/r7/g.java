package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f83890b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f83891c;

    /* renamed from: e, reason: collision with root package name */
    public static final g f83892e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f83893f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f83894g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f83895h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g[] f83896i;

    static {
        g gVar = new g("SET_ANIMATION", 0);
        f83890b = gVar;
        g gVar2 = new g("SET_PROGRESS", 1);
        f83891c = gVar2;
        g gVar3 = new g("SET_REPEAT_MODE", 2);
        f83892e = gVar3;
        g gVar4 = new g("SET_REPEAT_COUNT", 3);
        f83893f = gVar4;
        g gVar5 = new g("SET_IMAGE_ASSETS", 4);
        f83894g = gVar5;
        g gVar6 = new g("PLAY_OPTION", 5);
        f83895h = gVar6;
        f83896i = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f83896i.clone();
    }
}
