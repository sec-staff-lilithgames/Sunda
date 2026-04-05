package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1198Fc extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public static String[] A02 = {"zQTxaAZtyj5Zf7xpyBa5Wo13", "ZyRPoqiC9PInhvt4VYdLIOd5Fjjwld3Q", "AJVcAlxtfo1o3uDwHkILc2qtWBcw5I", "qm4l90vWWtQXhhB5Cv7", "msnWA3qGYryppWjZvi7PZr4M3Bb415RH", "kQT0oRvSr6py", "zmROIVOKOovaIXaapuTgFe6PU", "TFR8Ke0ijybG7ZAZ7LbnVmkovmXx0N"};
    public final /* synthetic */ C09173r A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-116, -97, -102, -101, -91, 86, -92, -101, -84, -101, -88, 86, -87, -86, -105, -88, -86, -101, -102, 86, -90, -94, -105, -81, -97, -92, -99};
    }

    static {
        A01();
    }

    public C1198Fc(C09173r c09173r) {
        this.A00 = c09173r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A0F) {
            C09173r c09173r = this.A00;
            if (A02[1].charAt(3) != 'P') {
                throw new RuntimeException();
            }
            A02[3] = "tIcfuB5su4wQORzkX2J";
            c09173r.A0R(A00(0, 27, 32));
        }
    }
}
