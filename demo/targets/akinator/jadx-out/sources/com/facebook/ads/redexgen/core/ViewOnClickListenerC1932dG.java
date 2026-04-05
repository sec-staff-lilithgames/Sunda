package com.facebook.ads.redexgen.core;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1932dG implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"6oymiTsLeOB6akVZhYZlzt9u0lzod266", "zcFrhgW", "pA0IIkGKiekAr0fjB", "y6hjg8mxqAalWUMcxQuHYQOItnPT39hG", "7U0TsM6", "Tg7m67O8vHVp5z623KOmUlfZNUrkO0e2", "eZwTRoaquQnWH3ejc5rSlBlQZkiVI59b", "AT7ca5j6uH8ZMFY8gdhWcohA"};
    public final /* synthetic */ C1175Ef A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "b4q8hXeVYJWgCCKNMDRDzuby";
            strArr2[1] = "dEe326h";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 31, 21, 20, 18, 35, 21, 36};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1932dG(C1175Ef c1175Ef) {
        this.A00 = c1175Ef;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07 != null) {
                this.A00.A07.A0E(A00(0, 8, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[6] = "NoOvb1ER3rIaV6vkspGGWoVzXAP3qQ3Z";
        }
    }
}
