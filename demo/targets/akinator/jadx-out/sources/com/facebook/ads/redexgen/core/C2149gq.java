package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.gq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2149gq implements TL {
    public static byte[] A03;
    public final Bundle A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{83, 94, 94, 93, 78, 84, 73, 65, 93, 88, 82, 88, 69, 78, 69, 84, 66, 69, 78, 92, 94, 85, 84, 78, 90, 84, 72, 67, 78, 78, 77, 94, 72, 82, 94, 84, 79, 72, 85, 88, 12, 1, 1, 2, 17, 3, 7, 22, 11, 10, 17, 15, 27, 10, 7, 11, 0, 13, 11, 17, 5, 11, 23, 32, 37, 48, 37, 59, 52, 54, 43, 39, 33, 55, 55, 45, 42, 35, 59, 43, 52, 48, 45, 43, 42, 55, 59, 39, 43, 49, 42, 48, 54, 61, 59, 47, 33, 61, 54, 51, 38, 51, 45, 34, 32, 61, 49, 55, 33, 33, 59, 60, 53, 45, 61, 34, 38, 59, 61, 60, 33, 45, 57, 55, 43, 7, 2, 23, 2, 28, 19, 17, 12, 0, 6, 16, 16, 10, 13, 4, 28, 12, 19, 23, 10, 12, 13, 16, 28, 16, 23, 2, 23, 6, 28, 8, 6, 26, 94, 89, 95, 82, 76, 73, 82, 89, 72, 94, 89, 82, 89, 84, 93, 72, 82, 70, 72, 84, 84, 83, 85, 88, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 88, 76, 66, 94};
    }

    public C2149gq(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A71() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A7F() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final C1533Se A7e(SQ sq2) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        Integer numValueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new C1533Se(stringArray, numValueOf, country);
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A8O() {
        return this.A00.getString(A00(178, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A98() {
        String string = this.A00.getString(A00(158, 20, 6));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean AAR() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean AAX() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final Boolean AAb() {
        Set<String> setKeySet = this.A00.keySet();
        String strA00 = A00(27, 13, 10);
        if (setKeySet.contains(strA00)) {
            return Boolean.valueOf(this.A00.getBoolean(strA00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || AdSettings.isTestMode(context);
    }
}
