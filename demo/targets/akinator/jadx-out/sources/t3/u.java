package t3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.messaging.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f86295a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f86296b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f86297c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f86298d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f86299e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f86295a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f86296b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f86297c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f86298d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f86299e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void beginAsyncSection(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            b0.b(str, i10);
            return;
        }
        try {
            f86297c.invoke(null, Long.valueOf(f86295a), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endAsyncSection(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            b0.f(str, i10);
            return;
        }
        try {
            f86298d.invoke(null, Long.valueOf(f86295a), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b0.p();
        }
        try {
            return ((Boolean) f86296b.invoke(null, Long.valueOf(f86295a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void setCounter(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            b0.x(i10, str);
            return;
        }
        try {
            f86299e.invoke(null, Long.valueOf(f86295a), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke traceCounter() via reflection.");
        }
    }
}
