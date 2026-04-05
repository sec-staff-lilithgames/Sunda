package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.e;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.b.t0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f62277a;

    /* renamed from: b, reason: collision with root package name */
    public r.a f62278b;

    /* renamed from: c, reason: collision with root package name */
    public a[] f62279c = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public long f62280e;

    /* renamed from: f, reason: collision with root package name */
    public long f62281f;

    /* renamed from: g, reason: collision with root package name */
    public long f62282g;

    /* renamed from: h, reason: collision with root package name */
    public e.b f62283h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final d0 f62284a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f62285b;

        public a(d0 d0Var) {
            this.f62284a = d0Var;
        }

        public void clearSentEos() {
            this.f62285b = false;
        }

        @Override // io.odeeo.internal.a0.d0
        public boolean isReady() {
            return !d.this.a() && this.f62284a.isReady();
        }

        @Override // io.odeeo.internal.a0.d0
        public void maybeThrowError() throws IOException {
            this.f62284a.maybeThrowError();
        }

        @Override // io.odeeo.internal.a0.d0
        public int readData(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10) {
            if (d.this.a()) {
                return -3;
            }
            if (this.f62285b) {
                gVar.setFlags(4);
                return -4;
            }
            int data = this.f62284a.readData(uVar, gVar, i10);
            if (data == -5) {
                io.odeeo.internal.b.t tVar = (io.odeeo.internal.b.t) io.odeeo.internal.q0.a.checkNotNull(uVar.f63020b);
                int i11 = tVar.B;
                if (i11 != 0 || tVar.C != 0) {
                    d dVar = d.this;
                    if (dVar.f62281f != 0) {
                        i11 = 0;
                    }
                    uVar.f63020b = tVar.buildUpon().setEncoderDelay(i11).setEncoderPadding(dVar.f62282g == Long.MIN_VALUE ? tVar.C : 0).build();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f62282g;
            if (j10 == Long.MIN_VALUE || ((data != -4 || gVar.f63707e < j10) && !(data == -3 && dVar2.getBufferedPositionUs() == Long.MIN_VALUE && !gVar.f63706d))) {
                return data;
            }
            gVar.clear();
            gVar.setFlags(4);
            this.f62285b = true;
            return -4;
        }

        @Override // io.odeeo.internal.a0.d0
        public int skipData(long j10) {
            if (d.this.a()) {
                return -3;
            }
            return this.f62284a.skipData(j10);
        }
    }

    public d(r rVar, boolean z10, long j10, long j11) {
        this.f62277a = rVar;
        this.f62280e = z10 ? j10 : C.TIME_UNSET;
        this.f62281f = j10;
        this.f62282g = j11;
    }

    public boolean a() {
        return this.f62280e != C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        return this.f62277a.continueLoading(j10);
    }

    @Override // io.odeeo.internal.a0.r
    public void discardBuffer(long j10, boolean z10) {
        this.f62277a.discardBuffer(j10, z10);
    }

    @Override // io.odeeo.internal.a0.r
    public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
        long j11 = this.f62281f;
        if (j10 == j11) {
            return j11;
        }
        return this.f62277a.getAdjustedSeekPositionUs(j10, a(j10, t0Var));
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f62277a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f62282g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f62277a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f62282g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.odeeo.internal.a0.r
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.odeeo.internal.a0.r
    public l0 getTrackGroups() {
        return this.f62277a.getTrackGroups();
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean isLoading() {
        return this.f62277a.isLoading();
    }

    @Override // io.odeeo.internal.a0.r
    public void maybeThrowPrepareError() throws IOException {
        e.b bVar = this.f62283h;
        if (bVar != null) {
            throw bVar;
        }
        this.f62277a.maybeThrowPrepareError();
    }

    @Override // io.odeeo.internal.a0.r.a
    public void onPrepared(r rVar) {
        if (this.f62283h != null) {
            return;
        }
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62278b)).onPrepared(this);
    }

    @Override // io.odeeo.internal.a0.r
    public void prepare(r.a aVar, long j10) {
        this.f62278b = aVar;
        this.f62277a.prepare(this, j10);
    }

    @Override // io.odeeo.internal.a0.r
    public long readDiscontinuity() {
        if (a()) {
            long j10 = this.f62280e;
            this.f62280e = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f62277a.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        io.odeeo.internal.q0.a.checkState(discontinuity2 >= this.f62281f);
        long j11 = this.f62282g;
        io.odeeo.internal.q0.a.checkState(j11 == Long.MIN_VALUE || discontinuity2 <= j11);
        return discontinuity2;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public void reevaluateBuffer(long j10) {
        this.f62277a.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // io.odeeo.internal.a0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f62280e = r0
            io.odeeo.internal.a0.d$a[] r0 = r5.f62279c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.clearSentEos()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            io.odeeo.internal.a0.r r0 = r5.f62277a
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f62281f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f62282g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            io.odeeo.internal.q0.a.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.d.seekToUs(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // io.odeeo.internal.a0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long selectTracks(io.odeeo.internal.n0.d[] r10, boolean[] r11, io.odeeo.internal.a0.d0[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            io.odeeo.internal.a0.d$a[] r0 = new io.odeeo.internal.a0.d.a[r0]
            r9.f62279c = r0
            int r0 = r12.length
            io.odeeo.internal.a0.d0[] r4 = new io.odeeo.internal.a0.d0[r0]
            r0 = 0
            r1 = r0
        La:
            int r2 = r12.length
            r8 = 0
            if (r1 >= r2) goto L1f
            io.odeeo.internal.a0.d$a[] r2 = r9.f62279c
            r3 = r12[r1]
            io.odeeo.internal.a0.d$a r3 = (io.odeeo.internal.a0.d.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1a
            io.odeeo.internal.a0.d0 r8 = r3.f62284a
        L1a:
            r4[r1] = r8
            int r1 = r1 + 1
            goto La
        L1f:
            io.odeeo.internal.a0.r r1 = r9.f62277a
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            long r10 = r1.selectTracks(r2, r3, r4, r5, r6)
            boolean r13 = r9.a()
            if (r13 == 0) goto L3d
            long r13 = r9.f62281f
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 != 0) goto L3d
            boolean r13 = a(r13, r2)
            if (r13 == 0) goto L3d
            r13 = r10
            goto L42
        L3d:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L42:
            r9.f62280e = r13
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L5d
            long r13 = r9.f62281f
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 < 0) goto L5b
            long r13 = r9.f62282g
            r1 = -9223372036854775808
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 == 0) goto L5d
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 > 0) goto L5b
            goto L5d
        L5b:
            r13 = r0
            goto L5e
        L5d:
            r13 = 1
        L5e:
            io.odeeo.internal.q0.a.checkState(r13)
        L61:
            int r13 = r12.length
            if (r0 >= r13) goto L87
            r13 = r4[r0]
            if (r13 != 0) goto L6d
            io.odeeo.internal.a0.d$a[] r13 = r9.f62279c
            r13[r0] = r8
            goto L7e
        L6d:
            io.odeeo.internal.a0.d$a[] r14 = r9.f62279c
            r15 = r14[r0]
            if (r15 == 0) goto L77
            io.odeeo.internal.a0.d0 r15 = r15.f62284a
            if (r15 == r13) goto L7e
        L77:
            io.odeeo.internal.a0.d$a r15 = new io.odeeo.internal.a0.d$a
            r15.<init>(r13)
            r14[r0] = r15
        L7e:
            io.odeeo.internal.a0.d$a[] r13 = r9.f62279c
            r13 = r13[r0]
            r12[r0] = r13
            int r0 = r0 + 1
            goto L61
        L87:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.d.selectTracks(io.odeeo.internal.n0.d[], boolean[], io.odeeo.internal.a0.d0[], boolean[], long):long");
    }

    public void setClippingError(e.b bVar) {
        this.f62283h = bVar;
    }

    public void updateClipping(long j10, long j11) {
        this.f62281f = j10;
        this.f62282g = j11;
    }

    public final t0 a(long j10, t0 t0Var) {
        long jConstrainValue = io.odeeo.internal.q0.g0.constrainValue(t0Var.f63017a, 0L, j10 - this.f62281f);
        long j11 = t0Var.f63018b;
        long j12 = this.f62282g;
        long jConstrainValue2 = io.odeeo.internal.q0.g0.constrainValue(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jConstrainValue == t0Var.f63017a && jConstrainValue2 == t0Var.f63018b) ? t0Var : new t0(jConstrainValue, jConstrainValue2);
    }

    @Override // io.odeeo.internal.a0.r.a, io.odeeo.internal.a0.e0.a
    public void onContinueLoadingRequested(r rVar) {
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62278b)).onContinueLoadingRequested(this);
    }

    public static boolean a(long j10, io.odeeo.internal.n0.d[] dVarArr) {
        if (j10 != 0) {
            for (io.odeeo.internal.n0.d dVar : dVarArr) {
                if (dVar != null) {
                    io.odeeo.internal.b.t selectedFormat = dVar.getSelectedFormat();
                    if (!io.odeeo.internal.q0.t.allSamplesAreSyncSamples(selectedFormat.f62971l, selectedFormat.f62968i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
