package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2251ih extends AbstractRunnableC1624Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C2251ih(MW mw2, JSONObject jSONObject) {
        this.A00 = mw2;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() throws InterruptedException {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e10) {
            this.A00.A03.A08().AAy(A00(0, 17, 25), AbstractC1550Sv.A1B, new C1551Sw(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            this.A00.A03.A08().AAy(A00(0, 17, 25), AbstractC1550Sv.A1A, new C1551Sw(e11));
        }
    }
}
