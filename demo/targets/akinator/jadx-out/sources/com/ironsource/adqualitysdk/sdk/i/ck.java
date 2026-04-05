package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ck extends bg {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1532 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1533 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1538 = {-2034503804, -1369144583, 1631399880, 1305789522, 348465717, 351885837, 680590410, 597016637, 770454073, 1892181821, 1972788998, 1307541038, -811244536, 730140732, -1062424524, -1435289568, -1599070595, -516210537};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1536 = 31929;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1537 = 52085;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1534 = 55360;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1535 = 12872;

    public ck(String str) {
        super(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1905(AdPayload.CacheableReplacement cacheableReplacement) {
        int i10 = f1533 + 105;
        f1532 = i10 % 128;
        if (i10 % 2 != 0) {
            m1916(cacheableReplacement);
            throw null;
        }
        String strM1916 = m1916(cacheableReplacement);
        int i11 = f1532 + 105;
        f1533 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1916;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1909(AdPayload.AdUnit adUnit) {
        int i10 = f1532 + 55;
        f1533 = i10 % 128;
        if (i10 % 2 == 0) {
            m1904(adUnit);
            throw null;
        }
        String strM1904 = m1904(adUnit);
        int i11 = f1533 + 59;
        f1532 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
        return strM1904;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.TemplateSettings m1912(AdPayload.AdUnit adUnit) {
        f1533 = (f1532 + 111) % 128;
        AdPayload.TemplateSettings templateSettingsM1915 = m1915(adUnit);
        f1533 = (f1532 + 99) % 128;
        return templateSettingsM1915;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.AdUnit m1918(AdPayload adPayload) {
        f1532 = (f1533 + 47) % 128;
        AdPayload.AdUnit adUnitM1914 = m1914(adPayload);
        f1533 = (f1532 + 79) % 128;
        return adUnitM1914;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1907("࿎ᇹ☠봞藩哆ก刴賿曷", 9 - Color.red(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1918((AdPayload) list.get(0));
            }
        });
        map.put(m1907("࿎ᇹ☠봞浟\udbce駟\ufae4", (ViewConfiguration.getFadingEdgeLength() >> 16) + 8).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1906((AppNode) list.get(0));
            }
        });
        map.put(m1907("࿎ᇹ끜\u086d\uebe8獡俣䨂\uf4e1ञ닓辺藻ਬ텑袭\uebe8獡벢\ud892囊ܚ熒㌁䞜恦", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1905((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m1908(new int[]{-1325146409, -581617885, -679699892, 321903091, 427828371, 594559212}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1909((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1907("࿎ᇹ곻恐粣⿋쬜챡\uda01郸φ芁駟\ufae4", View.getDefaultSize(0, 0) + 14).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1911((Placement) list.get(0));
            }
        });
        map.put(m1908(new int[]{-592333764, -649723446, 1257198072, 941048201, -642627840, -1546322009, 1782839081, 1096297424, -2021036916, -307860097}, 19 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ck.m1912((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1907("饛\uf1d1藻ਬ\u1ad6ﬠ\ude0a訕\uf1aaﺐ猦샒靰틤惘蓇", (Process.myPid() >> 22) + 15).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(ck.m1919((Placement) list.get(0)));
            }
        });
        int i10 = f1533 + 57;
        f1532 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1906(AppNode appNode) {
        int i10 = f1532 + 19;
        f1533 = i10 % 128;
        if (i10 % 2 == 0) {
            m1910(appNode);
            throw null;
        }
        String strM1910 = m1910(appNode);
        f1533 = (f1532 + 99) % 128;
        return strM1910;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1911(Placement placement) {
        int i10 = f1533 + 97;
        f1532 = i10 % 128;
        if (i10 % 2 != 0) {
            m1913(placement);
            throw null;
        }
        String strM1913 = m1913(placement);
        int i11 = f1533 + 79;
        f1532 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM1913;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1913(Placement placement) {
        int i10 = f1533 + 105;
        f1532 = i10 % 128;
        if (i10 % 2 != 0) {
            placement.getReferenceId();
            throw null;
        }
        String referenceId = placement.getReferenceId();
        int i11 = f1533 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1532 = i11 % 128;
        if (i11 % 2 == 0) {
            return referenceId;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1919(Placement placement) {
        f1533 = (f1532 + 43) % 128;
        boolean zM1917 = m1917(placement);
        int i10 = f1532 + 39;
        f1533 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM1917;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1532 + 53;
        f1533 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                return mo1165().split(m1908(new int[]{-1686418838, -2139909498}, 1 / (ViewConfiguration.getScrollDefaultDelay() >> 11)).intern())[1];
            }
            return mo1165().split(m1908(new int[]{-1686418838, -2139909498}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final String mo1165() {
        f1533 = (f1532 + 73) % 128;
        try {
            String strM2723 = hu.m2670().m2672().m2723(BuildConfig.class, m1907("謏⯉腯蛇ೄ瞥ᓟꃉ솜Ʇ\uf35f皿ں\u1979", 14 - View.getDefaultSize(0, 0)).intern());
            f1532 = (f1533 + 69) % 128;
            return strM2723;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(m1908(new int[]{397521166, -995776299, -1252737978, 456915484, 1035056317, -930344250}, 10 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    return AdActivity.class;
                }
                return null;
            case -1791176561:
                if (!str.equals(m1908(new int[]{1528611533, 198834423, -1046040904, 218580458}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7).intern())) {
                    return null;
                }
                int i10 = f1533 + 93;
                f1532 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return BannerAd.class;
            case -1560947009:
                if (str.equals(m1908(new int[]{-832424454, -1820282077, 375908095, 625393383, 1481291744, 140594634, 707821761, 810668025, 1991661076, 496872477, -994556123, -2103350990, -1914568949, -1839545156}, Process.getGidForName("") + 26).intern())) {
                    return BannerView.class;
                }
                return null;
            case -1494265129:
                if (str.equals(m1908(new int[]{-832424454, -1820282077, 375908095, 625393383, 1481291744, 140594634, -658825800, -1483868927, 1421522669, -984043846, -1967558053, -1862792945, 934000881, 1979961274, 1166838300, 1417335461, -2103051014, 1378521398, -22916767, 1434277302, 807272025, -550124228}, 41 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return VungleActivity.class;
                }
                return null;
            case -1435839138:
                if (str.equals(m1907("⾜ᣨ퓷\u1ad1ﾇ\uec3a㝺戠囊ܚ㮸ᶌ", 12 - (Process.myPid() >> 22)).intern())) {
                    return FullscreenAd.class;
                }
                return null;
            case -1179107681:
                if (!str.equals(m1907("\uf510柚嶒觰닓辺㮸ᶌ蕢祝", 9 - View.MeasureSpec.getMode(0)).intern())) {
                    return null;
                }
                int i11 = f1532 + 69;
                f1533 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return VungleAds.class;
            case -609786639:
                if (str.equals(m1907("藻ਬ\u1ad6ﬠ\ude0a訕\uf1aaﺐ㮸ᶌ", 9 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return RewardedAd.class;
                }
                return null;
            case -498709917:
                if (!str.equals(m1908(new int[]{-867332171, 1962918573, 295136140, -653043801, 16140144, 1602239430, -1739186869, -524628170, -386356963, -309199719, 1601637655, -612242225}, ((byte) KeyEvent.getModifierMetaStateMask()) + 23).intern())) {
                    return null;
                }
                f1532 = (f1533 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                return InterstitialAdListener.class;
            case -498060603:
                if (str.equals(m1908(new int[]{-586961290, -504693279, 99741572, -659596344, 477755074, 1125641521}, 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    return Placement.class;
                }
                return null;
            case -486531311:
                if (str.equals(m1908(new int[]{-1162573723, 1937043347, 534606838, 825741061, -1716888175, -1515679586, 1601637655, -612242225}, 14 - View.MeasureSpec.getMode(0)).intern())) {
                    return MRAIDPresenter.class;
                }
                return null;
            case -393802555:
                if (str.equals(m1908(new int[]{-1225839029, -1475344402, -1685097154, 1405939602, -1739186869, -524628170, -386356963, -309199719, 1601637655, -612242225}, TextUtils.lastIndexOf("", '0', 0) + 19).intern())) {
                    return RewardedAdListener.class;
                }
                return null;
            case -43797322:
                if (str.equals(m1908(new int[]{2088378953, 1734525164, -1410265433, -1890294024, -2102724524, -1096138694, 1456512048, 170047791, 894161058, -1364659782}, 19 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    return AdPayload.CacheableReplacement.class;
                }
                return null;
            case 307971376:
                if (str.equals(m1908(new int[]{1528611533, 198834423, -1046040904, 218580458, 954037525, -480364255}, View.resolveSizeAndState(0, 0, 0) + 12).intern())) {
                    return BannerAdSize.class;
                }
                return null;
            case 320151695:
                if (str.equals(m1907("盐\uf872✐ꔫ闸먯霫\uddaf霫\uddaf\uf40e븸㮸ᶌ", 13 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 324239304:
                if (str.equals(m1907("㘤ᗋஆ諒㮸ᶌ巼幋\uf272榪囊ܚ겤ꂊ", 14 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return BaseAdListener.class;
                }
                return null;
            case 389759008:
                if (str.equals(m1908(new int[]{1451857433, -67735000, 27949216, 815919425, 525318671, -1282597922}, 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return AdInternal.class;
                }
                return null;
            case 484680813:
                if (!str.equals(m1907("㮸ᶌ\uf0ab룖ஆ諒賿曷", 7 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return null;
                }
                f1532 = (f1533 + 51) % 128;
                return AdAsset.class;
            case 870529955:
                if (str.equals(m1907("瘏\udfbf\uddf4骿⺇ꦜ鍾㾸", 7 - Color.green(0)).intern())) {
                    return AppNode.class;
                }
                return null;
            case 961844241:
                if (str.equals(m1908(new int[]{1528611533, 198834423, 1779281857, 106685249, -1944178283, -1132424323}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9).intern())) {
                    return BannerView.class;
                }
                return null;
            case 989853769:
                if (str.equals(m1907("鲸祷朳홸뭹珞嶒觰닓辺♘눶氌⼲扏畯φ芁겤ꂊꔘ弡\uf43c㌬뉖\ud9b1\u2d99\u175aኯ\ueaac܂煑秕\uf3f8祘겗蝎밿", ImageFormat.getBitsPerPixel(0) + 38).intern())) {
                    return AdActivity.class;
                }
                return null;
            case 1205766784:
                if (str.equals(m1907("\uf510柚嶒觰닓辺\udb08憐霫\uddaf爄Ո\udbbcᒞ", (ViewConfiguration.getFadingEdgeLength() >> 16) + 14).intern())) {
                    return VungleActivity.class;
                }
                return null;
            case 1208038126:
                if (!str.equals(m1908(new int[]{465387867, -1289308767, 458480756, 1043306257, -1441758741, -196385355, 579722644, -1539533011}, 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return null;
                }
                f1533 = (f1532 + 49) % 128;
                return VungleWebClient.class;
            case 1442693170:
                if (!str.equals(m1907("⾜ᣨ퓷\u1ad1ﾇ\uec3a㝺戠囊ܚ㮸ᶌ巼幋\uf272榪囊ܚ겤ꂊ", 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f1532 = (f1533 + 81) % 128;
                return FullscreenAdListener.class;
            case 1505622627:
                if (!str.equals(m1907("㘤ᗋ뜖\udd7a겤ꂊ㮸ᶌ巼幋\uf272榪囊ܚ겤ꂊ", TextUtils.indexOf("", "", 0, 0) + 16).intern())) {
                    return null;
                }
                int i12 = f1533 + 65;
                f1532 = i12 % 128;
                if (i12 % 2 == 0) {
                    return BannerAdListener.class;
                }
                return AdPayload.CacheableReplacement.class;
            case 1839869899:
                if (str.equals(m1908(new int[]{-856653694, 1913358774, -1391118884, -1493024973, -275539561, 771283889}, TextUtils.indexOf((CharSequence) "", '0', 0) + 10).intern())) {
                    return AdPayload.class;
                }
                return null;
            case 1853648591:
                if (str.equals(m1908(new int[]{473090449, -403948618, 722409753, -1174948902, 450568544, -168667668, 1347077106, 1235678549}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16).intern())) {
                    return BaseFullscreenAd.class;
                }
                return null;
            case 1930966324:
                if (str.equals(m1908(new int[]{465387867, -1289308767, -403170618, 1342035268, 434744730, 1317647084, 579722644, -1539533011}, (KeyEvent.getMaxKeyCode() >> 16) + 15).intern())) {
                    return VungleApiClient.class;
                }
                return null;
            case 1982630644:
                if (!str.equals(m1907("㘤ᗋஆ諒㮸ᶌ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5).intern())) {
                    return null;
                }
                int i13 = f1532 + 79;
                f1533 = i13 % 128;
                if (i13 % 2 != 0) {
                    return BaseAd.class;
                }
                return AdActivity.class;
            default:
                return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1904(AdPayload.AdUnit adUnit) {
        int i10 = f1532 + 67;
        f1533 = i10 % 128;
        if (i10 % 2 != 0) {
            return adUnit.getCampaign();
        }
        adUnit.getCampaign();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1908(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1538.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdPayload.AdUnit m1914(AdPayload adPayload) {
        f1532 = (f1533 + 109) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f1532 = (f1533 + 103) % 128;
        return adUnit;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1916(AdPayload.CacheableReplacement cacheableReplacement) {
        int i10 = f1533 + 105;
        f1532 = i10 % 128;
        if (i10 % 2 != 0) {
            cacheableReplacement.getUrl();
            throw null;
        }
        String url = cacheableReplacement.getUrl();
        f1533 = (f1532 + 3) % 128;
        return url;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m1915(AdPayload.AdUnit adUnit) {
        int i10 = f1532 + 101;
        f1533 = i10 % 128;
        int i11 = i10 % 2;
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        return templateSettings;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m1917(Placement placement) {
        int i10 = f1533 + 17;
        f1532 = i10 % 128;
        if (i10 % 2 != 0) {
            placement.isRewardedVideo();
            throw null;
        }
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        f1533 = (f1532 + 69) % 128;
        return zIsRewardedVideo;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1907(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1536)) ^ ((c11 >>> 5) + f1534)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1537) ^ ((c12 + i12) ^ ((c12 << 4) + f1535))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1910(AppNode appNode) {
        int i10 = f1533 + 91;
        f1532 = i10 % 128;
        int i11 = i10 % 2;
        String appId = appNode.getAppId();
        if (i11 != 0) {
            int i12 = 0 / 0;
        }
        return appId;
    }
}
