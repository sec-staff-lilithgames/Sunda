package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3E extends DP {
    public static byte[] A01;
    public final /* synthetic */ C3D A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C3E(C3D c3d) {
        this.A00 = c3d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(DQ dq2) {
        if (this.A00.A00 == null || this.A00.A00.get() == null) {
            this.A00.A00 = new WeakReference(new Cdo(this));
        }
        ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) this.A00.A00.get(), 3, 1);
    }
}
