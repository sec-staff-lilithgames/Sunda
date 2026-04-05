package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.iD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2223iD extends MR {
    public static byte[] A02;

    @Nullable
    public final C2221iB A00;
    public final US A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C2223iD(C1937dL c1937dL, MS ms, C2010eX c2010eX, US us, C2221iB c2221iB) {
        super(c1937dL, ms, c2010eX);
        this.A01 = us;
        this.A00 = c2221iB;
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A02.A0F().A3D();
            AbstractC1424Nw.A02(this.A00.A0X(), X0.A00(A01(0, 6, 62)));
            this.A01.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                W2 w2A00 = W2.A00(this.A02);
                String placementType = this.A00.A7G();
                w2A00.A0E(string, placementType);
            }
        }
    }
}
