package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f25738d;

    public c(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f25738d = fVar;
        this.f25735a = obj;
        this.f25736b = j10;
        this.f25737c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f25738d.f25757b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f25736b);
        f.a(this.f25738d, this.f25737c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", b0Var.a());
    }
}
