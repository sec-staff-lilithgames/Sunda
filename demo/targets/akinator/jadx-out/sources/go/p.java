package go;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gn.z0;
import go.w;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f58359a;

    public p() {
        this(-1);
    }

    @Override // go.t
    public r getFallbackSelectionFor(q qVar, s sVar) {
        int i10;
        IOException iOException = sVar.f58366a;
        if (!(iOException instanceof ln.x) || ((i10 = ((ln.x) iOException).f73534e) != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503)) {
            return null;
        }
        if (qVar.isFallbackAvailable(1)) {
            return new r(1, 300000L);
        }
        if (qVar.isFallbackAvailable(2)) {
            return new r(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    @Override // go.t
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f58359a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // go.t
    public long getRetryDelayMsFor(s sVar) {
        IOException iOException = sVar.f58366a;
        return ((iOException instanceof z0) || (iOException instanceof FileNotFoundException) || (iOException instanceof ln.t) || (iOException instanceof w.c) || ln.j.isCausedByPositionOutOfRange(iOException)) ? C.TIME_UNSET : Math.min((sVar.f58367b - 1) * 1000, 5000);
    }

    @Override // go.t
    public /* bridge */ /* synthetic */ void onLoadTaskConcluded(long j10) {
        super.onLoadTaskConcluded(j10);
    }

    public p(int i10) {
        this.f58359a = i10;
    }
}
