package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface t0 {
    uw.c getAccess();

    Annotation[] getAnnotations();

    Constructor[] getConstructors();

    List<u1> getFields();

    List<p2> getMethods();

    String getName();

    uw.k getNamespace();

    uw.l getNamespaceList();

    uw.m getOrder();

    uw.c getOverride();

    uw.o getRoot();

    Class getSuper();

    Class getType();

    boolean isInstantiable();

    boolean isPrimitive();

    boolean isRequired();

    boolean isStrict();
}
