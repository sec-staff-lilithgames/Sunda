package rc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h0 implements jc.g, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.m0 f84194b;

    /* renamed from: c, reason: collision with root package name */
    public transient List f84195c;

    public h0(jc.m0 m0Var) {
        this.f84194b = m0Var == null ? jc.m0.f69373l : m0Var;
    }

    @Override // jc.g
    public abstract /* synthetic */ void depositSchemaProperty(uc.m mVar, jc.u0 u0Var) throws jc.r;

    @Override // jc.g
    public List<jc.n0> findAliases(lc.z zVar) {
        l member;
        List<jc.n0> listFindPropertyAliases = this.f84195c;
        if (listFindPropertyAliases == null) {
            jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
            if (annotationIntrospector != null && (member = getMember()) != null) {
                listFindPropertyAliases = annotationIntrospector.findPropertyAliases(member);
            }
            if (listFindPropertyAliases == null) {
                listFindPropertyAliases = Collections.EMPTY_LIST;
            }
            this.f84195c = listFindPropertyAliases;
        }
        return listFindPropertyAliases;
    }

    @Override // jc.g
    @Deprecated
    public final tb.t findFormatOverrides(jc.c cVar) {
        l member;
        tb.t tVarFindFormat = (cVar == null || (member = getMember()) == null) ? null : cVar.findFormat(member);
        return tVarFindFormat == null ? jc.g.M8 : tVarFindFormat;
    }

    @Override // jc.g
    public tb.t findPropertyFormat(lc.z zVar, Class<?> cls) {
        l member;
        tb.t defaultPropertyFormat = zVar.getDefaultPropertyFormat(cls);
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        tb.t tVarFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        return defaultPropertyFormat == null ? tVarFindFormat == null ? jc.g.M8 : tVarFindFormat : tVarFindFormat == null ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(tVarFindFormat);
    }

    @Override // jc.g
    public tb.d0 findPropertyInclusion(lc.z zVar, Class<?> cls) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        l member = getMember();
        if (member == null) {
            return zVar.getDefaultPropertyInclusion(cls);
        }
        tb.d0 defaultInclusion = zVar.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        tb.d0 d0VarFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        return defaultInclusion == null ? d0VarFindPropertyInclusion : defaultInclusion.withOverrides(d0VarFindPropertyInclusion);
    }

    @Override // jc.g
    public abstract /* synthetic */ Annotation getAnnotation(Class cls);

    @Override // jc.g
    public abstract /* synthetic */ Annotation getContextAnnotation(Class cls);

    @Override // jc.g
    public abstract /* synthetic */ jc.n0 getFullName();

    @Override // jc.g
    public abstract /* synthetic */ l getMember();

    @Override // jc.g
    public jc.m0 getMetadata() {
        return this.f84194b;
    }

    @Override // jc.g, dd.b0
    public abstract /* synthetic */ String getName();

    @Override // jc.g
    public abstract /* synthetic */ jc.o getType();

    @Override // jc.g
    public abstract /* synthetic */ jc.n0 getWrapperName();

    @Override // jc.g
    public boolean isRequired() {
        return this.f84194b.isRequired();
    }

    @Override // jc.g
    public boolean isVirtual() {
        return false;
    }

    public h0(h0 h0Var) {
        this.f84194b = h0Var.f84194b;
    }
}
