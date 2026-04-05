package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f93153f = new t0();

    /* renamed from: e, reason: collision with root package name */
    public volatile long f93158e;

    /* renamed from: b, reason: collision with root package name */
    public final y6 f93155b = z6.create();

    /* renamed from: c, reason: collision with root package name */
    public final y6 f93156c = z6.create();

    /* renamed from: d, reason: collision with root package name */
    public final y6 f93157d = z6.create();

    /* renamed from: a, reason: collision with root package name */
    public final bf f93154a = cf.f92362a;

    public static u0 getDefaultFactory() {
        return f93153f;
    }

    public final void a(wr.x1 x1Var) {
        x1Var.setCallsStarted(this.f93155b.value()).setCallsSucceeded(this.f93156c.value()).setCallsFailed(this.f93157d.value()).setLastCallStartedNanos(this.f93158e);
    }

    public void reportCallEnded(boolean z10) {
        if (z10) {
            this.f93156c.add(1L);
        } else {
            this.f93157d.add(1L);
        }
    }

    public void reportCallStarted() {
        this.f93155b.add(1L);
        this.f93158e = this.f93154a.currentTimeNanos();
    }
}
