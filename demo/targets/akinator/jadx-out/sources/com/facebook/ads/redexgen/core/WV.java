package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class WV {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<V4, V6> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(V4.A09, V6.A0D);
        A02.put(V4.A07, V6.A0F);
        A02.put(V4.A06, V6.A0E);
    }

    public static AdSize A00(V4 v42) {
        return AdSize.fromWidthAndHeight(v42.A04(), v42.A03());
    }

    public static AdSize A01(V6 v62) {
        for (Map.Entry<V4, V6> entry : A02.entrySet()) {
            if (entry.getValue() == v62) {
                V4 key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static V4 A02(int i10) {
        switch (i10) {
            case 4:
                return V4.A05;
            case 5:
                return V4.A06;
            case 6:
                return V4.A07;
            case 7:
                return V4.A09;
            case 100:
                return V4.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        }
    }

    public static V4 A03(int i10, int i11) {
        if (V4.A08.A03() == i11 && V4.A08.A04() == i10) {
            return V4.A08;
        }
        if (V4.A05.A03() == i11) {
            int iA04 = V4.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (iA04 == i10) {
                return V4.A05;
            }
        }
        if (V4.A06.A03() == i11 && V4.A06.A04() == i10) {
            return V4.A06;
        }
        if (V4.A07.A03() == i11 && V4.A07.A04() == i10) {
            return V4.A07;
        }
        if (V4.A09.A03() == i11) {
            V4 v42 = V4.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (v42.A04() == i10) {
                return V4.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static V4 A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static V6 A05(V4 v42) {
        V6 adTemplate = A02.get(v42);
        if (adTemplate == null) {
            return V6.A0G;
        }
        return adTemplate;
    }
}
