package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
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
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.af;
import com.ironsource.adqualitysdk.sdk.i.jb;
import com.ironsource.adqualitysdk.sdk.i.jc;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ah {

    /* renamed from: 乁, reason: contains not printable characters */
    private static int f398 = 1;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static int f399 = 0;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int[] f400 = {1636505573, -1445906369, -549566008, -2078372514, -158098116, 829238119, -777576999, 669829647, 1573097770, -1236452304, 668210869, 246835912, -136812530, 1992296459, -1560172218, 107719777, 272220635, 1640670566};

    /* renamed from: סּ, reason: contains not printable characters */
    private static long f401 = 1772483359548452696L;

    /* renamed from: 爫, reason: contains not printable characters */
    private r f402;

    /* renamed from: ףּ, reason: contains not printable characters */
    private String f403;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private ae f404;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Context f405;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private iq f406;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private jn f408;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean f409;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f412;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private Handler f413;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ak f414;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private af f415;

    /* renamed from: ｋ, reason: contains not printable characters */
    private iy f416;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jc f417;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f418;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List<ai> f411 = new ArrayList();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private List<jb.d> f410 = new ArrayList();

    /* renamed from: ﮉ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f407 = Thread.getDefaultUncaughtExceptionHandler();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ah$2, reason: invalid class name */
    public class AnonymousClass2 implements af.d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f446;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ List f448;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ iz f449;

        public AnonymousClass2(JSONArray jSONArray, List list, iz izVar) {
            this.f446 = jSONArray;
            this.f448 = list;
            this.f449 = izVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.af.d
        public void onEventGenerated(JSONObject jSONObject) {
            ah.m715(ah.this).m665(jSONObject);
            ah.m694(ah.this).m2897(ah.m700(ah.this).m791(ah.m699(ah.this)), jSONObject, new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.5

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int f450 = 1;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static long f451 = 825120361375802077L;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f452;

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* renamed from: ﻛ */
                public final void mo749(final ir irVar, final String str) {
                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            AnonymousClass2.this.f449.mo749(irVar, str);
                        }
                    });
                    f452 = (f450 + 43) % 128;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* renamed from: ｋ */
                public final void mo751(final ir irVar) {
                    final int iM2842 = irVar.m2841().m2842();
                    final String strM2843 = irVar.m2841().m2843();
                    if (iM2842 >= 200 && iM2842 <= 299) {
                        k.m3143(m761("㜡㝠±ἆ활∂嫝뺧밬꺔칁∴↺", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m761("屶就븹痙箓鲋〗ጤ흣၈ꒄ迭䫽螟⤞ҟ﹙笠鶽焅燕\ueee4ؼ\ued9a\ue541扽謇娮ᢡ\ud9deﾋ횯谿䵞恛䌕ޠ쀡퓭뿐뭃", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), AnonymousClass2.this.f446);
                        Iterator it = AnonymousClass2.this.f448.iterator();
                        while (it.hasNext()) {
                            ah.m704(ah.this).m2946(((ag) it.next()).m691());
                        }
                        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.5.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                AnonymousClass2.this.f449.mo751(irVar);
                            }
                        });
                        return;
                    }
                    if (iM2842 == 403) {
                        synchronized (ah.this) {
                            try {
                                for (final jb.d dVar : ah.m695(ah.this)) {
                                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.5.2
                                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                        /* renamed from: ﻐ */
                                        public final void mo590() {
                                            dVar.mo2932();
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        String strIntern = m761("㜡㝠±ἆ활∂嫝뺧밬꺔칁∴↺", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m761("폆펕㜔沭쩋ᖦ⥺ꊹ壆餭뷪㸮앉\u0ef1へ땑燴\uf259蒛샏﹤柖Ὁ屋檢\ueb42鈺\uebe4霖傡\ue6ac条΄쑹礎\uf2fe蠃䤇춃๒㓲㺢䀌薔ꅮꈃ풊ᄧ⹊អ⽵겫嫓魣ꎧ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern());
                        sb2.append(iM2842);
                        sb2.append(m761("쿤쿄ཡそ뚼", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                        sb2.append(strM2843);
                        k.m3142(strIntern, sb2.toString());
                    }
                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.5.4

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static int f458 = 0;

                        /* renamed from: ﺙ, reason: contains not printable characters */
                        private static int f459 = 1;

                        /* renamed from: ﻏ, reason: contains not printable characters */
                        private static char f460 = 5;

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f461 = {'S', 'o', GMTDateParser.MINUTES, 'e', 't', GMTDateParser.HOURS, 'i', 'n', 'g', ' ', 'w', 'r', GMTDateParser.SECONDS, GMTDateParser.DAY_OF_MONTH, 'E', 'v', '.', 'G', 'p', AbstractJsonLexerKt.COLON, 'T', 'U', 'V', 'W', 'X'};

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            iz izVar = AnonymousClass2.this.f449;
                            ir irVar2 = irVar;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m762((-16777165) - Color.rgb(0, 0, 0), (byte) (61 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\r\u0000\t\u0002\u0005\u000e\u0010\u0006\b\t\u0005\u000e\t\u0001\u0006\u0005\r\u0002\b\f\n\u0013\u0002\b\u0001\u0013\u0007\u0013\u0002\u0000\u0006\u000e\u0002\r\u0010\u0003\f\u0011\u0004\u0012]").intern());
                            sb3.append(iM2842);
                            sb3.append(m762(-ExpandableListView.getPackedPositionChild(0L), (byte) (KeyEvent.getDeadChar(0, 0) + 19), "3").intern());
                            sb3.append(strM2843);
                            izVar.mo749(irVar2, sb3.toString());
                            int i10 = f458 + 61;
                            f459 = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 73 / 0;
                            }
                        }

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static String m762(int i10, byte b10, String str) {
                            String str2;
                            char[] charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (h.f2445) {
                                try {
                                    char[] cArr2 = f461;
                                    char c10 = f460;
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
                                    str2 = new String(cArr3);
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            return str2;
                        }
                    });
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m761(String str, int i10) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (i.f2622) {
                        try {
                            char[] cArrM2781 = i.m2781(f451, cArr, i10);
                            i.f2623 = 4;
                            while (true) {
                                int i11 = i.f2623;
                                if (i11 < cArrM2781.length) {
                                    i.f2624 = i11 - 4;
                                    cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f451));
                                    i.f2623 = i11 + 1;
                                } else {
                                    str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }
            });
        }
    }

    public ah(Context context, as asVar, ak akVar, boolean z10, String str, r rVar) {
        this.f402 = rVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f470 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static long f471 = -5840101160116598947L;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f472;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m763(String str2, int i10) {
                String str3;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (i.f2622) {
                    try {
                        char[] cArrM2781 = i.m2781(f471, cArr, i10);
                        i.f2623 = 4;
                        while (true) {
                            int i11 = i.f2623;
                            if (i11 < cArrM2781.length) {
                                i.f2624 = i11 - 4;
                                cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f471));
                                i.f2623 = i11 + 1;
                            } else {
                                str3 = new String(cArrM2781, 4, cArrM2781.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                f472 = (f470 + 115) % 128;
                kd.m3200(m763("꾔꿕禳ղ\uf771㺀让ℊ늙ᴖꤵҙ锏", -MotionEvent.axisFromString("")).intern(), m763("맔릁㝋䂞\u0ef9灸칇\ud88fꓕ叽\uecd8ﴆ茜땫襄ṥ\ue1edꢂꟼ⃣챫計", ExpandableListView.getPackedPositionType(0L) + 1).intern(), m763("\udfd9\udf8d닌\ue1b0㩇\uf5e3潫\uec33싈홿䷿즯\ue55a", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th2);
                ah.this.m745();
                ah.m732(ah.this).uncaughtException(thread, th2);
                f470 = (f472 + 29) % 128;
            }
        });
        this.f414 = akVar;
        this.f405 = context;
        jb jbVar = new jb(context, m731("欅㜴⮤歱\u181e㻳畵나혀\udbee㟕痸ᆮ鴂\uf2bf㙍匋倨봖\uf8f5黤ᎂ翵봗\ud99c핸㩝繸ᬶ", ImageFormat.getBitsPerPixel(0) + 1).intern(), m731("\udcba聿\ud14c9꽈ⶐ藚ꏵ憶沦윸暋ꘟ⨄ȇ┽\ue4ee\ue72a䷡\uebd9⥔꓆轙깡渮戮쫶洋", Process.getGidForName("") + 1).intern());
        this.f417 = new jc(m717(new int[]{1588581690, -2127013717, -427515673, 625051055}, TextUtils.indexOf("", "") + 8).intern(), m731("牔䤺\ue637爱昔員룢\uda87콀ꖬ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jbVar);
        int iM723 = m723(jbVar);
        this.f415 = new af(context, asVar, iM723, m716(jbVar), aq.m814().mo817());
        this.f416 = new iy(context);
        this.f418 = false;
        HandlerThread handlerThread = new HandlerThread(m717(new int[]{955287113, -1318617357, -1089994594, -280516384, -988955356, -604985532, -1644483777, -867748097}, 14 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        handlerThread.start();
        this.f413 = new Handler(handlerThread.getLooper());
        this.f404 = new ae(iM723);
        this.f412 = !z10;
        this.f403 = str;
        m728(true);
        m706();
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private String m693() {
        int i10 = f398 + 9;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            aq.m814().mo832();
            throw null;
        }
        if (aq.m814().mo832()) {
            return m698().m890();
        }
        int i11 = f398 + 55;
        f399 = i11 % 128;
        if (i11 % 2 == 0) {
            return m698().m887();
        }
        int i12 = 93 / 0;
        return m698().m887();
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public static /* synthetic */ iy m694(ah ahVar) {
        int i10 = (f398 + 109) % 128;
        f399 = i10;
        iy iyVar = ahVar.f416;
        int i11 = i10 + 97;
        f398 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 10 / 0;
        }
        return iyVar;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public static /* synthetic */ List m695(ah ahVar) {
        int i10 = f398;
        f399 = (i10 + 13) % 128;
        List<jb.d> list = ahVar.f410;
        f399 = (i10 + 1) % 128;
        return list;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ af m696(ah ahVar) {
        int i10 = f399 + 83;
        f398 = i10 % 128;
        int i11 = i10 % 2;
        af afVar = ahVar.f415;
        if (i11 != 0) {
            return afVar;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ String m699(ah ahVar) {
        f398 = (f399 + 67) % 128;
        String strM693 = ahVar.m693();
        int i10 = f398 + 49;
        f399 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM693;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ ak m700(ah ahVar) {
        int i10 = f398;
        f399 = (i10 + 9) % 128;
        ak akVar = ahVar.f414;
        f399 = (i10 + 109) % 128;
        return akVar;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ int m703(ah ahVar) {
        f399 = (f398 + 99) % 128;
        int iM702 = ahVar.m702();
        f399 = (f398 + 107) % 128;
        return iM702;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ jc m704(ah ahVar) {
        int i10 = f398;
        f399 = (i10 + 81) % 128;
        jc jcVar = ahVar.f417;
        f399 = (i10 + 79) % 128;
        return jcVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ void m707(ah ahVar) {
        f398 = (f399 + 11) % 128;
        ahVar.m720(true);
        int i10 = f399 + 71;
        f398 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Handler m708(ah ahVar) {
        int i10 = f398;
        f399 = (i10 + 23) % 128;
        Handler handler = ahVar.f413;
        f399 = (i10 + 95) % 128;
        return handler;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m710(ah ahVar) {
        f399 = (f398 + 97) % 128;
        ahVar.m697();
        f398 = (f399 + 85) % 128;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m712(ah ahVar) {
        f398 = (f399 + 7) % 128;
        ahVar.m735(false);
        f399 = (f398 + 59) % 128;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m714(ah ahVar) {
        int i10 = f398 + 113;
        f399 = i10 % 128;
        int i11 = i10 % 2;
        ahVar.m711();
        if (i11 != 0) {
            int i12 = 97 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ae m715(ah ahVar) {
        int i10 = (f398 + 25) % 128;
        f399 = i10;
        ae aeVar = ahVar.f404;
        int i11 = i10 + 79;
        f398 = i11 % 128;
        if (i11 % 2 != 0) {
            return aeVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ r m721(ah ahVar) {
        int i10 = f399 + 33;
        f398 = i10 % 128;
        int i11 = i10 % 2;
        r rVar = ahVar.f402;
        if (i11 != 0) {
            return rVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m724(ah ahVar) {
        f399 = (f398 + 35) % 128;
        ahVar.m709();
        f398 = (f399 + 93) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m732(ah ahVar) {
        int i10 = f398 + 101;
        int i11 = i10 % 128;
        f399 = i11;
        int i12 = i10 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ahVar.f407;
        if (i12 != 0) {
            throw null;
        }
        f398 = (i11 + 5) % 128;
        return uncaughtExceptionHandler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m737(ah ahVar) {
        f398 = (f399 + 71) % 128;
        ahVar.m728(false);
        int i10 = f399 + 63;
        f398 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private synchronized void m697() {
        try {
            f398 = (f399 + 49) % 128;
            if (m705() && !TextUtils.isEmpty(this.f415.m3047().m904())) {
                f399 = (f398 + 109) % 128;
                if (!m701()) {
                    m735(true);
                    k.m3142(m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, ((byte) KeyEvent.getModifierMetaStateMask()) + 10).intern(), m731("踻\uf27d꼆蹨\udd40톘\uf1d8忴㌲ẫ덱髐\uf49e堓瘓\ud93e뙯镶㧶៖築훊ﭛ到㲸ဤ뻵鄘\ufe1e", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1).intern());
                    this.f417.m2943(m698().m891(), new AnonymousClass1());
                }
            }
            f398 = (f399 + 29) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private synchronized ar m698() {
        int i10 = f398 + 39;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            aq.m814().mo828();
            throw null;
        }
        return aq.m814().mo828();
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m701() {
        boolean z10;
        int i10 = (f398 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        f399 = i10;
        z10 = this.f409;
        f398 = (i10 + 67) % 128;
        return z10;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private int m702() {
        if (m698() == null) {
            return 100;
        }
        int i10 = f399 + 53;
        f398 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 21 / 0;
            if (aq.m814().mo832()) {
                return 100;
            }
        } else if (aq.m814().mo832()) {
            return 100;
        }
        f398 = (f399 + 37) % 128;
        return m698().m892();
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m705() {
        boolean z10;
        int i10 = f398;
        int i11 = i10 + 63;
        f399 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        z10 = this.f418;
        int i12 = i10 + 71;
        f399 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m706() {
        this.f406 = new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.6
            @Override // com.ironsource.adqualitysdk.sdk.i.iq
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo765() {
                ah.m724(ah.this);
            }
        };
        this.f416.m2895().m2854(this.f406);
        this.f408 = new jn(new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.10

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f420 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f421 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f422 = 8093892175527280894L;

            /* renamed from: ﻐ, reason: contains not printable characters */
            public static /* synthetic */ JSONObject m752(Activity activity) throws JSONException {
                f421 = (f420 + 25) % 128;
                JSONObject jSONObjectM754 = m754(activity);
                int i10 = f420 + 13;
                f421 = i10 % 128;
                if (i10 % 2 != 0) {
                    return jSONObjectM754;
                }
                throw null;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static JSONObject m754(Activity activity) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m753("劫勊兪儩⌗儲啬唰凷傡↣", ViewConfiguration.getEdgeSlop() >> 16).intern(), activity.getClass().getName());
                } catch (JSONException unused) {
                    k.m3147(m753("冤凥\uea5dﾆ㗐別\uee4fﮆ\ueacd\ufe1b㝆㇗嘧", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m753("䪒䫗釓㱯눔䤘閉㡴酟㷡낁똗䴆駘㑣먌䅚鷘て븗䔛臷ⱔꈯ夳薩⡛\ua632崯觴", TextUtils.indexOf("", "", 0)).intern());
                }
                f421 = (f420 + 115) % 128;
                return jSONObject;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo755(final Activity activity) {
                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.10.4

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static long f432 = 3742823802152323135L;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static int f433 = 1;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static int f434;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m758(String str, int i10) {
                        String str2;
                        char[] charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (i.f2622) {
                            try {
                                char[] cArrM2781 = i.m2781(f432, cArr, i10);
                                i.f2623 = 4;
                                while (true) {
                                    int i11 = i.f2623;
                                    if (i11 < cArrM2781.length) {
                                        i.f2624 = i11 - 4;
                                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f432));
                                        i.f2623 = i11 + 1;
                                    } else {
                                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        f433 = (f434 + 95) % 128;
                        ah.m721(ah.this).onEvent(m758("ﺜὙ愫촓ﻺ霉然嗛\ude13똽倣瓏뼗픚㌲។鰍\uf40e", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                        ah.this.m742(m758("ﺜὙ愫촓ﻺ霉然嗛\ude13똽倣瓏뼗픚㌲។鰍\uf40e", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), AnonymousClass10.m752(activity));
                        f434 = (f433 + 7) % 128;
                    }
                });
                f421 = (f420 + 37) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo756(final Activity activity) {
                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.10.1

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static int f424 = 1;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static int f425 = 0;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f426 = true;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static int f427 = 85;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static boolean f428 = true;

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static char[] f429 = {187, 196, 184, 202, 200, 180, 193, 201};

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static String m757(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                                char[] cArr2 = f429;
                                int i11 = f427;
                                if (f426) {
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
                                if (f428) {
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        f424 = (f425 + 107) % 128;
                        ah.m721(ah.this).onEvent(m757(null, 127 - Gravity.getAbsoluteGravity(0, 0), null, "\u0088\u0085\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                        ah.this.m742(m757(null, KeyEvent.normalizeMetaState(0) + 127, null, "\u0088\u0085\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), AnonymousClass10.m752(activity));
                        int i10 = f425 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                        f424 = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                int i10 = f420 + 71;
                f421 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m753(String str, int i10) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (i.f2622) {
                    try {
                        char[] cArrM2781 = i.m2781(f422, cArr, i10);
                        i.f2623 = 4;
                        while (true) {
                            int i11 = i.f2623;
                            if (i11 < cArrM2781.length) {
                                i.f2624 = i11 - 4;
                                cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f422));
                                i.f2623 = i11 + 1;
                            } else {
                                str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        });
        jf.m2969().m2970(new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.8
            @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo767(Activity activity) {
                ah.this.m745();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo768(Activity activity) {
                ah.m714(ah.this);
            }
        });
        aq.m814().mo843(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.12
            @Override // com.ironsource.adqualitysdk.sdk.i.at
            /* renamed from: ﾇ */
            public final void mo667() {
                ah.m707(ah.this);
            }
        });
        f398 = (f399 + 61) % 128;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m709() {
        int i10 = f399 + 5;
        f398 = i10 % 128;
        m728(i10 % 2 == 0);
        int i11 = f399 + 77;
        f398 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m711() {
        int i10 = f398 + 3;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f412) {
            m744();
        }
        this.f412 = false;
        f398 = (f399 + 21) % 128;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m713() {
        if (this.f406 != null) {
            f399 = (f398 + 39) % 128;
            this.f416.m2895().m2857(this.f406);
        }
        this.f408.m3029();
        this.f408 = null;
        f399 = (f398 + 97) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m718(ah ahVar, JSONObject jSONObject, iu iuVar) {
        int i10 = f398 + 55;
        f399 = i10 % 128;
        int i11 = i10 % 2;
        ahVar.m727(jSONObject, iuVar);
        if (i11 != 0) {
            int i12 = 80 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m730(ah ahVar, ag agVar) {
        f399 = (f398 + 11) % 128;
        boolean zM729 = ahVar.m729(agVar);
        int i10 = f398 + 69;
        f399 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM729;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m736(ah ahVar, int i10) {
        f398 = (f399 + 37) % 128;
        boolean zM722 = ahVar.m722(i10);
        int i11 = f399 + 103;
        f398 = i11 % 128;
        if (i11 % 2 != 0) {
            return zM722;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m738(ah ahVar, List list, iz izVar) throws JSONException {
        int i10 = f399 + 39;
        f398 = i10 % 128;
        int i11 = i10 % 2;
        ahVar.m726((List<ag>) list, izVar);
        if (i11 == 0) {
            int i12 = 94 / 0;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String m739() {
        String strM716 = m716(new jb(this.f405, m731("欅㜴⮤歱\u181e㻳畵나혀\udbee㟕痸ᆮ鴂\uf2bf㙍匋倨봖\uf8f5黤ᎂ翵봗\ud99c핸㩝繸ᬶ", MotionEvent.axisFromString("") + 1).intern(), m731("\udcba聿\ud14c9꽈ⶐ藚ꏵ憶沦윸暋ꘟ⨄ȇ┽\ue4ee\ue72a䷡\uebd9⥔꓆轙깡渮戮쫶洋", ViewConfiguration.getJumpTapTimeout() >> 16).intern()));
        f399 = (f398 + 89) % 128;
        return strM716;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m741() {
        synchronized (this) {
            try {
                Handler handler = this.f413;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m728(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #1 {all -> 0x0015, blocks: (B:3:0x0001, B:5:0x000e, B:12:0x001d, B:14:0x0028, B:19:0x0032, B:20:0x0033, B:21:0x0038, B:10:0x0017, B:16:0x002f), top: B:28:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:3:0x0001, B:5:0x000e, B:12:0x001d, B:14:0x0028, B:19:0x0032, B:20:0x0033, B:21:0x0038, B:10:0x0017, B:16:0x002f), top: B:28:0x0001, inners: #0 }] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m740() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = com.ironsource.adqualitysdk.sdk.i.ah.f398     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f399 = r1     // Catch: java.lang.Throwable -> L15
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L17
            r3.f418 = r2     // Catch: java.lang.Throwable -> L15
            android.os.Handler r0 = r3.f413     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L38
            goto L1d
        L15:
            r0 = move-exception
            goto L42
        L17:
            r3.f418 = r2     // Catch: java.lang.Throwable -> L15
            android.os.Handler r0 = r3.f413     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L38
        L1d:
            int r1 = r1 + 1
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f398 = r0     // Catch: java.lang.Throwable -> L15
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L33
            android.os.Handler r1 = r3.f413     // Catch: java.lang.Throwable -> L15
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 21
            int r0 = r0 / r2
            goto L38
        L31:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L15
        L33:
            android.os.Handler r1 = r3.f413     // Catch: java.lang.Throwable -> L15
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> L15
        L38:
            com.ironsource.adqualitysdk.sdk.i.iy r0 = r3.f416     // Catch: java.lang.Throwable -> L15
            r0.m2896()     // Catch: java.lang.Throwable -> L15
            r3.m713()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ah.m740():void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m744() {
        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.7

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f482 = 1;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f483 = 0;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f484 = true;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f485 = true;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f486 = 290;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f487 = {406, 402, 385, 405, 391, 387, 404};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m766(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f487;
                        int i11 = f486;
                        if (f485) {
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
                        if (f484) {
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                ah.m721(ah.this).onEvent(m766(null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                ah.this.m742(m766(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), new JSONObject());
                int i10 = f483 + 87;
                f482 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 91 / 0;
                }
            }
        });
        int i10 = f398 + 101;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m745() {
        int i10 = f398 + 13;
        f399 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f412 = true;
            } else {
                this.f412 = true;
            }
            m746();
            m741();
            int i11 = f398 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f399 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m3203(m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m731("꯭\uf07a퇞ꮨ\udf50ᚙ輜飾\u16ff᳢춧嶟턍娍ࣀḐ鎽靲䝚탞帯퓃薍镺ᥪሰ쀡嘄\udbc3澆", ExpandableListView.getPackedPositionChild(0L) + 1).intern(), e10, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m747(ai aiVar) {
        f398 = (f399 + 31) % 128;
        this.f411.add(aiVar);
        f398 = (f399 + 63) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m725(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f398 + 35;
        f399 = i10 % 128;
        int i11 = i10 % 2;
        m743(str, jSONObject, jSONObject2, null);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f399 + 103;
        f398 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m748(jb.d dVar) {
        f398 = (f399 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        this.f410.add(dVar);
        int i10 = f398 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 0 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[PHI: r0
      0x004f: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v15 java.lang.String) binds: [B:9:0x004d, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m723(com.ironsource.adqualitysdk.sdk.i.jb r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ah.f398
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f399 = r1
            int r0 = r0 % 2
            r1 = 6
            r2 = 1
            if (r0 == 0) goto L30
            int[] r0 = new int[r1]
            r0 = {x007c: FILL_ARRAY_DATA , data: [1755379739, 1676837991, 1778278594, -961391209, 1941074353, -485037900} // fill-array
            int r3 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r3 = r3 >> 57
            int r3 = 98 - r3
            java.lang.String r0 = m717(r0, r3)
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r7.m2921(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L2e
            goto L4f
        L2e:
            r2 = 0
            goto L54
        L30:
            int[] r0 = new int[r1]
            r0 = {x008c: FILL_ARRAY_DATA , data: [1755379739, 1676837991, 1778278594, -961391209, 1941074353, -485037900} // fill-array
            int r3 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r3 = r3 >> 16
            int r3 = 10 - r3
            java.lang.String r0 = m717(r0, r3)
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r7.m2921(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L54
        L4f:
            int r0 = java.lang.Integer.parseInt(r0)
            int r2 = r2 + r0
        L54:
            int[] r0 = new int[r1]
            r0 = {x009c: FILL_ARRAY_DATA , data: [1755379739, 1676837991, 1778278594, -961391209, 1941074353, -485037900} // fill-array
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r1 = r1 + 9
            java.lang.String r0 = m717(r0, r1)
            java.lang.String r0 = r0.intern()
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r7.m2924(r0, r1)
            int r7 = com.ironsource.adqualitysdk.sdk.i.ah.f398
            int r7 = r7 + 11
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f399 = r7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ah.m723(com.ironsource.adqualitysdk.sdk.i.jb):int");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m746() {
        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f474 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f475 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char f476 = 38631;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char f477 = 1482;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char f478 = 11697;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char f479 = 3808;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m764(String str, int i10) {
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
                                    char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f476)) ^ ((c11 >>> 5) + f477)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f479) ^ ((c12 + i12) ^ ((c12 << 4) + f478))));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                ah.m721(ah.this).onEvent(m764("㓫僼筊ጲ緊竒悁ꨘ\uf3db爛戱뺎", 11 - View.combineMeasuredStates(0, 0)).intern());
                ah.this.m742(m764("㓫僼筊ጲ緊竒悁ꨘ\uf3db爛戱뺎", 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new JSONObject());
                int i10 = f475 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f474 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        });
        f399 = (f398 + 11) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m742(String str, JSONObject jSONObject) {
        f398 = (f399 + 21) % 128;
        m725(str, jSONObject, null);
        int i10 = f399 + 71;
        f398 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m743(String str, JSONObject jSONObject, JSONObject jSONObject2, final iu iuVar) {
        String strIntern = m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 8 - TextUtils.lastIndexOf("", '0', 0)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m717(new int[]{-133208383, 2132252603, -688476464, -137971687, 554944587, -258064227, 1371759843, 66712934, 1914710116, 784194277, 112803549, -2115664299}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21).intern());
        sb2.append(str);
        sb2.append(m731("嗤䎅\u09b4嗄沪\uf7de坭禢\ue8ec꼝ᗁ볎⽐\ue9ef킥Ｖ涭⒓鼂㆙ꁞ", TextUtils.indexOf("", "")).intern());
        k.m3143(strIntern, sb2.toString(), jSONObject);
        try {
            if (m698().m893().contains(str)) {
                String strIntern2 = m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 9 - Color.red(0)).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m717(new int[]{1687463885, 8921318, 1677661517, -135159342, 1031872874, 1024453725, -1217451107, 1232049054, 209824166, 770804426, -675425167, -507839233, 1204606052, 1994339335, -1131369875, 293501334}, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                sb3.append(str);
                sb3.append(m717(new int[]{-538754540, -1967238809, -79468009, -1984180914, 1913297529, -80760394, 141400645, 886217392, 1176632602, -824888637, -792154844, -11407279}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21).intern());
                k.m3142(strIntern2, sb3.toString());
                f398 = (f399 + 21) % 128;
                return;
            }
            String strIntern3 = m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 9 - View.MeasureSpec.getMode(0)).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m717(new int[]{-133208383, 2132252603, -688476464, -137971687, 554944587, -258064227, 1371759843, 66712934, 1914710116, 784194277, 1006152527, 2024078580, -101543990, -1373006536, 1119945736, -2122658991}, Color.rgb(0, 0, 0) + 16777248).intern());
            sb4.append(str);
            k.m3142(strIntern3, sb4.toString());
            this.f415.m677(str, jSONObject, jSONObject2, this.f416.m2895().m2855(), new af.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.9
                @Override // com.ironsource.adqualitysdk.sdk.i.af.d
                public void onEventGenerated(JSONObject jSONObject3) {
                    ah.m715(ah.this).m665(jSONObject3);
                    ah.m718(ah.this, jSONObject3, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.9.5

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f492 = 0;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int f493 = 1;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static char[] f494 = {'4', 'n', 'v', 'r', 'f', 'g', 'W', 'Z', 'k', '7', 'i', 'T', AbstractJsonLexerKt.END_LIST, GMTDateParser.MINUTES, 'i', 'q', 'W', '-', 'G', 'n', 'X', GMTDateParser.YEAR, 'n', 'n', 'n', GMTDateParser.HOURS, 'l', 'n', 'l', 'n', GMTDateParser.YEAR, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'I', 'l'};

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static String m769(String str2, boolean z10, int[] iArr) throws UnsupportedEncodingException {
                            String str3;
                            byte[] bytes = str2;
                            if (str2 != null) {
                                bytes = str2.getBytes("ISO-8859-1");
                            }
                            byte[] bArr = bytes;
                            synchronized (g.f2307) {
                                try {
                                    int i10 = iArr[0];
                                    int i11 = iArr[1];
                                    int i12 = iArr[2];
                                    int i13 = iArr[3];
                                    char[] cArr = new char[i11];
                                    System.arraycopy(f494, i10, cArr, 0, i11);
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
                                    str3 = new String(cArr);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            ah.m737(ah.this);
                            iu iuVar2 = iuVar;
                            if (iuVar2 != null) {
                                int i10 = f492 + 25;
                                f493 = i10 % 128;
                                try {
                                    if (i10 % 2 != 0) {
                                        iuVar2.mo590();
                                        return;
                                    } else {
                                        iuVar2.mo590();
                                        throw null;
                                    }
                                } catch (Exception e10) {
                                    kd.m3198(m769("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{0, 9, 0, 7}).intern(), m769("\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", false, new int[]{9, 32, 0, 21}).intern(), (Throwable) e10, false, false, true);
                                }
                            }
                            int i11 = f493 + 39;
                            f492 = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                }
            });
            f399 = (f398 + 37) % 128;
        } catch (Exception e10) {
            kd.m3198(m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 9 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m731("ﻋ賯뾶ﺎꏅ撡\ue174\ueac6䏙恷ꏏ⾧萫⚄暣氇욏\uebd2⤐ꋬଥꡃ", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern(), (Throwable) e10, false, false, true);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m733(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m731("࠰့杅ࡕ㼝ꠐ㦁♹딷", ViewConfiguration.getTapTimeout() >> 16).intern(), str);
            jSONObject2.put(m731("\ue50e썏쵪\ue56b\uec65債鎷\udece堉", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), str2);
            jSONObject2.put(m731("刑肄托剴꾮ꁣ㲋⸄\uef15汙", TextUtils.indexOf("", "")).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject2.put(m731("ꎎ㣹\ue1b2ꏫ៓Ṹ뽱逄ẅ", AndroidCharacter.getMirror('0') - '0').intern(), str4);
            }
            if (jSONObject != null) {
                kc.m3194(jSONObject2, jSONObject);
                f398 = (f399 + 111) % 128;
            }
        } catch (JSONException e10) {
            k.m3145(m717(new int[]{2107837037, -659857316, 590876672, 395596117, -1633927646, 1663631817}, 10 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m717(new int[]{-1365163766, -359683786, -1903856556, -928715780, -1927696298, -624639449, 1516157364, -1098486624, -2018208337, -1848821941, -79995877, 543293388, 799264577, 863994337}, 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), (Throwable) e10);
        }
        int i10 = f398 + 65;
        f399 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObject2;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m728(final boolean z10) {
        this.f417.m2945(new jc.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.11
            @Override // com.ironsource.adqualitysdk.sdk.i.jc.b
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo759(int i10) {
                ah.m708(ah.this).removeCallbacksAndMessages(null);
                ah.m708(ah.this).postDelayed(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.11.2

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static int f439 = 1;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f440 = 0;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static long f441 = 0;

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static int f442 = 0;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static char f443 = 42248;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        int i11 = f442 + 23;
                        f439 = i11 % 128;
                        try {
                            if (i11 % 2 == 0) {
                                ah.m710(ah.this);
                                throw null;
                            }
                            ah.m710(ah.this);
                            f439 = (f442 + 39) % 128;
                        } catch (Throwable th2) {
                            k.m3156(m760("灢\uf789⚠\ue000", (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "欮럎敊럦트敝큈ጜ쟍", (-1594390161) - TextUtils.lastIndexOf("", '0'), "\u0000\u0000\u0000\u0000").intern(), m760("揎౫䠿쏟", (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57160), "刘\ude6d䂛ᙴ牼ⵤ롞箜导\uedc0ദ盲쒒큩鹬䓺頔\ued48㨤Ὸ\ude8b\uea60㛪䈗뚼ၬ쉉噘쎩붢焸", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1057778531, "\u0000\u0000\u0000\u0000").intern(), th2);
                            ah.m712(ah.this);
                        }
                    }

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static String m760(String str, char c10, String str2, int i11, String str3) {
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
                                cArr5[2] = (char) (cArr5[2] + ((char) i11));
                                int length = cArr2.length;
                                char[] cArr6 = new char[length];
                                f.f2213 = 0;
                                while (true) {
                                    int i12 = f.f2213;
                                    if (i12 < length) {
                                        int i13 = (i12 + 2) % 4;
                                        int i14 = (i12 + 3) % 4;
                                        int i15 = cArr4[i12 % 4] * 32718;
                                        char c11 = cArr5[i13];
                                        char c12 = (char) ((i15 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                        f.f2211 = c12;
                                        cArr5[i14] = (char) e3.g.e(cArr4[i14], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                        cArr4[i14] = c12;
                                        int i16 = f.f2213;
                                        cArr6[i16] = (char) ((((c12 ^ cArr2[i16]) ^ f441) ^ f440) ^ f443);
                                        f.f2213 = i16 + 1;
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
                }, (ah.m736(ah.this, i10) || z10) ? 0L : ah.m703(ah.this));
            }
        });
        int i10 = f399 + 69;
        f398 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m720(boolean z10) {
        f398 = (f399 + 93) % 128;
        this.f418 = true;
        m728(true);
        int i10 = f398 + 99;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m729(ag agVar) {
        f398 = (f399 + 115) % 128;
        boolean zMo844 = aq.m814().mo844(agVar.m688(), this.f403);
        int i10 = f399 + 71;
        f398 = i10 % 128;
        if (i10 % 2 != 0) {
            return zMo844;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m722(int i10) {
        f398 = (f399 + 65) % 128;
        if (i10 >= m698().m891()) {
            f398 = (f399 + 73) % 128;
            return true;
        }
        int i11 = f399 + 9;
        f398 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m726(List<ag> list, iz izVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        f398 = (f399 + 113) % 128;
        for (ag agVar : list) {
            JSONObject jSONObjectM687 = agVar.m687();
            if (!jSONObjectM687.has(m731("墉鿝᭎壭냱\ueddf䖍", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern())) {
                f399 = (f398 + 103) % 128;
                try {
                    jSONObjectM687.put(m731("墉鿝᭎壭냱\ueddf䖍", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), jSONObjectM687.optLong(ig.f2701));
                    f398 = (f399 + 71) % 128;
                } catch (JSONException unused) {
                }
            }
            if (this.f404.m665(jSONObjectM687)) {
                f398 = (f399 + 51) % 128;
                this.f417.m2944(agVar.m691(), (iu) null);
            }
            jSONArray.put(jSONObjectM687);
        }
        this.f415.m675(jSONArray, this.f416.m2895().m2855(), new AnonymousClass2(jSONArray, list, izVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ah$1, reason: invalid class name */
    public class AnonymousClass1 implements iz, jc.d {
        public AnonymousClass1() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc.d
        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void mo750(List<je> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<je> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ag(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ag agVar = (ag) priorityQueue.poll(); agVar != null; agVar = (ag) priorityQueue.poll()) {
                            if (ah.m730(ah.this, agVar)) {
                                if (TextUtils.isEmpty(agVar.m690())) {
                                    agVar.m689(ah.m696(ah.this).m3047().m904());
                                }
                                arrayList.add(agVar);
                            } else {
                                ah.m704(ah.this).m2946(agVar.m691());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ah.m738(ah.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    ah.m712(ah.this);
                    return;
                }
            }
            ah.m712(ah.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iz
        /* renamed from: ｋ, reason: contains not printable characters */
        public final void mo751(ir irVar) {
            ah.m712(ah.this);
            ah.m737(ah.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iz
        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void mo749(ir irVar, String str) {
            ah.m712(ah.this);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m716(jb jbVar) {
        f399 = (f398 + 39) % 128;
        String strM2921 = jbVar.m2921(m731("\uf16aᖥƝ\uf119㪉፵彟鴔䱤梁ᶣ塮诅뿒\ud880ᯑ줫犈霤픹", ExpandableListView.getPackedPositionGroup(0L)).intern());
        if (!TextUtils.isEmpty(strM2921)) {
            return strM2921;
        }
        f398 = (f399 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        String string = UUID.randomUUID().toString();
        jbVar.m2924(m731("\uf16aᖥƝ\uf119㪉፵彟鴔䱤梁ᶣ塮诅뿒\ud880ᯑ줫犈霤픹", ViewConfiguration.getPressedStateDuration() >> 16).intern(), string);
        f399 = (f398 + 41) % 128;
        return string;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m735(boolean z10) {
        try {
            int i10 = f398;
            int i11 = i10 + 97;
            f399 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f409 = z10;
                throw null;
            }
            this.f409 = z10;
            int i12 = i10 + 91;
            f399 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m734(JSONObject jSONObject) {
        f398 = (f399 + 57) % 128;
        Iterator<String> it = m698().m895().iterator();
        while (it.hasNext()) {
            jSONObject.remove(it.next());
        }
        int i10 = f398 + 85;
        f399 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m719(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (q.m3297().m3316()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f411);
            }
            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ai) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m731(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f401, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f401));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m727(JSONObject jSONObject, iu iuVar) {
        m734(jSONObject);
        ag agVar = new ag(jc.m2933(jSONObject));
        agVar.m692(m698().m894());
        this.f417.m2944(agVar.m691(), iuVar);
        m719(agVar.m687());
        p.m3251(iuVar);
        f398 = (f399 + 111) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m717(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f400.clone();
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
}
