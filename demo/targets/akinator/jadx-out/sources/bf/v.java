package bf;

import com.google.android.exoplayer2.e3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements a0, z {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f9440b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9441c;

    /* renamed from: e, reason: collision with root package name */
    public final qf.c f9442e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f9443f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f9444g;

    /* renamed from: h, reason: collision with root package name */
    public z f9445h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9446i;

    /* renamed from: j, reason: collision with root package name */
    public long f9447j = C.TIME_UNSET;

    public v(d0 d0Var, qf.c cVar, long j10) {
        this.f9440b = d0Var;
        this.f9442e = cVar;
        this.f9441c = j10;
    }

    @Override // bf.a0, bf.d1
    public boolean continueLoading(long j10) {
        a0 a0Var = this.f9444g;
        return a0Var != null && a0Var.continueLoading(j10);
    }

    public void createPeriod(d0 d0Var) {
        long j10 = this.f9447j;
        if (j10 == C.TIME_UNSET) {
            j10 = this.f9441c;
        }
        a0 a0VarCreatePeriod = ((f0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9443f)).createPeriod(d0Var, this.f9442e, j10);
        this.f9444g = a0VarCreatePeriod;
        if (this.f9445h != null) {
            a0VarCreatePeriod.prepare(this, j10);
        }
    }

    @Override // bf.a0
    public void discardBuffer(long j10, boolean z10) {
        ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).discardBuffer(j10, z10);
    }

    @Override // bf.a0
    public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).getAdjustedSeekPositionUs(j10, e3Var);
    }

    @Override // bf.a0, bf.d1
    public long getBufferedPositionUs() {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).getBufferedPositionUs();
    }

    @Override // bf.a0, bf.d1
    public long getNextLoadPositionUs() {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.f9447j;
    }

    public long getPreparePositionUs() {
        return this.f9441c;
    }

    @Override // bf.a0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // bf.a0
    public n1 getTrackGroups() {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).getTrackGroups();
    }

    @Override // bf.a0, bf.d1
    public boolean isLoading() {
        a0 a0Var = this.f9444g;
        return a0Var != null && a0Var.isLoading();
    }

    @Override // bf.a0
    public void maybeThrowPrepareError() throws IOException {
        try {
            a0 a0Var = this.f9444g;
            if (a0Var != null) {
                a0Var.maybeThrowPrepareError();
                return;
            }
            f0 f0Var = this.f9443f;
            if (f0Var != null) {
                f0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // bf.z
    public void onPrepared(a0 a0Var) {
        ((z) com.google.android.exoplayer2.util.n1.castNonNull(this.f9445h)).onPrepared(this);
    }

    public void overridePreparePositionUs(long j10) {
        this.f9447j = j10;
    }

    @Override // bf.a0
    public void prepare(z zVar, long j10) {
        this.f9445h = zVar;
        a0 a0Var = this.f9444g;
        if (a0Var != null) {
            long j11 = this.f9447j;
            if (j11 == C.TIME_UNSET) {
                j11 = this.f9441c;
            }
            a0Var.prepare(this, j11);
        }
    }

    @Override // bf.a0
    public long readDiscontinuity() {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).readDiscontinuity();
    }

    @Override // bf.a0, bf.d1
    public void reevaluateBuffer(long j10) {
        ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).reevaluateBuffer(j10);
    }

    public void releasePeriod() {
        if (this.f9444g != null) {
            ((f0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9443f)).releasePeriod(this.f9444g);
        }
    }

    @Override // bf.a0
    public long seekToUs(long j10) {
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).seekToUs(j10);
    }

    @Override // bf.a0
    public long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f9447j;
        if (j12 == C.TIME_UNSET || j10 != this.f9441c) {
            j11 = j10;
        } else {
            this.f9447j = C.TIME_UNSET;
            j11 = j12;
        }
        return ((a0) com.google.android.exoplayer2.util.n1.castNonNull(this.f9444g)).selectTracks(kVarArr, zArr, b1VarArr, zArr2, j11);
    }

    public void setMediaSource(f0 f0Var) {
        com.google.android.exoplayer2.util.a.checkState(this.f9443f == null);
        this.f9443f = f0Var;
    }

    @Override // bf.z, bf.c1
    public void onContinueLoadingRequested(a0 a0Var) {
        ((z) com.google.android.exoplayer2.util.n1.castNonNull(this.f9445h)).onContinueLoadingRequested(this);
    }

    public void setPrepareListener(u uVar) {
    }
}
