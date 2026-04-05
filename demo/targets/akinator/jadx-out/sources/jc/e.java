package jc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e implements g {
    @Override // jc.g
    public List<n0> findAliases(lc.z zVar) {
        return Collections.EMPTY_LIST;
    }

    @Override // jc.g
    @Deprecated
    public tb.t findFormatOverrides(c cVar) {
        return tb.t.empty();
    }

    @Override // jc.g
    public tb.t findPropertyFormat(lc.z zVar, Class<?> cls) {
        return tb.t.empty();
    }

    @Override // jc.g
    public tb.d0 findPropertyInclusion(lc.z zVar, Class<?> cls) {
        return null;
    }

    @Override // jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return null;
    }

    @Override // jc.g
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return null;
    }

    @Override // jc.g
    public n0 getFullName() {
        return n0.f69382g;
    }

    @Override // jc.g
    public rc.l getMember() {
        return null;
    }

    @Override // jc.g
    public m0 getMetadata() {
        return m0.f69373l;
    }

    @Override // jc.g, dd.b0
    public String getName() {
        return "";
    }

    @Override // jc.g
    public o getType() {
        return cd.s.unknownType();
    }

    @Override // jc.g
    public n0 getWrapperName() {
        return null;
    }

    @Override // jc.g
    public boolean isRequired() {
        return false;
    }

    @Override // jc.g
    public boolean isVirtual() {
        return false;
    }

    @Override // jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws r {
    }
}
