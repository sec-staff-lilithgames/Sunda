package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z1 f61518b;

    /* renamed from: c, reason: collision with root package name */
    public final p f61519c;

    /* renamed from: e, reason: collision with root package name */
    public s1 f61520e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f61521f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f61522g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f61523h;

    public q(p pVar, io.bidmachine.media3.common.util.g gVar) {
        this.f61519c = pVar;
        this.f61518b = new z1(gVar);
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public gn.c1 getPlaybackParameters() {
        x0 x0Var = this.f61521f;
        return x0Var != null ? x0Var.getPlaybackParameters() : this.f61518b.getPlaybackParameters();
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public long getPositionUs() {
        return this.f61522g ? this.f61518b.getPositionUs() : ((x0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61521f)).getPositionUs();
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public boolean hasSkippedSilenceSinceLastCall() {
        return this.f61522g ? this.f61518b.hasSkippedSilenceSinceLastCall() : ((x0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61521f)).hasSkippedSilenceSinceLastCall();
    }

    public void onRendererDisabled(s1 s1Var) {
        if (s1Var == this.f61520e) {
            this.f61521f = null;
            this.f61520e = null;
            this.f61522g = true;
        }
    }

    public void onRendererEnabled(s1 s1Var) throws a0 {
        x0 x0Var;
        x0 mediaClock = s1Var.getMediaClock();
        if (mediaClock == null || mediaClock == (x0Var = this.f61521f)) {
            return;
        }
        if (x0Var != null) {
            throw a0.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f61521f = mediaClock;
        this.f61520e = s1Var;
        mediaClock.setPlaybackParameters(this.f61518b.getPlaybackParameters());
    }

    public void resetPosition(long j10) {
        this.f61518b.resetPosition(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public void setPlaybackParameters(gn.c1 c1Var) {
        x0 x0Var = this.f61521f;
        if (x0Var != null) {
            x0Var.setPlaybackParameters(c1Var);
            c1Var = this.f61521f.getPlaybackParameters();
        }
        this.f61518b.setPlaybackParameters(c1Var);
    }

    public void start() {
        this.f61523h = true;
        this.f61518b.start();
    }

    public void stop() {
        this.f61523h = false;
        this.f61518b.stop();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long syncAndGetPositionUs(boolean r7) {
        /*
            r6 = this;
            io.bidmachine.media3.exoplayer.s1 r0 = r6.f61520e
            io.bidmachine.media3.exoplayer.z1 r1 = r6.f61518b
            if (r0 == 0) goto L6a
            boolean r0 = r0.isEnded()
            if (r0 != 0) goto L6a
            if (r7 == 0) goto L17
            io.bidmachine.media3.exoplayer.s1 r0 = r6.f61520e
            int r0 = r0.getState()
            r2 = 2
            if (r0 != r2) goto L6a
        L17:
            io.bidmachine.media3.exoplayer.s1 r0 = r6.f61520e
            boolean r0 = r0.isReady()
            if (r0 != 0) goto L2a
            if (r7 != 0) goto L6a
            io.bidmachine.media3.exoplayer.s1 r7 = r6.f61520e
            boolean r7 = r7.hasReadStreamToEnd()
            if (r7 == 0) goto L2a
            goto L6a
        L2a:
            io.bidmachine.media3.exoplayer.x0 r7 = r6.f61521f
            java.lang.Object r7 = io.bidmachine.media3.common.util.a.checkNotNull(r7)
            io.bidmachine.media3.exoplayer.x0 r7 = (io.bidmachine.media3.exoplayer.x0) r7
            long r2 = r7.getPositionUs()
            boolean r0 = r6.f61522g
            if (r0 == 0) goto L50
            long r4 = r1.getPositionUs()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L46
            r1.stop()
            goto L74
        L46:
            r0 = 0
            r6.f61522g = r0
            boolean r0 = r6.f61523h
            if (r0 == 0) goto L50
            r1.start()
        L50:
            r1.resetPosition(r2)
            gn.c1 r7 = r7.getPlaybackParameters()
            gn.c1 r0 = r1.getPlaybackParameters()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L74
            r1.setPlaybackParameters(r7)
            io.bidmachine.media3.exoplayer.p r0 = r6.f61519c
            r0.onPlaybackParametersChanged(r7)
            goto L74
        L6a:
            r7 = 1
            r6.f61522g = r7
            boolean r7 = r6.f61523h
            if (r7 == 0) goto L74
            r1.start()
        L74:
            long r0 = r6.getPositionUs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.q.syncAndGetPositionUs(boolean):long");
    }
}
