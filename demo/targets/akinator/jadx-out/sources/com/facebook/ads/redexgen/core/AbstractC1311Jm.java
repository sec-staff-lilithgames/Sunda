package com.facebook.ads.redexgen.core;

import android.text.SpannableStringBuilder;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1311Jm {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1309Jk A00(C1309Jk c1309Jk, Map<String, C1316Jr> map) {
        while (c1309Jk != null) {
            C1316Jr c1316JrA02 = A02(c1309Jk.A04, c1309Jk.A0H(), map);
            if (c1316JrA02 != null && c1316JrA02.A09() == 1) {
                return c1309Jk;
            }
            c1309Jk = c1309Jk.A03;
        }
        return null;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, 64, 88, 86, 93, 93, 86, 91, 84, 13, 95, 98, 79, 102, 65, 82, 101, 97, 13, 91, 92, 81, 82, 13, 100, 86, 97, 85, 92, 98, 97, 13, 82, 101, 78, 80, 97, 89, 102, 13, 92, 91, 82, 13, 97, 82, 101, 97, 13, 80, 85, 86, 89, 81, 27, -10, 22, 15, 14, -12, 7, 16, 6, 7, 20, -9, 22, 11, 14, 73, 14, -9, 74, 102, 30, 48, -6, -5, 75, 25};
    }

    static {
        A05();
    }

    public static C1309Jk A01(C1309Jk c1309Jk, Map<String, C1316Jr> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1309Jk);
        while (!arrayDeque.isEmpty()) {
            C1309Jk c1309Jk2 = (C1309Jk) arrayDeque.pop();
            C1316Jr c1316Jr = c1309Jk2.A04;
            String[] strArrA0H = c1309Jk2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C1316Jr c1316JrA02 = A02(c1316Jr, strArrA0H, map);
            if (c1316JrA02 != null && c1316JrA02.A09() == 3) {
                return c1309Jk2;
            }
            for (int iA0C = c1309Jk2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(c1309Jk2.A0D(iA0C));
            }
        }
        return null;
    }

    public static C1316Jr A02(C1316Jr c1316Jr, String[] strArr, Map<String, C1316Jr> map) {
        int i10 = 0;
        if (c1316Jr == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1316Jr c1316Jr2 = new C1316Jr();
                int length = strArr.length;
                while (i10 < length) {
                    c1316Jr2.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return c1316Jr2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c1316Jr.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i10 < length3) {
                        C1316Jr c1316Jr3 = map.get(strArr[i10]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c1316Jr.A0O(c1316Jr3);
                        i10++;
                    }
                    return c1316Jr;
                }
            }
        }
        return c1316Jr;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA032 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA032);
        String out = A03(4, 5, 69);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA032);
        String strA033 = A03(3, 1, 6);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA032, strA033);
        String out2 = A03(77, 11, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        return strReplaceAll3.replaceAll(out2, strA033);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.text.Spannable r8, int r9, int r10, com.facebook.ads.redexgen.core.C1316Jr r11, com.facebook.ads.redexgen.core.C1309Jk r12, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1316Jr> r13, int r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1311Jm.A06(android.text.Spannable, int, int, com.facebook.ads.redexgen.X.Jr, com.facebook.ads.redexgen.X.Jk, java.util.Map, int):void");
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
