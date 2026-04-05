package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60959a;

    /* renamed from: b, reason: collision with root package name */
    public d f60960b;

    /* renamed from: c, reason: collision with root package name */
    public hn.i f60961c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f60962d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f60963e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60964f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f60965g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f60966h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f60967i;

    /* renamed from: j, reason: collision with root package name */
    public io.bidmachine.media3.exoplayer.b0 f60968j;

    @Deprecated
    public k0() {
        this.f60959a = null;
        this.f60960b = d.f60913c;
        this.f60965g = i0.f60950a;
        this.f60966h = j0.f60955a;
    }

    public u0 build() {
        io.bidmachine.media3.common.util.a.checkState(!this.f60964f);
        this.f60964f = true;
        if (this.f60961c == null) {
            this.f60961c = new m0(new hn.h[0]);
        }
        if (this.f60967i == null) {
            this.f60967i = new c0(this.f60959a);
        }
        return new u0(this);
    }

    @Deprecated
    public k0 setAudioCapabilities(d dVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(dVar);
        this.f60960b = dVar;
        return this;
    }

    public k0 setAudioOffloadSupportProvider(g0 g0Var) {
        this.f60967i = g0Var;
        return this;
    }

    public k0 setAudioProcessorChain(hn.i iVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(iVar);
        this.f60961c = iVar;
        return this;
    }

    public k0 setAudioProcessors(hn.h[] hVarArr) {
        io.bidmachine.media3.common.util.a.checkNotNull(hVarArr);
        return setAudioProcessorChain(new m0(hVarArr));
    }

    public k0 setAudioTrackBufferSizeProvider(i0 i0Var) {
        this.f60965g = i0Var;
        return this;
    }

    public k0 setAudioTrackProvider(j0 j0Var) {
        this.f60966h = j0Var;
        return this;
    }

    public k0 setEnableAudioTrackPlaybackParams(boolean z10) {
        this.f60963e = z10;
        return this;
    }

    public k0 setEnableFloatOutput(boolean z10) {
        this.f60962d = z10;
        return this;
    }

    public k0 setExperimentalAudioOffloadListener(io.bidmachine.media3.exoplayer.b0 b0Var) {
        this.f60968j = b0Var;
        return this;
    }

    public k0(Context context) {
        this.f60959a = context;
        this.f60960b = d.f60913c;
        this.f60965g = i0.f60950a;
        this.f60966h = j0.f60955a;
    }
}
