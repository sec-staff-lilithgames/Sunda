package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1509Rf {
    public static byte[] A07;
    public static String[] A08 = {"AnF1hfDBxlCdLbiDFLPUuTr8rEIYbsCs", "DcTEZsyKQaFycdRSUI2qHgy2Whp5epDQ", "oumPRRvCFD06iOY6OIziseOiJT3r0Y1F", "T68w1lZpg2aHhxWtuqshCv95QbfqOWN4", "NXTzrqYb1pzocIC4FPaomVlkuxRd4v50", "22ngLnp9x9FhYwfhJQ2wIkSm", "Bx3CPZoq94eNKBlojUhsqxvx", "nU7JTpeEhpBFqPr5yRkbJ9HjbOYUZCS7"};
    public final Handler A00;
    public final InterfaceC1508Re A01;
    public final SF A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;
    public final boolean A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{14, 32, 32, 18, 33, 32, -85, -82, -79, -86, -37, -33, -45, -39, -41, -61, -74, -79, -78, -68};
    }

    static {
        A07();
    }

    public C1509Rf(SF sf2, JSONObject jSONObject, String str, String str2, boolean z10, InterfaceC1508Re interfaceC1508Re) {
        this.A02 = sf2;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z10 && A0A(this.A05);
        this.A01 = interfaceC1508Re;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10, C1507Rd c1507Rd) {
        String strA03 = A03(6, 4, 8);
        String strA032 = A03(15, 5, 16);
        String strA033 = A03(10, 5, 53);
        if (z10) {
            if (strA033.equals(c1507Rd.A02)) {
                this.A02.A0d(new SD(c1507Rd.A03, -1, -1, this.A04, this.A03));
                return;
            } else if (strA032.equals(c1507Rd.A02)) {
                this.A02.A0a(new SB(c1507Rd.A03, this.A04, this.A03));
                return;
            } else {
                if (!strA03.equals(c1507Rd.A02)) {
                    return;
                }
                this.A02.A0Z(new SB(c1507Rd.A03, this.A04, this.A03));
                return;
            }
        }
        boolean zEquals = strA033.equals(c1507Rd.A02);
        String[] strArr = A08;
        if (strArr[0].charAt(19) == strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "flwbx6LrQCqeci7k9ke6latQGKdtr0Wf";
        strArr2[4] = "KvRVuDaSTwPscix8AFjTqHYTdR1zRqiC";
        if (zEquals) {
            this.A02.A0c(new SD(c1507Rd.A03, -1, -1, this.A04, this.A03));
        } else if (strA032.equals(c1507Rd.A02)) {
            this.A02.A0b(new SB(c1507Rd.A03, this.A04, this.A03));
        } else {
            if (!strA03.equals(c1507Rd.A02)) {
                return;
            }
            this.A02.A0Y(new SB(c1507Rd.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 112));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.ACN();
        }
        XU.A06.execute(new C2069fV(this));
    }
}
