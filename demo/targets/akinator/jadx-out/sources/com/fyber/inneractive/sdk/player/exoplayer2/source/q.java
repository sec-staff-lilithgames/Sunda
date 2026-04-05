package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f25806a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f25807b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f25808c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25809d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f25810e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f25811f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.v f25812g = new com.fyber.inneractive.sdk.player.exoplayer2.v();

    /* renamed from: h, reason: collision with root package name */
    public t f25813h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25814i;

    public q(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i10, Handler handler, b0 b0Var) {
        this.f25806a = uri;
        this.f25807b = gVar;
        this.f25808c = cVar;
        this.f25809d = i10;
        this.f25810e = handler;
        this.f25811f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.f25813h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        this.f25813h = tVar;
        tVar.a(new x(C.TIME_UNSET, C.TIME_UNSET, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new p(this.f25806a, this.f25807b.a(), this.f25808c.a(), this.f25809d, this.f25810e, this.f25811f, this, bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        p pVar = (p) sVar;
        pVar.f25788i.a(new k(pVar, pVar.f25789j));
        pVar.f25793n.removeCallbacksAndMessages(null);
        pVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z10 = xVar.a(0, this.f25812g, false).f26081d != C.TIME_UNSET;
        if (!this.f25814i || z10) {
            this.f25814i = z10;
            this.f25813h.a(xVar, null);
        }
    }
}
