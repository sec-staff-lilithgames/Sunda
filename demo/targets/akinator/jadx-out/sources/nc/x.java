package nc;

import j1.o2;
import java.io.IOException;
import java.lang.annotation.Annotation;
import nc.i0;
import rc.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class x extends mc.z {

    /* renamed from: q, reason: collision with root package name */
    public final mc.z f75972q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends i0.a {

        /* renamed from: c, reason: collision with root package name */
        public final x f75973c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f75974d;

        public a(x xVar, mc.a0 a0Var, Class<?> cls, Object obj) {
            super(a0Var, cls);
            this.f75973c = xVar;
            this.f75974d = obj;
        }

        @Override // nc.i0.a
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (!hasId(obj)) {
                throw new IllegalArgumentException(o2.k(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
            }
            this.f75973c.set(this.f75974d, obj2);
        }
    }

    public x(mc.z zVar, t0 t0Var) {
        super(zVar);
        this.f75972q = zVar;
        this.f74246m = t0Var;
    }

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        deserializeSetAndReturn(uVar, kVar, obj);
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(uVar, kVar));
        } catch (mc.a0 e10) {
            if (this.f74246m == null && this.f74242i.getObjectIdReader() == null) {
                throw jc.r.from(uVar, "Unresolved forward reference but no identity info", e10);
            }
            e10.getRoid().appendReferring(new a(this, e10, this.f74239f.getRawClass(), obj));
            return null;
        }
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        mc.z zVar = this.f75972q;
        if (zVar != null) {
            zVar.fixAccess(jVar);
        }
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f75972q.getAnnotation(cls);
    }

    @Override // mc.z
    public int getCreatorIndex() {
        return this.f75972q.getCreatorIndex();
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f75972q.getMember();
    }

    @Override // mc.z
    public void set(Object obj, Object obj2) throws IOException {
        this.f75972q.set(obj, obj2);
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this.f75972q.setAndReturn(obj, obj2);
    }

    @Override // mc.z
    public mc.z withName(jc.n0 n0Var) {
        return new x(this, n0Var);
    }

    @Override // mc.z
    public mc.z withNullProvider(mc.v vVar) {
        return new x(this, this.f74242i, vVar);
    }

    @Override // mc.z
    public mc.z withValueDeserializer(jc.q qVar) {
        jc.q qVar2 = this.f74242i;
        if (qVar2 == qVar) {
            return this;
        }
        mc.v vVar = this.f74244k;
        if (qVar2 == vVar) {
            vVar = qVar;
        }
        return new x(this, qVar, vVar);
    }

    public x(x xVar, jc.q qVar, mc.v vVar) {
        super(xVar, qVar, vVar);
        this.f75972q = xVar.f75972q;
        this.f74246m = xVar.f74246m;
    }

    public x(x xVar, jc.n0 n0Var) {
        super(xVar, n0Var);
        this.f75972q = xVar.f75972q;
        this.f74246m = xVar.f74246m;
    }
}
