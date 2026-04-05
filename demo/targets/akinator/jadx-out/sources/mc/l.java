package mc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import jc.m0;
import jc.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l extends z {

    /* renamed from: q, reason: collision with root package name */
    public final rc.q f74199q;

    /* renamed from: r, reason: collision with root package name */
    public final tb.c f74200r;

    /* renamed from: s, reason: collision with root package name */
    public z f74201s;

    /* renamed from: t, reason: collision with root package name */
    public final int f74202t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f74203u;

    public l(n0 n0Var, jc.o oVar, n0 n0Var2, wc.g gVar, dd.b bVar, rc.q qVar, int i10, tb.c cVar, m0 m0Var) {
        super(n0Var, oVar, n0Var2, gVar, bVar, m0Var);
        this.f74199q = qVar;
        this.f74202t = i10;
        this.f74200r = cVar;
        this.f74201s = null;
    }

    public static l construct(n0 n0Var, jc.o oVar, n0 n0Var2, wc.g gVar, dd.b bVar, rc.q qVar, int i10, tb.c cVar, m0 m0Var) {
        return new l(n0Var, oVar, n0Var2, gVar, bVar, qVar, i10, cVar, m0Var);
    }

    public final void c() throws pc.b {
        if (this.f74201s == null) {
            rc.q qVar = this.f74199q;
            throw pc.b.from((ub.u) null, e3.g.l("No fallback setter/field defined for creator property ", dd.i.name(getName()), " (of ", qVar == null ? "UNKNOWN TYPE" : dd.i.getClassDescription(qVar.getOwner().getDeclaringClass()), ")"), getType());
        }
    }

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        c();
        this.f74201s.set(obj, deserialize(uVar, kVar));
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        c();
        return this.f74201s.setAndReturn(obj, deserialize(uVar, kVar));
    }

    @Deprecated
    public Object findInjectableValue(jc.k kVar, Object obj) throws jc.r {
        tb.c cVar = this.f74200r;
        if (cVar == null) {
            kVar.reportBadDefinition(dd.i.classOf(obj), e3.g.l("Property ", dd.i.name(getName()), " (type ", dd.i.classNameOf(this), ") has no injectable value id configured"));
        }
        return kVar.findInjectableValue(cVar.getId(), this, obj);
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        z zVar = this.f74201s;
        if (zVar != null) {
            zVar.fixAccess(jVar);
        }
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        rc.q qVar = this.f74199q;
        if (qVar == null) {
            return null;
        }
        return (A) qVar.getAnnotation(cls);
    }

    @Override // mc.z
    public int getCreatorIndex() {
        return this.f74202t;
    }

    @Override // mc.z
    public Object getInjectableValueId() {
        tb.c cVar = this.f74200r;
        if (cVar == null) {
            return null;
        }
        return cVar.getId();
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f74199q;
    }

    @Override // rc.h0, jc.g
    public m0 getMetadata() {
        m0 metadata = super.getMetadata();
        z zVar = this.f74201s;
        return zVar != null ? metadata.withMergeInfo(zVar.getMetadata().getMergeInfo()) : metadata;
    }

    @Deprecated
    public void inject(jc.k kVar, Object obj) throws IOException {
        set(obj, findInjectableValue(kVar, obj));
    }

    @Override // mc.z
    public boolean isIgnorable() {
        return this.f74203u;
    }

    @Override // mc.z
    public boolean isInjectionOnly() {
        tb.c cVar = this.f74200r;
        return (cVar == null || cVar.willUseInput(true)) ? false : true;
    }

    @Override // mc.z
    public void markAsIgnorable() {
        this.f74203u = true;
    }

    @Override // mc.z
    public void set(Object obj, Object obj2) throws IOException {
        c();
        this.f74201s.set(obj, obj2);
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        c();
        return this.f74201s.setAndReturn(obj, obj2);
    }

    public void setFallbackSetter(z zVar) {
        this.f74201s = zVar;
    }

    @Override // mc.z
    public String toString() {
        return "[creator property, name " + dd.i.name(getName()) + "; inject id '" + getInjectableValueId() + "']";
    }

    @Override // mc.z
    public z withName(n0 n0Var) {
        return new l(this, n0Var);
    }

    @Override // mc.z
    public z withNullProvider(v vVar) {
        return new l(this, this.f74242i, vVar);
    }

    @Override // mc.z
    public z withValueDeserializer(jc.q qVar) {
        jc.q qVar2 = this.f74242i;
        if (qVar2 == qVar) {
            return this;
        }
        v vVar = this.f74244k;
        if (qVar2 == vVar) {
            vVar = qVar;
        }
        return new l(this, qVar, vVar);
    }

    @Deprecated
    public l(n0 n0Var, jc.o oVar, n0 n0Var2, wc.g gVar, dd.b bVar, rc.q qVar, int i10, Object obj, m0 m0Var) {
        this(n0Var, oVar, n0Var2, gVar, bVar, qVar, i10, obj != null ? tb.c.construct(obj, null) : null, m0Var);
    }

    public l(l lVar, n0 n0Var) {
        super(lVar, n0Var);
        this.f74199q = lVar.f74199q;
        this.f74200r = lVar.f74200r;
        this.f74201s = lVar.f74201s;
        this.f74202t = lVar.f74202t;
        this.f74203u = lVar.f74203u;
    }

    public l(l lVar, jc.q qVar, v vVar) {
        super(lVar, qVar, vVar);
        this.f74199q = lVar.f74199q;
        this.f74200r = lVar.f74200r;
        this.f74201s = lVar.f74201s;
        this.f74202t = lVar.f74202t;
        this.f74203u = lVar.f74203u;
    }
}
