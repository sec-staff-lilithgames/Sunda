package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface i0 extends xw.f {
    Object get(Object obj) throws Exception;

    Annotation getAnnotation();

    @Override // xw.f
    /* synthetic */ Annotation getAnnotation(Class cls);

    Class getDeclaringClass();

    Class getDependent();

    Class[] getDependents();

    String getName();

    @Override // xw.f
    /* synthetic */ Class getType();

    boolean isReadOnly();

    void set(Object obj, Object obj2) throws Exception;

    @Override // xw.f
    String toString();
}
