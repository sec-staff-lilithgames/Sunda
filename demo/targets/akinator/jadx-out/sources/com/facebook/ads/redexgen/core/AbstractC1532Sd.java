package com.facebook.ads.redexgen.core;

import android.database.sqlite.SQLiteDatabase;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1532Sd {
    public static byte[] A01;
    public final SZ A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, 61, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract SX[] A0A();

    public AbstractC1532Sd(SZ sz) {
        this.A00 = sz;
    }

    private String A00() {
        SX[] sxArrA0A = A0A();
        if (sxArrA0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i10 = 0; i10 < sxArrA0A.length - 1; i10++) {
            result = result + sxArrA0A[i10].A02() + A01(20, 2, 43);
        }
        return result + sxArrA0A[sxArrA0A.length - 1].A02();
    }

    public static String A02(String str, SX[] sxArr) {
        StringBuilder sb2 = new StringBuilder(A01(56, 7, 114));
        for (int i10 = 0; i10 < sxArr.length - 1; i10++) {
            sb2.append(sxArr[i10].A01);
            sb2.append(A01(20, 2, 43));
        }
        sb2.append(sxArr[sxArr.length - 1].A01);
        sb2.append(A01(6, 6, 21));
        sb2.append(str);
        return sb2.toString();
    }

    public static String A03(String str, SX[] sxArr, SX sx) {
        return A02(str, sxArr) + A01(12, 7, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + sx.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + A00() + A01(19, 1, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
