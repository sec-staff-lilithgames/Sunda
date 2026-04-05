package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.aq;
import com.ironsource.adqualitysdk.sdk.i.jb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.pairip.VMRunner;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q extends IronSourceAdQuality {

    /* renamed from: リ, reason: contains not printable characters */
    private static char[] f3173 = null;

    /* renamed from: ヮ, reason: contains not printable characters */
    private static int f3174 = 1;

    /* renamed from: 丫, reason: contains not printable characters */
    private static long f3175;

    /* renamed from: 乁, reason: contains not printable characters */
    private static int f3176;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static q f3177;

    /* renamed from: 爫, reason: contains not printable characters */
    private an f3178;

    /* renamed from: טּ, reason: contains not printable characters */
    private iw f3180;

    /* renamed from: סּ, reason: contains not printable characters */
    private aj f3181;

    /* renamed from: ףּ, reason: contains not printable characters */
    private jb f3182;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private ah f3183;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private iy f3184;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private aw f3185;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private ISAdQualityAdListener f3186;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Context f3188;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityConfig f3195;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final as f3196 = new as();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3193 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f3194 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3189 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f3190 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3191 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3192 = ISAdQualityLogLevel.INFO;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3179 = new CopyOnWriteArraySet();

    /* renamed from: ﮌ, reason: contains not printable characters */
    private final ak f3187 = new ak();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.q$4, reason: invalid class name */
    public class AnonymousClass4 implements at {

        /* renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f3211;

        /* renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ boolean f3212;

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Context f3213;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ boolean f3214;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ String f3215;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.q$4$2, reason: invalid class name */
        public class AnonymousClass2 extends iu {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.ironsource.adqualitysdk.sdk.i.q$4$2$5, reason: invalid class name */
            public class AnonymousClass5 extends iu {

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int f3217 = 0;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f3219 = 1;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f3218 = {45744, 14244, 47243, 15851, 42624, 11046, 44043, 4470, 39509, 7340, 33193, 2809, 36827, 28734};

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static long f3220 = 3711244186366346526L;

                public AnonymousClass5() {
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m3319(char c10, int i10, int i11) {
                    String str;
                    synchronized (c.f1373) {
                        try {
                            char[] cArr = new char[i11];
                            c.f1374 = 0;
                            while (true) {
                                int i12 = c.f1374;
                                if (i12 < i11) {
                                    cArr[i12] = (char) ((f3218[i10 + i12] ^ (i12 * f3220)) ^ c10);
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    q.m3267(q.this).m2927(m3319((char) (45782 - Color.blue(0)), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), 14 - (Process.myPid() >> 22)).intern(), new jb.b() { // from class: com.ironsource.adqualitysdk.sdk.i.q.4.2.5.2

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3222 = 1;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3223 = 0;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static long f3224 = 7625254096969371826L;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static String m3320(String str, int i10) {
                            String str2;
                            char[] charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (j.f2852) {
                                try {
                                    j.f2850 = i10;
                                    char[] cArr2 = new char[cArr.length];
                                    j.f2851 = 0;
                                    while (true) {
                                        int i11 = j.f2851;
                                        if (i11 < cArr.length) {
                                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f3224);
                                            j.f2851++;
                                        } else {
                                            str2 = new String(cArr2);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.jb.b
                        /* renamed from: ﾇ */
                        public final void mo2931(String str) {
                            int i10 = f3223 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                            f3222 = i10 % 128;
                            if (i10 % 2 == 0) {
                                TextUtils.isEmpty(str);
                                throw null;
                            }
                            final boolean zIsEmpty = TextUtils.isEmpty(str);
                            if (zIsEmpty) {
                                q.m3267(q.this).m2925(m3320("郔틇ᓡ嚞飸\udaa9ᱍ幯耉숧Л䟄觻쮙", 16920 - Process.getGidForName("")).intern(), m3320("郔瀆兴㊾ᎃ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 57556).intern(), null);
                            }
                            p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.q.4.2.5.2.2

                                /* renamed from: ﻐ, reason: contains not printable characters */
                                private static int f3226 = 121;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static int f3227 = 0;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static int f3228 = 1;

                                /* renamed from: ｋ, reason: contains not printable characters */
                                private static String m3321(boolean z10, int i11, int i12, int i13, String str2) {
                                    String str3;
                                    char[] charArray = str2;
                                    if (str2 != null) {
                                        charArray = str2.toCharArray();
                                    }
                                    char[] cArr = charArray;
                                    synchronized (e.f2108) {
                                        try {
                                            char[] cArr2 = new char[i13];
                                            e.f2107 = 0;
                                            while (true) {
                                                int i14 = e.f2107;
                                                if (i14 >= i13) {
                                                    break;
                                                }
                                                e.f2110 = cArr[i14];
                                                cArr2[e.f2107] = (char) (e.f2110 + i12);
                                                int i15 = e.f2107;
                                                cArr2[i15] = (char) (cArr2[i15] - f3226);
                                                e.f2107 = i15 + 1;
                                            }
                                            if (i11 > 0) {
                                                e.f2109 = i11;
                                                char[] cArr3 = new char[i13];
                                                System.arraycopy(cArr2, 0, cArr3, 0, i13);
                                                int i16 = e.f2109;
                                                System.arraycopy(cArr3, 0, cArr2, i13 - i16, i16);
                                                int i17 = e.f2109;
                                                System.arraycopy(cArr3, i17, cArr2, 0, i13 - i17);
                                            }
                                            if (z10) {
                                                char[] cArr4 = new char[i13];
                                                e.f2107 = 0;
                                                while (true) {
                                                    int i18 = e.f2107;
                                                    if (i18 >= i13) {
                                                        break;
                                                    }
                                                    cArr4[i18] = cArr2[(i13 - i18) - 1];
                                                    e.f2107 = i18 + 1;
                                                }
                                                cArr2 = cArr4;
                                            }
                                            str3 = new String(cArr2);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str3;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    f3228 = (f3227 + 67) % 128;
                                    ah ahVarM3268 = q.m3268(q.this);
                                    String strIntern = m3321(true, 2 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 229, 7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\ufff3\u0004\b\b�\u0002�").intern();
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    String strIntern2 = null;
                                    if (anonymousClass4.f3211) {
                                        String str2 = anonymousClass4.f3215;
                                        if (str2 != null) {
                                            int i11 = f3228 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                                            f3227 = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                throw null;
                                            }
                                            strIntern2 = str2;
                                        } else {
                                            strIntern2 = m3321(true, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), 231 - TextUtils.indexOf("", "", 0), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\ufffe\ufffe\u0007").intern();
                                            f3228 = (f3227 + 115) % 128;
                                        }
                                    }
                                    aw awVarM3273 = q.m3273(q.this);
                                    new gn(q.m3270(q.this));
                                    q.m3270(q.this);
                                    ahVarM3268.m742(strIntern, js.m3049(strIntern2, awVarM3273, zIsEmpty, q.m3309(q.this)));
                                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                    if (anonymousClass42.f3212) {
                                        q.m3268(q.this).m744();
                                    }
                                    f3228 = (f3227 + 37) % 128;
                                }
                            });
                            f3223 = (f3222 + 113) % 128;
                        }
                    });
                    int i10 = f3219 + 105;
                    f3217 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            }

            public AnonymousClass2() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                if (anonymousClass4.f3214) {
                    q.m3273(q.this).m991(AnonymousClass4.this.f3213, new AnonymousClass5());
                }
            }
        }

        public AnonymousClass4(boolean z10, Context context, boolean z11, String str, boolean z12) {
            this.f3214 = z10;
            this.f3213 = context;
            this.f3211 = z11;
            this.f3215 = str;
            this.f3212 = z12;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.at
        /* renamed from: ﾇ */
        public final void mo667() {
            p.m3247(new AnonymousClass2());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.q$5, reason: invalid class name */
    public class AnonymousClass5 extends iu {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3231 = 1579655598;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f3232 = 90;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3233 = -915701493;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static byte[] f3234 = {-78, 89, -81, -124, 91, 85, -93, 85, -78, 122, -77, 125, -64, 122, -55, 39, -106, 109, -35, -46, -100, 101, 41, -42, 47, -118, 100, 36, -40, 50, -52, 32, -42, 37, 40, -42, 38, -8, 4, 55, 55, -118, -56, 54, -59, 38, -55, -57, 61, 50, 115, -116, 52, 117, -125, 55, 52, -59, 96, -116, -57, 52, -55, 0, -17, 54, -62, 21, -18, 54, 57, -58, 99, -113, -61, 60, -59, 96, -102, -56, 49, 62, -40, 6, 18, -56, 55, 55, -117, -57, 52, -55, 0, -17, 54, -62, 21, -18, 54, 57, -58, 99, -113, -61, 60, -59, 96, -116, -40, 58, -54, 123, -122, Utf8.REPLACEMENT_BYTE, 112, -101, 50, 54, 121, -122, 28, 19, -56, 55, 55, -19, -50, 50, -52, -53, 38, -35, -70, -105, 125, 98, -98, -102, -102, 105, 93, 124, -44, 107, 46, -91, -108, -107, -110, 97, -103, 98, -57, -56, -32, -44, -45, 123, -128, 45, 39, 104, -105, -41, 43, -37, 44, Utf8.REPLACEMENT_BYTE, -61, 47, 125, -5, 41, -33, -12, 43, 37, -45, 37, -62, 10, -61, 13, -64, 36, -56, -55, Utf8.REPLACEMENT_BYTE, -3, 105, -53, -59, 51, -59, 34, -22, 35, -19, 32, -60, -25, 119, 55, -53, 33, -33, 51, -59, 54, 59, -59, 53, -53, -121, 96, -51, 51, -50, -29};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f3235;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ Application f3236;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f3237;

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ Activity f3238;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3240;

        public AnonymousClass5(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3240 = iSAdQualityConfig;
            this.f3237 = str;
            this.f3236 = application;
            this.f3238 = activity;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m3322(int i10, int i11, short s10, int i12, byte b10) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f3232;
                    int i14 = i11 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f3234;
                        i14 = bArr != null ? (byte) (bArr[f3233 + i10] + i13) : (short) (f3235[f3233 + i10] + i13);
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i10 + i14) - 2) + f3233 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f3231);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f3234;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f3235;
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

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            int i10;
            Throwable th2;
            try {
                String userId = this.f3240.getUserId();
                q.m3302(q.this, this.f3240.getLogLevel());
                String strIntern = m3322(915701493 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 91, (short) ((-1) - MotionEvent.axisFromString("")), (-1579655533) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (MotionEvent.axisFromString("") + 95)).intern();
                StringBuilder sb2 = new StringBuilder();
                try {
                    sb2.append(m3322((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 915701505, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 91, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSize(0, 0) - 1579655525, (byte) ((-34) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern());
                    sb2.append(this.f3237);
                    k.m3138(strIntern, sb2.toString());
                    ij.m2822(this.f3236.getApplicationContext()).m2829();
                    q.m3303(q.this, this.f3240.isTestMode());
                    if (this.f3240.isTestMode()) {
                        try {
                            k.m3152(m3322((ViewConfiguration.getJumpTapTimeout() >> 16) + 915701493, (-91) - (KeyEvent.getMaxKeyCode() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8), (Process.myPid() >> 22) - 1579655533, (byte) (94 - KeyEvent.keyCodeFromString(""))).intern(), m3322(915701531 - (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 91, (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-1579655511) - (ViewConfiguration.getTouchSlop() >> 8), (byte) (TextUtils.indexOf("", "", 0) + 55)).intern());
                        } catch (Throwable th3) {
                            th2 = th3;
                            i10 = 915701493;
                            String strIntern2 = m3322(915701677 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-91) - (ViewConfiguration.getTapTimeout() >> 16), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) - 1579655529, (byte) (TextUtils.lastIndexOf("", '0') - 49)).intern();
                            kd.m3198(m3322(i10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-91) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1579655533, (byte) (TextUtils.lastIndexOf("", '0') + 95)).intern(), strIntern2, th2, true, false, true);
                            q.m3301(q.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern2);
                        }
                    }
                    try {
                        Class.forName(m3322(915701626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) - 91, (short) ((-16777216) - Color.rgb(0, 0, 0)), (-1579655501) - Color.argb(0, 0, 0, 0), (byte) (View.combineMeasuredStates(0, 0) + 111)).intern());
                    } catch (Throwable unused) {
                    }
                    Activity activity = this.f3238;
                    if (activity != null) {
                        ju.m3075(activity);
                    } else {
                        ju.m3082(this.f3236);
                    }
                    q.m3309(q.this).m905(this.f3237);
                    q.m3309(q.this).m901(this.f3240.getInitializationSource());
                    q.m3309(q.this).m907(this.f3240.getCoppa());
                    q.m3309(q.this).m909(this.f3240.getDeviceIdType());
                    q.m3309(q.this).m910(this.f3240.getMetaData());
                    Context applicationContext = this.f3236.getApplicationContext();
                    q.m3306(q.this, applicationContext);
                    q.m3296(q.this, new iy(applicationContext));
                    q qVar = q.this;
                    q.m3277(qVar);
                    i10 = 915701493;
                    try {
                        q.m3278(qVar, new jb(applicationContext, ak.m785(), new String(new char[]{'B', '0', 'r', '1', GMTDateParser.SECONDS, 'W', '@', GMTDateParser.SECONDS, 'H', '3', 'r', 'e'})));
                        aq.m814().mo846(applicationContext, q.m3287(q.this), q.m3277(q.this), new aq.a() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.2

                            /* renamed from: ﻐ, reason: contains not printable characters */
                            private static char[] f3250 = {'I', 'S', 'A', GMTDateParser.DAY_OF_MONTH, 'Q', AbstractJsonLexerKt.UNICODE_ESC, 'a', 'l', 'i', 't', 'y', ' ', 'D', 'K', 'c', 'o', 'n', 'f', 'g', GMTDateParser.MINUTES, 'e', 'N', 'w', 'r', 'k'};

                            /* renamed from: ﻛ, reason: contains not printable characters */
                            private static int f3251 = 1;

                            /* renamed from: ｋ, reason: contains not printable characters */
                            private static char f3252 = 5;

                            /* renamed from: ﾒ, reason: contains not printable characters */
                            private static int f3253;

                            @Override // com.ironsource.adqualitysdk.sdk.i.aq.a
                            /* renamed from: ﻛ */
                            public final void mo852() {
                                q qVar2;
                                ISAdQualityInitError iSAdQualityInitError;
                                byte bMyTid;
                                int packedPositionChild;
                                int i11 = f3251 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                                f3253 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    qVar2 = q.this;
                                    iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                                    bMyTid = (byte) (62 >> (Process.myTid() << 23));
                                    packedPositionChild = 98 >> ExpandableListView.getPackedPositionChild(0L);
                                } else {
                                    qVar2 = q.this;
                                    iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                                    bMyTid = (byte) (47 - (Process.myTid() >> 22));
                                    packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 22;
                                }
                                q.m3301(qVar2, iSAdQualityInitError, m3324("\u0014\u0010\u0010\u0015\u0018\u0005\u0014\u0011\u0018\u0014\f\n\u0010\u0011\u000f\u0015\u0013\u000e\u0005\u0012\u009d", bMyTid, packedPositionChild).intern());
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.aq.a
                            /* renamed from: ﾇ */
                            public final void mo853() {
                                q qVar2;
                                ISAdQualityInitError iSAdQualityInitError;
                                byte deadChar;
                                int packedPositionChild;
                                int i11 = f3253 + 97;
                                f3251 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    qVar2 = q.this;
                                    iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                                    deadChar = (byte) (17 << KeyEvent.getDeadChar(1, 1));
                                    packedPositionChild = 78 >> ExpandableListView.getPackedPositionChild(1L);
                                } else {
                                    qVar2 = q.this;
                                    iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                                    deadChar = (byte) (KeyEvent.getDeadChar(0, 0) + 84);
                                    packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 36;
                                }
                                q.m3301(qVar2, iSAdQualityInitError, m3324("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0002\u000b\u000e\f\n\u0013\u0011\u0012\r\u0017\f\u0006\u0010\u0005\u0001\r\u0005\t\u000f\u0018\u0014\nÈ", deadChar, packedPositionChild).intern());
                                f3253 = (f3251 + 85) % 128;
                            }

                            /* renamed from: ﾇ, reason: contains not printable characters */
                            private static String m3324(String str, byte b10, int i11) {
                                String str2;
                                char[] charArray = str;
                                if (str != null) {
                                    charArray = str.toCharArray();
                                }
                                char[] cArr = charArray;
                                synchronized (h.f2445) {
                                    try {
                                        char[] cArr2 = f3250;
                                        char c10 = f3252;
                                        char[] cArr3 = new char[i11];
                                        if (i11 % 2 != 0) {
                                            i11--;
                                            cArr3[i11] = (char) (cArr[i11] - b10);
                                        }
                                        if (i11 > 1) {
                                            h.f2448 = 0;
                                            while (true) {
                                                int i12 = h.f2448;
                                                if (i12 >= i11) {
                                                    break;
                                                }
                                                h.f2450 = cArr[i12];
                                                h.f2449 = cArr[h.f2448 + 1];
                                                if (h.f2450 == h.f2449) {
                                                    cArr3[h.f2448] = (char) (h.f2450 - b10);
                                                    cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                                                } else {
                                                    h.f2447 = h.f2450 / c10;
                                                    h.f2444 = h.f2450 % c10;
                                                    h.f2446 = h.f2449 / c10;
                                                    h.f2443 = h.f2449 % c10;
                                                    if (h.f2444 == h.f2443) {
                                                        h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                                        h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                                        int i13 = (h.f2447 * c10) + h.f2444;
                                                        int i14 = (h.f2446 * c10) + h.f2443;
                                                        int i15 = h.f2448;
                                                        cArr3[i15] = cArr2[i13];
                                                        cArr3[i15 + 1] = cArr2[i14];
                                                    } else if (h.f2447 == h.f2446) {
                                                        h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                                        h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                                        int i16 = (h.f2447 * c10) + h.f2444;
                                                        int i17 = (h.f2446 * c10) + h.f2443;
                                                        int i18 = h.f2448;
                                                        cArr3[i18] = cArr2[i16];
                                                        cArr3[i18 + 1] = cArr2[i17];
                                                    } else {
                                                        int i19 = (h.f2447 * c10) + h.f2443;
                                                        int i20 = (h.f2446 * c10) + h.f2444;
                                                        int i21 = h.f2448;
                                                        cArr3[i21] = cArr2[i19];
                                                        cArr3[i21 + 1] = cArr2[i20];
                                                    }
                                                }
                                                h.f2448 += 2;
                                            }
                                        }
                                        str2 = new String(cArr3);
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                return str2;
                            }
                        }, q.m3305(q.this));
                        q.m3286(q.this, new iw(applicationContext, q.m3287(q.this), q.m3277(q.this).m790()));
                        final String strM3095 = jx.m3095(applicationContext);
                        aq.m814().mo838(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.5

                            /* renamed from: ﮐ, reason: contains not printable characters */
                            private static int f3257 = 1;

                            /* renamed from: ﻐ, reason: contains not printable characters */
                            private static int f3258 = 0;

                            /* renamed from: ﻛ, reason: contains not printable characters */
                            private static char[] f3259 = {GMTDateParser.SECONDS, 'o', GMTDateParser.MINUTES, 'l', 'a', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w'};

                            /* renamed from: ｋ, reason: contains not printable characters */
                            private static char f3260 = 3;

                            /* renamed from: ｋ, reason: contains not printable characters */
                            private static String m3325(String str, byte b10, int i11) {
                                String str2;
                                char[] charArray = str;
                                if (str != null) {
                                    charArray = str.toCharArray();
                                }
                                char[] cArr = charArray;
                                synchronized (h.f2445) {
                                    try {
                                        char[] cArr2 = f3259;
                                        char c10 = f3260;
                                        char[] cArr3 = new char[i11];
                                        if (i11 % 2 != 0) {
                                            i11--;
                                            cArr3[i11] = (char) (cArr[i11] - b10);
                                        }
                                        if (i11 > 1) {
                                            h.f2448 = 0;
                                            while (true) {
                                                int i12 = h.f2448;
                                                if (i12 >= i11) {
                                                    break;
                                                }
                                                h.f2450 = cArr[i12];
                                                h.f2449 = cArr[h.f2448 + 1];
                                                if (h.f2450 == h.f2449) {
                                                    cArr3[h.f2448] = (char) (h.f2450 - b10);
                                                    cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                                                } else {
                                                    h.f2447 = h.f2450 / c10;
                                                    h.f2444 = h.f2450 % c10;
                                                    h.f2446 = h.f2449 / c10;
                                                    h.f2443 = h.f2449 % c10;
                                                    if (h.f2444 == h.f2443) {
                                                        h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                                        h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                                        int i13 = (h.f2447 * c10) + h.f2444;
                                                        int i14 = (h.f2446 * c10) + h.f2443;
                                                        int i15 = h.f2448;
                                                        cArr3[i15] = cArr2[i13];
                                                        cArr3[i15 + 1] = cArr2[i14];
                                                    } else if (h.f2447 == h.f2446) {
                                                        h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                                        h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                                        int i16 = (h.f2447 * c10) + h.f2444;
                                                        int i17 = (h.f2446 * c10) + h.f2443;
                                                        int i18 = h.f2448;
                                                        cArr3[i18] = cArr2[i16];
                                                        cArr3[i18 + 1] = cArr2[i17];
                                                    } else {
                                                        int i19 = (h.f2447 * c10) + h.f2443;
                                                        int i20 = (h.f2446 * c10) + h.f2444;
                                                        int i21 = h.f2448;
                                                        cArr3[i21] = cArr2[i19];
                                                        cArr3[i21 + 1] = cArr2[i20];
                                                    }
                                                }
                                                h.f2448 += 2;
                                            }
                                        }
                                        str2 = new String(cArr3);
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                return str2;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.at
                            /* renamed from: ﾇ */
                            public final void mo667() {
                                int i11 = f3258 + 95;
                                f3257 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    if (aq.m814().mo844(m3325("\u0001\u0002\u0002\u0000\u0004\u0005", (byte) (53 / (ViewConfiguration.getTouchSlop() + 9)), 17 % KeyEvent.normalizeMetaState(1)).intern(), strM3095)) {
                                        return;
                                    }
                                } else if (aq.m814().mo844(m3325("\u0001\u0002\u0002\u0000\u0004\u0005", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 115), KeyEvent.normalizeMetaState(0) + 6).intern(), strM3095)) {
                                    return;
                                }
                                q.m3283(q.this);
                                f3258 = (f3257 + 45) % 128;
                            }
                        });
                        aq.m814().mo835(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.at
                            /* renamed from: ﾇ */
                            public final void mo667() {
                                aq.m814().mo836(q.m3276(q.this));
                            }
                        });
                        q.m3291(q.this, applicationContext);
                        q qVar2 = q.this;
                        q.m3294(qVar2, new ah(applicationContext, q.m3309(qVar2), q.m3277(q.this), this.f3238 != null, strM3095, new r() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.r
                            public void onEvent(final String str) {
                                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.1.2

                                    /* renamed from: ﱟ, reason: contains not printable characters */
                                    private static int f3242 = 0;

                                    /* renamed from: ﺙ, reason: contains not printable characters */
                                    private static char f3243 = 20664;

                                    /* renamed from: ﻏ, reason: contains not printable characters */
                                    private static int f3244 = 1;

                                    /* renamed from: ﻐ, reason: contains not printable characters */
                                    private static char f3245 = 15190;

                                    /* renamed from: ﻛ, reason: contains not printable characters */
                                    private static char f3246 = 48610;

                                    /* renamed from: ﾇ, reason: contains not printable characters */
                                    private static char f3247 = 5058;

                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* renamed from: ﻐ */
                                    public final void mo590() {
                                        f3244 = (f3242 + 51) % 128;
                                        q.m3273(q.this).m995(m3323("\u0e66ૣ虎⒍蔷\uda7b虎⒍䵋ᶓﱲႍ\r濣闬䋤셯ⴕཽ咁쟯닁燭왭", View.MeasureSpec.getSize(0) + 23).intern(), Collections.singletonList(str));
                                        int i11 = f3244 + 23;
                                        f3242 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            throw null;
                                        }
                                    }

                                    /* renamed from: ﻐ, reason: contains not printable characters */
                                    private static String m3323(String str2, int i11) {
                                        String str3;
                                        char[] charArray = str2;
                                        if (str2 != null) {
                                            charArray = str2.toCharArray();
                                        }
                                        char[] cArr = charArray;
                                        synchronized (o.f3166) {
                                            try {
                                                char[] cArr2 = new char[cArr.length];
                                                o.f3167 = 0;
                                                char[] cArr3 = new char[2];
                                                while (true) {
                                                    int i12 = o.f3167;
                                                    if (i12 < cArr.length) {
                                                        cArr3[0] = cArr[i12];
                                                        cArr3[1] = cArr[i12 + 1];
                                                        int i13 = 58224;
                                                        for (int i14 = 0; i14 < 16; i14++) {
                                                            char c10 = cArr3[1];
                                                            char c11 = cArr3[0];
                                                            char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + f3245)) ^ ((c11 >>> 5) + f3243)));
                                                            cArr3[1] = c12;
                                                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3246) ^ ((c12 + i13) ^ ((c12 << 4) + f3247))));
                                                            i13 -= 40503;
                                                        }
                                                        int i15 = o.f3167;
                                                        cArr2[i15] = cArr3[0];
                                                        cArr2[i15 + 1] = cArr3[1];
                                                        o.f3167 = i15 + 2;
                                                    } else {
                                                        str3 = new String(cArr2, 0, i11);
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        return str3;
                                    }
                                });
                            }
                        }));
                        if (!this.f3240.isUserIdSet()) {
                            q.m3309(q.this).m899();
                            userId = q.m3268(q.this).m739();
                        }
                        if (q.this.m3316()) {
                            q.m3268(q.this).m747(new ai() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.4
                                @Override // com.ironsource.adqualitysdk.sdk.i.ai
                                public void onEventReceived(JSONObject jSONObject) {
                                    ip.m2837(q.m3270(q.this), ig.f2670, jSONObject, new Object[0]);
                                }
                            });
                        }
                        q.m3268(q.this).m748(new jb.d() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.9
                            @Override // com.ironsource.adqualitysdk.sdk.i.jb.d
                            /* renamed from: ﾒ */
                            public final void mo2932() {
                                q.m3283(q.this);
                            }
                        });
                        az azVar = new az();
                        q qVar3 = q.this;
                        q.m3295(qVar3, new aw(q.m3276(qVar3), q.m3268(q.this), strM3095, azVar, new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.6
                            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                            public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                                q.m3301(q.this, iSAdQualityInitError, str);
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                            public final void adQualitySdkInitSuccess() {
                                q.m3272(q.this);
                            }
                        }));
                        q.m3273(q.this).m993(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.q.5.8
                            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                            public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                                if (q.m3261(q.this) != null) {
                                    q.m3261(q.this).adClosed(str, iSAdQualityAdType);
                                }
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                            public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                                if (q.m3261(q.this) != null) {
                                    q.m3261(q.this).adDisplayed(str, iSAdQualityAdType);
                                }
                            }
                        });
                        q qVar4 = q.this;
                        q.m3307(qVar4, new aj(q.m3273(qVar4)));
                        q qVar5 = q.this;
                        q.m3308(qVar5, new an(q.m3268(qVar5)));
                        String strIntern3 = m3322(898924277 - Color.rgb(0, 0, 0), (-90) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) View.getDefaultSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1579655533, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 93)).intern();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m3322(915701645 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 90, (short) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) - 1579655525, (byte) (ExpandableListView.getPackedPositionChild(0L) + 47)).intern());
                        sb3.append(q.m3277(q.this).m789());
                        k.m3142(strIntern3, sb3.toString());
                        q qVar6 = q.this;
                        Context context = this.f3238;
                        if (context == null) {
                            context = applicationContext;
                        }
                        q.m3284(qVar6, context, userId);
                        q.m3280(q.this, applicationContext);
                        q.m3260(q.this);
                        q.m3264(q.this);
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        String strIntern22 = m3322(915701677 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-91) - (ViewConfiguration.getTapTimeout() >> 16), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) - 1579655529, (byte) (TextUtils.lastIndexOf("", '0') - 49)).intern();
                        kd.m3198(m3322(i10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-91) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1579655533, (byte) (TextUtils.lastIndexOf("", '0') + 95)).intern(), strIntern22, th2, true, false, true);
                        q.m3301(q.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern22);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i10 = 915701493;
                }
            } catch (Throwable th6) {
                th = th6;
                i10 = 915701493;
            }
        }
    }

    static {
        m3269();
        f3177 = null;
        int i10 = f3176 + 69;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
    }

    private q() {
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static /* synthetic */ an m3258(q qVar) {
        int i10 = f3174 + 91;
        int i11 = i10 % 128;
        f3176 = i11;
        int i12 = i10 % 2;
        an anVar = qVar.f3178;
        if (i12 != 0) {
            throw null;
        }
        f3174 = (i11 + 69) % 128;
        return anVar;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public static /* synthetic */ Set m3259(q qVar) {
        int i10 = (f3174 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        f3176 = i10;
        Set<ISAdQualityInitListener> set = qVar.f3179;
        int i11 = i10 + 107;
        f3174 = i11 % 128;
        if (i11 % 2 != 0) {
            return set;
        }
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ void m3260(q qVar) {
        f3174 = (f3176 + 43) % 128;
        qVar.m3281(true);
        f3174 = (f3176 + 39) % 128;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ ISAdQualityAdListener m3261(q qVar) {
        int i10 = f3174;
        f3176 = (i10 + 71) % 128;
        ISAdQualityAdListener iSAdQualityAdListener = qVar.f3186;
        f3176 = (i10 + 11) % 128;
        return iSAdQualityAdListener;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ void m3264(q qVar) {
        f3176 = (f3174 + 1) % 128;
        qVar.m3311(false);
        int i10 = f3176 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3266(q qVar) {
        int i10 = f3174 + 1;
        f3176 = i10 % 128;
        if (i10 % 2 != 0) {
            qVar.m3265();
            throw null;
        }
        boolean zM3265 = qVar.m3265();
        f3176 = (f3174 + 83) % 128;
        return zM3265;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ jb m3267(q qVar) {
        int i10 = (f3176 + 21) % 128;
        f3174 = i10;
        jb jbVar = qVar.f3182;
        int i11 = i10 + 75;
        f3176 = i11 % 128;
        if (i11 % 2 == 0) {
            return jbVar;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static void m3269() {
        char[] cArr = new char[1582];
        com.google.android.gms.internal.play_billing.a.y("\u0000Ic\u0087Çé+\u0018\u008f\u0001óQV\u0099º \u001eÉ\u0082\u0000æ1JO\u00ad´\u0011\u008fu¶Ù\u0005=.¡}\u0004\u009chÕÌñ0\b\u0094Qøv[\u0085¿\u0094#ë\u00873ë^Op²½\u0016ÔzôÞtBI¥\u008e\t·m\u0084Ñ\u001559\u0099Sü\u0080`èÄþ(\u0015\u008cdðwS\u008a·à\u001bà\u007f\u0011ãLGuªÄ\u000eùrïÖ\u0014:]\u009e~\u0001µeÄÉý-w\u0091mõpX¤¼Ä \u0015\u00843èEK\u008c¯¥\u0013Ïw\u001a\u0086må\u009cAÕ\u00ad%\t\u001dudÐ½<\u0094\u0098õ\u0004\u000b` Ì{ÅÅ¦\u000b\u0002eî\u0094J\u008d6Ý\u0093\u0015\u007f,ÛEG\u008c#½\u008fÃh8Ô\u0003°:\u001c\u0089ø¢dñÁ\u0010\u00adY\t}õ\u0084QÝ=ú\u009e\tz\u0018æeB¼.Î\u008aíw5ÓD¿u\u001bø\u0087Ç`\u0011Ì0¨D\u0014\u0091ð¤\u0017\u0005tËÐ¥<T\u0098Mä\u001dAÕ\u00adì\t\u0085\u0095Lñ}]pºï\u0006Ìb\u009fÎ\u0000*e¶6\u0013Í\u007f\u0084Ûµ'I\u0083\u0018ï)LÖ¨\u009d4ä\u0090}ü\u0019X<¥ü\u0001\u008fm¨É8U\u0007²Ñ\u001eòzÈÆV\"e\u008eLëÝwüÓµ?_\u009b}ç DÅ è\føhKô\u001eP0½Ñ\u0019Ôe¯ÁB-\u001b\u0089!\u0000CcµÇÆ+[\u008f$ó\u0004V\u0091º¢\u001eÉ\u0082\u0000æ!J}\u00ad\u009c\u0011\u00aduâÙ\t=`¡9\u0004ÈhõÌÃ0%\u0094\\ø][\u0095¿Õ#ä\u00875ëDO}²ø\u0016ÿzÄÞ\u001fB\b¥\u008b\t±m×ÑX5?\u0099Hü\u0081`¼Äø(\u001f\u008c3ðvSÂ\u0000CcµÇÆ+[\u008f$ó\u0004V\u0091º¢\u001eÉ\u0082\u0000æ!J}\u00ad\u009c\u0011\u00aduâÙ\t=`¡]\u0004»hýÌô05\u0094Møm[\u008c¿Ý#ü\u0087%ë\u0010OW²\u009c\u0016çz Þ#BA¥\u0088\t¸m\u0084Ñ\u001659\u0099Lü\u0098`èÄó(\u0002\u008cdð}S\u0081·°\u001bà\u007f\u0011ã\u001cGeª\u0097\u000eÝrþÖ@:]\u009el\u0001ò\u0000CcµÇÆ+[\u008f$ó\u0004V\u0091º¢\u001eÉ\u0082\u0000æ!J}\u00ad\u009c\u0011\u00aduâÙ\t=`¡9\u0004ÈhÝÌà0\u0014\u0094søi[\u0099¿\u0094#ë\u0087=ë^O#²¬\u0016\u008czâÞ1B\b¥\u0092\t¥mÈÑ\u00145l\u0099Oü\u0086`èÄù(\u001d\u008c4ðlS\u0095·îBç!)\u0085Gi¶Í¯±ÿ\u00147ø\u000e\\gÀ®¤\u009f\báï\u001aS!7\u0016\u009bµ\u007f\u008fãÉFf*s\u008eRr¸ÖóºÃ\u0019*ýca\u0006Å\u0081©ö\rßð\u0002Tf8A\u009c\u008d\u0000èç|\u0018 {nß\u00003ñ\u0097èë¸Np¢I\u0006 \u009aéþØR¦µ]\tfmQÁò%È¹\u008e\u001c!p;Ô\u001c(û\u008c´à\u0097C)§4;\u000f\u009fÜó\u00adW\u0084ªP\u000e)b\u0000ÆÇZ¤½q\u0011\u0019u`É±-Ë\u0081¦ä=xOÜ\u00100ü\u0094ÉèÑKq¯F\u0003]gòû½_\u008c²y\u00165j\nÎþ\"³\u0086Ï\u0003\u009f`QÄ?(Î\u008c×ð\u0087UO¹v\u001d\u001f\u0081ÖåçIê®u\u0012Vv\u0005Ú\u009a>á¢£\u0007MkJÏ53Ú\u0097\u009bû®XR¼\r )\u0084ä1\u0080R\u0012öz\u001a³¾\u009dÂ¤g\u0019\u008b\b/Q³¡×\u0089{Ð\u009c9 \u0010DAèì\f\u0090\u0090Ø5)YhýV\u0001«¥êÉÁ\u0000sc»ÇÇ+\u0011\u008f<óE\u0000 c£ÇÁ+\b\u008f8ó\u0004V\u008aº©\u001eÁ\u0082\u0007æ'Jr\u00adÊ\u0011äÝ)¾Ê\u001a¶ö\u007fRN.h\u008bçgÈÃ¹_l;P\u0097\u0019pòÌÏ¨Ô\u0004dàC|\u000fÙê&ÒE1áM\r\u0084©µÕ\u0093p\u001c\u009c>8C¤\u0097À¶lå\u008b\u00007sSzÿ\u0088\u001b²\u0087ñ\"6NOê'}\u009d\u001ekº\u0018V\u0085òú\u008eÚ+EÇzc\u001fÿÄ\u009bñ7§Ð\u000elo\b5¤×@ìÜêy_\u0015\u0006±nM\u0097éÆ\u0085\u009b&mÂ+^2úÓ\u0096\u009b2»Ïjk\u001b\u0007*£ó?ÖØqtJ\u00101¬\u0086Håä\u009f\u0081Y\u001d6¹1UÆñï\u008d².VÊqf=\u0002Ø\u009eÌõ\u008b\u0096i2\u000fÞ\u008ezï\u0006\u0083£YOjëRwÏ\u0013ô¿§XVä\u007f\u0080+,ÒÈûT¼ñ_\u009dN9\u000bÅåa«\rº®cJ\u0013Ö;râ\u001e\u008bº¢Gsã^\u008f\u0001+Â·±P\u000eü`\u0098\u0013$ÌÀñl\u0080\tC\u0095:1-ÝÃyú\u0005¦¦WB|î!\u008a\u009a\u0016É²¡_^û\u000b\u00870#ÕÏ\u0083k\u008fô}\u0090\u0007<$ØÃd\u009a\u0000õ\u0006\u000beôÁ\u009a-\u0019\u0089`õ\u0012PØ¼û\u0018Å\u0084XàiLy«Ö\u0017às³ß\u000e;q§q\u0002Ïn\u009cÊõ6O\u0092\bþ%]É¹Ñ%¢\u0081kíUI$´ð\u0010\u0099|±Øh\u0000Ec\u0086Çú+3\u008f\u0002ó\u0005VØº¹\u001eÓ\u0082\u0011æ:J<\u00ad¹\u0011\u0080u¸Ù\u0005=3¡4\u0004\u0086hÉÌü0\b\u0094\u0016ø,[°¿Ø#í\u0087=ëCOa²ø\u0016ÁzáÞ?BM¥Ü\t£mÑÑ\n5)\u0099\u0000ü\u0080`§Ä¼(\u0000\u008c%ðkS\u009f·à\u001bõ\u007fHãJGqª\u0088\u000eÑrèÖ@:Z\u009eg\u0001²e\u009dÉê--\u0091@õlXô¼Ý \u000f\u00845èVKØ¯\u0085\u0013äwTÛ<?s¢Ð\u0006\u008djËÎ-2$\u0096Eù\u009d]ÝÁü%\r\u0089LíuPÀ´ç\u0018Ì|\u0017à\u001e\u0089\u0014êÏN¤¢}\u0006Mz8ßã3Þ\u0097ø\u000bxoRÃ\u001c$¨\u0098Æü\u008cPw´A\u0000Ec\u0086Çú+3\u008f\u0002ó\u0005VØº\u0095\u001eÏ\u0082\u0001æoJn\u00ad\u0095\u0011äuíÙ\u001f=)¡z\u0004\u008fh\u009cÌä0\f\u0094]ø,[\u0084¿Ñ#î\u0087=ëEOh²¬\u0016\u008czõÞ'BM¥\u008e\tðmíÑ<5lÝ2¾è\u001aäö\fR).Y\u008b\u0097gµÃ\u009c_\u0005;5\u0097kp\u0089Ìø¨÷\u0004\u0005à.|mÙÔµÔ\u0011ãíXIT%q\u0086\u008fbÛþ´Z!6\f\u0092moªËÙ§í\u0003=\u009fQxÀÔ¹°Ë\f\u0001è\"D\u001c!¡½\u0090\u0019 õ\nQ7-v\u008eÐj¹Æé¢\u0017>H\u009a,w\u008dÓ×¯õ\u000b\u000eç\bC`Ü¯¸\u008c\u0014Ñð\u0017Lq(x\u0085\u0099aÁý\u0001Y 5Q\u0096\u0090r©Î\u009cª;\u0006\u0010âK\u007fÂ\u009a\u0092ùp]\u0016±Å\u0015»i¦Ì` F\u0084\u000f\u0018î|öÐ¶7W\u008bfï'CÞ§«;\u008c\u009egò<V{ªÚ\u000e\u0080b¢ÁY%_¹\n\u001dÓqÛÕ¦(`\u008c]àk\r¹nhÊ\u0001&û\u0082áþ\u0092[I·`\u0013'\u008fÎëüG« J\u0000icºÇÜ+R\u008f#óAV\u008bº¿\u001eé\u0082\u0010¢ÝÁ\u000fe`\u0089¶-\u009cQïô0\u0018\u0006¼b óD\u008aèÃ\u000fw³\t×S{ë\u009f\u0088\u0003Ó¦ Êyn@\u0092¹6øZÆù:\u0000sc»ÇÇ+\u0011\u008f<óEVÕº¿\u001eÅ\u0082\u0017æ:Jy\u00ad\u0084\u0011éu¬Ù\r=.¡u\u0004\u0084hÅÌä0\r\u0094[ø\u007fzÉ\u0019?½LQÑõ®\u0089\u008e,\u0001À#d^øÞ\u009c«0ø×\u000ek+\u000f`£\u0088G«Ûò~B\u0012B¶\u007fJ\u009dîÆ\u0082¦!\u0007ÅQYfý³\u0091\u009a5£Èrlo\u0000Y¤\u009f8Æß's/\u0017O«\u009eO¯ãÞ\u0086\u0007\u001ab¾ER¾ö\u0085\u008a²)\u0011Í+am\u0005Â\u0099Å=òÐ\u001btF\bb¬\u0085@Éäì{x\u0000Mc¡ÇÛ+\b\u008fpóWV\u009dº¸\u001e\u0080\u0082\u001dæ&Jh\u00ad\u0095\u0011¶uöÙ\r=,¡4\u0004\u009chÙÌã0\u0010\u0094\u0018øa[\u008f¿Ð#í\u0087|ëROa²¾\u0016ÃzòÞ1B\b¥\u0095\t¾mÍÑ\f5%\u0099Aü\u0098`¡Äæ(\u0019\u008c*ð\u007fSÍ\u0000acºÇÌ+\u000e\u008f?óMV\u009cºâ\u001eÉ\u0082\u001aæ<Jy\u00ad\u009e\u0011°u¶Ù\r=#¡`\u0004\u0081hÓÌþ0J\u0094zøM[´¿à#Í\u0087\u000eëiO[²\u009b\u0016äzÁÞ\u001aBo¥¹\t\u0094\u0000FcµÇÁ+\u0010\u008f5ó@VØº¸\u001eÏ\u0082Tæ:Jy\u00ad\u0097\u0011\u00aduëÙ\u0018=%¡f\u0004ÈhÞÌñ0\u0010\u0094Løi[\u0092¿Í#¨\u0087.ëUOg²½\u0016ÅzöÞ1BZ\u0000CcµÇÆ+[\u008f$ó\u0004V\u008bº©\u001eÔ\u0082Tæ)Jx\u00adÐ\u0011¨uñÙ\u001f=4¡q\u0004\u0086hÙÌâ0D\u0094\u0015ø,[©¿ç#É\u00878ëaOq²¹\u0016ÀzéÞ BQ¥Ü\t\u0083màÑ35l\u0099Wü\u0095`»Ä¼(\u0003\u008c,ðmS\u0098·¤\u001bû\u007f\u001fãRG>\u0091\u0084òrV\u0001º\u009c\u001eãbÃÇL+n\u008f\t\u0013×w¯Û¸<B\u0080pä+HÄ¬ê0ó\u0095Bù\u001e]3¡Ê\u0005\u009ei¿ÊN.\u001c²!\u0016»z\u0085Þ¦#i\u0087\u000eë)OæÓ\u008a4\u001b\u0098:üC@ö¤Ø\b¦mWñ^U.¹Ö\u001dïa¶Â_&~\u008asîür¿Ö\u009c;\u0003\u009f\bã*GÔ«Ó\u000f¼\u0090sô\u0002X7¼û\u0000\u0084d°É}-A\u0000CcµÇÆ+[\u008f$ó\u0004V\u008bº©\u001eÎ\u0082\u0010æhJ\u007f\u00ad\u0085\u0011·uìÙ\u0003=-¡4\u0004\u0085hÙÌô0\r\u0094Yøx[\u0089¿Û#æ\u0087|ëBOa²®\u0016ÉzîÞ!BM¥Ü\tým\u0084Ñ15\u001f\u0099aü\u0090`\u0099Äé(\u0011\u008c(ðqS\u0098·¹\u001b´\u007f;ãxG[ªÄ\u000eÑrÿÖ@:Z\u009eg\u0001¨e\u0090Éí-6\u0091EõtX½¼É \u0010\u00849è^K\u009d¯¨\u0013\u008e]ú>\f\u009a\u007fvâÒ\u009d®½\u000b2ç\u0010Cmßí»\u0082\u0017Àð.L\u0010(D\u0084»`\u008dü\u008dY|5%\u0091`m\u008eÉÀ¥Ñ\u0006\bâx~PÚ\u0089¶à\u0012Éï\u0018K5'j\u0083©\u001fÚøeT\u001e0|\u008c²hÕÄê¡%=\u0004\u0099Qu\u00adÑ\u0092\u00adÖ\u000e;êWMx.\u008e\u008aýf`Â\u001f¾?\u001b°÷\u0092SïÏo«\u0010\u0007Hà¥\\\u00998Ê\u00940p[ì\u0002Ió%Î\u0081ø}\u001eÙgµf\u0016®òînßÊ\u000e¦\u007f\u0002FÿÃ[Ä7ÿ\u0093$\u000f3è°D\u008a ì\u009ccx\u0004Ôs±º-\u0087\u0089Ãe$Á\b½M\u001eùú¦\u0099P=#Ñ¾uÁ\tá¬n@Lä1x±\u001cÎ°\u0096W{ëG\u008f\u0014#îÇ\u0085[Üþ-\u0092\u00106&ÊÀn¹\u0002¸¡pE0Ù\u0001}Ð\u0011¡µ\u0098H\u001dì\u001a\u0080!$ú¸í_póF\u0097a+üÏÅc·\u0006t\u009aL>\u001dÒìv\u0081\n\u0094©gMLá\u0005\u0085ä\u0019¸½\u0099Phô'\u0088\f,áÀÿ\u0000ic³ÇÆ+\u0013\u008f\"óAV§º¼\u001eÒ\u0082\u0011æ\u0017Ju\u00ad\u009e\u0011\u00aduìÙ3=#¡{\u0004\u0086hÚÌù0\u0003", "ISO-8859-1", cArr, 0, 1582);
        f3173 = cArr;
        f3175 = -7117028751992921132L;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Context m3270(q qVar) {
        int i10 = (f3176 + 1) % 128;
        f3174 = i10;
        Context context = qVar.f3188;
        f3176 = (i10 + 81) % 128;
        return context;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m3272(q qVar) {
        f3174 = (f3176 + 99) % 128;
        qVar.m3263();
        f3174 = (f3176 + 9) % 128;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ aw m3273(q qVar) {
        int i10 = f3176;
        f3174 = (i10 + 11) % 128;
        aw awVar = qVar.f3185;
        int i11 = i10 + 55;
        f3174 = i11 % 128;
        if (i11 % 2 != 0) {
            return awVar;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ iw m3276(q qVar) {
        int i10 = (f3174 + 103) % 128;
        f3176 = i10;
        iw iwVar = qVar.f3180;
        f3174 = (i10 + 27) % 128;
        return iwVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ak m3277(q qVar) {
        int i10 = (f3174 + 19) % 128;
        f3176 = i10;
        ak akVar = qVar.f3187;
        f3174 = (i10 + 115) % 128;
        return akVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m3283(q qVar) {
        int i10 = f3174 + 47;
        f3176 = i10 % 128;
        int i11 = i10 % 2;
        qVar.m3285(true);
        f3174 = (f3176 + 5) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ iw m3286(q qVar, iw iwVar) {
        int i10 = f3174;
        f3176 = (i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        qVar.f3180 = iwVar;
        int i11 = i10 + 19;
        f3176 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 49 / 0;
        }
        return iwVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ah m3294(q qVar, ah ahVar) {
        int i10 = f3174 + 97;
        f3176 = i10 % 128;
        int i11 = i10 % 2;
        qVar.f3183 = ahVar;
        if (i11 == 0) {
            return ahVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Context m3306(q qVar, Context context) {
        int i10 = f3174;
        f3176 = (i10 + 65) % 128;
        qVar.f3188 = context;
        f3176 = (i10 + 21) % 128;
        return context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        boolean z10;
        try {
            if (m3293(str)) {
                if (str.equals(m3275().m904())) {
                    z10 = false;
                } else {
                    f3174 = (f3176 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                    z10 = true;
                }
                boolean zMo2971 = jf.m2969().mo2971();
                if (z10 && zMo2971) {
                    int i10 = f3174 + 57;
                    f3176 = i10 % 128;
                    if (i10 % 2 != 0) {
                        this.f3183.m746();
                        int i11 = 32 / 0;
                    } else {
                        this.f3183.m746();
                    }
                }
                str2 = str;
                try {
                    m3290(this.f3188, str2, z10, true, zMo2971);
                } catch (Exception e10) {
                    e = e10;
                    kd.m3198(m3282(Color.argb(0, 0, 0, 0) + 12, Color.blue(0) + 74, (char) (34348 - Gravity.getAbsoluteGravity(0, 0))).intern(), com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m3282((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20, 529 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 9879)), str2), (Throwable) e, true, false, true);
                }
            }
        } catch (Exception e11) {
            e = e11;
            str2 = str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        f3176 = (f3174 + 105) % 128;
        initialize(context, str, null);
        f3174 = (f3176 + 13) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        if (!m3315()) {
            if (m3265()) {
                this.f3181.m781(iSAdQualityCustomMediationRevenue);
                return;
            } else {
                k.m3152(m3282(12 - View.resolveSize(0, 0), Drawable.resolveOpacity(0, 0) + 74, (char) (TextUtils.indexOf("", "", 0, 0) + 34348)).intern(), m3282(ExpandableListView.getPackedPositionType(0L) + 73, 1332 - View.combineMeasuredStates(0, 0), (char) KeyEvent.getDeadChar(0, 0)).intern());
                return;
            }
        }
        f3176 = (f3174 + 9) % 128;
        k.m3152(m3282(11 - Process.getGidForName(""), (Process.myPid() >> 22) + 74, (char) ((Process.myPid() >> 22) + 34348)).intern(), m3282(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 68, 1265 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37318)).intern());
        int i10 = f3174 + 75;
        f3176 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        f3174 = (f3176 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        if (!m3315()) {
            this.f3186 = iSAdQualityAdListener;
        } else {
            f3174 = (f3176 + 23) % 128;
            k.m3152(m3282(AndroidCharacter.getMirror('0') - '$', (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 73, (char) (34347 - MotionEvent.axisFromString(""))).intern(), m3282(AndroidCharacter.getMirror('0') + 5, ImageFormat.getBitsPerPixel(0) + 1213, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        f3176 = (f3174 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        if (m3315()) {
            k.m3152(m3282(12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) + 74, (char) (34348 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), m3282(48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 1454, (char) (ImageFormat.getBitsPerPixel(0) + 19772)).intern());
            f3176 = (f3174 + 75) % 128;
        } else if (!m3262()) {
            this.f3195 = iSAdQualityConfig;
        } else {
            f3174 = (f3176 + 85) % 128;
            k.m3152(m3282((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 75 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34347)).intern(), m3282(58 - KeyEvent.getDeadChar(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1501, (char) ((Process.myTid() >> 22) + 64229)).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        if (!m3315()) {
            p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.q.3

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static short[] f3201 = null;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f3202 = 0;

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static int f3203 = 1;

                /* renamed from: ﻏ, reason: contains not printable characters */
                private static byte[] f3204 = {-29, 21, 62, -31, -17, 25, -17, 8, -64, 9, -57, -97, -86, -66, 68, -88, 94, -83, -96, 94, -82, 80, 28, -7, 80, 84, 27, -8, 95, 28, -128, 82, -92, 102, -14, 80, 94, -88, 94, -71, 113, -72, 118, -69, 95, 124, -90, 88, -7, 83, 92, -83, 83, 87, -89, 6, -7, 90, -89, 6, -7, 24, -20, 88, 75, 0, 0};

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int f3205 = -21968128;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f3206 = -1340352550;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static int f3207 = 58;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m3318(int i10, byte b10, int i11, short s10, int i12) {
                    String string;
                    synchronized (n.f3160) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f3207;
                            int i14 = i11 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f3204;
                                i14 = bArr != null ? (byte) (bArr[f3205 + i12] + i13) : (short) (f3201[f3205 + i12] + i13);
                            }
                            if (i14 > 0) {
                                n.f3165 = ((i12 + i14) - 2) + f3205 + i15;
                                n.f3163 = b10;
                                char c10 = (char) (i10 + f3206);
                                n.f3162 = c10;
                                sb2.append(c10);
                                n.f3161 = n.f3162;
                                n.f3164 = 1;
                                while (n.f3164 < i14) {
                                    byte[] bArr2 = f3204;
                                    if (bArr2 != null) {
                                        int i16 = n.f3165;
                                        n.f3165 = i16 - 1;
                                        n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                                    } else {
                                        short[] sArr = f3201;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    if (!q.m3266(q.this)) {
                        k.m3152(m3318(ImageFormat.getBitsPerPixel(0) + 1340352616, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 27), ((Process.getThreadPriority(0) + 20) >> 6) - 46, (short) KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + 21968128).intern(), m3318((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1340352617, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 85), (-3) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 21968139 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                        f3203 = (f3202 + 27) % 128;
                    } else if (q.m3258(q.this) != null) {
                        f3203 = (f3202 + 99) % 128;
                        q.m3258(q.this).m804(iSAdQualitySegment);
                    }
                }
            });
            return;
        }
        f3176 = (f3174 + 23) % 128;
        k.m3152(m3282(13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 74, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34347)).intern(), m3282(48 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1405, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23993)).intern());
        f3176 = (f3174 + 53) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z10) {
        f3174 = (f3176 + 93) % 128;
        m3275().m902(z10);
        int i10 = f3176 + 107;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 58 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        f3174 = (f3176 + 109) % 128;
        m3285(false);
        int i10 = f3176 + 27;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private synchronized boolean m3262() {
        boolean z10;
        int i10 = f3174;
        z10 = this.f3194;
        f3176 = (i10 + 55) % 128;
        return z10;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private void m3263() {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.q.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                for (ISAdQualityInitListener iSAdQualityInitListener : q.m3259(q.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                q.m3259(q.this).clear();
            }
        });
        int i10 = f3176 + 95;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m3265() {
        int i10 = f3174;
        boolean z10 = this.f3193;
        int i11 = i10 + 101;
        f3176 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        int i12 = 79 / 0;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r0
      0x0026: PHI (r0v5 java.util.Map<java.lang.String, java.lang.String>) = (r0v4 java.util.Map<java.lang.String, java.lang.String>), (r0v12 java.util.Map<java.lang.String, java.lang.String>) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject m3271() {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.q.f3174
            int r0 = r0 + 51
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.q.f3176 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1c
            com.ironsource.adqualitysdk.sdk.i.as r0 = r8.m3275()
            java.util.Map r0 = r0.m898()
            r3 = 71
            int r3 = r3 / r2
            if (r0 == 0) goto L81
            goto L26
        L1c:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r8.m3275()
            java.util.Map r0 = r0.m898()
            if (r0 == 0) goto L81
        L26:
            java.lang.String r3 = ""
            int r4 = android.text.TextUtils.getTrimmedLength(r3)
            int r4 = 13 - r4
            int r5 = android.view.Gravity.getAbsoluteGravity(r2, r2)
            int r5 = r5 + 960
            int r6 = android.graphics.Color.alpha(r2)
            int r6 = r6 + 3544
            char r6 = (char) r6
            java.lang.String r4 = m3282(r4, r5, r6)
            java.lang.String r4 = r4.intern()
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L81
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            int r5 = android.view.View.resolveSize(r2, r2)     // Catch: org.json.JSONException -> L81
            int r5 = 13 - r5
            r6 = 48
            int r2 = android.text.TextUtils.indexOf(r3, r6, r2, r2)     // Catch: org.json.JSONException -> L81
            int r2 = 959 - r2
            r6 = 0
            int r3 = android.widget.ExpandableListView.getPackedPositionType(r6)     // Catch: org.json.JSONException -> L81
            int r3 = 3544 - r3
            char r3 = (char) r3     // Catch: org.json.JSONException -> L81
            java.lang.String r2 = m3282(r5, r2, r3)     // Catch: org.json.JSONException -> L81
            java.lang.String r2 = r2.intern()     // Catch: org.json.JSONException -> L81
            java.lang.Object r0 = r0.get(r2)     // Catch: org.json.JSONException -> L81
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> L81
            r4.<init>(r0)     // Catch: org.json.JSONException -> L81
            int r0 = com.ironsource.adqualitysdk.sdk.i.q.f3176
            int r0 = r0 + 119
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.q.f3174 = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L80
            return r4
        L80:
            throw r1
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.q.m3271():org.json.JSONObject");
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private synchronized boolean m3274() {
        int i10 = f3174 + 15;
        f3176 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f3190;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private synchronized as m3275() {
        as asVar;
        try {
            int i10 = f3176 + 105;
            f3174 = i10 % 128;
            if (i10 % 2 == 0) {
                asVar = this.f3196;
                int i11 = 2 / 0;
            } else {
                asVar = this.f3196;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return asVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ jb m3278(q qVar, jb jbVar) {
        int i10 = f3176 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3174 = i10 % 128;
        int i11 = i10 % 2;
        qVar.f3182 = jbVar;
        if (i11 != 0) {
            return jbVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m3284(q qVar, Context context, String str) {
        f3176 = (f3174 + 65) % 128;
        qVar.m3290(context, str, true, false, true);
        int i10 = f3174 + 25;
        f3176 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ iy m3287(q qVar) {
        int i10 = f3174;
        f3176 = (i10 + 45) % 128;
        iy iyVar = qVar.f3184;
        int i11 = i10 + 91;
        f3176 = i11 % 128;
        if (i11 % 2 == 0) {
            return iyVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ aw m3295(q qVar, aw awVar) {
        int i10 = f3174 + 103;
        f3176 = i10 % 128;
        int i11 = i10 % 2;
        qVar.f3185 = awVar;
        if (i11 != 0) {
            int i12 = 29 / 0;
        }
        return awVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ aj m3307(q qVar, aj ajVar) {
        int i10 = f3176 + 107;
        f3174 = i10 % 128;
        int i11 = i10 % 2;
        qVar.f3181 = ajVar;
        if (i11 == 0) {
            int i12 = 59 / 0;
        }
        return ajVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            int i10 = f3174 + 49;
            f3176 = i10 % 128;
            if (i10 % 2 == 0) {
                m3289((Application) context, str, iSAdQualityConfig);
                return;
            } else {
                m3289((Application) context, str, iSAdQualityConfig);
                throw null;
            }
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m3289((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if (!(context instanceof Activity)) {
            String strIntern = m3282((ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.alpha(0)).intern();
            k.m3152(m3282(12 - (ViewConfiguration.getTouchSlop() >> 8), 75 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34348 - Color.red(0))).intern(), strIntern);
            m3304(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
            return;
        }
        int i11 = f3174 + 31;
        f3176 = i11 % 128;
        if (i11 % 2 != 0) {
            m3298((Activity) context, str, iSAdQualityConfig);
            throw null;
        }
        m3298((Activity) context, str, iSAdQualityConfig);
        int i12 = f3174 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f3176 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized aw m3313() {
        aw awVar;
        int i10 = f3176;
        int i11 = i10 + 7;
        f3174 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        awVar = this.f3185;
        int i12 = i10 + 27;
        f3174 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return awVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m3280(q qVar, Context context) {
        int i10 = f3174 + 5;
        f3176 = i10 % 128;
        int i11 = i10 % 2;
        qVar.m3279(context);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (m3315() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.m3152(m3282(13 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), 74 - android.graphics.Color.blue(0), (char) (android.widget.ExpandableListView.getPackedPositionType(0) + 34348)).intern(), m3282((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 342 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 17070)).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (m3265() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.m3152(m3282((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 12, android.graphics.Color.argb(0, 0, 0, 0) + 74, (char) (34348 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).intern(), m3282((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 378, (char) (6377 - (android.view.ViewConfiguration.getTouchSlop() >> 8))).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        r0 = m3282(28 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 437 - android.graphics.Color.argb(0, 0, 0, 0), (char) (981 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'))).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        if (r13 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        r13 = new java.lang.StringBuilder();
        r13.append(r0);
        r13.append(m3282(android.view.View.MeasureSpec.getMode(0) + 24, (android.os.Process.myTid() >> 22) + 465, (char) (12704 - android.widget.ExpandableListView.getPackedPositionGroup(0))).intern());
        r0 = r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010b, code lost:
    
        r13 = com.ironsource.adqualitysdk.sdk.i.aq.m814().mo845(m3282(6 - android.view.KeyEvent.getDeadChar(0, 0), 488 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (char) android.text.TextUtils.indexOf("", "")).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0136, code lost:
    
        if (android.text.TextUtils.isEmpty(r13) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0138, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append(r0);
        r6.append(m3282((android.view.KeyEvent.getMaxKeyCode() >> 16) + 14, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 495, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16)).intern());
        r6.append(r13);
        r0 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0169, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.q.f3174 = (com.ironsource.adqualitysdk.sdk.i.q.f3176 + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.m3142(m3282(12 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 74, (char) (34348 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).intern(), r0);
        m3310(com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, r0);
        r12.f3189 = true;
        com.ironsource.adqualitysdk.sdk.i.aq.m814().mo823();
        com.ironsource.adqualitysdk.sdk.i.ij.m2822(r12.f3188).m2828();
        r12.f3185.m989();
        r12.f3184.m2896();
        r12.f3183.m740();
        com.ironsource.adqualitysdk.sdk.i.hu.m2671();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (m3315() != false) goto L20;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m3285(boolean r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.q.m3285(boolean):void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m3291(q qVar, Context context) {
        f3174 = (f3176 + 49) % 128;
        qVar.m3299(context);
        int i10 = f3174 + 15;
        f3176 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ iy m3296(q qVar, iy iyVar) {
        int i10 = f3174 + 3;
        int i11 = i10 % 128;
        f3176 = i11;
        int i12 = i10 % 2;
        qVar.f3184 = iyVar;
        if (i12 != 0) {
            throw null;
        }
        f3174 = (i11 + 99) % 128;
        return iyVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ an m3308(q qVar, an anVar) {
        int i10 = f3174;
        int i11 = i10 + 71;
        f3176 = i11 % 128;
        int i12 = i11 % 2;
        qVar.f3178 = anVar;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i10 + 11;
        f3176 = i13 % 128;
        if (i13 % 2 == 0) {
            return anVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m3289(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3176 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3174 = i10 % 128;
        int i11 = i10 % 2;
        m3288(application, null, str, iSAdQualityConfig);
        if (i11 == 0) {
            int i12 = 43 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3301(q qVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        f3176 = (f3174 + 27) % 128;
        qVar.m3310(iSAdQualityInitError, str);
        int i10 = f3176 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ as m3309(q qVar) {
        f3176 = (f3174 + 75) % 128;
        as asVarM3275 = qVar.m3275();
        f3174 = (f3176 + 1) % 128;
        return asVarM3275;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m3314() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i10 = (f3174 + 99) % 128;
        f3176 = i10;
        iSAdQualityLogLevel = this.f3192;
        f3174 = (i10 + 83) % 128;
        return iSAdQualityLogLevel;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m3281(boolean z10) {
        try {
            int i10 = f3174;
            int i11 = i10 + 49;
            f3176 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f3193 = false;
            } else {
                this.f3193 = true;
            }
            int i12 = i10 + 111;
            f3176 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m3288(Application application, Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f3174 = (f3176 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        String strIntern = m3282(12 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 75, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34348)).intern();
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (!m3312(iSAdQualityConfig)) {
            f3174 = (f3176 + 17) % 128;
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3195, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        if (m3262()) {
            String strIntern2 = m3282(41 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 86 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (Color.alpha(0) + 50572)).intern();
            k.m3142(strIntern, strIntern2);
            m3304(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern2);
            f3176 = (f3174 + 99) % 128;
            return;
        }
        if (m3265()) {
            String strIntern3 = m3282(Color.green(0) + 59, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 126, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 5964)).intern();
            k.m3142(strIntern, strIntern3);
            m3304(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m3315()) {
            f3174 = (f3176 + 43) % 128;
            String strIntern4 = m3282(48 - (Process.myTid() >> 22), 185 - Color.alpha(0), (char) KeyEvent.normalizeMetaState(0)).intern();
            k.m3152(strIntern, strIntern4);
            m3304(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern4);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
            String strIntern5 = m3282((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 60, 233 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern();
            k.m3152(strIntern, strIntern5);
            m3304(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern5);
        } else {
            if (TextUtils.isEmpty(str)) {
                String strIntern6 = m3282(49 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 293, (char) Color.green(0)).intern();
                k.m3152(strIntern, strIntern6);
                m3304(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern6);
                f3176 = (f3174 + 33) % 128;
                return;
            }
            this.f3179.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
            m3311(true);
            jf.m2969().mo2974(application, activity);
            jd.m2957().m2963();
            jh.m2995().m2999();
            p.m3247(new AnonymousClass5(iSAdQualityConfig2, str, application, activity));
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3302(q qVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3176 + 99;
        f3174 = i10 % 128;
        int i11 = i10 % 2;
        qVar.m3300(iSAdQualityLogLevel);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f3174 + 95;
        f3176 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m3317() {
        if (m3315()) {
            f3174 = (f3176 + 103) % 128;
            k.m3152(m3282(12 - Color.alpha(0), 74 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ExpandableListView.getPackedPositionGroup(0L) + 34348)).intern(), m3282(ExpandableListView.getPackedPositionChild(0L) + 61, ImageFormat.getBitsPerPixel(0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31370)).intern());
        } else if (m3265()) {
            f3174 = (f3176 + 7) % 128;
            k.m3152(m3282(Color.argb(0, 0, 0, 0) + 12, 74 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.getOffsetBefore("", 0) + 34348)).intern(), m3282(48 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 1092, (char) Color.blue(0)).intern());
        } else {
            this.f3191 = true;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m3279(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.q.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    VMRunner.invoke("cYJIbjR2ThyniwBC", new Object[]{this, context2, intent});
                }
            }, new IntentFilter(m3282(View.getDefaultSize(0, 0) + 37, 1139 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Process.myTid() >> 22)).intern()), null, p.m3250());
            int i10 = f3174 + 71;
            f3176 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            k.m3156(m3282(12 - View.getDefaultSize(0, 0), 74 - TextUtils.getOffsetBefore("", 0), (char) (34348 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), m3282(Process.getGidForName("") + 36, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1177, (char) KeyEvent.keyCodeFromString("")).intern(), th2);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3303(q qVar, boolean z10) {
        int i10 = f3174 + 105;
        f3176 = i10 % 128;
        int i11 = i10 % 2;
        qVar.m3292(z10);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ ah m3268(q qVar) {
        int i10 = f3176;
        f3174 = (i10 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        ah ahVar = qVar.f3183;
        f3174 = (i10 + 7) % 128;
        return ahVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3305(q qVar) {
        f3174 = (f3176 + 95) % 128;
        boolean zM3274 = qVar.m3274();
        f3174 = (f3176 + 45) % 128;
        return zM3274;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static q m3297() {
        synchronized (q.class) {
            try {
                if (f3177 == null) {
                    f3177 = new q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3177;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m3311(boolean z10) {
        int i10 = (f3176 + 91) % 128;
        f3174 = i10;
        this.f3194 = z10;
        f3176 = (i10 + 47) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m3298(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f3174 = (f3176 + 75) % 128;
        m3288(activity.getApplication(), activity, str, iSAdQualityConfig);
        f3176 = (f3174 + 31) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m3310(ISAdQualityInitError iSAdQualityInitError, String str) {
        f3174 = (f3176 + 75) % 128;
        m3304(this.f3179, iSAdQualityInitError, str);
        int i10 = f3176 + 45;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m3299(Context context) {
        f3174 = (f3176 + 29) % 128;
        String strM2921 = this.f3182.m2921(m3282((ViewConfiguration.getTouchSlop() >> 8) + 10, View.MeasureSpec.getSize(0) + 973, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
        if (TextUtils.isEmpty(strM2921)) {
            return;
        }
        new jb(context, m3282(25 - Color.alpha(0), 983 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41641 - View.MeasureSpec.getMode(0))).intern(), m3282((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1007, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).m2924(m3282(TextUtils.lastIndexOf("", '0', 0) + 11, 973 - TextUtils.indexOf("", "", 0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), strM2921);
        this.f3182.m2926(m3282(TextUtils.getOffsetAfter("", 0) + 10, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 973, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern());
        f3174 = (f3176 + 71) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m3312(ISAdQualityConfig iSAdQualityConfig) {
        f3174 = (f3176 + 57) % 128;
        if (this.f3195 == null) {
            return true;
        }
        try {
            String str = iSAdQualityConfig.getMetaData().get(m3282(12 - MotionEvent.axisFromString(""), View.resolveSize(0, 0) + 960, (char) (3545 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern());
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str).optBoolean(m3282(View.getDefaultSize(0, 0) + 22, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1560, (char) Color.alpha(0)).intern());
            }
        } catch (Throwable unused) {
        }
        f3174 = (f3176 + 69) % 128;
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m3300(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3176;
        this.f3192 = iSAdQualityLogLevel;
        f3174 = (i10 + 85) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m3304(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.q.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i10 = f3176 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3174 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m3315() {
        boolean z10;
        int i10 = f3174;
        z10 = this.f3189;
        f3176 = (i10 + 33) % 128;
        return z10;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3282(int i10, int i11, char c10) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f3173[i11 + i12] ^ (i12 * f3175)) ^ c10);
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m3293(String str) {
        if (m3315()) {
            k.m3152(m3282((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, 74 - View.resolveSize(0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 34348)).intern(), m3282(View.combineMeasuredStates(0, 0) + 52, View.MeasureSpec.getMode(0) + 549, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 32222)).intern());
            f3174 = (f3176 + 35) % 128;
            return false;
        }
        if (!m3265()) {
            f3176 = (f3174 + 115) % 128;
            k.m3152(m3282(12 - View.getDefaultSize(0, 0), 74 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34348)).intern(), m3282((ViewConfiguration.getTapTimeout() >> 16) + 65, TextUtils.indexOf((CharSequence) "", '0') + 602, (char) (62930 - View.resolveSize(0, 0))).intern());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        f3174 = (f3176 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        k.m3152(m3282(TextUtils.indexOf("", "", 0) + 12, 74 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 34349)).intern(), m3282((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + TTAdConstant.STYLE_SIZE_RADIO_2_3, (char) (1605 - (KeyEvent.getMaxKeyCode() >> 16))).intern());
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m3290(Context context, String str, boolean z10, boolean z11, boolean z12) {
        int i10 = f3174 + 35;
        f3176 = i10 % 128;
        if (i10 % 2 == 0) {
            String strM904 = m3275().m904();
            m3275().m911(str);
            if (str == null) {
                f3174 = (f3176 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                k.m3152(m3282(TextUtils.indexOf("", "", 0) + 12, (ViewConfiguration.getTapTimeout() >> 16) + 74, (char) (KeyEvent.normalizeMetaState(0) + 34348)).intern(), m3282(93 - View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, (char) ((-1) - MotionEvent.axisFromString(""))).intern());
            } else if (!str.equals(m3282(18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 793 - View.combineMeasuredStates(0, 0), (char) (35189 - Color.argb(0, 0, 0, 0))).intern())) {
                String strIntern = m3282(Color.blue(0) + 12, 74 - TextUtils.indexOf("", "", 0, 0), (char) (34349 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m3282(32 - TextUtils.indexOf((CharSequence) "", '0'), 927 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39626)).intern());
                sb2.append(str);
                k.m3138(strIntern, sb2.toString());
            } else {
                String strIntern2 = m3282((ViewConfiguration.getLongPressTimeout() >> 16) + 12, 74 - Gravity.getAbsoluteGravity(0, 0), (char) (34348 - Color.green(0))).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m3282(View.resolveSize(0, 0) + 40, 810 - Color.argb(0, 0, 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern());
                sb3.append(str);
                sb3.append(m3282((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 76, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 850, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 56603)).intern());
                k.m3152(strIntern2, sb3.toString());
            }
            aq.m814().mo843(new AnonymousClass4(z10, context, z11, strM904, z12));
            JSONObject jSONObjectM3271 = m3271();
            if (jSONObjectM3271 != null) {
                int i11 = f3174 + 27;
                f3176 = i11 % 128;
                if (i11 % 2 == 0) {
                    aq.m814().mo839(jSONObjectM3271);
                    return;
                } else {
                    aq.m814().mo839(jSONObjectM3271);
                    throw null;
                }
            }
            aq.m814().mo842(context, m3275(), true);
            f3176 = (f3174 + 39) % 128;
            return;
        }
        m3275().m904();
        m3275().m911(str);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m3316() {
        int i10 = (f3174 + 51) % 128;
        f3176 = i10;
        boolean z10 = this.f3191;
        int i11 = i10 + 1;
        f3174 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        int i12 = 63 / 0;
        return z10;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m3292(boolean z10) {
        int i10 = (f3176 + 77) % 128;
        f3174 = i10;
        this.f3190 = z10;
        int i11 = i10 + 21;
        f3176 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 52 / 0;
        }
    }
}
