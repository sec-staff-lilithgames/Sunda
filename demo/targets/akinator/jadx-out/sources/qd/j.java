package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public long f82773a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f82774b = 0;

    public k build() {
        return new k(this.f82773a, this.f82774b);
    }

    public j setCurrentCacheSizeBytes(long j10) {
        this.f82773a = j10;
        return this;
    }

    public j setMaxCacheSizeBytes(long j10) {
        this.f82774b = j10;
        return this;
    }
}
