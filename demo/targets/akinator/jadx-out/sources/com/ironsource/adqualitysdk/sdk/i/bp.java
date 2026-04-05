package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bp extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1153 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1154 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1155 = {GMTDateParser.ZONE, 261, 263, 270, 293, 291, 291, 'Q', 180, 204, 207, 204, 196, 203, 187, 176, 177, 183, 204, 207, 209, 206, 203, 202, 198, 201, '9', GMTDateParser.YEAR, 'R', GMTDateParser.YEAR, 'W', 'j', 'n', 'o', GMTDateParser.MINUTES, 'S', 'Q', 'g', 'n', 'i', '\'', 'W', 'j', 'n', 'o', GMTDateParser.MINUTES, 'S', 'R', 'P', 152, 145, 137, 142, 157, 150, 149, 150, 149, 154, 139, 139, 147, 144, 154, 150, 148, 151, 128, 'Z', 174, 169, 167, 170, 170, 154, 163, 182, 173, 165, 166, 165, 171, 179, 157, 154, 169, 165, 172, 160, 137, GMTDateParser.MINUTES, 145, 130, 132, 129, '^', 138, 140, 143, 'c', 129, 'f', 145, 139, 130, 138, 130, 128, '~', 130, 'e', AbstractJsonLexerKt.END_OBJ, 'Z', 141, '~', 140, 139, '~', 135, '~', 141, 140, '3', 'f', 'l', 'Z', AbstractJsonLexerKt.BEGIN_LIST, 'l', 'f', 'g', 'i', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, GMTDateParser.YEAR, GMTDateParser.YEAR, 'l', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.SECONDS, 'p', 'n', 'V', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'g', '_', 'g', 'n', 'e', 'f', 't', 'j', 'X', 'X', 'o', 21, 'D', 'E', 'I', '`', AbstractJsonLexerKt.BEGIN_LIST, '_', '`', AbstractJsonLexerKt.END_LIST, 'D', AbstractJsonLexerKt.COMMA};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1156 = 171;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends WeakHashMap<View, WeakReference<Object>> implements hc<WeakHashMap<View, WeakReference<Object>>> {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static short[] f1166 = null;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f1167 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static byte[] f1168 = {-68, -71, -29, 30, 122, -23, -44, -61, -77, -50, -41, -101, -26, -68, -22, -83, -3, -100, -55, -21, -77, -51, -51};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f1169 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f1170 = -854496880;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f1171 = 91;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f1172 = 1993697581;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ch f1173;

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
            super(weakHashMap);
            this.f1173 = chVar;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m1419() {
            int i10 = f1167;
            int i11 = i10 + 107;
            f1169 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            int i12 = i10 + 31;
            f1169 = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m1420(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f1171;
                    int i14 = i10 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f1168;
                        i14 = bArr != null ? (byte) (bArr[f1172 + i11] + i13) : (short) (f1166[f1172 + i11] + i13);
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i11 + i14) - 2) + f1172 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f1170);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f1168;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f1166;
                                int i17 = n.f3165;
                                n.f3165 = i17 - 1;
                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                            }
                            sb2.append(n.f3162);
                            n.f3161 = n.f3162;
                            n.f3164++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Object> m1421(View view, WeakReference<Object> weakReference) {
            f1167 = (f1169 + 83) % 128;
            bp.this.m1169(this, this.f1173, m1420(Color.green(0) - 92, (short) ((-78) - TextUtils.lastIndexOf("", '0', 0)), (-1993697581) - TextUtils.indexOf("", "", 0, 0), (byte) ((Process.myPid() >> 22) - 109), TextUtils.indexOf((CharSequence) "", '0') + 854496959).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i10 = f1169 + 51;
            f1167 = i10 % 128;
            if (i10 % 2 == 0) {
                return weakReference2;
            }
            throw null;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f1169 + 45;
            f1167 = i10 % 128;
            View view = (View) obj;
            WeakReference<Object> weakReference = (WeakReference) obj2;
            if (i10 % 2 != 0) {
                m1421(view, weakReference);
                throw null;
            }
            WeakReference<Object> weakReferenceM1421 = m1421(view, weakReference);
            f1169 = (f1167 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            return weakReferenceM1421;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hc
        /* renamed from: ｋ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo1115() {
            f1169 = (f1167 + 97) % 128;
            WeakHashMap<View, WeakReference<Object>> weakHashMapM1419 = m1419();
            int i10 = f1169 + 97;
            f1167 = i10 % 128;
            if (i10 % 2 == 0) {
                return weakHashMapM1419;
            }
            throw null;
        }
    }

    public bp(String str) {
        super(str);
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ DynamicLoader m1399() {
        f1154 = (f1153 + 9) % 128;
        DynamicLoader dynamicLoaderM1402 = m1402();
        f1154 = (f1153 + 59) % 128;
        return dynamicLoaderM1402;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static String m1400() {
        int i10 = f1153 + 51;
        f1154 = i10 % 128;
        int i11 = i10 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strIntern = (i11 != 0 ? m1407((jElapsedRealtime > 1L ? 1 : (jElapsedRealtime == 1L ? 0 : -1)) + 14141, KeyEvent.normalizeMetaState(1) * 50, "\u000b\u000b\u0007￮\u0001\u0013�\u000e\u0000\u0001\u0000\ufff2\u0005\u0000\u0001\u000b￡\n\u0000\uffdf�\u000e\u0000￩�\u000e\u0007\u0011\f\u0002�\uffff\u0001\ufffe", 41 / (ViewConfiguration.getScrollBarFadeDuration() >> 106), false) : m1407(272 - (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 34, "\u000b\u000b\u0007￮\u0001\u0013�\u000e\u0000\u0001\u0000\ufff2\u0005\u0000\u0001\u000b￡\n\u0000\uffdf�\u000e\u0000￩�\u000e\u0007\u0011\f\u0002�\uffff\u0001\ufffe", 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false)).intern();
        f1153 = (f1154 + 23) % 128;
        return strIntern;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m1401() {
        int i10 = f1153 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1154 = i10 % 128;
        return (i10 % 2 != 0 ? m1407(6951 << (ViewConfiguration.getWindowTouchSlop() >>> Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), TextUtils.indexOf((CharSequence) "", '7', 0) * 80, "\f\ufffa\ufffe\u000b\ufffa\u0005\u000e￩", 4 >> (ViewConfiguration.getScrollDefaultDelay() >>> 53), false) : m1407((ViewConfiguration.getWindowTouchSlop() >> 8) + 278, 7 - TextUtils.indexOf((CharSequence) "", '0', 0), "\f\ufffa\ufffe\u000b\ufffa\u0005\u000e￩", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, true)).intern();
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static DynamicLoader m1402() {
        f1154 = (f1153 + 23) % 128;
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i10 = f1153 + 89;
        f1154 = i10 % 128;
        if (i10 % 2 == 0) {
            return dynamicLoader;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1403() {
        int i10 = f1153 + 77;
        f1154 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1401();
        }
        m1401();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1404() {
        int i10 = f1153 + 85;
        f1154 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1400();
        }
        m1400();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1405(AdView adView) {
        f1154 = (f1153 + 27) % 128;
        String strM1409 = m1409(adView);
        int i10 = f1154 + 43;
        f1153 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1409;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdPlacementType m1406(AdAdapter adAdapter) {
        int i10 = f1154 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1153 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType adPlacementTypeM1414 = m1414(adAdapter);
        if (i11 == 0) {
            int i12 = 30 / 0;
        }
        return adPlacementTypeM1414;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ WeakHashMap m1411(bp bpVar, WeakHashMap weakHashMap, ch chVar) {
        f1153 = (f1154 + 105) % 128;
        WeakHashMap<View, WeakReference<Object>> weakHashMapM1416 = bpVar.m1416((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        f1153 = (f1154 + 63) % 128;
        return weakHashMapM1416;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1415(Ad ad2) {
        f1154 = (f1153 + 45) % 128;
        String strM1418 = m1418(ad2);
        int i10 = f1153 + 109;
        f1154 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1418;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1418(Ad ad2) {
        f1154 = (f1153 + 61) % 128;
        String placementId = ad2.getPlacementId();
        int i10 = f1154 + 85;
        f1153 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 56 / 0;
        }
        return placementId;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1412(AdView adView, AdListener adListener) {
        f1153 = (f1154 + 33) % 128;
        m1408(adView, adListener);
        f1154 = (f1153 + 103) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1417(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        f1154 = (f1153 + 29) % 128;
        m1413(interstitialAd, interstitialAdListener);
        f1154 = (f1153 + 63) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1153 = (f1154 + 5) % 128;
        try {
            try {
                try {
                    String str = (String) hu.m2670().m2673().m2614(AdSdkVersion.class, String.class).get(null);
                    f1154 = (f1153 + 59) % 128;
                    return str;
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return (String) hu.m2670().m2673().m2614(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            return hu.m2670().m2672().m2723(BuildConfig.class, m1410("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", true, new int[]{159, 11, 0, 9}).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(m1407(View.resolveSize(0, 0) + 272, 16 - KeyEvent.keyCodeFromString(""), "\u000f\u0004\u0011\u0000ￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r￩￼", 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false).intern())) {
                    return NativeAdListener.class;
                }
                return null;
            case -1585374524:
                if (str.equals(m1407(ExpandableListView.getPackedPositionType(0L) + 271, 23 - View.resolveSize(0, 0), "\u0001\u0000\u000e�\u0013\u0001￮\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0000\uffdd\u000b\u0001\u0000\u0005\ufff2\u0000", ImageFormat.getBitsPerPixel(0) + 8, true).intern())) {
                    return RewardedVideoAdListener.class;
                }
                return null;
            case -1513928064:
                if (!str.equals(m1407(View.MeasureSpec.getMode(0) + 270, (ViewConfiguration.getJumpTapTimeout() >> 16) + 40, "ￋ\u0003\ufffe\u0000\u0002\uffff\f\f\bￋ\ufffe\u0001\u0010ￋ\uffde\u0012\u0001\u0006\u0002\u000b\u0000\u0002￫\u0002\u0011\u0014\f\u000f\b\uffde\u0000\u0011\u0006\u0013\u0006\u0011\u0016\u0000\f\n", 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false).intern())) {
                    return null;
                }
                int i10 = f1154 + 7;
                f1153 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return AudienceNetworkActivity.class;
            case -1256969519:
                if (str.equals(m1410("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", true, new int[]{48, 20, 42, 0}).intern())) {
                    return CircularProgressView.class;
                }
                return null;
            case -501313640:
                if (str.equals(m1407(272 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 20, "￡￼\ufffe\u000f\n\r\u0014\uffdf\u0014\t￼\b\u0004\ufffe\uffe7\n￼\uffff\u0000\r", 7 - TextUtils.getOffsetAfter("", 0), false).intern())) {
                    return DynamicLoaderFactory.class;
                }
                return null;
            case -498709917:
                if (!str.equals(m1407(KeyEvent.getDeadChar(0, 0) + 274, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\r\ufffe\u000b\f\r\u0002\r\u0002\ufffa\u0005ￚ�￥\u0002\f\r\ufffe\u0007\ufffe\u000b￢\u0007", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, false).intern())) {
                    return null;
                }
                f1154 = (f1153 + 107) % 128;
                return InterstitialAdListener.class;
            case -105717264:
                if (str.equals(m1407(269 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 15 - TextUtils.getOffsetBefore("", 0), "\r\u0003\u0002\u0007\ufff4\u0002\u0003\u0002\u0010\uffff\u0015\u0003\ufff0\u0002\uffdf", 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true).intern())) {
                    return RewardedVideoAd.class;
                }
                return null;
            case 2115:
                if (str.equals(m1407(253 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\uffef\u0012", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true).intern())) {
                    return Ad.class;
                }
                return null;
            case 289409084:
                if (!str.equals(m1407(KeyEvent.getDeadChar(0, 0) + 271, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0015\f\u0001\uffdd\u0000￬\b�\uffff\u0001\t\u0001\n\u0010\ufff0", Color.argb(0, 0, 0, 0) + 3, false).intern())) {
                    return null;
                }
                f1153 = (f1154 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                return AdPlacementType.class;
            case 320151695:
                if (str.equals(m1407((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 272, Color.blue(0) + 14, "\u0003\u000e\u0003\ufffb\u0006ￛ\ufffe￣\b\u000e\uffff\f\r\u000e", 7 - View.getDefaultSize(0, 0), false).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 435867927:
                if (str.equals(m1410("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true, new int[]{68, 21, 67, 0}).intern())) {
                    return al.m796();
                }
                return null;
            case 488344453:
                if (str.equals(m1410("\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false, new int[]{0, 7, 179, 0}).intern())) {
                    return AdError.class;
                }
                return null;
            case 535330969:
                if (str.equals(m1407(274 - Color.alpha(0), 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\b\u0010\r\ufffe\uffe7\ufffe￼\u0007\ufffe\u0002�\u000eￚ\u0012\r\u0002\u000f\u0002\r￼ￚ\u0004\u000b", View.MeasureSpec.getSize(0) + 13, true).intern())) {
                    return AudienceNetworkActivity.class;
                }
                return null;
            case 553704929:
                if (str.equals(m1410("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001", false, new int[]{7, 19, 94, 0}).intern())) {
                    return DisplayAdController.class;
                }
                return null;
            case 1165508119:
                if (str.equals(m1407(271 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, "\u000e\uffdd\u0000￨\u0005\u000f\u0010\u0001\n\u0001", ExpandableListView.getPackedPositionType(0L) + 1, false).intern())) {
                    return AdListener.class;
                }
                return null;
            case 1237162638:
                if (!str.equals(m1407(267 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0002￩\f\u0002\u0006\ufff8\u0005￢\u0006\u0017\n\u0015\u0002\uffef￣\ufff5\u0011\u0002￮\t\u0014", 16 - TextUtils.getCapsMode("", 0, 0), true).intern())) {
                    return null;
                }
                int i11 = f1153 + 47;
                f1154 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                return b.class;
            case 1476063628:
                if (!str.equals(m1407(((byte) KeyEvent.getModifierMetaStateMask()) + 268, 9 - KeyEvent.keyCodeFromString(""), "\u0004￡\u0012\u0005\u0014\u0010\u0001\u0004￡", 2 - Gravity.getAbsoluteGravity(0, 0), true).intern())) {
                    return null;
                }
                f1154 = (f1153 + 71) % 128;
                return AdAdapter.class;
            case 1838933446:
                if (str.equals(m1410("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{26, 14, 0, 3}).intern())) {
                    return NativeBannerAd.class;
                }
                return null;
            case 1908493505:
                if (str.equals(m1407(265 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + 23, "\u0011\u000f\uffd0\b\u0003\u0005\u0007\u0004\u0011\u0011\r\uffd0\u0003\u0006\u0015\uffd0￣\u0006\ufff8\u000b\u0007\u0019\u0005", 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), false).intern())) {
                    return AdView.class;
                }
                return null;
            case 1955913096:
                if (str.equals(m1407(267 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 6, "\u0005\u0017￡\u0004\ufff6\t", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, false).intern())) {
                    return AdView.class;
                }
                return null;
            case 2035065003:
                if (str.equals(m1407(267 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - View.MeasureSpec.getSize(0), "￡\u0004￢\u0001\u0013\u0005￮\u0001\u0014\t\u0016\u0005", Color.blue(0) + 6, false).intern())) {
                    return NativeAdBase.class;
                }
                return null;
            case 2035668095:
                if (str.equals(m1407(270 - Gravity.getAbsoluteGravity(0, 0), 12 - TextUtils.getCapsMode("", 0, 0), "￫\u0014\u0002\u0006\ufff3\u0001\uffde\u0002\u0013\u0006\u0011\ufffe", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true).intern())) {
                    return NativeAdView.class;
                }
                return null;
            case 2110329530:
                if (str.equals(m1410("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{40, 8, 0, 0}).intern())) {
                    return NativeAd.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1409(AdView adView) {
        f1154 = (f1153 + 63) % 128;
        String placementId = adView.getPlacementId();
        f1154 = (f1153 + 47) % 128;
        return placementId;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1407((-16776946) - Color.rgb(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, "\u0002\u000b\u0011￦\u0001￣\u000f\f\n\uffde\u0001\ufff3\u0006\u0002\u0014\u0004\u0002\u0011￭\t\ufffe\u0000\u0002\n", ExpandableListView.getPackedPositionGroup(0L) + 15, false).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1405((AdView) list.get(0));
            }
        });
        map.put(m1410((String) null, true, new int[]{89, 20, 29, 5}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1415((Ad) list.get(0));
            }
        });
        map.put(m1410((String) null, true, new int[]{109, 13, 25, 7}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bp.m1412((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m1410("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, new int[]{Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 37, 0, 0}).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1403();
            }
        });
        map.put(m1407(273 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - (ViewConfiguration.getTapTimeout() >> 16), "\u0001\u0013\uffff￥\n\u000f\u0005\f\ufffb\uffe7\ufffe\f\ufffb\uffdd\ufffe\b\uffdf\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u0005\f\t\u0011\u000e\uffff￨\uffff�\b\uffff\u0003\ufffe\u000fￛ\u000e\uffff", View.MeasureSpec.getMode(0) + 1, true).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1404();
            }
        });
        map.put(m1407(275 - (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 24, "\f�\u0006�\n\u000b�\f￡\u0006\f�\n\u000b\f\u0001\f\ufff9\u0004\uffd9￼￤\u0001\u000b", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, false).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bp.m1417((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1407((ViewConfiguration.getScrollBarSize() >> 8) + 272, (Process.myPid() >> 22) + 16, "\u0014\t￼\b\u0004\ufffe\uffe7\n￼\uffff\u0000\r\u0002\u0000\u000f\uffdf", 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1399();
            }
        });
        map.put(m1407(((byte) KeyEvent.getModifierMetaStateMask()) + 275, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, "￩\u0005\ufffa￼\ufffe\u0006\ufffe\u0007\r￭\u0012\t\ufffe\u0000\ufffe\r", MotionEvent.axisFromString("") + 14, false).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1406((AdAdapter) list.get(0));
            }
        });
        map.put(m1407(TextUtils.indexOf((CharSequence) "", '0', 0) + 269, 27 - View.resolveSizeAndState(0, 0, 0), "\u0003￠\u0004\u0015\b\u0013\u0000￭￡\ufff3\u0004\u0013\u0000\u0004\u0011\u0002\u000f\u0000￬\u0007\u0012\u0000\uffe7\n\u0000\u0004\ufff6", 16 - TextUtils.indexOf("", ""), true).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bp.m1411(bp.this, (WeakHashMap) list.get(0), chVar);
            }
        });
        f1153 = (f1154 + 29) % 128;
        return map;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1413(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        f1153 = (f1154 + 57) % 128;
        interstitialAd.setAdListener(interstitialAdListener);
        f1154 = (f1153 + 49) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1410(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f1155, i10, cArr, 0, i11);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdPlacementType m1414(AdAdapter adAdapter) {
        int i10 = f1153 + 91;
        f1154 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        if (i11 != 0) {
            int i12 = 39 / 0;
        }
        return placementType;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m1416(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
        b bVar = new b(weakHashMap, chVar);
        f1153 = (f1154 + 39) % 128;
        return bVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1408(AdView adView, AdListener adListener) {
        int i10 = f1154 + 79;
        f1153 = i10 % 128;
        int i11 = i10 % 2;
        adView.setAdListener(adListener);
        if (i11 == 0) {
            throw null;
        }
        f1153 = (f1154 + 39) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1407(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1156);
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
}
