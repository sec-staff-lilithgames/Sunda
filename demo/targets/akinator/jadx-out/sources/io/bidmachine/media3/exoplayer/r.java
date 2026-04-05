package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f61531a;

    /* renamed from: b, reason: collision with root package name */
    public final xn.h f61532b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61535e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f61537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f61538h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f61539i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f61540j;

    /* renamed from: c, reason: collision with root package name */
    public int f61533c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f61534d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public xn.z f61536f = xn.z.f92166a;

    /* renamed from: k, reason: collision with root package name */
    public long f61541k = C.TIME_UNSET;

    public r(Context context) {
        this.f61531a = context;
        this.f61532b = new xn.h(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:137|72|73|(2:139|74)|(5:143|82|83|131|84)|133|92|93|120|94|152|102|107|108) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024e, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    @Override // io.bidmachine.media3.exoplayer.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.bidmachine.media3.exoplayer.s1[] createRenderers(android.os.Handler r23, io.g0 r24, io.bidmachine.media3.exoplayer.audio.o r25, eo.g r26, yn.c r27) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.r.createRenderers(android.os.Handler, io.g0, io.bidmachine.media3.exoplayer.audio.o, eo.g, yn.c):io.bidmachine.media3.exoplayer.s1[]");
    }

    @Override // io.bidmachine.media3.exoplayer.x1
    public s1 createSecondaryRenderer(s1 s1Var, Handler handler, io.g0 g0Var, io.bidmachine.media3.exoplayer.audio.o oVar, eo.g gVar, yn.c cVar) {
        if (s1Var.getTrackType() == 2) {
            xn.z zVar = this.f61536f;
            boolean z10 = this.f61535e;
            long j10 = this.f61534d;
            if (this.f61539i && s1Var.getClass() == io.k.class) {
                return new k.a(this.f61531a).setCodecAdapterFactory(this.f61532b).setMediaCodecSelector(zVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(50).experimentalSetParseAv1SampleDependencies(this.f61540j).experimentalSetLateThresholdToDropDecoderInputUs(this.f61541k).build();
            }
        }
        return null;
    }

    public final r experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z10) {
        this.f61539i = z10;
        return this;
    }

    public final r experimentalSetLateThresholdToDropDecoderInputUs(long j10) {
        this.f61541k = j10;
        return this;
    }

    public final r experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z10) {
        this.f61532b.experimentalSetAsyncCryptoFlagEnabled(z10);
        return this;
    }

    public final r experimentalSetParseAv1SampleDependencies(boolean z10) {
        this.f61540j = z10;
        return this;
    }

    public final r forceDisableMediaCodecAsynchronousQueueing() {
        this.f61532b.forceDisableAsynchronous();
        return this;
    }

    public final r forceEnableMediaCodecAsynchronousQueueing() {
        this.f61532b.forceEnableAsynchronous();
        return this;
    }

    public final r setAllowedVideoJoiningTimeMs(long j10) {
        this.f61534d = j10;
        return this;
    }

    public final r setEnableAudioFloatOutput(boolean z10) {
        this.f61537g = z10;
        return this;
    }

    public final r setEnableAudioTrackPlaybackParams(boolean z10) {
        this.f61538h = z10;
        return this;
    }

    public final r setEnableDecoderFallback(boolean z10) {
        this.f61535e = z10;
        return this;
    }

    public final r setExtensionRendererMode(int i10) {
        this.f61533c = i10;
        return this;
    }

    public final r setMediaCodecSelector(xn.z zVar) {
        this.f61536f = zVar;
        return this;
    }
}
