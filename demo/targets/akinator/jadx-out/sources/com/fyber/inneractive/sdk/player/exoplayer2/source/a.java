package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f25730d;

    public a(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12) {
        this.f25730d = fVar;
        this.f25727a = obj;
        this.f25728b = j10;
        this.f25729c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f25730d.f25757b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f25728b);
        f.a(this.f25730d, this.f25729c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}
