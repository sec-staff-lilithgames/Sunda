package nc;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 extends jc.q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final wc.g f75934b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.q f75935c;

    public k0(wc.g gVar, jc.q qVar) {
        this.f75934b = gVar;
        this.f75935c = qVar;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        return this.f75935c.deserializeWithType(uVar, kVar, this.f75934b);
    }

    @Override // jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // jc.q
    public jc.q getDelegatee() {
        return this.f75935c.getDelegatee();
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return this.f75935c.getEmptyValue(kVar);
    }

    @Override // jc.q
    public Collection<Object> getKnownPropertyNames() {
        return this.f75935c.getKnownPropertyNames();
    }

    @Override // jc.q, mc.v
    public Object getNullValue(jc.k kVar) throws jc.r {
        return this.f75935c.getNullValue(kVar);
    }

    @Override // jc.q
    public Class<?> handledType() {
        return this.f75935c.handledType();
    }

    @Override // jc.q
    public cd.h logicalType() {
        return this.f75935c.logicalType();
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return this.f75935c.supportsUpdate(jVar);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return this.f75935c.deserialize(uVar, kVar, obj);
    }
}
