package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements com.google.android.exoplayer2.util.h0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.b1 f27843b;

    /* renamed from: c, reason: collision with root package name */
    public final n f27844c;

    /* renamed from: e, reason: collision with root package name */
    public z2 f27845e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.util.h0 f27846f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27847g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27848h;

    public o(n nVar, com.google.android.exoplayer2.util.d dVar) {
        this.f27844c = nVar;
        this.f27843b = new com.google.android.exoplayer2.util.b1(dVar);
    }

    @Override // com.google.android.exoplayer2.util.h0
    public l2 getPlaybackParameters() {
        com.google.android.exoplayer2.util.h0 h0Var = this.f27846f;
        return h0Var != null ? h0Var.getPlaybackParameters() : this.f27843b.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.h0
    public long getPositionUs() {
        return this.f27847g ? this.f27843b.getPositionUs() : ((com.google.android.exoplayer2.util.h0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27846f)).getPositionUs();
    }

    public void onRendererDisabled(z2 z2Var) {
        if (z2Var == this.f27845e) {
            this.f27846f = null;
            this.f27845e = null;
            this.f27847g = true;
        }
    }

    public void onRendererEnabled(z2 z2Var) throws r {
        com.google.android.exoplayer2.util.h0 h0Var;
        com.google.android.exoplayer2.util.h0 mediaClock = z2Var.getMediaClock();
        if (mediaClock == null || mediaClock == (h0Var = this.f27846f)) {
            return;
        }
        if (h0Var != null) {
            throw r.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f27846f = mediaClock;
        this.f27845e = z2Var;
        mediaClock.setPlaybackParameters(this.f27843b.getPlaybackParameters());
    }

    public void resetPosition(long j10) {
        this.f27843b.resetPosition(j10);
    }

    @Override // com.google.android.exoplayer2.util.h0
    public void setPlaybackParameters(l2 l2Var) {
        com.google.android.exoplayer2.util.h0 h0Var = this.f27846f;
        if (h0Var != null) {
            h0Var.setPlaybackParameters(l2Var);
            l2Var = this.f27846f.getPlaybackParameters();
        }
        this.f27843b.setPlaybackParameters(l2Var);
    }

    public void start() {
        this.f27848h = true;
        this.f27843b.start();
    }

    public void stop() {
        this.f27848h = false;
        this.f27843b.stop();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long syncAndGetPositionUs(boolean r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.z2 r0 = r6.f27845e
            com.google.android.exoplayer2.util.b1 r1 = r6.f27843b
            if (r0 == 0) goto L5f
            boolean r0 = r0.isEnded()
            if (r0 != 0) goto L5f
            com.google.android.exoplayer2.z2 r0 = r6.f27845e
            boolean r0 = r0.isReady()
            if (r0 != 0) goto L1f
            if (r7 != 0) goto L5f
            com.google.android.exoplayer2.z2 r7 = r6.f27845e
            boolean r7 = r7.hasReadStreamToEnd()
            if (r7 == 0) goto L1f
            goto L5f
        L1f:
            com.google.android.exoplayer2.util.h0 r7 = r6.f27846f
            java.lang.Object r7 = com.google.android.exoplayer2.util.a.checkNotNull(r7)
            com.google.android.exoplayer2.util.h0 r7 = (com.google.android.exoplayer2.util.h0) r7
            long r2 = r7.getPositionUs()
            boolean r0 = r6.f27847g
            if (r0 == 0) goto L45
            long r4 = r1.getPositionUs()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3b
            r1.stop()
            goto L69
        L3b:
            r0 = 0
            r6.f27847g = r0
            boolean r0 = r6.f27848h
            if (r0 == 0) goto L45
            r1.start()
        L45:
            r1.resetPosition(r2)
            com.google.android.exoplayer2.l2 r7 = r7.getPlaybackParameters()
            com.google.android.exoplayer2.l2 r0 = r1.getPlaybackParameters()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L69
            r1.setPlaybackParameters(r7)
            com.google.android.exoplayer2.n r0 = r6.f27844c
            r0.onPlaybackParametersChanged(r7)
            goto L69
        L5f:
            r7 = 1
            r6.f27847g = r7
            boolean r7 = r6.f27848h
            if (r7 == 0) goto L69
            r1.start()
        L69:
            long r0 = r6.getPositionUs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.o.syncAndGetPositionUs(boolean):long");
    }
}
