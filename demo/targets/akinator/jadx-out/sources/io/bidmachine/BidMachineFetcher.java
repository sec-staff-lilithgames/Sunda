package io.bidmachine;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class BidMachineFetcher {
    public static final String AD_TYPE_DISPLAY = "display";
    public static final String AD_TYPE_NATIVE = "native";
    public static final String AD_TYPE_VIDEO = "video";
    public static final String KEY_AD_TYPE = "bm_ad_type";
    public static final String KEY_ID = "bm_id";
    public static final String KEY_NETWORK_KEY = "bm_network_key";
    public static final String KEY_PRICE = "bm_pf";
    private static final String TAG = "BidMachineFetcher";
    private static final BigDecimal PRICE_ROUNDING = new BigDecimal("0.01");
    private static final RoundingMode PRICE_ROUNDING_MODE = RoundingMode.CEILING;
    static EnumMap<AdsType, Map<String, AdRequest>> cachedRequests = new EnumMap<>(AdsType.class);

    public static Map<String, String> fetch(AdRequest adRequest) {
        nm.a.d(TAG, new g1(adRequest, 0));
        Map<String, String> map = toMap(adRequest);
        String str = map.get(KEY_ID);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AdsType adsType = adRequest.getAdsType();
        adRequest.addListener(new h1());
        synchronized (BidMachineFetcher.class) {
            try {
                Map<String, AdRequest> map2 = cachedRequests.get(adsType);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    cachedRequests.put((EnumMap<AdsType, Map<String, AdRequest>>) adsType, (AdsType) map2);
                }
                map2.put(str, adRequest);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public static String identifyAdType(CreativeFormat creativeFormat) {
        if (creativeFormat == null) {
            return null;
        }
        int i10 = i1.f60378a[creativeFormat.ordinal()];
        if (i10 == 1) {
            return "display";
        }
        if (i10 == 2) {
            return "video";
        }
        if (i10 != 3) {
            return null;
        }
        return "native";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$fetch$0(AdRequest adRequest) {
        return String.format("fetch - %s", adRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$release$1(String str) {
        return a.b.k("release - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toMap$2(AdRequest adRequest) {
        return String.format("toMap - %s", adRequest);
    }

    public static <T extends AdRequest> T release(T t10) {
        up.c auctionResult = t10.getAuctionResult();
        if (auctionResult != null) {
            return (T) release(t10.getAdsType(), ((k0) auctionResult).getId());
        }
        return null;
    }

    private static String roundPrice(double d10) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d10));
        BigDecimal bigDecimal2 = PRICE_ROUNDING;
        if (bigDecimal2.signum() != 0) {
            bigDecimal = bigDecimal.divide(bigDecimal2, 0, PRICE_ROUNDING_MODE).multiply(bigDecimal2);
        }
        return bigDecimal.setScale(bigDecimal2.scale(), RoundingMode.HALF_UP).toString();
    }

    public static Map<String, String> toMap(AdRequest adRequest) {
        nm.a.d(TAG, new g1(adRequest, 1));
        HashMap map = new HashMap();
        up.c auctionResult = adRequest.getAuctionResult();
        if (auctionResult == null) {
            return map;
        }
        k0 k0Var = (k0) auctionResult;
        map.put(KEY_ID, k0Var.getId());
        map.put(KEY_PRICE, roundPrice(k0Var.getPrice()));
        map.put(KEY_NETWORK_KEY, k0Var.getNetworkKey());
        String strIdentifyAdType = identifyAdType(k0Var.getCreativeFormat());
        if (strIdentifyAdType != null) {
            map.put(KEY_AD_TYPE, strIdentifyAdType);
        }
        map.putAll(k0Var.getCustomParams());
        return map;
    }

    public static <T extends AdRequest> T release(AdsType adsType, Map<String, String> map) {
        return (T) release(adsType, map.get(KEY_ID));
    }

    public static <T extends AdRequest> T release(AdsType adsType, String str) {
        if (!TextUtils.isEmpty(str)) {
            nm.a.d(TAG, new m0(str, 4));
            synchronized (BidMachineFetcher.class) {
                try {
                    Map<String, AdRequest> map = cachedRequests.get(adsType);
                    if (map == null) {
                        return null;
                    }
                    try {
                        return (T) map.remove(str);
                    } catch (Exception unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }
}
