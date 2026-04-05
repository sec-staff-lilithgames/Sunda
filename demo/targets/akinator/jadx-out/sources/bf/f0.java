package bf;

import android.os.Handler;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface f0 {
    void addDrmEventListener(Handler handler, de.q qVar);

    void addEventListener(Handler handler, j0 j0Var);

    a0 createPeriod(d0 d0Var, qf.c cVar, long j10);

    void disable(e0 e0Var);

    void enable(e0 e0Var);

    default m3 getInitialTimeline() {
        return null;
    }

    u1 getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    @Deprecated
    default void prepareSource(e0 e0Var, qf.c1 c1Var) {
        prepareSource(e0Var, c1Var, zd.c0.f97809b);
    }

    void prepareSource(e0 e0Var, qf.c1 c1Var, zd.c0 c0Var);

    void releasePeriod(a0 a0Var);

    void releaseSource(e0 e0Var);

    void removeDrmEventListener(de.q qVar);

    void removeEventListener(j0 j0Var);
}
