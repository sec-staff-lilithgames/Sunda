package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f27315a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f27316b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f27317c;

    public w0(u... uVarArr) {
        this(uVarArr, new n1(), new p1());
    }

    @Override // com.google.android.exoplayer2.audio.s0, com.google.android.exoplayer2.audio.v
    public l2 applyPlaybackParameters(l2 l2Var) {
        float f10 = l2Var.f27637b;
        p1 p1Var = this.f27317c;
        p1Var.setSpeed(f10);
        p1Var.setPitch(l2Var.f27638c);
        return l2Var;
    }

    @Override // com.google.android.exoplayer2.audio.s0, com.google.android.exoplayer2.audio.v
    public boolean applySkipSilenceEnabled(boolean z10) {
        this.f27316b.setEnabled(z10);
        return z10;
    }

    @Override // com.google.android.exoplayer2.audio.s0, com.google.android.exoplayer2.audio.v
    public u[] getAudioProcessors() {
        return this.f27315a;
    }

    @Override // com.google.android.exoplayer2.audio.s0, com.google.android.exoplayer2.audio.v
    public long getMediaDuration(long j10) {
        return this.f27317c.getMediaDuration(j10);
    }

    @Override // com.google.android.exoplayer2.audio.s0, com.google.android.exoplayer2.audio.v
    public long getSkippedOutputFrameCount() {
        return this.f27316b.getSkippedFrames();
    }

    public w0(u[] uVarArr, n1 n1Var, p1 p1Var) {
        u[] uVarArr2 = new u[uVarArr.length + 2];
        this.f27315a = uVarArr2;
        System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
        this.f27316b = n1Var;
        this.f27317c = p1Var;
        uVarArr2[uVarArr.length] = n1Var;
        uVarArr2[uVarArr.length + 1] = p1Var;
    }
}
