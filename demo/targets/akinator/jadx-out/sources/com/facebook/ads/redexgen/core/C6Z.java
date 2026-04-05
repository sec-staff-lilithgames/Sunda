package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.6Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Z {
    public static String[] A09 = {"l8GJg6rn6Adlh4Gn59Q00x9wdhAA1N0G", "0FGDNpmqvJaXrYVndUjcoHzlqa3GYTQ7", "pt3TgghkXaQKZolppIJBnXlroi4GAQrs", "P8nJgAgzZ7eq", "wLbaX9M9C92K8ml85Wq6oszj2MSO2FBr", "4xgaQCpVjfBlN1x0xTmHAa8kZRn587ql", "M0TEQVmq9EtHtFdZcG0N3gydxvjz8wFn", "euj9JK69WhhaD3Qn5aJyq4d8RK326seE"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C2461mL A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Must be removed when ExoPlayerImpl V1 is deprecated")
    public C6Z(C2461mL c2461mL, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = c2461mL;
        this.A03 = j10;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
        this.A07 = z10;
        this.A05 = z11;
        this.A06 = false;
        this.A08 = false;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Disable Assertions for now as the ones related to isFollowedByTransitionToSameStream & isLastInTimelineWindow are not applicable toExoPlayerImpl v1")
    public C6Z(C2461mL c2461mL, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A04 = c2461mL;
        this.A03 = j10;
        this.A02 = j11;
        this.A01 = j12;
        this.A00 = j13;
        this.A06 = z10;
        this.A07 = z11;
        this.A08 = z12;
        this.A05 = z13;
    }

    public final C6Z A00(long j10) {
        if (j10 == this.A03) {
            return this;
        }
        return new C6Z(this.A04, j10, this.A02, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C6Z.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((((((((((((((17 * 31) + this.A04.hashCode()) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }
}
