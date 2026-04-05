package io.odeeo.internal.y1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c<R, T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return w.b(i10, parameterizedType);
        }

        public abstract c<?, ?> get(Type type, Annotation[] annotationArr, s sVar);

        public static Class<?> a(Type type) {
            return w.b(type);
        }
    }

    T adapt(b<R> bVar);

    Type responseType();
}
