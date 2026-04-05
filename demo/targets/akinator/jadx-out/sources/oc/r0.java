package oc;

import java.io.IOException;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r0 extends s0 implements mc.k, mc.w {

    /* renamed from: f, reason: collision with root package name */
    public final dd.m f78941f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.o f78942g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.q f78943h;

    public r0(dd.m mVar) {
        super(Object.class);
        this.f78941f = mVar;
        this.f78942g = null;
        this.f78943h = null;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        dd.m mVar = this.f78941f;
        jc.q qVar = this.f78943h;
        if (qVar == null) {
            jc.o inputType = ((nc.o) mVar).getInputType(kVar.getTypeFactory());
            jc.q qVarFindContextualValueDeserializer = kVar.findContextualValueDeserializer(inputType, gVar);
            dd.i.verifyMustOverride(r0.class, this, "withDelegate");
            return new r0(mVar, inputType, qVarFindContextualValueDeserializer);
        }
        jc.o oVar = this.f78942g;
        jc.q qVarHandleSecondaryContextualization = kVar.handleSecondaryContextualization(qVar, gVar, oVar);
        if (qVarHandleSecondaryContextualization == qVar) {
            return this;
        }
        dd.i.verifyMustOverride(r0.class, this, "withDelegate");
        return new r0(mVar, oVar, qVarHandleSecondaryContextualization);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        Object objDeserialize = this.f78943h.deserialize(uVar, kVar);
        if (objDeserialize == null) {
            return null;
        }
        return ((nc.o) this.f78941f).convert(kVar, objDeserialize);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        Object objDeserialize = this.f78943h.deserialize(uVar, kVar);
        if (objDeserialize == null) {
            return null;
        }
        return ((nc.o) this.f78941f).convert(kVar, objDeserialize);
    }

    @Override // jc.q, mc.v
    public Object getAbsentValue(jc.k kVar) throws jc.r {
        Object absentValue = this.f78943h.getAbsentValue(kVar);
        if (absentValue == null) {
            return null;
        }
        return ((nc.o) this.f78941f).convert(absentValue);
    }

    @Override // jc.q
    public jc.q getDelegatee() {
        return this.f78943h;
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return this.f78943h.getEmptyAccessPattern();
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        Object emptyValue = this.f78943h.getEmptyValue(kVar);
        if (emptyValue == null) {
            return null;
        }
        return ((nc.o) this.f78941f).convert(emptyValue);
    }

    @Override // jc.q
    public Collection<Object> getKnownPropertyNames() {
        return this.f78943h.getKnownPropertyNames();
    }

    @Override // jc.q, mc.v
    public dd.a getNullAccessPattern() {
        return this.f78943h.getNullAccessPattern();
    }

    @Override // jc.q, mc.v
    public Object getNullValue(jc.k kVar) throws jc.r {
        Object nullValue = this.f78943h.getNullValue(kVar);
        if (nullValue == null) {
            return null;
        }
        return ((nc.o) this.f78941f).convert(nullValue);
    }

    @Override // oc.s0, jc.q
    public Class<?> handledType() {
        return this.f78943h.handledType();
    }

    @Override // jc.q
    public boolean isCachable() {
        jc.q qVar = this.f78943h;
        return qVar != null && qVar.isCachable();
    }

    @Override // jc.q
    public cd.h logicalType() {
        return this.f78943h.logicalType();
    }

    @Override // jc.q
    public jc.q replaceDelegatee(jc.q qVar) {
        dd.i.verifyMustOverride(r0.class, this, "replaceDelegatee");
        return qVar == this.f78943h ? this : new r0(this.f78941f, this.f78942g, qVar);
    }

    @Override // mc.w
    public void resolve(jc.k kVar) throws jc.r {
        Object obj = this.f78943h;
        if (obj == null || !(obj instanceof mc.w)) {
            return;
        }
        ((mc.w) obj).resolve(kVar);
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return this.f78943h.supportsUpdate(jVar);
    }

    @Override // jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        dd.i.verifyMustOverride(r0.class, this, "unwrappingDeserializer");
        return replaceDelegatee(this.f78943h.unwrappingDeserializer(a0Var));
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        jc.o oVar = this.f78942g;
        if (oVar.getRawClass().isAssignableFrom(obj.getClass())) {
            return this.f78943h.deserialize(uVar, kVar, obj);
        }
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)", obj.getClass().getName(), oVar));
    }

    @Override // jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar, Object obj) throws IOException {
        jc.o oVar = this.f78942g;
        if (oVar.getRawClass().isAssignableFrom(obj.getClass())) {
            return this.f78943h.deserialize(uVar, kVar, obj);
        }
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)", obj.getClass().getName(), oVar));
    }

    public r0(dd.m mVar, jc.o oVar, jc.q qVar) {
        super(oVar);
        this.f78941f = mVar;
        this.f78942g = oVar;
        this.f78943h = qVar;
    }
}
