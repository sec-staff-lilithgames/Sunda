package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a3;
import com.google.android.exoplayer2.y2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f27127a;

    public h1(i1 i1Var) {
        this.f27127a = i1Var;
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onAudioCapabilitiesChanged() {
        a3 a3Var;
        i1 i1Var = this.f27127a;
        synchronized (i1Var.f27447b) {
            a3Var = i1Var.f27460p;
        }
        if (a3Var != null) {
            a3Var.onRendererCapabilitiesChanged(i1Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onAudioSinkError(Exception exc) {
        com.google.android.exoplayer2.util.f0.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f27127a.I0.audioSinkError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onOffloadBufferEmptying() {
        y2 y2Var = this.f27127a.T0;
        if (y2Var != null) {
            ((com.google.android.exoplayer2.s0) y2Var).onWakeup();
        }
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onOffloadBufferFull() {
        y2 y2Var = this.f27127a.T0;
        if (y2Var != null) {
            ((com.google.android.exoplayer2.s0) y2Var).onSleep();
        }
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onPositionAdvancing(long j10) {
        this.f27127a.I0.positionAdvancing(j10);
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onPositionDiscontinuity() {
        this.f27127a.Q0 = true;
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onSkipSilenceEnabledChanged(boolean z10) {
        this.f27127a.I0.skipSilenceEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.audio.e0
    public void onUnderrun(int i10, long j10, long j11) {
        this.f27127a.I0.underrun(i10, j10, j11);
    }
}
