package com.facebook.ads.redexgen.core;

import android.content.pm.PackageManager;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1357Lg implements InterfaceC1633Wc {
    public static byte[] A01;
    public final /* synthetic */ C1353Lc A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C1357Lg(C1353Lc c1353Lc) {
        this.A00 = c1353Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() throws PackageManager.NameNotFoundException, RemoteException {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0U(false, A00(0, 9, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
    }
}
