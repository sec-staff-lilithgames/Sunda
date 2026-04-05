package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1097Bd implements InterfaceC2113gE {
    public static byte[] A02;
    public static final C1097Bd A03;
    public String A01 = A01(1, 7, 98);
    public int A00 = 5;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-33, 1, -6, -9, -6, -5, 3, -6};
    }

    static {
        A05();
        A03 = new C1097Bd();
    }

    public static C1097Bd A00() {
        return A03;
    }

    private String A02(String str) {
        if (this.A01 != null) {
            return this.A01 + A01(0, 1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + str;
        }
        return str;
    }

    public static String A03(String str, Throwable th2) {
        return str + '\n' + A04(th2);
    }

    public static String A04(Throwable th2) {
        if (th2 == null) {
            return A01(0, 0, 21);
        }
        return Log.getStackTraceString(th2);
    }

    private void A06(int i10, String str, String str2) {
        Log.println(i10, A02(str), str2);
    }

    private void A07(int i10, String str, String str2, Throwable th2) {
        Log.println(i10, A02(str), A03(str2, th2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void A9l(String str, String str2) {
        A06(4, str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void A9m(String str, String str2, Throwable th2) {
        A07(4, str, str2, th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final boolean AAP(int i10) {
        return this.A00 <= i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void AIo(int i10) {
        this.A00 = i10;
    }
}
