package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f25751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f25752e;

    public d(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        this.f25752e = fVar;
        this.f25748a = obj;
        this.f25749b = j10;
        this.f25750c = j11;
        this.f25751d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f25752e.f25757b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f25749b);
        f.a(this.f25752e, this.f25750c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.f25751d);
    }
}
