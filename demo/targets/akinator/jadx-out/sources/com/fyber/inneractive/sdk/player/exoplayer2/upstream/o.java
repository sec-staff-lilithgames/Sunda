package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25966a;

    /* renamed from: b, reason: collision with root package name */
    public final m f25967b;

    /* renamed from: c, reason: collision with root package name */
    public final g f25968c;

    public o(Context context, m mVar, q qVar) {
        this.f25966a = context.getApplicationContext();
        this.f25967b = mVar;
        this.f25968c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f25966a, this.f25967b, this.f25968c.a());
    }
}
