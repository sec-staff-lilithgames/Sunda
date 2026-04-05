package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f24701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24702b;

    /* renamed from: c, reason: collision with root package name */
    public final e f24703c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f24704d;

    /* renamed from: e, reason: collision with root package name */
    public final d f24705e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f24706f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f24707g;

    /* renamed from: h, reason: collision with root package name */
    public long f24708h;

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f24709i;

    /* renamed from: j, reason: collision with root package name */
    public long f24710j;

    /* renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f24711k;

    /* renamed from: l, reason: collision with root package name */
    public int f24712l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24713m;

    /* renamed from: n, reason: collision with root package name */
    public f f24714n;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f24701a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f24702b = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f24703c = new e();
        this.f24704d = new LinkedBlockingDeque();
        this.f24705e = new d();
        this.f24706f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f24707g = new AtomicInteger();
        this.f24712l = C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public final void a(boolean z10) {
        int andSet = this.f24707g.getAndSet(z10 ? 0 : 2);
        a();
        e eVar = this.f24703c;
        eVar.f24670m = Long.MIN_VALUE;
        eVar.f24671n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f24709i = null;
        }
    }

    public final void b() {
        if (this.f24707g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f24707g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f24703c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f24670m, eVar.f24671n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f24703c;
        synchronized (eVar) {
            oVar = eVar.f24673p ? null : eVar.f24674q;
        }
        return oVar;
    }

    public final void f() {
        long j10;
        e eVar = this.f24703c;
        synchronized (eVar) {
            int i10 = eVar.f24666i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = eVar.f24668k + i10;
                int i12 = eVar.f24658a;
                int i13 = (i11 - 1) % i12;
                eVar.f24668k = i11 % i12;
                eVar.f24667j += i10;
                eVar.f24666i = 0;
                j10 = eVar.f24660c[i13] + eVar.f24661d[i13];
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }

    public final boolean a(boolean z10, long j10) {
        long j11;
        e eVar = this.f24703c;
        synchronized (eVar) {
            if (eVar.f24666i != 0) {
                long[] jArr = eVar.f24663f;
                int i10 = eVar.f24668k;
                if (j10 < jArr[i10]) {
                    j11 = -1;
                } else {
                    if (j10 <= eVar.f24671n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != eVar.f24669l && eVar.f24663f[i10] <= j10) {
                            if ((eVar.f24662e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % eVar.f24658a;
                            i12++;
                        }
                        if (i11 != -1) {
                            int i13 = (eVar.f24668k + i11) % eVar.f24658a;
                            eVar.f24668k = i13;
                            eVar.f24667j += i11;
                            eVar.f24666i -= i11;
                            j11 = eVar.f24660c[i13];
                        }
                    }
                    j11 = -1;
                }
            } else {
                j11 = -1;
            }
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p r17, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.g.a(com.fyber.inneractive.sdk.player.exoplayer2.p, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c, boolean, boolean, long):int");
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f24708h);
            int iMin = Math.min(i10 - i11, this.f24702b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f24704d.peek();
            System.arraycopy(aVar.f25849a, aVar.f25850b + i12, bArr, i11, iMin);
            j10 += iMin;
            i11 += iMin;
        }
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f24708h)) / this.f24702b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f24701a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f24704d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f25950a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f24708h += this.f24702b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f24703c;
        synchronized (eVar) {
            z10 = true;
            if (oVar == null) {
                eVar.f24673p = true;
            } else {
                eVar.f24673p = false;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f24674q;
                int i10 = z.f26070a;
                if (!oVar.equals(oVar2)) {
                    eVar.f24674q = oVar;
                }
            }
            z10 = false;
        }
        f fVar = this.f24714n;
        if (fVar == null || !z10) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        b bVar2;
        int iA = 0;
        if (!this.f24707g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f24652f, i10);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f24646g, 0, Math.min(i10, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f24649c += iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f24711k;
            byte[] bArr = aVar.f25849a;
            int i11 = aVar.f25850b + this.f24712l;
            int i12 = bVar.f24652f;
            if (i12 != 0) {
                int iMin2 = Math.min(i12, iA2);
                System.arraycopy(bVar.f24650d, 0, bArr, i11, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                bVar2 = bVar;
                iA = bVar.a(bArr, i11, iA2, 0, true);
            } else {
                bVar2 = bVar;
            }
            if (iA != -1) {
                bVar2.f24649c += iA;
            }
            if (iA == -1) {
                if (z10) {
                    c();
                    return -1;
                }
                throw new EOFException();
            }
            this.f24712l += iA;
            this.f24710j += iA;
            c();
            return iA;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f24707g.compareAndSet(0, 1)) {
            nVar.e(nVar.f26043b + i10);
            return;
        }
        while (i10 > 0) {
            int iA = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f24711k;
            nVar.a(aVar.f25849a, aVar.f25850b + this.f24712l, iA);
            this.f24712l += iA;
            this.f24710j += iA;
            i10 -= iA;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!this.f24707g.compareAndSet(0, 1)) {
            e eVar = this.f24703c;
            synchronized (eVar) {
                eVar.f24671n = Math.max(eVar.f24671n, j10);
            }
            return;
        }
        try {
            if (this.f24713m) {
                if ((i10 & 1) != 0 && this.f24703c.a(j10)) {
                    this.f24713m = false;
                }
                return;
            }
            this.f24703c.a(j10, i10, (this.f24710j - i11) - i12, i11, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.f24703c;
        eVar.f24667j = 0;
        eVar.f24668k = 0;
        eVar.f24669l = 0;
        eVar.f24666i = 0;
        eVar.f24672o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f24701a;
        LinkedBlockingDeque linkedBlockingDeque = this.f24704d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f24704d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f24701a).a();
        this.f24708h = 0L;
        this.f24710j = 0L;
        this.f24711k = null;
        this.f24712l = this.f24702b;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f24712l == this.f24702b) {
            this.f24712l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f24701a;
            synchronized (lVar) {
                try {
                    lVar.f25952c++;
                    int i11 = lVar.f25953d;
                    if (i11 > 0) {
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f25954e;
                        int i12 = i11 - 1;
                        lVar.f25953d = i12;
                        aVar = aVarArr[i12];
                        aVarArr[i12] = null;
                    } else {
                        aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24711k = aVar;
            this.f24704d.add(aVar);
        }
        return Math.min(i10, this.f24702b - this.f24712l);
    }
}
