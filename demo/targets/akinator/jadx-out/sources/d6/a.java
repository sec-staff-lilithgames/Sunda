package d6;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f51864a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f51865b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f51866c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f51867d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f51868e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f51869f;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static String b(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void beginAsyncSection(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.beginAsyncSection(b(str), i10);
            return;
        }
        String strB = b(str);
        try {
            if (f51866c == null) {
                f51866c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f51866c.invoke(null, Long.valueOf(f51864a), strB, Integer.valueOf(i10));
        } catch (Exception e10) {
            a("asyncTraceBegin", e10);
        }
    }

    public static void beginSection(String str) {
        b.beginSection(b(str));
    }

    public static void endAsyncSection(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.endAsyncSection(b(str), i10);
            return;
        }
        String strB = b(str);
        try {
            if (f51867d == null) {
                f51867d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f51867d.invoke(null, Long.valueOf(f51864a), strB, Integer.valueOf(i10));
        } catch (Exception e10) {
            a("asyncTraceEnd", e10);
        }
    }

    public static void endSection() {
        b.endSection();
    }

    public static void forceEnableAppTracing() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (f51869f) {
                    return;
                }
                f51869f = true;
                Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Exception e10) {
                a("setAppTracingAllowed", e10);
            }
        }
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.isEnabled();
        }
        try {
            if (f51865b == null) {
                f51864a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f51865b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f51865b.invoke(null, Long.valueOf(f51864a))).booleanValue();
        } catch (Exception e10) {
            a("isTagEnabled", e10);
            return false;
        }
    }

    public static void setCounter(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.setCounter(b(str), i10);
            return;
        }
        String strB = b(str);
        try {
            if (f51868e == null) {
                f51868e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f51868e.invoke(null, Long.valueOf(f51864a), strB, Integer.valueOf(i10));
        } catch (Exception e10) {
            a("traceCounter", e10);
        }
    }
}
