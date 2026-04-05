package com.facebook.ads.redexgen.core;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Sa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1529Sa extends SQLiteOpenHelper {
    public static byte[] A01;
    public static String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
    public static final String A03;
    public final SZ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, 11, 19, 4, 17, -33, 19, 0, 1, 11, 4, -33, 36, 53, 36, 45, 51, 50, -33, 0, 3, 3, -33, 2, 14, 11, 20, 12, 13, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, 15, 30, 13, 31, 20, 17, 31, -10, -8, -25, -19, -13, -25, -58, 12, 21, 24, 11, 15, 13, 20, 5, 17, 11, 31, 25, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
        if (A02[7].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
        strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
    }

    static {
        A02();
        A03 = C1529Sa.class.getSimpleName();
    }

    public C1529Sa(C1911cu c1911cu, SZ sz) {
        super(c1911cu, A01(c1911cu), (SQLiteDatabase.CursorFactory) null, 4);
        if (sz != null) {
            this.A00 = sz;
            return;
        }
        throw new IllegalArgumentException(A00(41, 32, 2));
    }

    public static String A01(C1911cu c1911cu) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Locale locale = Locale.US;
        Object[] objArr = {A00(0, 0, 19)};
        String strA00 = A00(126, 8, 41);
        String str = String.format(locale, strA00, objArr);
        if (!U7.A2c(c1911cu)) {
            return str;
        }
        String defaultDbName = c1911cu.getPackageName();
        String processName = ProcessUtils.getProcessName(c1911cu);
        if (!defaultDbName.equals(processName) && !TextUtils.isEmpty(processName)) {
            String defaultDbName2 = String.format(Locale.US, strA00, '_' + processName);
            return defaultDbName2;
        }
        return str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (AbstractC1532Sd abstractC1532Sd : this.A00.A0M()) {
            abstractC1532Sd.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        for (AbstractC1532Sd abstractC1532Sd : this.A00.A0M()) {
            abstractC1532Sd.A08(sQLiteDatabase);
            abstractC1532Sd.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(A00(101, 25, 99));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 == 2 && i11 >= 3) {
            sQLiteDatabase.execSQL(A00(73, 28, 105));
        }
        if (i10 <= 3 && i11 >= 4) {
            SX sx = C1910ct.A02;
            sQLiteDatabase.execSQL(A00(11, 30, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + sx.A01 + A00(0, 1, 52) + sx.A02 + A00(1, 10, 2));
        }
    }
}
