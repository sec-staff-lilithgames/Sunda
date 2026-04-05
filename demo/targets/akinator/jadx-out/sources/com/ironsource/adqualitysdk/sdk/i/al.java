package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class al {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f529 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f530 = 2091596816;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f531 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f532;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f533;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m792(Object obj, BroadcastReceiver broadcastReceiver) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f532 = (f531 + 69) % 128;
        try {
            jz.m3126(obj, m793("큸䘲搻헙", (char) (55652 - (ViewConfiguration.getScrollBarSize() >> 8)), "ű\ue474ὲ濔垆檦ﱊ踶\ue1e5놲谢됙텁澞\ud9a9䛓뙯㫥", ViewConfiguration.getWindowTouchSlop() >> 8, "\u0000\u0000\u0000\u0000").intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            f531 = (f532 + 65) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m794(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f532 = (f531 + 63) % 128;
        try {
            jz.m3126(obj, m793("ǟ酢ᕖ蘮", (char) (View.resolveSizeAndState(0, 0, 0) + 11797), "︅ᨛ쯁\u0dfdꀹ䝈뱪籄篜㮂\uea6b媮⦻膕鳸হ", Process.myTid() >> 22, "\u0000\u0000\u0000\u0000").intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            f531 = (f532 + 1) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m795(Context context) {
        f531 = (f532 + 83) % 128;
        try {
            return jz.m3126(m796(), m793("罆\ue992ᆒ춫", (char) View.MeasureSpec.getMode(0), "쨪³\ue5af洨琏\ue270\ue289횢讯땘몑", (-1830186369) - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000").intern(), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            f532 = (f531 + 39) % 128;
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Class m796() {
        f531 = (f532 + 9) % 128;
        Class clsM3124 = jz.m3124(m793("ｔ眆牢\ue5ca", (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "鵡劆崄⫗\uf86e䕗漖ﭝꃧ縣௦槾㉸㉒⨼\ud962傱誖茓㵋ꣴ辡⊘ᯇȇ瀛靎쟭\uf24b븼䎕䠪琩ର綮罻됈埥ᡤ膰\ueb8cÁ䀕\uec03鸈戀燩\ue5e2ᑦ氍ꅹ孚\ue056誋軤蛱\ue572妋\uf408\ude8b", KeyEvent.getMaxKeyCode() >> 16, "\u0000\u0000\u0000\u0000").intern(), false);
        f532 = (f531 + 73) % 128;
        return clsM3124;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m793(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f529) ^ f530) ^ f533);
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
