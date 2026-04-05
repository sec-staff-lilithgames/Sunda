package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cj extends bg {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1512 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1513 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1517 = {AbstractJsonLexerKt.COLON, 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', AbstractJsonLexerKt.END_LIST, 'a', 175, 170, 166, 172, 190, AbstractJsonLexerKt.COLON, GMTDateParser.SECONDS, 'l', GMTDateParser.MINUTES, GMTDateParser.SECONDS, 'k', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.BEGIN_LIST, 'R', 135, 289, 308, 311, 305, 306, 313, 308, 306, 308, 287, 280, 304, 304, 'P', 151, 144, 136, 134, AbstractJsonLexerKt.BEGIN_OBJ, 130, 148, 146, 151, 144, GMTDateParser.ZONE, 'a', 'y', 148, 146, 151, 144, 138, 'q', 'y', 148, 139, 'p', 'r', 145, 147, 142, 145, 151, 'v', '|', 151, 141, 146, 144, 150, '|', 'v', 151, 146, GMTDateParser.HOURS, 207, 204, 203, 199, 202, 195, 190, 197, 195, 201, 184, 184, 205, 208, '2', GMTDateParser.DAY_OF_MONTH, 'f', '_', GMTDateParser.DAY_OF_MONTH, 'k', 'i', 'i', 'l', GMTDateParser.SECONDS, 'n', 'Z', '`', 'q', 'i', GMTDateParser.MINUTES, AbstractJsonLexerKt.END_LIST, 'Z', '!', 'Q', 'g', 'n', 'i', 'k', GMTDateParser.YEAR, 'R', 'T', AbstractJsonLexerKt.END_LIST, GMTDateParser.MINUTES, 'i', 'q', '`', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 210, 225, 219, 182, 209, 174, 217, 206, 214, 225, 214, 225, 224, 223, '9', 'k', 'i', 'i', 'l', GMTDateParser.SECONDS, 'n', 'Z', '`', 'q', 'i', GMTDateParser.MINUTES, AbstractJsonLexerKt.END_LIST, 'T', 'R', 'V', 'f', 'e', 'n', 'n', 'n', GMTDateParser.SECONDS, 'r', 'k', 'l', 'q', AbstractJsonLexerKt.BEGIN_LIST, ')', AbstractJsonLexerKt.BEGIN_LIST, 'n', 'l', 'i', 'k', 'P', 152, 155, 157, 138, 138, 129, 129, 147, 147, '0', 'e', 'f', GMTDateParser.DAY_OF_MONTH, GMTDateParser.YEAR, GMTDateParser.YEAR, GMTDateParser.HOURS, 'j', 'W', '+', '_', 'f', GMTDateParser.DAY_OF_MONTH, 'j', 'X', 'R', 'Q', 149, 157, 173, 170, 160, 155, 145, 153, 171, 165, '&', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'r', 'l', 'l', 'e', '_', 'f', GMTDateParser.DAY_OF_MONTH, 'j', 'Z', AbstractJsonLexerKt.END_LIST, GMTDateParser.MINUTES, 'i', 'q', AbstractJsonLexerKt.COLON, '^', AbstractJsonLexerKt.BEGIN_LIST, 'p', GMTDateParser.SECONDS, 'l', 'k', 'r', GMTDateParser.SECONDS, 'n', 'n', 'n', 'e', 'f', 'Z', AbstractJsonLexerKt.BEGIN_LIST, 'j', 'j', 'k', 'f', GMTDateParser.MONTH, 157, 145, 139, 150, 152, 133, 129, 147, 148, 146, 135, 142, 154, 148, '2', 'l', 'e', '_', 'f', GMTDateParser.DAY_OF_MONTH, 'j', 'X', 'R', 'V', AbstractJsonLexerKt.BEGIN_LIST, 'j', 'j', 'k'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1518 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1516 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1514 = 128;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1515 = {227, 239, 237, 174, 249, 225, 238, 228, 229, 248, 226, 233, 236, 243, 193, 244, 246, 212, 240, 205, 194, 242, 214, 247, 210, 197, 204, 208, 235, 196, 231, 245, 201, 230, 198};

    public cj(String str) {
        super(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1877(AdInfo adInfo) {
        f1513 = (f1512 + 17) % 128;
        String strM1898 = m1898(adInfo);
        f1513 = (f1512 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        return strM1898;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1881(RewardedAd rewardedAd) {
        f1512 = (f1513 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        AdInfo adInfoM1896 = m1896(rewardedAd);
        f1512 = (f1513 + 21) % 128;
        return adInfoM1896;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1888(ImpressionData impressionData) {
        f1512 = (f1513 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        String strM1899 = m1899(impressionData);
        f1513 = (f1512 + 65) % 128;
        return strM1899;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m1892(Reward reward) {
        int i10 = f1512 + 13;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        int iM1876 = m1876(reward);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        f1513 = (f1512 + 33) % 128;
        return iM1876;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1900(Reward reward) {
        f1513 = (f1512 + 97) % 128;
        String strM1882 = m1882(reward);
        int i10 = f1513 + 101;
        f1512 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1882;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1878(MediaFile mediaFile) {
        f1512 = (f1513 + 1) % 128;
        String strM1883 = m1883(mediaFile);
        int i10 = f1513 + 71;
        f1512 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1883;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1889(VideoAd videoAd) {
        f1513 = (f1512 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        String strM1884 = m1884(videoAd);
        f1513 = (f1512 + 41) % 128;
        return strM1884;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1893(InterstitialAd interstitialAd) {
        f1513 = (f1512 + 87) % 128;
        AdInfo adInfoM1887 = m1887(interstitialAd);
        int i10 = f1512 + 93;
        f1513 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 80 / 0;
        }
        return adInfoM1887;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1902(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1513 + 63;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        m1886(interstitialAd, interstitialAdEventListener);
        if (i11 != 0) {
            throw null;
        }
        f1512 = (f1513 + 13) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026e A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cj.mo1110(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1880(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1513 + 69;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        m1901(videoController, videoEventListener);
        if (i11 != 0) {
            throw null;
        }
        f1513 = (f1512 + 25) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1890(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1512 + 15;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        m1879(bannerAdView, bannerAdEventListener);
        if (i11 == 0) {
            int i12 = 88 / 0;
        }
        f1512 = (f1513 + 35) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ MediaFile m1894(VideoAd videoAd) {
        f1513 = (f1512 + 27) % 128;
        MediaFile mediaFileM1897 = m1897(videoAd);
        f1513 = (f1512 + 85) % 128;
        return mediaFileM1897;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1898(AdInfo adInfo) {
        int i10 = f1512 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1513 = i10 % 128;
        if (i10 % 2 != 0) {
            return adInfo.getAdUnitId();
        }
        adInfo.getAdUnitId();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1891(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1512 + 113;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        m1903(rewardedAd, rewardedAdEventListener);
        if (i11 == 0) {
            int i12 = 0 / 0;
        }
        int i13 = f1513 + 17;
        f1512 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1899(ImpressionData impressionData) {
        f1512 = (f1513 + 5) % 128;
        String rawData = impressionData.getRawData();
        int i10 = f1512 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1513 = i10 % 128;
        if (i10 % 2 != 0) {
            return rawData;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1513 = (f1512 + 41) % 128;
        String libraryVersion = MobileAds.getLibraryVersion();
        int i10 = f1513 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1512 = i10 % 128;
        if (i10 % 2 == 0) {
            return libraryVersion;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1885("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", true, new int[]{207, 11, 63, 11}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1877((AdInfo) list.get(0));
            }
        });
        map.put(m1895((String) null, KeyEvent.normalizeMetaState(0) + 127, (int[]) null, "\u0086\u0090\u0086\u009e\u0098\u0086\u0099\u0090\u0089\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1888((ImpressionData) list.get(0));
            }
        });
        map.put(m1885("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", false, new int[]{Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 21, 0, 8}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                cj.m1880((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1885("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{239, 20, 0, 18}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1893((InterstitialAd) list.get(0));
            }
        });
        map.put(m1895((String) null, 126 - TextUtils.lastIndexOf("", '0', 0), (int[]) null, "\u0090\u0087 \u0082\u0083\u008f\u0088\u0096\u0086\u0098\u0089\u0099\u0090\u0089\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Integer.valueOf(cj.m1892((Reward) list.get(0)));
            }
        });
        map.put(m1895((String) null, 127 - Color.red(0), (int[]) null, "\u0089\u0093\u0085\u0092\u0088\u0096\u0086\u0098\u0089\u0099\u0090\u0089\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1900((Reward) list.get(0));
            }
        });
        map.put(m1895((String) null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0082¢\u0087¡\u0088\u008f\u0088\u0089\u0088\u0096\u0086\u0098\u0089\u0099\u0090\u0089\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1881((RewardedAd) list.get(0));
            }
        });
        map.put(m1895((String) null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, (int[]) null, "\u0096\u0089\u0087\u0089\u0090\u008e\u008c\u009b\u0090\u0087\u0089\u0091\u009a\u0088\u008f\u0088\u0089\u0088\u0096\u0086\u0098\u0089\u0099\u0090\u0089\u008e").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                cj.m1891((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1895((String) null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, (int[]) null, "\u0096\u0089\u0087\u0089\u0090\u008e\u008c\u009b\u0090\u0087\u0089\u0091\u009a\u0088\u008f\u008d\u0086\u008c\u0090\u008c\u0090\u008e\u0096\u0089\u0090\u0087¡\u0090\u0089\u008e").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                cj.m1902((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1885("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", true, new int[]{259, 15, 46, 0}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1878((MediaFile) list.get(0));
            }
        });
        map.put(m1895((String) null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (int[]) null, "\u0089\u008d\u008c£\u0086\u008c\u0088\u0089\u0094\u0088\u008f\u0082\u0089\u0088\u008c\u0097\u0090\u0089\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1894((VideoAd) list.get(0));
            }
        });
        map.put(m1885("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", false, new int[]{274, 14, 0, 13}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cj.m1889((VideoAd) list.get(0));
            }
        });
        map.put(m1895((String) null, 127 - Color.red(0), (int[]) null, "\u0096\u0089\u0087\u0089\u0090\u008e\u008c\u009b\u0090\u0087\u0089\u0091\u009a\u0088\u008f\u0096\u0089\u0087\u0087\u0086\u0095\u0090\u0089\u008e").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                cj.m1890((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        f1513 = (f1512 + 77) % 128;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int m1876(Reward reward) {
        f1513 = (f1512 + 83) % 128;
        int amount = reward.getAmount();
        int i10 = f1513 + 109;
        f1512 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 33 / 0;
        }
        return amount;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m1887(InterstitialAd interstitialAd) {
        int i10 = f1512 + 19;
        f1513 = i10 % 128;
        if (i10 % 2 == 0) {
            interstitialAd.getInfo();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        f1512 = (f1513 + 29) % 128;
        return info;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1901(VideoController videoController, VideoEventListener videoEventListener) {
        f1512 = (f1513 + 51) % 128;
        videoController.setVideoEventListener(videoEventListener);
        int i10 = f1513 + 89;
        f1512 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m1879(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        f1512 = (f1513 + 19) % 128;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        int i10 = f1512 + 31;
        f1513 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static AdInfo m1896(RewardedAd rewardedAd) {
        f1512 = (f1513 + 111) % 128;
        AdInfo info = rewardedAd.getInfo();
        int i10 = f1512 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1513 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 55 / 0;
        }
        return info;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1903(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f1513 = (f1512 + 73) % 128;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        int i10 = f1512 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1513 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static MediaFile m1897(VideoAd videoAd) {
        int i10 = f1513 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1512 = i10 % 128;
        if (i10 % 2 != 0) {
            videoAd.getMediaFile();
            throw null;
        }
        MediaFile mediaFile = videoAd.getMediaFile();
        f1513 = (f1512 + 11) % 128;
        return mediaFile;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1895(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f1515;
                int i11 = f1514;
                if (f1516) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1518) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1882(Reward reward) {
        int i10 = f1512 + 77;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        String type = reward.getType();
        if (i11 == 0) {
            int i12 = 83 / 0;
        }
        int i13 = f1512 + 55;
        f1513 = i13 % 128;
        if (i13 % 2 != 0) {
            return type;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1886(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1512 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i11 == 0) {
            int i12 = 2 / 0;
        }
        f1512 = (f1513 + 69) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1883(MediaFile mediaFile) {
        f1512 = (f1513 + 111) % 128;
        String url = mediaFile.getUrl();
        int i10 = f1513 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1512 = i10 % 128;
        if (i10 % 2 == 0) {
            return url;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1884(VideoAd videoAd) {
        int i10 = f1513 + 5;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        String info = videoAd.getInfo();
        if (i11 != 0) {
            int i12 = 90 / 0;
        }
        return info;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1885(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1517, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
