package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f25065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25066b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25067c;

    public g(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f25067c = nVar;
        nVar.e(12);
        this.f25065a = nVar.m();
        this.f25066b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f25066b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f25065a;
        return i10 == 0 ? this.f25067c.m() : i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return this.f25065a != 0;
    }
}
