package io.odeeo.internal.a0;

import io.odeeo.internal.a0.e0;
import io.odeeo.internal.b.t0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface r extends e0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a extends e0.a<r> {
        @Override // io.odeeo.internal.a0.e0.a
        /* synthetic */ void onContinueLoadingRequested(e0 e0Var);

        void onPrepared(r rVar);
    }

    @Override // io.odeeo.internal.a0.e0
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, t0 t0Var);

    @Override // io.odeeo.internal.a0.e0
    long getBufferedPositionUs();

    @Override // io.odeeo.internal.a0.e0
    long getNextLoadPositionUs();

    default List<Object> getStreamKeys(List<io.odeeo.internal.n0.d> list) {
        return Collections.EMPTY_LIST;
    }

    l0 getTrackGroups();

    @Override // io.odeeo.internal.a0.e0
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(a aVar, long j10);

    long readDiscontinuity();

    @Override // io.odeeo.internal.a0.e0
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10);
}
