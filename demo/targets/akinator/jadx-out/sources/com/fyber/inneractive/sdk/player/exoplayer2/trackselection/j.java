package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final z f25845a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25846b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25847c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f25848d;

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f25845a = zVar;
        this.f25846b = hVar;
        this.f25847c = fVar;
        this.f25848d = tVarArr;
    }

    public final boolean a(j jVar, int i10) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f25846b.f25843b[i10], jVar.f25846b.f25843b[i10]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f25848d[i10], jVar.f25848d[i10]);
    }
}
