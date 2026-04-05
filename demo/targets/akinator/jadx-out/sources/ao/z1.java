package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.StreamKey;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z1 implements i0, h0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f7908b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7909c;

    /* renamed from: e, reason: collision with root package name */
    public h0 f7910e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public final o1 f7911b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7912c;

        public a(o1 o1Var, long j10) {
            this.f7911b = o1Var;
            this.f7912c = j10;
        }

        public o1 getChildStream() {
            return this.f7911b;
        }

        @Override // ao.o1
        public boolean isReady() {
            return this.f7911b.isReady();
        }

        @Override // ao.o1
        public void maybeThrowError() throws IOException {
            this.f7911b.maybeThrowError();
        }

        @Override // ao.o1
        public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
            int data = this.f7911b.readData(r0Var, gVar, i10);
            if (data == -4) {
                gVar.f77082h += this.f7912c;
            }
            return data;
        }

        @Override // ao.o1
        public int skipData(long j10) {
            return this.f7911b.skipData(j10 - this.f7912c);
        }
    }

    public z1(i0 i0Var, long j10) {
        this.f7908b = i0Var;
        this.f7909c = j10;
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        return this.f7908b.continueLoading(w0Var.buildUpon().setPlaybackPositionUs(w0Var.f61589a - this.f7909c).build());
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
        this.f7908b.discardBuffer(j10 - this.f7909c, z10);
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        long j11 = this.f7909c;
        return this.f7908b.getAdjustedSeekPositionUs(j10 - j11, y1Var) + j11;
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f7908b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f7909c;
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f7908b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f7909c;
    }

    @Override // ao.i0
    public List<StreamKey> getStreamKeys(List<fo.l> list) {
        return this.f7908b.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return this.f7908b.getTrackGroups();
    }

    public i0 getWrappedMediaPeriod() {
        return this.f7908b;
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f7908b.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        this.f7908b.maybeThrowPrepareError();
    }

    @Override // ao.h0
    public void onPrepared(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7910e)).onPrepared(this);
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f7910e = h0Var;
        this.f7908b.prepare(this, j10 - this.f7909c);
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        long discontinuity = this.f7908b.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f7909c;
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        this.f7908b.reevaluateBuffer(j10 - this.f7909c);
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        long j11 = this.f7909c;
        return this.f7908b.seekToUs(j10 - j11) + j11;
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        o1[] o1VarArr2 = new o1[o1VarArr.length];
        int i10 = 0;
        while (true) {
            o1 childStream = null;
            if (i10 >= o1VarArr.length) {
                break;
            }
            a aVar = (a) o1VarArr[i10];
            if (aVar != null) {
                childStream = aVar.getChildStream();
            }
            o1VarArr2[i10] = childStream;
            i10++;
        }
        i0 i0Var = this.f7908b;
        long j11 = this.f7909c;
        long jSelectTracks = i0Var.selectTracks(lVarArr, zArr, o1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < o1VarArr.length; i11++) {
            o1 o1Var = o1VarArr2[i11];
            if (o1Var == null) {
                o1VarArr[i11] = null;
            } else {
                o1 o1Var2 = o1VarArr[i11];
                if (o1Var2 == null || ((a) o1Var2).getChildStream() != o1Var) {
                    o1VarArr[i11] = new a(o1Var, j11);
                }
            }
        }
        return jSelectTracks + j11;
    }

    @Override // ao.h0, ao.p1
    public void onContinueLoadingRequested(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7910e)).onContinueLoadingRequested(this);
    }
}
