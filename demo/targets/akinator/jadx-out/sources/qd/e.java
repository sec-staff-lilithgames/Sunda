package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f82754a = 0;

    /* renamed from: b, reason: collision with root package name */
    public f f82755b = f.REASON_UNKNOWN;

    public g build() {
        return new g(this.f82754a, this.f82755b);
    }

    public e setEventsDroppedCount(long j10) {
        this.f82754a = j10;
        return this;
    }

    public e setReason(f fVar) {
        this.f82755b = fVar;
        return this;
    }
}
