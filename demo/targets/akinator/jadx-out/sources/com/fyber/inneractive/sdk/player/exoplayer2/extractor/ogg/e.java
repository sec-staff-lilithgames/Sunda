package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: a, reason: collision with root package name */
    public l f25239a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean zA;
        boolean zEquals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.f25246a & 2) == 2) {
                int iMin = Math.min(gVar.f25250e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(iMin);
                bVar.a(nVar.f26042a, 0, iMin, false);
                nVar.e(0);
                if (nVar.f26044c - nVar.f26043b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f25239a = new d();
                } else {
                    nVar.e(0);
                    try {
                        zA = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        zA = false;
                    }
                    if (zA) {
                        this.f25239a = new o();
                    } else {
                        nVar.e(0);
                        int i10 = i.f25253o;
                        int i11 = nVar.f26044c - nVar.f26043b;
                        byte[] bArr = i.f25254p;
                        if (i11 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f25239a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(0, 1);
        jVar.b();
        l lVar = this.f25239a;
        lVar.f25260c = jVar;
        lVar.f25259b = gVarA;
        lVar.f25258a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        l lVar = this.f25239a;
        f fVar = lVar.f25258a;
        g gVar = fVar.f25240a;
        gVar.f25246a = 0;
        gVar.f25247b = 0L;
        gVar.f25248c = 0;
        gVar.f25249d = 0;
        gVar.f25250e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.f25241b;
        nVar.f26043b = 0;
        nVar.f26044c = 0;
        fVar.f25242c = -1;
        fVar.f25244e = false;
        if (j10 == 0) {
            lVar.a(!lVar.f25269l);
        } else if (lVar.f25265h != 0) {
            lVar.f25262e = lVar.f25261d.c(j11);
            lVar.f25265h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        l lVar = this.f25239a;
        int i10 = lVar.f25265h;
        if (i10 == 0) {
            boolean zA = true;
            while (zA) {
                if (!lVar.f25258a.a(bVar)) {
                    lVar.f25265h = 3;
                    return -1;
                }
                long j10 = bVar.f24649c;
                long j11 = lVar.f25263f;
                lVar.f25268k = j10 - j11;
                zA = lVar.a(lVar.f25258a.f25241b, j11, lVar.f25267j);
                if (zA) {
                    lVar.f25263f = bVar.f24649c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.f25267j.f25256a;
            lVar.f25266i = oVar2.f25714s;
            if (!lVar.f25270m) {
                lVar.f25259b.a(oVar2);
                lVar.f25270m = true;
            }
            c cVar = lVar.f25267j.f25257b;
            if (cVar != null) {
                lVar.f25261d = cVar;
            } else {
                long j12 = bVar.f24648b;
                if (j12 == -1) {
                    lVar.f25261d = new k();
                } else {
                    g gVar = lVar.f25258a.f25240a;
                    lVar.f25261d = new b(lVar.f25263f, j12, lVar, gVar.f25249d + gVar.f25250e, gVar.f25247b);
                }
            }
            lVar.f25267j = null;
            lVar.f25265h = 2;
            lVar.f25258a.a();
            return 0;
        }
        if (i10 == 1) {
            bVar.a((int) lVar.f25263f);
            lVar.f25265h = 2;
            return 0;
        }
        if (i10 == 2) {
            long jA = lVar.f25261d.a(bVar);
            if (jA >= 0) {
                oVar.f25218a = jA;
                return 1;
            }
            if (jA < -1) {
                lVar.a(-(jA + 2));
            }
            if (!lVar.f25269l) {
                lVar.f25260c.a(lVar.f25261d.b());
                lVar.f25269l = true;
            }
            if (lVar.f25268k <= 0 && !lVar.f25258a.a(bVar)) {
                lVar.f25265h = 3;
                return -1;
            }
            lVar.f25268k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f25258a.f25241b;
            long jA2 = lVar.a(nVar);
            if (jA2 >= 0) {
                long j13 = lVar.f25264g;
                if (j13 + jA2 >= lVar.f25262e) {
                    lVar.f25259b.a(nVar.f26044c, nVar);
                    lVar.f25259b.a((j13 * 1000000) / lVar.f25266i, 1, nVar.f26044c, 0, null);
                    lVar.f25262e = -1L;
                }
            }
            lVar.f25264g += jA2;
            return 0;
        }
        throw new IllegalStateException();
    }
}
