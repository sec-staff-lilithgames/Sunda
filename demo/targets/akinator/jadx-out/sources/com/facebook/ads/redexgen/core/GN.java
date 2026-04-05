package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class GN {
    public static final GN A03 = new GN(-3, C.TIME_UNSET, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public GN(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public static GN A03(long j10) {
        return new GN(0, C.TIME_UNSET, j10);
    }

    public static GN A04(long j10, long j11) {
        return new GN(-1, j10, j11);
    }

    public static GN A05(long j10, long j11) {
        return new GN(-2, j10, j11);
    }
}
