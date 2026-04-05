package io.odeeo.internal.b0;

import io.odeeo.internal.b.l0;
import io.odeeo.internal.b0.c;
import io.odeeo.internal.p0.m;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface b {
    void handlePrepareComplete(c cVar, int i10, int i11);

    void handlePrepareError(c cVar, int i10, int i11, IOException iOException);

    void release();

    void setPlayer(l0 l0Var);

    void setSupportedContentTypes(int... iArr);

    void start(c cVar, m mVar, Object obj, io.odeeo.internal.o0.a aVar, a aVar2);

    void stop(c cVar, a aVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        default void onAdClicked() {
        }

        default void onAdTapped() {
        }

        default void onAdPlaybackState(io.odeeo.internal.b0.a aVar) {
        }

        default void onAdLoadError(c.a aVar, m mVar) {
        }
    }
}
