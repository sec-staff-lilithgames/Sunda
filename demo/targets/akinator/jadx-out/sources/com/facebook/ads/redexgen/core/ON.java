package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ON {
    public static byte[] A04;
    public static String[] A05 = {"GkkO", "YJmuGc85y4OuUVwghPHMw6H0hrXdCbsK", "rRyyH1Ry9JSt7GwazL3CF5Rf19vLBzF0", "Kr8SfiAbBQlS981voHWRhKuNeYVS", "2bjqqKstFSNs", "YCJEv0AAmy9EO19MFuS1eY2psLita0He", "8nMnppK8MJ669xw0eU6fQM63oOjVziX6", "UtNvkE6PgDf4Bgx19r2HgtE5txVeLiPN"};
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[1].charAt(0) != strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            A05[2] = "RuLyFqXzbhnlmQeuw5cGDVAvivNnSqaB";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {73, 45, 44, 40, 45, 15, 73, 70, 67, 91, 74, 93, 18, 84, 99, 101, 99, 111, 112, 99, 116, 125, 108};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A05[6] = "goVzQt2K0L2BtiDyFGHqLLcsDevd1QlQ";
        A04 = bArr;
    }

    static {
        A01();
    }

    public ON(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(A00(13, 9, 89));
        sb2.append(this.A02);
        sb2.append(A00(5, 8, 112));
        sb2.append(this.A03);
        if (this.A01) {
            sb2.append(A00(0, 5, 54));
        }
        sb2.append(A00(22, 1, 78));
        return sb2.toString();
    }
}
