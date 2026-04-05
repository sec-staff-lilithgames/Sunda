package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1865cA implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"aSVeS7GSTPGzGlwxFERzGOUaCHJkzI2z", "LLGylRAhThVIhIHAbih9tPBDCPjYJ3wk", "dAcv7uC7M3KkKHminzJu7oFLvmyzwOeo", "9GvayoE6VvkK0xgQDuyzQgqlx5rjdrnu", "wDDK", "nNoIeo5hKMcMuIwTTSmTqlLWYr2HGCGs", "Kjjrp4DquliSLC6MHV0dGTx7o2b6nbq3", "WO7dkLjdWbLrsRFVrNnfWInSuw6lOMDM"};
    public final /* synthetic */ C4Z A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(19) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "ZS6NMOZ5iivoiIhrEAHYVVuLQariJbL8";
            strArr[5] = "6wgrAttfPWhTSI4WoHgDbqlH426fwJ7f";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {-54, -59, -59, -62, -72, -73, -56};
        if (A02[0].charAt(19) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "vsVzmfSe1AoNrvloOTDnivjLsCV7rctR";
        strArr[7] = "zSqcVhdNlZdzdn2RltwvtxLuLIPpuSoH";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1865cA(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0H.A02(A00(0, 7, 16));
                this.A00.A0Z.ABr();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
