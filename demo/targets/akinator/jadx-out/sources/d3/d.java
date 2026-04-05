package d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f51748b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f51749c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f51750e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f51751f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f51752g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f51753h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f51754i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f51755j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ d[] f51756k;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("NONE", 0);
        d dVar2 = new d("LEFT", 1);
        f51748b = dVar2;
        d dVar3 = new d("TOP", 2);
        f51749c = dVar3;
        d dVar4 = new d("RIGHT", 3);
        f51750e = dVar4;
        d dVar5 = new d("BOTTOM", 4);
        f51751f = dVar5;
        d dVar6 = new d("BASELINE", 5);
        f51752g = dVar6;
        d dVar7 = new d("CENTER", 6);
        f51753h = dVar7;
        d dVar8 = new d("CENTER_X", 7);
        f51754i = dVar8;
        d dVar9 = new d("CENTER_Y", 8);
        f51755j = dVar9;
        f51756k = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f51756k.clone();
    }
}
