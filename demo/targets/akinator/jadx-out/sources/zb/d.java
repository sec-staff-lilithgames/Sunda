package zb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f97747b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f97748c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f97749e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f97750f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f97751g;

    static {
        d dVar = new d("NO_MATCH", 0);
        f97747b = dVar;
        d dVar2 = new d("INCONCLUSIVE", 1);
        f97748c = dVar2;
        d dVar3 = new d("WEAK_MATCH", 2);
        f97749e = dVar3;
        d dVar4 = new d("SOLID_MATCH", 3);
        f97750f = dVar4;
        f97751g = new d[]{dVar, dVar2, dVar3, dVar4, new d("FULL_MATCH", 4)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f97751g.clone();
    }
}
