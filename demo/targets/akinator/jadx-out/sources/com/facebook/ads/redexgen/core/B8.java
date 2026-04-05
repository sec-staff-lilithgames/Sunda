package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: assets/audience_network.dex */
public final class B8 {
    public final BU A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public B8(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new BU());
    }

    public B8(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, BU bu2) {
        C3M.A01(bu2);
        C3M.A07((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            C3M.A07((i10 == 2 || i10 == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i10;
        this.A05 = j10;
        this.A06 = j11;
        this.A04 = j12;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = bu2;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
