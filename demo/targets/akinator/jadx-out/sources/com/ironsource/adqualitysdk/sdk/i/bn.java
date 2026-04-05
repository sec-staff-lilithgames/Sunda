package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.cio.ByteBufferPoolKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bn extends bg {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f1115 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1116 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1117 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1118 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1119 = 6426385359202850544L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1120 = 23460;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1121 = 27311;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1122 = 63848;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1123 = 19254;

    public bn(String str) {
        super(str);
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private static String m1345(ImpressionData impressionData) {
        int i10 = f1118 + 71;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static String m1346(ImpressionData impressionData) {
        f1118 = (f1116 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        String campaignId = impressionData.getCampaignId();
        f1116 = (f1118 + 19) % 128;
        return campaignId;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private static String m1347(ImpressionData impressionData) {
        f1116 = (f1118 + 3) % 128;
        String creativeId = impressionData.getCreativeId();
        int i10 = f1116 + 75;
        f1118 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 74 / 0;
        }
        return creativeId;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static double m1348(ImpressionData impressionData) {
        int i10 = f1116 + 105;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getNetPayout();
        }
        impressionData.getNetPayout();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static String m1349(ImpressionData impressionData) {
        f1118 = (f1116 + 79) % 128;
        String variantId = impressionData.getVariantId();
        f1118 = (f1116 + 65) % 128;
        return variantId;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m1351(ImpressionData impressionData) {
        int i10 = f1118 + 23;
        f1116 = i10 % 128;
        if (i10 % 2 != 0) {
            impressionData.getRenderingSdk();
            throw null;
        }
        String renderingSdk = impressionData.getRenderingSdk();
        int i11 = f1116 + 101;
        f1118 = i11 % 128;
        if (i11 % 2 != 0) {
            return renderingSdk;
        }
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static String m1352(ImpressionData impressionData) {
        int i10 = f1118 + 5;
        f1116 = i10 % 128;
        int i11 = i10 % 2;
        String demandSource = impressionData.getDemandSource();
        if (i11 != 0) {
            int i12 = 4 / 0;
        }
        return demandSource;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static MediationManager m1353() {
        f1116 = (f1118 + 43) % 128;
        MediationManager companion = MediationManager.Companion.getInstance();
        f1116 = (f1118 + 3) % 128;
        return companion;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1356(ImpressionData impressionData) {
        f1118 = (f1116 + 17) % 128;
        String strM1345 = m1345(impressionData);
        int i10 = f1118 + 89;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1345;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static PlacementType m1358(ImpressionData impressionData) {
        f1118 = (f1116 + 67) % 128;
        PlacementType placementType = impressionData.getPlacementType();
        int i10 = f1116 + 49;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementType;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ double m1359(ImpressionData impressionData) {
        f1118 = (f1116 + 41) % 128;
        double dM1348 = m1348(impressionData);
        f1116 = (f1118 + 103) % 128;
        return dM1348;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m1360() {
        int i10 = f1118 + 35;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1353();
        }
        m1353();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ String m1362(ImpressionData impressionData) {
        int i10 = f1116 + 13;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1347(impressionData);
        }
        m1347(impressionData);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1363(String str) {
        int i10 = f1116 + 105;
        f1118 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adTypeM1355 = m1355(str);
        if (i11 == 0) {
            int i12 = 67 / 0;
        }
        int i13 = f1118 + 55;
        f1116 = i13 % 128;
        if (i13 % 2 == 0) {
            return adTypeM1355;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1371(ImpressionData impressionData) {
        int i10 = f1116 + 113;
        f1118 = i10 % 128;
        if (i10 % 2 == 0) {
            m1352(impressionData);
            throw null;
        }
        String strM1352 = m1352(impressionData);
        int i11 = f1118 + 81;
        f1116 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM1352;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1374(Constants.AdType adType) {
        f1116 = (f1118 + 23) % 128;
        PlacementType placementTypeM1368 = m1368(adType);
        int i10 = f1116 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementTypeM1368;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1378(Placement placement) {
        int i10 = f1116 + 99;
        f1118 = i10 % 128;
        if (i10 % 2 == 0) {
            m1385(placement);
            throw null;
        }
        Constants.AdType adTypeM1385 = m1385(placement);
        f1116 = (f1118 + 21) % 128;
        return adTypeM1385;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1384(ImpressionData impressionData) {
        f1118 = (f1116 + 115) % 128;
        PlacementType placementTypeM1358 = m1358(impressionData);
        int i10 = f1118 + 3;
        f1116 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
        return placementTypeM1358;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m1350() {
        int i10 = f1116 + 91;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return FairBid.assertStarted();
        }
        FairBid.assertStarted();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m1354(ImpressionData impressionData) {
        int i10 = f1118 + 89;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1357() {
        f1116 = (f1118 + 111) % 128;
        boolean zM1350 = m1350();
        f1118 = (f1116 + 59) % 128;
        return zM1350;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1361(ImpressionData impressionData) {
        int i10 = f1118 + 95;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1346(impressionData);
        }
        m1346(impressionData);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1364(FairBid.AdsConfig adsConfig) {
        int i10 = f1116 + 37;
        f1118 = i10 % 128;
        int i11 = i10 % 2;
        String strM1370 = m1370(adsConfig);
        if (i11 == 0) {
            int i12 = 28 / 0;
        }
        return strM1370;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m1372(MediationConfig mediationConfig) {
        int i10 = f1118 + 29;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1367(mediationConfig);
        }
        m1367(mediationConfig);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1375(ImpressionData impressionData) {
        f1116 = (f1118 + 113) % 128;
        String strM1351 = m1351(impressionData);
        f1116 = (f1118 + 113) % 128;
        return strM1351;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1379(FairBid.AdsConfig adsConfig) {
        f1116 = (f1118 + 59) % 128;
        String strM1387 = m1387(adsConfig);
        f1118 = (f1116 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return strM1387;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m1386(MediationManager mediationManager) {
        f1116 = (f1118 + 37) % 128;
        PlacementsHandler placementsHandlerM1369 = m1369(mediationManager);
        int i10 = f1116 + 113;
        f1118 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
        return placementsHandlerM1369;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Constants.AdType m1355(String str) {
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m1388("\ufbcb\uf4f9倂蛵", (char) (ViewConfiguration.getTapTimeout() >> 16), "緄\uf3b5鏧\ue7c1袜枸퓊뼤輙ꁾ立ㆥ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "雰贎᭯夯").intern())) {
                    f1116 = (f1118 + 33) % 128;
                    return Constants.AdType.INTERSTITIAL;
                }
                break;
            case 433141802:
                if (str.equals(m1381("\udca5縘\udefb敯瓬జ຺芭", KeyEvent.normalizeMetaState(0) + 7).intern())) {
                    return Constants.AdType.UNKNOWN;
                }
                break;
            case 543046670:
                if (str.equals(m1388("\udb4b䑛ꕴ暂", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "ꋦ\ued32流遁祅飛烴싼", TextUtils.getOffsetBefore("", 0), "雰贎᭯夯").intern())) {
                    return Constants.AdType.REWARDED;
                }
                break;
            case 1951953708:
                if (str.equals(m1388("﹕㾔㢹⇓", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54071), "䑠匉ࡢ쵇瞣✵", ViewConfiguration.getKeyRepeatTimeout() >> 16, "雰贎᭯夯").intern())) {
                    return Constants.AdType.BANNER;
                }
                break;
        }
        f1116 = (f1118 + 61) % 128;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1365(ImpressionData impressionData) {
        int i10 = f1118 + 11;
        f1116 = i10 % 128;
        int i11 = i10 % 2;
        String strM1349 = m1349(impressionData);
        if (i11 != 0) {
            int i12 = 36 / 0;
        }
        return strM1349;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1376(Placement placement) {
        f1116 = (f1118 + 57) % 128;
        String strM1366 = m1366(placement);
        int i10 = f1116 + 11;
        f1118 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 38 / 0;
        }
        return strM1366;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1380(ImpressionData impressionData) {
        f1116 = (f1118 + 51) % 128;
        String strM1354 = m1354(impressionData);
        f1116 = (f1118 + 55) % 128;
        return strM1354;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1387(FairBid.AdsConfig adsConfig) {
        f1116 = (f1118 + 63) % 128;
        String str = adsConfig.store;
        f1118 = (f1116 + 31) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -2041833493:
                if (!str.equals(m1388("僰잱⤮싔", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "냹틱Ꝫ樾챾羜햵ᜪ硜㢤ﺓ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 784838992, "雰贎᭯夯").intern())) {
                    return null;
                }
                int i10 = f1116 + 35;
                f1118 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return AdapterPool.class;
            case -1598046662:
                if (!str.equals(m1388("ꯌ섁˸阐", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + ByteBufferPoolKt.DEFAULT_BUFFER_SIZE), "娝\uef81屙姚ດ㧙㹌ᚵ桅뀦\u19cbᩞ\udcb3廻䪐", TextUtils.indexOf("", "", 0, 0) - 121568853, "雰贎᭯夯").intern())) {
                    return null;
                }
                f1116 = (f1118 + 47) % 128;
                return MediationConfig.class;
            case -1115843213:
                if (str.equals(m1388("礆\uf261流筊", (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19053), "㲍䤁\uef04ᥐ漠䍘㛯\ue563ﭔ\ue137止ϐ%뜯", View.getDefaultSize(0, 0), "雰贎᭯夯").intern())) {
                    return ImpressionData.class;
                }
                return null;
            case -847426041:
                if (str.equals(m1381("ቪ퇌魫⚰⚨蔼\ue836曑\ue44f\uab08\u0a3d몒퓦\udfe3ꖑ\uaafb\u0ef6ᨑ\ue44f\uab08", 19 - MotionEvent.axisFromString("")).intern())) {
                    return AdapterConfiguration.class;
                }
                return null;
            case -498060603:
                if (str.equals(m1381("쪚쮅䭇琶쭿㽡\u09d1͇࢈狳", 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    return Placement.class;
                }
                return null;
            case -368841467:
                if (!str.equals(m1388("踽퀩뵙衲", (char) Drawable.resolveOpacity(0, 0), "谻ኙ벺퀃䁷\uf0dd豕ẻ", ViewConfiguration.getScrollBarFadeDuration() >> 16, "雰贎᭯夯").intern())) {
                    return null;
                }
                int i11 = f1118 + 19;
                f1116 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                return CachedAd.class;
            case -174936018:
                if (str.equals(m1388("⛩纕ᅈ⨢", (char) TextUtils.getOffsetAfter("", 0), "菸趵\u2d7a裖彨ꞌ\u245c쑠", ImageFormat.getBitsPerPixel(0) + 1, "雰贎᭯夯").intern())) {
                    return Rewarded.class;
                }
                return null;
            case 99044255:
                if (str.equals(m1388("\ue3c5\u244b\ueaee츪", (char) (10986 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "阵瓹憯\ue3dd렃꜀哏\ueffb됯ᐑ褬며\ue017", ExpandableListView.getPackedPositionChild(0L) - 299611164, "雰贎᭯夯").intern())) {
                    return PlacementType.class;
                }
                return null;
            case 438795617:
                if (str.equals(m1381("梋ᢃ\ueecb㭹稆\udd97탺歧︪\u0080崿\uebc9ꞐᲞ", TextUtils.indexOf((CharSequence) "", '0') + 15).intern())) {
                    return NetworkAdapter.class;
                }
                return null;
            case 578208537:
                if (str.equals(m1381("랁멵欮锩즄Ⳇ툃ᨱ", 7 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    return FairBid.class;
                }
                return null;
            case 769047372:
                if (str.equals(m1388("㺎⫴鈀菙", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "鑗攂犚ዾ뢈珿졐ᱲ瓱噲肗猐", ViewConfiguration.getMinimumFlingVelocity() >> 16, "雰贎᭯夯").intern())) {
                    return Interstitial.class;
                }
                return null;
            case 806552769:
                if (!str.equals(m1381("릜福ਫ਼\uf2e2쬩歷\u0ef6ᨑ\ue44f\uab08\uef96器", (ViewConfiguration.getPressedStateDuration() >> 16) + 11).intern())) {
                    return null;
                }
                int i12 = f1116 + 99;
                f1118 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return ShowOptions.class;
            case 1062384924:
                if (str.equals(m1381("쪚쮅䭇琶쭿㽡\u09d1͇픜믰\uf2ef\ue4a1埑鰠০\u19af\ude4c㿩", 17 - View.combineMeasuredStates(0, 0)).intern())) {
                    return PlacementsHandler.class;
                }
                return null;
            case 1212533506:
                if (str.equals(m1388("䅇\uedf7冩꣧", (char) (TextUtils.lastIndexOf("", '0') + 59218), "梯䙴鸩䆉펙䞺䙯넛湨ⲙ퓃\udda2訉㩒䉡\u0e61", ViewConfiguration.getScrollBarSize() >> 8, "雰贎᭯夯").intern())) {
                    return RewardedListener.class;
                }
                return null;
            case 1297340448:
                if (str.equals(m1381("ꀕ\ue58c⚨蔼⒧쓒\u0ef6ᨑ\u0ef6ᨑ͠壞簠任첦亴\u09d1͇ꞐᲞ", View.resolveSize(0, 0) + 20).intern())) {
                    return InterstitialListener.class;
                }
                return null;
            case 1775008410:
                if (str.equals(m1388("쑝努읶㘺", (char) ExpandableListView.getPackedPositionGroup(0L), "\ud8a7覢䘅蘥좜䑚엤ꃫ⮞饈\uf566", 1985129157 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "雰贎᭯夯").intern())) {
                    return EventStream.class;
                }
                return null;
            case 1884304309:
                if (str.equals(m1388("濮䀑㑆替", (char) (65332 - (ViewConfiguration.getPressedStateDuration() >> 16)), "辑욀먪희譫\uf34f熗\udce6撆\uf728\udacc㔙做ꉄ蝫ꌺ", TextUtils.indexOf("", "", 0), "雰贎᭯夯").intern())) {
                    return MediationManager.class;
                }
                return null;
            case 1955869213:
                if (str.equals(m1381("ቪ퇌⛇႒擈ᯏ", (ViewConfiguration.getLongPressTimeout() >> 16) + 6).intern())) {
                    return Constants.AdType.class;
                }
                return null;
            case 1969669106:
                if (str.equals(m1381("ቪ퇌굎鮭\ue44f\uab08\u0a3d몒더\uebb0", TextUtils.indexOf((CharSequence) "", '0') + 10).intern())) {
                    return FairBid.AdsConfig.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1377(InterstitialListener interstitialListener) {
        f1116 = (f1118 + 57) % 128;
        Interstitial.setInterstitialListener(interstitialListener);
        f1118 = (f1116 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1382(InterstitialListener interstitialListener) {
        f1116 = (f1118 + 43) % 128;
        m1377(interstitialListener);
        int i10 = f1118 + 73;
        f1116 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 32 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Constants.AdType m1385(Placement placement) {
        int i10 = f1118 + 71;
        f1116 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adType = placement.getAdType();
        if (i11 != 0) {
            int i12 = 65 / 0;
        }
        f1118 = (f1116 + 79) % 128;
        return adType;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1116 + 89;
        f1118 = i10 % 128;
        try {
            try {
                return (String) (i10 % 2 == 0 ? FairBid.class.getDeclaredField(m1388("\uf436蚰綰찫", (char) ExpandableListView.getPackedPositionType(1L), "ՠ챸뫷Ꙃ⚝⾿ꇕᐱ왣裑讳", (-1333350156) / (ViewConfiguration.getMaximumDrawingCacheSize() + 4), "雰贎᭯夯").intern()) : FairBid.class.getDeclaredField(m1388("\uf436蚰綰찫", (char) ExpandableListView.getPackedPositionType(0L), "ՠ챸뫷Ꙃ⚝⾿ꇕᐱ왣裑讳", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1333350156, "雰贎᭯夯").intern())).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2670().m2672().m2723(FairBid.class, m1381("ꭩ\u0bc4뾦鋗ㇰ폲\uf069꽮緰뇿뾦鋗ㇰ폲\uf069꽮緰뇿뾦鋗ㇰ폲፤暘", 23 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1383(RewardedListener rewardedListener) {
        int i10 = f1118 + 27;
        f1116 = i10 % 128;
        int i11 = i10 % 2;
        m1373(rewardedListener);
        if (i11 != 0) {
            throw null;
        }
        f1116 = (f1118 + 15) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1388(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1119) ^ f1117) ^ f1115);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1388("㔦⼧濔\uf7f5", (char) (62831 - (KeyEvent.getMaxKeyCode() >> 16)), "˶䬣囯瀖칭Ϊ싪몚ċ캇탆쵻骢ꟶ熺\udd8f뛻싿ӏ룄䑮킬㩫\ue9e8鎏\uee64殞", (-735107276) - TextUtils.indexOf((CharSequence) "", '0'), "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1360();
            }
        });
        map.put(m1388("\ue165튮ᩓ콡", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "邫㰯俱ꈢ鲘\ue076㱌\uedbc똘\ue96b\uf1bcὦ鄾觩蓲ꄒ룿旞䖵ߡ鬢冡", Color.rgb(0, 0, 0) + 16777216, "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1374((Constants.AdType) list.get(0));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲ᡌ므倴샱嘝ԏ鄾刺쌰\ue2c4⛇႒擈ᯏ", 30 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1384((ImpressionData) list.get(0));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲⛌찆\u09d1͇⩱ꂕ篭룙㱻↟痁︷覑䋈", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1375((ImpressionData) list.get(0));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲⛌찆\u09d1͇⩱ꂕ篭룙㱻↟痁︷ꙸ뭐ꞐᲞδ\u20c4\ue44f\uab08", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1380((ImpressionData) list.get(0));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲\uf1e8黻쭿㽡\ue4df滘⛌鲆ᆮ轕ꢖﮢ狵\uf67f", TextUtils.indexOf((CharSequence) "", '0') + 30).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1371((ImpressionData) list.get(0));
            }
        });
        map.put(m1388("눗윥䥅姷", (char) (63305 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "✣붉\ue13f遅堼❷ⵈ凩貔臶傡䓖쳭⾿瓾\uf323랩爣ꈒ鈰ᑅﾧἴ娗㳫㑎", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1365((ImpressionData) list.get(0));
            }
        });
        map.put(m1388("䈫⿀붜䐂", (char) (701 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "ࣶ烜\ue0eb慌쇂縄陫䂤႔\ue812ΎѸ\ue753㧿쇸嗠犥䝏ᤒ鷭\udfeaꞩ⊉赔៑샷", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Double.valueOf(bn.m1359((ImpressionData) list.get(0)));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲顭晊ﮧꗪⲜ옲聣谋ﾗ×툃ᨱ", View.MeasureSpec.makeMeasureSpec(0, 0) + 27).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1362((ImpressionData) list.get(0));
            }
        });
        map.put(m1388("꿏媱മ碸", (char) TextUtils.indexOf("", ""), "\ud8e1ꑯ巙韞붮숈슊ᶷ㻕䍷햜ம瀀䠱ጩἿ儆Ņ\udbc0뱯瑢讀\ue943唵\ue391ꪩ\uf76c\u0a0d⪕\udc47욿䉉䎖", 777695663 - Drawable.resolveOpacity(0, 0), "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1356((ImpressionData) list.get(0));
            }
        });
        map.put(m1381("磑쌮凾遝㵷硩ﮧꗪ茽쯼稥겷随綅Ⲝ옲顭晊鈃㞈㖓쭬\ud7c9垓\uf82f\uf783툃ᨱ", 27 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1361((ImpressionData) list.get(0));
            }
        });
        map.put(m1388("侴\uf421虪掆", (char) View.MeasureSpec.getMode(0), "⒆\ueb8b벵᷄蜶⛤内㻏", Color.blue(0), "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1364((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1381("磑쌮榳\ued9b罅ิﮧꗪ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1379((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1381("磑쌮苋У︪\u0080崿\uebc9ꞐᲞ烘㢘Ⲓ鰌\ud7c9垓ꢤ澄Ⲝ옲稥겷罄濠", (KeyEvent.getMaxKeyCode() >> 16) + 24).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1372((MediationConfig) list.get(0));
            }
        });
        map.put(m1381("磑쌮䡕䓑倴샱嘝ԏ鄾刺쌰\ue2c4ቪ퇌⛇႒擈ᯏ", 18 - Drawable.resolveOpacity(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1378((Placement) list.get(0));
            }
        });
        map.put(m1381("磑쌮䡕䓑倴샱嘝ԏ鄾刺쌰\ue2c4\ue707훣鄾刺", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1376((Placement) list.get(0));
            }
        });
        map.put(m1388("봩樑\uf89b\uddbc", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "酊變嫃뤗鼅銚\ueaba鱰夭ᑑ\uf024菈⫳ᰜ떂嗢굅荼\uee02阏", ViewConfiguration.getFadingEdgeLength() >> 16, "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1386((MediationManager) list.get(0));
            }
        });
        map.put(m1388("䊳\ue5b7㋰疨", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43059), "氅\ud93aഥ槲Ꞝ珼\udaab䐜끕쥬⾲ㅟ\uf600", ((byte) KeyEvent.getModifierMetaStateMask()) - 253380797, "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bn.m1363((String) list.get(0));
            }
        });
        map.put(m1381("᷐\udf0c凾遝쌰\ue2c4ꞐᲞ첦亴⍝晃ᐡ熦頇ܽᇃ⣡⚨蔼鄁\udcae\ude4c㿩", 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bn.m1382((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1381("᷐\udf0c㠅貳꽦㙒蠳䃪⩱ꂕ聊⨀ᇃ⣡⚨蔼鄁\udcae\ude4c㿩", 19 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bn.m1383((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1388("䔘﹌遏፨", (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 26768), "ཎ䭏㧛ꢭ\uf26d\uf3a8\uf078엄ᡫ塵輖᭳㈱", Color.blue(0) + 1342065733, "雰贎᭯夯").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bn.m1357());
            }
        });
        f1116 = (f1118 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1367(MediationConfig mediationConfig) {
        int i10 = f1118 + 65;
        f1116 = i10 % 128;
        int i11 = i10 % 2;
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        int i13 = f1118 + 95;
        f1116 = i13 % 128;
        if (i13 % 2 == 0) {
            return adapterConfigurations;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1366(Placement placement) {
        int i10 = f1118 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1116 = i10 % 128;
        if (i10 % 2 == 0) {
            return placement.getName();
        }
        placement.getName();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1381(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1121)) ^ ((c11 >>> 5) + f1122)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1123) ^ ((c12 + i12) ^ ((c12 << 4) + f1120))));
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
    private static PlacementType m1368(Constants.AdType adType) {
        f1116 = (f1118 + 39) % 128;
        PlacementType placementType = adType.getPlacementType();
        f1118 = (f1116 + 3) % 128;
        return placementType;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1370(FairBid.AdsConfig adsConfig) {
        int i10 = f1116 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1118 = i10 % 128;
        int i11 = i10 % 2;
        String str = adsConfig.appId;
        if (i11 == 0) {
            int i12 = 57 / 0;
        }
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static PlacementsHandler m1369(MediationManager mediationManager) {
        int i10 = f1116 + 37;
        f1118 = i10 % 128;
        if (i10 % 2 != 0) {
            return mediationManager.getPlacementsHandler();
        }
        mediationManager.getPlacementsHandler();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1373(RewardedListener rewardedListener) {
        int i10 = f1116 + 109;
        f1118 = i10 % 128;
        int i11 = i10 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        if (i11 == 0) {
            throw null;
        }
    }
}
