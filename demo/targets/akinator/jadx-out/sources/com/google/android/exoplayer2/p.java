package com.google.android.exoplayer2;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p implements d3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27891a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27895e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27898h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27899i;

    /* renamed from: b, reason: collision with root package name */
    public final qe.j f27892b = new qe.j();

    /* renamed from: c, reason: collision with root package name */
    public int f27893c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f27894d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public qe.v f27896f = qe.v.f82902a;

    public p(Context context) {
        this.f27891a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:89|33)|74|41|42|82|43|78|51|52|88|53|(2:90|61)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:28|(1:30)|80|31|32|(2:89|33)|74|41|42|82|43|78|51|52|88|53|(2:90|61)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(7:(2:89|33)|78|51|52|88|53|(2:90|61))|74|41|42|82|43) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    @Override // com.google.android.exoplayer2.d3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.z2[] createRenderers(android.os.Handler r17, sf.w r18, com.google.android.exoplayer2.audio.b0 r19, ef.r r20, re.f r21) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p.createRenderers(android.os.Handler, sf.w, com.google.android.exoplayer2.audio.b0, ef.r, re.f):com.google.android.exoplayer2.z2[]");
    }

    public p experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.f27892b.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(z10);
        return this;
    }

    public p forceDisableMediaCodecAsynchronousQueueing() {
        this.f27892b.forceDisableAsynchronous();
        return this;
    }

    public p forceEnableMediaCodecAsynchronousQueueing() {
        this.f27892b.forceEnableAsynchronous();
        return this;
    }

    public p setAllowedVideoJoiningTimeMs(long j10) {
        this.f27894d = j10;
        return this;
    }

    public p setEnableAudioFloatOutput(boolean z10) {
        this.f27897g = z10;
        return this;
    }

    public p setEnableAudioOffload(boolean z10) {
        this.f27899i = z10;
        return this;
    }

    public p setEnableAudioTrackPlaybackParams(boolean z10) {
        this.f27898h = z10;
        return this;
    }

    public p setEnableDecoderFallback(boolean z10) {
        this.f27895e = z10;
        return this;
    }

    public p setExtensionRendererMode(int i10) {
        this.f27893c = i10;
        return this;
    }

    public p setMediaCodecSelector(qe.v vVar) {
        this.f27896f = vVar;
        return this;
    }
}
