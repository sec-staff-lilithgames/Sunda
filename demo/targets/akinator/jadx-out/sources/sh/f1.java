package sh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final we f85805a = we.natural().onResultOf(new in.c(12)).compound(we.natural().onResultOf(new in.c(13))).reverse().onResultOf(new in.c(14));

    public static Exception a(Class cls, Throwable th2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        for (Constructor constructor : f85805a.sortedCopy(Arrays.asList(cls.getConstructors()))) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] objArr = new Object[parameterTypes.length];
            int i10 = 0;
            while (true) {
                objNewInstance = null;
                if (i10 < parameterTypes.length) {
                    Class<?> cls2 = parameterTypes[i10];
                    if (!cls2.equals(String.class)) {
                        if (!cls2.equals(Throwable.class)) {
                            break;
                        }
                        objArr[i10] = th2;
                    } else {
                        objArr[i10] = th2.toString();
                    }
                    i10++;
                } else {
                    try {
                        objNewInstance = constructor.newInstance(objArr);
                        break;
                    } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            Exception exc = (Exception) objNewInstance;
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th2);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th2);
    }
}
