package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class GK {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public GK(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.A06 = j10;
        this.A07 = j11;
        this.A03 = j12;
        this.A01 = j13;
        this.A02 = j14;
        this.A00 = j15;
        this.A05 = j16;
        this.A04 = A05(j11, j12, j13, j14, j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00() {
        return this.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A01() {
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A02() {
        return this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A07;
    }

    public static long A05(long j10, long j11, long j12, long bytesToSkip, long confidenceInterval, long j13) {
        if (bytesToSkip + 1 >= confidenceInterval || j11 + 1 >= j12) {
            return bytesToSkip;
        }
        long j14 = (long) ((j10 - j11) * ((confidenceInterval - bytesToSkip) / (j12 - j11)));
        return AbstractC09264a.A0T(((bytesToSkip + j14) - j13) - (j14 / 20), bytesToSkip, confidenceInterval - 1);
    }

    private void A0B() {
        this.A04 = A05(this.A07, this.A03, this.A01, this.A02, this.A00, this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(long j10, long j11) {
        this.A03 = j10;
        this.A02 = j11;
        A0B();
    }
}
