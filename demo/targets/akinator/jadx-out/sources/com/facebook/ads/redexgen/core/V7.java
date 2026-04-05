package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class V7 implements InterfaceC2017ee {
    public static byte[] A01;
    public static String[] A02 = {"Pvxnryfp5C2YJ", "58Tt8xWVSP1vJRxeZG7By0J4DHdpZFgc", "d8fJjrUVSDGdkyzleHZclvn63G4sHX0L", "2vkexQ2kDfwHm", "C5INcofoFkRix0Rm4DG2QIlt8jox4BBj", "", "Y25u3HoHlGlpJYy8Y", "MTcvQGxX9nLrxfee4M1dH5SKsx5IsifC"};
    public final /* synthetic */ SQ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "YNZl3vrESdm0ZjqRAgqNuDMkNkDkDjcM";
            strArr[2] = "T4MR0Bp8ShJAOBNGhRUi97nIryoGWHBS";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 37);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{26, 56, 55, 126, 45, 121, 61, 48, 42, 41, 56, 45, 58, 49, 121, 58, 54, 44, 55, 45, 60, 43, 42, 119, 77, 96, 122, 121, 104, 125, 106, 97, 108, 109, 41, 106, 102, 124, 103, 125, 108, 123, 122, 39, 41, 91, 108, 122, 121, 102, 103, 122, 108, 51, 41};
    }

    static {
        A01();
    }

    public V7(SQ sq2) {
        this.A00 = sq2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2017ee
    public final void ACo(InterfaceC2015ec interfaceC2015ec) {
        if (this.A00.A05().AAF() && interfaceC2015ec != null) {
            String str = A00(24, 31, 44) + interfaceC2015ec.A6v();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2017ee
    public final void ADC(Exception exc) {
        if (this.A00.A05().AAF()) {
            Log.e(C1583Ud.A01, A00(0, 24, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), exc);
        }
    }
}
