package com.facebook.ads.redexgen.core;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WR {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-92, -90, -103, -102, -77, -94, -87, -95, -77, -107, -104, -89, -77, -94, -93, -77, -105, -100, -107, -99, -94, -115, -117, -99, -115, -117, -114, -113, -114, -119, -117, -114, -68, -49, -53, -55, -72, -74, -69, -72, -53, -72, -15, -14, -9, -3, -4, -60, -59, -60, -71, -66, -73, -65, -60, -69, -70, -75, -73, -70, -55, -8, -6};
    }

    public static int A00(C1937dL c1937dL, int i10) {
        return AbstractC1609Ve.A00(c1937dL).getInt(A01(0, 21, 52), i10);
    }

    public static String A02(C1937dL c1937dL, String str) {
        int iA00 = A00(c1937dL, -1);
        if (iA00 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 54), Integer.valueOf(iA00))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String strA01 = A01(61, 2, 93);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String extraData = A01(42, 5, 105);
            JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            String extraData2 = A01(32, 10, 55);
            strA01 = jSONObject2.optString(extraData2, strA01);
        }
        JSONObject jSONObject3 = new JSONObject(strA01);
        jSONObject3.put(str2, obj);
        String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), A01(61, 2, 93))).optBoolean(A01(21, 11, 10), false);
    }

    public final InterstitialAd A06(C1937dL c1937dL, String str, String str2) {
        if (c1937dL == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1937dL, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C1937dL c1937dL, String str, String str2) {
        if (c1937dL == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c1937dL, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C1937dL c1937dL, boolean z10) {
        int i10 = 0;
        String strA01 = A01(0, 21, 52);
        if (!z10) {
            int lastNonChainedAds = AbstractC1609Ve.A00(c1937dL).getInt(strA01, 0);
            i10 = lastNonChainedAds + 1;
        }
        AbstractC1609Ve.A00(c1937dL).edit().putInt(strA01, i10).apply();
    }

    public final boolean A09(C1937dL c1937dL, String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c1937dL, i10 - 1);
                return lastNonChainedAds >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
