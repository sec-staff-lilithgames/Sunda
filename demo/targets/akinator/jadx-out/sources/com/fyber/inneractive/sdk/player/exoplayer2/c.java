package com.fyber.inneractive.sdk.player.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f24613a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* renamed from: b, reason: collision with root package name */
    public final long f24614b = 15000 * 1000;

    /* renamed from: c, reason: collision with root package name */
    public final long f24615c = 30000 * 1000;

    /* renamed from: d, reason: collision with root package name */
    public final long f24616d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public final long f24617e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f24618f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24619g;

    public final void a(boolean z10) {
        this.f24618f = 0;
        this.f24619g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f24613a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
