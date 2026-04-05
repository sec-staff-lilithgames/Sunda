package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.AbstractC1081Am;
import com.facebook.ads.redexgen.core.C08571h;
import com.facebook.ads.redexgen.core.C10559m;
import com.facebook.ads.redexgen.core.C1Q;
import com.facebook.ads.redexgen.core.C1R;
import com.facebook.ads.redexgen.core.C1S;
import com.facebook.ads.redexgen.core.C2583oL;
import com.facebook.ads.redexgen.core.C2585oN;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.C3R;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public abstract class Timeline implements C1S {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new Timeline() { // from class: com.facebook.ads.redexgen.X.9n
        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A06() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A07() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A0A(Object obj) {
            return -1;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C2585oN A0I(int i10, C2585oN c2585oN, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C2583oL A0L(int i10, C2583oL c2583oL, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final Object A0M(int i10) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final String A05 = AbstractC09264a.A0h(0);
    public static final String A03 = AbstractC09264a.A0h(1);
    public static final String A04 = AbstractC09264a.A0h(2);
    public static final C1R<Timeline> A01 = new C1R() { // from class: com.facebook.ads.redexgen.X.oP
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C2585oN A0I(int i10, C2585oN c2585oN, boolean z10);

    public abstract C2583oL A0L(int i10, C2583oL c2583oL, long j10);

    public abstract Object A0M(int i10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static C10559m A02(Bundle bundle) {
        final AbstractC1081Am abstractC1081AmA04 = A04(C2583oL.A0J, C3R.A00(bundle, A05));
        final AbstractC1081Am abstractC1081AmA042 = A04(C2585oN.A08, C3R.A00(bundle, A03));
        final int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(abstractC1081AmA04.size());
        }
        ImmutableList<Window> windows = new Timeline(abstractC1081AmA04, abstractC1081AmA042, intArray) { // from class: com.facebook.ads.redexgen.X.9m
            public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
            public final AbstractC1081Am<C2585oN> A00;
            public final AbstractC1081Am<C2583oL> A01;
            public final int[] A02;
            public final int[] A03;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
            /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
            {
                /*
                    r3 = this;
                    r3.<init>()
                    int r1 = r4.size()
                    int r0 = r6.length
                    if (r1 != r0) goto L26
                    r0 = 1
                Lb:
                    com.facebook.ads.redexgen.core.C3M.A07(r0)
                    r3.A01 = r4
                    r3.A00 = r5
                    r3.A02 = r6
                    int r0 = r6.length
                    int[] r0 = new int[r0]
                    r3.A03 = r0
                    r2 = 0
                L1a:
                    int r0 = r6.length
                    if (r2 >= r0) goto L28
                    int[] r1 = r3.A03
                    r0 = r6[r2]
                    r1[r0] = r2
                    int r2 = r2 + 1
                    goto L1a
                L26:
                    r0 = 0
                    goto Lb
                L28:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10559m.<init>(com.facebook.ads.redexgen.X.Am, com.facebook.ads.redexgen.X.Am, int[]):void");
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A06() {
                return this.A00.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A07() {
                return this.A01.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A08(int i10, int i11, boolean z10) {
                if (i11 == 1) {
                    return i10;
                }
                if (i10 == A0C(z10)) {
                    if (i11 == 2) {
                        return A0B(z10);
                    }
                    return -1;
                }
                if (z10) {
                    return this.A02[this.A03[i10] + 1];
                }
                return i10 + 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0A(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0B(boolean z10) {
                if (A0N()) {
                    return -1;
                }
                if (!z10) {
                    return 0;
                }
                int[] iArr = this.A02;
                if (A04[1].charAt(22) == 'H') {
                    throw new RuntimeException();
                }
                A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
                return iArr[0];
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0C(boolean z10) {
                if (A0N()) {
                    return -1;
                }
                if (z10) {
                    return this.A02[A07() - 1];
                }
                return A07() - 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C2585oN A0I(int i10, C2585oN p10, boolean z10) {
                C2585oN p11 = this.A00.get(i10);
                p10.A0G(p11.A03, p11.A04, p11.A00, p11.A01, p11.A02, p11.A06, p11.A05);
                return p10;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C2583oL A0L(int i10, C2583oL c2583oL, long j10) {
                C2583oL c2583oL2 = this.A01.get(i10);
                c2583oL.A07(c2583oL2.A0C, c2583oL2.A09, c2583oL2.A0A, c2583oL2.A06, c2583oL2.A07, c2583oL2.A04, c2583oL2.A0G, c2583oL2.A0D, c2583oL2.A08, c2583oL2.A02, c2583oL2.A03, c2583oL2.A00, c2583oL2.A01, c2583oL2.A05);
                c2583oL.A0F = c2583oL2.A0F;
                return c2583oL;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final Object A0M(int i10) {
                throw new UnsupportedOperationException();
            }
        };
        return windows;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC1081Am<T> A04(C1R<T> c1r, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC1081Am.A03();
        }
        C08571h c08571h = new C08571h();
        AbstractC1081Am<Bundle> abstractC1081AmA00 = C1Q.A00(iBinder);
        for (int i10 = 0; i10 < abstractC1081AmA00.size(); i10++) {
            c08571h.A04(c1r.A6X(abstractC1081AmA00.get(i10)));
        }
        return c08571h.A05();
    }

    public static int[] A05(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
            int i12 = A00[1].charAt(20);
            if (i12 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A0C(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                int iA0C = A0C(z10);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i10 == iA0C) {
                    return A0B(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i10, C2585oN c2585oN, C2583oL c2583oL, int i11, boolean z10) {
        int i12 = A0H(i10, c2585oN).A00;
        int windowIndex = A0K(i12, c2583oL).A01;
        if (windowIndex == i10) {
            int nextWindowIndex = A08(i12, i11, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2583oL).A00;
            return windowIndex2;
        }
        int windowIndex3 = i10 + 1;
        return windowIndex3;
    }

    public int A0B(boolean z10) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z10) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2583oL c2583oL, C2585oN c2585oN, int i10, long j10) {
        return A0E(c2583oL, c2585oN, i10, j10);
    }

    public final Pair<Object, Long> A0E(C2583oL c2583oL, C2585oN c2585oN, int i10, long j10) {
        return (Pair) C3M.A01(A0G(c2583oL, c2585oN, i10, j10, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2583oL c2583oL, C2585oN c2585oN, int i10, long j10, long j11) {
        return A0G(c2583oL, c2585oN, i10, j10, j11);
    }

    public final Pair<Object, Long> A0G(C2583oL c2583oL, C2585oN c2585oN, int i10, long j10, long j11) {
        C3M.A00(i10, 0, A07());
        A0L(i10, c2583oL, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = c2583oL.A05();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = c2583oL.A00;
        A0H(i11, c2585oN);
        while (i11 < c2583oL.A01 && c2585oN.A02 != j10 && A0H(i11 + 1, c2585oN).A02 <= j10) {
            i11++;
        }
        A0I(i11, c2585oN, true);
        long jMin = j10 - c2585oN.A02;
        if (c2585oN.A01 != C.TIME_UNSET) {
            long j12 = c2585oN.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(C3M.A01(c2585oN.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C2585oN A0H(int i10, C2585oN c2585oN) {
        return A0I(i10, c2585oN, false);
    }

    public C2585oN A0J(Object obj, C2585oN c2585oN) {
        return A0I(A0A(obj), c2585oN, true);
    }

    public final C2583oL A0K(int i10, C2583oL c2583oL) {
        return A0L(i10, c2583oL, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i10, C2585oN c2585oN, C2583oL c2583oL, int i11, boolean z10) {
        return A09(i10, c2585oN, c2583oL, i11, z10) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C2583oL c2583oL = new C2583oL();
        C2585oN c2585oN = new C2585oN();
        C2583oL window = new C2583oL();
        C2585oN otherPeriod = new C2585oN();
        for (int i10 = 0; i10 < A07(); i10++) {
            if (!A0K(i10, c2583oL).equals(timeline.A0K(i10, window))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < A06(); i11++) {
            boolean zEquals = A0I(i11, c2585oN, true).equals(timeline.A0I(i11, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!zEquals) {
                return false;
            }
        }
        int iA0B = A0B(true);
        if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (iA0B != iA0C) {
            int iA08 = A08(iA0B, 0, true);
            if (iA08 != timeline.A08(iA0B, 0, true)) {
                return false;
            }
            iA0B = iA08;
        }
        return true;
    }

    public final int hashCode() {
        C2583oL c2583oL = new C2583oL();
        C2585oN c2585oN = new C2585oN();
        int result = 7 * 31;
        int i10 = result + A07();
        for (int i11 = 0; i11 < A07(); i11++) {
            C2583oL window = A0K(i11, c2583oL);
            i10 = (i10 * 31) + window.hashCode();
        }
        int result2 = i10 * 31;
        int i12 = result2 + A06();
        for (int i13 = 0; i13 < A06(); i13++) {
            i12 = (i12 * 31) + A0I(i13, c2585oN, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i12 * 31;
            i12 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i12;
    }
}
