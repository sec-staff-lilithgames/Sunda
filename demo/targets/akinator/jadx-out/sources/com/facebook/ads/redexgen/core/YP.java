package com.facebook.ads.redexgen.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YP implements InterfaceC1630Vz {
    public static byte[] A01;
    public static String[] A02 = {"cL9KuymxmXYmG8NC9NVGcaGlfdWWeniK", "Nk16ts9BY6zqy", "EgJ1qeWjq2zhUumNQfvGHLF4hTEd3z2y", "RODoYaIjQAnjV1WNThn2vejpwKsM19Cc", "40Y1apu8pWAms0kzI1QlbJay1792dWSe", "dN3sSSJjIpaTvjnI8sFpNb6rIgDjDuKA", "fmvlDKN6b1IL1", "7gRFv5vnh1tPqRcG4sTxqyzgIBUkam47"};
    public final /* synthetic */ C1911cu A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[0] = "cTAx5t1qCw5Hmq8oguM2xeNpSThd5fgi";
        A01 = new byte[]{-47, -51, -52, 0, -17, -12, -16, -7, -18, -16, -39, -16, -1, 2, -6, -3, -10, -5, 20, 11, 30, 22, 11, 9, 26, 11, 10, -58, 11, 24, 24, 21, 24, -44, -94, -79, -96, -78, -89, -98, -78, -89, -88, -92, -85, -93};
    }

    static {
        A01();
    }

    public YP(C1911cu c1911cu) {
        this.A00 = c1911cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1630Vz
    public final void AAo(int i10, Throwable th2) {
        Log.e(A00(0, 17, 81), A00(17, 17, 108), th2);
        this.A00.A08().AAy(A00(34, 12, 5), i10, new C1551Sw(th2));
    }
}
