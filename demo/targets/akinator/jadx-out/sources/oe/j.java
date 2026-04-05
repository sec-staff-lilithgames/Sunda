package oe;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface j {
    void consume(v0 v0Var) throws h2;

    void createTracks(ee.s sVar, i0 i0Var);

    void packetFinished();

    void packetStarted(long j10, int i10);

    void seek();
}
