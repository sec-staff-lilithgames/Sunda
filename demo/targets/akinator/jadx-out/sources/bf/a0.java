package bf;

import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface a0 extends d1 {
    @Override // bf.d1
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, e3 e3Var);

    @Override // bf.d1
    long getBufferedPositionUs();

    @Override // bf.d1
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<pf.k> list) {
        return Collections.EMPTY_LIST;
    }

    n1 getTrackGroups();

    @Override // bf.d1
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(z zVar, long j10);

    long readDiscontinuity();

    @Override // bf.d1
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10);
}
