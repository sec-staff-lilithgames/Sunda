package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f82780c = new l().build();

    /* renamed from: a, reason: collision with root package name */
    public final long f82781a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82782b;

    public m(long j10, long j11) {
        this.f82781a = j10;
        this.f82782b = j11;
    }

    public static m getDefaultInstance() {
        return f82780c;
    }

    public static l newBuilder() {
        return new l();
    }

    public long getEndMs() {
        return this.f82782b;
    }

    public long getStartMs() {
        return this.f82781a;
    }
}
