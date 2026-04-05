package ee;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f54146a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54147b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54148c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54149d;

    /* renamed from: e, reason: collision with root package name */
    public final long f54150e;

    /* renamed from: f, reason: collision with root package name */
    public final long f54151f;

    /* renamed from: g, reason: collision with root package name */
    public final long f54152g;

    public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f54146a = dVar;
        this.f54147b = j10;
        this.f54148c = j11;
        this.f54149d = j12;
        this.f54150e = j13;
        this.f54151f = j14;
        this.f54152g = j15;
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54147b;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        return new g0(new j0(j10, c.a(this.f54146a.timeUsToTargetTime(j10), this.f54148c, this.f54149d, this.f54150e, this.f54151f, this.f54152g)));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }

    public long timeUsToTargetTime(long j10) {
        return this.f54146a.timeUsToTargetTime(j10);
    }
}
