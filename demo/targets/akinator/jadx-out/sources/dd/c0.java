package dd;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f51989a;

    static {
        f51989a = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    public static boolean isInNativeImage() {
        return f51989a;
    }

    public static boolean isInNativeImageAndIsAtRuntime() {
        return f51989a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean isUnsupportedFeatureError(Throwable th2) {
        if (!isInNativeImageAndIsAtRuntime()) {
            return false;
        }
        if (th2 instanceof InvocationTargetException) {
            th2 = th2.getCause();
        }
        return th2.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    public static boolean needsReflectionConfiguration(Class<?> cls) {
        if (isInNativeImageAndIsAtRuntime()) {
            return (cls.getDeclaredFields().length == 0 || i.isRecordType(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
