package io.odeeo.internal.a0;

import android.os.Looper;
import io.odeeo.internal.f.f;
import io.odeeo.internal.f.g;
import io.odeeo.internal.f.h;
import io.odeeo.internal.g.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 implements io.odeeo.internal.g.x {
    public boolean A;
    public io.odeeo.internal.b.t B;
    public io.odeeo.internal.b.t C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f62246a;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.f.h f62249d;

    /* renamed from: e, reason: collision with root package name */
    public final g.a f62250e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f62251f;

    /* renamed from: g, reason: collision with root package name */
    public d f62252g;

    /* renamed from: h, reason: collision with root package name */
    public io.odeeo.internal.b.t f62253h;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.f.f f62254i;

    /* renamed from: q, reason: collision with root package name */
    public int f62262q;

    /* renamed from: r, reason: collision with root package name */
    public int f62263r;

    /* renamed from: s, reason: collision with root package name */
    public int f62264s;

    /* renamed from: t, reason: collision with root package name */
    public int f62265t;

    /* renamed from: x, reason: collision with root package name */
    public boolean f62269x;

    /* renamed from: b, reason: collision with root package name */
    public final b f62247b = new b();

    /* renamed from: j, reason: collision with root package name */
    public int f62255j = 1000;

    /* renamed from: k, reason: collision with root package name */
    public int[] f62256k = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public long[] f62257l = new long[1000];

    /* renamed from: o, reason: collision with root package name */
    public long[] f62260o = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public int[] f62259n = new int[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f62258m = new int[1000];

    /* renamed from: p, reason: collision with root package name */
    public x.a[] f62261p = new x.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final j0<c> f62248c = new j0<>(new e6.h0(19));

    /* renamed from: u, reason: collision with root package name */
    public long f62266u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f62267v = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public long f62268w = Long.MIN_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public boolean f62271z = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f62270y = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f62272a;

        /* renamed from: b, reason: collision with root package name */
        public long f62273b;

        /* renamed from: c, reason: collision with root package name */
        public x.a f62274c;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.b.t f62275a;

        /* renamed from: b, reason: collision with root package name */
        public final h.b f62276b;

        public c(io.odeeo.internal.b.t tVar, h.b bVar) {
            this.f62275a = tVar;
            this.f62276b = bVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void onUpstreamFormatChanged(io.odeeo.internal.b.t tVar);
    }

    public c0(io.odeeo.internal.p0.b bVar, Looper looper, io.odeeo.internal.f.h hVar, g.a aVar) {
        this.f62251f = looper;
        this.f62249d = hVar;
        this.f62250e = aVar;
        this.f62246a = new b0(bVar);
    }

    public static c0 createWithDrm(io.odeeo.internal.p0.b bVar, Looper looper, io.odeeo.internal.f.h hVar, g.a aVar) {
        return new c0(bVar, (Looper) io.odeeo.internal.q0.a.checkNotNull(looper), (io.odeeo.internal.f.h) io.odeeo.internal.q0.a.checkNotNull(hVar), (g.a) io.odeeo.internal.q0.a.checkNotNull(aVar));
    }

    public static c0 createWithoutDrm(io.odeeo.internal.p0.b bVar) {
        return new c0(bVar, null, null, null);
    }

    public final synchronized boolean b(io.odeeo.internal.b.t tVar) {
        try {
            this.f62271z = false;
            if (io.odeeo.internal.q0.g0.areEqual(tVar, this.C)) {
                return false;
            }
            if (this.f62248c.isEmpty() || !this.f62248c.getEndValue().f62275a.equals(tVar)) {
                this.C = tVar;
            } else {
                this.C = this.f62248c.getEndValue().f62275a;
            }
            io.odeeo.internal.b.t tVar2 = this.C;
            this.E = io.odeeo.internal.q0.t.allSamplesAreSyncSamples(tVar2.f62971l, tVar2.f62968i);
            this.F = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        this.A = true;
    }

    public final void d() {
        io.odeeo.internal.f.f fVar = this.f62254i;
        if (fVar != null) {
            fVar.release(this.f62250e);
            this.f62254i = null;
            this.f62253h = null;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i10 = this.f62265t;
        if (i10 == 0) {
            return -1L;
        }
        return a(i10);
    }

    public final void discardTo(long j10, boolean z10, boolean z11) {
        this.f62246a.discardDownstreamTo(a(j10, z10, z11));
    }

    public final void discardToEnd() {
        this.f62246a.discardDownstreamTo(a());
    }

    public final void discardToRead() {
        this.f62246a.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j10) {
        if (this.f62262q == 0) {
            return;
        }
        io.odeeo.internal.q0.a.checkArgument(j10 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.f62263r + b(j10));
    }

    public final void discardUpstreamSamples(int i10) {
        this.f62246a.discardUpstreamSampleBytes(b(i10));
    }

    public final synchronized void e() {
        this.f62265t = 0;
        this.f62246a.rewind();
    }

    @Override // io.odeeo.internal.g.x
    public final void format(io.odeeo.internal.b.t tVar) {
        io.odeeo.internal.b.t tVarA = a(tVar);
        this.A = false;
        this.B = tVar;
        boolean zB = b(tVarA);
        d dVar = this.f62252g;
        if (dVar == null || !zB) {
            return;
        }
        dVar.onUpstreamFormatChanged(tVarA);
    }

    public final int getFirstIndex() {
        return this.f62263r;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.f62262q == 0 ? Long.MIN_VALUE : this.f62260o[this.f62264s];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.f62268w;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.f62267v, c(this.f62265t));
    }

    public final int getReadIndex() {
        return this.f62263r + this.f62265t;
    }

    public final synchronized int getSkipCount(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iD = d(this.f62265t);
                if (!b() || j10 < this.f62260o[iD]) {
                    return 0;
                }
                if (j10 <= this.f62268w || !z10) {
                    int iA = a(iD, this.f62262q - this.f62265t, j10, true);
                    if (iA == -1) {
                        return 0;
                    }
                    return iA;
                }
                try {
                    return this.f62262q - this.f62265t;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized io.odeeo.internal.b.t getUpstreamFormat() {
        return this.f62271z ? null : this.C;
    }

    public final int getWriteIndex() {
        return this.f62263r + this.f62262q;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.f62269x;
    }

    public synchronized boolean isReady(boolean z10) {
        io.odeeo.internal.b.t tVar;
        boolean z11 = true;
        if (b()) {
            if (this.f62248c.get(getReadIndex()).f62275a != this.f62253h) {
                return true;
            }
            return e(d(this.f62265t));
        }
        if (!z10 && !this.f62269x && ((tVar = this.C) == null || tVar == this.f62253h)) {
            z11 = false;
        }
        return z11;
    }

    public void maybeThrowError() throws IOException {
        io.odeeo.internal.f.f fVar = this.f62254i;
        if (fVar != null && fVar.getState() == 1) {
            throw ((f.a) io.odeeo.internal.q0.a.checkNotNull(this.f62254i.getError()));
        }
    }

    public final synchronized int peekSourceId() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return b() ? this.f62256k[d(this.f62265t)] : this.D;
    }

    public void preRelease() {
        discardToEnd();
        d();
    }

    public int read(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10, boolean z10) {
        int iA = a(uVar, gVar, (i10 & 2) != 0, z10, this.f62247b);
        if (iA == -4 && !gVar.isEndOfStream()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f62246a.peekToBuffer(gVar, this.f62247b);
                } else {
                    this.f62246a.readToBuffer(gVar, this.f62247b);
                }
            }
            if (!z11) {
                this.f62265t++;
            }
        }
        return iA;
    }

    public void release() {
        reset(true);
        d();
    }

    public final void reset() {
        reset(false);
    }

    @Override // io.odeeo.internal.g.x
    public /* bridge */ /* synthetic */ int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10) throws IOException {
        return super.sampleData(gVar, i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // io.odeeo.internal.g.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, io.odeeo.internal.g.x.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.A
            if (r1 == 0) goto Lf
            io.odeeo.internal.b.t r1 = r11.B
            java.lang.Object r1 = io.odeeo.internal.q0.a.checkStateNotNull(r1)
            io.odeeo.internal.b.t r1 = (io.odeeo.internal.b.t) r1
            r11.format(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f62270y
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L61
        L1f:
            r11.f62270y = r2
        L21:
            long r5 = r11.G
            long r5 = r5 + r12
            boolean r7 = r11.E
            if (r7 == 0) goto L50
            long r7 = r11.f62266u
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L61
        L2f:
            if (r1 != 0) goto L50
            boolean r1 = r11.F
            if (r1 != 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.<init>(r7)
            io.odeeo.internal.b.t r7 = r11.C
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            io.odeeo.internal.q0.p.w(r7, r1)
            r11.F = r3
        L4c:
            r1 = r14 | 1
            r3 = r1
            goto L51
        L50:
            r3 = r14
        L51:
            boolean r1 = r11.H
            if (r1 == 0) goto L62
            if (r4 == 0) goto L61
            boolean r1 = r11.a(r5)
            if (r1 != 0) goto L5e
            goto L61
        L5e:
            r11.H = r2
            goto L62
        L61:
            return
        L62:
            io.odeeo.internal.a0.b0 r1 = r11.f62246a
            long r1 = r1.getTotalBytesWritten()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.c0.sampleMetadata(long, int, int, int, io.odeeo.internal.g.x$a):void");
    }

    public final synchronized boolean seekTo(int i10) {
        e();
        int i11 = this.f62263r;
        if (i10 >= i11 && i10 <= this.f62262q + i11) {
            this.f62266u = Long.MIN_VALUE;
            this.f62265t = i10 - i11;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j10) {
        if (this.G != j10) {
            this.G = j10;
            c();
        }
    }

    public final void setStartTimeUs(long j10) {
        this.f62266u = j10;
    }

    public final void setUpstreamFormatChangeListener(d dVar) {
        this.f62252g = dVar;
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
            int r0 = r2.f62265t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f62262q     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            io.odeeo.internal.q0.a.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f62265t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f62265t = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.c0.skip(int):void");
    }

    public final void sourceId(int i10) {
        this.D = i10;
    }

    public final void splice() {
        this.H = true;
    }

    public io.odeeo.internal.b.t a(io.odeeo.internal.b.t tVar) {
        return (this.G == 0 || tVar.f62975p == Long.MAX_VALUE) ? tVar : tVar.buildUpon().setSubsampleOffsetUs(tVar.f62975p + this.G).build();
    }

    public final long c(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iD = d(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f62260o[iD]);
            if ((this.f62259n[iD] & 1) != 0) {
                return jMax;
            }
            iD--;
            if (iD == -1) {
                iD = this.f62255j - 1;
            }
        }
        return jMax;
    }

    public void reset(boolean z10) {
        this.f62246a.reset();
        this.f62262q = 0;
        this.f62263r = 0;
        this.f62264s = 0;
        this.f62265t = 0;
        this.f62270y = true;
        this.f62266u = Long.MIN_VALUE;
        this.f62267v = Long.MIN_VALUE;
        this.f62268w = Long.MIN_VALUE;
        this.f62269x = false;
        this.f62248c.clear();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f62271z = true;
        }
    }

    @Override // io.odeeo.internal.g.x
    public /* bridge */ /* synthetic */ void sampleData(io.odeeo.internal.q0.x xVar, int i10) {
        super.sampleData(xVar, i10);
    }

    public final boolean e(int i10) {
        io.odeeo.internal.f.f fVar = this.f62254i;
        if (fVar == null || fVar.getState() == 4) {
            return true;
        }
        return (this.f62259n[i10] & 1073741824) == 0 && this.f62254i.playClearSamplesWithoutKeys();
    }

    @Override // io.odeeo.internal.g.x
    public final int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10, int i11) throws IOException {
        return this.f62246a.sampleData(gVar, i10, z10);
    }

    @Override // io.odeeo.internal.g.x
    public final void sampleData(io.odeeo.internal.q0.x xVar, int i10, int i11) {
        this.f62246a.sampleData(xVar, i10);
    }

    public final int d(int i10) {
        int i11 = this.f62264s + i10;
        int i12 = this.f62255j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized boolean seekTo(long j10, boolean z10) throws Throwable {
        try {
            try {
                e();
                int iD = d(this.f62265t);
                if (!b() || j10 < this.f62260o[iD] || (j10 > this.f62268w && !z10)) {
                    return false;
                }
                int iA = a(iD, this.f62262q - this.f62265t, j10, true);
                if (iA == -1) {
                    return false;
                }
                this.f62266u = j10;
                this.f62265t += iA;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized int a(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, boolean z10, boolean z11, b bVar) {
        try {
            gVar.f63706d = false;
            if (!b()) {
                if (!z11 && !this.f62269x) {
                    io.odeeo.internal.b.t tVar = this.C;
                    if (tVar == null || (!z10 && tVar == this.f62253h)) {
                        return -3;
                    }
                    a((io.odeeo.internal.b.t) io.odeeo.internal.q0.a.checkNotNull(tVar), uVar);
                    return -5;
                }
                gVar.setFlags(4);
                return -4;
            }
            io.odeeo.internal.b.t tVar2 = this.f62248c.get(getReadIndex()).f62275a;
            if (!z10 && tVar2 == this.f62253h) {
                int iD = d(this.f62265t);
                if (!e(iD)) {
                    gVar.f63706d = true;
                    return -3;
                }
                gVar.setFlags(this.f62259n[iD]);
                long j10 = this.f62260o[iD];
                gVar.f63707e = j10;
                if (j10 < this.f62266u) {
                    gVar.addFlag(Integer.MIN_VALUE);
                }
                bVar.f62272a = this.f62258m[iD];
                bVar.f62273b = this.f62257l[iD];
                bVar.f62274c = this.f62261p[iD];
                return -4;
            }
            a(tVar2, uVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final long b(int i10) {
        int writeIndex = getWriteIndex() - i10;
        boolean z10 = false;
        io.odeeo.internal.q0.a.checkArgument(writeIndex >= 0 && writeIndex <= this.f62262q - this.f62265t);
        int i11 = this.f62262q - writeIndex;
        this.f62262q = i11;
        this.f62268w = Math.max(this.f62267v, c(i11));
        if (writeIndex == 0 && this.f62269x) {
            z10 = true;
        }
        this.f62269x = z10;
        this.f62248c.discardFrom(i10);
        int i12 = this.f62262q;
        if (i12 == 0) {
            return 0L;
        }
        return this.f62257l[d(i12 - 1)] + this.f62258m[r9];
    }

    public final boolean b() {
        return this.f62265t != this.f62262q;
    }

    public final int b(long j10) {
        int i10 = this.f62262q;
        int iD = d(i10 - 1);
        while (i10 > this.f62265t && this.f62260o[iD] >= j10) {
            i10--;
            iD--;
            if (iD == -1) {
                iD = this.f62255j - 1;
            }
        }
        return i10;
    }

    public final synchronized long a(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f62262q;
                if (i10 != 0) {
                    long[] jArr = this.f62260o;
                    int i11 = this.f62264s;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f62265t;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iA = a(i11, i10, j10, z10);
                        if (iA == -1) {
                            return -1L;
                        }
                        return a(iA);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized long a() {
        int i10 = this.f62262q;
        if (i10 == 0) {
            return -1L;
        }
        return a(i10);
    }

    public final synchronized void a(long j10, int i10, long j11, int i11, x.a aVar) {
        h.b bVarPreacquireSession;
        try {
            int i12 = this.f62262q;
            if (i12 > 0) {
                int iD = d(i12 - 1);
                io.odeeo.internal.q0.a.checkArgument(this.f62257l[iD] + ((long) this.f62258m[iD]) <= j11);
            }
            this.f62269x = (536870912 & i10) != 0;
            this.f62268w = Math.max(this.f62268w, j10);
            int iD2 = d(this.f62262q);
            this.f62260o[iD2] = j10;
            this.f62257l[iD2] = j11;
            this.f62258m[iD2] = i11;
            this.f62259n[iD2] = i10;
            this.f62261p[iD2] = aVar;
            this.f62256k[iD2] = this.D;
            if (this.f62248c.isEmpty() || !this.f62248c.getEndValue().f62275a.equals(this.C)) {
                io.odeeo.internal.f.h hVar = this.f62249d;
                if (hVar != null) {
                    bVarPreacquireSession = hVar.preacquireSession((Looper) io.odeeo.internal.q0.a.checkNotNull(this.f62251f), this.f62250e, this.C);
                } else {
                    bVarPreacquireSession = h.b.f63925a;
                }
                this.f62248c.appendSpan(getWriteIndex(), new c((io.odeeo.internal.b.t) io.odeeo.internal.q0.a.checkNotNull(this.C), bVarPreacquireSession));
            }
            int i13 = this.f62262q + 1;
            this.f62262q = i13;
            int i14 = this.f62255j;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                x.a[] aVarArr = new x.a[i15];
                int i16 = this.f62264s;
                int i17 = i14 - i16;
                System.arraycopy(this.f62257l, i16, jArr, 0, i17);
                System.arraycopy(this.f62260o, this.f62264s, jArr2, 0, i17);
                System.arraycopy(this.f62259n, this.f62264s, iArr2, 0, i17);
                System.arraycopy(this.f62258m, this.f62264s, iArr3, 0, i17);
                System.arraycopy(this.f62261p, this.f62264s, aVarArr, 0, i17);
                System.arraycopy(this.f62256k, this.f62264s, iArr, 0, i17);
                int i18 = this.f62264s;
                System.arraycopy(this.f62257l, 0, jArr, i17, i18);
                System.arraycopy(this.f62260o, 0, jArr2, i17, i18);
                System.arraycopy(this.f62259n, 0, iArr2, i17, i18);
                System.arraycopy(this.f62258m, 0, iArr3, i17, i18);
                System.arraycopy(this.f62261p, 0, aVarArr, i17, i18);
                System.arraycopy(this.f62256k, 0, iArr, i17, i18);
                this.f62257l = jArr;
                this.f62260o = jArr2;
                this.f62259n = iArr2;
                this.f62258m = iArr3;
                this.f62261p = aVarArr;
                this.f62256k = iArr;
                this.f62264s = 0;
                this.f62255j = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean a(long j10) {
        if (this.f62262q == 0) {
            return j10 > this.f62267v;
        }
        if (getLargestReadTimestampUs() >= j10) {
            return false;
        }
        b(this.f62263r + b(j10));
        return true;
    }

    public final void a(io.odeeo.internal.b.t tVar, io.odeeo.internal.b.u uVar) {
        io.odeeo.internal.b.t tVar2 = this.f62253h;
        boolean z10 = tVar2 == null;
        io.odeeo.internal.f.e eVar = z10 ? null : tVar2.f62974o;
        this.f62253h = tVar;
        io.odeeo.internal.f.e eVar2 = tVar.f62974o;
        io.odeeo.internal.f.h hVar = this.f62249d;
        uVar.f63020b = hVar != null ? tVar.copyWithCryptoType(hVar.getCryptoType(tVar)) : tVar;
        uVar.f63019a = this.f62254i;
        if (this.f62249d == null) {
            return;
        }
        if (z10 || !io.odeeo.internal.q0.g0.areEqual(eVar, eVar2)) {
            io.odeeo.internal.f.f fVar = this.f62254i;
            io.odeeo.internal.f.f fVarAcquireSession = this.f62249d.acquireSession((Looper) io.odeeo.internal.q0.a.checkNotNull(this.f62251f), this.f62250e, tVar);
            this.f62254i = fVarAcquireSession;
            uVar.f63019a = fVarAcquireSession;
            if (fVar != null) {
                fVar.release(this.f62250e);
            }
        }
    }

    public final int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f62260o[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f62259n[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f62255j) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final long a(int i10) {
        this.f62267v = Math.max(this.f62267v, c(i10));
        this.f62262q -= i10;
        int i11 = this.f62263r + i10;
        this.f62263r = i11;
        int i12 = this.f62264s + i10;
        this.f62264s = i12;
        int i13 = this.f62255j;
        if (i12 >= i13) {
            this.f62264s = i12 - i13;
        }
        int i14 = this.f62265t - i10;
        this.f62265t = i14;
        if (i14 < 0) {
            this.f62265t = 0;
        }
        this.f62248c.discardTo(i11);
        if (this.f62262q == 0) {
            int i15 = this.f62264s;
            if (i15 == 0) {
                i15 = this.f62255j;
            }
            return this.f62257l[i15 - 1] + this.f62258m[r6];
        }
        return this.f62257l[this.f62264s];
    }
}
