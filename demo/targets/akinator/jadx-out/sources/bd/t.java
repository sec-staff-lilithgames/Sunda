package bd;

import java.io.IOException;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t extends zc.p {

    /* renamed from: k, reason: collision with root package name */
    public static final jc.e f9118k = new jc.e();

    /* renamed from: e, reason: collision with root package name */
    public final wc.j f9119e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.g f9120f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9121g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9122h;

    /* renamed from: i, reason: collision with root package name */
    public jc.w f9123i;

    /* renamed from: j, reason: collision with root package name */
    public jc.w f9124j;

    public t(wc.j jVar, jc.g gVar) {
        super(gVar == null ? jc.m0.f69373l : gVar.getMetadata());
        this.f9119e = jVar;
        this.f9120f = gVar == null ? f9118k : gVar;
    }

    @Override // zc.p, rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, jc.u0 u0Var) throws jc.r {
        this.f9120f.depositSchemaProperty(mVar, u0Var);
    }

    @Override // zc.p, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f9120f.getAnnotation(cls);
    }

    @Override // zc.p, rc.h0, jc.g
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this.f9120f.getContextAnnotation(cls);
    }

    @Override // zc.p, rc.h0, jc.g
    public jc.n0 getFullName() {
        return new jc.n0(getName());
    }

    @Override // zc.p, rc.h0, jc.g
    public rc.l getMember() {
        return this.f9120f.getMember();
    }

    @Override // zc.p, rc.h0, jc.g, dd.b0
    public String getName() {
        Object obj = this.f9121g;
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    @Override // zc.p, rc.h0, jc.g
    public jc.o getType() {
        return this.f9120f.getType();
    }

    public Object getValue() {
        return this.f9122h;
    }

    @Override // zc.p, rc.h0, jc.g
    public jc.n0 getWrapperName() {
        return this.f9120f.getWrapperName();
    }

    public void reset(Object obj, Object obj2, jc.w wVar, jc.w wVar2) {
        this.f9121g = obj;
        this.f9122h = obj2;
        this.f9123i = wVar;
        this.f9124j = wVar2;
    }

    @Override // zc.p
    public void serializeAsElement(Object obj, ub.o oVar, jc.u0 u0Var) throws Exception {
        wc.j jVar = this.f9119e;
        if (jVar == null) {
            this.f9124j.serialize(this.f9122h, oVar, u0Var);
        } else {
            this.f9124j.serializeWithType(this.f9122h, oVar, u0Var, jVar);
        }
    }

    @Override // zc.p
    public void serializeAsField(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        this.f9123i.serialize(this.f9121g, oVar, u0Var);
        wc.j jVar = this.f9119e;
        if (jVar == null) {
            this.f9124j.serialize(this.f9122h, oVar, u0Var);
        } else {
            this.f9124j.serializeWithType(this.f9122h, oVar, u0Var, jVar);
        }
    }

    @Override // zc.p
    public void serializeAsOmittedField(Object obj, ub.o oVar, jc.u0 u0Var) throws Exception {
        if (oVar.canOmitFields()) {
            return;
        }
        oVar.writeOmittedField(getName());
    }

    @Override // zc.p
    public void serializeAsPlaceholder(Object obj, ub.o oVar, jc.u0 u0Var) throws Exception {
        oVar.writeNull();
    }

    public void setValue(Object obj) {
        this.f9122h = obj;
    }

    @Override // zc.p
    @Deprecated
    public void depositSchemaProperty(yc.v vVar, jc.u0 u0Var) throws jc.r {
    }

    @Deprecated
    public void reset(Object obj, jc.w wVar, jc.w wVar2) {
        reset(obj, this.f9122h, wVar, wVar2);
    }
}
