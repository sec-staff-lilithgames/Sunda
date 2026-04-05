package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z1 implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f61625b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f61626c;

    /* renamed from: e, reason: collision with root package name */
    public long f61627e;

    /* renamed from: f, reason: collision with root package name */
    public long f61628f;

    /* renamed from: g, reason: collision with root package name */
    public gn.c1 f61629g = gn.c1.f57844d;

    public z1(io.bidmachine.media3.common.util.g gVar) {
        this.f61625b = gVar;
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public gn.c1 getPlaybackParameters() {
        return this.f61629g;
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public long getPositionUs() {
        long j10 = this.f61627e;
        if (!this.f61626c) {
            return j10;
        }
        long jElapsedRealtime = ((io.bidmachine.media3.common.util.q0) this.f61625b).elapsedRealtime() - this.f61628f;
        gn.c1 c1Var = this.f61629g;
        return (c1Var.f57847a == 1.0f ? io.bidmachine.media3.common.util.a1.msToUs(jElapsedRealtime) : c1Var.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime)) + j10;
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public /* bridge */ /* synthetic */ boolean hasSkippedSilenceSinceLastCall() {
        return super.hasSkippedSilenceSinceLastCall();
    }

    public void resetPosition(long j10) {
        this.f61627e = j10;
        if (this.f61626c) {
            this.f61628f = ((io.bidmachine.media3.common.util.q0) this.f61625b).elapsedRealtime();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public void setPlaybackParameters(gn.c1 c1Var) {
        if (this.f61626c) {
            resetPosition(getPositionUs());
        }
        this.f61629g = c1Var;
    }

    public void start() {
        if (this.f61626c) {
            return;
        }
        this.f61628f = ((io.bidmachine.media3.common.util.q0) this.f61625b).elapsedRealtime();
        this.f61626c = true;
    }

    public void stop() {
        if (this.f61626c) {
            resetPosition(getPositionUs());
            this.f61626c = false;
        }
    }
}
