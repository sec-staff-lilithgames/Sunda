package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f71664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71666c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71667d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71668e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71669f;

    /* renamed from: g, reason: collision with root package name */
    public final long f71670g;

    public i(l lVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f71664a = lVar;
        this.f71665b = j10;
        this.f71666c = j11;
        this.f71667d = j12;
        this.f71668e = j13;
        this.f71669f = j14;
        this.f71670g = j15;
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71665b;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        return new w0(new z0(j10, k.a(this.f71664a.timeUsToTargetTime(j10), this.f71666c, this.f71667d, this.f71668e, this.f71669f, this.f71670g)));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }

    public long timeUsToTargetTime(long j10) {
        return this.f71664a.timeUsToTargetTime(j10);
    }
}
