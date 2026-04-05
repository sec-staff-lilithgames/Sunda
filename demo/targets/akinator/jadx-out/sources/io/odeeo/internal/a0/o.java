package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.t0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final t.a f62418a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62419b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.p0.b f62420c;

    /* renamed from: e, reason: collision with root package name */
    public t f62421e;

    /* renamed from: f, reason: collision with root package name */
    public r f62422f;

    /* renamed from: g, reason: collision with root package name */
    public r.a f62423g;

    /* renamed from: h, reason: collision with root package name */
    public a f62424h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f62425i;

    /* renamed from: j, reason: collision with root package name */
    public long f62426j = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onPrepareComplete(t.a aVar);

        void onPrepareError(t.a aVar, IOException iOException);
    }

    public o(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        this.f62418a = aVar;
        this.f62420c = bVar;
        this.f62419b = j10;
    }

    public final long a(long j10) {
        long j11 = this.f62426j;
        return j11 != C.TIME_UNSET ? j11 : j10;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        r rVar = this.f62422f;
        return rVar != null && rVar.continueLoading(j10);
    }

    public void createPeriod(t.a aVar) {
        long jA = a(this.f62419b);
        r rVarCreatePeriod = ((t) io.odeeo.internal.q0.a.checkNotNull(this.f62421e)).createPeriod(aVar, this.f62420c, jA);
        this.f62422f = rVarCreatePeriod;
        if (this.f62423g != null) {
            rVarCreatePeriod.prepare(this, jA);
        }
    }

    @Override // io.odeeo.internal.a0.r
    public void discardBuffer(long j10, boolean z10) {
        ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).discardBuffer(j10, z10);
    }

    @Override // io.odeeo.internal.a0.r
    public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).getAdjustedSeekPositionUs(j10, t0Var);
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getBufferedPositionUs() {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).getBufferedPositionUs();
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getNextLoadPositionUs() {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.f62426j;
    }

    public long getPreparePositionUs() {
        return this.f62419b;
    }

    @Override // io.odeeo.internal.a0.r
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.odeeo.internal.a0.r
    public l0 getTrackGroups() {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).getTrackGroups();
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean isLoading() {
        r rVar = this.f62422f;
        return rVar != null && rVar.isLoading();
    }

    @Override // io.odeeo.internal.a0.r
    public void maybeThrowPrepareError() throws IOException {
        try {
            r rVar = this.f62422f;
            if (rVar != null) {
                rVar.maybeThrowPrepareError();
                return;
            }
            t tVar = this.f62421e;
            if (tVar != null) {
                tVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f62424h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f62425i) {
                return;
            }
            this.f62425i = true;
            aVar.onPrepareError(this.f62418a, e10);
        }
    }

    @Override // io.odeeo.internal.a0.r.a
    public void onPrepared(r rVar) {
        ((r.a) io.odeeo.internal.q0.g0.castNonNull(this.f62423g)).onPrepared(this);
        a aVar = this.f62424h;
        if (aVar != null) {
            aVar.onPrepareComplete(this.f62418a);
        }
    }

    public void overridePreparePositionUs(long j10) {
        this.f62426j = j10;
    }

    @Override // io.odeeo.internal.a0.r
    public void prepare(r.a aVar, long j10) {
        this.f62423g = aVar;
        r rVar = this.f62422f;
        if (rVar != null) {
            rVar.prepare(this, a(this.f62419b));
        }
    }

    @Override // io.odeeo.internal.a0.r
    public long readDiscontinuity() {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).readDiscontinuity();
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public void reevaluateBuffer(long j10) {
        ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).reevaluateBuffer(j10);
    }

    public void releasePeriod() {
        if (this.f62422f != null) {
            ((t) io.odeeo.internal.q0.a.checkNotNull(this.f62421e)).releasePeriod(this.f62422f);
        }
    }

    @Override // io.odeeo.internal.a0.r
    public long seekToUs(long j10) {
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).seekToUs(j10);
    }

    @Override // io.odeeo.internal.a0.r
    public long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f62426j;
        if (j12 == C.TIME_UNSET || j10 != this.f62419b) {
            j11 = j10;
        } else {
            this.f62426j = C.TIME_UNSET;
            j11 = j12;
        }
        return ((r) io.odeeo.internal.q0.g0.castNonNull(this.f62422f)).selectTracks(dVarArr, zArr, d0VarArr, zArr2, j11);
    }

    public void setMediaSource(t tVar) {
        io.odeeo.internal.q0.a.checkState(this.f62421e == null);
        this.f62421e = tVar;
    }

    public void setPrepareListener(a aVar) {
        this.f62424h = aVar;
    }

    @Override // io.odeeo.internal.a0.r.a, io.odeeo.internal.a0.e0.a
    public void onContinueLoadingRequested(r rVar) {
        ((r.a) io.odeeo.internal.q0.g0.castNonNull(this.f62423g)).onContinueLoadingRequested(this);
    }
}
