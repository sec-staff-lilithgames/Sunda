package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1274Ib implements InterfaceC1839bk {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ C5K A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1274Ib(C5K c5k) {
        this.A00 = c5k;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1839bk
    public final void AFh(String str, JSONObject jSONObject) {
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AJS();
            if (U7.A1u(this.A00.A07)) {
                this.A00.A07.A0B().ACx();
            }
        }
        C1848bt c1848bt = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c1848bt.A0h(str, jSONObject);
    }
}
