package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1523Rt {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, AbstractJsonLexerKt.TC_INVALID, 115, 114, 104, 121, 114, 104, 38, 51, 51, AbstractJsonLexerKt.TC_INVALID, 115, 113, 50, 122, 125, AbstractJsonLexerKt.TC_INVALID, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C1522Rs A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 113);
        String strA012 = A01(3, 9, 33);
        String strA013 = A01(0, 3, 83);
        Cursor c10 = null;
        try {
            c10 = contentResolver.query(WQ.A00(A01(12, 60, 19)), new String[]{strA013, strA012, strA01}, null, null, null);
            if (c10 == null || !c10.moveToFirst()) {
                return new C1522Rs(null, null, false);
            }
            String string = c10.getString(c10.getColumnIndex(strA013));
            String attributionId = c10.getString(c10.getColumnIndex(strA012));
            C1522Rs c1522Rs = new C1522Rs(string, attributionId, Boolean.valueOf(c10.getString(c10.getColumnIndex(strA01))).booleanValue());
            if (c10 != null) {
                c10.close();
            }
            return c1522Rs;
        } finally {
            if (c10 != null) {
                c10.close();
            }
        }
    }
}
