package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YS implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"Rngvbb3vMR3b56rBexb50Rjom5JamLMR", "BOyMrOLOVyOlAA7tdLfD", "PSvH7Ca0GqwbJXrw1OxZU20X4aHcam0S", "dzm7VVMnrqblx5opBv2tkfICkL24O513", "rKXY71", "THxRt8Yss0BlXBXFFRIVlNUaizFLAmop", "EnNQl89tpWVbcex4LtQ2YfadlOVOSM9k", "1aWdi1c8aZwiTk2zvtk8Xc2vTbtrER0G"};
    public final /* synthetic */ LZ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{0, 21, 2, 22, 31, 2, 29, 51, 4, 17, 51, 28, 25, 19, 27};
    }

    static {
        A01();
    }

    public YS(LZ lz) {
        this.A00 = lz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A06.A4b(A00(0, 15, 86));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A02;
            if (strArr[7].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "qnEa0qqxoU4sFli1HS9Y3SbmuU3eBkbM";
            strArr2[0] = "NnijgEsxsjK8xKe1vFUOE7dsdCVZHTLh";
        }
    }
}
