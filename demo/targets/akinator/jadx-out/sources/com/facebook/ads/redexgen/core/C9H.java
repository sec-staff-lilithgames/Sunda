package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9H implements InterfaceC2469mT {
    public static byte[] A05;
    public static String[] A06 = {"xDo36q5CJhNrWsOc4rgAzQVAx", "Zg", "PxE083d5zJ8aaIHABfFNAkkkdmyhAK0f", "IKBV5UeodpiHWCvQ4", "aq", "Dab1stL8zsyR1UyyOB", "bulzcqFjtxPyO4baGqsDfIFqn", "1F8Ca2LGZvQNSSWsKAWhpLL3JBdOfpqY"};
    public static final String A07;
    public static final String[] A08;
    public boolean A00;
    public final InterfaceC09384m A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static B8 A01(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        BW bwA02 = new BW((String) C3M.A01(cursor.getString(0)), Uri.parse((String) C3M.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA05 = bwA02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        BU bu2 = new BU();
        bu2.A01 = cursor.getLong(13);
        bu2.A00 = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new B8(downloadRequestA05, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, bu2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static B8 A02(Cursor cursor) {
        DownloadRequest downloadRequestA05 = new BW((String) C3M.A01(cursor.getString(0)), Uri.parse((String) C3M.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        BU bu2 = new BU();
        bu2.A01 = cursor.getLong(13);
        bu2.A00 = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new B8(downloadRequestA05, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, bu2);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{51, 66, 35, 44, 38, 66, 77, 36, 35, 77, 69, 78, 15, 2, 70, 50, 35, 62, 50, 70, 54, 52, 47, 43, 39, 52, Utf8.REPLACEMENT_BYTE, 70, 45, 35, Utf8.REPLACEMENT_BYTE, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 11, 15, 11, 3, 57, 18, 31, 22, 3, 70, 50, 35, 62, 50, 74, 19, 20, 15, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 20, 3, 7, 11, 57, 13, 3, 31, 21, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 19, 21, 18, 9, 11, 57, 5, 7, 5, 14, 3, 57, 13, 3, 31, 70, 50, 35, 62, 50, 74, 2, 7, 18, 7, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 7, 18, 3, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 7, 20, 18, 57, 18, 15, 11, 3, 57, 11, 21, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 19, 22, 2, 7, 18, 3, 57, 18, 15, 11, 3, 57, 11, 21, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 9, 8, 18, 3, 8, 18, 57, 10, 3, 8, 1, 18, 14, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 9, 22, 57, 20, 3, 7, 21, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 0, 7, 15, 10, 19, 20, 3, 57, 20, 3, 7, 21, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 22, 3, 20, 5, 3, 8, 18, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 52, 35, 39, 42, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 4, 31, 18, 3, 21, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 13, 3, 31, 57, 21, 3, 18, 57, 15, 2, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 79, 25, 11, 118, 103, 112, 116, 97, 112, 21, 97, 116, 119, 121, 112, 21, 115, 101, 120, 103, 23, 99, 118, 117, 123, 114, 23, 126, 113, 23, 114, 111, 126, 100, 99, 100, 23, 49, 12, 27, 36, 24, 21, 13, 17, 6, 48, 27, 3, 26, 24, 27, 21, 16, 7, 106, 24, 50, 35, 35, Utf8.REPLACEMENT_BYTE, 58, 48, 50, 39, 58, 60, 61, 124, 55, 50, 32, 59, 120, 43, 62, Utf8.REPLACEMENT_BYTE, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 110, 118, 124, 54, 117, 107, 53, 107, 107, 108, 106, 51, 96, 117, 116, 117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 108, 57, 121, 100, 113, 115, 65, 70, 88, 70, 93, 80, 65, 87, 123, 64, 75, 83, 74, 72, 75, 69, 64, 65, 64, 70, 74, 75, 81, 64, 75, 81, 122, 73, 64, 75, 66, 81, 77, 115, 101, 99, 100, AbstractJsonLexerKt.TC_INVALID, 125, 79, 115, 113, 115, 120, 117, 79, 123, 117, 105, 20, 17, 3, 24, 121, 124, 105, 124, 102, 97, 105, 108, 117, 114, 101, 95, 114, 101, 97, 115, 111, 110, 52, 48, 47, 42, 39, 52, 57, 125, 96, 125, 98, 70, 72, 84, 114, 94, 72, 89, 114, 68, 73, 53, 49, 53, 61, 7, 44, 33, 40, 61, AbstractJsonLexerKt.TC_INVALID, 106, 125, 108, 106, 97, 123, 80, 107, 96, 120, 97, 99, 96, 110, 107, 106, 107, 119, 119, 22, 17, 4, 23, 17, 58, 17, 12, 8, 0, 58, 8, 22, 36, 35, 54, 37, 35, 8, 35, 62, 58, 50, 8, 58, 36, 119, 22, 4, 20, 109, 106, AbstractJsonLexerKt.TC_INVALID, 106, 123, 99, 100, 113, 100, 117, 48, 45, 48, 34, 51, 52, 47, 48, 31, 50, 37, 33, 51, 47, 46, 70, 65, 71, 80, 84, 88, 106, 94, 80, 76, 70, 79, 82, 79, 87, 94, 73, 76, 88, 93, 72, 89, 99, 72, 85, 81, 89, 99, 81, 79, 77, 74, 81, 38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, AbstractJsonLexerKt.TC_INVALID, 40, 125, 37, 62, 59, 62, Utf8.REPLACEMENT_BYTE, 39, 62};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new String[]{A04(607, 2, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16), A04(615, 10, 25)};
    }

    public C9H(InterfaceC09384m interfaceC09384m) {
        this(interfaceC09384m, A04(0, 0, 21));
    }

    public C9H(InterfaceC09384m interfaceC09384m, String str) {
        this.A03 = str;
        this.A01 = interfaceC09384m;
        this.A04 = A04(448, 18, 64) + str;
        this.A02 = new Object();
    }

    private Cursor A00(String str, String[] strArr) throws C09374l {
        try {
            String sortOrder = A04(667, 17, 99);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (SQLiteException e10) {
            throw new C09374l(e10);
        }
    }

    public static String A05(String str) {
        if (A04(582, 4, 68).equals(str)) {
            return A04(468, 20, 103);
        }
        if (A04(604, 3, 104).equals(str)) {
            return A04(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE, 21, 32);
        }
        if (A04(652, 2, 48).equals(str)) {
            return A04(488, 27, 44);
        }
        return A04(742, 15, 100);
    }

    public static String A06(List<StreamKey> streamKeys) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < streamKeys.size(); i10++) {
            StreamKey streamKey = streamKeys.get(i10);
            StringBuilder stringBuilder = sb2.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(AbstractJsonLexerKt.COMMA);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(TTAdConstant.VIDEO_INFO_CODE, 1, 14);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A04(684, 5, 42)).append(A04(6, 5, 89));
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            int i11 = iArr[i10];
            int i12 = A06[5].length();
            if (i12 == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "Jd";
            strArr[4] = "Ze";
            sb2.append(i11);
        }
        sb2.append(')');
        String string = sb2.toString();
        String[] strArr2 = A06;
        if (strArr2[0].length() != strArr2[6].length()) {
            return string;
        }
        String[] strArr3 = A06;
        strArr3[1] = "5c";
        strArr3[4] = "cS";
        return string;
    }

    private List<B8> A08(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!AbstractC09264a.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.A04, new String[]{A04(607, 2, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A04(720, 5, 15), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16)}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(A02(cursorQuery));
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
        return arrayList;
    }

    public static List<StreamKey> A09(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] strArr = A06;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "JZKSAdXCo0Lu0XCPfhbdJS2vI";
        strArr2[6] = "3oo0vy2N0OZaC0WsxvSOxloxy";
        for (String str2 : AbstractC09264a.A1O(str, A04(TTAdConstant.IMAGE_URL_CODE, 1, 1))) {
            String[] strArrA1O = AbstractC09264a.A1O(str2, A04(466, 2, 2));
            C3M.A08(strArrA1O.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrA1O[0]), Integer.parseInt(strArrA1O[1]), Integer.parseInt(strArrA1O[2])));
        }
        return arrayList;
    }

    private void A0A() throws C09374l {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int iA00 = AbstractC09404o.A00(readableDatabase, 0, this.A03);
                if (iA00 != 3) {
                    SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        AbstractC09404o.A04(writableDatabase, 0, this.A03, 3);
                        List<B8> listA08 = iA00 == 2 ? A08(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 3) + this.A04);
                        writableDatabase.execSQL(A04(TTAdConstant.VIDEO_URL_CODE, 13, 1) + this.A04 + A04(0, 1, 39) + A04(11, 401, 82));
                        Iterator<B8> it = listA08.iterator();
                        while (it.hasNext()) {
                            A0C(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                this.A00 = true;
            } catch (SQLException e10) {
                throw new C09374l(e10);
            }
        }
    }

    private void A0C(B8 b82, SQLiteDatabase sQLiteDatabase) throws SQLException {
        byte[] bArr = b82.A07.A06 == null ? AbstractC09264a.A07 : b82.A07.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put(A04(607, 2, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), b82.A07.A02);
        contentValues.put(A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), b82.A07.A03);
        contentValues.put(A04(739, 3, 12), b82.A07.A00.toString());
        contentValues.put(A04(709, 11, 1), A06(b82.A07.A04));
        contentValues.put(A04(566, 16, 36), b82.A07.A01);
        contentValues.put(A04(586, 4, 41), b82.A07.A05);
        contentValues.put(A04(684, 5, 42), Integer.valueOf(b82.A02));
        contentValues.put(A04(654, 13, 81), Long.valueOf(b82.A05));
        contentValues.put(A04(725, 14, 8), Long.valueOf(b82.A06));
        contentValues.put(A04(552, 14, 17), Long.valueOf(b82.A04));
        contentValues.put(A04(698, 11, 116), Integer.valueOf(b82.A03));
        contentValues.put(A04(590, 14, 52), Integer.valueOf(b82.A01));
        contentValues.put(A04(634, 18, 59), Float.valueOf(b82.A00()));
        contentValues.put(A04(536, 16, 16), Long.valueOf(b82.A01()));
        contentValues.put(A04(615, 10, 25), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final B8 A7i(String str) throws C09374l {
        A0A();
        try {
            Cursor cursorA00 = A00(A04(609, 6, 105), new String[]{str});
            try {
                if (cursorA00.getCount() == 0) {
                    if (cursorA00 != null) {
                        cursorA00.close();
                        return null;
                    }
                    return null;
                }
                cursorA00.moveToNext();
                B8 b8A01 = A01(cursorA00);
                if (cursorA00 != null) {
                    cursorA00.close();
                }
                return b8A01;
            } finally {
            }
        } catch (SQLiteException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final C2479md A7j(int... iArr) throws C09374l {
        A0A();
        return new C2479md(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AGV(B8 b82) throws C09374l, SQLException {
        A0A();
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(b82, writableDatabase);
        } catch (SQLiteException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AHh(String str) throws C09374l {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(609, 6, 105), new String[]{str});
        } catch (SQLiteException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AIe() throws C09374l {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 36), null);
        } catch (SQLException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AJ5() throws C09374l {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 5);
            contentValues.put(A04(590, 14, 52), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (SQLException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AJ6(int i10) throws C09374l {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i10));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (SQLException e10) {
            throw new C09374l(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2469mT
    public final void AJ7(String str, int i10) throws C09374l {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i10));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, 86) + A04(609, 6, 105), new String[]{str});
        } catch (SQLException e10) {
            throw new C09374l(e10);
        }
    }
}
