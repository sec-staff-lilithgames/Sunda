package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class TE {
    public static byte[] A0B;
    public static String[] A0C = {"HvWirbE21CthcAzglwYfTu8hbbodSMpt", "IeFog7wu84ahUP8wrgQRktORVTrd36mu", "iK4FOuTHNOskZfjZXsfgR2qFw0uXKXeK", "C94HT2jeMQxh5gbTQbuMo6", "sYjDRqqzhUlQiHGhQNwIRm9nE6", "ToeXfBs6HhTxzZ9ArPJAGMlk", "KWsBEUuyQyen4sbZ9JEq20dYDlqTcXTf", "JMF3DYKQmRYKnieuthRXwzFPxh0qj8YI"};
    public TF A01;
    public AdPlacementType A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public JSONObject A09;
    public final boolean A0A;
    public int A00 = 0;
    public List<TC> A08 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{-8, 9};
    }

    static {
        A01();
    }

    public TE(TF tf2, String str, String str2, String str3, String str4, String str5, boolean z10) {
        this.A01 = tf2;
        this.A05 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A07 = str5;
        if (this.A01 != null) {
            this.A02 = this.A01.A0D();
        }
        this.A0A = z10;
    }

    public final int A02() {
        return this.A08.size();
    }

    public final long A03() {
        if (this.A01 != null) {
            return this.A01.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final TC A04() {
        if (this.A00 < this.A08.size()) {
            this.A00++;
            return this.A08.get(this.A00 - 1);
        }
        return null;
    }

    public final TF A05() {
        return this.A01;
    }

    public final AdPlacementType A06() {
        return this.A02;
    }

    public final String A07() {
        return this.A03;
    }

    public final String A08() {
        return this.A04;
    }

    public final String A09() {
        if (this.A00 > 0) {
            int i10 = this.A00;
            if (A0C[2].charAt(13) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "rOOT956xIOu8KS0VzerRP9k2FI";
            strArr[3] = "CsBaNUluQU2chTuAQUApCe";
            if (i10 <= this.A08.size()) {
                return this.A08.get(this.A00 - 1).A04().optString(A00(0, 2, 63));
            }
        }
        if (A0C[7].charAt(12) != 'n') {
            return null;
        }
        A0C[2] = "3lTgH9thszczufuEmz4eSAEm15D6iTfe";
        return null;
    }

    public final String A0A() {
        return this.A05;
    }

    public final String A0B() {
        TC tc2;
        if (this.A08.isEmpty() || (tc2 = this.A08.get(0)) == null || tc2.A04() == null) {
            return null;
        }
        return tc2.A04().optString(A00(0, 2, 63));
    }

    public final String A0C() {
        return this.A06;
    }

    public final String A0D() {
        return this.A07;
    }

    public final JSONObject A0E() {
        return this.A09;
    }

    public final void A0F(TC tc2) {
        this.A08.add(tc2);
    }

    public final void A0G(JSONObject jSONObject) {
        this.A09 = jSONObject;
    }

    public final boolean A0H() {
        return this.A0A;
    }

    public final boolean A0I() {
        return this.A01 == null || XG.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
