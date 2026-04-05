package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long f26066a;

    /* renamed from: b, reason: collision with root package name */
    public long f26067b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f26068c = C.TIME_UNSET;

    public v(long j10) {
        c(j10);
    }

    public final long a(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.f26068c != C.TIME_UNSET) {
            this.f26068c = j10;
        } else {
            long j11 = this.f26066a;
            if (j11 != Long.MAX_VALUE) {
                this.f26067b = j11 - j10;
            }
            synchronized (this) {
                this.f26068c = j10;
                notifyAll();
            }
        }
        return j10 + this.f26067b;
    }

    public final long b(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.f26068c != C.TIME_UNSET) {
            long j11 = (this.f26068c * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - j11) < Math.abs(j10 - j11)) {
                j10 = j13;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized void c(long j10) {
        if (this.f26068c != C.TIME_UNSET) {
            throw new IllegalStateException();
        }
        this.f26066a = j10;
    }
}
