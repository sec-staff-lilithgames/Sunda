package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final v f80912a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f80913b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f80914c;

    static {
        new u();
        f80912a = new v();
        f80913b = new w();
        new x();
        f80914c = new y();
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(n8.a aVar);

    public abstract boolean isResourceCacheable(boolean z10, n8.a aVar, n8.c cVar);
}
