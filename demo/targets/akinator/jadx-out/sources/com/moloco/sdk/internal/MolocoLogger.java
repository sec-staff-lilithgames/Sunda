package com.moloco.sdk.internal;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.x0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoLogger {
    private static final String MOLOCO_TAG = "Moloco";
    public static final MolocoLogger INSTANCE = new MolocoLogger();
    private static d configuration = new b(new a());
    private static final LinkedHashSet<LoggerListener> listeners = new LinkedHashSet<>();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface LoggerListener {
        void onLog(String str, String str2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f45825a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.MolocoLogger$a$a, reason: collision with other inner class name */
        public static final class C0363a {
            public /* synthetic */ C0363a(kotlin.jvm.internal.u uVar) {
                this();
            }

            public C0363a() {
            }
        }

        static {
            new C0363a(null);
        }

        public a() {
            yu.b.thread$default(false, false, null, null, 0, new a1.e(this, 4), 31, null);
        }

        @Override // com.moloco.sdk.internal.c
        public boolean a() {
            return this.f45825a;
        }

        public final boolean b() {
            return Boolean.parseBoolean(a("debug.moloco.internal_logging"));
        }

        @Override // com.moloco.sdk.internal.c
        public void a(boolean z10) {
            this.f45825a = z10;
        }

        public static final x0 a(a aVar) {
            aVar.a(aVar.b());
            return x0.f87415a;
        }

        public final String a(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                e0.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) objInvoke;
                try {
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    return str2;
                } catch (Exception unused) {
                    return str2;
                }
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final c f45826a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f45827b;

        public b(c adb) {
            e0.checkNotNullParameter(adb, "adb");
            this.f45826a = adb;
        }

        @Override // com.moloco.sdk.internal.d
        public boolean a() {
            return this.f45826a.a();
        }

        @Override // com.moloco.sdk.internal.d
        public boolean b() {
            return this.f45827b;
        }

        @Override // com.moloco.sdk.internal.d
        public boolean c() {
            return false;
        }

        @Override // com.moloco.sdk.internal.d
        public void a(boolean z10) {
            this.f45827b = z10;
        }
    }

    private MolocoLogger() {
    }

    public static final void addListener(LoggerListener loggerListener) {
        e0.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.add(loggerListener);
    }

    public static /* synthetic */ void debug$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debug(str, str2, z10);
    }

    public static /* synthetic */ void debugBuildLog$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debugBuildLog(str, str2, z10);
    }

    public static /* synthetic */ void error$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.error(str, str2, th2, z10);
    }

    private final StackTraceElement findMostRelevantStackTrace(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!e0.areEqual(stackTraceElement.getClassName(), INSTANCE.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) k0.first(stackTraceElementArr);
    }

    private final void fireListeners(String str, String str2) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((LoggerListener) it.next()).onLog(INSTANCE.prefixWithMolocoName(str), str2);
        }
    }

    public static final boolean getLogEnabled() {
        d dVar = configuration;
        return dVar.c() || dVar.a() || dVar.b();
    }

    public static /* synthetic */ void getLogEnabled$annotations() {
    }

    public static /* synthetic */ void info$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.info(str, str2, th2, z10);
    }

    private final String prefixWithMethodName(String str) {
        try {
            return C3191e4.i.f36529d + getCallingMethodName() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    private final String prefixWithMolocoName(String str) {
        return sv.k0.startsWith$default(str, MOLOCO_TAG, false, 2, null) ? str : a.b.k(MOLOCO_TAG, str);
    }

    public static final void removeListener(LoggerListener loggerListener) {
        e0.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.remove(loggerListener);
    }

    public static final void setLogEnabled(boolean z10) {
        configuration.a(z10);
    }

    public static /* synthetic */ void tlog$default(MolocoLogger molocoLogger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        molocoLogger.tlog(str, th2);
    }

    public static /* synthetic */ void warn$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.warn(str, str2, th2, z10);
    }

    public final void debug(String tag, String msg, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.d(strPrefixWithMolocoName, strPrefixWithMethodName);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void error(String tag, String msg, Throwable th2, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.e(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final String getCallingMethodName() throws ClassNotFoundException, SecurityException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        e0.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementFindMostRelevantStackTrace = findMostRelevantStackTrace(stackTrace);
        String className = stackTraceElementFindMostRelevantStackTrace.getClassName();
        stackTraceElementFindMostRelevantStackTrace.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementFindMostRelevantStackTrace.getMethodName();
        if (e0.areEqual(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementFindMostRelevantStackTrace.getClassName();
            e0.checkNotNullExpressionValue(className2, "getClassName(...)");
            methodName = n0.substringAfterLast$default(n0.removeSuffix(className2, (CharSequence) "$1"), "$", (String) null, 2, (Object) null);
        }
        e0.checkNotNullExpressionValue(methodName, "let(...)");
        return methodName;
    }

    public final void info(String tag, String msg, Throwable th2, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.i(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void setConfiguration$moloco_sdk_release(d configuration2) {
        e0.checkNotNullParameter(configuration2, "configuration");
        configuration = configuration2;
    }

    public final void tlog(String msg, Throwable th2) {
        e0.checkNotNullParameter(msg, "msg");
        Log.i("==tlog==", prefixWithMethodName(msg), th2);
    }

    public final void warn(String tag, String msg, Throwable th2, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.w(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void debugBuildLog(String str, String msg, boolean z10) {
        e0.checkNotNullParameter(str, KerkSviMAy.hDgZXApzrZnSmw);
        e0.checkNotNullParameter(msg, "msg");
    }
}
