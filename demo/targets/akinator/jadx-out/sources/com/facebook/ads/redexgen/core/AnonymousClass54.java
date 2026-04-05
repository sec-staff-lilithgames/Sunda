package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.54, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass54 extends DV {
    public static byte[] A01;
    public final /* synthetic */ C1840bl A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public AnonymousClass54(C1840bl c1840bl) {
        this.A00 = c1840bl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1838bj(this));
        this.A00.A0B.AFh(A00(0, 5, 126), this.A00.A03());
    }
}
