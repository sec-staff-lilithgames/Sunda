package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.no, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2552no extends SQLiteOpenHelper implements InterfaceC09384m {
    public static byte[] A00;
    public static String[] A01 = {"YuTOcDzSk33WzGuHUm34fIUZdR6FzBSo", "XTKHU7ykX6HxNiJgN0rgjCseZECTQtra", "VEZqd6OFp5mQyS5r43nHHulMPiVDQ9eW", "aLYnSlPQY916exG9yEmf5vg4GfwoTrU7", "tF23Z6GUlh0Fjg1gJR8XevpVUkpWaXM2", "mepItLhmIU8NS8JNKSf8apCSosOFfjC4", "Cz0Pux5KFog27POOTk7sr9rS4XUT", "HqOHPFLqaLH3svqHIBOSrAzDJwUDQThi"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
            String[] strArr = A01;
            if (strArr[0].charAt(22) == strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "n1qaiWHrUpNnLAu01u7Aygvt6fyaUUnG";
            strArr2[3] = "NzqeYJq8DJ4S2vkSjhcMbPo6SDo1HpGr";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 1, 14, 104, 13, 16, 1, 27, 28, 27, 104, 80, 70, 91, 68, 52, 94, 105, 105, 116, 105, 59, 126, 99, 126, 120, 110, 111, 114, 117, 124, 59, 56, 42, 47, 10, 31, 10, 9, 10, 24, 14, 59, 25, 4, 29, 2, 15, 14, 25, 116, 105, 126, 97, 125, 112, 104, 116, 99, 78, 120, AbstractJsonLexerKt.TC_INVALID, 101, 116, 99, AbstractJsonLexerKt.TC_INVALID, 112, 125, Utf8.REPLACEMENT_BYTE, 117, 115, Utf8.REPLACEMENT_BYTE, 48, 60, 52, 25, 27, 6, 3, 30, 15, 53, 7, 11, 25, 30, 15, 24, 34, 32, 61, 56, 37, 52, 14, 34, 52, 32, 36, 52, Utf8.REPLACEMENT_BYTE, 50, 52, 64, 77, 68, 81};
    }

    static {
        A01();
    }

    public C2552no(Context context) {
        super(context.getApplicationContext(), A00(50, 21, 61), (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query(A00(75, 13, 70), new String[]{A00(103, 4, 24), A00(71, 4, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!A00(88, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE).equals(string2)) {
                    String str = A00(11, 5, 56) + string + A00(0, 11, 100) + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e10) {
                        String type = A00(32, 18, 71);
                        AnonymousClass44.A08(type, A00(16, 16, 55) + str, e10);
                    }
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        A02(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
