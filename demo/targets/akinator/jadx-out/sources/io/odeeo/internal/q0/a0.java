package io.odeeo.internal.q0;

import io.odeeo.internal.b.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final d f65833a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f65834b;

    /* renamed from: c, reason: collision with root package name */
    public long f65835c;

    /* renamed from: e, reason: collision with root package name */
    public long f65836e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f65837f = k0.f62782d;

    public a0(d dVar) {
        this.f65833a = dVar;
    }

    @Override // io.odeeo.internal.q0.r
    public k0 getPlaybackParameters() {
        return this.f65837f;
    }

    @Override // io.odeeo.internal.q0.r
    public long getPositionUs() {
        long j10 = this.f65835c;
        if (!this.f65834b) {
            return j10;
        }
        long jElapsedRealtime = this.f65833a.elapsedRealtime() - this.f65836e;
        k0 k0Var = this.f65837f;
        return (k0Var.f62784a == 1.0f ? g0.msToUs(jElapsedRealtime) : k0Var.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime)) + j10;
    }

    public void resetPosition(long j10) {
        this.f65835c = j10;
        if (this.f65834b) {
            this.f65836e = this.f65833a.elapsedRealtime();
        }
    }

    @Override // io.odeeo.internal.q0.r
    public void setPlaybackParameters(k0 k0Var) {
        if (this.f65834b) {
            resetPosition(getPositionUs());
        }
        this.f65837f = k0Var;
    }

    public void start() {
        if (this.f65834b) {
            return;
        }
        this.f65836e = this.f65833a.elapsedRealtime();
        this.f65834b = true;
    }

    public void stop() {
        if (this.f65834b) {
            resetPosition(getPositionUs());
            this.f65834b = false;
        }
    }
}
