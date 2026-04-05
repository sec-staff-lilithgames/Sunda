package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSDKNotificationManager;
import com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1424Nw {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static String[] A03 = {"Q2DZPMAW2yeQLbmmbfWH", "FQ0yrAaGYgr4mdqTvnLCAfi7gpajL", "1hQSRsoeRQ52OVueqemqWssHdomhD1Oc", "dcU3JA", "DGXXVImbyRvx6", "DMg70IVEwE3Kkzjo7dV3", "", "yfZMPiXEj5vSY"};
    public static final AtomicReference<InternalAppAdCTAClickNotificationListener> A04;
    public static final AtomicReference<InterfaceC1425Ny> A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{6, 11, 17, 18, 14, 3, 27, 61, 4, 13, 16, 15, 3, 22, 40, 41, 6, 55, 55, 6, 35, 4, 19, 6, 4, 43, 46, 36, 44, 69, 68, 99, 71, 90, 88, 79, 89, 89, 67, 69, 68, 8, 31, 16, 36, 13, 30, 9, 8, 18, 20, 21};
    }

    static {
        A01();
        A01 = A00(41, 11, 42);
        A00 = A00(0, 14, 51);
        A05 = new AtomicReference<>();
        A04 = new AtomicReference<>();
    }

    public static void A02(String str, Bundle bundle) {
        ArrayList arrayList;
        A05.get();
        if (0 != 0) {
            bundle.getString(A01);
            bundle.getString(A00);
            throw new NullPointerException(A00(29, 12, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<AdSDKNotificationListener> listeners = AdSDKNotificationManager.getNotificationListeners();
        synchronized (listeners) {
            arrayList = new ArrayList(AdSDKNotificationManager.getNotificationListeners());
        }
        XJ.A00(new RunnableC1423Nv(arrayList, str));
    }

    public static void A03(String str, String str2, String str3) {
        if (A04 != null) {
            InternalAppAdCTAClickNotificationListener internalAppAdCTAClickNotificationListener = A04.get();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6F2nH21UZcfDLDfNhpfU";
            strArr2[4] = "szNZ34FR6m0ld";
            if (internalAppAdCTAClickNotificationListener != null) {
                A04.get();
                throw new NullPointerException(A00(14, 15, 22));
            }
        }
    }
}
