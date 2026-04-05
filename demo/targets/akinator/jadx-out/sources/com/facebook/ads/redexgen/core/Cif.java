package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class Cif extends AbstractRunnableC1624Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public Cif(MW mw2, String str) {
        this.A00 = mw2;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() throws InterruptedException {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                Iterator<String> itKeys = this.A00.A02.A05().keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.A0J(this.A01)) {
                        this.A00.A0E((N2) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                    }
                }
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            InterfaceC1549Su interfaceC1549SuA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC1549SuA08.AAy(encryptedId, AbstractC1550Sv.A1B, new C1551Sw(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            InterfaceC1549Su interfaceC1549SuA082 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC1549SuA082.AAy(encryptedId2, AbstractC1550Sv.A1A, new C1551Sw(e11));
        }
    }
}
