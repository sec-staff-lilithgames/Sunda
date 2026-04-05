package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f25052a;

    /* renamed from: b, reason: collision with root package name */
    public int f25053b;

    /* renamed from: c, reason: collision with root package name */
    public int f25054c;

    /* renamed from: d, reason: collision with root package name */
    public long f25055d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25056e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25057f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25058g;

    /* renamed from: h, reason: collision with root package name */
    public int f25059h;

    /* renamed from: i, reason: collision with root package name */
    public int f25060i;

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z10) {
        this.f25058g = nVar;
        this.f25057f = nVar2;
        this.f25056e = z10;
        nVar2.e(12);
        this.f25052a = nVar2.m();
        nVar.e(12);
        this.f25060i = nVar.m();
        if (!(nVar.b() == 1)) {
            throw new IllegalStateException("first_chunk must be 1");
        }
        this.f25053b = -1;
    }

    public final boolean a() {
        int i10 = this.f25053b + 1;
        this.f25053b = i10;
        if (i10 == this.f25052a) {
            return false;
        }
        this.f25055d = this.f25056e ? this.f25057f.n() : this.f25057f.k();
        if (this.f25053b == this.f25059h) {
            this.f25054c = this.f25058g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25058g;
            nVar.e(nVar.f26043b + 4);
            int i11 = this.f25060i - 1;
            this.f25060i = i11;
            this.f25059h = i11 > 0 ? this.f25058g.m() - 1 : -1;
        }
        return true;
    }
}
