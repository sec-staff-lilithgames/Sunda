package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f82775c = new j().build();

    /* renamed from: a, reason: collision with root package name */
    public final long f82776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82777b;

    public k(long j10, long j11) {
        this.f82776a = j10;
        this.f82777b = j11;
    }

    public static k getDefaultInstance() {
        return f82775c;
    }

    public static j newBuilder() {
        return new j();
    }

    public long getCurrentCacheSizeBytes() {
        return this.f82776a;
    }

    public long getMaxCacheSizeBytes() {
        return this.f82777b;
    }
}
