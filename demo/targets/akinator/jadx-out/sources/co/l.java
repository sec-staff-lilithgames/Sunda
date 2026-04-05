package co;

import go.t;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l {
    long getAdjustedSeekPositionUs(long j10, y1 y1Var);

    void getNextChunk(w0 w0Var, long j10, List<? extends p> list, i iVar);

    int getPreferredQueueSize(long j10, List<? extends p> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(e eVar);

    boolean onChunkLoadError(e eVar, boolean z10, go.s sVar, t tVar);

    void release();

    boolean shouldCancelLoad(long j10, e eVar, List<? extends p> list);
}
