package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 implements i0, h0 {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f7605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7606c;

    /* renamed from: e, reason: collision with root package name */
    public final go.c f7607e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f7608f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f7609g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f7610h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7611i;

    /* renamed from: j, reason: collision with root package name */
    public long f7612j = C.TIME_UNSET;

    public d0(k0 k0Var, go.c cVar, long j10) {
        this.f7605b = k0Var;
        this.f7607e = cVar;
        this.f7606c = j10;
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        i0 i0Var = this.f7609g;
        return i0Var != null && i0Var.continueLoading(w0Var);
    }

    public void createPeriod(k0 k0Var) {
        long j10 = this.f7612j;
        if (j10 == C.TIME_UNSET) {
            j10 = this.f7606c;
        }
        i0 i0VarCreatePeriod = ((m0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7608f)).createPeriod(k0Var, this.f7607e, j10);
        this.f7609g = i0VarCreatePeriod;
        if (this.f7610h != null) {
            i0VarCreatePeriod.prepare(this, j10);
        }
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
        ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).discardBuffer(j10, z10);
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).getAdjustedSeekPositionUs(j10, y1Var);
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).getBufferedPositionUs();
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.f7612j;
    }

    public long getPreparePositionUs() {
        return this.f7606c;
    }

    @Override // ao.i0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).getTrackGroups();
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        i0 i0Var = this.f7609g;
        return i0Var != null && i0Var.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        try {
            i0 i0Var = this.f7609g;
            if (i0Var != null) {
                i0Var.maybeThrowPrepareError();
                return;
            }
            m0 m0Var = this.f7608f;
            if (m0Var != null) {
                m0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // ao.h0
    public void onPrepared(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7610h)).onPrepared(this);
    }

    public void overridePreparePositionUs(long j10) {
        this.f7612j = j10;
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f7610h = h0Var;
        i0 i0Var = this.f7609g;
        if (i0Var != null) {
            long j11 = this.f7612j;
            if (j11 == C.TIME_UNSET) {
                j11 = this.f7606c;
            }
            i0Var.prepare(this, j11);
        }
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).readDiscontinuity();
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).reevaluateBuffer(j10);
    }

    public void releasePeriod() {
        if (this.f7609g != null) {
            ((m0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7608f)).releasePeriod(this.f7609g);
        }
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).seekToUs(j10);
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f7612j;
        long j12 = (j11 == C.TIME_UNSET || j10 != this.f7606c) ? j10 : j11;
        this.f7612j = C.TIME_UNSET;
        return ((i0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7609g)).selectTracks(lVarArr, zArr, o1VarArr, zArr2, j12);
    }

    public void setMediaSource(m0 m0Var) {
        io.bidmachine.media3.common.util.a.checkState(this.f7608f == null);
        this.f7608f = m0Var;
    }

    @Override // ao.h0, ao.p1
    public void onContinueLoadingRequested(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a1.castNonNull(this.f7610h)).onContinueLoadingRequested(this);
    }

    public void setPrepareListener(c0 c0Var) {
    }
}
