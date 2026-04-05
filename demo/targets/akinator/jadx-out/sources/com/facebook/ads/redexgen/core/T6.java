package com.facebook.ads.redexgen.core;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class T6 {
    public static byte[] A02;
    public static String[] A03 = {"ksHi49HeyLxhEuEQ3ZpH94jUoJqLqgaO", "OjCJx3NFQ0DFgiyf16DgggNozGEs4R4q", "GEO9tIl26J6KBxgfZlF82GfP7HtNAY9Z", "nOASZQwcdTvox6Zrqcm6Ob1f72Bs0sPe", "97ugpJwHRGNEpoGk3FmXenG", "0hX3UIoeWP89IzRfugcPHePTUXouBxgf", "dDjk4aEiSkmoIE6VCcWXk7EEukMkdVWT", "2G0bY4RpV1kXQIyv7KcyHSXfT8fWnCKY"};
    public static final String A04;
    public final SQ A00;
    public final String A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-57, -44, -54, -40, -43, -49, -54, -108, -42, -53, -40, -45, -49, -39, -39, -49, -43, -44, -108, -88, -81, -76, -86, -59, -89, -87, -87, -85, -71, -71, -81, -88, -81, -78, -81, -70, -65, -59, -71, -85, -72, -68, -81, -87, -85, -103, -105, -96, -105, -92, -101, -107, -65, -73, -66, -67, -76};
    }

    static {
        A02();
        A04 = Build.VERSION.RELEASE;
    }

    public T6(SQ sq2) {
        this(sq2, null);
    }

    public T6(SQ sq2, String str) {
        this.A00 = sq2;
        this.A01 = str;
    }

    private String A00() {
        int i10;
        if (this.A01 != null) {
            return this.A01;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 67108864;
        } else {
            i10 = 0;
        }
        PendingIntent activity = PendingIntent.getActivity(this.A00, 0, new Intent(), i10);
        if (activity == null) {
            return A01(0, 0, 54);
        }
        return activity.getCreatorPackage();
    }

    public final int A03() {
        return WZ.A01(this.A00);
    }

    public final int A04() {
        try {
            return this.A00.getPackageManager().getPackageInfo(A00(), 0).versionCode;
        } catch (Throwable t10) {
            this.A00.A08().AAy(A01(45, 7, 31), AbstractC1550Sv.A1M, new C1551Sw(t10));
            return 0;
        }
    }

    public final String A05() {
        try {
            CharSequence appLabel = this.A00.getPackageManager().getApplicationLabel(this.A00.getPackageManager().getApplicationInfo(A00(), 0));
            if (appLabel != null && appLabel.length() > 0) {
                return appLabel.toString();
            }
        } catch (Throwable th2) {
            this.A00.A08().AAy(A01(45, 7, 31), AbstractC1550Sv.A1M, new C1551Sw(th2));
        }
        return A01(0, 0, 54);
    }

    public final String A06() {
        String str = null;
        try {
            str = this.A00.getPackageManager().getPackageInfo(A00(), 0).versionName;
        } catch (Throwable t10) {
            InterfaceC1549Su interfaceC1549SuA08 = this.A00.A08();
            int i10 = AbstractC1550Sv.A1M;
            C1551Sw c1551Sw = new C1551Sw(t10);
            String appVersionName = A01(45, 7, 31);
            interfaceC1549SuA08.ABR(appVersionName, i10, c1551Sw);
        }
        return !TextUtils.isEmpty(str) ? str : A01(0, 0, 54);
    }

    public final String A07() {
        String bundleOverride = this.A00.A05().A71();
        if (bundleOverride != null) {
            return bundleOverride;
        }
        return A00();
    }

    public final String A08() {
        TelephonyManager telephonyManager = (TelephonyManager) this.A00.getSystemService(A01(52, 5, 60));
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (A03[2].charAt(10) != '6') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Y0rO6junFBlFHafjvJcSeB7fUCyZ4Mo6";
            strArr[7] = "E4dacaRM3DS0bJ8W8Pcl72SYoh6IL0u8";
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return A01(0, 0, 54);
    }

    public final String A09() {
        if (Build.MANUFACTURER != null) {
            String str = Build.MANUFACTURER;
            String[] strArr = A03;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "17co7YvrhvaQQJ3lRMCxQ7nYKJi0wzqK";
            strArr2[0] = "xVh8HKEIQLp4oZwybdpyhu7U8ElYQBbb";
            if (str.length() > 0) {
                return Build.MANUFACTURER;
            }
        }
        return A01(0, 0, 54);
    }

    public final String A0A() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? A01(0, 0, 54) : Build.MODEL;
    }

    public final String A0B() {
        String installer_name;
        try {
            String strA00 = A00();
            if (strA00 != null && strA00.length() >= 0 && (installer_name = this.A00.getPackageManager().getInstallerPackageName(strA00)) != null) {
                if (installer_name.length() > 0) {
                    return installer_name;
                }
            }
        } catch (Throwable th2) {
            this.A00.A08().ABR(A01(45, 7, 31), AbstractC1550Sv.A1M, new C1551Sw(th2));
        }
        return A01(0, 0, 54);
    }

    public final boolean A0C() {
        return this.A00.checkCallingOrSelfPermission(A01(0, 45, 83)) == 0;
    }
}
