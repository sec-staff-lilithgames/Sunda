package com.facebook.ads.redexgen.core;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1562Th {
    public static byte[] A00;
    public static String[] A01 = {"DnTt6XIWuAOQU1Yv6ovRwSY", "69qI84ufJ2UhBtkQx2IBHzZ", "lNRa3H", "2y2Uq0vrRuc5d5uHsu4hqSSezWuXbHLJ", "zUBzfUPcj8uIEo8tGSc", "tyrfQSxRYtG07uuggB4oX54vdLL3Tqsi", "aO8Ix6JCuD3GiDZZv02FTTQkozyjIQFp", "pMzofq8cn4xP4Da44trMpLQAQtlXLUTp"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[4] = "";
        A00 = new byte[]{3, 20, 18, 30, 3, 21, 46, 21, 16, 5, 16, 19, 16, 2, 20};
    }

    static {
        A03();
    }

    public static InterfaceC1563Tj A00(C1911cu c1911cu) {
        try {
            return new C1620Vp(c1911cu);
        } catch (IOException e10) {
            c1911cu.A08().AAy(A02(0, 15, 104), AbstractC1550Sv.A2K, new C1551Sw(e10));
            return new W8();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6J] */
    public static C6J A01(C1911cu c1911cu) {
        return new WO(c1911cu) { // from class: com.facebook.ads.redexgen.X.6J
            public static byte[] A03;
            public static String[] A04 = {"u3ex4KQMIW041lf", "3AptpGjhH", "gmUldlaQs1iDW8SjyulR1SveXx4W0WHx", "1qDQcvNZxrP96rda7KCur1LyuVNWU8kp", "CAWPS90lsy", "t8qLCZBFlDEhGKoHyGYF6SljofbMSV", "olmaGtOYwcY5nta5it0d5AQEWYClhN", "QuuHkAQHaV7iF"};
            public boolean A00 = true;
            public final C1911cu A01;
            public final SZ A02;

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A04() {
                A03 = new byte[]{-37, -7, 6, -65, 12, -72, -4, -3, 4, -3, 12, -3, -72, -7, 12, 12, -3, 5, 8, 12, 11, -72, -3, 16, -5, -3, -3, -4, -3, -4, -72, -3, 14, -3, 6, 12, 11, -58, -87, -84, -66, -79, -84, -1, 18, 18, 3, 11, 14, 18, 8, 5, 24, 5, -75, -80, -33, -47, -33, -33, -43, -37, -38, -53, -43, -48, -51, -65, -51, -51, -61, -55, -56, -71, -50, -61, -57, -65, 18, 7, 11, 3, 3, -2, -6, -12, -3, -18, -8, -13, -18, -13, -22, -33};
            }

            static {
                A04();
            }

            {
                this.A01 = c1911cu;
                this.A02 = new SZ(c1911cu);
            }

            private JSONArray A01(Cursor cursor) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(C1910ct.A04.A00));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(C1910ct.A09.A00));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(C1910ct.A0A.A00));
                    jSONObject.put(A00(78, 4, 94), XG.A03(cursor.getDouble(C1910ct.A08.A00)));
                    jSONObject.put(A00(66, 12, 26), XG.A03(cursor.getDouble(C1910ct.A07.A00)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(C1910ct.A06.A00));
                    String string = cursor.getString(C1910ct.A03.A00);
                    jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(C1910ct.A02.A00));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8F());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            private JSONArray A02(Cursor cursor) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(2));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(0));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(4));
                    jSONObject.put(A00(78, 4, 94), XG.A03(cursor.getDouble(5)));
                    jSONObject.put(A00(66, 12, 26), XG.A03(cursor.getDouble(6)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(7));
                    String string = cursor.getString(8);
                    jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(9));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8F());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            public static JSONObject A03(Cursor cursor) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                while (cursor.moveToNext()) {
                    jSONObject.put(cursor.getString(C1909cs.A03.A00), cursor.getString(C1909cs.A02.A00));
                }
                return jSONObject;
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final int A4s(int i10) {
                int iA08 = 0;
                if (i10 > -1) {
                    try {
                        iA08 = this.A02.A08(i10);
                    } catch (Exception e10) {
                        if (this.A01.A05().AAF()) {
                            Log.e(WO.A00, A00(0, 38, 88), e10);
                        }
                    }
                }
                this.A02.A0I();
                if (this.A00) {
                    this.A02.A0J();
                }
                return iA08;
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1563Tj
            public final void A4t() {
                this.A02.A0H();
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final boolean A5i(String str) {
                return this.A02.A0K(str);
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final JSONArray A6k() {
                Cursor cursorA0A = null;
                try {
                    cursorA0A = this.A02.A0A();
                    JSONArray jSONArrayA01 = null;
                    if (cursorA0A.getCount() > 0) {
                        jSONArrayA01 = A01(cursorA0A);
                    }
                    if (cursorA0A != null) {
                        cursorA0A.close();
                    }
                    return jSONArrayA01;
                } catch (JSONException unused) {
                    if (cursorA0A != null) {
                        cursorA0A.close();
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorA0A != null) {
                        cursorA0A.close();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final JSONObject A6l() {
                Cursor cursorA0B = null;
                try {
                    cursorA0B = this.A02.A0B();
                    JSONObject jSONObjectA03 = null;
                    if (cursorA0B.getCount() > 0) {
                        jSONObjectA03 = A03(cursorA0B);
                    }
                    if (cursorA0B != null) {
                        cursorA0B.close();
                    }
                    return jSONObjectA03;
                } catch (JSONException unused) {
                    if (cursorA0B != null) {
                        cursorA0B.close();
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorA0B != null) {
                        cursorA0B.close();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final int A7u() {
                Cursor cursorA09 = null;
                try {
                    cursorA09 = this.A02.A09();
                    return cursorA09.moveToFirst() ? cursorA09.getInt(0) : 0;
                } finally {
                    if (cursorA09 != null) {
                        cursorA09.close();
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final String A7x(String str) {
                String string = null;
                Cursor cursorA0D = this.A02.A0D(str);
                if (cursorA0D != null) {
                    boolean zMoveToNext = cursorA0D.moveToNext();
                    String[] strArr = A04;
                    String str2 = strArr[4];
                    String eventType = strArr[0];
                    if (str2.length() == eventType.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[4] = "rCLG4kGmKo";
                    strArr2[0] = "2rihfjjJxsL3teC";
                    if (zMoveToNext && cursorA0D.getCount() > 0) {
                        String eventType2 = C1910ct.A0A.A01;
                        string = cursorA0D.getString(cursorA0D.getColumnIndex(eventType2));
                    }
                    cursorA0D.close();
                }
                return string;
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final Pair<JSONObject, JSONArray> A9A(int i10) {
                Cursor cursorA0C = null;
                try {
                    try {
                        cursorA0C = this.A02.A0C(i10);
                        JSONArray events = null;
                        JSONObject tokens = null;
                        if (cursorA0C.getCount() > 0) {
                            tokens = A03(cursorA0C);
                            events = A02(cursorA0C);
                        }
                        Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                        if (cursorA0C != null) {
                            cursorA0C.close();
                        }
                        return pair;
                    } catch (JSONException unused) {
                        Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                        if (cursorA0C != null) {
                            cursorA0C.close();
                        }
                        return pair2;
                    }
                } catch (Throwable th2) {
                    if (cursorA0C != null) {
                        cursorA0C.close();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.ads.redexgen.core.Ti
            public final boolean A9x(String str) {
                return this.A02.A0L(str);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            @Override // com.facebook.ads.redexgen.core.InterfaceC1563Tj
            public final void AKL(UP up2, AbstractC1561Tg<String> abstractC1561Tg) {
                this.A02.A0G(up2.A08(), up2.A05().A00, up2.A06().toString(), up2.A04(), up2.A03(), up2.A07(), up2.A09(), abstractC1561Tg);
            }
        };
    }
}
