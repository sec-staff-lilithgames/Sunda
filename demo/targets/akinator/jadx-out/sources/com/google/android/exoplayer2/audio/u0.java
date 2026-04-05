package com.google.android.exoplayer2.audio;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27292a;

    /* renamed from: b, reason: collision with root package name */
    public n f27293b;

    /* renamed from: c, reason: collision with root package name */
    public v f27294c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27295d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27296e;

    /* renamed from: f, reason: collision with root package name */
    public int f27297f;

    /* renamed from: g, reason: collision with root package name */
    public t0 f27298g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.t f27299h;

    @Deprecated
    public u0() {
        this.f27292a = null;
        this.f27293b = n.f27212c;
        this.f27297f = 0;
        this.f27298g = t0.f27290a;
    }

    public c1 build() {
        if (this.f27294c == null) {
            this.f27294c = new w0(new u[0]);
        }
        return new c1(this);
    }

    @Deprecated
    public u0 setAudioCapabilities(n nVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(nVar);
        this.f27293b = nVar;
        return this;
    }

    public u0 setAudioProcessorChain(v vVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(vVar);
        this.f27294c = vVar;
        return this;
    }

    public u0 setAudioProcessors(u[] uVarArr) {
        com.google.android.exoplayer2.util.a.checkNotNull(uVarArr);
        return setAudioProcessorChain(new w0(uVarArr));
    }

    public u0 setAudioTrackBufferSizeProvider(t0 t0Var) {
        this.f27298g = t0Var;
        return this;
    }

    public u0 setEnableAudioTrackPlaybackParams(boolean z10) {
        this.f27296e = z10;
        return this;
    }

    public u0 setEnableFloatOutput(boolean z10) {
        this.f27295d = z10;
        return this;
    }

    public u0 setExperimentalAudioOffloadListener(com.google.android.exoplayer2.t tVar) {
        this.f27299h = tVar;
        return this;
    }

    public u0 setOffloadMode(int i10) {
        this.f27297f = i10;
        return this;
    }

    public u0(Context context) {
        this.f27292a = context;
        this.f27293b = n.f27212c;
        this.f27297f = 0;
        this.f27298g = t0.f27290a;
    }
}
