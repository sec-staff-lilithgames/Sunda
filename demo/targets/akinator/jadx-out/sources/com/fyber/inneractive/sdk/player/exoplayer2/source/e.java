package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f25755c;

    public e(f fVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, Object obj, long j10) {
        this.f25755c = fVar;
        this.f25753a = obj;
        this.f25754b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f25755c.f25757b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f25754b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
