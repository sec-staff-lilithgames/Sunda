package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4R {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized long A06(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A01 != C.TIME_UNSET) {
            long jA01 = A01(this.A01);
            long j11 = (4294967296L + jA01) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            long j13 = (8589934592L * j11) + j10;
            if (Math.abs(j12 - jA01) >= Math.abs(j13 - jA01)) {
                j12 = j13;
            }
            j10 = j12;
        }
        return A05(A00(j10));
    }

    public C4R(long j10) {
        A07(j10);
    }

    public static long A00(long j10) {
        return (1000000 * j10) / 90000;
    }

    public static long A01(long j10) {
        return (90000 * j10) / 1000000;
    }

    public final synchronized long A02() {
        long j10;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j10 = this.A00;
        } else {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public final synchronized long A03() {
        long jA02;
        if (this.A01 != C.TIME_UNSET) {
            jA02 = this.A01 + this.A02;
        } else {
            jA02 = A02();
        }
        return jA02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j10) {
        long desiredSampleTimestampUs;
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 == C.TIME_UNSET) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) C3M.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j10;
            notifyAll();
        }
        this.A01 = j10;
        return this.A02 + j10;
    }

    public final synchronized void A07(long j10) {
        this.A00 = j10;
        this.A02 = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = C.TIME_UNSET;
    }
}
