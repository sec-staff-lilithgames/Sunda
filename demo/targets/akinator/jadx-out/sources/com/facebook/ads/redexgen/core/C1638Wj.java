package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1638Wj {
    public static byte[] A00;
    public static String[] A01 = {"5C7rQEQBWVsJnjqAAZN8QBBHoCwRHOvI", "Z88WY3x8uhcakMWroAcOyZwbMrMcyrD2", "GaS", "RG8mqKBY9oxpM4ff8ZCXkeRJBSL2fzwW", "fRGWN", "iBM9tWQPO6zus77B3DN", "tCaEdKrWlrqf6UeRmfN", "xklax2dJWvUCBWRx1N6eQvQBJ1IZxl6t"};
    public static final String A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-73, -5, 1, -5, -4, -19, -11, -73, -23, -8, -8, -73, -37, -3, -8, -19, -6, -3, -5, -19, -6, -74, -23, -8, -13, -99, -121, -1, -16, 3, -9, 13, 2, -5, -21, -77, -119, -112, -117, -108, 1, -1, 8, -1, 12, 3, -3, -1, 1, 42, 27, 41, 42, -29, 33, 27, 47, 41};
    }

    static {
        A05();
        A02 = C1638Wj.class.getSimpleName();
    }

    public static EnumC1637Wi A00(SQ sq2) {
        try {
            boolean isRooted = A07() || A06() || A08(A01(47, 2, 78));
            return isRooted ? EnumC1637Wi.A03 : EnumC1637Wi.A05;
        } catch (Throwable t10) {
            sq2.A08().AAy(A01(40, 7, 92), AbstractC1550Sv.A1M, new C1551Sw(t10));
            return EnumC1637Wi.A04;
        }
    }

    public static String A02(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb2 = new StringBuilder();
        PackageManager pm2 = context.getPackageManager();
        if (pm2 == null) {
            return A01(0, 0, 69);
        }
        Signature[] signatureArr = pm2.getPackageInfo(str, 64).signatures;
        if (A01[7].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "ikpGaBwLfx1blWCv8PE";
        strArr[5] = "NCTJdZrpEYM5ZpFC5qB";
        for (Signature signature : signatureArr) {
            sb2.append(C1643Wo.A04(MessageDigest.getInstance(A01(31, 4, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)).digest(A04(signature).getEncoded())));
            sb2.append(A01(26, 1, 14));
        }
        return sb2.toString();
    }

    public static String A03(SQ sq2, String str) {
        try {
            return A02(sq2, str);
        } catch (Exception e10) {
            sq2.A08().AAy(A01(40, 7, 92), AbstractC1550Sv.A1M, new C1551Sw(e10));
            return null;
        }
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(35, 5, 29)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        String str = Build.TAGS;
        if (str != null) {
            String buildTags = A01(49, 9, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            if (str.contains(buildTags)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 74));
        return superUserApk.exists();
    }

    public static boolean A08(String str) {
        for (String str2 : System.getenv(A01(27, 4, 113)).split(A01(25, 1, 37))) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                String[] strArr = A01;
                if (strArr[1].charAt(17) != strArr[3].charAt(17)) {
                    String[] strArr2 = A01;
                    strArr2[6] = "JMsPqsjcaxLCD34xTC2";
                    strArr2[5] = "FbRxT8DL2tHORlKIcuM";
                    if (fileArrListFiles == null) {
                        continue;
                    } else {
                        for (File file2 : fileArrListFiles) {
                            boolean zEquals = file2.getName().equals(str);
                            if (A01[7].length() != 32) {
                                throw new RuntimeException();
                            }
                            String[] strArr3 = A01;
                            strArr3[1] = "YF7GaC3noAI93Jw6Jae3mccsHUmdiEJo";
                            strArr3[3] = "xQd2jFuSOpS96vzWuZJNzWBfXSKKA4my";
                            if (zEquals) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }
}
