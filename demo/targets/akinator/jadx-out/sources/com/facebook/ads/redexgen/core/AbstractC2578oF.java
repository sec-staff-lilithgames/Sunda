package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.oF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2578oF<K0> {
    public static byte[] A00;
    public static String[] A01 = {"bao8c38n28wPAMqvf0", "eVcWzAuCAXWumTICSFBebUgmb9TguTkL", "p", "gqL7Zo5j54GI4jqi05kLU", "fae6iywUSwwj1RjLTY2P", "asvzUEyWtHVXByXUijz9tuohidd7jT94", "t7lccWit4rbeEMhbm3WlI6hCZ2BNlGb8", "1T7kTgAAsxu7zrmAj3X1"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 104;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[6] = "XFZlfL1njVMJiM3nHtzYTwesPM930KjJ";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{46, 51, 59, 46, 40, Utf8.REPLACEMENT_BYTE, 46, 47, 29, 42, 39, 62, 46, 56, 27, 46, 57, 0, 46, 50};
    }

    public abstract <K extends K0, V> Map<K, Collection<V>> A04();

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oF != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    private final AW<K0, Object> A00(final int expectedValuesPerKey) {
        AbstractC2426ll.A00(expectedValuesPerKey, A01(0, 20, 35));
        return new AW<K0, Object>() { // from class: com.facebook.ads.redexgen.X.1c
            @Override // com.facebook.ads.redexgen.core.AW
            public final <K extends K0, V> InterfaceC1076Ah<K, V> A00() {
                return AbstractC2582oJ.A00(this.A01.A04(), new AX(expectedValuesPerKey));
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oF != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    public final AW<K0, Object> A03() {
        return A00(2);
    }
}
