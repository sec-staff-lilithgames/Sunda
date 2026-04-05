package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class aj {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f496 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f497 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final aw f502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f503;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f500 = {128, 265, 269, 261, 265, 265, 247, 252, 266, 264, 266, 262, 257, 258, 256, 245, 249, 266, 269, 271, 272, 248, 240, 256, 262, 271, 270, 253, 252, 266, 268, 249, '!', 'R', 'g', 'J', GMTDateParser.MONTH, 'J', 'I', 'l', 'i', 'i', 'B', 'A', 'l', 't', GMTDateParser.SECONDS, 'q', 'n', 'F', 'F', 'i', GMTDateParser.DAY_OF_MONTH, 'f', 'e', 'j', 'n', 'l', 'n', 'G', 'I', 'k', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'i', 'q', GMTDateParser.MINUTES, 'O', '-', 'I', 'k', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'i', 'q', GMTDateParser.MINUTES, 'B', 'I', GMTDateParser.MINUTES, 'k', 'r', 'p', GMTDateParser.HOURS, 'B', 'A', 'c', 'B', 'G', 'n', 'n', GMTDateParser.MONTH, GMTDateParser.MONTH, 'i', 'f', GMTDateParser.DAY_OF_MONTH, 'j', 'n', 'o', GMTDateParser.MINUTES, '5', 'n', 'p', GMTDateParser.SECONDS, AbstractJsonLexerKt.UNICODE_ESC, 'l', 'i', 'G', 'G', 'n', 'l', 'n', 'j', 'e', 'f', GMTDateParser.DAY_OF_MONTH, 'i', 'F', 'C', 'j', 'k', 'n', GMTDateParser.SECONDS, 'n', 'k', 'F', '-', 'O', GMTDateParser.MINUTES, 'q', 'i', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'k', 'I', 'G', 'n', 'l', 'n', 'j', 'e', 'f', GMTDateParser.DAY_OF_MONTH, 'i', 'F', 'F', 'n', 'q', GMTDateParser.SECONDS, 't', 'l', 'A', 'B', 'i', 'i', 'l', 'I', 'J', GMTDateParser.MONTH, 'J', 'g', 'R', '9', AbstractJsonLexerKt.UNICODE_ESC, 't', 'y', '|', 't', 'r', 'v', 't', GMTDateParser.DAY_OF_MONTH, 'j', 'o', 'p', 't', GMTDateParser.SECONDS, 'f', 'q', AbstractJsonLexerKt.END_LIST, 183, 187, 190, 185, 186, 188, 180, '9', 'k', 'f', 'n', 'q'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f501 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f499 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f498 = 37969;

    public aj(aw awVar) {
        this.f502 = awVar;
        jf.m2969().m2970(new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.3.4

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static int f505 = 1;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static short[] f506 = null;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f507 = 0;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f508 = -265187829;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static int f509 = 523073688;

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static byte[] f510 = {-52, -50, 56, 35, 38, -36, 35, -17, 8, -48, 33, 36, -44, -24, 29, 34, -37, 40, -50, 37, -40, 34, 37, 0};

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static int f511 = 70;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static String m782(int i10, short s10, int i11, byte b10, int i12) {
                        String string;
                        synchronized (n.f3160) {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                int i13 = f511;
                                int i14 = i10 + i13;
                                int i15 = i14 == -1 ? 1 : 0;
                                if (i15 != 0) {
                                    byte[] bArr = f510;
                                    i14 = bArr != null ? (byte) (bArr[f508 + i11] + i13) : (short) (f506[f508 + i11] + i13);
                                }
                                if (i14 > 0) {
                                    n.f3165 = ((i11 + i14) - 2) + f508 + i15;
                                    n.f3163 = b10;
                                    char c10 = (char) (i12 + f509);
                                    n.f3162 = c10;
                                    sb2.append(c10);
                                    n.f3161 = n.f3162;
                                    n.f3164 = 1;
                                    while (n.f3164 < i14) {
                                        byte[] bArr2 = f510;
                                        if (bArr2 != null) {
                                            int i16 = n.f3165;
                                            n.f3165 = i16 - 1;
                                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                                        } else {
                                            short[] sArr = f506;
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
                    public final void mo590() throws Exception {
                        f505 = (f507 + 23) % 128;
                        if (aj.m776(aj.this)) {
                            f505 = (f507 + 57) % 128;
                            aj.m778(aj.this).m994(m782((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 47, (short) TextUtils.getOffsetBefore("", 0), Color.green(0) + 265187829, (byte) (TextUtils.lastIndexOf("", '0') - 34), Drawable.resolveOpacity(0, 0) - 523073579).intern());
                            aj.m780(aj.this, false);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m771(aj ajVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) throws JSONException {
        f497 = (f496 + 11) % 128;
        JSONObject jSONObjectM770 = m770(iSAdQualityCustomMediationRevenue);
        f497 = (f496 + 9) % 128;
        return jSONObjectM770;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m774(ISAdQualityAdType iSAdQualityAdType) {
        if (iSAdQualityAdType != ISAdQualityAdType.INTERSTITIAL) {
            f496 = (f497 + 11) % 128;
            if (iSAdQualityAdType != ISAdQualityAdType.VIDEO && iSAdQualityAdType != ISAdQualityAdType.REWARDED_VIDEO && iSAdQualityAdType != ISAdQualityAdType.REWARDED) {
                f496 = (f497 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                return false;
            }
        }
        int i10 = f497 + 49;
        f496 = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m776(aj ajVar) {
        int i10 = f496;
        int i11 = i10 + 99;
        f497 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = ajVar.f503;
        if (i12 == 0) {
            throw null;
        }
        f497 = (i10 + 65) % 128;
        return z10;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m777(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == null || TextUtils.isEmpty(m775(iSAdQualityMediationNetwork))) {
            f496 = (f497 + 35) % 128;
            return false;
        }
        f496 = (f497 + 39) % 128;
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ aw m778(aj ajVar) {
        int i10 = f497;
        f496 = (i10 + 83) % 128;
        aw awVar = ajVar.f502;
        int i11 = i10 + 113;
        f496 = i11 % 128;
        if (i11 % 2 == 0) {
            return awVar;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m770(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) throws JSONException {
        dg dgVar = new dg();
        dgVar.m2226(true);
        dgVar.m2228(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        dgVar.m2225(m775(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        dgVar.m2227(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM2224 = dgVar.m2224();
        f497 = (f496 + 47) % 128;
        return jSONObjectM2224;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m773(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f500, i10, cArr, 0, i11);
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m780(aj ajVar, boolean z10) {
        int i10 = f496 + 57;
        f497 = i10 % 128;
        int i11 = i10 % 2;
        ajVar.f503 = z10;
        if (i11 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m781(final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f496 + 57;
        f497 = i10 % 128;
        if (i10 % 2 == 0) {
            m779(iSAdQualityCustomMediationRevenue);
            throw null;
        }
        if (m779(iSAdQualityCustomMediationRevenue)) {
            p.m3257(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.5

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f513 = 1;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f514 = 0;

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static long f515 = 1747949037909725973L;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static int f516;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static char f517;

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    f514 = (f513 + 5) % 128;
                    aj.m778(aj.this).m995(m783("䦑蕑듚쥻", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\udd6c丣缁髨緌ﱜ䜣廨免\uf5cb\ue4c4쿂\uec6b⫙형눫ល䋛ﾍ≠퐒", (-628797111) - TextUtils.indexOf("", ""), "匕鈘\uf663ᡁ").intern(), Collections.singletonList(aj.m771(aj.this, iSAdQualityCustomMediationRevenue)));
                    aj.m780(aj.this, true);
                    f513 = (f514 + 83) % 128;
                }

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static String m783(String str, char c10, String str2, int i11, String str3) {
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
                                    cArr6[i16] = (char) ((((c12 ^ cArr2[i16]) ^ f515) ^ f516) ^ f517);
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
            }, aq.m814().mo831());
        }
        f496 = (f497 + 107) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m779(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        f496 = (f497 + 31) % 128;
        if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
            int i10 = f496 + 1;
            f497 = i10 % 128;
            if (i10 % 2 == 0) {
                k.m3152(m773("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{0, 32, 156, 0}).intern(), m773("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{32, 67, 0, 0}).intern());
                return false;
            }
            k.m3152(m773("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{0, 32, 156, 0}).intern(), m773("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{32, 67, 0, 0}).intern());
            return false;
        }
        if (!m777(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            f496 = (f497 + 29) % 128;
            k.m3152(m773("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{0, 32, 156, 0}).intern(), m773("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{99, 62, 0, 0}).intern());
            return false;
        }
        if (m774(iSAdQualityCustomMediationRevenue.getAdType())) {
            return true;
        }
        f497 = (f496 + 39) % 128;
        k.m3152(m773("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{0, 32, 156, 0}).intern(), m772("㩚ݨ漰\uf3cf", (char) (53103 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "舃鼫溲ꬓע賡흕壋쯶⤂粽蠌쐴렑籑洯阈ꄬ狼鋋㻧ﴪ푤몟♖烂뽊\u0bc4䑎\ue5d8蒓\udc42\udcbc뤙ꈵᚘ炩ꛕ큛伤犲➚꯳颼Ⓥ衬﹦\uf25b鼺삧呇֦徎䙘酫\ue9fcಐ琲㘅\uebe4！ﮦ큐腫뾤\uecf9Ǳꎲ렞褘\ueb2cꥡ\uee79ᙣꔓ㎯永ⵦ촣㖡\uea5d咊葨勄ᯋ脓罠┲\ude4b튴寯騪봉揯ﻨ\ufae8\u0dcd\uf81fധ窽\udad1⟳鵽鲡ꀸ䱺ꖁ\ue55c", (Process.getThreadPriority(0) + 20) >> 6, "\u0000\u0000\u0000\u0000").intern());
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m775(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m772("咃唞쳤蹳", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29644), "邶䗵\ue15e\udeaa䎲", (Process.myTid() >> 22) - 464183724, "\u0000\u0000\u0000\u0000").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m773("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{161, 7, 15, 0}).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m772("髆㗺ᡎ눒", (char) (4632 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "᳁細ԇ\u0adb榊뮲", KeyEvent.normalizeMetaState(0), "\u0000\u0000\u0000\u0000").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            int i10 = f496 + 105;
            f497 = i10 % 128;
            return i10 % 2 == 0 ? m773(null, false, new int[]{168, 10, 1, 2}).intern() : m773(null, true, new int[]{168, 10, 1, 2}).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            int i11 = f496 + 83;
            f497 = i11 % 128;
            return i11 % 2 == 0 ? m773("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", false, new int[]{178, 8, 76, 0}).intern() : m773("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", true, new int[]{178, 8, 76, 0}).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            f496 = (f497 + 15) % 128;
            return m772("처ꮛ儡뚁", (char) TextUtils.getOffsetBefore("", 0), "\ue450㢼ꈋ̍\ud923ꤍ迲ⅽ", TextUtils.getCapsMode("", 0, 0), "\u0000\u0000\u0000\u0000").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            int i12 = f496 + 53;
            f497 = i12 % 128;
            return i12 % 2 == 0 ? m772("奉㊺\uf56dꞅ", (char) KeyEvent.getDeadChar(0, 0), "ꡳ႕ꏭ箪셰읮酪ঢ춙驛␃\uf477", ViewConfiguration.getFadingEdgeLength() + 55, "\u0000\u0000\u0000\u0000").intern() : m772("奉㊺\uf56dꞅ", (char) KeyEvent.getDeadChar(0, 0), "ꡳ႕ꏭ箪셰읮酪ঢ춙驛␃\uf477", ViewConfiguration.getFadingEdgeLength() >> 16, "\u0000\u0000\u0000\u0000").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER) {
            int i13 = f497 + 111;
            f496 = i13 % 128;
            return i13 % 2 != 0 ? m773("\u0000\u0001\u0001\u0000\u0001", false, new int[]{186, 5, 0, 0}).intern() : m773("\u0000\u0001\u0001\u0000\u0001", true, new int[]{186, 5, 0, 0}).intern();
        }
        f496 = (f497 + 75) % 128;
        return "";
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m772(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f501) ^ f499) ^ f498);
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
}
