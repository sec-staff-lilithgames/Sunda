package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.2E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2E extends IllegalStateException {
    public final int A00;
    public final long A01;
    public final Timeline A02;

    public C2E(Timeline timeline, int i10, long j10) {
        this.A02 = timeline;
        this.A00 = i10;
        this.A01 = j10;
    }
}
