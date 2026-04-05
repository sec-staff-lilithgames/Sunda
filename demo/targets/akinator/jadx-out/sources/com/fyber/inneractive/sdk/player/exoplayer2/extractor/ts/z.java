package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements v {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f25533a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f25534b;

    public z(b0 b0Var) {
        this.f25534b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.f26043b + 7);
        int i10 = (nVar.f26044c - nVar.f26043b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f25533a;
            nVar.a(mVar.f26038a, 0, 4);
            mVar.b(0);
            int iA = this.f25533a.a(16);
            this.f25533a.c(3);
            if (iA == 0) {
                this.f25533a.c(13);
            } else {
                int iA2 = this.f25533a.a(13);
                b0 b0Var = this.f25534b;
                b0Var.f25322f.put(iA2, new w(new a0(b0Var, iA2)));
                this.f25534b.f25325i++;
            }
        }
        b0 b0Var2 = this.f25534b;
        if (b0Var2.f25317a != 2) {
            b0Var2.f25322f.remove(0);
        }
    }
}
