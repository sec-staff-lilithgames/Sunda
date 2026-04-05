package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends AbstractC2212hy implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A02();
    }

    public AnonymousClass77(List<C1391Mp> list) {
        super(list);
    }

    public static AnonymousClass77 A00(JSONObject jSONObject, C1937dL c1937dL) {
        AnonymousClass77 anonymousClass77 = new AnonymousClass77(AbstractC2212hy.A08(jSONObject, c1937dL, new C2205hp()));
        anonymousClass77.A29(jSONObject);
        anonymousClass77.A1I(A01(0, 12, 9));
        return anonymousClass77;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1390Mo
    public final int A0l() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1390Mo
    public final int A0m() {
        return 0;
    }
}
