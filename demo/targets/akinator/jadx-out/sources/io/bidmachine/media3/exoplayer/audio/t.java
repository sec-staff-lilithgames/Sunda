package io.bidmachine.media3.exoplayer.audio;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public t(long j10, long j11) {
        StringBuilder sbR = e2.r(j11, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
        sbR.append(j10);
        super(sbR.toString());
    }
}
