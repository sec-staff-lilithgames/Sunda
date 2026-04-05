package bx;

import com.ironsource.C3191e4;
import dx.h;
import dx.i;
import dx.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f11376a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f11377b = new i();

    /* renamed from: c, reason: collision with root package name */
    public static final dx.e f11378c = new dx.e();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11379d = k.safeGetBooleanSystemProperty("slf4j.detectLoggerNameMismatch");

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f11380e = {"1.6", "1.7"};

    /* renamed from: f, reason: collision with root package name */
    public static final String f11381f = "org/slf4j/impl/StaticLoggerBinder.class";

    public static final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                try {
                    if (c()) {
                        linkedHashSetB = null;
                    } else {
                        linkedHashSetB = b();
                        f(linkedHashSetB);
                    }
                    StaticLoggerBinder.getSingleton();
                    f11376a = 3;
                    e(linkedHashSetB);
                    d();
                } catch (Exception e10) {
                    f11376a = 2;
                    k.report("Failed to instantiate SLF4J LoggerFactory", e10);
                    throw new IllegalStateException("Unexpected initialization failure", e10);
                }
            } catch (NoClassDefFoundError e11) {
                String message = e11.getMessage();
                if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    f11376a = 2;
                    k.report("Failed to instantiate SLF4J LoggerFactory", e11);
                    throw e11;
                }
                f11376a = 4;
                k.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                k.report("Defaulting to no-operation (NOP) logger implementation");
                k.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                d();
            } catch (NoSuchMethodError e12) {
                String message2 = e12.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f11376a = 2;
                    k.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    k.report("Your binding is version 1.5.5 or earlier.");
                    k.report("Upgrade your binding to version 1.6.x.");
                }
                throw e12;
            }
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f11381f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            k.report("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    public static boolean c() {
        String strSafeGetSystemProperty = k.safeGetSystemProperty("java.vendor.url");
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.toLowerCase().contains("android");
    }

    public static void d() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i iVar = f11377b;
        synchronized (iVar) {
            try {
                iVar.postInitialization();
                for (h hVar : iVar.getLoggers()) {
                    hVar.setDelegate(getLogger(hVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue<cx.d> eventQueue = f11377b.getEventQueue();
        int size = eventQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i10 = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cx.d dVar = (cx.d) it.next();
                if (dVar != null) {
                    h logger = dVar.getLogger();
                    String name = logger.getName();
                    if (logger.isDelegateNull()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!logger.isDelegateNOP()) {
                        if (logger.isDelegateEventAware()) {
                            logger.log(dVar);
                        } else {
                            k.report(name);
                        }
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (dVar.getLogger().isDelegateEventAware()) {
                        k.report("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        k.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        k.report("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!dVar.getLogger().isDelegateNOP()) {
                        k.report("The following set of substitute loggers may have been accessed");
                        k.report("during the initialization phase. Logging calls during this");
                        k.report("phase were not honored. However, subsequent logging calls to these");
                        k.report("loggers will work as normally expected.");
                        k.report("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
        f11377b.clear();
    }

    public static void e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        k.report("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + C3191e4.i.f36531e);
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            k.report("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                k.report("Found binding in [" + ((URL) it.next()) + C3191e4.i.f36531e);
            }
            k.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void g() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z10 = false;
            for (String str2 : f11380e) {
                if (str.startsWith(str2)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            k.report("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f11380e).toString());
            k.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            k.report("Unexpected problem occured during version sanity check", th2);
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (f11376a == 0) {
            synchronized (b.class) {
                try {
                    if (f11376a == 0) {
                        f11376a = 1;
                        a();
                        if (f11376a == 3) {
                            g();
                        }
                    }
                } finally {
                }
            }
        }
        int i10 = f11376a;
        if (i10 == 1) {
            return f11377b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i10 == 4) {
            return f11378c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static a getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    public static a getLogger(Class<?> cls) {
        Class<?> callingClass;
        a logger = getLogger(cls.getName());
        if (f11379d && (callingClass = k.getCallingClass()) != null && !callingClass.isAssignableFrom(cls)) {
            k.report("Detected logger name mismatch. Given name: \"" + logger.getName() + "\"; computed name: \"" + callingClass.getName() + "\".");
            k.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }
}
