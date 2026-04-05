package xw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f {
    <T extends Annotation> T getAnnotation(Class<T> cls);

    Class getType();

    String toString();
}
