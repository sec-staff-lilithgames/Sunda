package zr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f98480a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98481b;

    /* renamed from: c, reason: collision with root package name */
    public final Class[] f98482c;

    public i(Class<?> cls, String str, Class... clsArr) {
        this.f98480a = cls;
        this.f98481b = str;
        this.f98482c = clsArr;
    }

    public static Method b(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
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

    public final Method a(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        String str = this.f98481b;
        if (str == null) {
            return null;
        }
        Method methodB = b(cls, str, this.f98482c);
        if (methodB == null || (cls2 = this.f98480a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    public Object invoke(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException, InvocationTargetException {
        Method methodA = a(obj.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f98481b + " not supported for object " + obj);
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    public Object invokeOptional(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException, InvocationTargetException {
        Method methodA = a(obj.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(Object obj, Object... objArr) {
        try {
            return invokeOptional(obj, objArr);
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

    public Object invokeWithoutCheckedException(Object obj, Object... objArr) {
        try {
            return invoke(obj, objArr);
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

    public boolean isSupported(Object obj) {
        return a(obj.getClass()) != null;
    }
}
