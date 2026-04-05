package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface x0 {
    gn.c1 getPlaybackParameters();

    long getPositionUs();

    default boolean hasSkippedSilenceSinceLastCall() {
        return false;
    }

    void setPlaybackParameters(gn.c1 c1Var);
}
