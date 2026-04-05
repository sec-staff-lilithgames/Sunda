package com.google.android.exoplayer2.audio;

import android.os.SystemClock;
import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f27333a;

    public z0(c1 c1Var) {
        this.f27333a = c1Var;
    }

    @Override // com.google.android.exoplayer2.audio.j0
    public void onInvalidLatency(long j10) {
        com.google.android.exoplayer2.util.f0.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
    }

    @Override // com.google.android.exoplayer2.audio.j0
    public void onPositionAdvancing(long j10) {
        e0 e0Var = this.f27333a.f27089s;
        if (e0Var != null) {
            ((h1) e0Var).onPositionAdvancing(j10);
        }
    }

    @Override // com.google.android.exoplayer2.audio.j0
    public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
        StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
        sbR.append(j11);
        e2.A(sbR, ", ", j12, ", ");
        sbR.append(j13);
        sbR.append(", ");
        c1 c1Var = this.f27333a;
        sbR.append(c1Var.f());
        sbR.append(", ");
        sbR.append(c1Var.g());
        com.google.android.exoplayer2.util.f0.w("DefaultAudioSink", sbR.toString());
    }

    @Override // com.google.android.exoplayer2.audio.j0
    public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
        StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
        sbR.append(j11);
        e2.A(sbR, ", ", j12, ", ");
        sbR.append(j13);
        sbR.append(", ");
        c1 c1Var = this.f27333a;
        sbR.append(c1Var.f());
        sbR.append(", ");
        sbR.append(c1Var.g());
        com.google.android.exoplayer2.util.f0.w("DefaultAudioSink", sbR.toString());
    }

    @Override // com.google.android.exoplayer2.audio.j0
    public void onUnderrun(int i10, long j10) {
        c1 c1Var = this.f27333a;
        if (c1Var.f27089s != null) {
            ((h1) c1Var.f27089s).onUnderrun(i10, j10, SystemClock.elapsedRealtime() - c1Var.f27071d0);
        }
    }
}
