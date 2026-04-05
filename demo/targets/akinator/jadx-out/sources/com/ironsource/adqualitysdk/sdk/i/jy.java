package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.hd;
import com.ironsource.adqualitysdk.sdk.i.he;
import com.ironsource.adqualitysdk.sdk.i.hf;
import com.ironsource.adqualitysdk.sdk.i.hg;
import com.ironsource.adqualitysdk.sdk.i.hj;
import com.ironsource.adqualitysdk.sdk.i.hl;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jy {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Field f3102 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3104 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3105 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Field f3107;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field f3108;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Object f3109;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Class f3110;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Field f3111;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f3106 = {'n', 223, 225, 230, 216, 214, 233, 233, 225, 226, 228, 230, 235, 231, 225, 196, 205, 234, 226, 233, 205, 189, 219, 230, 228, 228, 238, 221, 210, 226, '8', 'o', GMTDateParser.SECONDS, 'r', AbstractJsonLexerKt.UNICODE_ESC, '~', AbstractJsonLexerKt.BEGIN_OBJ, 'f', 'i', 'w', 'q', 'X', 191, 185, 184, 203, 199, 200, 188, 187, 207, 212, 205, 202, 202, 204, 208, 'o', 217, 224, 226, 222, 222, 222, 229, 227, 227, 188, 183, 222, 186, 182, 217, 223, 211, 204, 215, 217, 216, 203, '&', GMTDateParser.YEAR, GMTDateParser.DAY_OF_MONTH, 'f', 'e', 'R', GMTDateParser.YEAR, 'n', 'n', 'n', GMTDateParser.HOURS, 'l', 'n', 'l', 'n', AbstractJsonLexerKt.END_LIST, 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'k', 'k', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'I', 'k', 'j', 'n', 'f', 'b', GMTDateParser.DAY_OF_MONTH, 'Z', '^', 295, 286, 301, 300, 290, 261, 285, 286, 299, 282, 297, 286, 299, 265, 295, 264, 294, 299, 286, '&', GMTDateParser.YEAR, GMTDateParser.DAY_OF_MONTH, 'f', 'e', 'X', 'a', 'k', 'j', GMTDateParser.HOURS, 'i', 'k', GMTDateParser.DAY_OF_MONTH, 'X', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'k', 'k', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'I', 'k', 'j', 'n', 'f', 'b', GMTDateParser.DAY_OF_MONTH, 'Z', '^', '2', 'k', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'I', 'k', 'j', 'n', 'f', 'b', GMTDateParser.DAY_OF_MONTH, 'Z', '^', '`', AbstractJsonLexerKt.STRING_ESC, 'e', GMTDateParser.HOURS, 'W', GMTDateParser.YEAR, 'n', 'n', 'n', GMTDateParser.HOURS, 'l', 'l', 'X', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', '6', 'a', '_', 'g', 'n', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.BEGIN_OBJ, 242, 242, 227, 229, 243, 241, 241, 244, 251, 246, 226, 228};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f3103 = {1654552811, 2045304733, 278502287, 1095197561, 1206507883, -1844055454, -154694945, -1432658167, 1441764189, -1744556576, -1273352611, 1509415091, 57957211, -1509121071, -314856548, -1104548576, -2139694448, -1044149115};

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m3100(View view) {
        try {
            Object objM3103 = m3103(view);
            if (objM3103 == null) {
                return null;
            }
            Class<?> cls = objM3103.getClass();
            synchronized (jv.class) {
                try {
                    if (f3102 == null) {
                        f3102 = m3107(cls, m3106(new int[]{250426305, -1854552254, 174592219, -187337143, 2047386578, 1241419519, -492695769, -1574963377}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnTouchListener) f3102.get(objM3103);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3104(MediaPlayer mediaPlayer, hf.a aVar) throws IllegalAccessException, IllegalArgumentException {
        f3104 = (f3105 + 13) % 128;
        try {
            Field fieldM3107 = m3107(MediaPlayer.class, m3111(null, true, new int[]{Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 19, 185, 17}).intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM3107.get(mediaPlayer);
            if (!(onPreparedListener instanceof hf)) {
                fieldM3107.set(mediaPlayer, new hf(onPreparedListener, aVar));
            }
            f3105 = (f3104 + 27) % 128;
        } catch (Exception e10) {
            kd.m3203(m3106(new int[]{-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056}, 12 - View.combineMeasuredStates(0, 0)).intern(), m3111("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", false, new int[]{140, 39, 0, 21}).intern(), e10, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnClickListener m3105(View view) {
        try {
            Object objM3103 = m3103(view);
            if (objM3103 == null) {
                return null;
            }
            Class<?> cls = objM3103.getClass();
            synchronized (jv.class) {
                try {
                    if (f3108 == null) {
                        f3108 = m3107(cls, m3111("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{41, 16, 97, 15}).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnClickListener) f3108.get(objM3103);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3108(View view, hg.a aVar) {
        int i10 = f3104 + 7;
        f3105 = i10 % 128;
        if (i10 % 2 == 0) {
            m3105(view);
            throw null;
        }
        View.OnClickListener onClickListenerM3105 = m3105(view);
        if (!(onClickListenerM3105 instanceof hg)) {
            view.setOnClickListener(new hg(onClickListenerM3105, aVar));
        }
        int i11 = f3105 + 77;
        f3104 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<android.view.View> m3112() {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3104
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jy.f3105 = r1
            int r0 = r0 % 2
            r1 = 16
            r2 = 0
            if (r0 != 0) goto L18
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r3 = 31
            if (r0 < r3) goto L20
            goto L18
        L16:
            r0 = move-exception
            goto L68
        L18:
            int r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3104
            int r0 = r0 + 47
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jy.f3105 = r0
        L20:
            java.lang.Class r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3110     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L28
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3109     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L5f
        L28:
            int[] r0 = new int[r1]     // Catch: java.lang.Throwable -> L16
            r0 = {x00bc: FILL_ARRAY_DATA , data: [1832384837, -1095030630, 1892395211, -1064379229, -2030913474, 538822230, -984932282, -145028308, -171817966, 1938593667, -900561969, -1306695543, -1499474060, -233498060, 1938447322, -2032299482} // fill-array     // Catch: java.lang.Throwable -> L16
            int r3 = android.view.KeyEvent.normalizeMetaState(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + 32
            java.lang.String r0 = m3106(r0, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L16
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L16
            com.ironsource.adqualitysdk.sdk.i.jy.f3110 = r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000"
            r4 = 30
            r5 = 11
            int[] r4 = new int[]{r4, r5, r5, r2}     // Catch: java.lang.Throwable -> L16
            r5 = 1
            java.lang.String r3 = m3111(r3, r5, r4)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.intern()     // Catch: java.lang.Throwable -> L16
            r4 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.invoke(r4, r4)     // Catch: java.lang.Throwable -> L16
            com.ironsource.adqualitysdk.sdk.i.jy.f3109 = r0     // Catch: java.lang.Throwable -> L16
        L5f:
            java.lang.Class r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3110     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = com.ironsource.adqualitysdk.sdk.i.jy.f3109     // Catch: java.lang.Throwable -> L16
            java.util.List r0 = m3113(r0, r3)     // Catch: java.lang.Throwable -> L16
            return r0
        L68:
            r3 = 6
            int[] r3 = new int[r3]
            r3 = {x00e0: FILL_ARRAY_DATA , data: [-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056} // fill-array
            int r4 = android.view.ViewConfiguration.getTapTimeout()
            int r1 = r4 >> 16
            int r1 = 12 - r1
            java.lang.String r1 = m3106(r3, r1)
            java.lang.String r1 = r1.intern()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 18
            int[] r4 = new int[r4]
            r4 = {x00f0: FILL_ARRAY_DATA , data: [1028333951, 739910002, 1866228171, -508972902, 906423748, 562966348, -348738957, -2117163329, -327700436, 239458313, 1009334742, -1283137581, -8575077, 2035452246, -2030913474, 538822230, -1121142990, 1912224588} // fill-array
            java.lang.String r5 = ""
            r6 = 48
            int r2 = android.text.TextUtils.indexOf(r5, r6, r2)
            int r2 = r2 + 36
            java.lang.String r2 = m3106(r4, r2)
            java.lang.String r2 = r2.intern()
            r3.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.ironsource.adqualitysdk.sdk.i.k.m3136(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = com.ironsource.adqualitysdk.sdk.i.jy.f3105
            int r1 = r1 + 125
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jy.f3104 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jy.m3112():java.util.List");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Object m3103(View view) {
        try {
            synchronized (jv.class) {
                try {
                    if (f3111 == null) {
                        f3111 = m3107(View.class, m3111("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true, new int[]{Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 13, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 0}).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f3111.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3109(View view, hl.c cVar) {
        f3105 = (f3104 + 1) % 128;
        View.OnTouchListener onTouchListenerM3100 = m3100(view);
        if (onTouchListenerM3100 instanceof hl) {
            return;
        }
        view.setOnTouchListener(new hl(onTouchListenerM3100, cVar));
        f3104 = (f3105 + 37) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3101(MediaPlayer mediaPlayer, hd.d dVar) throws IllegalAccessException, IllegalArgumentException {
        Field fieldM3107;
        MediaPlayer.OnInfoListener onInfoListener;
        int i10 = f3105 + 15;
        f3104 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                fieldM3107 = m3107(MediaPlayer.class, m3106(new int[]{1943601247, -1942616235, -2100079906, -1263559470, -1275788329, -1212074022, 1063346278, 148426215}, 12 >>> View.MeasureSpec.getSize(0)).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM3107.get(mediaPlayer);
                if (onInfoListener instanceof hd) {
                    return;
                }
            } else {
                fieldM3107 = m3107(MediaPlayer.class, m3106(new int[]{1943601247, -1942616235, -2100079906, -1263559470, -1275788329, -1212074022, 1063346278, 148426215}, View.MeasureSpec.getSize(0) + 15).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM3107.get(mediaPlayer);
                if (onInfoListener instanceof hd) {
                    return;
                }
            }
            fieldM3107.set(mediaPlayer, new hd(onInfoListener, dVar));
            f3104 = (f3105 + 41) % 128;
        } catch (Exception e10) {
            kd.m3203(m3106(new int[]{-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056}, 12 - Color.argb(0, 0, 0, 0)).intern(), m3106(new int[]{2016948475, -1418756443, 955326951, -368561244, 252132825, 2301349, 259336711, -2100658241, -131054661, 1765211421, -1017957212, -663049638, -2100079906, -1263559470, -1275788329, -1212074022, 1063346278, 148426215}, 35 - Gravity.getAbsoluteGravity(0, 0)).intern(), e10, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Field m3107(Class cls, String str) throws NoSuchFieldException, SecurityException {
        f3104 = (f3105 + 13) % 128;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            f3105 = (f3104 + 61) % 128;
            return declaredField;
        } catch (Exception e10) {
            kd.m3203(m3106(new int[]{-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056}, 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m3106(new int[]{2016948475, -1418756443, 955326951, -368561244, -1738249110, 1879934454, -444072667, -992582106, -2113456868, -1763255163, -1312913038, 1055449515, -176758128, 1267805313}, 25 - View.MeasureSpec.getSize(0)).intern(), e10, false);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r0 != null) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaPlayer m3110(android.widget.VideoView r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jy.f3105
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jy.f3104 = r1
            int r0 = r0 % 2
            r1 = 6
            java.lang.Class<android.widget.VideoView> r2 = android.widget.VideoView.class
            r3 = 0
            if (r0 == 0) goto L2d
            int[] r0 = new int[r1]     // Catch: java.lang.Exception -> L2b
            r0 = {x0086: FILL_ARRAY_DATA , data: [1198095324, 659109241, -940578338, 1009080871, -1237471369, -972719139} // fill-array     // Catch: java.lang.Exception -> L2b
            r4 = 1
            int r4 = android.graphics.Color.red(r4)     // Catch: java.lang.Exception -> L2b
            int r4 = 94 - r4
            java.lang.String r0 = m3106(r0, r4)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Field r0 = m3107(r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L4d
            goto L46
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            int[] r0 = new int[r1]     // Catch: java.lang.Exception -> L2b
            r0 = {x0096: FILL_ARRAY_DATA , data: [1198095324, 659109241, -940578338, 1009080871, -1237471369, -972719139} // fill-array     // Catch: java.lang.Exception -> L2b
            int r4 = android.graphics.Color.red(r3)     // Catch: java.lang.Exception -> L2b
            int r4 = r4 + 12
            java.lang.String r0 = m3106(r0, r4)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Field r0 = m3107(r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L4d
        L46:
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Exception -> L2b
            android.media.MediaPlayer r6 = (android.media.MediaPlayer) r6     // Catch: java.lang.Exception -> L2b
            return r6
        L4d:
            int r6 = com.ironsource.adqualitysdk.sdk.i.jy.f3104
            int r6 = r6 + 9
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.jy.f3105 = r6
            goto L83
        L56:
            int[] r0 = new int[r1]
            r0 = {x00a6: FILL_ARRAY_DATA , data: [-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056} // fill-array
            int r1 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r1 = r1 >> 24
            int r1 = 12 - r1
            java.lang.String r0 = m3106(r0, r1)
            java.lang.String r0 = r0.intern()
            r1 = 115(0x73, float:1.61E-43)
            r2 = 5
            r4 = 57
            r5 = 23
            int[] r1 = new int[]{r4, r5, r1, r2}
            java.lang.String r2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001"
            java.lang.String r1 = m3111(r2, r3, r1)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m3203(r0, r1, r6, r3)
        L83:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jy.m3110(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3106(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f3103.clone();
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3114(MediaPlayer mediaPlayer, he.b bVar) throws IllegalAccessException, IllegalArgumentException {
        f3104 = (f3105 + 113) % 128;
        try {
            Field fieldM3107 = m3107(MediaPlayer.class, m3106(new int[]{301997266, 816003585, -664928304, 404213110, 1098061534, -1511375635, -633331493, -1237452946, 473380455, 168983151, 1273013730, 1866602811}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM3107.get(mediaPlayer);
            if (onCompletionListener instanceof he) {
                return;
            }
            fieldM3107.set(mediaPlayer, new he(onCompletionListener, bVar));
            f3105 = (f3104 + 37) % 128;
        } catch (Exception e10) {
            kd.m3203(m3106(new int[]{-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056}, 12 - View.combineMeasuredStates(0, 0)).intern(), m3111("\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", false, new int[]{80, 41, 0, 23}).intern(), e10, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3102(MediaPlayer mediaPlayer, hj.e eVar) throws IllegalAccessException, IllegalArgumentException {
        f3104 = (f3105 + 43) % 128;
        try {
            Field fieldM3107 = m3107(MediaPlayer.class, m3106(new int[]{1542526115, 1720958894, 870891566, -1873840768, -664928304, 404213110, 1839365721, 1150317957, -1275788329, -1212074022, 1063346278, 148426215}, 23 - Color.alpha(0)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM3107.get(mediaPlayer);
            if (!(onSeekCompleteListener instanceof hj)) {
                fieldM3107.set(mediaPlayer, new hj(onSeekCompleteListener, eVar));
            }
            int i10 = f3104 + 39;
            f3105 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m3203(m3106(new int[]{-1707449474, -1441527061, 591634003, 61502831, -1783278720, -776538056}, TextUtils.getOffsetBefore("", 0) + 12).intern(), m3111("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{179, 38, 0, 0}).intern(), e10, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<View> m3113(Class cls, Object obj) throws Exception {
        int i10 = (f3105 + 65) % 128;
        f3104 = i10;
        if (f3107 == null) {
            f3105 = (i10 + 53) % 128;
            Field declaredField = cls.getDeclaredField(m3111("\u0001\u0001\u0001\u0000\u0000\u0000", false, new int[]{Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 6, 0, 0}).intern());
            f3107 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f3107.get(obj);
        if (obj2 instanceof List) {
            return (List) f3107.get(obj);
        }
        if (obj2 instanceof View[]) {
            int i11 = f3104 + 63;
            f3105 = i11 % 128;
            if (i11 % 2 != 0) {
                return Arrays.asList((View[]) f3107.get(obj));
            }
            Arrays.asList((View[]) f3107.get(obj));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = f3104 + 87;
        f3105 = i12 % 128;
        if (i12 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3111(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3106, i10, cArr, 0, i11);
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
}
