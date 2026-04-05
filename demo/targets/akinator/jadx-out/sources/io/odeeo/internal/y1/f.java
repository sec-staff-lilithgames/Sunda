package io.odeeo.internal.y1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f<F, T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return w.b(i10, parameterizedType);
        }

        public f<?, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, s sVar) {
            return null;
        }

        public f<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, s sVar) {
            return null;
        }

        public f<?, String> stringConverter(Type type, Annotation[] annotationArr, s sVar) {
            return null;
        }

        public static Class<?> a(Type type) {
            return w.b(type);
        }
    }

    T convert(F f10) throws IOException;
}
