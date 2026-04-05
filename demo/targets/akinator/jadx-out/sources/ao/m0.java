package ao;

import android.os.Handler;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface m0 {
    void addDrmEventListener(Handler handler, sn.r rVar);

    void addEventListener(Handler handler, s0 s0Var);

    default boolean canUpdateMediaItem(gn.p0 p0Var) {
        return false;
    }

    i0 createPeriod(k0 k0Var, go.c cVar, long j10);

    void disable(l0 l0Var);

    void enable(l0 l0Var);

    default gn.u1 getInitialTimeline() {
        return null;
    }

    gn.p0 getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    @Deprecated
    default void prepareSource(l0 l0Var, ln.g0 g0Var) {
        prepareSource(l0Var, g0Var, on.f0.f79624d);
    }

    void prepareSource(l0 l0Var, ln.g0 g0Var, on.f0 f0Var);

    void releasePeriod(i0 i0Var);

    void releaseSource(l0 l0Var);

    void removeDrmEventListener(sn.r rVar);

    void removeEventListener(s0 s0Var);

    default void updateMediaItem(gn.p0 p0Var) {
    }
}
