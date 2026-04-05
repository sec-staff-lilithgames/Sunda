package ao;

import io.bidmachine.media3.common.StreamKey;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i0 extends q1 {
    @Override // ao.q1
    boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var);

    @Override // ao.q1
    long getBufferedPositionUs();

    @Override // ao.q1
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<fo.l> list) {
        return Collections.EMPTY_LIST;
    }

    b2 getTrackGroups();

    @Override // ao.q1
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(h0 h0Var, long j10);

    long readDiscontinuity();

    @Override // ao.q1
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10);
}
