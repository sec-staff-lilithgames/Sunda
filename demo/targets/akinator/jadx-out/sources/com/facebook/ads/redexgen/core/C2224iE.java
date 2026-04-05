package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2224iE extends MR {
    public static byte[] A06;
    public static final String A07;
    public C2226iG A00;
    public V4 A01;
    public boolean A02;
    public final C1937dL A03;
    public final US A04;
    public final AbstractC1711Ze A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2224iE.class.getSimpleName();
    }

    public C2224iE(C1937dL c1937dL, US us, AbstractC1711Ze abstractC1711Ze, C2010eX c2010eX, MS ms, V4 v42) {
        super(c1937dL, ms, c2010eX);
        this.A04 = us;
        this.A05 = abstractC1711Ze;
        this.A03 = c1937dL;
        this.A01 = v42;
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A03.A0F().A3D();
            AbstractC1424Nw.A02(this.A00.A05(), X0.A00(A04(0, 6, 50)));
            this.A04.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A03)) {
                if (this.A01 == V4.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                W2 w2A00 = W2.A00(this.A03);
                String placementType = this.A00.A7G();
                w2A00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                XJ.A00(new C2225iF(this));
            }
        }
    }

    public final void A0A(C2226iG c2226iG) {
        this.A00 = c2226iG;
    }
}
