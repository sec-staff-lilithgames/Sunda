package pn;

import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c extends co.l {
    @Override // co.l
    /* synthetic */ long getAdjustedSeekPositionUs(long j10, y1 y1Var);

    @Override // co.l
    /* synthetic */ void getNextChunk(w0 w0Var, long j10, List list, co.i iVar);

    @Override // co.l
    /* synthetic */ int getPreferredQueueSize(long j10, List list);

    @Override // co.l
    /* synthetic */ void maybeThrowError() throws IOException;

    @Override // co.l
    /* synthetic */ void onChunkLoadCompleted(co.e eVar);

    @Override // co.l
    /* synthetic */ boolean onChunkLoadError(co.e eVar, boolean z10, go.s sVar, go.t tVar);

    @Override // co.l
    /* synthetic */ void release();

    @Override // co.l
    /* synthetic */ boolean shouldCancelLoad(long j10, co.e eVar, List list);

    void updateManifest(qn.c cVar, int i10);

    void updateTrackSelection(fo.l lVar);
}
