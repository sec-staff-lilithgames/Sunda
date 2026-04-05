package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: a, reason: collision with root package name */
    public final l f25882a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f25883b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f25884c;

    /* renamed from: d, reason: collision with root package name */
    public final d f25885d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.f25882a = lVar;
        this.f25883b = oVar;
        this.f25884c = tVar;
        this.f25885d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.f25882a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA = this.f25883b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA2 = this.f25884c.a();
        d dVar = this.f25885d;
        return new e(lVar, hVarA, hVarA2, dVar != null ? new c(dVar.f25864a) : null);
    }
}
