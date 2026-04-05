package ao;

import android.os.Looper;
import io.bidmachine.media3.common.DrmInitData;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n1 implements ko.e1 {
    public io.bidmachine.media3.common.b A;
    public io.bidmachine.media3.common.b B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final j1 f7737a;

    /* renamed from: d, reason: collision with root package name */
    public final sn.v f7740d;

    /* renamed from: e, reason: collision with root package name */
    public final sn.q f7741e;

    /* renamed from: f, reason: collision with root package name */
    public m1 f7742f;

    /* renamed from: g, reason: collision with root package name */
    public io.bidmachine.media3.common.b f7743g;

    /* renamed from: h, reason: collision with root package name */
    public sn.o f7744h;

    /* renamed from: p, reason: collision with root package name */
    public int f7752p;

    /* renamed from: q, reason: collision with root package name */
    public int f7753q;

    /* renamed from: r, reason: collision with root package name */
    public int f7754r;

    /* renamed from: s, reason: collision with root package name */
    public int f7755s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7759w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7762z;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f7738b = new k1();

    /* renamed from: i, reason: collision with root package name */
    public int f7745i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f7746j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f7747k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f7750n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f7749m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f7748l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public ko.d1[] f7751o = new ko.d1[1000];

    /* renamed from: c, reason: collision with root package name */
    public final y1 f7739c = new y1(new a2.o(7));

    /* renamed from: t, reason: collision with root package name */
    public long f7756t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f7757u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f7758v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7761y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7760x = true;
    public boolean D = true;

    public n1(go.c cVar, sn.v vVar, sn.q qVar) {
        this.f7740d = vVar;
        this.f7741e = qVar;
        this.f7737a = new j1(cVar);
    }

    public static n1 createWithDrm(go.c cVar, sn.v vVar, sn.q qVar) {
        return new n1(cVar, (sn.v) io.bidmachine.media3.common.util.a.checkNotNull(vVar), (sn.q) io.bidmachine.media3.common.util.a.checkNotNull(qVar));
    }

    public static n1 createWithoutDrm(go.c cVar) {
        return new n1(cVar, null, null);
    }

    public final int a(long j10) {
        int i10 = this.f7752p;
        int iF = f(i10 - 1);
        while (i10 > this.f7755s && this.f7750n[iF] >= j10) {
            i10--;
            iF--;
            if (iF == -1) {
                iF = this.f7745i - 1;
            }
        }
        return i10;
    }

    public final long b(int i10) {
        this.f7757u = Math.max(this.f7757u, e(i10));
        this.f7752p -= i10;
        int i11 = this.f7753q + i10;
        this.f7753q = i11;
        int i12 = this.f7754r + i10;
        this.f7754r = i12;
        int i13 = this.f7745i;
        if (i12 >= i13) {
            this.f7754r = i12 - i13;
        }
        int i14 = this.f7755s - i10;
        this.f7755s = i14;
        if (i14 < 0) {
            this.f7755s = 0;
        }
        this.f7739c.discardTo(i11);
        if (this.f7752p != 0) {
            return this.f7747k[this.f7754r];
        }
        int i15 = this.f7754r;
        if (i15 == 0) {
            i15 = this.f7745i;
        }
        return this.f7747k[i15 - 1] + this.f7748l[r6];
    }

    public final long c(int i10) {
        int writeIndex = getWriteIndex() - i10;
        boolean z10 = false;
        io.bidmachine.media3.common.util.a.checkArgument(writeIndex >= 0 && writeIndex <= this.f7752p - this.f7755s);
        int i11 = this.f7752p - writeIndex;
        this.f7752p = i11;
        this.f7758v = Math.max(this.f7757u, e(i11));
        if (writeIndex == 0 && this.f7759w) {
            z10 = true;
        }
        this.f7759w = z10;
        this.f7739c.discardFrom(i10);
        int i12 = this.f7752p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f7747k[f(i12 - 1)] + this.f7748l[r9];
    }

    public final int d(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f7750n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f7749m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f7745i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i10 = this.f7755s;
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
            ao.j1 r0 = r11.f7737a
            monitor-enter(r11)
            int r1 = r11.f7752p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f7750n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f7754r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f7755s     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: ao.n1.discardTo(long, boolean, boolean):void");
    }

    public final void discardToEnd() {
        long jB;
        j1 j1Var = this.f7737a;
        synchronized (this) {
            int i10 = this.f7752p;
            jB = i10 == 0 ? -1L : b(i10);
        }
        j1Var.discardDownstreamTo(jB);
    }

    public final void discardToRead() {
        this.f7737a.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j10) {
        if (this.f7752p == 0) {
            return;
        }
        io.bidmachine.media3.common.util.a.checkArgument(j10 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.f7753q + a(j10));
    }

    public final void discardUpstreamSamples(int i10) {
        this.f7737a.discardUpstreamSampleBytes(c(i10));
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void durationUs(long j10) {
        super.durationUs(j10);
    }

    public final long e(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f7750n[iF]);
            if ((this.f7749m[iF] & 1) != 0) {
                return jMax;
            }
            iF--;
            if (iF == -1) {
                iF = this.f7745i - 1;
            }
        }
        return jMax;
    }

    public final int f(int i10) {
        int i11 = this.f7754r + i10;
        int i12 = this.f7745i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // ko.e1
    public final void format(io.bidmachine.media3.common.b bVar) {
        io.bidmachine.media3.common.b adjustedUpstreamFormat = getAdjustedUpstreamFormat(bVar);
        boolean z10 = false;
        this.f7762z = false;
        this.A = bVar;
        synchronized (this) {
            try {
                this.f7761y = false;
                if (!Objects.equals(adjustedUpstreamFormat, this.B)) {
                    if (this.f7739c.isEmpty() || !((l1) this.f7739c.getEndValue()).f7726a.equals(adjustedUpstreamFormat)) {
                        this.B = adjustedUpstreamFormat;
                    } else {
                        this.B = ((l1) this.f7739c.getEndValue()).f7726a;
                    }
                    boolean z11 = this.D;
                    io.bidmachine.media3.common.b bVar2 = this.B;
                    this.D = z11 & gn.x0.allSamplesAreSyncSamples(bVar2.f60665o, bVar2.f60661k);
                    this.E = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m1 m1Var = this.f7742f;
        if (m1Var == null || !z10) {
            return;
        }
        m1Var.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    public final boolean g(int i10) {
        sn.o oVar = this.f7744h;
        if (oVar == null || oVar.getState() == 4) {
            return true;
        }
        return (this.f7749m[i10] & 1073741824) == 0 && this.f7744h.playClearSamplesWithoutKeys();
    }

    public io.bidmachine.media3.common.b getAdjustedUpstreamFormat(io.bidmachine.media3.common.b bVar) {
        return (this.F == 0 || bVar.f60670t == Long.MAX_VALUE) ? bVar : bVar.buildUpon().setSubsampleOffsetUs(bVar.f60670t + this.F).build();
    }

    public final int getFirstIndex() {
        return this.f7753q;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.f7752p == 0 ? Long.MIN_VALUE : this.f7750n[this.f7754r];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.f7758v;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.f7757u, e(this.f7755s));
    }

    public final int getReadIndex() {
        return this.f7753q + this.f7755s;
    }

    public final synchronized int getSkipCount(long j10, boolean z10) throws Throwable {
        try {
            try {
                int iF = f(this.f7755s);
                int i10 = this.f7755s;
                int i11 = this.f7752p;
                if (!(i10 != i11) || j10 < this.f7750n[iF]) {
                    return 0;
                }
                if (j10 > this.f7758v && z10) {
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

    public final synchronized io.bidmachine.media3.common.b getUpstreamFormat() {
        return this.f7761y ? null : this.B;
    }

    public final int getWriteIndex() {
        return this.f7753q + this.f7752p;
    }

    public final void h(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.r0 r0Var) {
        io.bidmachine.media3.common.b bVar2 = this.f7743g;
        boolean z10 = bVar2 == null;
        DrmInitData drmInitData = bVar2 == null ? null : bVar2.f60669s;
        this.f7743g = bVar;
        DrmInitData drmInitData2 = bVar.f60669s;
        sn.v vVar = this.f7740d;
        r0Var.f61543b = vVar != null ? bVar.copyWithCryptoType(vVar.getCryptoType(bVar)) : bVar;
        r0Var.f61542a = this.f7744h;
        if (vVar == null) {
            return;
        }
        if (z10 || !Objects.equals(drmInitData, drmInitData2)) {
            sn.o oVar = this.f7744h;
            sn.q qVar = this.f7741e;
            sn.o oVarAcquireSession = vVar.acquireSession(qVar, bVar);
            this.f7744h = oVarAcquireSession;
            r0Var.f61542a = oVarAcquireSession;
            if (oVar != null) {
                oVar.release(qVar);
            }
        }
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.f7759w;
    }

    public synchronized boolean isReady(boolean z10) {
        io.bidmachine.media3.common.b bVar;
        boolean z11 = false;
        if (this.f7755s != this.f7752p) {
            if (((l1) this.f7739c.get(getReadIndex())).f7726a != this.f7743g) {
                return true;
            }
            return g(f(this.f7755s));
        }
        if (z10 || this.f7759w || ((bVar = this.B) != null && bVar != this.f7743g)) {
            z11 = true;
        }
        return z11;
    }

    public void maybeThrowError() throws IOException {
        sn.o oVar = this.f7744h;
        if (oVar != null && oVar.getState() == 1) {
            throw ((sn.n) io.bidmachine.media3.common.util.a.checkNotNull(this.f7744h.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7755s != this.f7752p ? this.f7746j[f(this.f7755s)] : this.C;
    }

    public void preRelease() {
        discardToEnd();
        sn.o oVar = this.f7744h;
        if (oVar != null) {
            oVar.release(this.f7741e);
            this.f7744h = null;
            this.f7743g = null;
        }
    }

    public int read(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        k1 k1Var = this.f7738b;
        synchronized (this) {
            try {
                gVar.f77081g = false;
                i11 = -3;
                if (this.f7755s != this.f7752p) {
                    io.bidmachine.media3.common.b bVar = ((l1) this.f7739c.get(getReadIndex())).f7726a;
                    if (!z11 && bVar == this.f7743g) {
                        int iF = f(this.f7755s);
                        if (g(iF)) {
                            gVar.setFlags(this.f7749m[iF]);
                            if (this.f7755s == this.f7752p - 1 && (z10 || this.f7759w)) {
                                gVar.addFlag(536870912);
                            }
                            gVar.f77082h = this.f7750n[iF];
                            k1Var.f7723a = this.f7748l[iF];
                            k1Var.f7724b = this.f7747k[iF];
                            k1Var.f7725c = this.f7751o[iF];
                            i11 = -4;
                        } else {
                            gVar.f77081g = true;
                        }
                    }
                    h(bVar, r0Var);
                    i11 = -5;
                } else {
                    if (!z10 && !this.f7759w) {
                        io.bidmachine.media3.common.b bVar2 = this.B;
                        if (bVar2 == null || (!z11 && bVar2 == this.f7743g)) {
                        }
                        h((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(bVar2), r0Var);
                        i11 = -5;
                    }
                    gVar.setFlags(4);
                    gVar.f77082h = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !gVar.isEndOfStream()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    this.f7737a.peekToBuffer(gVar, this.f7738b);
                } else {
                    this.f7737a.readToBuffer(gVar, this.f7738b);
                }
            }
            if (!z12) {
                this.f7755s++;
            }
        }
        return i11;
    }

    public void release() {
        reset(true);
        sn.o oVar = this.f7744h;
        if (oVar != null) {
            oVar.release(this.f7741e);
            this.f7744h = null;
            this.f7743g = null;
        }
    }

    public final void reset() {
        reset(false);
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return super.sampleData(oVar, i10, z10);
    }

    @Override // ko.e1
    public void sampleMetadata(long j10, int i10, int i11, int i12, ko.d1 d1Var) {
        boolean z10;
        if (this.f7762z) {
            format((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(this.A));
        }
        int i13 = i10 & 1;
        boolean z11 = i13 != 0;
        if (this.f7760x) {
            if (!z11) {
                return;
            } else {
                this.f7760x = false;
            }
        }
        long j11 = j10 + this.F;
        if (this.D) {
            if (j11 < this.f7756t) {
                return;
            }
            if (i13 == 0) {
                if (!this.E) {
                    io.bidmachine.media3.common.util.b0.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
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
                if (this.f7752p == 0) {
                    z10 = j11 > this.f7757u;
                } else if (getLargestReadTimestampUs() >= j11) {
                    z10 = false;
                } else {
                    c(this.f7753q + a(j11));
                    z10 = true;
                }
            }
            if (!z10) {
                return;
            } else {
                this.G = false;
            }
        }
        long totalBytesWritten = (this.f7737a.getTotalBytesWritten() - i11) - i12;
        synchronized (this) {
            try {
                int i14 = this.f7752p;
                if (i14 > 0) {
                    int iF = f(i14 - 1);
                    io.bidmachine.media3.common.util.a.checkArgument(this.f7747k[iF] + ((long) this.f7748l[iF]) <= totalBytesWritten);
                }
                this.f7759w = (536870912 & i10) != 0;
                this.f7758v = Math.max(this.f7758v, j11);
                int iF2 = f(this.f7752p);
                this.f7750n[iF2] = j11;
                this.f7747k[iF2] = totalBytesWritten;
                this.f7748l[iF2] = i11;
                this.f7749m[iF2] = i10;
                this.f7751o[iF2] = d1Var;
                this.f7746j[iF2] = this.C;
                if (this.f7739c.isEmpty() || !((l1) this.f7739c.getEndValue()).f7726a.equals(this.B)) {
                    io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.B);
                    sn.v vVar = this.f7740d;
                    this.f7739c.appendSpan(getWriteIndex(), new l1(bVar, vVar != null ? vVar.preacquireSession(this.f7741e, bVar) : sn.u.V8));
                }
                int i15 = this.f7752p + 1;
                this.f7752p = i15;
                int i16 = this.f7745i;
                if (i15 == i16) {
                    int i17 = i16 + 1000;
                    long[] jArr = new long[i17];
                    long[] jArr2 = new long[i17];
                    long[] jArr3 = new long[i17];
                    int[] iArr = new int[i17];
                    int[] iArr2 = new int[i17];
                    ko.d1[] d1VarArr = new ko.d1[i17];
                    int i18 = this.f7754r;
                    int i19 = i16 - i18;
                    System.arraycopy(this.f7747k, i18, jArr2, 0, i19);
                    System.arraycopy(this.f7750n, this.f7754r, jArr3, 0, i19);
                    System.arraycopy(this.f7749m, this.f7754r, iArr, 0, i19);
                    System.arraycopy(this.f7748l, this.f7754r, iArr2, 0, i19);
                    System.arraycopy(this.f7751o, this.f7754r, d1VarArr, 0, i19);
                    System.arraycopy(this.f7746j, this.f7754r, jArr, 0, i19);
                    int i20 = this.f7754r;
                    System.arraycopy(this.f7747k, 0, jArr2, i19, i20);
                    System.arraycopy(this.f7750n, 0, jArr3, i19, i20);
                    System.arraycopy(this.f7749m, 0, iArr, i19, i20);
                    System.arraycopy(this.f7748l, 0, iArr2, i19, i20);
                    System.arraycopy(this.f7751o, 0, d1VarArr, i19, i20);
                    System.arraycopy(this.f7746j, 0, jArr, i19, i20);
                    this.f7747k = jArr2;
                    this.f7750n = jArr3;
                    this.f7749m = iArr;
                    this.f7748l = iArr2;
                    this.f7751o = d1VarArr;
                    this.f7746j = jArr;
                    this.f7754r = 0;
                    this.f7745i = i17;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean seekTo(int i10) {
        synchronized (this) {
            this.f7755s = 0;
            this.f7737a.rewind();
        }
        int i11 = this.f7753q;
        if (i10 >= i11 && i10 <= this.f7752p + i11) {
            this.f7756t = Long.MIN_VALUE;
            this.f7755s = i10 - i11;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j10) {
        if (this.F != j10) {
            this.F = j10;
            this.f7762z = true;
        }
    }

    public final void setStartTimeUs(long j10) {
        this.f7756t = j10;
    }

    public final void setUpstreamFormatChangeListener(m1 m1Var) {
        this.f7742f = m1Var;
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
            int r0 = r2.f7755s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f7752p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            io.bidmachine.media3.common.util.a.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f7755s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f7755s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.n1.skip(int):void");
    }

    public final void sourceId(long j10) {
        this.C = j10;
    }

    public final void splice() {
        this.G = true;
    }

    public void reset(boolean z10) {
        this.f7737a.reset();
        this.f7752p = 0;
        this.f7753q = 0;
        this.f7754r = 0;
        this.f7755s = 0;
        this.f7760x = true;
        this.f7756t = Long.MIN_VALUE;
        this.f7757u = Long.MIN_VALUE;
        this.f7758v = Long.MIN_VALUE;
        this.f7759w = false;
        this.f7739c.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f7761y = true;
            this.D = true;
        }
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10) {
        super.sampleData(m0Var, i10);
    }

    @Override // ko.e1
    public final int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
        return this.f7737a.sampleData(oVar, i10, z10);
    }

    @Deprecated
    public static n1 createWithDrm(go.c cVar, Looper looper, sn.v vVar, sn.q qVar) {
        vVar.setPlayer(looper, on.f0.f79624d);
        return new n1(cVar, (sn.v) io.bidmachine.media3.common.util.a.checkNotNull(vVar), (sn.q) io.bidmachine.media3.common.util.a.checkNotNull(qVar));
    }

    @Override // ko.e1
    public final void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10, int i11) {
        this.f7737a.sampleData(m0Var, i10);
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean seekTo(long j10, boolean z10) throws Throwable {
        Throwable th2;
        n1 n1Var;
        long j11;
        int iD;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f7755s = 0;
                        this.f7737a.rewind();
                        int iF = f(this.f7755s);
                        int i10 = this.f7755s;
                        int i11 = this.f7752p;
                        if (!(i10 != i11) || j10 < this.f7750n[iF] || (j10 > this.f7758v && !z10)) {
                            return false;
                        }
                        if (this.D) {
                            int i12 = i11 - i10;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    try {
                                        if (this.f7750n[iF] >= j10) {
                                            i12 = i13;
                                            break;
                                        }
                                        iF++;
                                        if (iF == this.f7745i) {
                                            iF = 0;
                                        }
                                        i13++;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        throw th2;
                                    }
                                } else if (!z10) {
                                    i12 = -1;
                                }
                            }
                            j11 = j10;
                            iD = i12;
                            n1Var = this;
                        } else {
                            int i14 = i11 - i10;
                            n1Var = this;
                            j11 = j10;
                            iD = n1Var.d(iF, i14, j11, true);
                        }
                        if (iD == -1) {
                            return false;
                        }
                        n1Var.f7756t = j11;
                        n1Var.f7755s += iD;
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th;
                    throw th2;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
