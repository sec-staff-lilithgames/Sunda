package io.odeeo.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements io.odeeo.internal.q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.a0 f62776a;

    /* renamed from: b, reason: collision with root package name */
    public final a f62777b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f62778c;

    /* renamed from: e, reason: collision with root package name */
    public io.odeeo.internal.q0.r f62779e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62780f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62781g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onPlaybackParametersChanged(k0 k0Var);
    }

    public k(a aVar, io.odeeo.internal.q0.d dVar) {
        this.f62777b = aVar;
        this.f62776a = new io.odeeo.internal.q0.a0(dVar);
    }

    public final boolean a(boolean z10) {
        p0 p0Var = this.f62778c;
        if (p0Var == null || p0Var.isEnded()) {
            return true;
        }
        if (this.f62778c.isReady()) {
            return false;
        }
        return z10 || this.f62778c.hasReadStreamToEnd();
    }

    public final void b(boolean z10) {
        if (a(z10)) {
            this.f62780f = true;
            if (this.f62781g) {
                this.f62776a.start();
                return;
            }
            return;
        }
        io.odeeo.internal.q0.r rVar = (io.odeeo.internal.q0.r) io.odeeo.internal.q0.a.checkNotNull(this.f62779e);
        long positionUs = rVar.getPositionUs();
        if (this.f62780f) {
            if (positionUs < this.f62776a.getPositionUs()) {
                this.f62776a.stop();
                return;
            } else {
                this.f62780f = false;
                if (this.f62781g) {
                    this.f62776a.start();
                }
            }
        }
        this.f62776a.resetPosition(positionUs);
        k0 playbackParameters = rVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f62776a.getPlaybackParameters())) {
            return;
        }
        this.f62776a.setPlaybackParameters(playbackParameters);
        this.f62777b.onPlaybackParametersChanged(playbackParameters);
    }

    @Override // io.odeeo.internal.q0.r
    public k0 getPlaybackParameters() {
        io.odeeo.internal.q0.r rVar = this.f62779e;
        return rVar != null ? rVar.getPlaybackParameters() : this.f62776a.getPlaybackParameters();
    }

    @Override // io.odeeo.internal.q0.r
    public long getPositionUs() {
        return this.f62780f ? this.f62776a.getPositionUs() : ((io.odeeo.internal.q0.r) io.odeeo.internal.q0.a.checkNotNull(this.f62779e)).getPositionUs();
    }

    public void onRendererDisabled(p0 p0Var) {
        if (p0Var == this.f62778c) {
            this.f62779e = null;
            this.f62778c = null;
            this.f62780f = true;
        }
    }

    public void onRendererEnabled(p0 p0Var) throws n {
        io.odeeo.internal.q0.r rVar;
        io.odeeo.internal.q0.r mediaClock = p0Var.getMediaClock();
        if (mediaClock == null || mediaClock == (rVar = this.f62779e)) {
            return;
        }
        if (rVar != null) {
            throw n.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f62779e = mediaClock;
        this.f62778c = p0Var;
        mediaClock.setPlaybackParameters(this.f62776a.getPlaybackParameters());
    }

    public void resetPosition(long j10) {
        this.f62776a.resetPosition(j10);
    }

    @Override // io.odeeo.internal.q0.r
    public void setPlaybackParameters(k0 k0Var) {
        io.odeeo.internal.q0.r rVar = this.f62779e;
        if (rVar != null) {
            rVar.setPlaybackParameters(k0Var);
            k0Var = this.f62779e.getPlaybackParameters();
        }
        this.f62776a.setPlaybackParameters(k0Var);
    }

    public void start() {
        this.f62781g = true;
        this.f62776a.start();
    }

    public void stop() {
        this.f62781g = false;
        this.f62776a.stop();
    }

    public long syncAndGetPositionUs(boolean z10) {
        b(z10);
        return getPositionUs();
    }
}
