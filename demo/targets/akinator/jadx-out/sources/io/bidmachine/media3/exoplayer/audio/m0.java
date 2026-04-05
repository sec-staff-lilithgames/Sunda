package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final hn.h[] f60987a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f60988b;

    /* renamed from: c, reason: collision with root package name */
    public final hn.l f60989c;

    public m0(hn.h... hVarArr) {
        this(hVarArr, new d1(), new hn.l());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.h0, hn.i
    public gn.c1 applyPlaybackParameters(gn.c1 c1Var) {
        float f10 = c1Var.f57847a;
        hn.l lVar = this.f60989c;
        lVar.setSpeed(f10);
        lVar.setPitch(c1Var.f57848b);
        return c1Var;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.h0, hn.i
    public boolean applySkipSilenceEnabled(boolean z10) {
        this.f60988b.setEnabled(z10);
        return z10;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.h0, hn.i
    public hn.h[] getAudioProcessors() {
        return this.f60987a;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.h0, hn.i
    public long getMediaDuration(long j10) {
        hn.l lVar = this.f60989c;
        return lVar.isActive() ? lVar.getMediaDuration(j10) : j10;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.h0, hn.i
    public long getSkippedOutputFrameCount() {
        return this.f60988b.getSkippedFrames();
    }

    public m0(hn.h[] hVarArr, d1 d1Var, hn.l lVar) {
        hn.h[] hVarArr2 = new hn.h[hVarArr.length + 2];
        this.f60987a = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f60988b = d1Var;
        this.f60989c = lVar;
        hVarArr2[hVarArr.length] = d1Var;
        hVarArr2[hVarArr.length + 1] = lVar;
    }
}
