package androidx.lifecycle;

import android.app.Application;
import i2.hQ.aTNDubNmpwAqdU;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6747a = uu.p0.listOf((Object[]) new Class[]{Application.class, m2.class});

    /* renamed from: b, reason: collision with root package name */
    public static final List f6748b = uu.o0.listOf(m2.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(signature, "signature");
        Iterator it = kotlin.jvm.internal.i.iterator(modelClass.getConstructors());
        while (it.hasNext()) {
            Constructor<T> constructor = (Constructor) it.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            List list = uu.k0.toList(parameterTypes);
            if (kotlin.jvm.internal.e0.areEqual(signature, list)) {
                kotlin.jvm.internal.e0.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends g3> T newInstance(Class<T> cls, Constructor<T> constructor, Object... params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cls, aTNDubNmpwAqdU.UtCayoew);
        kotlin.jvm.internal.e0.checkNotNullParameter(constructor, "constructor");
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(a.b.i(cls, "Failed to access "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(a.b.i(cls, "An exception happened in constructor of "), e12.getCause());
        }
    }
}
