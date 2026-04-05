package kotlin.jvm.internal;

import j1.o2;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e0 {
    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = e0.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbB = b3.h.b("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbB.append(str);
        return sbB.toString();
    }

    public static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(String str, Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(o2.l(str, " must not be null"));
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a.b.m("Field specified as non-null is null: ", str, ".", str2));
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            ClassNotFoundException classNotFoundException = new ClassNotFoundException(a.b.l("Class ", strReplace, " is not found. Please update the Kotlin runtime to the latest version"), e10);
            b(e0.class.getName(), classNotFoundException);
            throw classNotFoundException;
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(o2.l(str, " must not be null"));
        b(e0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a(str));
        b(e0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a(str));
        b(e0.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a.b.m("Method specified as non-null returned null: ", str, ".", str2));
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static int compare(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i10, String str) {
        throwUndefinedForReified();
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert() {
        AssertionError assertionError = new AssertionError();
        b(e0.class.getName(), assertionError);
        throw assertionError;
    }

    public static void throwIllegalArgument() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        b(e0.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void throwIllegalState() {
        IllegalStateException illegalStateException = new IllegalStateException();
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void throwJavaNpe() {
        NullPointerException nullPointerException = new NullPointerException();
        b(e0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void throwNpe() {
        tu.l lVar = new tu.l();
        b(e0.class.getName(), lVar);
        throw lVar;
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUninitializedProperty(String str) {
        tu.w0 w0Var = new tu.w0(str);
        b(e0.class.getName(), w0Var);
        throw w0Var;
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    public static boolean areEqual(Double d10, Double d11) {
        return d10 == null ? d11 == null : d11 != null && d10.doubleValue() == d11.doubleValue();
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static int compare(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i10, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static boolean areEqual(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean areEqual(double d10, Double d11) {
        return d11 != null && d10 == d11.doubleValue();
    }

    public static void throwAssert(String str) {
        AssertionError assertionError = new AssertionError(str);
        b(e0.class.getName(), assertionError);
        throw assertionError;
    }

    public static void throwIllegalArgument(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        b(e0.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void throwIllegalState(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void throwJavaNpe(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        b(e0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void throwNpe(String str) {
        tu.l lVar = new tu.l(str);
        b(e0.class.getName(), lVar);
        throw lVar;
    }

    public static boolean areEqual(Float f10, Float f11) {
        return f10 == null ? f11 == null : f11 != null && f10.floatValue() == f11.floatValue();
    }

    public static boolean areEqual(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean areEqual(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str);
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str);
        b(e0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            ClassNotFoundException classNotFoundException = new ClassNotFoundException(a.b.m("Class ", strReplace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e10);
            b(e0.class.getName(), classNotFoundException);
            throw classNotFoundException;
        }
    }
}
