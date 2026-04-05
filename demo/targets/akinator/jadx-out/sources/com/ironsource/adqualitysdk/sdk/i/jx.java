package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jx {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3094 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3096 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3097 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3099 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3100 = 119;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f3098 = {231, 229, 237, 151, 164, 220, 233, 230, 177, 186, 236, 227, 219, 158, 235, 216, 228, 224, 221, 225, 234, 165};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f3095 = 6;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3101 = {'A', 'p', 'U', 't', 'i', 'l', GMTDateParser.SECONDS, 'C', 'o', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, 'n', '\'', ' ', 'a', 'b', 'e', 'I', 'f', 'j', 'c', 'r', 'k', 'g', GMTDateParser.MINUTES, '.', AbstractJsonLexerKt.COLON, 'v', 'y', '3', 'P', 'q', 'S', 'T', 'E', 'x'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3094(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f3098;
                int i11 = f3100;
                if (f3097) {
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
                if (f3099) {
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

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3096(Context context, JSONObject jSONObject) throws JSONException, PackageManager.NameNotFoundException {
        long j10;
        f3096 = (f3094 + 47) % 128;
        String strIntern = m3098(KeyEvent.getDeadChar(0, 0) + 8, (byte) (3 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u000b").intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m3094(null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, "\u0082\u0081").intern(), packageName);
        } catch (JSONException e10) {
            k.m3145(strIntern, m3098(34 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (115 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u000fØØ\u000e\u0010\n\u0006\u000b\u0004\u0011\f\u0007\u0010\u0005\n\u0014\u0006\u000f\u0001\u0007\u000e\u0012\u0007\t\u0006").intern(), (Throwable) e10);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m3098(1 - MotionEvent.axisFromString(""), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 25), "\u0015\u0013").intern(), packageManager.getInstallerPackageName(packageName));
            f3094 = (f3096 + 9) % 128;
        } catch (JSONException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3098((ViewConfiguration.getKeyRepeatDelay() >> 16) + 52, (byte) (84 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u000f¸¸\u0010\u0001\u0006\u0007\u0002\u000fÀÀ\u000f\u0016\u0013\u0007\u0014\u001a\u0014\u0010\u0016\u0011\u0011\u0007\f\u001a\u0011\u000e\u0002\t\u0013\u0019\u0007\t\u0007\u001d\u000e\u0011ÆÆ\t\u0014\u0019\u000e").intern());
            sb2.append(e11.getLocalizedMessage());
            k.m3136(strIntern, sb2.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m3098(Color.alpha(0) + 2, (byte) (83 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u001a\u0015").intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m3094(null, AndroidCharacter.getMirror('0') + 'O', null, "\u0082\u0083").intern(), packageInfo.versionName);
            j10 = 0;
        } catch (PackageManager.NameNotFoundException e12) {
            j10 = 0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m3098(TextUtils.indexOf((CharSequence) "", '0', 0) + 34, (byte) (TextUtils.getCapsMode("", 0, 0) + 83), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u0011\u0013\u000f\u0004\u0013\u0007\u0014\u001a\u0014\u0010\u0016\u0011\f\u0019\u0011\b\u0011\u0014\u000f\u0016\f\u0013\t\u0014s").intern());
            sb3.append(packageName);
            sb3.append(m3094(null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, "\u0084\u0089\u0087\u0088\u0087\u0087\u0086\u0084\u0085\u0084").intern());
            sb3.append(e12.getLocalizedMessage());
            k.m3136(strIntern, sb3.toString());
        } catch (JSONException e13) {
            StringBuilder sb4 = new StringBuilder();
            j10 = 0;
            sb4.append(m3098((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, (byte) (73 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u000f\u00ad\u00ad\u000e\u000f¹¹\u000f\u0019\u000f\u0016\n\u0000\t\u0006\u0010\u0001\u0006\u0017\u0007\u000e\u0002\t\u0013\u0019\u0007\t\u0007\u001d\u000e\u0011»»\t\u0014\u0019\u000e").intern());
            sb4.append(e13.getLocalizedMessage());
            k.m3136(strIntern, sb4.toString());
        }
        try {
            jSONObject.put(m3098(3 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)), (byte) (TextUtils.indexOf("", "") + 90), "\u000b\u0006").intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (PackageManager.NameNotFoundException e14) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m3098(TextUtils.lastIndexOf("", '0') + 34, (byte) (84 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1))), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u0011\u0013\u000f\u0004\u0013\u0007\u0014\u001a\u0014\u0010\u0016\u0011\f\u0019\u0011\b\u0011\u0014\u000f\u0016\f\u0013\t\u0014s").intern());
            sb5.append(packageName);
            sb5.append(m3094(null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, "\u0084\u0089\u0087\u0088\u0087\u0087\u0086\u0084\u0085\u0084").intern());
            sb5.append(e14.getLocalizedMessage());
            k.m3136(strIntern, sb5.toString());
        } catch (JSONException e15) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m3094(null, TextUtils.lastIndexOf("", '0', 0) + 128, null, "\u0084\u0089\u0087\u0088\u0087\u0087\u0086\u0084\u0096\u0082\u0088\u0095\u0094\u0084\u0088\u008f\u0084\u0088\u0093\u0082\u0092\u0084\u0086\u0091\u0090\u0082\u0084\u0081\u0081\u0090\u0084\u008d\u008d\u0090\u0084\u008f\u008e\u0082\u008d\u008c\u008b\u0088\u008a").intern());
            sb6.append(e15.getLocalizedMessage());
            k.m3136(strIntern, sb6.toString());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m3099(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            int i10 = f3096 + 113;
            f3094 = i10 % 128;
            return i10 % 2 == 0;
        }
        int i11 = f3094 + 47;
        f3096 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m3097() throws ClassNotFoundException {
        f3096 = (f3094 + 3) % 128;
        try {
            try {
                Class.forName(m3098(30 - Drawable.resolveOpacity(0, 0), (byte) (66 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u001a\u000e\u0019\u001a\n\u0006\u0005\u0004\u001d\u0018\u0007\u001c\u0002\u0000\u0010\u001a\u000f\u0016\u001a\u0001\n\u0005\u0004\u001b#\u0000\u0010\u001a\u000f\u0016").intern());
                String strIntern = m3098(1 - TextUtils.getOffsetAfter("", 0), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 78), "Ã").intern();
                int i10 = f3094 + 59;
                f3096 = i10 % 128;
                if (i10 % 2 != 0) {
                    return strIntern;
                }
                throw null;
            } catch (ClassNotFoundException unused) {
                return m3098(-TextUtils.lastIndexOf("", '0', 0), (byte) (View.MeasureSpec.getSize(0) + 93), "Ë").intern();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName(m3098(60 - TextUtils.getCapsMode("", 0, 0), (byte) (97 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u001a\u000e\u0019\u001a\u0003\u0016\t\u0006\u0007\t\u000f\u001b\u0016\u000e\u001a\r\u0007\"\b\u000f\u0000\u0005\u0004\u001b\u0007\u000b\u0013\u001c\u0007\u000b\u0013\u001c\u0010\u0002\u0013\u001b\u0002\u000e\u0006\u001a\u0002\u0011\u0003\u001b\u0014\u001a\u0011\u0010\u0014\u001a\u001c\u0004!\u0005\u0011\n\n\u0000\t\u0006").intern());
            return m3098(1 - View.MeasureSpec.getSize(0), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 112), "Ñ").intern();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3098(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f3101;
                char c10 = f3095;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m3095(Context context) {
        f3096 = (f3094 + 13) % 128;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName;
            int i10 = f3096 + 63;
            f3094 = i10 % 128;
            if (i10 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e10) {
            String strIntern = m3098((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, (byte) (3 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u000b").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3098((Process.myTid() >> 22) + 33, (byte) (83 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u0011\u0013\u000f\u0004\u0013\u0007\u0014\u001a\u0014\u0010\u0016\u0011\f\u0019\u0011\b\u0011\u0014\u000f\u0016\f\u0013\t\u0014s").intern());
            sb2.append(packageName);
            sb2.append(m3094(null, 127 - KeyEvent.getDeadChar(0, 0), null, "\u0084\u0089\u0087\u0088\u0087\u0087\u0086\u0084\u0085\u0084").intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3136(strIntern, sb2.toString());
            return null;
        }
    }
}
