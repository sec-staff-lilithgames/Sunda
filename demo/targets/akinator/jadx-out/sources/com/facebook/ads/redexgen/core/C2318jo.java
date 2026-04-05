package com.facebook.ads.redexgen.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2318jo implements KJ {
    public static byte[] A0F;
    public static String[] A0G = {"mAIJKcC20Y3eOfYyWQRzrg7mLeRMrJFl", "eZxkBrFzPoxgu8goyyke6z3uoIiInH7I", "", "7SF2NgL0Q5eCPREDvftOSH9OstPB", "tBtJ4FuF4UkjOIbBZeVQSFTGpUKvKhYU", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "JQCW8upC74KuI6xTj5WGF", "PsTmzjLTY6QrmqAE1gFrtVK8jOOfhc8D"};
    public long A01;
    public H1 A02;
    public KQ A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final KX A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean[] A0E = new boolean[3];
    public final KS A0A = new KS(7, 128);
    public final KS A08 = new KS(8, 128);
    public final KS A09 = new KS(6, 128);
    public long A00 = C.TIME_UNSET;
    public final C4J A07 = new C4J();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{60, 35, 46, 47, 37, 101, 43, 60, 41};
    }

    static {
        A02();
    }

    public C2318jo(KX kx, boolean z10, boolean z11) {
        this.A0B = kx;
        this.A0C = z10;
        this.A0D = z11;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A01() {
        C3M.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A03(long j10, int i10, int i11, long j11) {
        if (!this.A05 || this.A03.A06()) {
            this.A0A.A04(i11);
            this.A08.A04(i11);
            if (!this.A05) {
                if (this.A0A.A03() && this.A08.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A0A.A01, this.A0A.A00));
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    C1237Gp c1237GpA09 = AbstractC1238Gq.A09(this.A0A.A01, 3, this.A0A.A00);
                    C1236Go c1236GoA07 = AbstractC1238Gq.A07(this.A08.A01, 3, this.A08.A00);
                    this.A02.A6W(new C2D().A0y(this.A04).A11(A00(0, 9, 116)).A0w(C3U.A01(c1237GpA09.A08, c1237GpA09.A01, c1237GpA09.A04)).A0r(c1237GpA09.A0A).A0f(c1237GpA09.A03).A0Y(c1237GpA09.A00).A12(arrayList).A14());
                    this.A05 = true;
                    this.A03.A04(c1237GpA09);
                    this.A03.A03(c1236GoA07);
                    this.A0A.A00();
                    this.A08.A00();
                }
            } else {
                boolean sampleIsKeyFrame = this.A0A.A03();
                if (sampleIsKeyFrame) {
                    this.A03.A04(AbstractC1238Gq.A09(this.A0A.A01, 3, this.A0A.A00));
                    this.A0A.A00();
                } else if (this.A08.A03()) {
                    this.A03.A03(AbstractC1238Gq.A07(this.A08.A01, 3, this.A08.A00));
                    this.A08.A00();
                }
            }
        }
        if (this.A09.A04(i11)) {
            byte[] bArr = this.A09.A01;
            if (A0G[7].charAt(24) == 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "IcPmfl1yBNDnokE5CaufU";
            strArr[2] = "";
            this.A07.A0j(this.A09.A01, AbstractC1238Gq.A02(bArr, this.A09.A00));
            this.A07.A0f(4);
            this.A0B.A02(j11, this.A07);
        }
        boolean sampleIsKeyFrame2 = this.A03.A07(j10, i10, this.A05, this.A06);
        if (sampleIsKeyFrame2) {
            this.A06 = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A04(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A06()) {
            this.A0A.A01(i10);
            this.A08.A01(i10);
        }
        this.A09.A01(i10);
        this.A03.A02(j10, i10, j11);
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A06()) {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
        }
        this.A09.A02(bArr, i10, i11);
        this.A03.A05(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        A01();
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        byte[] bArrA0l = c4j.A0l();
        long j10 = this.A01;
        int offset = c4j.A07();
        this.A01 = j10 + offset;
        H1 h12 = this.A02;
        int offset2 = c4j.A07();
        h12.AI7(c4j, offset2);
        while (true) {
            int iA04 = AbstractC1238Gq.A04(bArrA0l, iA09, iA0A, this.A0E);
            if (iA04 == iA0A) {
                A05(bArrA0l, iA09, iA0A);
                return;
            }
            int lengthToNalUnit = AbstractC1238Gq.A01(bArrA0l, iA04);
            if (A0G[7].charAt(24) == 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "800XsA7BA4hpamNrxbWO1";
            strArr[2] = "";
            int i10 = iA04 - iA09;
            if (i10 > 0) {
                A05(bArrA0l, iA09, iA04);
            }
            int i11 = iA0A - iA04;
            long j11 = this.A01 - i11;
            int offset3 = i10 < 0 ? -i10 : 0;
            A03(j11, i11, offset3, this.A00);
            A04(j11, lengthToNalUnit, this.A00);
            iA09 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1329Ke c1329Ke) {
        c1329Ke.A05();
        this.A04 = c1329Ke.A04();
        this.A02 = gy.AJh(c1329Ke.A03(), 2);
        this.A03 = new KQ(this.A02, this.A0C, this.A0D);
        this.A0B.A03(gy, c1329Ke);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A00 = j10;
        }
        this.A06 |= (i10 & 2) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A01 = 0L;
        this.A06 = false;
        this.A00 = C.TIME_UNSET;
        AbstractC1238Gq.A0H(this.A0E);
        this.A0A.A00();
        this.A08.A00();
        this.A09.A00();
        if (this.A03 != null) {
            this.A03.A01();
        }
    }
}
