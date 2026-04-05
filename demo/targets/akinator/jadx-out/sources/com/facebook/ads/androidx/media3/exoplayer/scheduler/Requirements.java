package com.facebook.ads.androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C1106Bm;
import com.facebook.ads.redexgen.core.C3M;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Requirements implements Parcelable {
    public static byte[] A01;
    public static String[] A02 = {"uwN5TqWruOwNeCy1aiqDeLgzeCho9gnR", "uTqO4HZ69OtT2", "pp7wWJEgHEGU283E", "XPZfXvI81RbECUtIqAEftJ2yNIIbXze1", "5SwimXMBGWXyWjNLtwjqMnX", "7CGYXLa6aYpujc5oADJ5LB3FbDI8uqBi", "FEMkx52dE2zGpzw1", "Fv9wompXFxfx6YB8Vj7MYx3uqzKPyKZl"};
    public static final Parcelable.Creator<Requirements> CREATOR;
    public final int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{36, 49, 39, 53, 50, 44, 39, -15, 44, 49, 55, 40, 49, 55, -15, 36, 38, 55, 44, 50, 49, -15, 5, 4, 23, 23, 8, 21, 28, 34, 6, 11, 4, 17, 10, 8, 7, -13, 0, -10, 4, 1, -5, -10, -64, -5, 0, 6, -9, 0, 6, -64, -13, -11, 6, -5, 1, 0, -64, -42, -41, -24, -37, -43, -41, -15, -27, -26, -31, -28, -45, -39, -41, -15, -34, -31, -23, -25, -13, -14, -14, -23, -25, -8, -19, -6, -19, -8, -3, -9, -10, -2, -20, -7, 3, 4, -15, 4, 5, 3};
    }

    static {
        A02();
        CREATOR = new C1106Bm();
    }

    public Requirements(int i10) {
        this.A00 = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    private int A00(Context context) {
        if (!A0A()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C3M.A01(context.getSystemService(A01(77, 12, 28)));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            boolean zA06 = A06(connectivityManager);
            String[] strArr = A02;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[5] = "RKqvXcDMvtoTOxGBV3lSSEVfZ64ZYoxU";
            if (zA06) {
                if (A0C()) {
                    boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    if (A02[3].charAt(16) != 'q') {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[1] = "RJMLW2AndFlsS";
                    strArr2[4] = "adHoYRSEIssUTsmuQLV0TXA";
                    if (zIsActiveNetworkMetered) {
                        if (A02[0].charAt(4) != 'h') {
                            String[] strArr3 = A02;
                            strArr3[1] = "EctWe7FhnH81C";
                            strArr3[4] = "lAwOl2qOFCjLVAIEQ1yyJzT";
                            return 2;
                        }
                        String[] strArr4 = A02;
                        strArr4[1] = "YeFdaHJUx43hD";
                        strArr4[4] = "U4BsCHt3kJE5KJEOEKp0bYO";
                        return 2;
                    }
                }
                return 0;
            }
        }
        return this.A00 & 3;
    }

    private boolean A03(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(A01(0, 37, 91)));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra(A01(94, 6, 40), -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A04(android.content.Context r5) {
        /*
            r4 = this;
            r2 = 89
            r1 = 5
            r0 = 31
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.Object r0 = r5.getSystemService(r0)
            java.lang.Object r2 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r0 = 23
            if (r1 < r0) goto L1e
            boolean r0 = r2.isDeviceIdleMode()
        L1d:
            return r0
        L1e:
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r0 = 20
            if (r1 < r0) goto L2c
            boolean r0 = r2.isInteractive()
            if (r0 != 0) goto L4f
        L2a:
            r0 = 1
            goto L1d
        L2c:
            boolean r3 = r2.isScreenOn()
            java.lang.String[] r1 = com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements.A02
            r0 = 7
            r1 = r1[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            r0 = 56
            if (r1 == r0) goto L45
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L45:
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements.A02
            java.lang.String r1 = "0vwiCxXTqkOZryo8en8HAet2lmwum6iC"
            r0 = 7
            r2[r0] = r1
            if (r3 != 0) goto L4f
            goto L2a
        L4f:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements.A04(android.content.Context):boolean");
    }

    private boolean A05(Context context) {
        return context.registerReceiver(null, new IntentFilter(A01(37, 40, 42))) == null;
    }

    public static boolean A06(ConnectivityManager connectivityManager) {
        if (AbstractC09264a.A02 < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public final int A07(Context context) {
        int iA00 = A00(context);
        if (A08() && !A03(context)) {
            iA00 |= 8;
        }
        if (A09() && !A04(context)) {
            iA00 |= 4;
        }
        if (A0B() && !A05(context)) {
            return iA00 | 16;
        }
        return iA00;
    }

    public final boolean A08() {
        return (this.A00 & 8) != 0;
    }

    public final boolean A09() {
        return (this.A00 & 4) != 0;
    }

    public final boolean A0A() {
        return (this.A00 & 1) != 0;
    }

    public final boolean A0B() {
        return (this.A00 & 16) != 0;
    }

    public final boolean A0C() {
        return (this.A00 & 2) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((Requirements) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00);
    }
}
