package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w[] f25758a;

    public h(w[] wVarArr) {
        this.f25758a = wVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean zB;
        boolean z10 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z10;
            }
            zB = false;
            for (w wVar : this.f25758a) {
                if (wVar.f() == jF) {
                    zB |= wVar.b(j10);
                }
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long jMin = Long.MAX_VALUE;
        for (w wVar : this.f25758a) {
            long jF = wVar.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
