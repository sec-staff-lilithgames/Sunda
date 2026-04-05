package bf;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 implements ee.l0 {
    public com.google.android.exoplayer2.z0 A;
    public com.google.android.exoplayer2.z0 B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final w0 f9167a;

    /* renamed from: d, reason: collision with root package name */
    public final de.t f9170d;

    /* renamed from: e, reason: collision with root package name */
    public final de.p f9171e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f9172f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.exoplayer2.z0 f9173g;

    /* renamed from: h, reason: collision with root package name */
    public de.n f9174h;

    /* renamed from: p, reason: collision with root package name */
    public int f9182p;

    /* renamed from: q, reason: collision with root package name */
    public int f9183q;

    /* renamed from: r, reason: collision with root package name */
    public int f9184r;

    /* renamed from: s, reason: collision with root package name */
    public int f9185s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9189w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9192z;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f9168b = new x0();

    /* renamed from: i, reason: collision with root package name */
    public int f9175i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f9176j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f9177k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f9180n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f9179m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f9178l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public ee.k0[] f9181o = new ee.k0[1000];

    /* renamed from: c, reason: collision with root package name */
    public final l1 f9169c = new l1(new a2.o(10));

    /* renamed from: t, reason: collision with root package name */
    public long f9186t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f9187u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f9188v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9191y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9190x = true;

    public a1(qf.c cVar, de.t tVar, de.p pVar) {
        this.f9170d = tVar;
        this.f9171e = pVar;
        this.f9167a = new w0(cVar);
    }

    public static a1 createWithDrm(qf.c cVar, de.t tVar, de.p pVar) {
        return new a1(cVar, (de.t) com.google.android.exoplayer2.util.a.checkNotNull(tVar), (de.p) com.google.android.exoplayer2.util.a.checkNotNull(pVar));
    }

    public static a1 createWithoutDrm(qf.c cVar) {
        return new a1(cVar, null, null);
    }

    public final int a(long j10) {
        int i10 = this.f9182p;
        int iF = f(i10 - 1);
        while (i10 > this.f9185s && this.f9180n[iF] >= j10) {
            i10--;
            iF--;
            if (iF == -1) {
                iF = this.f9175i - 1;
            }
        }
        return i10;
    }

    public final long b(int i10) {
        this.f9187u = Math.max(this.f9187u, e(i10));
        this.f9182p -= i10;
        int i11 = this.f9183q + i10;
        this.f9183q = i11;
        int i12 = this.f9184r + i10;
        this.f9184r = i12;
        int i13 = this.f9175i;
        if (i12 >= i13) {
            this.f9184r = i12 - i13;
        }
        int i14 = this.f9185s - i10;
        this.f9185s = i14;
        if (i14 < 0) {
            this.f9185s = 0;
        }
        this.f9169c.discardTo(i11);
        if (this.f9182p != 0) {
            return this.f9177k[this.f9184r];
        }
        int i15 = this.f9184r;
        if (i15 == 0) {
            i15 = this.f9175i;
        }
        return this.f9177k[i15 - 1] + this.f9178l[r6];
    }

    public final long c(int i10) {
        int writeIndex = getWriteIndex() - i10;
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.checkArgument(writeIndex >= 0 && writeIndex <= this.f9182p - this.f9185s);
        int i11 = this.f9182p - writeIndex;
        this.f9182p = i11;
        this.f9188v = Math.max(this.f9187u, e(i11));
        if (writeIndex == 0 && this.f9189w) {
            z10 = true;
        }
        this.f9189w = z10;
        this.f9169c.discardFrom(i10);
        int i12 = this.f9182p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f9177k[f(i12 - 1)] + this.f9178l[r9];
    }

    public final int d(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f9180n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f9179m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f9175i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i10 = this.f9185s;
        if (i10 == 0) {
            return -1L;
        }
        return b(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardTo(long r12, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            r11 = this;
            bf.w0 r0 = r11.f9167a
            monitor-enter(r11)
            int r1 = r11.f9182p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f9180n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f9184r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f9185s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.d(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.b(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.discardDownstreamTo(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.a1.discardTo(long, boolean, boolean):void");
    }

    public final void discardToEnd() {
        long jB;
        w0 w0Var = this.f9167a;
        synchronized (this) {
            int i10 = this.f9182p;
            jB = i10 == 0 ? -1L : b(i10);
        }
        w0Var.discardDownstreamTo(jB);
    }

    public final void discardToRead() {
        this.f9167a.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j10) {
        if (this.f9182p == 0) {
            return;
        }
        com.google.android.exoplayer2.util.a.checkArgument(j10 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.f9183q + a(j10));
    }

    public final void discardUpstreamSamples(int i10) {
        this.f9167a.discardUpstreamSampleBytes(c(i10));
    }

    public final long e(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f9180n[iF]);
            if ((this.f9179m[iF] & 1) != 0) {
                return jMax;
            }
            iF--;
            if (iF == -1) {
                iF = this.f9175i - 1;
            }
        }
        return jMax;
    }

    public final int f(int i10) {
        int i11 = this.f9184r + i10;
        int i12 = this.f9175i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // ee.l0
    public final void format(com.google.android.exoplayer2.z0 z0Var) {
        com.google.android.exoplayer2.z0 z0VarBuild = (this.F == 0 || z0Var.f28806r == Long.MAX_VALUE) ? z0Var : z0Var.buildUpon().setSubsampleOffsetUs(z0Var.f28806r + this.F).build();
        boolean z10 = false;
        this.f9192z = false;
        this.A = z0Var;
        synchronized (this) {
            try {
                this.f9191y = false;
                if (!com.google.android.exoplayer2.util.n1.areEqual(z0VarBuild, this.B)) {
                    if (this.f9169c.isEmpty() || !((y0) this.f9169c.getEndValue()).f9493a.equals(z0VarBuild)) {
                        this.B = z0VarBuild;
                    } else {
                        this.B = ((y0) this.f9169c.getEndValue()).f9493a;
                    }
                    com.google.android.exoplayer2.z0 z0Var2 = this.B;
                    this.D = com.google.android.exoplayer2.util.l0.allSamplesAreSyncSamples(z0Var2.f28802n, z0Var2.f28799k);
                    this.E = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z0 z0Var3 = this.f9172f;
        if (z0Var3 == null || !z10) {
            return;
        }
        z0Var3.onUpstreamFormatChanged(z0VarBuild);
    }

    public final boolean g(int i10) {
        de.n nVar = this.f9174h;
        if (nVar == null || nVar.getState() == 4) {
            return true;
        }
        return (this.f9179m[i10] & 1073741824) == 0 && this.f9174h.playClearSamplesWithoutKeys();
    }

    public final int getFirstIndex() {
        return this.f9183q;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.f9182p == 0 ? Long.MIN_VALUE : this.f9180n[this.f9184r];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.f9188v;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.f9187u, e(this.f9185s));
    }

    public final int getReadIndex() {
        return this.f9183q + this.f9185s;
    }

    public final synchronized int getSkipCount(long j10, boolean z10) throws Throwable {
        try {
            try {
                int iF = f(this.f9185s);
                int i10 = this.f9185s;
                int i11 = this.f9182p;
                if (!(i10 != i11) || j10 < this.f9180n[iF]) {
                    return 0;
                }
                if (j10 > this.f9188v && z10) {
                    return i11 - i10;
                }
                int iD = d(iF, i11 - i10, j10, true);
                if (iD == -1) {
                    return 0;
                }
                return iD;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized com.google.android.exoplayer2.z0 getUpstreamFormat() {
        return this.f9191y ? null : this.B;
    }

    public final int getWriteIndex() {
        return this.f9183q + this.f9182p;
    }

    public final void h(com.google.android.exoplayer2.z0 z0Var, com.google.android.exoplayer2.a1 a1Var) {
        com.google.android.exoplayer2.z0 z0Var2 = this.f9173g;
        boolean z10 = z0Var2 == null;
        DrmInitData drmInitData = z10 ? null : z0Var2.f28805q;
        this.f9173g = z0Var;
        DrmInitData drmInitData2 = z0Var.f28805q;
        de.t tVar = this.f9170d;
        a1Var.f27030b = tVar != null ? z0Var.copyWithCryptoType(tVar.getCryptoType(z0Var)) : z0Var;
        a1Var.f27029a = this.f9174h;
        if (tVar == null) {
            return;
        }
        if (z10 || !com.google.android.exoplayer2.util.n1.areEqual(drmInitData, drmInitData2)) {
            de.n nVar = this.f9174h;
            de.p pVar = this.f9171e;
            de.n nVarAcquireSession = tVar.acquireSession(pVar, z0Var);
            this.f9174h = nVarAcquireSession;
            a1Var.f27029a = nVarAcquireSession;
            if (nVar != null) {
                nVar.release(pVar);
            }
        }
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.f9189w;
    }

    public synchronized boolean isReady(boolean z10) {
        com.google.android.exoplayer2.z0 z0Var;
        boolean z11 = false;
        if (this.f9185s != this.f9182p) {
            if (((y0) this.f9169c.get(getReadIndex())).f9493a != this.f9173g) {
                return true;
            }
            return g(f(this.f9185s));
        }
        if (z10 || this.f9189w || ((z0Var = this.B) != null && z0Var != this.f9173g)) {
            z11 = true;
        }
        return z11;
    }

    public void maybeThrowError() throws IOException {
        de.n nVar = this.f9174h;
        if (nVar != null && nVar.getState() == 1) {
            throw ((de.m) com.google.android.exoplayer2.util.a.checkNotNull(this.f9174h.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f9185s != this.f9182p ? this.f9176j[f(this.f9185s)] : this.C;
    }

    public void preRelease() {
        discardToEnd();
        de.n nVar = this.f9174h;
        if (nVar != null) {
            nVar.release(this.f9171e);
            this.f9174h = null;
            this.f9173g = null;
        }
    }

    public int read(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        x0 x0Var = this.f9168b;
        synchronized (this) {
            try {
                hVar.f12238f = false;
                i11 = -3;
                if (this.f9185s != this.f9182p) {
                    com.google.android.exoplayer2.z0 z0Var = ((y0) this.f9169c.get(getReadIndex())).f9493a;
                    if (!z11 && z0Var == this.f9173g) {
                        int iF = f(this.f9185s);
                        if (g(iF)) {
                            hVar.setFlags(this.f9179m[iF]);
                            if (this.f9185s == this.f9182p - 1 && (z10 || this.f9189w)) {
                                hVar.addFlag(536870912);
                            }
                            long j10 = this.f9180n[iF];
                            hVar.f12239g = j10;
                            if (j10 < this.f9186t) {
                                hVar.addFlag(Integer.MIN_VALUE);
                            }
                            x0Var.f9483a = this.f9178l[iF];
                            x0Var.f9484b = this.f9177k[iF];
                            x0Var.f9485c = this.f9181o[iF];
                            i11 = -4;
                        } else {
                            hVar.f12238f = true;
                        }
                    }
                    h(z0Var, a1Var);
                    i11 = -5;
                } else {
                    if (!z10 && !this.f9189w) {
                        com.google.android.exoplayer2.z0 z0Var2 = this.B;
                        if (z0Var2 == null || (!z11 && z0Var2 == this.f9173g)) {
                        }
                        h((com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkNotNull(z0Var2), a1Var);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !hVar.isEndOfStream()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    this.f9167a.peekToBuffer(hVar, this.f9168b);
                } else {
                    this.f9167a.readToBuffer(hVar, this.f9168b);
                }
            }
            if (!z12) {
                this.f9185s++;
            }
        }
        return i11;
    }

    public void release() {
        reset(true);
        de.n nVar = this.f9174h;
        if (nVar != null) {
            nVar.release(this.f9171e);
            this.f9174h = null;
            this.f9173g = null;
        }
    }

    public final void reset() {
        reset(false);
    }

    @Override // ee.l0
    public /* bridge */ /* synthetic */ int sampleData(qf.k kVar, int i10, boolean z10) throws IOException {
        return super.sampleData(kVar, i10, z10);
    }

    @Override // ee.l0
    public void sampleMetadata(long j10, int i10, int i11, int i12, ee.k0 k0Var) {
        boolean z10;
        if (this.f9192z) {
            format((com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkStateNotNull(this.A));
        }
        int i13 = i10 & 1;
        boolean z11 = i13 != 0;
        if (this.f9190x) {
            if (!z11) {
                return;
            } else {
                this.f9190x = false;
            }
        }
        long j11 = j10 + this.F;
        if (this.D) {
            if (j11 < this.f9186t) {
                return;
            }
            if (i13 == 0) {
                if (!this.E) {
                    com.google.android.exoplayer2.util.f0.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i10 |= 1;
            }
        }
        if (this.G) {
            if (!z11) {
                return;
            }
            synchronized (this) {
                if (this.f9182p == 0) {
                    z10 = j11 > this.f9187u;
                } else if (getLargestReadTimestampUs() >= j11) {
                    z10 = false;
                } else {
                    c(this.f9183q + a(j11));
                    z10 = true;
                }
            }
            if (!z10) {
                return;
            } else {
                this.G = false;
            }
        }
        long totalBytesWritten = (this.f9167a.getTotalBytesWritten() - i11) - i12;
        synchronized (this) {
            try {
                int i14 = this.f9182p;
                if (i14 > 0) {
                    int iF = f(i14 - 1);
                    com.google.android.exoplayer2.util.a.checkArgument(this.f9177k[iF] + ((long) this.f9178l[iF]) <= totalBytesWritten);
                }
                this.f9189w = (536870912 & i10) != 0;
                this.f9188v = Math.max(this.f9188v, j11);
                int iF2 = f(this.f9182p);
                this.f9180n[iF2] = j11;
                this.f9177k[iF2] = totalBytesWritten;
                this.f9178l[iF2] = i11;
                this.f9179m[iF2] = i10;
                this.f9181o[iF2] = k0Var;
                this.f9176j[iF2] = this.C;
                if (this.f9169c.isEmpty() || !((y0) this.f9169c.getEndValue()).f9493a.equals(this.B)) {
                    de.t tVar = this.f9170d;
                    this.f9169c.appendSpan(getWriteIndex(), new y0((com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkNotNull(this.B), tVar != null ? tVar.preacquireSession(this.f9171e, this.B) : de.s.D8));
                }
                int i15 = this.f9182p + 1;
                this.f9182p = i15;
                int i16 = this.f9175i;
                if (i15 == i16) {
                    int i17 = i16 + 1000;
                    long[] jArr = new long[i17];
                    long[] jArr2 = new long[i17];
                    long[] jArr3 = new long[i17];
                    int[] iArr = new int[i17];
                    int[] iArr2 = new int[i17];
                    ee.k0[] k0VarArr = new ee.k0[i17];
                    int i18 = this.f9184r;
                    int i19 = i16 - i18;
                    System.arraycopy(this.f9177k, i18, jArr2, 0, i19);
                    System.arraycopy(this.f9180n, this.f9184r, jArr3, 0, i19);
                    System.arraycopy(this.f9179m, this.f9184r, iArr, 0, i19);
                    System.arraycopy(this.f9178l, this.f9184r, iArr2, 0, i19);
                    System.arraycopy(this.f9181o, this.f9184r, k0VarArr, 0, i19);
                    System.arraycopy(this.f9176j, this.f9184r, jArr, 0, i19);
                    int i20 = this.f9184r;
                    System.arraycopy(this.f9177k, 0, jArr2, i19, i20);
                    System.arraycopy(this.f9180n, 0, jArr3, i19, i20);
                    System.arraycopy(this.f9179m, 0, iArr, i19, i20);
                    System.arraycopy(this.f9178l, 0, iArr2, i19, i20);
                    System.arraycopy(this.f9181o, 0, k0VarArr, i19, i20);
                    System.arraycopy(this.f9176j, 0, jArr, i19, i20);
                    this.f9177k = jArr2;
                    this.f9180n = jArr3;
                    this.f9179m = iArr;
                    this.f9178l = iArr2;
                    this.f9181o = k0VarArr;
                    this.f9176j = jArr;
                    this.f9184r = 0;
                    this.f9175i = i17;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean seekTo(int i10) {
        synchronized (this) {
            this.f9185s = 0;
            this.f9167a.rewind();
        }
        int i11 = this.f9183q;
        if (i10 >= i11 && i10 <= this.f9182p + i11) {
            this.f9186t = Long.MIN_VALUE;
            this.f9185s = i10 - i11;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j10) {
        if (this.F != j10) {
            this.F = j10;
            this.f9192z = true;
        }
    }

    public final void setStartTimeUs(long j10) {
        this.f9186t = j10;
    }

    public final void setUpstreamFormatChangeListener(z0 z0Var) {
        this.f9172f = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void skip(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f9185s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f9182p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.a.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f9185s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f9185s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.a1.skip(int):void");
    }

    public final void sourceId(long j10) {
        this.C = j10;
    }

    public final void splice() {
        this.G = true;
    }

    public void reset(boolean z10) {
        this.f9167a.reset();
        this.f9182p = 0;
        this.f9183q = 0;
        this.f9184r = 0;
        this.f9185s = 0;
        this.f9190x = true;
        this.f9186t = Long.MIN_VALUE;
        this.f9187u = Long.MIN_VALUE;
        this.f9188v = Long.MIN_VALUE;
        this.f9189w = false;
        this.f9169c.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f9191y = true;
        }
    }

    @Override // ee.l0
    public /* bridge */ /* synthetic */ void sampleData(com.google.android.exoplayer2.util.v0 v0Var, int i10) {
        super.sampleData(v0Var, i10);
    }

    @Override // ee.l0
    public final int sampleData(qf.k kVar, int i10, boolean z10, int i11) throws IOException {
        return this.f9167a.sampleData(kVar, i10, z10);
    }

    @Deprecated
    public static a1 createWithDrm(qf.c cVar, Looper looper, de.t tVar, de.p pVar) {
        tVar.setPlayer(looper, zd.c0.f97809b);
        return new a1(cVar, (de.t) com.google.android.exoplayer2.util.a.checkNotNull(tVar), (de.p) com.google.android.exoplayer2.util.a.checkNotNull(pVar));
    }

    @Override // ee.l0
    public final void sampleData(com.google.android.exoplayer2.util.v0 v0Var, int i10, int i11) {
        this.f9167a.sampleData(v0Var, i10);
    }

    public final synchronized boolean seekTo(long j10, boolean z10) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.f9185s = 0;
                        this.f9167a.rewind();
                        int iF = f(this.f9185s);
                        int i10 = this.f9185s;
                        int i11 = this.f9182p;
                        if ((i10 != i11) && j10 >= this.f9180n[iF]) {
                            if (j10 <= this.f9188v || z10) {
                                int iD = d(iF, i11 - i10, j10, true);
                                if (iD == -1) {
                                    return false;
                                }
                                this.f9186t = j10;
                                this.f9185s += iD;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th2 = th;
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }
}
