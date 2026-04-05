package com.facebook.ads.redexgen.core;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class SZ {
    public static byte[] A04;
    public static final String A05;
    public static final Lock A06;
    public static final Lock A07;
    public static final ReentrantReadWriteLock A08;
    public SQLiteOpenHelper A00;
    public final C1911cu A01;
    public final C1909cs A03 = new C1909cs(this);
    public final C1910ct A02 = new C1910ct(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A04 = new byte[]{-82, -53, -82, 109, -117, 109, -116, 85, 118, -120, 120, -102, -64, -52, -55, -57, -102, AbstractJsonLexerKt.TC_INVALID, -87, -82, -88, -83, AbstractJsonLexerKt.TC_INVALID, 94, -118, -121, -117, -121, -110, 94, -93, -46, -47, -93, 87, -122, -119, 123, 124, -119, 87, 121, -112, 87, 85, -120, 122, -119, 85, -115, -60, -75, -78, -65, -78, -115, 110, 116, -82, -94, 94, 110, -101, -99, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -19, -21, -6, -54, -25, -6, -25, -24, -25, -7, -21, -90, -20, -8, -11, -13, -90, -6, -18, -21, -90, -37, -49, -90, -6, -18, -8, -21, -25, -22, -89, -112, -126, -119, -126, -128, -111, 93, -79, -84, -88, -94, -85, -80, 107, -64, -69, -81, -84, -65, -80, -117, -29, -32, -13, -32, -31, -32, -14, -28, -112, -95, -112, -103, -97, -98, -116, -121, -125, 125, -122, -117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i10 = 0; i10 < A0M().length; i10++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder sbAppend = new StringBuilder().append(A05(107, 14, 44)).append(C1909cs.A03.A01);
        String strA05 = A05(58, 2, 113);
        StringBuilder sbAppend2 = sbAppend.append(strA05);
        String strA052 = A05(142, 6, 7);
        StringBuilder sbAppend3 = sbAppend2.append(strA052);
        String strA053 = A05(60, 1, 31);
        StringBuilder sbAppend4 = sbAppend3.append(strA053).append(C1909cs.A02.A01).append(strA05);
        String strA054 = A05(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 6, 26);
        A05 = sbAppend4.append(strA054).append(strA053).append(C1910ct.A04.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A05.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A0A.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A08.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A07.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A06.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A03.A01).append(strA05).append(strA054).append(strA053).append(C1910ct.A02.A01).append(A05(11, 6, 105)).append(strA054).append(A05(17, 6, 78)).append(strA052).append(A05(30, 4, 114)).append(strA054).append(strA053).append(C1910ct.A09.A01).append(A05(0, 3, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)).append(strA052).append(strA053).append(C1909cs.A03.A01).append(A05(34, 10, 38)).append(strA054).append(strA053).append(C1910ct.A08.A01).append(A05(7, 4, 36)).toString();
        A08 = new ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public SZ(C1911cu c1911cu) {
        this.A01 = c1911cu;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            this.A00 = new C1529Sa(this.A01, this);
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 10; i10++) {
            try {
            } catch (SQLiteException e11) {
                e10 = e11;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A08().AAy(A05(128, 8, 110), AbstractC1550Sv.A0v, new C1551Sw(e10));
        throw e10;
        return A00();
    }

    public final int A08(int i10) {
        A07.lock();
        try {
            return A0E().delete(A05(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 6, 26), C1910ct.A02.A01 + A05(3, 4, 60), new String[]{String.valueOf(i10 - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0C(int i10) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(23, 7, 45) + String.valueOf(i10), null);
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(AbstractC1531Sc<T> abstractC1531Sc, AbstractC1561Tg<T> abstractC1561Tg) {
        return XR.A00(XU.A07, new SY(this.A01, abstractC1531Sc, abstractC1561Tg), new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(final String str, final int i10, final String str2, final double d10, final double d11, final String str3, final Map<String, String> data, AbstractC1561Tg<String> abstractC1561Tg) {
        return A0F(new AbstractC1908cr<String>() { // from class: com.facebook.ads.redexgen.X.6L
            public static byte[] A08;
            public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", "E"};

            public static String A01(int i11, int i12, int i13) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i11, i11 + i12);
                for (int i14 = 0; i14 < bArrCopyOfRange.length; i14++) {
                    bArrCopyOfRange[i14] = (byte) ((bArrCopyOfRange[i14] - i13) - 122);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
                if (A09[2].length() == 32) {
                    throw new RuntimeException();
                }
                A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
                A08 = bArr;
            }

            static {
                A02();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1531Sc
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String A03() {
                String eventId = A01(0, 8, 90);
                this.A03.A01.A08().A9v(str2);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                SZ.A07.lock();
                SQLiteDatabase sQLiteDatabaseA0E = null;
                try {
                    try {
                        sQLiteDatabaseA0E = this.A03.A0E();
                        sQLiteDatabaseA0E.beginTransaction();
                        String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(str), i10, str2, d10, d11, str3, data);
                        sQLiteDatabaseA0E.setTransactionSuccessful();
                        if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                            try {
                                if (sQLiteDatabaseA0E.inTransaction()) {
                                    sQLiteDatabaseA0E.endTransaction();
                                }
                            } catch (Exception e10) {
                                this.A03.A01.A08().AAy(eventId, AbstractC1550Sv.A0z, new C1551Sw(e10));
                            }
                        }
                        SZ.A07.unlock();
                        return strA0E;
                    } catch (Exception e11) {
                        A01(EnumC1530Sb.A05);
                        this.A03.A01.A08().AAy(eventId, AbstractC1550Sv.A0y, new C1551Sw(e11));
                        if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                            try {
                                if (sQLiteDatabaseA0E.inTransaction()) {
                                    sQLiteDatabaseA0E.endTransaction();
                                }
                            } catch (Exception e12) {
                                this.A03.A01.A08().AAy(eventId, AbstractC1550Sv.A0z, new C1551Sw(e12));
                            }
                        }
                        SZ.A07.unlock();
                        return null;
                    }
                } catch (Throwable th2) {
                    if (sQLiteDatabaseA0E != null) {
                        boolean zIsOpen = sQLiteDatabaseA0E.isOpen();
                        if (A09[5].length() != 7) {
                            throw new RuntimeException();
                        }
                        A09[2] = "rWG930h";
                        if (zIsOpen) {
                            try {
                                if (sQLiteDatabaseA0E.inTransaction()) {
                                    sQLiteDatabaseA0E.endTransaction();
                                }
                            } catch (Exception e13) {
                                this.A03.A01.A08().AAy(eventId, AbstractC1550Sv.A0z, new C1551Sw(e13));
                            }
                        }
                    }
                    SZ.A07.unlock();
                    throw th2;
                }
            }
        }, abstractC1561Tg);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0K(String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(String str) throws SQLException {
        boolean z10;
        A07.lock();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A05(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 7, 90)).append(A05(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 6, 26)).append(A05(44, 5, 36)).append(C1910ct.A02.A01).append(A05(61, 1, 32)).append(C1910ct.A02.A01).append(A05(56, 2, 50)).append(A05(49, 7, 92)).append(C1910ct.A04.A01).append(A05(62, 2, 77));
            A0E().execSQL(sb2.toString(), new String[]{str});
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        A07.unlock();
        return z10;
    }

    public final AbstractC1532Sd[] A0M() {
        return new AbstractC1532Sd[]{this.A03, this.A02};
    }
}
