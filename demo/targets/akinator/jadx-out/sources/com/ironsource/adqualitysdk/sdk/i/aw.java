package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ay;
import com.ironsource.adqualitysdk.sdk.i.az.AnonymousClass4;
import com.ironsource.adqualitysdk.sdk.i.az.AnonymousClass5;
import com.ironsource.adqualitysdk.sdk.i.ja;
import com.vungle.ads.internal.protos.Sdk;
import cv.BLca.YsiBvdpw;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class aw {

    /* renamed from: リ, reason: contains not printable characters */
    private static int f637 = 1;

    /* renamed from: ヮ, reason: contains not printable characters */
    private static int f638 = 0;

    /* renamed from: ヶ, reason: contains not printable characters */
    private static byte[] f639 = {-66, 28, 18, -28, 18, -11, 61, -12, 58, 56, -94, 27, -24, -28, 31, 5, -4, -26, -28, 16, 80, -22, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, -117, 120, -128, 117, -117, -110, 93, -123, 125, -105, 120, 113, -122, 121, -86, -87, 83, -86, 90, -83, -95, 67, -6, 2, -81, 87, -67, 82, 91, -84, 83, -96, -17, 21, 85, -87, -87, -84, -81, -19, 2, -81, 81, -84, -127, 92, 94, -96, 93, 80, 24, -13, 94, -90, 76, -93, -86, 93, -94, 81, 30, -28, -92, 88, 88, 93, 94, 28, -13, 94, -96, 93, 112, -67, 82, 15, 9, -6, -15, 3, -7, -83, -19, 17, -23, 30, 21, -6, 30, 49, -46, 44, 42, 64, -68, 77, -20, 10, -67, -15, 4, 71, -71, -69, 74, -69, -12, 20, -67, -71, -10, 21, -86, 82, -17, 21, -71, -69, 67, -87, 70, 79, -72, 71, -76, -5, 3, 69, 76, -20, 2, 79, -9, 3, 79, 71, -9, 20, -71, -86, 68, 65, -12, 20, -117, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: 丫, reason: contains not printable characters */
    private static short[] f640 = null;

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f641 = -1233204606;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static char f642 = 29089;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f643 = 96;

    /* renamed from: סּ, reason: contains not printable characters */
    private static char f644 = 61020;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f645 = 1390409778;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f646 = 30053;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f647 = 34416;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private bb f648;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private ISAdQualityInitListener f649;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private iw f650;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f653;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private az f655;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f659 = false;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<cn> f660 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<gk> f657 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, JSONObject> f656 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    private Map<String, String> f658 = new HashMap();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private de f651 = new de();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private ds f654 = ds.m2416();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, au> f652 = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.aw$1, reason: invalid class name */
    public class AnonymousClass1 extends iu {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private /* synthetic */ String f661;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private /* synthetic */ List f662;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f663;

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Map f665;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ Context f666;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Runnable f667;

        public AnonymousClass1(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f663 = str;
            this.f666 = context;
            this.f661 = str2;
            this.f662 = list;
            this.f665 = map;
            this.f667 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() throws JSONException {
            if (aq.m814().mo844(this.f663, aw.m934(aw.this))) {
                aw.m974(aw.this, this.f666, this.f661, this.f663, this.f662, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.1.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        if (aw.m937(aw.this)) {
                            p.m3254(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.1.1.5
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    aw.m975(aw.this, anonymousClass1.f666, anonymousClass1.f665, anonymousClass1.f667);
                                }
                            }, aq.m814().mo818());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            aw.m953(aw.this, this.f663, jSONObject);
            aw.m933(aw.this).put(this.f663, jSONObject);
            p.m3254(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.1.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    aw.m975(aw.this, anonymousClass1.f666, anonymousClass1.f665, anonymousClass1.f667);
                }
            }, aq.m814().mo818());
        }
    }

    public aw(iw iwVar, ah ahVar, String str, az azVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f650 = iwVar;
        bb bbVar = new bb(p.m3250(), ahVar);
        this.f648 = bbVar;
        kd.m3205(bbVar);
        this.f648.m1137(new io() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.3

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f717 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f718 = -1212349987351233413L;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f719;

            @Override // com.ironsource.adqualitysdk.sdk.i.io
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final JSONObject mo1000(String str2, JSONObject jSONObject) {
                f719 = (f717 + 103) % 128;
                String str3 = YsiBvdpw.kjejCNVffVfPRw;
                if (!str2.equals(m999("ﰏ桀풲䃿괥\u197e藖\uf204", 37963 - TextUtils.indexOf(str3, str3)).intern())) {
                    return null;
                }
                f717 = (f719 + 7) % 128;
                JSONObject jSONObjectM990 = aw.this.m990();
                int i10 = f719 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f717 = i10 % 128;
                if (i10 % 2 != 0) {
                    return jSONObjectM990;
                }
                throw null;
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m999(String str2, int i10) {
                String str3;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
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
                                cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f718);
                                j.f2851++;
                            } else {
                                str3 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }
        });
        this.f653 = str;
        this.f655 = azVar;
        this.f649 = iSAdQualityInitListener;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private synchronized void m929() {
        f638 = (f637 + 11) % 128;
        if (this.f655.m1045()) {
            m996().adQualitySdkInitSuccess();
            f638 = (f637 + 27) % 128;
        } else {
            f638 = (f637 + 19) % 128;
            m996().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m942((-43) - View.MeasureSpec.getMode(0), (short) (ImageFormat.getBitsPerPixel(0) + 1), View.getDefaultSize(0, 0) + 1233204734, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 73), View.combineMeasuredStates(0, 0) - 1390409713).intern());
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m930() {
        int i10 = f638 + 65;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            aq.m814().mo819();
            throw null;
        }
        return aq.m814().mo819();
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m931() {
        boolean z10 = false;
        if (!aq.m814().mo816() || !m930()) {
            return false;
        }
        int i10 = f637;
        int i11 = i10 + 103;
        f638 = i11 % 128;
        if (i11 % 2 == 0) {
            z10 = true;
        }
        f638 = (i10 + 77) % 128;
        return z10;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Map m933(aw awVar) {
        int i10 = f637 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f638 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, JSONObject> mapM936 = awVar.m936();
        if (i11 != 0) {
            int i12 = 91 / 0;
        }
        return mapM936;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m934(aw awVar) {
        int i10 = f637;
        int i11 = i10 + 1;
        f638 = i11 % 128;
        int i12 = i11 % 2;
        String str = awVar.f653;
        if (i12 != 0) {
            throw null;
        }
        f638 = (i10 + 61) % 128;
        return str;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m937(aw awVar) {
        int i10 = f638 + 59;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM930 = awVar.m930();
        if (i11 == 0) {
            int i12 = 16 / 0;
        }
        return zM930;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m939(aw awVar) {
        int i10 = f638 + 115;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        List<gk> listM935 = awVar.m935();
        if (i11 == 0) {
            int i12 = 34 / 0;
        }
        f638 = (f637 + 19) % 128;
        return listM935;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m941(aw awVar) throws JSONException {
        int i10 = f638 + 65;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m973();
        if (i11 == 0) {
            throw null;
        }
        int i12 = f637 + 57;
        f638 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 59 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m947(aw awVar) {
        int i10 = f638 + 79;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m929();
        if (i11 == 0) {
            int i12 = 42 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ds m949(aw awVar, ds dsVar) {
        int i10 = f638;
        f637 = (i10 + 99) % 128;
        awVar.f654 = dsVar;
        f637 = (i10 + 103) % 128;
        return dsVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ az m957(aw awVar) {
        int i10 = f637 + 93;
        f638 = i10 % 128;
        int i11 = i10 % 2;
        az azVar = awVar.f655;
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        return azVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ cn m968(aw awVar, Context context, String str, bg bgVar) {
        int i10 = f638 + 67;
        f637 = i10 % 128;
        if (i10 % 2 != 0) {
            return awVar.m958(context, str, bgVar);
        }
        awVar.m958(context, str, bgVar);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m979(aw awVar) {
        int i10 = f637 + 95;
        f638 = i10 % 128;
        int i11 = i10 % 2;
        List<cn> listM938 = awVar.m938();
        if (i11 != 0) {
            int i12 = 96 / 0;
        }
        return listM938;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, String> m932() {
        int i10 = f638 + 69;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return this.f658;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private synchronized List<gk> m935() {
        List<gk> list;
        int i10 = f638;
        list = this.f657;
        f637 = (i10 + 67) % 128;
        return list;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m936() {
        Map<String, JSONObject> map;
        int i10 = f638;
        int i11 = i10 + 43;
        f637 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        map = this.f656;
        f637 = (i10 + 101) % 128;
        return map;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private synchronized List<cn> m938() {
        List<cn> list;
        int i10 = (f638 + 89) % 128;
        f637 = i10;
        list = this.f660;
        f638 = (i10 + 103) % 128;
        return list;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<cn> m940() {
        int i10 = f637 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f660 != null) {
            return new ArrayList(this.f660);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = f638 + 61;
        f637 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m950(aw awVar) {
        f637 = (f638 + 103) % 128;
        Map<String, String> mapM932 = awVar.m932();
        int i10 = f638 + 113;
        f637 = i10 % 128;
        if (i10 % 2 != 0) {
            return mapM932;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m963(aw awVar, Context context, List list, List list2, iu iuVar) {
        f638 = (f637 + 61) % 128;
        awVar.m984(context, list, list2, iuVar);
        int i10 = f638 + 63;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m969(aw awVar) {
        int i10 = f638 + 5;
        f637 = i10 % 128;
        if (i10 % 2 != 0) {
            return awVar.m940();
        }
        awVar.m940();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m980(aw awVar, Map map) {
        int i10 = f637;
        int i11 = i10 + 105;
        f638 = i11 % 128;
        int i12 = i11 % 2;
        awVar.f652 = map;
        if (i12 != 0) {
            throw null;
        }
        f638 = (i10 + 11) % 128;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m989() {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.12
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                Iterator it = aw.m969(aw.this).iterator();
                while (it.hasNext()) {
                    ((cn) it.next()).m1948();
                }
                aw.m979(aw.this).clear();
                aw.m970(aw.this, (List) null);
            }
        });
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1
            public AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                az.this.f831.clear();
                az.this.f831 = null;
            }
        });
        this.f655 = null;
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.15
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws Exception {
                aw.m949(aw.this, (ds) null);
            }
        });
        f637 = (f638 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m952(aw awVar, Context context) {
        int i10 = f638 + 43;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m944(context);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f637 + 13;
        f638 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m964(aw awVar, cn cnVar, String str) {
        int i10 = f637 + 113;
        f638 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m965(cnVar, str);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f637 + 51;
        f638 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m970(aw awVar, List list) {
        int i10 = f638 + 19;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        awVar.f660 = list;
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        return list;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m986(aw awVar, Context context, String str, String str2, gk gkVar, cn cnVar, boolean z10, bg bgVar, iu iuVar) {
        f638 = (f637 + 75) % 128;
        awVar.m983(context, str, str2, gkVar, cnVar, z10, bgVar, iuVar);
        f638 = (f637 + 25) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m953(aw awVar, String str, JSONObject jSONObject) throws JSONException {
        int i10 = f637 + 81;
        f638 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m954(str, jSONObject);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f638 + 69;
        f637 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m971(aw awVar, cn cnVar) throws JSONException {
        JSONObject jSONObjectM981;
        int i10 = f637 + 75;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM981 = m981(cnVar);
            int i11 = 46 / 0;
        } else {
            jSONObjectM981 = m981(cnVar);
        }
        f637 = (f638 + 63) % 128;
        return jSONObjectM981;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m987(aw awVar, Context context, String str, String str2, gk gkVar, iu iuVar) {
        f637 = (f638 + 35) % 128;
        awVar.m961(context, str, str2, gkVar, iuVar);
        int i10 = f637 + 45;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m993(ISAdQualityAdListener iSAdQualityAdListener) {
        f638 = (f637 + 5) % 128;
        this.f648.m1133(iSAdQualityAdListener);
        f638 = (f637 + 87) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m974(aw awVar, Context context, String str, String str2, List list, iu iuVar) {
        int i10 = f638 + 35;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m962(context, str, str2, (List<gk>) list, iuVar);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m988(aw awVar, Context context, String str, String str2, List list, iu iuVar) {
        f637 = (f638 + 27) % 128;
        awVar.m946(context, str, str2, (List<gk>) list, iuVar);
        int i10 = f637 + 81;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m991(final Context context, final Runnable runnable) {
        try {
            int i10 = f638 + 87;
            f637 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (!this.f659) {
                String strIntern = m959("鄣\ue9ce糢绊땒쿅楪Ἥ捍╣ደ\uf112", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m942((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 61, (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1233204606 - View.resolveSizeAndState(0, 0, 0), (byte) (24 - ExpandableListView.getPackedPositionChild(0L)), (-1390409732) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                sb2.append(IronSourceAdQuality.getSDKVersion());
                sb2.append(m959("琂\ue854⨑暢⨑暢⨑暢⨑暢⨑暢⨑暢ꃸᤧ", View.MeasureSpec.getSize(0) + 15).intern());
                k.m3138(strIntern, sb2.toString());
                iu iuVar = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.9.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                runnable.run();
                            }
                        });
                        aw.m952(aw.this, context);
                    }
                };
                if (m931()) {
                    int i11 = f638 + 65;
                    f637 = i11 % 128;
                    if (i11 % 2 == 0) {
                        m960(context, iuVar);
                        int i12 = 66 / 0;
                    } else {
                        m960(context, iuVar);
                    }
                } else {
                    m982(context, iuVar);
                }
                this.f659 = true;
                return;
            }
            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.11
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    runnable.run();
                }
            });
            int i13 = f638 + 83;
            f637 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m992() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = new HashSet(m932().keySet()).iterator();
            f638 = (f637 + 97) % 128;
            while (it.hasNext()) {
                f637 = (f638 + 1) % 128;
                String str = (String) it.next();
                jSONObject2.put(str, m932().get(str));
            }
            jSONObject.put(m959("\uf72e⩙뼮\ue54d", Color.red(0) + 4).intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            k.m3145(m942(AndroidCharacter.getMirror('0') - 128, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1233204641 - TextUtils.indexOf("", ""), (byte) ((-122) - (Process.myTid() >> 22)), (-1390409711) - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m942((-68) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) Color.argb(0, 0, 0, 0), 1233204685 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (92 - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myTid() >> 22) - 1390409709).intern(), (Throwable) e10);
            return jSONObject;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m975(aw awVar, Context context, Map map, Runnable runnable) {
        f637 = (f638 + 109) % 128;
        awVar.m985(context, map, runnable);
        int i10 = f637 + 23;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m984(Context context, final List<gk> list, final List<String> list2, final iu iuVar) {
        final Context context2;
        f638 = (f637 + 5) % 128;
        if (list.isEmpty()) {
            return;
        }
        gk gkVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (list.isEmpty()) {
            int i10 = f637 + 95;
            f638 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            context2 = context;
        } else {
            context2 = context;
            iu iuVar2 = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.14
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    p.m3257(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.14.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            aw.m963(aw.this, context2, list, list2, iuVar);
                        }
                    }, aq.m814().mo818());
                }
            };
            f638 = (f637 + 17) % 128;
            iuVar = iuVar2;
        }
        m945(context2, gkVarRemove, strRemove, iuVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m945(final Context context, final gk gkVar, final String str, final iu iuVar) {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.13
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                final String lowerCase = str.toLowerCase();
                aw.m957(aw.this).m1044(lowerCase);
                p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.13.1

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static int f686 = 0;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static char f687 = 41652;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f688 = 1;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static char f689 = 62978;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static char f690 = 52973;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static char f691 = 38670;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static String m997(String str2, int i10) {
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
                                    int i11 = o.f3167;
                                    if (i11 < cArr.length) {
                                        cArr3[0] = cArr[i11];
                                        cArr3[1] = cArr[i11 + 1];
                                        int i12 = 58224;
                                        for (int i13 = 0; i13 < 16; i13++) {
                                            char c10 = cArr3[1];
                                            char c11 = cArr3[0];
                                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f690)) ^ ((c11 >>> 5) + f687)));
                                            cArr3[1] = c12;
                                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f691) ^ ((c12 + i12) ^ ((c12 << 4) + f689))));
                                            i12 -= 40503;
                                        }
                                        int i14 = o.f3167;
                                        cArr2[i14] = cArr3[0];
                                        cArr2[i14 + 1] = cArr3[1];
                                        o.f3167 = i14 + 2;
                                    } else {
                                        str3 = new String(cArr2, 0, i10);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str3;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        String strIntern = m997("㹆鉌촣Ḷ욨哯팯엕깓㝄踠ꨠ㯆\uf75c\ueeb1\udca3", TextUtils.lastIndexOf("", '0', 0, 0) + 17).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m997("㱝\uf420荳蕦㠥㝰ꃵ쮏溞뢜ꎬ㡯\uf51fꊯ쁇ꮰ瘾◹昞瓄䦰豯ᐴ\udc2d", KeyEvent.normalizeMetaState(0) + 23).intern());
                        sb2.append(lowerCase);
                        k.m3142(strIntern, sb2.toString());
                        try {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            aw.m987(aw.this, context, str, lowerCase, gkVar, iuVar);
                            int i10 = f688 + 107;
                            f686 = i10 % 128;
                            if (i10 % 2 != 0) {
                                throw null;
                            }
                        } catch (Throwable th2) {
                            p.m3251(aw.m957(aw.this).new AnonymousClass4(lowerCase, ay.d.f828));
                            aw.m950(aw.this).put(str, kd.m3201(th2).toString());
                            String strIntern2 = m997("㹆鉌촣Ḷ욨哯팯엕깓㝄踠ꨠ㯆\uf75c\ueeb1\udca3", TextUtils.getTrimmedLength("") + 16).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m997("篙\uef05纨辑屮輂踀뫈䋃扁ൽࢉꎬ㡯\uf51fꊯ쁇ꮰ瘾◹昞瓄䦰豯ᐴ\udc2d", View.getDefaultSize(0, 0) + 25).intern());
                            sb3.append(lowerCase);
                            kd.m3198(strIntern2, sb3.toString(), th2, true, true, true);
                        }
                    }
                });
            }
        });
        f638 = (f637 + 71) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m976(aw awVar, String str) {
        f638 = (f637 + 115) % 128;
        boolean zM956 = awVar.m956(str);
        f638 = (f637 + 41) % 128;
        return zM956;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m944(final Context context) {
        int i10 = f637 + 49;
        f638 = i10 % 128;
        if (i10 % 2 == 0) {
            if (!m930()) {
                p.m3257(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.17.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                aw.m947(aw.this);
                            }
                        });
                    }
                }, aq.m814().mo824());
                f638 = (f637 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            }
            final Map<String, List<gk>> mapM1150 = bc.m1150();
            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.20
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    aw.m980(aw.this, aq.m814().mo841());
                    aw.m975(aw.this, context, mapM1150, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.20.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            if (aw.m937(aw.this)) {
                                aw.m947(aw.this);
                            }
                        }
                    });
                    aq.m814().mo843(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.20.3

                        /* renamed from: ﮐ, reason: contains not printable characters */
                        private static int f708 = 1;

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static int f709 = 0;

                        /* renamed from: ﺙ, reason: contains not printable characters */
                        private static short[] f710 = null;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f711 = 317769424;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int f712 = 1789779435;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static byte[] f713 = {-19, -89, -104, -96, -115, -89, -82, 117, -99, -107, -85, -104, -111, -102, -103, -58, -3, -42, -40, -48, -26, -45, -52, -43, -44, -31, 24, -111, -44, -64, -26, -46, -32, -51, -54, -32, -48, -38, 30, -114, -50, -38, -46, -33, -42, -61, -33, -6};

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f714 = 35;

                        @Override // com.ironsource.adqualitysdk.sdk.i.at
                        /* renamed from: ﾇ */
                        public final void mo667() throws JSONException {
                            f709 = (f708 + 41) % 128;
                            aw.m980(aw.this, aq.m814().mo841());
                            k.m3142(m998(TextUtils.getCapsMode("", 0, 0) - 36, (short) (103 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) - 317769424, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) - 1789779368).intern(), m998((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 37, (short) (TextUtils.getOffsetBefore("", 0) + 43), (-317769409) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (Process.myPid() >> 22), (-1789779367) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
                            aw.m941(aw.this);
                            int i11 = f708 + 53;
                            f709 = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                        }

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static String m998(int i11, short s10, int i12, byte b10, int i13) {
                            String string;
                            synchronized (n.f3160) {
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    int i14 = f714;
                                    int i15 = i11 + i14;
                                    int i16 = i15 == -1 ? 1 : 0;
                                    if (i16 != 0) {
                                        byte[] bArr = f713;
                                        if (bArr != null) {
                                            i15 = (byte) (bArr[f711 + i12] + i14);
                                        } else {
                                            i15 = (short) (f710[f711 + i12] + i14);
                                        }
                                    }
                                    if (i15 > 0) {
                                        n.f3165 = ((i12 + i15) - 2) + f711 + i16;
                                        n.f3163 = b10;
                                        char c10 = (char) (i13 + f712);
                                        n.f3162 = c10;
                                        sb2.append(c10);
                                        n.f3161 = n.f3162;
                                        n.f3164 = 1;
                                        while (n.f3164 < i15) {
                                            byte[] bArr2 = f713;
                                            if (bArr2 != null) {
                                                int i17 = n.f3165;
                                                n.f3165 = i17 - 1;
                                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i17] + s10)) ^ n.f3163));
                                            } else {
                                                short[] sArr = f710;
                                                int i18 = n.f3165;
                                                n.f3165 = i18 - 1;
                                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i18] + s10)) ^ n.f3163));
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
                    });
                }
            });
            return;
        }
        m930();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m977(cn cnVar) {
        f637 = (f638 + 59) % 128;
        boolean zM948 = m948(cnVar);
        f638 = (f637 + 115) % 128;
        return zM948;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m978(cn cnVar, String str) {
        int i10 = f638 + 95;
        f637 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM955 = m955(cnVar, str);
        if (i11 == 0) {
            int i12 = 51 / 0;
        }
        f637 = (f638 + 103) % 128;
        return zM955;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m973() throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (cn cnVar : m940()) {
            if (m956(cnVar.m1950())) {
                f638 = (f637 + 103) % 128;
                arrayList.add(cnVar);
            }
        }
        Iterator it = arrayList.iterator();
        f637 = (f638 + 37) % 128;
        while (it.hasNext()) {
            final cn cnVar2 = (cn) it.next();
            String strIntern = m942((-80) - ExpandableListView.getPackedPositionGroup(0L), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1233204641 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((-123) - MotionEvent.axisFromString("")), (-1390409711) - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m942((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 87, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1233204722 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 21), (-1390409709) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
            sb2.append(cnVar2.m1951());
            sb2.append(m959("㐃魸\ue5f0伀四派徚书\uec3c笯", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9).intern());
            k.m3138(strIntern, sb2.toString());
            String strM1950 = cnVar2.m1950();
            m954(strM1950, m936().get(strM1950));
            p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.7
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    cnVar2.m1948();
                }
            });
            m938().remove(cnVar2);
        }
        f638 = (f637 + 11) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m982(Context context, iu iuVar) {
        f638 = (f637 + 29) % 128;
        m945(context, bc.m1151(), bc.m1152(), iuVar);
        f637 = (f638 + 35) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m960(Context context, iu iuVar) {
        m984(context, new ArrayList(bc.m1144()), new ArrayList(bc.m1147()), iuVar);
        int i10 = f638 + 37;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m943(List<gk> list) {
        int i10 = f638;
        f637 = (i10 + 3) % 128;
        if (list != null) {
            f637 = (i10 + 81) % 128;
            if (!list.isEmpty() && list.get(0) != null) {
                return list.get(0).mo2524();
            }
        }
        f637 = (f638 + 59) % 128;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m985(Context context, Map<String, List<gk>> map, Runnable runnable) {
        Context context2;
        Map<String, List<gk>> map2;
        Runnable runnable2;
        while (map != null) {
            int i10 = f637 + 49;
            f638 = i10 % 128;
            if (i10 % 2 != 0) {
                map.size();
                throw null;
            }
            if (map.size() <= 0) {
                break;
            }
            String next = map.keySet().iterator().next();
            List<gk> listRemove = map.remove(next);
            String strM943 = m943(listRemove);
            if (strM943 != null) {
                this.f655.m1044(strM943);
                context2 = context;
                map2 = map;
                runnable2 = runnable;
                p.m3253(new AnonymousClass1(strM943, context2, next, listRemove, map2, runnable2));
                if (m930()) {
                    f638 = (f637 + 55) % 128;
                    return;
                }
            } else {
                context2 = context;
                map2 = map;
                runnable2 = runnable;
            }
            context = context2;
            map = map2;
            runnable = runnable2;
        }
        final Runnable runnable3 = runnable;
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                p.m3253(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m962(final Context context, final String str, final String str2, final List<gk> list, final iu iuVar) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.5

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f737 = 42;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f738 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f739 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m1005(int i10, int i11, String str3, int i12, boolean z10) {
                String str4;
                char[] charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
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
                            cArr2[i14] = (char) (cArr2[i14] - f737);
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
                        str4 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                String strIntern = m1005(TextUtils.lastIndexOf("", '0', 0) + 145, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\ufffb\uffe7\f\t\u000e�\uffff\b\b\t\uffdd\f\uffff\u0001\ufffb\b", 11 - (ViewConfiguration.getTouchSlop() >> 8), true).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1005((Process.myTid() >> 22) + 141, ((byte) KeyEvent.getModifierMetaStateMask()) + 24, "\u0000\u0011\f\u000fﾽ￦\u000b\u0006\u0011\u0006\ufffe\t\u0006\u0017\u0006\u000b\u0004ﾽ\u0000\f\u000b\u000b\u0002", 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false).intern());
                sb2.append(str2);
                k.m3142(strIntern, sb2.toString());
                try {
                    aw.m988(aw.this, context, str, str2, list, iuVar);
                } catch (Throwable th2) {
                    if (aw.m957(aw.this) != null) {
                        p.m3251(aw.m957(aw.this).new AnonymousClass4(str2, ay.d.f828));
                    }
                    aw.m950(aw.this).put(str, kd.m3201(th2).toString());
                    String strIntern2 = m1005(View.getDefaultSize(0, 0) + 144, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, "\ufffb\uffe7\f\t\u000e�\uffff\b\b\t\uffdd\f\uffff\u0001\ufffb\b", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, true).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m1005(139 - View.MeasureSpec.getMode(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 25, "\b\r\u0006\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\u000e\u0011\uffbf￤\u0011\u0011\u000e\u0011\uffbf\u0002\u0011\u0004\u0000\u0013", 14 - View.getDefaultSize(0, 0), false).intern());
                    sb3.append(str2);
                    kd.m3198(strIntern2, sb3.toString(), th2, true, true, true);
                    f739 = (f738 + 49) % 128;
                }
            }
        });
        int i10 = f638 + 5;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 84 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m965(final cn cnVar, final String str) {
        final String strM1950 = cnVar.m1950();
        p.m3251(this.f655.new AnonymousClass5(strM1950, ay.a.f813));
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.4

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f721 = 1;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f724;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int[] f725 = {1485007659, 1939020960, -941006970, 462896707, -176291680, 722120486, -1150809040, 1207154011, -1179993113, -1947524827, 1439808645, 1005327270, -1677653051, 464390205, -1172409733, -453430271, 1892063542, 2063000275};

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static char f722 = 6;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static char[] f723 = {'D', 'I', 'S', 'A', 'B', 'L', 'E', 'C', 'o', 'n', 'e', 'c', 't', 'r', GMTDateParser.MONTH, 'a', 'g', ' ', 'i', GMTDateParser.SECONDS, GMTDateParser.DAY_OF_MONTH, 'b', 'l', 'K', 'v', 'y', AbstractJsonLexerKt.UNICODE_ESC, 'p', GMTDateParser.HOURS, 'F', 'G', 'H', 'J', 'N', 'O', 'P'};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m1002(int i10, byte b10, String str2) {
                String str3;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (h.f2445) {
                    try {
                        char[] cArr2 = f723;
                        char c10 = f722;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            h.f2448 = 0;
                            while (true) {
                                int i11 = h.f2448;
                                if (i11 >= i10) {
                                    break;
                                }
                                h.f2450 = cArr[i11];
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
                                        int i12 = (h.f2447 * c10) + h.f2444;
                                        int i13 = (h.f2446 * c10) + h.f2443;
                                        int i14 = h.f2448;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (h.f2447 == h.f2446) {
                                        h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                        h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                        int i15 = (h.f2447 * c10) + h.f2444;
                                        int i16 = (h.f2446 * c10) + h.f2443;
                                        int i17 = h.f2448;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (h.f2447 * c10) + h.f2443;
                                        int i19 = (h.f2446 * c10) + h.f2444;
                                        int i20 = h.f2448;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                h.f2448 += 2;
                            }
                        }
                        str3 = new String(cArr3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws Exception {
                f721 = (f724 + 37) % 128;
                JSONObject jSONObjectM971 = aw.m971(aw.this, cnVar);
                jSONObjectM971.put(m1001(new int[]{80787808, 87933237}, 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), true);
                aw.m933(aw.this).put(cnVar.m1950(), jSONObjectM971);
                String strM1945 = cnVar.m1945();
                if (m1002(8 - Color.alpha(0), (byte) (TextUtils.getTrimmedLength("") + 19), "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006").intern().equals(strM1945)) {
                    String strIntern = m1002(15 - TextUtils.lastIndexOf("", '0', 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), "\b\tää\u000b\u0006\u000e\u0006\u000e\u000f\u0015\u000f\u0010\u0011\u0007\u0010").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cnVar.m1951());
                    sb2.append(m1002(TextUtils.lastIndexOf("", '0') + 23, (byte) (54 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0017\u0011\t\n\n\u000b\u0006\u0011\u0007\u000e\f\u0017\u0017\r\u0015\u0013\u0015\r\u0016\u0017\b\u0016").intern());
                    k.m3142(strIntern, sb2.toString());
                    p.m3251(aw.m957(aw.this).new AnonymousClass5(strM1950, ay.a.f815));
                } else if (aw.m976(aw.this, strM1950)) {
                    String strIntern2 = m1002(TextUtils.indexOf("", "", 0) + 16, (byte) (118 - Color.alpha(0)), "\b\tää\u000b\u0006\u000e\u0006\u000e\u000f\u0015\u000f\u0010\u0011\u0007\u0010").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cnVar.m1951());
                    sb3.append(m1001(new int[]{-340634122, -1610354385, 2033189240, -804002619, -1701060329, 1992396819, -1451711041, -292552502, 902928751, 1944657189, 1393282767, -245956943, -765915568, -227416314, -1760402196, -733046947, -787668847, 852229423, 2090431582, -187378673}, Color.blue(0) + 39).intern());
                    k.m3142(strIntern2, sb3.toString());
                    p.m3251(aw.m957(aw.this).new AnonymousClass5(strM1950, ay.a.f815));
                    jSONObjectM971.put(m1002((ViewConfiguration.getTouchSlop() >> 8) + 3, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 93), "\u0017\bÐ").intern(), true);
                    f721 = (f724 + 23) % 128;
                } else if (aw.m978(cnVar, strM1945)) {
                    p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.4.4

                        /* renamed from: ﱟ, reason: contains not printable characters */
                        private static int f730 = 1;

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static int f731 = 0;

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static char f732 = 60476;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static char f733 = 56619;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static char f734 = 16348;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static char f735 = 22819;

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            cnVar.m1949();
                            p.m3251(aw.m957(aw.this).new AnonymousClass5(strM1950, ay.a.f816));
                            String strIntern3 = m1004("㧦\uef13\ud91bⓌ⨐軠끂쨸\udac8篤\ua4c8麙ه戻㠬᷒", Process.getGidForName("") + 17).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(cnVar.m1951());
                            sb4.append(m1004("醈콩묣쿆줐Ꝓ纣누䩜ঠ슦鶬ྯ㈠秴㘹ﴜ犳諣ꦀ招㮂꣐\uf6b1૽䢙삮荠톗\uea1c웍櫓츦涜瀽뎠", View.resolveSize(0, 0) + 35).intern());
                            k.m3142(strIntern3, sb4.toString());
                            int i10 = f731 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                            f730 = i10 % 128;
                            if (i10 % 2 == 0) {
                                throw null;
                            }
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﾒ */
                        public final void mo1003(Throwable th2) throws JSONException {
                            try {
                                ((JSONObject) aw.m933(aw.this).get(cnVar.m1950())).put(m1004("૽䢙삮荠", 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), false);
                                f731 = (f730 + 3) % 128;
                            } catch (JSONException e10) {
                                k.m3145(m1004("㧦\uef13\ud91bⓌ⨐軠끂쨸\udac8篤\ua4c8麙ه戻㠬᷒", MotionEvent.axisFromString("") + 17).intern(), m1004("ഔ緻̏栾\uefc3盓\u2458后ⱟ퍊૽䢙\ue806ꌍ૽䢙삮荠\uf846퐾ēﲓ藻賎\ud91bⓌ⨐軠끂쨸\uefc3盓瘤\uedc5淺內੦蝾\ue5a3⣄⑇娣묣쿆", (ViewConfiguration.getTapTimeout() >> 16) + 44).intern(), (Throwable) e10);
                            }
                            p.m3251(aw.m957(aw.this).new AnonymousClass4(strM1950, ay.d.f826));
                            String strIntern3 = m1004("㧦\uef13\ud91bⓌ⨐軠끂쨸\udac8篤\ua4c8麙ه戻㠬᷒", 16 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m1004("ഔ緻̏栾\uefc3盓૽䢙삮荠톗\uea1c웍櫓쾯ᇔ㷮攙\udade謮", 18 - Process.getGidForName("")).intern());
                            sb4.append(cnVar.m1951());
                            kd.m3198(strIntern3, com.google.android.gms.internal.play_billing.a.i(m1004("醈콩묣쿆줐Ꝓ纣누䩜ঠ", Color.red(0) + 10), sb4), th2, true, true, true);
                            String strIntern4 = m1004("뽰\uf1dd⤰鸽鶃澔삮荠㈷膿餶㬢", 12 - KeyEvent.keyCodeFromString("")).intern();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m1004("騋珞鶚液蘋境䩜ঠ⽄꒲Ĩ◰\u0ee7ק뗸\uf428扇ᖢ螁㩂鴠ﲿ᳝逑૽䢙삮荠톗\uea1c웍櫓쾯ᇔ㷮攙粔孬殐㓏찟㯠䰇笏웍櫓쬃걘딍뢮餶㬢\udade謮", TextUtils.getOffsetBefore("", 0) + 53).intern());
                            sb5.append(cnVar.m1951());
                            sb5.append(m1004("醈콩묣쿆줐Ꝓ纣누䩜ঠ珳鷬", 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                            k.m3152(strIntern4, sb5.toString());
                            f731 = (f730 + 69) % 128;
                        }

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static String m1004(String str2, int i10) {
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
                                        int i11 = o.f3167;
                                        if (i11 < cArr.length) {
                                            cArr3[0] = cArr[i11];
                                            cArr3[1] = cArr[i11 + 1];
                                            int i12 = 58224;
                                            for (int i13 = 0; i13 < 16; i13++) {
                                                char c10 = cArr3[1];
                                                char c11 = cArr3[0];
                                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f733)) ^ ((c11 >>> 5) + f732)));
                                                cArr3[1] = c12;
                                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f734) ^ ((c12 + i12) ^ ((c12 << 4) + f735))));
                                                i12 -= 40503;
                                            }
                                            int i14 = o.f3167;
                                            cArr2[i14] = cArr3[0];
                                            cArr2[i14 + 1] = cArr3[1];
                                            o.f3167 = i14 + 2;
                                        } else {
                                            str3 = new String(cArr2, 0, i10);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }
                    });
                    aw.m979(aw.this).add(cnVar);
                } else {
                    jSONObjectM971.put(m1001(new int[]{-119623801, 1060626872}, 3 - TextUtils.indexOf("", "", 0, 0)).intern(), false);
                    p.m3251(aw.m957(aw.this).new AnonymousClass4(strM1950, ay.d.f827));
                    String strIntern3 = m1002(16 - Color.green(0), (byte) (117 - ((byte) KeyEvent.getModifierMetaStateMask())), "\b\tää\u000b\u0006\u000e\u0006\u000e\u000f\u0015\u000f\u0010\u0011\u0007\u0010").intern();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    kd.m3198(strIntern3, com.google.android.gms.internal.play_billing.a.i(m1001(new int[]{137862923, -805221656, 514945754, -660136246, -1626064643, -2139873346, 1167795931, -327042994, 1587709015, 916932184}, View.MeasureSpec.getMode(0) + 19), sb4), (Throwable) null, true, true, true);
                    ISAdQualityInitListener iSAdQualityInitListenerM996 = aw.this.m996();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(cnVar.m1951());
                    sb5.append(m1002(14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (105 - TextUtils.getTrimmedLength("")), "\u000e\u0005\u0005\u0012\f\u001d\u0007\u0010\u0014\u0013\t\n\u0089").intern());
                    sb5.append(cnVar.m1945());
                    sb5.append(m1002((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37, (byte) (15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\f\u0017\u0017\r\n\t\r\f\u001c\u0007\r\f\u0014\u0019\u0080\u0080\u0007\u000e\u0010\u0006\u0017\u000e\u0013\u001b\f\r\"\u0010\u0017\u0011\t\n\n\u000b\u0006\u0011\u0007\u000e").intern());
                    iSAdQualityInitListenerM996.adQualitySdkInitFailed(iSAdQualityInitError, sb5.toString());
                }
                jSONObjectM971.remove(m1001(new int[]{80787808, 87933237}, 2 - ExpandableListView.getPackedPositionType(0L)).intern());
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1003(Throwable th2) {
                p.m3251(aw.m957(aw.this).new AnonymousClass4(strM1950, ay.d.f823));
                String strIntern = m1002(16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (118 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\b\tää\u000b\u0006\u000e\u0006\u000e\u000f\u0015\u000f\u0010\u0011\u0007\u0010").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1001(new int[]{-1744323945, -1073580132, -1215931352, -1406414483, 703855415, -654569506, -1208946028, 607438862, -926425136, -1677657355, 1042846384, 1752331145, -365084195, 530846172, -1546405924, 1312900211}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30).intern());
                sb2.append(strM1950);
                kd.m3198(strIntern, sb2.toString(), th2, true, true, true);
                int i10 = f724 + 13;
                f721 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m1001(int[] iArr, int i10) {
                String str2;
                synchronized (d.f1845) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f725.clone();
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
                                str2 = new String(cArr2, 0, i10);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        });
        f637 = (f638 + 61) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m946(Context context, String str, String str2, List<gk> list, iu iuVar) {
        int i10 = f638 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f637 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<gk> it = list.iterator();
            while (it.hasNext()) {
                f638 = (f637 + 95) % 128;
                m961(context, str, str2, it.next(), iuVar);
            }
            return;
        }
        list.iterator();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m990() {
        f638 = (f637 + 5) % 128;
        try {
            JSONObject jSONObjectM951 = m951(m936());
            f637 = (f638 + 33) % 128;
            return jSONObjectM951;
        } catch (JSONException e10) {
            k.m3145(m942((-80) - ExpandableListView.getPackedPositionType(0L), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), View.getDefaultSize(0, 0) + 1233204641, (byte) ((-122) - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1390409712).intern(), m942(TextUtils.lastIndexOf("", '0', 0, 0) - 64, (short) ((-1) - MotionEvent.axisFromString("")), 1233204656 - TextUtils.getOffsetAfter("", 0), (byte) (TextUtils.indexOf("", "") - 84), TextUtils.lastIndexOf("", '0', 0, 0) - 1390409708).intern(), (Throwable) e10);
            return new JSONObject();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private long m967(ja.d dVar) {
        int i10 = f637 + 97;
        f638 = i10 % 128;
        if (i10 % 2 == 0) {
            if (aq.m814().mo840()) {
                int i11 = f638 + 67;
                f637 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 93 / 0;
                }
                return 2000L;
            }
            if (dVar == null) {
                return 0L;
            }
            int i13 = f637 + 9;
            f638 = i13 % 128;
            if (i13 % 2 != 0) {
                this.f650.m2871(dVar);
                throw null;
            }
            if (this.f650.m2871(dVar)) {
                return 0L;
            }
            f638 = (f637 + 111) % 128;
            return 2000L;
        }
        aq.m814().mo840();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m961(final Context context, final String str, final String str2, final gk gkVar, final iu iuVar) {
        f637 = (f638 + 115) % 128;
        ja.d dVarM2546 = gkVar.m2546();
        if (dVarM2546 == null) {
            p.m3247(iuVar);
            return;
        }
        final bg bgVarMo2526 = gkVar.mo2526();
        m966(str2, bgVarMo2526);
        p.m3251(this.f655.new AnonymousClass5(str2, ay.a.f814));
        final String strM2872 = this.f650.m2872(dVarM2546, new il() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.8
            @Override // com.ironsource.adqualitysdk.sdk.i.il
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1008(String str3) {
                aw.m986(aw.this, context, str, str2, gkVar, aw.m968(aw.this, context, str3, bgVarMo2526), false, bgVarMo2526, iuVar);
            }
        });
        p.m3257(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                cn cnVarM968 = aw.m968(aw.this, context, strM2872, bgVarMo2526);
                if (cnVarM968 != null) {
                    aw.m986(aw.this, context, str, str2, gkVar, cnVarM968, true, bgVarMo2526, iuVar);
                } else {
                    p.m3247(iuVar);
                }
            }
        }, m967(dVarM2546));
        int i10 = f638 + 99;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 84 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m948(cn cnVar) {
        String strM1946 = cnVar.m1946();
        if (strM1946 != null) {
            int i10 = f637 + 97;
            f638 = i10 % 128;
            if (i10 % 2 != 0) {
                ka.m3158(IronSourceAdQuality.getSDKVersion(), strM1946);
                throw null;
            }
            if (ka.m3158(IronSourceAdQuality.getSDKVersion(), strM1946) < 0) {
                return false;
            }
        }
        f637 = (f638 + 19) % 128;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m954(String str, JSONObject jSONObject) throws JSONException {
        p.m3251(this.f655.new AnonymousClass5(str, ay.a.f815));
        if (jSONObject != null) {
            f638 = (f637 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            try {
                jSONObject.put(m942((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 93, (short) KeyEvent.keyCodeFromString(""), Color.argb(0, 0, 0, 0) + 1233204714, (byte) ((-83) - View.resolveSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1390409678).intern(), true);
                f637 = (f638 + 1) % 128;
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m942(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f643;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f639;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f641 + i11] + i13);
                    } else {
                        i14 = (short) (f640[f641 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f641 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f645);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f639;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f640;
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m983(final Context context, final String str, final String str2, final gk gkVar, final cn cnVar, final boolean z10, final bg bgVar, final iu iuVar) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.6

            /* renamed from: ﭖ, reason: contains not printable characters */
            private static char f746 = 5;

            /* renamed from: ﭸ, reason: contains not printable characters */
            private static int f747 = 0;

            /* renamed from: ﮉ, reason: contains not printable characters */
            private static int f748 = 1;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static char[] f749 = {'C', 'o', 'n', 'e', 'c', 't', 'r', GMTDateParser.MONTH, 'a', 'g', 'I', 'i', 'l', GMTDateParser.ZONE, ' ', GMTDateParser.MINUTES, '(', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, ')', 'f', 'D', 'E', 'F', 'G'};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m1006(int i10, byte b10, String str3) {
                String str4;
                char[] charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (h.f2445) {
                    try {
                        char[] cArr2 = f749;
                        char c10 = f746;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            h.f2448 = 0;
                            while (true) {
                                int i11 = h.f2448;
                                if (i11 >= i10) {
                                    break;
                                }
                                h.f2450 = cArr[i11];
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
                                        int i12 = (h.f2447 * c10) + h.f2444;
                                        int i13 = (h.f2446 * c10) + h.f2443;
                                        int i14 = h.f2448;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (h.f2447 == h.f2446) {
                                        h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                        h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                        int i15 = (h.f2447 * c10) + h.f2444;
                                        int i16 = (h.f2446 * c10) + h.f2443;
                                        int i17 = h.f2448;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (h.f2447 * c10) + h.f2443;
                                        int i19 = (h.f2446 * c10) + h.f2444;
                                        int i20 = h.f2448;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                h.f2448 += 2;
                            }
                        }
                        str4 = new String(cArr3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                iu iuVar2;
                iu iuVar3;
                if (cnVar == null || aw.m939(aw.this).contains(gkVar)) {
                    return;
                }
                p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2

                    /* renamed from: ｋ */
                    private /* synthetic */ cn f834;

                    /* renamed from: ﾇ */
                    private /* synthetic */ boolean f835;

                    /* renamed from: ﾒ */
                    private /* synthetic */ String f836;

                    public AnonymousClass2(String str3, cn cnVar2, boolean z11) {
                        str = str3;
                        cnVar = cnVar2;
                        z = z11;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        ay ayVarM1041 = az.m1041(az.this, str);
                        if (ayVarM1041 != null) {
                            ayVarM1041.m1031(cnVar);
                        }
                    }
                });
                if (!cnVar.m1940() && (iuVar3 = iuVar) != null) {
                    p.m3247(iuVar3);
                }
                if (!aw.m977(cnVar)) {
                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.6.1

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static long f759 = -6346004179913980196L;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f760 = 0;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f761 = 1;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static String m1007(String str3, int i10) {
                            String str4;
                            char[] charArray = str3;
                            if (str3 != null) {
                                charArray = str3.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (i.f2622) {
                                try {
                                    char[] cArrM2781 = i.m2781(f759, cArr, i10);
                                    i.f2623 = 4;
                                    while (true) {
                                        int i11 = i.f2623;
                                        if (i11 < cArrM2781.length) {
                                            i.f2624 = i11 - 4;
                                            cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f759));
                                            i.f2623 = i11 + 1;
                                        } else {
                                            str4 = new String(cArrM2781, 4, cArrM2781.length - 4);
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
                        public final void mo590() throws JSONException {
                            f760 = (f761 + 115) % 128;
                            if (aw.m950(aw.this).containsKey(cnVar.m1950())) {
                                return;
                            }
                            p.m3251(aw.m957(aw.this).new AnonymousClass4(cnVar.m1950(), ay.d.f829));
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            JSONObject jSONObjectM971 = aw.m971(aw.this, cnVar);
                            try {
                                jSONObjectM971.put(m1007("\uea0a즩\uea6b較䌄컏샆", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), false);
                            } catch (JSONException unused) {
                            }
                            aw.m933(aw.this).put(cnVar.m1950(), jSONObjectM971);
                            String strM1043 = aw.m957(aw.this).m1043(cnVar.m1950());
                            aw.m950(aw.this).put(cnVar.m1950(), strM1043);
                            ISAdQualityInitListener iSAdQualityInitListenerM996 = aw.this.m996();
                            ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cnVar.m1951());
                            sb2.append(m1007("\ud9af珙\ud98f㕶쀭䷱䫠싿鸟ᇣ\ue4bc湩\uef3cฌ褆锅诟", TextUtils.indexOf("", "")).intern());
                            sb2.append(cnVar.m1945());
                            sb2.append(m1007("᳧墷᳇ḙ\ue450榍ᠫߢ쳎㪒샗㲯⩴┫굆쟕付쇶觩\uea4b焇\uec58銑軱闷裍缀酸렴뎢宺떔\udcd7", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern());
                            sb2.append(cnVar.m1946());
                            sb2.append(m1007("林컊倫衹除ᮮ\uf260\ue2ea⛔곣닱횵콦", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                            iSAdQualityInitListenerM996.adQualitySdkInitFailed(iSAdQualityInitError, sb2.toString());
                            kd.m3198(m1007("꼓▿꽐挌Ῑ鈏ﳗ됆⠭䞐㭓\ud846馁塎囶⌷ﴢ보牢ົ", Color.red(0)).intern(), strM1043, (Throwable) null, true, true, true);
                            f761 = (f760 + 65) % 128;
                        }
                    });
                    return;
                }
                String strIntern = m1006((ViewConfiguration.getPressedStateDuration() >> 16) + 16, (byte) (Drawable.resolveOpacity(0, 0) + 90), "\u0001\u0002ÈÈ\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1006(12 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (KeyEvent.keyCodeFromString("") + 10), "\f\u0000\n\u0006\r\u0006\r\f\u000e\f\u0004\u0007*").intern());
                sb2.append(str);
                sb2.append(m1006((ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, (byte) (125 - MotionEvent.axisFromString("")), "\u000b\t\u0000\u0012\u0000\u0006\u0004\r\u0000\u0002ìì\u0004\u0000\u0006\u0000\t\u000b").intern());
                sb2.append((z10 ? m1006(TextUtils.lastIndexOf("", '0', 0, 0) + 9, (byte) (KeyEvent.normalizeMetaState(0) + 79), "\u0013\u0001\t\u0003\u0012\u0002\u0013\u000f") : m1006((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, (byte) (7 - ExpandableListView.getPackedPositionGroup(0L)), "\u000f\u0015\u0000\b\u0002\u0013\b\u00170")).intern());
                co.m1956(strIntern, sb2.toString());
                bgVar.m1171();
                if (cnVar.m1940() && (iuVar2 = iuVar) != null) {
                    int i10 = f747 + 7;
                    f748 = i10 % 128;
                    if (i10 % 2 == 0) {
                        p.m3247(iuVar2);
                        throw null;
                    }
                    p.m3247(iuVar2);
                }
                if (q.m3297().m3315()) {
                    return;
                }
                f747 = (f748 + 5) % 128;
                aw.m964(aw.this, cnVar, str);
                if (aw.m976(aw.this, cnVar.m1950())) {
                    return;
                }
                aw.m939(aw.this).add(gkVar);
            }
        });
        int i10 = f637 + 57;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m981(cn cnVar) throws JSONException {
        f638 = (f637 + 27) % 128;
        JSONObject jSONObjectM972 = m972(cnVar.m1945());
        try {
            jSONObjectM972.put(ig.f2661, cnVar.m1953());
            f637 = (f638 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        } catch (JSONException e10) {
            k.m3145(m942(View.getDefaultSize(0, 0) - 80, (short) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 1233204642, (byte) ((-122) - (Process.myPid() >> 22)), (-1390409710) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m959("뢐\ue86e넯漂ℜᘌ䵒쨥ᮮ覝ꈆ\uf1df볇۾㐃魸\ue5f0伀四派徚书\uec3c笯٘\u2e70\uf72e⩙ḭ̃\ue5f0伀뱁\u0ee5쇴却枱۰", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36).intern(), (Throwable) e10);
        }
        int i10 = f637 + 17;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 17 / 0;
        }
        return jSONObjectM972;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m972(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ig.f2662, str);
        } catch (JSONException e10) {
            k.m3145(m942((-80) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 1233204642, (byte) (TextUtils.getOffsetBefore("", 0) - 122), (-1390409711) - TextUtils.indexOf("", "")).intern(), m959("뢐\ue86e넯漂ℜᘌ䵒쨥ᮮ覝ꈆ\uf1df볇۾㐃魸\ue5f0伀四派徚书\uec3c笯٘\u2e70\uf72e⩙ḭ̃\ue5f0伀뱁\u0ee5쇴却枱۰", 36 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), (Throwable) e10);
        }
        f638 = (f637 + 11) % 128;
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m955(cn cnVar, String str) {
        if (m942((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 89, (short) View.MeasureSpec.makeMeasureSpec(0, 0), 1233204716 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 16), (-1390409709) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern().equals(str)) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            int i10 = f637 + 43;
            f638 = i10 % 128;
            if (i10 % 2 == 0) {
                if (ka.m3158(str, cnVar.m1944()) >= 0 && ka.m3158(str, cnVar.m1943()) <= 0) {
                    return true;
                }
            } else {
                ka.m3158(str, cnVar.m1944());
                throw null;
            }
        }
        int i11 = f637 + 75;
        f638 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m995(String str, List<Object> list) {
        f638 = (f637 + 99) % 128;
        Iterator<cn> it = m940().iterator();
        while (it.hasNext()) {
            int i10 = f638 + 37;
            f637 = i10 % 128;
            if (i10 % 2 == 0) {
                it.next().m1952(str, list);
                throw null;
            }
            it.next().m1952(str, list);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m996() {
        int i10 = f637;
        ISAdQualityInitListener iSAdQualityInitListener = this.f649;
        int i11 = i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f638 = i11 % 128;
        if (i11 % 2 == 0) {
            return iSAdQualityInitListener;
        }
        int i12 = 76 / 0;
        return iSAdQualityInitListener;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private cn m958(Context context, String str, bg bgVar) {
        int i10 = (f638 + 5) % 128;
        f637 = i10;
        if (str != null) {
            return new cn(context, new dh(str, this.f654), this.f648, this.f651, bgVar);
        }
        int i11 = i10 + 11;
        f638 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 55 / 0;
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m956(String str) {
        if (this.f652.containsKey(str)) {
            int i10 = f638 + 91;
            f637 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f652.get(str).m918(this.f653);
                throw null;
            }
            if (this.f652.get(str).m918(this.f653)) {
                return true;
            }
        }
        f637 = (f638 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m951(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        f637 = (f638 + 21) % 128;
        while (it.hasNext()) {
            f638 = (f637 + 7) % 128;
            String str = (String) it.next();
            jSONObject2.put(str.toLowerCase(), map.get(str));
        }
        jSONObject.put(m942((-92) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1233204730 - MotionEvent.axisFromString(""), (byte) ((-42) - TextUtils.indexOf((CharSequence) "", '0', 0)), ImageFormat.getBitsPerPixel(0) - 1390409659).intern(), jSONObject2);
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m966(String str, bg bgVar) {
        int i10 = f637 + 115;
        f638 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (bgVar != null) {
            m936().put(str, m972(bgVar.m1167()));
        }
        f637 = (f638 + 103) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m994(String str) {
        m995(str, new ArrayList());
        int i10 = f638 + 77;
        f637 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m959(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f642)) ^ ((c11 >>> 5) + f644)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f646) ^ ((c12 + i12) ^ ((c12 << 4) + f647))));
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
