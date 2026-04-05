package wr;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t2 {
    public static <T> Iterable<T> getCandidatesViaHardCoded(Class<T> cls, Iterable<Class<?>> iterable) {
        return i6.a(cls, iterable);
    }

    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        return i6.getCandidatesViaServiceLoader(cls, classLoader);
    }

    public static boolean isAndroid(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, s2 s2Var) {
        return (T) i6.load(cls, iterable, classLoader, s2Var);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, s2 s2Var) {
        return i6.loadAll(cls, iterable, classLoader, s2Var);
    }
}
