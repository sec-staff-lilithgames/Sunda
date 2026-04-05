package nc;

import java.io.IOException;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends mc.z {

    /* renamed from: q, reason: collision with root package name */
    public final w f75975q;

    public y(w wVar, jc.m0 m0Var) {
        super(wVar.f75967c, wVar.getIdType(), m0Var, wVar.getDeserializer());
        this.f75975q = wVar;
    }

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        deserializeSetAndReturn(uVar, kVar, obj);
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        if (uVar.hasToken(ub.z.VALUE_NULL)) {
            return null;
        }
        Object objDeserialize = this.f74242i.deserialize(uVar, kVar);
        w wVar = this.f75975q;
        kVar.findObjectId(objDeserialize, wVar.f75968e, wVar.f75969f).bindItem(obj);
        mc.z zVar = wVar.f75971h;
        return zVar != null ? zVar.setAndReturn(obj, objDeserialize) : obj;
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return null;
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return null;
    }

    @Override // mc.z
    public void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        mc.z zVar = this.f75975q.f75971h;
        if (zVar != null) {
            return zVar.setAndReturn(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    @Override // mc.z
    public mc.z withName(jc.n0 n0Var) {
        return new y(this, n0Var);
    }

    @Override // mc.z
    public mc.z withNullProvider(mc.v vVar) {
        return new y(this, this.f74242i, vVar);
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
        return new y(this, qVar, vVar);
    }

    public y(y yVar, jc.q qVar, mc.v vVar) {
        super(yVar, qVar, vVar);
        this.f75975q = yVar.f75975q;
    }

    public y(y yVar, jc.n0 n0Var) {
        super(yVar, n0Var);
        this.f75975q = yVar.f75975q;
    }
}
