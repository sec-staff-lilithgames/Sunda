package io.odeeo.internal.q0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static int f65915a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f65916b = true;

    @Pure
    public static String a(String str, Throwable th2) {
        String throwableString = getThrowableString(th2);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbT = a.b.t(str, "\n  ");
        sbT.append(throwableString.replace("\n", "\n  "));
        sbT.append('\n');
        return sbT.toString();
    }

    @Pure
    public static void d(String str, String str2) {
        if (f65915a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void e(String str, String str2) {
        if (f65915a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static int getLogLevel() {
        return f65915a;
    }

    @Pure
    public static String getThrowableString(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return a(th2) ? "UnknownHostException (no network)" : !f65916b ? th2.getMessage() : Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    @Pure
    public static void i(String str, String str2) {
        if (f65915a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void setLogLevel(int i10) {
        f65915a = i10;
    }

    public static void setLogStackTraces(boolean z10) {
        f65916b = z10;
    }

    @Pure
    public static void w(String str, String str2) {
        if (f65915a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th2) {
        d(str, a(str2, th2));
    }

    @Pure
    public static void e(String str, String str2, Throwable th2) {
        e(str, a(str2, th2));
    }

    @Pure
    public static void i(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }

    @Pure
    public static void w(String str, String str2, Throwable th2) {
        w(str, a(str2, th2));
    }

    @Pure
    public static boolean a(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }
}
