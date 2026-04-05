package oc;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends p0 {
    public e(jc.o oVar, mc.c0 c0Var, wc.g gVar, jc.q qVar) {
        super(oVar, c0Var, gVar, qVar);
    }

    @Override // jc.q, mc.v
    public Object getAbsentValue(jc.k kVar) throws jc.r {
        return null;
    }

    @Override // oc.p0, jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return getNullValue(kVar);
    }

    @Override // oc.p0, jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    @Override // oc.p0, jc.q, mc.v
    public AtomicReference<Object> getNullValue(jc.k kVar) throws jc.r {
        return new AtomicReference<>(this.f78938i.getNullValue(kVar));
    }

    @Override // oc.p0
    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // oc.p0
    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    @Override // oc.p0
    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    @Override // oc.p0
    public e withResolved(wc.g gVar, jc.q qVar) {
        return new e(this.f78935f, this.f78936g, gVar, qVar);
    }
}
