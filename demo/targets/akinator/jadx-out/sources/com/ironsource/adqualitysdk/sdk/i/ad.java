package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.az;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ad extends y<View, Activity> {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f294 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f295 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f296 = 118;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Class f299;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private is f302;

    /* renamed from: ｋ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f303;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jl f304;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final Map<WebView, ab> f301 = new WeakHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final Map<View, ad> f305 = new WeakHashMap();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f297 = new WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private c f298 = new c();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final List<View> f300 = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c {

        /* renamed from: ヮ, reason: contains not printable characters */
        private static int f318 = 1;

        /* renamed from: 丫, reason: contains not printable characters */
        private static int f319 = 0;

        /* renamed from: 爫, reason: contains not printable characters */
        private static boolean f320 = true;

        /* renamed from: ﬤ, reason: contains not printable characters */
        private static char[] f321 = {296, 299, 285, 304, 300, 318, 279, 298, 306, 302, 316, 313, 307, 301, 319, 310, 282, 309, 264, 268, 317, 315, 314, 272};

        /* renamed from: טּ, reason: contains not printable characters */
        private static int f322 = 22;

        /* renamed from: סּ, reason: contains not printable characters */
        private static boolean f323 = true;

        /* renamed from: ףּ, reason: contains not printable characters */
        private static int f324 = 199;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private boolean f325;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f330;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f331;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f332;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f333;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f334;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f335;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f336;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f337;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f338;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f339;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private List<Integer> f329 = new ArrayList();

        /* renamed from: ﭴ, reason: contains not printable characters */
        private List<String> f326 = new ArrayList();

        /* renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f327 = new ArrayList();

        /* renamed from: ﮉ, reason: contains not printable characters */
        private List<String> f328 = new ArrayList();

        public c() {
        }

        /* renamed from: ﭖ, reason: contains not printable characters */
        public static /* synthetic */ boolean m619(c cVar) {
            int i10 = f318 + 43;
            int i11 = i10 % 128;
            f319 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f331;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i11 + 27;
            f318 = i13 % 128;
            if (i13 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* renamed from: ﭴ, reason: contains not printable characters */
        public static /* synthetic */ List m620(c cVar) {
            int i10 = f318;
            int i11 = i10 + 73;
            f319 = i11 % 128;
            int i12 = i11 % 2;
            List<String> list = cVar.f328;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i10 + 29;
            f319 = i13 % 128;
            if (i13 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: ﭸ, reason: contains not printable characters */
        public static /* synthetic */ boolean m621(c cVar) {
            int i10 = f318;
            int i11 = i10 + 13;
            f319 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f336;
            if (i12 != 0) {
                throw null;
            }
            f319 = (i10 + 31) % 128;
            return z10;
        }

        /* renamed from: ﮉ, reason: contains not printable characters */
        public static /* synthetic */ boolean m622(c cVar) {
            int i10 = (f318 + 83) % 128;
            f319 = i10;
            boolean z10 = cVar.f332;
            f318 = (i10 + 37) % 128;
            return z10;
        }

        /* renamed from: ﮌ, reason: contains not printable characters */
        public static /* synthetic */ String m623(c cVar) {
            int i10 = f319 + 21;
            f318 = i10 % 128;
            int i11 = i10 % 2;
            String str = cVar.f338;
            if (i11 == 0) {
                int i12 = 56 / 0;
            }
            return str;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ String m625(c cVar) {
            int i10 = f319 + 39;
            f318 = i10 % 128;
            int i11 = i10 % 2;
            String str = cVar.f339;
            if (i11 != 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ boolean m626(c cVar) {
            int i10 = f318;
            int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f319 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f334;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i10 + 49;
            f319 = i13 % 128;
            if (i13 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ boolean m627(c cVar) {
            int i10 = f319 + 55;
            int i11 = i10 % 128;
            f318 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f325;
            if (i12 == 0) {
                throw null;
            }
            f319 = (i11 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            return z10;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ boolean m629(c cVar) {
            int i10 = f319 + 67;
            f318 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = cVar.f333;
            if (i11 != 0) {
                return z10;
            }
            throw null;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ String m630(c cVar) {
            int i10 = f318;
            f319 = (i10 + 105) % 128;
            String str = cVar.f337;
            f319 = (i10 + 3) % 128;
            return str;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ List m634(c cVar) {
            int i10 = (f318 + 67) % 128;
            f319 = i10;
            List<Integer> list = cVar.f329;
            int i11 = i10 + 97;
            f318 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 76 / 0;
            }
            return list;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ List m639(c cVar) {
            int i10 = f318 + 79;
            int i11 = i10 % 128;
            f319 = i11;
            int i12 = i10 % 2;
            List<String> list = cVar.f326;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i11 + 73;
            f318 = i13 % 128;
            if (i13 % 2 != 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m642(c cVar) {
            int i10 = (f318 + 97) % 128;
            f319 = i10;
            String str = cVar.f335;
            int i11 = i10 + 49;
            f318 = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ boolean m646(c cVar) {
            int i10 = f319 + 15;
            int i11 = i10 % 128;
            f318 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f330;
            if (i12 == 0) {
                int i13 = 99 / 0;
            }
            f319 = (i11 + 93) % 128;
            return z10;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m650(c cVar) {
            int i10 = f319 + 99;
            int i11 = i10 % 128;
            f318 = i11;
            int i12 = i10 % 2;
            List<String> list = cVar.f327;
            if (i12 == 0) {
                int i13 = 9 / 0;
            }
            int i14 = i11 + 61;
            f319 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 4 / 0;
            }
            return list;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        private c m624(boolean z10) {
            int i10 = (f318 + 81) % 128;
            f319 = i10;
            this.f332 = z10;
            int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f318 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 37 / 0;
            }
            return this;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        private c m628(boolean z10) {
            int i10 = f318 + 21;
            f319 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f325 = z10;
                return this;
            }
            this.f325 = z10;
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private c m632(boolean z10) {
            int i10 = f318 + 89;
            f319 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f330 = z10;
                return this;
            }
            this.f330 = z10;
            int i11 = 96 / 0;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private c m635(String str) {
            int i10 = f318 + 15;
            f319 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f339 = str;
                return this;
            }
            this.f339 = str;
            int i11 = 56 / 0;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private c m640(String str) {
            int i10 = f319 + 53;
            f318 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f338 = str;
                return this;
            }
            this.f338 = str;
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private c m643(String str) {
            int i10 = f319;
            this.f337 = str;
            int i11 = i10 + 111;
            f318 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private c m647(String str) {
            int i10 = f318 + 51;
            f319 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f335 = str;
                return this;
            }
            this.f335 = str;
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private c m641(boolean z10) {
            int i10 = f318;
            this.f331 = z10;
            int i11 = i10 + 79;
            f319 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private c m645(boolean z10) {
            int i10 = (f318 + 65) % 128;
            f319 = i10;
            this.f333 = z10;
            int i11 = i10 + 39;
            f318 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 50 / 0;
            }
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private c m649(boolean z10) {
            int i10 = f319;
            this.f336 = z10;
            f318 = (i10 + 113) % 128;
            return this;
        }

        public c(JSONObject jSONObject) {
            m647(jSONObject.optString(m633("\u0001\ufffe\u0002\n\ufffe￫\u0010\u0010\ufffe\t￠\u0014\u0002\u0006\ufff3", true, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 121 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 2).intern()));
            m643(jSONObject.optString(m638(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0085\u008a\u0081\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m635(jSONObject.optString(m633("\u0004\b￣\t￮\r\u0004\u000e�\uffff", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, 125 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7).intern()));
            m649(jSONObject.optBoolean(m633("\uffff\ufff1\uffff￼\ufff0\u0003\uffff\u0011\uffdd\u0006\u0003\uffff\b\u000e\u000f\r", false, TextUtils.indexOf("", "") + 16, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, View.MeasureSpec.getSize(0) + 14).intern()));
            jSONObject.optBoolean(m633("\uffde\u0007\u0004\u0000\t\u000f\u0010\u000e\u0000\ufff2\u0000�\uffde\u0003\r\n\b\u0000", false, ExpandableListView.getPackedPositionGroup(0L) + 18, View.MeasureSpec.getSize(0) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, '6' - AndroidCharacter.getMirror('0')).intern());
            m640(jSONObject.optString(m638(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u008f\u0084\u008e\u0085\u008c\u0087\u008d\u008c\u008b").intern()));
            m637(jSONObject.optBoolean(m633("\u0000\uffdd\u0001\u0012\u0005\u0010�￪\u000f\u0005", true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, TextUtils.getOffsetAfter("", 0) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, ExpandableListView.getPackedPositionGroup(0L) + 10).intern()));
            m645(jSONObject.optBoolean(m638(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0097\u0096\u0092\u0085\u0095\u0094\u008d\u008d\u0093\u0082\u0092\u0085\u0091\u0085\u0088\u008c\u0090\u008e").intern()));
            m632(jSONObject.optBoolean(m638(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0085\u0095\u0084\u0097\u008c\u008b\u0088\u0085\u008c").intern()));
            m641(jSONObject.optBoolean(m633("\u000b\n\u0006\uffff\b\ufff9\t\ufff7\f\ufff7￠\ufffb\t", true, TextUtils.getOffsetBefore("", 0) + 13, 128 - View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), true));
            m624(jSONObject.optBoolean(m633("\u000b\ufffa￣\f\u000e\f\ufffe\uffde\u0011\r", false, 10 - Color.argb(0, 0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Color.blue(0) + 4).intern()));
            m628(jSONObject.optBoolean(m633("\u0003\b￮\u0002\f\uffff\ufffb\ufffe\n\f\t�\uffff\r\r\ufff0\u0003\uffff\u0011\r￩\b\uffe7\ufffb", false, 23 - MotionEvent.axisFromString(""), 125 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), AndroidCharacter.getMirror('0') - '(').intern(), true));
            m636(kc.m3195(jSONObject.optJSONArray(m638(null, null, KeyEvent.keyCodeFromString("") + 127, "\u0097\u0082\u0098\u0086\u0085\u0084\u0095").intern())));
            m644(kc.m3195(jSONObject.optJSONArray(m633("\u000b�\u0001\f\u0001\u000e\u0001\f\ufffb\ufff9�\n\u0007\u0006\uffff￡\u0007￬", true, 17 - Process.getGidForName(""), 126 - TextUtils.getOffsetBefore("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 10).intern())));
            m631(kc.m3195(jSONObject.optJSONArray(m633("\u0005\ufffe￠\u0006￫\n\u000e￼\u0000\r￼\t\u0006", true, View.MeasureSpec.getMode(0) + 13, 127 - (ViewConfiguration.getTapTimeout() >> 16), 9 - Process.getGidForName("")).intern())));
            m648(kc.m3195(jSONObject.optJSONArray(m633("￥\t￮\r\uffff\r\r\ufffb\u0006�\n\uffff\uffff", true, 13 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, TextUtils.getCapsMode("", 0, 0) + 10).intern())));
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private c m631(List<String> list) {
            int i10 = f318 + 89;
            int i11 = i10 % 128;
            f319 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (list != null) {
                this.f327 = list;
                f318 = (i11 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            }
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private c m637(boolean z10) {
            int i10 = f318;
            this.f334 = z10;
            f319 = (i10 + 71) % 128;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
        /* renamed from: ﾇ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.ironsource.adqualitysdk.sdk.i.ad.c m644(java.util.List<java.lang.String> r3) {
            /*
                r2 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ad.c.f319
                int r0 = r0 + 115
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ad.c.f318 = r1
                int r0 = r0 % 2
                if (r0 != 0) goto L13
                r0 = 38
                int r0 = r0 / 0
                if (r3 == 0) goto L17
                goto L15
            L13:
                if (r3 == 0) goto L17
            L15:
                r2.f326 = r3
            L17:
                int r1 = r1 + 91
                int r3 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.ad.c.f319 = r3
                int r1 = r1 % 2
                if (r1 == 0) goto L25
                r3 = 21
                int r3 = r3 / 0
            L25:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ad.c.m644(java.util.List):com.ironsource.adqualitysdk.sdk.i.ad$c");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private c m648(List<String> list) {
            if (list != null) {
                f318 = (f319 + 105) % 128;
                this.f328 = list;
            }
            int i10 = f318 + 57;
            f319 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m633(String str, boolean z10, int i10, int i11, int i12) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (e.f2108) {
                try {
                    char[] cArr2 = new char[i10];
                    e.f2107 = 0;
                    while (true) {
                        int i13 = e.f2107;
                        if (i13 >= i10) {
                            break;
                        }
                        e.f2110 = cArr[i13];
                        cArr2[e.f2107] = (char) (e.f2110 + i11);
                        int i14 = e.f2107;
                        cArr2[i14] = (char) (cArr2[i14] - f322);
                        e.f2107 = i14 + 1;
                    }
                    if (i12 > 0) {
                        e.f2109 = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = e.f2109;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = e.f2109;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        e.f2107 = 0;
                        while (true) {
                            int i17 = e.f2107;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
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

        /* renamed from: ﻛ, reason: contains not printable characters */
        private c m636(List<Integer> list) {
            int i10 = f318;
            f319 = (i10 + 99) % 128;
            if (list != null) {
                this.f329 = list;
            }
            f319 = (i10 + 37) % 128;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m638(String str, int[] iArr, int i10, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f321;
                    int i11 = f324;
                    if (f323) {
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
                    if (f320) {
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
    }

    public ad(JSONObject jSONObject, is isVar) {
        m611(jSONObject, isVar);
        m600();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Class m592(ad adVar) {
        int i10 = f295;
        f294 = (i10 + 23) % 128;
        Class cls = adVar.f299;
        f294 = (i10 + 29) % 128;
        return cls;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m596(ad adVar) {
        int i10 = f294 + 67;
        int i11 = i10 % 128;
        f295 = i11;
        int i12 = i10 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = adVar.f303;
        if (i12 == 0) {
            int i13 = 72 / 0;
        }
        int i14 = i11 + 33;
        f294 = i14 % 128;
        if (i14 % 2 == 0) {
            return onLayoutChangeListener;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ c m599(ad adVar) {
        int i10 = f295;
        int i11 = i10 + 59;
        f294 = i11 % 128;
        int i12 = i11 % 2;
        c cVar = adVar.f298;
        if (i12 != 0) {
            int i13 = 36 / 0;
        }
        int i14 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f294 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 19 / 0;
        }
        return cVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m604(ad adVar) {
        int i10 = f295;
        f294 = (i10 + 91) % 128;
        List<View> list = adVar.f300;
        f294 = (i10 + 33) % 128;
        return list;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m607(ad adVar) {
        int i10 = f295 + 65;
        int i11 = i10 % 128;
        f294 = i11;
        int i12 = i10 % 2;
        Map<View, View.OnLayoutChangeListener> map = adVar.f297;
        if (i12 != 0) {
            int i13 = 29 / 0;
        }
        int i14 = i11 + 69;
        f295 = i14 % 128;
        if (i14 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m594(List<View> list) throws JSONException {
        int i10 = 0;
        while (i10 < list.size()) {
            f295 = (f294 + 11) % 128;
            m605(list.get(i10), this.f298);
            i10++;
            f294 = (f295 + 35) % 128;
        }
        int i11 = f295 + 21;
        f294 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m598(ad adVar, List list) throws JSONException {
        f294 = (f295 + 59) % 128;
        adVar.m594((List<View>) list);
        f295 = (f294 + 69) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m605(android.view.View r11, com.ironsource.adqualitysdk.sdk.i.ad.c r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ad.m605(android.view.View, com.ironsource.adqualitysdk.sdk.i.ad$c):void");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m606() {
        int i10 = (f294 + 31) % 128;
        f295 = i10;
        f294 = (i10 + 109) % 128;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* renamed from: ｋ */
    public final /* synthetic */ String mo575(Activity activity) {
        f294 = (f295 + 33) % 128;
        String strM606 = m606();
        f295 = (f294 + 49) % 128;
        return strM606;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m601(Activity activity, View view, Class cls, boolean z10, List list, List list2, List list3) {
        f294 = (f295 + 23) % 128;
        m608(activity, view, cls, z10, list, list2, list3);
        f295 = (f294 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <E extends View> void m608(Activity activity, View view, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        int i10 = f294 + 19;
        f295 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (view != null) {
            ke.m3213(view, cls, false, z10, list, list2, list3);
            return;
        }
        ke.m3211(activity, cls, z10, list, list2, list3);
        int i11 = f294 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f295 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m609() {
        m3417((s) null);
        ji.m3008().m3012(this.f304);
        HashSet hashSet = new HashSet(this.f297.keySet());
        this.f297.clear();
        Iterator it = hashSet.iterator();
        f295 = (f294 + 81) % 128;
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f303);
            f294 = (f295 + 103) % 128;
        }
        f295 = (f294 + 61) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m611(JSONObject jSONObject, is isVar) {
        this.f298 = new c(jSONObject);
        this.f302 = isVar;
        f294 = (f295 + 65) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m595(View view) {
        if (this.f302 == null) {
            f294 = (f295 + 57) % 128;
            return true;
        }
        if (!m602(view, (List<String>) c.m620(this.f298)) || !this.f302.mo2059(view)) {
            return false;
        }
        f295 = (f294 + 43) % 128;
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m600() {
        this.f303 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f308 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f309 = {50331, 4645, 27050, 18233, 40584, 62508, 50104, 6402, 28836, 20010, 42403, 62250, 51876, 8242, 'E', 55027, 44400, 33772, 23158, 12453, 1903, 56809, 46120, 35558, 24932, 14279, 3693, 58612, 47969, 37370, 26724, 16082, 5498, 60402, 49786, 39154, 28531};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f310 = 610115343515309697L;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f311 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m618(char c10, int i10, int i11) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1373) {
                    try {
                        char[] cArr = new char[i11];
                        com.ironsource.adqualitysdk.sdk.i.c.f1374 = 0;
                        while (true) {
                            int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1374;
                            if (i12 < i11) {
                                cArr[i12] = (char) ((f309[i10 + i12] ^ (i12 * f310)) ^ c10);
                                com.ironsource.adqualitysdk.sdk.i.c.f1374 = i12 + 1;
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                f311 = (f308 + 31) % 128;
                try {
                    ad.this.m610(view);
                    int i18 = f308 + 1;
                    f311 = i18 % 128;
                    if (i18 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    kd.m3203(m618((char) (50380 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.green(0), 14 - Drawable.resolveOpacity(0, 0)).intern(), m618((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 14 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23).intern(), th2, false);
                }
            }
        };
        this.f304 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.2
            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* renamed from: ﻛ */
            public final void mo543(View view) {
                view.removeOnLayoutChangeListener(ad.m596(ad.this));
                ad.m607(ad.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* renamed from: ﾇ */
            public final void mo548(View view) {
                view.addOnLayoutChangeListener(ad.m596(ad.this));
                ad.m607(ad.this).put(view, ad.m596(ad.this));
            }
        };
        ji.m3008().m3011(this.f304);
        f295 = (f294 + 103) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m593(String str, boolean z10, int i10, int i11, int i12) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i10];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i10) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i11);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f296);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
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

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m610(final View view) {
        Activity activityM3210;
        try {
            if (this.f299 == null) {
                int i10 = f295 + 87;
                f294 = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f299 = Class.forName(c.m642(this.f298));
                    f294 = (f295 + 105) % 128;
                } else {
                    this.f299 = Class.forName(c.m642(this.f298));
                    throw null;
                }
            }
            final Activity activityMo2972 = jf.m2969().mo2972();
            if (activityMo2972 == null) {
                return;
            }
            if (c.m639(this.f298).isEmpty() || (activityM3210 = ke.m3210(view)) == null || !c.m639(this.f298).contains(activityM3210.getClass().getName())) {
                p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() throws JSONException {
                        ad.m604(ad.this).clear();
                        ad.m601(activityMo2972, view, ad.m592(ad.this), c.m646(ad.m599(ad.this)), c.m634(ad.m599(ad.this)), c.m650(ad.m599(ad.this)), ad.m604(ad.this));
                        if (ke.m3220(view, ad.m592(ad.this), null, c.m634(ad.m599(ad.this)), c.m650(ad.m599(ad.this)))) {
                            ad.m604(ad.this).add(view);
                        }
                        final ArrayList arrayList = new ArrayList(ad.m604(ad.this));
                        if (c.m627(ad.m599(ad.this))) {
                            p.m3253(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.5.1
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() throws JSONException {
                                    ad.m598(ad.this, arrayList);
                                }
                            });
                        } else {
                            ad.m598(ad.this, arrayList);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            String strIntern = m593("\u0001\uffde\u0014\u0002\u0006\ufff3\u000f\u0002\t\u0001\u000b\ufffe￥\u0010", true, 14 - Drawable.resolveOpacity(0, 0), 216 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m593("\b\u0006\u0015\u0015\n\u000f\b\uffc1\u0004\r\u0002\u0014\u0014\uffc1￦\u0013\u0013\u0010\u0013\uffc1", false, ExpandableListView.getPackedPositionChild(0L) + 21, ((byte) KeyEvent.getModifierMetaStateMask()) + 214, 14 - View.MeasureSpec.getMode(0)).intern());
            sb2.append(c.m642(this.f298));
            sb2.append(m593("￼￼\t", false, (Process.myTid() >> 22) + 3, 155 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1 - KeyEvent.normalizeMetaState(0)).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
            m609();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m597(String str) {
        f295 = (f294 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List listAsList = Arrays.asList(str.split(m593("￢\u000f\u0011", true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, 194 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Process.getGidForName("") + 3).intern()));
        if (listAsList.size() <= 3) {
            int i10 = f295 + 41;
            f294 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 29 / 0;
            }
            return str;
        }
        return TextUtils.join(m593("\u0000", true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-16777052) - Color.rgb(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), listAsList.subList(0, 3));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m602(View view, List<String> list) {
        if (list != null) {
            f295 = (f294 + 23) % 128;
            if (!list.isEmpty()) {
                String name = view.getClass().getPackage().getName();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String strM597 = m597(it.next());
                    if (!TextUtils.isEmpty(strM597)) {
                        int i10 = f295 + 5;
                        f294 = i10 % 128;
                        if (i10 % 2 == 0) {
                            if (name.startsWith(strM597)) {
                                return true;
                            }
                        } else {
                            name.startsWith(strM597);
                            throw null;
                        }
                    }
                }
                int i11 = f295 + 43;
                f294 = i11 % 128;
                if (i11 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private s<WebView, Activity> m603() {
        az.e eVar = new az.e() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3
            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo612(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                ad.this.mo612(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo614(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                ad.this.mo614(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo577(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                ad.this.mo577(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo580(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                ad.this.mo580(jSONObject, (JSONObject) obj, (WebView) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo616(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                ad.this.mo616(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo613(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                ad.this.mo613(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo615(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                ad.this.mo615(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo617(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                ad.this.mo617(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i10 = f295 + 77;
        f294 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 64 / 0;
        }
        return eVar;
    }
}
