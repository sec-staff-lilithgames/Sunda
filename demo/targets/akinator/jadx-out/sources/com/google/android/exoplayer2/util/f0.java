package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f28447b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28448c = true;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f28446a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static e0 f28449d = e0.f28439a;

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
        synchronized (f28446a) {
            try {
                if (f28447b == 0) {
                    ((d0) f28449d).d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void e(String str, String str2) {
        synchronized (f28446a) {
            try {
                if (f28447b <= 3) {
                    ((d0) f28449d).e(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static int getLogLevel() {
        int i10;
        synchronized (f28446a) {
            i10 = f28447b;
        }
        return i10;
    }

    @Pure
    public static String getThrowableString(Throwable th2) {
        boolean z10;
        synchronized (f28446a) {
            try {
                if (th2 == null) {
                    return null;
                }
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        z10 = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                if (z10) {
                    return "UnknownHostException (no network)";
                }
                if (f28448c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } finally {
            }
        }
    }

    @Pure
    public static void i(String str, String str2) {
        synchronized (f28446a) {
            try {
                if (f28447b <= 1) {
                    ((d0) f28449d).i(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setLogLevel(int i10) {
        synchronized (f28446a) {
            f28447b = i10;
        }
    }

    public static void setLogStackTraces(boolean z10) {
        synchronized (f28446a) {
            f28448c = z10;
        }
    }

    public static void setLogger(e0 e0Var) {
        synchronized (f28446a) {
            f28449d = e0Var;
        }
    }

    @Pure
    public static void w(String str, String str2) {
        synchronized (f28446a) {
            try {
                if (f28447b <= 2) {
                    ((d0) f28449d).w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
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
}
