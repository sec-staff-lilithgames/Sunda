package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.v;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w extends v<Activity> implements jg {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f3314 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f3315 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3316 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f3317;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f3318;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f3319;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String f3320;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean f3321;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3322;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private a f3323;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3324;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private jg f3325;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f3326;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Class f3327;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends v.b {

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static int f3358 = 0;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private static int f3359 = 1;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static char f3360 = 1862;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f3361 = 46277;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f3362 = 31727;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static long f3363 = -210346782525895221L;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f3364 = 3767;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3365 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3366;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f3367;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f3368;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f3369;

        public a(w wVar, JSONObject jSONObject) {
            m3406(jSONObject.optString(m3403("춪韢礐썏ꒋร큳떹ῗ\ue107䪇⳥\uf63a塇", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23116).intern()));
            m3404(jSONObject.optString(m3403("춼\uedff贋굮䳦氻ౚ⾿켯\uef73躒껃义榷ৈ⤑좋\ue8d8蠜ꮮ䯶欖", 8273 - KeyEvent.keyCodeFromString("")).intern()));
            m3408(jSONObject.optInt(m3403("춼䏍텯暴\uf42eੁ鯮⤷뺷", (ViewConfiguration.getScrollBarSize() >> 8) + 36451).intern(), -1));
            m3401(jSONObject.optBoolean(m3410("쭲\uf1b4龭㮁샍꣩퇤종ﻙ\ue45a퇎⣵큌柢\u171d쐑\ude6a蓨", 17 - View.MeasureSpec.getMode(0)).intern()));
            m3400(jSONObject.optBoolean(m3403("춪\ue825蚥봯实癦⳩쭲\ue1c2鱝먢傷༙▍쀹ﻭ長돷湘", 9614 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()));
            m3362(jSONObject.optString(m3403("춡\u0ff3䤉譅쒮ے䁣鶣\udff0ᤜ", View.combineMeasuredStates(0, 0) + 49739).intern()));
            m3364(TextUtils.isEmpty(jSONObject.optString(m3410("폱똋㱤ᩬ巭笪鯘黣䈤曥", 9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) ? null : Arrays.asList(jSONObject.optString(m3410("폱똋㱤ᩬ巭笪鯘黣䈤曥", (ViewConfiguration.getScrollBarSize() >> 8) + 9).intern()).split(m3403("췧", ExpandableListView.getPackedPositionChild(0L) + 62274).intern())));
            m3367(jSONObject.optBoolean(m3403("춾ͱ值ꇇ\uf68a쑄ᔫ櫝믦袭\ude59⼉糔䶖", 52937 - TextUtils.getOffsetAfter("", 0)).intern()));
            boolean z10 = true;
            m3369(jSONObject.optBoolean(m3410("\ue92bﻒ闚ꨘ鉶緐ٍ䣸藷툆\uf195鍗渿蘐", 13 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), true));
            if (TextUtils.isEmpty(jSONObject.optString(m3403("춡\u0ff3䤉譅쒮ے䁣鶣\udff0ᤜ", TextUtils.getOffsetBefore("", 0) + 49739).intern())) && !jSONObject.optBoolean(m3403("춾棙蝬㶿堪\uf74cⷛ䠅\ue6a6ᷕ롂회മꡃ웫紐", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42337).intern()) && !jSONObject.optBoolean(m3410("\ue92bﻒ疇訝ᩜ\u187c￠ዳ椶\uf2c8맹汉視崨\uf78e牳崤⇢", TextUtils.getOffsetBefore("", 0) + 18).intern())) {
                z10 = false;
            }
            m3368(z10);
            m3365(jSONObject.optBoolean(m3403("춾棙蝬㶿堪\uf74cⷛ䠅\ue6a6ᷕ롂회മꡃ웫紐", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42337).intern()));
            m3359(jSONObject.optBoolean(m3403("춾⪅ϔ砹兇䦎ꛗ鼁\uf469\uec9d", 59197 - TextUtils.getOffsetBefore("", 0)).intern()));
            m3363(jSONObject.optBoolean(m3410("\ue92bﻒ\uef68遅杖\ue853眹俧㨟ꃚ疇訝ᩜ\u187c䞵≦饫㍮㭍훷", TextUtils.lastIndexOf("", '0') + 20).intern()));
            m3360(jSONObject.optBoolean(m3403("춦妁\ue5d9焂鵞⢀득쀗決ﮒߎ錊㽞䪖훚戟蹈", 37952 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()));
            m3361(jSONObject.optBoolean(m3410("䀔\ue2eb둄궀\ud91d牆\ueac3櫰渿蘐", 9 - View.MeasureSpec.getSize(0)).intern()));
            m3366(kc.m3195(jSONObject.optJSONArray(m3403("춽霙磘\udd8dꝔ࠸\uedc6뚟ᡴﴶ䛪⮰赪", 23227 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())));
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        private a m3400(boolean z10) {
            int i10 = (f3358 + 73) % 128;
            f3359 = i10;
            this.f3365 = z10;
            int i11 = i10 + 53;
            f3358 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        private a m3401(boolean z10) {
            int i10 = f3359;
            this.f3366 = z10;
            f3358 = (i10 + 53) % 128;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ int m3402(a aVar) {
            int i10 = (f3359 + 11) % 128;
            f3358 = i10;
            int i11 = aVar.f3367;
            f3359 = (i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            return i11;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3405(a aVar) {
            int i10 = (f3358 + 93) % 128;
            f3359 = i10;
            boolean z10 = aVar.f3366;
            int i11 = i10 + 41;
            f3358 = i11 % 128;
            if (i11 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m3407(a aVar) {
            int i10 = (f3359 + 53) % 128;
            f3358 = i10;
            String str = aVar.f3368;
            f3359 = (i10 + 89) % 128;
            return str;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m3409(a aVar) {
            int i10 = f3358;
            f3359 = (i10 + 1) % 128;
            String str = aVar.f3369;
            int i11 = i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f3359 = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3411(a aVar) {
            int i10 = f3358;
            f3359 = (i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            boolean z10 = aVar.f3365;
            int i11 = i10 + 91;
            f3359 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m3403(String str, int i10) {
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
                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f3363);
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

        /* renamed from: ﻛ, reason: contains not printable characters */
        private a m3404(String str) {
            int i10 = f3359 + 99;
            f3358 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f3368 = str;
                return this;
            }
            this.f3368 = str;
            int i11 = 2 / 0;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private a m3406(String str) {
            int i10 = f3359 + 73;
            f3358 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f3369 = str;
                return this;
            }
            this.f3369 = str;
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m3408(int i10) {
            int i11 = (f3359 + 9) % 128;
            f3358 = i11;
            this.f3367 = i10;
            int i12 = i11 + 27;
            f3359 = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m3410(String str, int i10) {
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
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3364)) ^ ((c11 >>> 5) + f3360)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3361) ^ ((c12 + i12) ^ ((c12 << 4) + f3362))));
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
    }

    static {
        m3370();
        f3320 = m3387("⸂莇䀰嬙繽敧낙\uf52d者좨ȅ뎥\ue1ef䁢䩼鴀䃀ᷮꋔ蘥ꉦ⌼瓢ᑒ뮒ʱ\uf476眎뮒ʱ\uf476眎ꃁ䆩\ue421腤㣈堂\ue5f0⍙", 39 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        int i10 = f3317 + 81;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public w(JSONObject jSONObject, it itVar) {
        super(itVar);
        this.f3324 = false;
        this.f3326 = false;
        this.f3322 = false;
        this.f3321 = false;
        m3397(jSONObject);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static void m3370() {
        f3314 = (char) 10632;
        f3319 = (char) 43474;
        f3315 = (char) 58198;
        f3318 = (char) 32457;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m3371() {
        int i10 = f3317;
        int i11 = i10 + 31;
        f3316 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = f3320;
        int i12 = i10 + 59;
        f3316 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3373(w wVar) {
        int i10 = f3316 + 93;
        f3317 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = wVar.f3322;
        if (i11 != 0) {
            int i12 = 14 / 0;
        }
        return z10;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private jg m3374() {
        int i10 = f3317;
        int i11 = i10 + 13;
        f3316 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        jg jgVar = this.f3325;
        int i12 = i10 + 65;
        f3316 = i12 % 128;
        if (i12 % 2 != 0) {
            return jgVar;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ jg m3376(w wVar) {
        int i10 = f3317 + 45;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            wVar.m3374();
            throw null;
        }
        jg jgVarM3374 = wVar.m3374();
        f3317 = (f3316 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return jgVarM3374;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ a m3382(w wVar) {
        int i10 = f3317 + 43;
        int i11 = i10 % 128;
        f3316 = i11;
        int i12 = i10 % 2;
        a aVar = wVar.f3323;
        if (i12 == 0) {
            int i13 = 73 / 0;
        }
        f3317 = (i11 + 89) % 128;
        return aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m3377(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).onActivityCreated(activity, bundle);
                    w.m3384();
                    w.m3385(w.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        w.m3381(w.this, false);
                        return;
                    }
                    w.m3381(w.this, bundle2.getBoolean(w.m3371()));
                    if (w.m3389(w.this)) {
                        w.m3385(w.this, true);
                    }
                    w.m3392(w.this, true);
                }
            }
        });
        f3317 = (f3316 + 77) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m3377(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws JSONException {
                if (w.m3380(w.this, activity)) {
                    p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            w.m3376(w.this).onActivityDestroyed(activity);
                        }
                    });
                    if (w.m3379(w.this) && w.m3389(w.this) && activity.isFinishing()) {
                        w.this.m3394(activity);
                    }
                }
            }
        });
        int i10 = f3317 + 59;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 7 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.8
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).onActivityPaused(activity);
                }
            }
        });
        int i10 = f3317 + 65;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m3377(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.9
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws JSONException {
                if (w.m3380(w.this, activity)) {
                    p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.9.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            w.m3376(w.this).onActivityResumed(activity);
                        }
                    });
                    w.m3390(w.this, false);
                    w.m3385(w.this, true);
                    if ((!w.m3389(w.this) || w.m3391(w.this)) && !activity.isFinishing()) {
                        w wVar = w.this;
                        Activity activity2 = activity;
                        wVar.m3396(activity2, w.m3386(activity2));
                    }
                    w.m3392(w.this, false);
                }
            }
        });
        int i10 = f3317 + 5;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m3377(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.6
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(w.m3371(), w.m3389(w.this));
                    }
                    w.m3390(w.this, true);
                }
            }
        });
        int i10 = f3317 + 77;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).onActivityStarted(activity);
                }
            }
        });
        int i10 = f3316 + 69;
        f3317 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m3377(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws JSONException {
                if (w.m3380(w.this, activity)) {
                    p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.7.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            w.m3376(w.this).onActivityStopped(activity);
                        }
                    });
                    if (w.m3379(w.this) && !w.m3373(w.this) && activity.isFinishing()) {
                        w.this.m3394(activity);
                    }
                }
            }
        });
        f3316 = (f3317 + 57) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﻛ */
    public final /* synthetic */ void mo3345(Activity activity) throws JSONException {
        int i10 = f3316 + 5;
        f3317 = i10 % 128;
        int i11 = i10 % 2;
        m3394(activity);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f3316 + 17;
        f3317 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﾇ */
    public final /* synthetic */ View mo546(Activity activity) {
        f3316 = (f3317 + 5) % 128;
        View viewM3378 = m3378(activity);
        int i10 = f3316 + 31;
        f3317 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 46 / 0;
        }
        return viewM3378;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﾒ */
    public final /* synthetic */ void mo3347(Activity activity, String str) throws JSONException {
        int i10 = f3317 + 45;
        f3316 = i10 % 128;
        int i11 = i10 % 2;
        m3396(activity, str);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f3316 + 97;
        f3317 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m3372(Activity activity) {
        f3317 = (f3316 + 7) % 128;
        String hexString = Integer.toHexString(activity.hashCode());
        int i10 = f3316 + 83;
        f3317 = i10 % 128;
        if (i10 % 2 == 0) {
            return hexString;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean m3375(Activity activity) {
        f3316 = (f3317 + 53) % 128;
        Class<?> cls = activity.getClass();
        if (this.f3327 != null) {
            return a.m3405(this.f3323) ? this.f3327.equals(cls) : this.f3327.isAssignableFrom(cls);
        }
        int i10 = f3317 + 23;
        f3316 = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3379(w wVar) {
        int i10 = f3317;
        f3316 = (i10 + 63) % 128;
        boolean z10 = wVar.f3326;
        int i11 = i10 + 79;
        f3316 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m3383(w wVar, Class cls) {
        int i10 = f3316 + 101;
        f3317 = i10 % 128;
        int i11 = i10 % 2;
        wVar.f3327 = cls;
        if (i11 == 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    public static /* synthetic */ String m3386(Activity activity) {
        int i10 = f3317 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f3316 = i10 % 128;
        int i11 = i10 % 2;
        String strM3372 = m3372(activity);
        if (i11 == 0) {
            int i12 = 17 / 0;
        }
        return strM3372;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3391(w wVar) {
        int i10 = (f3317 + 75) % 128;
        f3316 = i10;
        boolean z10 = wVar.f3321;
        int i11 = i10 + 101;
        f3317 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 19 / 0;
        }
        return z10;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3393() {
        int i10 = f3317 + 111;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            m3417((s) null);
            m3395((jg) null);
            jf.m2969().m2973(this);
            throw null;
        }
        m3417((s) null);
        m3395((jg) null);
        jf.m2969().m2973(this);
        int i11 = f3316 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3317 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3380(w wVar, Activity activity) {
        f3317 = (f3316 + 45) % 128;
        boolean zM3375 = wVar.m3375(activity);
        int i10 = f3317 + 101;
        f3316 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM3375;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3389(w wVar) {
        int i10 = f3317 + 9;
        int i11 = i10 % 128;
        f3316 = i11;
        int i12 = i10 % 2;
        boolean z10 = wVar.f3324;
        if (i12 == 0) {
            throw null;
        }
        f3317 = (i11 + 9) % 128;
        return z10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3392(w wVar, boolean z10) {
        int i10 = (f3316 + 53) % 128;
        f3317 = i10;
        wVar.f3321 = z10;
        int i11 = i10 + 43;
        f3316 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ｋ */
    public final /* synthetic */ void mo545(Activity activity, List list) {
        int i10 = f3316 + 77;
        f3317 = i10 % 128;
        int i11 = i10 % 2;
        m3388(activity, (List<WebView>) list);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3381(w wVar, boolean z10) {
        int i10 = f3316 + 1;
        int i11 = i10 % 128;
        f3317 = i11;
        int i12 = i10 % 2;
        wVar.f3324 = z10;
        if (i12 != 0) {
            throw null;
        }
        f3316 = (i11 + 107) % 128;
        return z10;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3384() {
        f3316 = (f3317 + 31) % 128;
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3390(w wVar, boolean z10) {
        int i10 = (f3317 + 115) % 128;
        f3316 = i10;
        wVar.f3322 = z10;
        int i11 = i10 + 93;
        f3317 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 64 / 0;
        }
        return z10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3398() {
        int i10 = f3317 + 101;
        f3316 = i10 % 128;
        if (i10 % 2 != 0) {
            jf.m2969().m2970(this);
        } else {
            jf.m2969().m2970(this);
            int i11 = 3 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3385(w wVar, boolean z10) {
        int i10 = f3317 + 59;
        f3316 = i10 % 128;
        int i11 = i10 % 2;
        wVar.f3326 = z10;
        if (i11 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3395(jg jgVar) {
        int i10 = f3316;
        this.f3325 = jgVar;
        f3317 = (i10 + 33) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3397(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m3344((v.b) aVar);
        this.f3323 = aVar;
        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f3334 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f3335 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f3336 = 0;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static long f3337 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char f3338 = 46398;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m3399(String str, int i10, String str2, String str3, char c10) {
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
                        char[] cArr4 = (char[]) cArr2.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c10 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i10));
                        int length = cArr3.length;
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
                                cArr6[i15] = (char) ((((c12 ^ cArr3[i15]) ^ f3337) ^ f3335) ^ f3338);
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                try {
                    w wVar = w.this;
                    w.m3383(wVar, Class.forName(a.m3409(w.m3382(wVar))));
                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            w.this.m3398();
                        }
                    });
                    f3334 = (f3336 + 75) % 128;
                } catch (ClassNotFoundException e10) {
                    String strIntern = m3399("俛宩⺵눭鵳晣끾댶须Ƛῠﬕ\udb1a꼍傲뒝㩲", TextUtils.indexOf((CharSequence) "", '0') + 1996300716, "\uabfcﴡ륶쉚", "\u0000\u0000\u0000\u0000", (char) (View.resolveSize(0, 0) + 23225)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m3399("\ue0c8ᇒ\u20c1폩\uf5db\u0af6샕\uf83dꊊ叇튚链ꝡ캩媴ᭉⵘ釄닮ꕫ煻癚䖧⚹晱＜\uf093ᕒ併", (-1712183083) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "풼\uf228⪙\uef70", "\u0000\u0000\u0000\u0000", (char) (ExpandableListView.getPackedPositionChild(0L) + 28715)).intern());
                    sb2.append(a.m3409(w.m3382(w.this)));
                    sb2.append(m3399("ྐྵ辉", ViewConfiguration.getLongPressTimeout() >> 16, "\u1718項❢㽱", "\u0000\u0000\u0000\u0000", (char) (28967 - View.combineMeasuredStates(0, 0))).intern());
                    sb2.append(e10.getLocalizedMessage());
                    k.m3147(strIntern, sb2.toString());
                }
            }
        });
        int i10 = f3316 + 91;
        f3317 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 89 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* renamed from: ﾒ */
    public final void mo768(final Activity activity) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).mo768(activity);
                }
            }
        });
        f3316 = (f3317 + 71) % 128;
    }

    /* renamed from: ﻛ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m3378(Activity activity) {
        int i10 = f3316 + 89;
        f3317 = i10 % 128;
        if (i10 % 2 == 0) {
            return activity.findViewById(R.id.content);
        }
        activity.findViewById(R.id.content);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* renamed from: ｋ */
    public final void mo767(final Activity activity) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.w.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (w.m3380(w.this, activity)) {
                    w.m3376(w.this).mo767(activity);
                }
            }
        });
        int i10 = f3316 + 49;
        f3317 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﻛ */
    public final s<WebView, Activity> mo542() {
        int i10 = (f3317 + 61) % 128;
        f3316 = i10;
        int i11 = i10 + 113;
        f3317 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return this;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m3377(iu iuVar) {
        f3316 = (f3317 + 45) % 128;
        if (a.m3411(this.f3323)) {
            p.m3251(iuVar);
            int i10 = f3317 + 9;
            f3316 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return;
        }
        p.m3253(iuVar);
        int i11 = f3317 + 111;
        f3316 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 78 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m3388(Activity activity, List<WebView> list) {
        int i10 = f3317 + 57;
        f3316 = i10 % 128;
        if (i10 % 2 == 0) {
            ke.m3217(activity, WebView.class, a.m3402(this.f3323), a.m3407(this.f3323), false, false, null, this.f3323.f3312, list);
        } else {
            ke.m3217(activity, WebView.class, a.m3402(this.f3323), a.m3407(this.f3323), false, false, null, this.f3323.f3312, list);
        }
        int i11 = f3317 + 7;
        f3316 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3396(Activity activity, String str) throws JSONException {
        if (!this.f3324) {
            int i10 = f3317 + 39;
            f3316 = i10 % 128;
            int i11 = i10 % 2;
            this.f3324 = true;
            super.mo3347((w) activity, str);
            int i12 = f3316 + 75;
            f3317 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ig.f2654, true);
        } catch (JSONException e10) {
            String strIntern = m3387("藋湇\u3101鎕巓\ue0ad瓢ᑒꃁ䆩盼\u173c⎸沴숗詈嶼옣", 17 - Drawable.resolveOpacity(0, 0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3387("ꈑ扫兂\u171d⭉㏦ᔸ茴\uf61d\uf5fd嗚頁粜\uf21e푆♢ⷃ糀⏁∻⎸沴㽛㱠\uf4c3ᑉ楮辴낙\uf52d\ueaca༆", ExpandableListView.getPackedPositionType(0L) + 32).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
        }
        m3343(jSONObject, (JSONObject) activity, str);
        int i13 = f3317 + 1;
        f3316 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 10 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3394(Activity activity) throws JSONException {
        int i10 = f3317 + 61;
        f3316 = i10 % 128;
        int i11 = i10 % 2;
        super.mo3345((w) activity);
        this.f3324 = false;
        f3316 = (f3317 + 33) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﾇ */
    public final ab mo547() {
        z zVar = new z();
        f3316 = (f3317 + 53) % 128;
        return zVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3387(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3314)) ^ ((c11 >>> 5) + f3315)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3319) ^ ((c12 + i12) ^ ((c12 << 4) + f3318))));
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
}
