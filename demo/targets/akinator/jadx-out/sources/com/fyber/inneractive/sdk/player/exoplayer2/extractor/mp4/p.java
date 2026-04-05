package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.Stack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* renamed from: p, reason: collision with root package name */
    public static final int f25150p = z.a("qt  ");

    /* renamed from: e, reason: collision with root package name */
    public int f25155e;

    /* renamed from: f, reason: collision with root package name */
    public int f25156f;

    /* renamed from: g, reason: collision with root package name */
    public long f25157g;

    /* renamed from: h, reason: collision with root package name */
    public int f25158h;

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f25159i;

    /* renamed from: j, reason: collision with root package name */
    public int f25160j;

    /* renamed from: k, reason: collision with root package name */
    public int f25161k;

    /* renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25162l;

    /* renamed from: m, reason: collision with root package name */
    public o[] f25163m;

    /* renamed from: n, reason: collision with root package name */
    public long f25164n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25165o;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25153c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* renamed from: d, reason: collision with root package name */
    public final Stack f25154d = new Stack();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25151a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f26034a);

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25152b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f25164n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Type inference failed for: r2v117, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j] */
    /* JADX WARN: Type inference failed for: r2v123, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o] */
    /* JADX WARN: Type inference failed for: r2v125, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o] */
    /* JADX WARN: Type inference failed for: r2v139, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o] */
    /* JADX WARN: Type inference failed for: r2v141, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o] */
    /* JADX WARN: Type inference failed for: r2v96, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j] */
    /* JADX WARN: Type inference failed for: r3v55, types: [com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r83) throws com.fyber.inneractive.sdk.player.exoplayer2.r, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p.c(long):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f25162l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int i10;
        this.f25154d.clear();
        this.f25158h = 0;
        this.f25160j = 0;
        this.f25161k = 0;
        if (j10 == 0) {
            this.f25155e = 0;
            this.f25158h = 0;
            return;
        }
        o[] oVarArr = this.f25163m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f25147b;
                int iA = z.a(vVar.f25202e, j11, false);
                while (true) {
                    i10 = -1;
                    if (iA < 0) {
                        iA = -1;
                        break;
                    } else if ((vVar.f25203f[iA] & 1) != 0) {
                        break;
                    } else {
                        iA--;
                    }
                }
                if (iA != -1) {
                    i10 = iA;
                    break;
                    break;
                }
                iA = z.a(vVar.f25202e, j11, true, false);
                while (iA < vVar.f25202e.length) {
                    if ((vVar.f25203f[iA] & 1) != 0) {
                        i10 = iA;
                        break;
                    }
                    iA++;
                }
                oVar.f25149d = i10;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, NumberFormatException, EOFException {
        o[] oVarArr;
        boolean z10;
        while (true) {
            int i10 = this.f25155e;
            boolean z11 = false;
            if (i10 == 0) {
                if (this.f25158h == 0) {
                    if (!bVar.b(this.f25153c.f26042a, 0, 8, true)) {
                        return -1;
                    }
                    this.f25158h = 8;
                    this.f25153c.e(0);
                    this.f25157g = this.f25153c.k();
                    this.f25156f = this.f25153c.b();
                }
                if (this.f25157g == 1) {
                    bVar.b(this.f25153c.f26042a, 8, 8, false);
                    this.f25158h += 8;
                    this.f25157g = this.f25153c.n();
                }
                int i11 = this.f25156f;
                if (i11 != c.C && i11 != c.E && i11 != c.F && i11 != c.G && i11 != c.H && i11 != c.Q) {
                    if (i11 != c.S && i11 != c.D && i11 != c.T && i11 != c.U && i11 != c.f25024m0 && i11 != c.f25026n0 && i11 != c.f25028o0 && i11 != c.R && i11 != c.f25030p0 && i11 != c.f25032q0 && i11 != c.f25034r0 && i11 != c.f25036s0 && i11 != c.f25038t0 && i11 != c.P && i11 != c.f25001b && i11 != c.A0) {
                        this.f25159i = null;
                        this.f25155e = 1;
                    } else if (this.f25158h == 8) {
                        long j10 = this.f25157g;
                        if (j10 <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j10);
                            this.f25159i = nVar;
                            System.arraycopy(this.f25153c.f26042a, 0, nVar.f26042a, 0, 8);
                            this.f25155e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j11 = (bVar.f24649c + this.f25157g) - this.f25158h;
                    this.f25154d.add(new a(this.f25156f, j11));
                    if (this.f25157g == this.f25158h) {
                        c(j11);
                    } else {
                        this.f25155e = 0;
                        this.f25158h = 0;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    long j12 = Long.MAX_VALUE;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        oVarArr = this.f25163m;
                        if (i13 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i13];
                        int i14 = oVar2.f25149d;
                        v vVar = oVar2.f25147b;
                        if (i14 != vVar.f25198a) {
                            long j13 = vVar.f25199b[i14];
                            if (j13 < j12) {
                                i12 = i13;
                                j12 = j13;
                            }
                        }
                        i13++;
                    }
                    if (i12 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i12];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.f25148c;
                    int i15 = oVar3.f25149d;
                    v vVar2 = oVar3.f25147b;
                    long j14 = vVar2.f25199b[i15];
                    int i16 = vVar2.f25200c[i15];
                    if (oVar3.f25146a.f25173g == 1) {
                        j14 += 8;
                        i16 -= 8;
                    }
                    long j15 = (j14 - bVar.f24649c) + this.f25160j;
                    if (j15 >= 0 && j15 < 262144) {
                        bVar.a((int) j15);
                        int i17 = oVar3.f25146a.f25177k;
                        if (i17 == 0) {
                            while (true) {
                                int i18 = this.f25160j;
                                if (i18 >= i16) {
                                    break;
                                }
                                int iA = rVar.a(bVar, i16 - i18, false);
                                this.f25160j += iA;
                                this.f25161k -= iA;
                            }
                        } else {
                            byte[] bArr = this.f25152b.f26042a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i19 = 4 - i17;
                            while (this.f25160j < i16) {
                                int i20 = this.f25161k;
                                if (i20 == 0) {
                                    bVar.b(this.f25152b.f26042a, i19, i17, false);
                                    this.f25152b.e(0);
                                    this.f25161k = this.f25152b.m();
                                    this.f25151a.e(0);
                                    rVar.a(4, this.f25151a);
                                    this.f25160j += 4;
                                    i16 += i19;
                                } else {
                                    int iA2 = rVar.a(bVar, i20, false);
                                    this.f25160j += iA2;
                                    this.f25161k -= iA2;
                                }
                            }
                        }
                        int i21 = i16;
                        v vVar3 = oVar3.f25147b;
                        rVar.a(vVar3.f25202e[i15], vVar3.f25203f[i15], i21, 0, null);
                        oVar3.f25149d++;
                        this.f25160j = 0;
                        this.f25161k = 0;
                        return 0;
                    }
                    oVar.f25218a = j14;
                    return 1;
                }
                long j16 = this.f25157g;
                int i22 = this.f25158h;
                long j17 = j16 - i22;
                long j18 = bVar.f24649c + j17;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25159i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f26042a, i22, (int) j17, false);
                    if (this.f25156f == c.f25001b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f25159i;
                        nVar3.e(8);
                        if (nVar3.b() != f25150p) {
                            nVar3.e(nVar3.f26043b + 4);
                            while (nVar3.f26044c - nVar3.f26043b > 0) {
                                if (nVar3.b() == f25150p) {
                                    z10 = true;
                                    break;
                                }
                            }
                            z10 = false;
                            this.f25165o = z10;
                        } else {
                            z10 = true;
                            this.f25165o = z10;
                        }
                    } else if (!this.f25154d.isEmpty()) {
                        ((a) this.f25154d.peek()).Q0.add(new b(this.f25156f, this.f25159i));
                    }
                } else if (j17 < 262144) {
                    bVar.a((int) j17);
                } else {
                    oVar.f25218a = j18;
                    z11 = true;
                }
                c(j18);
                if (z11 && this.f25155e != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        int i10;
        long j11 = Long.MAX_VALUE;
        for (o oVar : this.f25163m) {
            v vVar = oVar.f25147b;
            int iA = z.a(vVar.f25202e, j10, false);
            while (true) {
                i10 = -1;
                if (iA < 0) {
                    iA = -1;
                    break;
                }
                if ((vVar.f25203f[iA] & 1) != 0) {
                    break;
                }
                iA--;
            }
            if (iA != -1) {
                i10 = iA;
                break;
            }
            iA = z.a(vVar.f25202e, j10, true, false);
            while (iA < vVar.f25202e.length) {
                if ((vVar.f25203f[iA] & 1) != 0) {
                    i10 = iA;
                    break;
                }
                iA++;
            }
            long j12 = vVar.f25199b[i10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }
}
