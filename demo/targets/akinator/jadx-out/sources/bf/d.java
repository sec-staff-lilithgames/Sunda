package bf;

import bf.e;
import com.google.android.exoplayer2.e3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements a0, z {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f9201b;

    /* renamed from: c, reason: collision with root package name */
    public z f9202c;

    /* renamed from: e, reason: collision with root package name */
    public a[] f9203e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    public long f9204f;

    /* renamed from: g, reason: collision with root package name */
    public long f9205g;

    /* renamed from: h, reason: collision with root package name */
    public long f9206h;

    /* renamed from: i, reason: collision with root package name */
    public e.b f9207i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements b1 {

        /* renamed from: a, reason: collision with root package name */
        public final b1 f9208a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9209b;

        public a(b1 b1Var) {
            this.f9208a = b1Var;
        }

        public void clearSentEos() {
            this.f9209b = false;
        }

        @Override // bf.b1
        public boolean isReady() {
            return !d.this.a() && this.f9208a.isReady();
        }

        @Override // bf.b1
        public void maybeThrowError() throws IOException {
            this.f9208a.maybeThrowError();
        }

        @Override // bf.b1
        public int readData(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10) {
            d dVar = d.this;
            if (dVar.a()) {
                return -3;
            }
            if (this.f9209b) {
                hVar.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = dVar.getBufferedPositionUs();
            int data = this.f9208a.readData(a1Var, hVar, i10);
            if (data == -5) {
                com.google.android.exoplayer2.z0 z0Var = (com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkNotNull(a1Var.f27030b);
                int i11 = z0Var.D;
                int i12 = z0Var.E;
                if (i11 == 0 && i12 == 0) {
                    return -5;
                }
                if (dVar.f9205g != 0) {
                    i11 = 0;
                }
                if (dVar.f9206h != Long.MIN_VALUE) {
                    i12 = 0;
                }
                a1Var.f27030b = z0Var.buildUpon().setEncoderDelay(i11).setEncoderPadding(i12).build();
                return -5;
            }
            long j10 = dVar.f9206h;
            if (j10 == Long.MIN_VALUE || ((data != -4 || hVar.f12239g < j10) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !hVar.f12238f))) {
                return data;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.f9209b = true;
            return -4;
        }

        @Override // bf.b1
        public int skipData(long j10) {
            if (d.this.a()) {
                return -3;
            }
            return this.f9208a.skipData(j10);
        }
    }

    public d(a0 a0Var, boolean z10, long j10, long j11) {
        this.f9201b = a0Var;
        this.f9204f = z10 ? j10 : C.TIME_UNSET;
        this.f9205g = j10;
        this.f9206h = j11;
    }

    public final boolean a() {
        return this.f9204f != C.TIME_UNSET;
    }

    @Override // bf.a0, bf.d1
    public boolean continueLoading(long j10) {
        return this.f9201b.continueLoading(j10);
    }

    @Override // bf.a0
    public void discardBuffer(long j10, boolean z10) {
        this.f9201b.discardBuffer(j10, z10);
    }

    @Override // bf.a0
    public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
        long j11 = this.f9205g;
        if (j10 == j11) {
            return j11;
        }
        long jConstrainValue = com.google.android.exoplayer2.util.n1.constrainValue(e3Var.f27445a, 0L, j10 - j11);
        long j12 = e3Var.f27446b;
        long j13 = this.f9206h;
        long jConstrainValue2 = com.google.android.exoplayer2.util.n1.constrainValue(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jConstrainValue != e3Var.f27445a || jConstrainValue2 != e3Var.f27446b) {
            e3Var = new e3(jConstrainValue, jConstrainValue2);
        }
        return this.f9201b.getAdjustedSeekPositionUs(j10, e3Var);
    }

    @Override // bf.a0, bf.d1
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f9201b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f9206h;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // bf.a0, bf.d1
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f9201b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f9206h;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // bf.a0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // bf.a0
    public n1 getTrackGroups() {
        return this.f9201b.getTrackGroups();
    }

    @Override // bf.a0, bf.d1
    public boolean isLoading() {
        return this.f9201b.isLoading();
    }

    @Override // bf.a0
    public void maybeThrowPrepareError() throws IOException {
        e.b bVar = this.f9207i;
        if (bVar != null) {
            throw bVar;
        }
        this.f9201b.maybeThrowPrepareError();
    }

    @Override // bf.z
    public void onPrepared(a0 a0Var) {
        if (this.f9207i != null) {
            return;
        }
        ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9202c)).onPrepared(this);
    }

    @Override // bf.a0
    public void prepare(z zVar, long j10) {
        this.f9202c = zVar;
        this.f9201b.prepare(this, j10);
    }

    @Override // bf.a0
    public long readDiscontinuity() {
        if (a()) {
            long j10 = this.f9204f;
            this.f9204f = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f9201b.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        com.google.android.exoplayer2.util.a.checkState(discontinuity2 >= this.f9205g);
        long j11 = this.f9206h;
        com.google.android.exoplayer2.util.a.checkState(j11 == Long.MIN_VALUE || discontinuity2 <= j11);
        return discontinuity2;
    }

    @Override // bf.a0, bf.d1
    public void reevaluateBuffer(long j10) {
        this.f9201b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // bf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f9204f = r0
            bf.d$a[] r0 = r5.f9203e
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
            bf.a0 r0 = r5.f9201b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f9205g
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f9206h
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.google.android.exoplayer2.util.a.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.d.seekToUs(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    @Override // bf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long selectTracks(pf.k[] r15, boolean[] r16, bf.b1[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r17
            int r1 = r0.length
            bf.d$a[] r1 = new bf.d.a[r1]
            r14.f9203e = r1
            int r1 = r0.length
            bf.b1[] r5 = new bf.b1[r1]
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r0.length
            r9 = 0
            if (r2 >= r3) goto L21
            bf.d$a[] r3 = r14.f9203e
            r4 = r0[r2]
            bf.d$a r4 = (bf.d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            bf.b1 r9 = r4.f9208a
        L1c:
            r5[r2] = r9
            int r2 = r2 + 1
            goto Lc
        L21:
            bf.a0 r2 = r14.f9201b
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            long r10 = r2.selectTracks(r3, r4, r5, r6, r7)
            boolean r2 = r14.a()
            if (r2 == 0) goto L5b
            long r6 = r14.f9205g
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L5b
            r12 = 0
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 == 0) goto L5b
            int r2 = r15.length
            r4 = r1
        L42:
            if (r4 >= r2) goto L5b
            r6 = r15[r4]
            if (r6 == 0) goto L58
            com.google.android.exoplayer2.z0 r6 = r6.getSelectedFormat()
            java.lang.String r7 = r6.f28802n
            java.lang.String r6 = r6.f28799k
            boolean r6 = com.google.android.exoplayer2.util.l0.allSamplesAreSyncSamples(r7, r6)
            if (r6 != 0) goto L58
            r2 = r10
            goto L60
        L58:
            int r4 = r4 + 1
            goto L42
        L5b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L60:
            r14.f9204f = r2
            int r15 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r15 == 0) goto L7b
            long r2 = r14.f9205g
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 < 0) goto L79
            long r2 = r14.f9206h
            r6 = -9223372036854775808
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L7b
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 > 0) goto L79
            goto L7b
        L79:
            r15 = r1
            goto L7c
        L7b:
            r15 = 1
        L7c:
            com.google.android.exoplayer2.util.a.checkState(r15)
        L7f:
            int r15 = r0.length
            if (r1 >= r15) goto La5
            r15 = r5[r1]
            if (r15 != 0) goto L8b
            bf.d$a[] r15 = r14.f9203e
            r15[r1] = r9
            goto L9c
        L8b:
            bf.d$a[] r2 = r14.f9203e
            r3 = r2[r1]
            if (r3 == 0) goto L95
            bf.b1 r3 = r3.f9208a
            if (r3 == r15) goto L9c
        L95:
            bf.d$a r3 = new bf.d$a
            r3.<init>(r15)
            r2[r1] = r3
        L9c:
            bf.d$a[] r15 = r14.f9203e
            r15 = r15[r1]
            r0[r1] = r15
            int r1 = r1 + 1
            goto L7f
        La5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.d.selectTracks(pf.k[], boolean[], bf.b1[], boolean[], long):long");
    }

    public void setClippingError(e.b bVar) {
        this.f9207i = bVar;
    }

    public void updateClipping(long j10, long j11) {
        this.f9205g = j10;
        this.f9206h = j11;
    }

    @Override // bf.z, bf.c1
    public void onContinueLoadingRequested(a0 a0Var) {
        ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9202c)).onContinueLoadingRequested(this);
    }
}
