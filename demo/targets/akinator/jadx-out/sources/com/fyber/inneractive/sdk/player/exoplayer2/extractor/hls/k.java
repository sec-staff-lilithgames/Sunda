package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f24783a;

    /* renamed from: b, reason: collision with root package name */
    public final n f24784b;

    public k(n nVar, int i10) {
        this.f24784b = nVar;
        this.f24783a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        n nVar = this.f24784b;
        nVar.f24792g.b();
        f fVar = nVar.f24788c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f24738j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f24739k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f24733e.f24890d.get(aVar);
            hVar.f24877b.b();
            IOException iOException = hVar.f24885j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        n nVar = this.f24784b;
        int i10 = this.f24783a;
        if (!nVar.f24810y) {
            if (nVar.f24809x == C.TIME_UNSET) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i10)).f24703c;
                synchronized (eVar) {
                    z10 = eVar.f24666i == 0;
                }
                if (!z10) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        n nVar = this.f24784b;
        int i10 = this.f24783a;
        if (nVar.f24809x != C.TIME_UNSET) {
            return -3;
        }
        loop0: while (nVar.f24796k.size() > 1) {
            int i11 = ((h) nVar.f24796k.getFirst()).f24745j;
            for (int i12 = 0; i12 < nVar.f24795j.size(); i12++) {
                if (nVar.f24807v[i12]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i12)).f24703c;
                    if ((eVar.f24666i == 0 ? eVar.f24675r : eVar.f24659b[eVar.f24668k]) == i11) {
                        break loop0;
                    }
                }
            }
            nVar.f24796k.removeFirst();
        }
        h hVar = (h) nVar.f24796k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.f25741c;
        if (!oVar.equals(nVar.f24802q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.f24793h;
            int i13 = nVar.f24786a;
            int i14 = hVar.f25742d;
            Object obj = hVar.f25743e;
            long j10 = hVar.f25744f;
            if (fVar.f25757b != null) {
                fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i13, oVar, i14, obj, j10));
            }
        }
        nVar.f24802q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i10)).a(pVar, cVar, z10, nVar.f24810y, nVar.f24808w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        n nVar = this.f24784b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(this.f24783a);
        if (nVar.f24810y && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
