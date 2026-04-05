package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.7Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7Y {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2461mL A00;
    public C2461mL A01;
    public C2461mL A02;
    public AbstractC1081Am<C2461mL> A03 = AbstractC1081Am.A03();
    public AbstractC2485mj<C2461mL, Timeline> A04 = AbstractC2485mj.A04();
    public final C2585oN A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C2461mL A00(com.facebook.ads.redexgen.core.InterfaceC08992z r13, com.facebook.ads.redexgen.core.AbstractC1081Am<com.facebook.ads.redexgen.core.C2461mL> r14, com.facebook.ads.redexgen.core.C2461mL r15, com.facebook.ads.redexgen.core.C2585oN r16) {
        /*
            com.facebook.ads.androidx.media3.common.Timeline r5 = r13.A7Y()
            int r4 = r13.A7U()
            boolean r0 = r5.A0N()
            r6 = 0
            if (r0 == 0) goto L34
            r8 = r6
        L10:
            boolean r0 = r13.AAU()
            if (r0 != 0) goto L42
            boolean r3 = r5.A0N()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C7Y.A06
            r0 = 7
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L39
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.Object r8 = r5.A0M(r4)
            goto L10
        L39:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C7Y.A06
            java.lang.String r1 = "fPIpfte6042F2VeKOBsTFTkNJVxhR"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto L67
        L42:
            r12 = -1
        L43:
            r1 = 0
        L44:
            r2 = r14
            int r0 = r2.size()
            if (r1 >= r0) goto L7f
            java.lang.Object r7 = r2.get(r1)
            com.facebook.ads.redexgen.X.mL r7 = (com.facebook.ads.redexgen.core.C2461mL) r7
            boolean r9 = r13.AAU()
            int r10 = r13.A7Q()
            int r11 = r13.A7R()
            boolean r0 = A04(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L64
            return r7
        L64:
            int r1 = r1 + 1
            goto L44
        L67:
            r7 = r16
            com.facebook.ads.redexgen.X.oN r4 = r5.A0H(r4, r7)
            long r0 = r13.A7W()
            long r2 = com.facebook.ads.redexgen.core.AbstractC09264a.A0O(r0)
            long r0 = r7.A0C()
            long r2 = r2 - r0
            int r12 = r4.A07(r2)
            goto L43
        L7f:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9d
            r7 = r15
            if (r7 == 0) goto L9d
            boolean r9 = r13.AAU()
            int r10 = r13.A7Q()
            int r11 = r13.A7R()
            r8 = r8
            r12 = r12
            boolean r0 = A04(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L9d
            return r7
        L9d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7Y.A00(com.facebook.ads.redexgen.X.2z, com.facebook.ads.redexgen.X.Am, com.facebook.ads.redexgen.X.mL, com.facebook.ads.redexgen.X.oN):com.facebook.ads.redexgen.X.mL");
    }

    public C7Y(C2585oN c2585oN) {
        this.A05 = c2585oN;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2483mh<C2461mL, Timeline> c2483mhA03 = AbstractC2485mj.A03();
        if (this.A03.isEmpty()) {
            A03(c2483mhA03, this.A01, timeline);
            C2461mL c2461mL = this.A02;
            C2461mL c2461mL2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!BX.A01(c2461mL, c2461mL2)) {
                A03(c2483mhA03, this.A02, timeline);
            }
            if (!BX.A01(this.A00, this.A01) && !BX.A01(this.A00, this.A02)) {
                A03(c2483mhA03, this.A00, timeline);
            }
        } else {
            for (int i10 = 0; i10 < this.A03.size(); i10++) {
                A03(c2483mhA03, this.A03.get(i10), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c2483mhA03, this.A00, timeline);
            }
        }
        this.A04 = c2483mhA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2483mh<C2461mL, Timeline> c2483mh, C2461mL c2461mL, Timeline timeline) {
        if (c2461mL == null) {
            return;
        }
        if (timeline.A0A(c2461mL.A04) != -1) {
            c2483mh.A05(c2461mL, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2461mL);
        if (existingTimeline == null) {
            return;
        }
        c2483mh.A05(c2461mL, existingTimeline);
    }

    public static boolean A04(C2461mL c2461mL, Object obj, boolean z10, int i10, int i11, int i12) {
        if (c2461mL.A04.equals(obj)) {
            return (z10 && c2461mL.A00 == i10 && c2461mL.A01 == i11) || (!z10 && c2461mL.A00 == -1 && c2461mL.A02 == i12);
        }
        return false;
    }

    public final Timeline A05(C2461mL c2461mL) {
        return this.A04.get(c2461mL);
    }

    public final C2461mL A06() {
        return this.A00;
    }

    public final void A07(InterfaceC08992z interfaceC08992z) {
        this.A00 = A00(interfaceC08992z, this.A03, this.A01, this.A05);
        A02(interfaceC08992z.A7Y());
    }
}
