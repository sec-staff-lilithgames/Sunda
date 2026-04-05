package com.mbridge.msdk.tracker.network;

import android.util.Log;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f43950a = "TrackManager_Volley";

    /* renamed from: b, reason: collision with root package name */
    private static final String f43951b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th2, String str, Object... objArr) {
        Log.e(f43950a, a(str, objArr), th2);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f43950a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f43950a, a(str, objArr));
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f43951b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbT = a.b.t(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbT.append(stackTrace[i10].getMethodName());
                string = sbT.toString();
                break;
            }
            i10++;
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return o2.o(sb2, ": ", str);
    }

    public static void d(String str, Object... objArr) {
    }
}
