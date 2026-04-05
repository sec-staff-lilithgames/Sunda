package c5;

import androidx.lifecycle.g3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11807a = new e();

    public final <T extends g3> T createViewModel(Class<T> modelClass) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(a.b.i(modelClass, "Cannot create an instance of "));
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                e0.checkNotNull(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(a.b.i(modelClass, "Cannot create an instance of "), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(a.b.i(modelClass, "Cannot create an instance of "), e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(a.b.i(modelClass, "Cannot create an instance of "), e12);
        }
    }
}
