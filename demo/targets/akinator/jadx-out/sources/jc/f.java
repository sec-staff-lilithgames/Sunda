package jc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f implements g, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f69272b;

    /* renamed from: c, reason: collision with root package name */
    public final o f69273c;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f69274e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f69275f;

    /* renamed from: g, reason: collision with root package name */
    public final rc.l f69276g;

    public f(n0 n0Var, o oVar, n0 n0Var2, rc.l lVar, m0 m0Var) {
        this.f69272b = n0Var;
        this.f69273c = oVar;
        this.f69274e = n0Var2;
        this.f69275f = m0Var;
        this.f69276g = lVar;
    }

    @Override // jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) {
        throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
    }

    @Override // jc.g
    public List<n0> findAliases(lc.z zVar) {
        return Collections.EMPTY_LIST;
    }

    @Override // jc.g
    @Deprecated
    public tb.t findFormatOverrides(c cVar) {
        tb.t tVarFindFormat;
        rc.l lVar = this.f69276g;
        return (lVar == null || cVar == null || (tVarFindFormat = cVar.findFormat(lVar)) == null) ? g.M8 : tVarFindFormat;
    }

    @Override // jc.g
    public tb.t findPropertyFormat(lc.z zVar, Class<?> cls) {
        rc.l lVar;
        tb.t tVarFindFormat;
        tb.t defaultPropertyFormat = zVar.getDefaultPropertyFormat(cls);
        c annotationIntrospector = zVar.getAnnotationIntrospector();
        return (annotationIntrospector == null || (lVar = this.f69276g) == null || (tVarFindFormat = annotationIntrospector.findFormat(lVar)) == null) ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(tVarFindFormat);
    }

    @Override // jc.g
    public tb.d0 findPropertyInclusion(lc.z zVar, Class<?> cls) {
        rc.l lVar;
        tb.d0 d0VarFindPropertyInclusion;
        tb.d0 defaultInclusion = zVar.getDefaultInclusion(cls, this.f69273c.getRawClass());
        c annotationIntrospector = zVar.getAnnotationIntrospector();
        return (annotationIntrospector == null || (lVar = this.f69276g) == null || (d0VarFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(lVar)) == null) ? defaultInclusion : defaultInclusion.withOverrides(d0VarFindPropertyInclusion);
    }

    @Override // jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        rc.l lVar = this.f69276g;
        if (lVar == null) {
            return null;
        }
        return (A) lVar.getAnnotation(cls);
    }

    @Override // jc.g
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return null;
    }

    @Override // jc.g
    public n0 getFullName() {
        return this.f69272b;
    }

    @Override // jc.g
    public rc.l getMember() {
        return this.f69276g;
    }

    @Override // jc.g
    public m0 getMetadata() {
        return this.f69275f;
    }

    @Override // jc.g, dd.b0
    public String getName() {
        return this.f69272b.getSimpleName();
    }

    @Override // jc.g
    public o getType() {
        return this.f69273c;
    }

    @Override // jc.g
    public n0 getWrapperName() {
        return this.f69274e;
    }

    @Override // jc.g
    public boolean isRequired() {
        return this.f69275f.isRequired();
    }

    @Override // jc.g
    public boolean isVirtual() {
        return false;
    }

    public f withType(o oVar) {
        return new f(this, oVar);
    }

    @Deprecated
    public f(n0 n0Var, o oVar, n0 n0Var2, dd.b bVar, rc.l lVar, m0 m0Var) {
        this(n0Var, oVar, n0Var2, lVar, m0Var);
    }

    public f(f fVar, o oVar) {
        this(fVar.f69272b, oVar, fVar.f69274e, fVar.f69276g, fVar.f69275f);
    }
}
