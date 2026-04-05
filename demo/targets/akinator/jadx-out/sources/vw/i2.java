package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface i2 {
    Annotation getAnnotation();

    i0 getContact();

    n0 getConverter(l0 l0Var) throws Exception;

    q0 getDecorator() throws Exception;

    xw.f getDependent() throws Exception;

    Object getEmpty(l0 l0Var) throws Exception;

    String getEntry() throws Exception;

    o1 getExpression() throws Exception;

    Object getKey() throws Exception;

    i2 getLabel(Class cls) throws Exception;

    String getName() throws Exception;

    String[] getNames() throws Exception;

    String getOverride();

    String getPath() throws Exception;

    String[] getPaths() throws Exception;

    Class getType();

    xw.f getType(Class cls) throws Exception;

    boolean isAttribute();

    boolean isCollection();

    boolean isData();

    boolean isInline();

    boolean isRequired();

    boolean isText();

    boolean isTextList();

    boolean isUnion();

    String toString();
}
