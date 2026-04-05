package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class W4 {
    public static byte[] A05;
    public static final Object A06;
    public static final Map<String, String> A07;
    public static final AtomicBoolean A08;
    public final SharedPreferences A00;
    public final SQ A01;
    public final T6 A02;
    public final String A03;
    public final String A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-100, -19, -14, -4, -25, -89, -45, -35, -32, -45, -29, 35, 47, 45, -18, 33, 46, 36, 50, 47, 41, 36, -18, 54, 37, 46, 36, 41, 46, 39, -21, -5, -23, -8, -15, 10, 26, 19, 14, 10, -18, -20, -11, -20, -7, -16, -22};
    }

    static {
        A04();
        A07 = new HashMap();
        A06 = new Object();
        A08 = new AtomicBoolean();
    }

    public W4(SQ sq2, String str) {
        this.A01 = sq2;
        this.A03 = str;
        this.A02 = new T6(this.A01, str);
        this.A00 = AbstractC1609Ve.A00(this.A01);
        this.A04 = A01(1, 4, 93) + str + A01(0, 1, 18) + this.A02.A06();
    }

    private final String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static String A02(SQ sq2, String str) {
        try {
            PackageManager packageManager = sq2.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C1643Wo.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e10) {
            if (A08.compareAndSet(false, true)) {
                sq2.A08().AAy(A01(40, 7, 56), AbstractC1550Sv.A1P, new C1551Sw(e10));
            }
            return null;
        }
    }

    public static String A03(String str) {
        String str2;
        synchronized (A06) {
            str2 = A07.get(str);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() throws org.json.JSONException {
        /*
            r7 = this;
            r4 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 >= r0) goto L16
            r2 = 5
            r1 = 1
            r0 = 5
            java.lang.String r1 = A01(r2, r1, r0)
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
        L16:
            com.facebook.ads.redexgen.X.SQ r0 = r7.A01
            boolean r0 = com.facebook.ads.redexgen.core.U7.A2g(r0)
            if (r0 == 0) goto L3c
            r2 = 11
            r1 = 19
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r1 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.X.T6 r0 = r7.A02
            java.lang.String r0 = r0.A0B()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            com.facebook.ads.redexgen.X.SQ r1 = r7.A01
            java.lang.String r0 = r7.A03
            java.lang.String r4 = com.facebook.ads.redexgen.core.C1643Wo.A01(r1, r0)
        L3c:
            if (r4 != 0) goto L4a
            com.facebook.ads.redexgen.X.SQ r1 = r7.A01
            java.lang.String r0 = r7.A03
            java.lang.String r4 = A02(r1, r0)
        L46:
            java.lang.Object r2 = com.facebook.ads.redexgen.core.W4.A06
            monitor-enter(r2)
            goto La7
        L4a:
            com.facebook.ads.redexgen.X.SQ r0 = r7.A01
            boolean r0 = com.facebook.ads.redexgen.core.U7.A1f(r0)
            if (r0 == 0) goto L46
            com.facebook.ads.redexgen.X.SQ r1 = r7.A01
            java.lang.String r0 = r7.A03
            java.lang.String r6 = A02(r1, r0)
            r2 = 6
            r1 = 5
            r0 = 33
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.X.Sw r5 = new com.facebook.ads.redexgen.X.Sw
            r5.<init>(r0)
            r0 = 1
            r5.A05(r0)
            r5.A06(r0)
            r0 = 0
            r5.A0A(r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r2 = 30
            r1 = 5
            r0 = 57
            java.lang.String r0 = A01(r2, r1, r0)
            r3.put(r0, r4)
            r2 = 35
            r1 = 5
            r0 = 88
            java.lang.String r0 = A01(r2, r1, r0)
            r3.put(r0, r6)
            r5.A07(r3)
            com.facebook.ads.redexgen.X.SQ r0 = r7.A01
            com.facebook.ads.redexgen.X.Su r3 = r0.A08()
            r2 = 40
            r1 = 7
            r0 = 56
            java.lang.String r1 = A01(r2, r1, r0)
            int r0 = com.facebook.ads.redexgen.core.AbstractC1550Sv.A1I
            r3.AAz(r1, r0, r5)
            goto L46
        La7:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.facebook.ads.redexgen.core.W4.A07     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r7.A03     // Catch: java.lang.Throwable -> Lbf
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbf
            android.content.SharedPreferences r0 = r7.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r7.A04
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)
            r0.apply()
            return
        Lbf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.W4.A05():void");
    }

    public final void A06() {
        String strA00 = A00();
        synchronized (A06) {
            Map<String, String> map = A07;
            String storedFingerprint = this.A03;
            map.put(storedFingerprint, strA00);
        }
    }
}
