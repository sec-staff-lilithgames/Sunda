package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Xh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1662Xh {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 48);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = C1662Xh.class.getSimpleName();
    }

    public static Map<String, String> A01(@Nullable C1937dL c1937dL) {
        Window window;
        HashMap map = new HashMap();
        if (c1937dL == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 0), String.valueOf(A04(c1937dL)));
            Activity activityA0E = c1937dL.A0E();
            if (activityA0E != null && (window = activityA0E.getWindow()) != null) {
                int i10 = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                map.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i10;
                String strA00 = A00(1, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                map.put(A00(48, 5, 39), type > 0 ? strA00 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i10;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    strA00 = flagDismissKeyguardEnabled;
                }
                map.put(A00(53, 5, 50), strA00);
            }
        } catch (Exception e10) {
            Log.e(A02, A00(2, 30, 15), e10);
            InterfaceC1549Su interfaceC1549SuA08 = c1937dL.A08();
            int type3 = AbstractC1550Sv.A2T;
            interfaceC1549SuA08.AAy(A00(43, 5, 77), type3, new C1551Sw(e10));
        }
        return map;
    }

    public static boolean A03(C1937dL c1937dL) {
        return !XQ.A04(A01(c1937dL));
    }

    public static boolean A04(C1937dL c1937dL) {
        KeyguardManager keyguardManager = (KeyguardManager) c1937dL.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
