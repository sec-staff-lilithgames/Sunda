package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Se, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1533Se {
    public static Pattern A04;
    public static byte[] A05;
    public static String[] A06 = {"USoK2cfxb51ZJPCyGLsl1oEqVq4F5A", "B1ix", "MKuQHzHoWScniLIuJtRpdi1IJiBszR7E", "m0RxAiB9UHr66yFH4", "lCsnFXMtzGCTFRX1SzzVAUWLGsHIck98", "YGB3OCwtMa2btxklJ7dtSCpn0L9PAA", "mK9fNeoXOGHAzqgN16GdwH9jtGNP", "UNrKSlTWuiH4lc0MNDNSZyV"};
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-27, -70, -48, -102, -24, -94, -102, -39, -94, -102, -39, -46, 11, -43, 35, 13, -12, -13, -64, -13, -10, -59, -12, -11, -11, -61, -63, -64, -41, -46, -59, -64, -12, -4, -61, -63, -59, -64, -12, -4, -61, -63, -63, -41, -11, -73};
        if (A06[4].charAt(7) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "QwSmp19ijd8ERy9gz24h9M2";
        strArr[3] = "mhynLWVjgi3uuGun3";
    }

    static {
        A04();
    }

    public C1533Se(Set<String> options, Integer num, Integer num2, String str) {
        this.A03 = options;
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }

    public C1533Se(String[] strArr, Integer num, Integer num2) {
        strArr = strArr == null ? new String[0] : strArr;
        this.A03 = new LinkedHashSet();
        this.A03.addAll(Arrays.asList(strArr));
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = A01();
    }

    public static C1533Se A00(String str) {
        if (str == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Matcher matcher = A03().matcher(str);
        while (true) {
            boolean zFind = matcher.find();
            if (A06[1].length() != 4) {
                throw new RuntimeException();
            }
            A06[6] = "sKn9BxXmA7RSSQCmWRu2pi7wmb7A";
            if (zFind) {
                linkedHashSet.add(matcher.group(1));
                String strGroup = matcher.group(2);
                String strGroup2 = matcher.group(3);
                if (strGroup != null && strGroup2 != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strGroup2));
                }
            } else {
                return new C1533Se(linkedHashSet, numValueOf, numValueOf2, str);
            }
        }
    }

    private String A01() {
        String strA02;
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.A03) {
            Locale locale = Locale.US;
            if (this.A00 != null && this.A01 != null) {
                strA02 = A02(2, 10, 56);
            } else {
                String[] strArr = A06;
                if (strArr[7].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[0] = "nnUUoBTpU2YPqXP8sfrJzmkBvRy05q";
                strArr2[5] = "LOR0jcP8uyvbiYDNETVTqINk0FH7KZ";
                strA02 = A02(12, 4, 115);
            }
            sb2.append(String.format(locale, strA02, str.toUpperCase(), this.A00, this.A01));
        }
        return sb2.toString();
    }

    public static Pattern A03() {
        Pattern pattern = A04;
        String[] strArr = A06;
        if (strArr[7].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A06[6] = "PeUiXyVqTpDx";
        if (pattern == null) {
            A04 = Pattern.compile(A02(16, 29, 91));
        }
        return A04;
    }

    public final Integer A05() {
        return this.A00;
    }

    public final Integer A06() {
        return this.A01;
    }

    public final String A07() {
        return this.A02;
    }

    public final String A08() {
        Iterator<String> it = this.A03.iterator();
        StringBuilder sbAppend = new StringBuilder().append(A02(1, 1, 34));
        while (it.hasNext()) {
            sbAppend.append(it.next());
            if (it.hasNext()) {
                sbAppend.append(A02(0, 1, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            }
        }
        sbAppend.append(A02(45, 1, 29));
        return sbAppend.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1533Se)) {
            return false;
        }
        C1533Se c1533Se = (C1533Se) obj;
        if (this.A00 == c1533Se.A00 || (this.A00 != null && this.A00.equals(c1533Se.A00))) {
            return (this.A01 == c1533Se.A01 || (this.A01 != null && this.A01.equals(c1533Se.A01))) && this.A03.equals(c1533Se.A03);
        }
        return false;
    }

    public final int hashCode() {
        return (this.A03.hashCode() * Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) + ((this.A00 == null ? -1 : this.A00.intValue()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + ((this.A01 != null ? this.A01.intValue() : -1) * 139);
    }
}
