package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.eT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2006eT implements InterfaceC1516Rm {
    public static byte[] A02;
    public static String[] A03 = {"frztuTbk90jgHBlm3zQJyLa", "1t5yWCu7Rr8GJSKN0jLr3suU4yLwpLao", "qy8Ulx", "lpakeOCplwfUbPlWH1mKRjN93sjJNeLK", "9U38xP8piwyhajLb0oPtN8g0SrDQbMul", "5doBkCOudtbbit2jQfjyLRk0HEXNCLN", "an6q6r3Pxi3Yd1Uxl34WEMAekK7mvAv", "C2viYzQ805EsgOX4y3n8lLHcCQmdv4Bq"};
    public final EnumC1517Rn A00;
    public final String A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            A03[1] = "szQ1vN1s54Hk3y1OQ1NRUBnkClWieIjw";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A02() {
        A02 = new byte[]{-1, 4, -5, -16, -69, -72, -78};
    }

    static {
        A02();
    }

    public C2006eT(EnumC1517Rn enumC1517Rn, String str) {
        this.A00 = enumC1517Rn;
        this.A01 = str;
    }

    public static C2006eT A00(JSONObject jSONObject) {
        EnumC1517Rn enumC1517RnA00 = EnumC1517Rn.A00(jSONObject.optString(A01(0, 4, 77)));
        String url = jSONObject.optString(A01(4, 3, 8));
        if (enumC1517RnA00 == null || url == null) {
            return null;
        }
        return new C2006eT(enumC1517RnA00, url);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1516Rm
    public final EnumC1517Rn A9G() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A03[1].charAt(30) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "4HA6u4Nz4keiLa8sOcHfyEhD3wtH4bT";
            strArr[5] = "zctnvSkfK8HVemf9ezG6OofbW6HL5VM";
            if (cls == obj.getClass()) {
                C2006eT c2006eT = (C2006eT) obj;
                if (this.A00 != c2006eT.A00) {
                    return false;
                }
                return this.A01.equals(c2006eT.A01);
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1516Rm
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i10 = result * 31;
        int result2 = this.A01.hashCode();
        return i10 + result2;
    }
}
