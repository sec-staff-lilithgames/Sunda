package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network.dex */
public final class TT {
    public static String A00;
    public static EnumC1637Wi A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
            i13++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized EnumC1637Wi A00(SQ sq2) {
        if (A01 == null) {
            A01 = C1638Wj.A00(sq2);
        }
        return A01;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(SQ sq2, String str, Map<String, String> params) {
        String strA03;
        if (A0A(sq2)) {
            strA03 = W4.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(SQ sq2, boolean z10) throws ExecutionException, InterruptedException {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(sq2);
        try {
            SharedPreferences sharedPreferencesA00 = AbstractC1609Ve.A00(sq2);
            T6 t62 = new T6(sq2);
            String str = Build.FINGERPRINT + A02(0, 1, 19) + t62.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new TS(sq2, t62, sharedPreferencesA00, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(SQ sq2, boolean z10, String str) throws ExecutionException, InterruptedException {
        if (A0A(sq2)) {
            A09(sq2, z10, str);
        } else {
            A07(sq2, z10);
        }
    }

    public static void A09(SQ sq2, boolean z10, String str) throws ExecutionException, InterruptedException {
        if (str == null) {
            str = sq2.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(sq2);
        W4 w42 = new W4(sq2, str);
        try {
            w42.A06();
            FutureTask futureTask = new FutureTask(new TR(w42, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(SQ sq2) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean zA2l = U7.A2l(sq2);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!zA2l) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
