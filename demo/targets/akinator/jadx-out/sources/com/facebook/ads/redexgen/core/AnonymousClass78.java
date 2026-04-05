package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.78, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass78 extends AbstractC2212hy {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Utf8.REPLACEMENT_BYTE, 60, 51, 51, 56, 47};
    }

    public AnonymousClass78(List<C1391Mp> list) {
        super(list);
    }

    public static AnonymousClass78 A00(JSONObject jSONObject, C1937dL c1937dL) {
        AnonymousClass78 anonymousClass78 = new AnonymousClass78(AbstractC2212hy.A08(jSONObject, c1937dL, new C2211hx()));
        anonymousClass78.A29(jSONObject);
        anonymousClass78.A1I(A01(0, 6, 6));
        return anonymousClass78;
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
