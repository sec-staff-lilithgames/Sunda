package com.facebook.ads.redexgen.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HL extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public static String[] A02 = {"mPUp", "QaVG6HdjpkfaxAZj0g", InneractiveMediationDefs.GENDER_FEMALE, "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ C09394n A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -4, -9, -8, 2, -77, 10, -12, 6, -77, 1, -8, 9, -8, 5, -77, 3, 5, -8, 3, -12, 5, -8, -9};
    }

    static {
        A01();
    }

    public HL(C09394n c09394n) {
        this.A00 = c09394n;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A09) {
            InterfaceC1884cT interfaceC1884cT = this.A00.A0M;
            String strA00 = A00(0, 24, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            String[] strArr = A02;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A02[4] = "FD94r7znH9q7i6TKT20diutq98ZfYVDf";
            interfaceC1884cT.AFg(strA00);
        }
    }
}
