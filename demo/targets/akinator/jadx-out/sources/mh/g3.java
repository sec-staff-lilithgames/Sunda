package mh;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f74622a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f74623b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f74624c;

    static {
        Object objInvoke;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            objInvoke = null;
        }
        f74622a = objInvoke;
        if (objInvoke == null) {
            method = null;
        } else {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (Throwable unused2) {
            }
        }
        f74623b = method;
        if (objInvoke != null) {
            try {
                try {
                    method2 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e12) {
                    throw e12;
                } catch (Throwable unused3) {
                    method2 = null;
                }
                if (method2 != null) {
                    method2.invoke(objInvoke, new Throwable());
                    method3 = method2;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
        f74624c = method3;
    }

    public static List<Throwable> getCausalChain(Throwable th2) {
        p1.checkNotNull(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th2);
            if (th2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
        }
    }

    public static <X extends Throwable> X getCauseAs(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(th2);
            throw e10;
        }
    }

    public static Throwable getRootCause(Throwable th2) {
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                return th2;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
            th2 = cause2;
        }
    }

    public static String getStackTraceAsString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        if (!lazyStackTraceIsLazy()) {
            return Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
        }
        p1.checkNotNull(th2);
        return new f3(th2);
    }

    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (f74623b == null || f74624c == null) ? false : true;
    }

    @Deprecated
    public static RuntimeException propagate(Throwable th2) {
        throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            throwIfInstanceOf(th2, cls);
        }
    }

    @Deprecated
    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            throwIfUnchecked(th2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        p1.checkNotNull(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void throwIfUnchecked(Throwable th2) {
        p1.checkNotNull(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2);
    }

    @Deprecated
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable {
        p1.checkNotNull(cls2);
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2, cls2);
    }
}
