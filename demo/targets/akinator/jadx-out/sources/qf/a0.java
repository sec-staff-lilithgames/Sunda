package qf;

import com.google.android.exoplayer2.h2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import qf.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f82908a;

    public a0() {
        this(-1);
    }

    @Override // qf.o0
    public m0 getFallbackSelectionFor(l0 l0Var, n0 n0Var) {
        int i10;
        IOException iOException = n0Var.f82965a;
        if (!(iOException instanceof h0) || ((i10 = ((h0) iOException).f82945e) != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503)) {
            return null;
        }
        if (l0Var.isFallbackAvailable(1)) {
            return new m0(1, 300000L);
        }
        if (l0Var.isFallbackAvailable(2)) {
            return new m0(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    @Override // qf.o0
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f82908a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // qf.o0
    public long getRetryDelayMsFor(n0 n0Var) {
        IOException iOException = n0Var.f82965a;
        return ((iOException instanceof h2) || (iOException instanceof FileNotFoundException) || (iOException instanceof d0) || (iOException instanceof r0.c) || q.isCausedByPositionOutOfRange(iOException)) ? C.TIME_UNSET : Math.min((n0Var.f82966b - 1) * 1000, 5000);
    }

    @Override // qf.o0
    public /* bridge */ /* synthetic */ void onLoadTaskConcluded(long j10) {
        super.onLoadTaskConcluded(j10);
    }

    public a0(int i10) {
        this.f82908a = i10;
    }
}
