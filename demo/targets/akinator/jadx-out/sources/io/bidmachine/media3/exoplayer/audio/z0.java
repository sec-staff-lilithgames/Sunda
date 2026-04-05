package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.exoplayer.r1;
import io.bidmachine.media3.exoplayer.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f61115a;

    public z0(a1 a1Var) {
        this.f61115a = a1Var;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onAudioCapabilitiesChanged() {
        t1 t1Var;
        a1 a1Var = this.f61115a;
        synchronized (a1Var.f61236b) {
            t1Var = a1Var.f61252s;
        }
        if (t1Var != null) {
            t1Var.onRendererCapabilitiesChanged(a1Var);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onAudioSinkError(Exception exc) {
        io.bidmachine.media3.common.util.b0.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f61115a.I0.audioSinkError(exc);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onAudioTrackInitialized(p pVar) {
        this.f61115a.I0.audioTrackInitialized(pVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onAudioTrackReleased(p pVar) {
        this.f61115a.I0.audioTrackReleased(pVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onOffloadBufferEmptying() {
        r1 r1Var = this.f61115a.I;
        if (r1Var != null) {
            ((io.bidmachine.media3.exoplayer.m0) r1Var).onWakeup();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onOffloadBufferFull() {
        r1 r1Var = this.f61115a.I;
        if (r1Var != null) {
            ((io.bidmachine.media3.exoplayer.m0) r1Var).onSleep();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onPositionAdvancing(long j10) {
        this.f61115a.I0.positionAdvancing(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onPositionDiscontinuity() {
        this.f61115a.R0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onSilenceSkipped() {
        this.f61115a.T0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onSkipSilenceEnabledChanged(boolean z10) {
        this.f61115a.I0.skipSilenceEnabledChanged(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.s
    public void onUnderrun(int i10, long j10, long j11) {
        this.f61115a.I0.underrun(i10, j10, j11);
    }
}
