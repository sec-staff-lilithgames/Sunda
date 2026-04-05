package ao;

import ao.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.StreamKey;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements i0, h0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f7614b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f7615c;

    /* renamed from: e, reason: collision with root package name */
    public a[] f7616e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    public long f7617f;

    /* renamed from: g, reason: collision with root package name */
    public long f7618g;

    /* renamed from: h, reason: collision with root package name */
    public long f7619h;

    /* renamed from: i, reason: collision with root package name */
    public f.c f7620i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public final o1 f7621b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7622c;

        public a(o1 o1Var) {
            this.f7621b = o1Var;
        }

        public void clearSentEos() {
            this.f7622c = false;
        }

        @Override // ao.o1
        public boolean isReady() {
            return !e.this.a() && this.f7621b.isReady();
        }

        @Override // ao.o1
        public void maybeThrowError() throws IOException {
            this.f7621b.maybeThrowError();
        }

        @Override // ao.o1
        public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
            e eVar = e.this;
            if (eVar.a()) {
                return -3;
            }
            if (this.f7622c) {
                gVar.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = eVar.getBufferedPositionUs();
            int data = this.f7621b.readData(r0Var, gVar, i10);
            if (data == -5) {
                io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b);
                int i11 = bVar.H;
                int i12 = bVar.I;
                if (i11 == 0 && i12 == 0) {
                    return -5;
                }
                if (eVar.f7618g != 0) {
                    i11 = 0;
                }
                if (eVar.f7619h != Long.MIN_VALUE) {
                    i12 = 0;
                }
                r0Var.f61543b = bVar.buildUpon().setEncoderDelay(i11).setEncoderPadding(i12).build();
                return -5;
            }
            long j10 = eVar.f7619h;
            if (j10 == Long.MIN_VALUE || ((data != -4 || gVar.f77082h < j10) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !gVar.f77081g))) {
                return data;
            }
            gVar.clear();
            gVar.setFlags(4);
            this.f7622c = true;
            return -4;
        }

        @Override // ao.o1
        public int skipData(long j10) {
            if (e.this.a()) {
                return -3;
            }
            return this.f7621b.skipData(j10);
        }
    }

    public e(i0 i0Var, boolean z10, long j10, long j11) {
        this.f7614b = i0Var;
        this.f7617f = z10 ? j10 : C.TIME_UNSET;
        this.f7618g = j10;
        this.f7619h = j11;
    }

    public final boolean a() {
        return this.f7617f != C.TIME_UNSET;
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        return this.f7614b.continueLoading(w0Var);
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
        this.f7614b.discardBuffer(j10, z10);
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        long j11 = this.f7618g;
        if (j10 == j11) {
            return j11;
        }
        long jConstrainValue = io.bidmachine.media3.common.util.a1.constrainValue(y1Var.f61605a, 0L, j10 - j11);
        long j12 = y1Var.f61606b;
        long j13 = this.f7619h;
        long jConstrainValue2 = io.bidmachine.media3.common.util.a1.constrainValue(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jConstrainValue != y1Var.f61605a || jConstrainValue2 != y1Var.f61606b) {
            y1Var = new io.bidmachine.media3.exoplayer.y1(jConstrainValue, jConstrainValue2);
        }
        return this.f7614b.getAdjustedSeekPositionUs(j10, y1Var);
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f7614b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f7619h;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f7614b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f7619h;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ao.i0
    public List<StreamKey> getStreamKeys(List<fo.l> list) {
        return this.f7614b.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return this.f7614b.getTrackGroups();
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f7614b.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        f.c cVar = this.f7620i;
        if (cVar != null) {
            throw cVar;
        }
        this.f7614b.maybeThrowPrepareError();
    }

    @Override // ao.h0
    public void onPrepared(i0 i0Var) {
        if (this.f7620i != null) {
            return;
        }
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7615c)).onPrepared(this);
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f7615c = h0Var;
        this.f7614b.prepare(this, j10);
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        if (a()) {
            long j10 = this.f7617f;
            this.f7617f = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f7614b.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j11 = this.f7618g;
        long j12 = this.f7619h;
        long jMax = Math.max(discontinuity2, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        this.f7614b.reevaluateBuffer(j10);
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        this.f7617f = C.TIME_UNSET;
        for (a aVar : this.f7616e) {
            if (aVar != null) {
                aVar.clearSentEos();
            }
        }
        long jSeekToUs = this.f7614b.seekToUs(j10);
        long j11 = this.f7618g;
        long j12 = this.f7619h;
        long jMax = Math.max(jSeekToUs, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        long j11;
        this.f7616e = new a[o1VarArr.length];
        o1[] o1VarArr2 = new o1[o1VarArr.length];
        for (int i10 = 0; i10 < o1VarArr.length; i10++) {
            a[] aVarArr = this.f7616e;
            a aVar = (a) o1VarArr[i10];
            aVarArr[i10] = aVar;
            o1VarArr2[i10] = aVar != null ? aVar.f7621b : null;
        }
        long jSelectTracks = this.f7614b.selectTracks(lVarArr, zArr, o1VarArr2, zArr2, j10);
        long j12 = this.f7619h;
        long jMax = Math.max(jSelectTracks, j10);
        if (j12 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j12);
        }
        if (a()) {
            if (jSelectTracks >= j10) {
                if (jSelectTracks != 0) {
                    for (fo.l lVar : lVarArr) {
                        if (lVar != null) {
                            io.bidmachine.media3.common.b selectedFormat = lVar.getSelectedFormat();
                            if (!gn.x0.allSamplesAreSyncSamples(selectedFormat.f60665o, selectedFormat.f60661k)) {
                            }
                        }
                    }
                }
                j11 = C.TIME_UNSET;
            }
            j11 = jMax;
            break;
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f7617f = j11;
        for (int i11 = 0; i11 < o1VarArr.length; i11++) {
            o1 o1Var = o1VarArr2[i11];
            if (o1Var == null) {
                this.f7616e[i11] = null;
            } else {
                a[] aVarArr2 = this.f7616e;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f7621b != o1Var) {
                    aVarArr2[i11] = new a(o1Var);
                }
            }
            o1VarArr[i11] = this.f7616e[i11];
        }
        return jMax;
    }

    public void setClippingError(f.c cVar) {
        this.f7620i = cVar;
    }

    public void updateClipping(long j10, long j11) {
        this.f7618g = j10;
        this.f7619h = j11;
    }

    @Override // ao.h0, ao.p1
    public void onContinueLoadingRequested(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7615c)).onContinueLoadingRequested(this);
    }
}
