package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface s2 {
    Annotation getAnnotation();

    <T extends Annotation> T getAnnotation(Class<T> cls);

    Class getDeclaringClass();

    Class getDependent();

    Class[] getDependents();

    Method getMethod();

    w2 getMethodType();

    String getName();

    Class getType();

    String toString();
}
