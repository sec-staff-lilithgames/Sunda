package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bz extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1366 = {'c', 10348, 20587, 30759, 41059, 51304, 61543, 6247, 16481, 26677, 36991, 47173, 57354, 2126, 12356, 22617, 32853, 43073, 53317, 63565, 8277, 18507, 28715, 38948, 49188, 59493, 4155, 14392, 24698, 34846, 45108, 55337, 5, 10257, 20501, 30749, 40965, 51227, 61467, 6164, 16404, 26682, 36893, 47349, 57581, 2289, 12515, 22777, 33001, 63861, 53585, 43342, 33104, 22850, 12608, 2394, 57664, 47440, 37198, 26947, 16753, 6489, 61816, 51554, 41336, 31098, 20838, 10622, 380, 10269, '6', 30753, 20521, 34855, 47078, 40909, 59354, 53202, 6108, 32756, 18398, 45003, 63440, 57280, 10195, 4077, 22505, 49103, 34791, 60074, 49793, 47766, 37534, 19088, 8888, 6802, 62087, 43676, 33420, 31391, GMTDateParser.SECONDS, 10342, 20594, 30811, 41065, 51320, 61555, 6247, 16508, 26750, 36986, 47200, 57408, 2155, 12355, 22622, 32836, 43094, 53336, 63580, 8270};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1367 = -394936045942593533L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1368 = 176;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1369 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1370;

    public bz(String str) {
        super(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1692(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1370 + 59;
        f1369 = i10 % 128;
        int i11 = i10 % 2;
        m1694(oguryRewardedAd, oguryRewardedAdListener);
        if (i11 == 0) {
            int i12 = 44 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1693(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        f1369 = (f1370 + 69) % 128;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        int i10 = f1370 + 23;
        f1369 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1696(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1370 + 19;
        f1369 = i10 % 128;
        int i11 = i10 % 2;
        m1693(oguryInterstitialAd, oguryInterstitialAdListener);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -1704786309:
                if (!str.equals(m1691((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63804), (ViewConfiguration.getWindowTouchSlop() >> 8) + 20, AndroidCharacter.getMirror('0') + 1).intern())) {
                    return null;
                }
                f1369 = (f1370 + 29) % 128;
                return InterstitialActivity.class;
            case -734879533:
                if (str.equals(m1691((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60133), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 89 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return OguryReward.class;
                }
                return null;
            case 76142724:
                if (str.equals(m1691((char) (10322 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "") + 5, 69 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    return Ogury.class;
                }
                return null;
            case 82913255:
                if (str.equals(m1695((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 280, 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "�\n\u000b\f\u0001\f\u0001\ufff9\u0004\uffd9￼￤\u0001\u000b\f�\u0006�\n\uffe7\uffff\r\n\u0011￡\u0006\f", 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false).intern())) {
                    return OguryInterstitialAdListener.class;
                }
                return null;
            case 186993737:
                if (str.equals(m1695(278 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 24, "\u000e\r\u0003￦\ufffeￛ\ufffe\uffff\ufffe\f\ufffb\u0011\uffff￬\u0013\f\u000f\u0001￩\f\uffff\b\uffff", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, true).intern())) {
                    return OguryRewardedAdListener.class;
                }
                return null;
            case 1169123445:
                if (str.equals(m1691((char) (47065 - AndroidCharacter.getMirror('0')), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, ((byte) KeyEvent.getModifierMetaStateMask()) + 75).intern())) {
                    return OguryRewardedAd.class;
                }
                return null;
            case 1789379091:
                if (!str.equals(m1695((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 280, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, "\u000e\u0000￨�ￚ\u0005\ufffa\u0002\r\u0002\r\f\u000b\ufffe\r\u0007￢\u0012\u000b", 3 - TextUtils.indexOf("", "", 0), true).intern())) {
                    return null;
                }
                int i10 = (f1369 + 85) % 128;
                f1370 = i10;
                f1369 = (i10 + 109) % 128;
                int i11 = i10 + 5;
                f1369 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 61 / 0;
                }
                return OguryInterstitialAd.class;
            case 1866202823:
                if (str.equals(m1691((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getCapsMode("", 0, 0) + 49, TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern())) {
                    return InterstitialActivity.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1695(280 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 25 - Color.green(0), "�\u000b\n�\u0006�\f\u000b\u0001￤￼\uffd9\u0004\ufff9\u0001\f\u0001\f\u000b\n�\f\u0006￡\f", 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bz.m1696((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1691((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, 100 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bz.m1692((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        f1369 = (f1370 + 81) % 128;
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1695(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f1368);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1370 + 57;
        f1369 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Ogury.getSdkVersion();
                throw null;
            }
            String sdkVersion = Ogury.getSdkVersion();
            int i11 = f1369 + 17;
            f1370 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 16 / 0;
            }
            return sdkVersion;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1694(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1369 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1370 = i10 % 128;
        int i11 = i10 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1691(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1366[i11 + i12] ^ (i12 * f1367)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
