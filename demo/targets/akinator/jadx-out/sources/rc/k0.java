package rc;

import java.io.Serializable;
import rc.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k0 extends a.AbstractC0776a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final String f84215b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84216c;

    /* renamed from: e, reason: collision with root package name */
    public final String f84217e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84218f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f84219g;

    public k0() {
        this("set", "with", "get", "is", null);
    }

    @Override // rc.a.AbstractC0776a
    public a forBuilder(lc.z zVar, e eVar, jc.d dVar) {
        jc.c annotationIntrospector = zVar.isAnnotationProcessingEnabled() ? zVar.getAnnotationIntrospector() : null;
        kc.h hVarFindPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(eVar) : null;
        return new m0(zVar, hVarFindPOJOBuilderConfig == null ? this.f84216c : hVarFindPOJOBuilderConfig.f70788b, this.f84217e, this.f84218f, this.f84219g);
    }

    @Override // rc.a.AbstractC0776a
    public a forPOJO(lc.z zVar, e eVar) {
        return new m0(zVar, this.f84215b, this.f84217e, this.f84218f, this.f84219g);
    }

    @Override // rc.a.AbstractC0776a
    public a forRecord(lc.z zVar, e eVar) {
        return new l0(zVar, eVar);
    }

    public k0 withBaseNameValidator(i0 i0Var) {
        return new k0(this.f84215b, this.f84216c, this.f84217e, this.f84218f, i0Var);
    }

    public k0 withBuilderPrefix(String str) {
        return new k0(this.f84215b, str, this.f84217e, this.f84218f, this.f84219g);
    }

    public k0 withFirstCharAcceptance(boolean z10, boolean z11) {
        return withBaseNameValidator(j0.forFirstNameRule(z10, z11));
    }

    public k0 withGetterPrefix(String str) {
        return new k0(this.f84215b, this.f84216c, str, this.f84218f, this.f84219g);
    }

    public k0 withIsGetterPrefix(String str) {
        return new k0(this.f84215b, this.f84216c, this.f84217e, str, this.f84219g);
    }

    public k0 withSetterPrefix(String str) {
        return new k0(str, this.f84216c, this.f84217e, this.f84218f, this.f84219g);
    }

    public k0(String str, String str2, String str3, String str4, i0 i0Var) {
        this.f84215b = str;
        this.f84216c = str2;
        this.f84217e = str3;
        this.f84218f = str4;
        this.f84219g = i0Var;
    }
}
