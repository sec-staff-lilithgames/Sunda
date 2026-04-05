package com.inmobi.media;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2902n7 {

    /* renamed from: a, reason: collision with root package name */
    public static byte f33134a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f33135b;

    public static final void a(byte b10, String tag, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        if (f33135b) {
            System.out.println((Object) str);
        }
        if (b10 == 1) {
            byte b11 = f33134a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                kotlin.jvm.internal.e0.checkNotNull(str);
                Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 == 2) {
            byte b12 = f33134a;
            if (2 == b12 || 3 == b12) {
                kotlin.jvm.internal.e0.checkNotNull(str);
                Log.d("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 == 3) {
            kotlin.jvm.internal.e0.checkNotNull(str);
            if (str.length() > 4000) {
                b(tag, str);
            } else {
                Log.d(tag, str);
            }
        }
    }

    public static void b(String str, String str2) {
        if (str2.length() <= 4000) {
            Log.d(str, str2);
            return;
        }
        String strSubstring = str2.substring(0, 4000);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Log.d(str, strSubstring);
        String strSubstring2 = str2.substring(4000);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        b(str, strSubstring2);
    }

    public static final void a(String tag, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        a((byte) 3, tag, str);
    }

    public static final void a(String str, String str2, Throwable th2) {
        a((byte) 3, str, str2, th2);
    }

    public static final void a(byte b10, String str, String str2, Throwable th2) {
        if (f33135b) {
            System.out.println((Object) str2);
        }
        if (b10 == 1) {
            byte b11 = f33134a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str2, th2);
                return;
            }
            return;
        }
        if (b10 != 2) {
            if (b10 == 3) {
                Log.d(str, str2, th2);
            }
        } else {
            byte b12 = f33134a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str2, th2);
            }
        }
    }

    public static final void a(byte b10) {
        f33134a = b10;
    }

    public static final void a(boolean z10) {
        f33135b = z10;
    }
}
