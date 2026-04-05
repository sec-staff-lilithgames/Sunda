package hn;

import gn.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i {
    c1 applyPlaybackParameters(c1 c1Var);

    boolean applySkipSilenceEnabled(boolean z10);

    h[] getAudioProcessors();

    long getMediaDuration(long j10);

    long getSkippedOutputFrameCount();
}
