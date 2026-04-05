package io.odeeo.internal.p0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.p0.t;
import io.odeeo.internal.p0.v;
import io.odeeo.internal.p0.w;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f65720a;

    public r() {
        this(-1);
    }

    public boolean a(IOException iOException) {
        if (!(iOException instanceof t.e)) {
            return false;
        }
        int i10 = ((t.e) iOException).f65728d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    @Override // io.odeeo.internal.p0.v
    public v.b getFallbackSelectionFor(v.a aVar, v.c cVar) {
        if (!a(cVar.f65744c)) {
            return null;
        }
        if (aVar.isFallbackAvailable(1)) {
            return new v.b(1, 300000L);
        }
        if (aVar.isFallbackAvailable(2)) {
            return new v.b(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    @Override // io.odeeo.internal.p0.v
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f65720a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // io.odeeo.internal.p0.v
    public long getRetryDelayMsFor(v.c cVar) {
        IOException iOException = cVar.f65744c;
        return ((iOException instanceof g0) || (iOException instanceof FileNotFoundException) || (iOException instanceof t.a) || (iOException instanceof w.h) || j.isCausedByPositionOutOfRange(iOException)) ? C.TIME_UNSET : Math.min((cVar.f65745d - 1) * 1000, 5000);
    }

    @Override // io.odeeo.internal.p0.v
    public /* bridge */ /* synthetic */ void onLoadTaskConcluded(long j10) {
        super.onLoadTaskConcluded(j10);
    }

    public r(int i10) {
        this.f65720a = i10;
    }
}
