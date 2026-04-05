package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1526Rx {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1519Rp A02(SQ sq2) {
        Object objA00;
        Method methodA02;
        Object objA002;
        Method methodA022 = AbstractC1527Ry.A02(A00, A04(257, 29, 2), Context.class);
        if (methodA022 == null || (objA00 = AbstractC1527Ry.A00(null, methodA022, sq2)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = AbstractC1527Ry.A02(A04(65, 57, 83), A04(232, 20, 98), Context.class)) == null || (objA002 = AbstractC1527Ry.A00(null, methodA02, sq2)) == null) {
            return null;
        }
        Method methodA01 = AbstractC1527Ry.A01(objA002.getClass(), A04(252, 5, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), new Class[0]);
        Method methodA012 = AbstractC1527Ry.A01(objA002.getClass(), A04(286, 24, 126), new Class[0]);
        if (methodA01 == null || methodA012 == null) {
            return null;
        }
        String str = (String) AbstractC1527Ry.A00(objA002, methodA01, new Object[0]);
        Boolean bool = (Boolean) AbstractC1527Ry.A00(objA002, methodA012, new Object[0]);
        if (str != null) {
            return new C1519Rp(str, bool != null && bool.booleanValue(), EnumC1518Ro.A06);
        }
        return null;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{102, 68, 75, 75, 74, 81, 5, 66, 64, 81, 5, 68, 65, 83, 64, 87, 81, 76, 86, 76, 75, 66, 5, 76, 75, 67, 74, 5, 74, 75, 5, 72, 68, 76, 75, 5, 81, 77, 87, 64, 68, 65, 11, 88, 84, 86, 21, 92, 84, 84, 92, 87, 94, 21, 90, 85, 95, 73, 84, 82, 95, 21, 92, 86, 72, 106, 102, 100, 39, 110, 102, 102, 110, 101, 108, 39, 104, 103, 109, 123, 102, 96, 109, 39, 110, 100, 122, 39, 104, 109, 122, 39, 96, 109, 108, 103, 125, 96, 111, 96, 108, 123, 39, 72, 109, AbstractJsonLexerKt.TC_INVALID, 108, 123, 125, 96, 122, 96, 103, 110, 64, 109, 74, 101, 96, 108, 103, 125, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 34, 40, 54, 107, 36, 33, 54, 107, 44, 33, 32, 43, 49, 44, 35, 44, 32, 55, 107, 54, 32, 55, 51, 44, 38, 32, 107, 22, 17, 4, 23, 17, 53, 57, 59, 120, 49, 57, 57, 49, 58, 51, 120, 55, 56, 50, 36, 57, Utf8.REPLACEMENT_BYTE, 50, 120, 49, 59, 37, 120, 53, 57, 59, 59, 57, 56, 120, 17, 57, 57, 49, 58, 51, 6, 58, 55, 47, 5, 51, 36, 32, Utf8.REPLACEMENT_BYTE, 53, 51, 37, 3, 34, Utf8.REPLACEMENT_BYTE, 58, 116, 118, 125, 118, 97, 122, 112, 95, 93, 76, 121, 92, 78, 93, 74, 76, 81, 75, 81, 86, 95, 113, 92, 113, 86, 94, 87, 65, 67, 82, 111, 66, 49, 43, 31, 55, 55, Utf8.REPLACEMENT_BYTE, 52, 61, 8, 52, 57, 33, 11, 61, 42, 46, 49, 59, 61, 43, 25, 46, 57, 49, 52, 57, 58, 52, 61, 77, 87, 104, 77, 73, 77, 80, 101, 64, 112, 86, 69, 71, 79, 77, 74, 67, 97, 74, 69, 70, 72, 65, 64};
    }

    static {
        A05();
        A03 = C1519Rp.class.getSimpleName();
        A00 = A04(173, 52, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C1519Rp A00(com.facebook.ads.redexgen.core.SQ r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4a
            com.facebook.ads.redexgen.X.Rp r4 = A01(r5)
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AbstractC1526Rx.A02
            r0 = 5
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC1526Rx.A02
            java.lang.String r1 = "hh0RZKDdPPlAkARzc3g59"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L39
        L35:
            com.facebook.ads.redexgen.X.Rp r4 = A02(r5)
        L39:
            if (r4 == 0) goto L45
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
        L45:
            com.facebook.ads.redexgen.X.Rp r4 = A03(r5)
        L49:
            return r4
        L4a:
            r2 = 0
            r1 = 43
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1526Rx.A00(com.facebook.ads.redexgen.X.SQ):com.facebook.ads.redexgen.X.Rp");
    }

    public static C1519Rp A01(SQ sq2) {
        SU adId = sq2.A05().A8p();
        if (adId != null) {
            return new C1519Rp(adId.getId(), adId.AAO(), EnumC1518Ro.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C1519Rp A03(SQ sq2) {
        ServiceConnectionC1525Rw serviceConnectionC1525Rw = new ServiceConnectionC1525Rw();
        Intent intent = new Intent(A04(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (sq2.bindService(intent, serviceConnectionC1525Rw, 1)) {
            try {
                final IBinder iBinderA02 = serviceConnectionC1525Rw.A02();
                ?? r02 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public IBinder A00;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{100, 104, 106, 41, 96, 104, 104, 96, 107, 98, 41, 102, 105, 99, 117, 104, 110, 99, 41, 96, 106, 116, 41, 102, 99, 116, 41, 110, 99, 98, 105, 115, 110, 97, 110, 98, 117, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 78, 70, 99, 113, 98, 117, 115, 110, 116, 110, 105, 96, 78, 99, 84, 98, 117, 113, 110, 100, 98};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A02() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            String string = parcelObtain2.readString();
                            if (string != null) {
                                return string;
                            }
                            if (A02[2].length() == 16) {
                                throw new RuntimeException();
                            }
                            A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                            return A00(0, 0, 82);
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z10 = true;
                            parcelObtain.writeInt(1);
                            this.A00.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z10 = false;
                            }
                            return z10;
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C1519Rp(r02.A02(), r02.A03(), EnumC1518Ro.A07);
            } catch (Throwable th2) {
                try {
                    sq2.A08().AAy(A04(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 7, 73), AbstractC1550Sv.A1Q, new C1551Sw(th2));
                } finally {
                    sq2.unbindService(serviceConnectionC1525Rw);
                }
            }
        }
        return null;
    }
}
