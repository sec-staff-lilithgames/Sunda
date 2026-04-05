package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class MH {
    public static byte[] A04;
    public MF A00;
    public final C1937dL A01;
    public final US A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract ME A0G(String str);

    public MH(C1937dL c1937dL, US us, String str) {
        this.A01 = c1937dL;
        this.A02 = us;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }

    public static String A0C(MH mh2) {
        if (mh2 instanceof C7O) {
            return A0B(6, 10, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return A0B(0, 6, 79);
    }

    public final MF A0E() {
        return this.A00;
    }

    public final void A0F(MF mf2) {
        this.A00 = mf2;
    }
}
