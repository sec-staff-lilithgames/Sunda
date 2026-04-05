package jc;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface g extends dd.b0 {
    public static final tb.t M8 = new tb.t();

    static {
        tb.d0.empty();
    }

    void depositSchemaProperty(uc.m mVar, u0 u0Var) throws r;

    List<n0> findAliases(lc.z zVar);

    @Deprecated
    tb.t findFormatOverrides(c cVar);

    tb.t findPropertyFormat(lc.z zVar, Class<?> cls);

    tb.d0 findPropertyInclusion(lc.z zVar, Class<?> cls);

    <A extends Annotation> A getAnnotation(Class<A> cls);

    <A extends Annotation> A getContextAnnotation(Class<A> cls);

    n0 getFullName();

    rc.l getMember();

    m0 getMetadata();

    @Override // dd.b0
    String getName();

    o getType();

    n0 getWrapperName();

    boolean isRequired();

    boolean isVirtual();
}
