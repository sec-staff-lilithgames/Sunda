package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.nJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2521nJ implements Iterator<Object> {
    A03;

    public static byte[] A00;
    public static String[] A01 = {"MtVTs5cDzTkaqvg8NuH3vwobapVBE0st", "ArMYDbI1ZOKb1PqTCippk6Br36HImDMz", "toSUZKKd1UGhUJ4QalyaWathzboIF5UW", "VPzDHjdriWPgU4d", "Di5eRoJ6h3CuCR5uxiNB2s29p0t6qO11", "B6Kcd5hxdA7PPWxpRUkmfJ1syAdRnb1r", "u5nu3DOOZeH", "WD4F9WHgG47OHFbe2E6bcqFaZ5qcCEPl"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            if (A01[4].charAt(4) != 'R') {
                throw new RuntimeException();
            }
            A01[6] = "SHVGlB8lB2rly5Sbj1O4M1TTC2AUnN6";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 101, 120, AbstractJsonLexerKt.TC_INVALID, 106, 101, 104, 110};
    }

    static {
        A01();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2426ll.A04(false);
    }
}
