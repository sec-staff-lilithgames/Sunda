package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ie, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2250ie extends AbstractRunnableC1624Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C2250ie(MW mw2, String str) {
        this.A00 = mw2;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() throws InterruptedException {
        String strA00 = A00(0, 17, 81);
        try {
            this.A00.A06.await();
            if (this.A00.A0J(this.A01)) {
                ((N2) this.A00.A02.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                this.A00.A02.A07(this.A01);
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            this.A00.A03.A08().AAy(strA00, AbstractC1550Sv.A1B, new C1551Sw(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            this.A00.A03.A08().AAy(strA00, AbstractC1550Sv.A1A, new C1551Sw(e11));
        }
    }
}
