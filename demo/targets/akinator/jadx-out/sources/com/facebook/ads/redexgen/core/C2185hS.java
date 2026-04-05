package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2185hS extends AbstractRunnableC1624Vt {
    public static byte[] A03;
    public static String[] A04 = {"7HAtzWHHqocdVWrHWLF7dHgS7Bm2h12C", "DbOr4ijtOwCAaeVmvR816jBzMEkuu4t1", "lnUtOUEm1wuvoR9nZTKEc7Wj6", "rgunTSV1g2reSAbvPi4FwUaf05Z1esdk", "lf9TdmWUJKPBCDTsH0x6g9hItkASR1Wu", "rzwaJSO2zPm7h9LPx5qAuh7aJhmBGJeQ", "21sK4Gi1tfVdwS7GyFfEScwosNwGd1WZ", "FSSaRzfmWACYGxNNk9yD6VAWr"};
    public MP A00;
    public String A01;
    public final /* synthetic */ AnonymousClass72 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-64, -29, -32, -17, -13, -28, -15, -97, -13, -24, -20, -28, -18, -12, -13, -83};
        String[] strArr = A04;
        if (strArr[6].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[5] = "osBBqT7uNXEQnnthAEoQEGxFzU3x5jcE";
        strArr2[0] = "83ZlJzScQovvXu1byfPC9cIolLTrcwle";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C2185hS(AnonymousClass72 anonymousClass72, MP mp2, String str) {
        this.A02 = anonymousClass72;
        this.A00 = mp2;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A02.A0V(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.ADB(new V1(AdErrorType.NETWORK_ERROR, A00(0, 16, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)));
    }
}
