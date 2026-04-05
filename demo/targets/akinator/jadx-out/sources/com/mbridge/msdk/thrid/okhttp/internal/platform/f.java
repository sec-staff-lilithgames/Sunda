package com.mbridge.msdk.thrid.okhttp.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f43629a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43630b;

    /* renamed from: c, reason: collision with root package name */
    private final Class[] f43631c;

    public f(Class<?> cls, String str, Class... clsArr) {
        this.f43629a = cls;
        this.f43630b = str;
        this.f43631c = clsArr;
    }

    public boolean a(T t10) {
        return a(t10.getClass()) != null;
    }

    public Object b(T t10, Object... objArr) throws NoSuchMethodException, SecurityException, InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object c(T t10, Object... objArr) {
        try {
            return b(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object d(T t10, Object... objArr) {
        try {
            return a(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object a(T t10, Object... objArr) throws NoSuchMethodException, SecurityException, InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f43630b + " not supported for object " + t10);
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    private Method a(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2;
        String str = this.f43630b;
        if (str == null) {
            return null;
        }
        Method methodA = a(cls, str, this.f43631c);
        if (methodA == null || (cls2 = this.f43629a) == null || cls2.isAssignableFrom(methodA.getReturnType())) {
            return methodA;
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
