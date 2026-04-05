package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 extends s0 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f78935f;

    /* renamed from: g, reason: collision with root package name */
    public final mc.c0 f78936g;

    /* renamed from: h, reason: collision with root package name */
    public final wc.g f78937h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.q f78938i;

    public p0(jc.o oVar, mc.c0 c0Var, wc.g gVar, jc.q qVar) {
        super(oVar);
        this.f78936g = c0Var;
        this.f78935f = oVar;
        this.f78938i = qVar;
        this.f78937h = gVar;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.q qVar = this.f78938i;
        jc.q qVarQ = s0.Q(kVar, gVar, qVar);
        jc.o oVar = this.f78935f;
        jc.q qVarFindContextualValueDeserializer = qVarQ == null ? kVar.findContextualValueDeserializer(oVar.getReferencedType(), gVar) : kVar.handleSecondaryContextualization(qVarQ, gVar, oVar.getReferencedType());
        wc.g gVar2 = this.f78937h;
        wc.g gVarForProperty = gVar2 != null ? gVar2.forProperty(gVar) : gVar2;
        return (qVarFindContextualValueDeserializer == qVar && gVarForProperty == gVar2) ? this : withResolved(gVarForProperty, qVarFindContextualValueDeserializer);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        mc.c0 c0Var = this.f78936g;
        if (c0Var != null) {
            return deserialize(uVar, kVar, c0Var.createUsingDefault(kVar));
        }
        jc.q qVar = this.f78938i;
        wc.g gVar = this.f78937h;
        return referenceValue(gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar));
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        if (uVar.hasToken(ub.z.VALUE_NULL)) {
            return getNullValue(kVar);
        }
        wc.g gVar2 = this.f78937h;
        return gVar2 == null ? deserialize(uVar, kVar) : referenceValue(gVar2.deserializeTypedFromAny(uVar, kVar));
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return getNullValue(kVar);
    }

    @Override // jc.q, mc.v
    public dd.a getNullAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // jc.q, mc.v
    public abstract Object getNullValue(jc.k kVar) throws jc.r;

    public abstract Object getReferenced(Object obj);

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78936g;
    }

    @Override // oc.s0
    public jc.o getValueType() {
        return this.f78935f;
    }

    @Override // jc.q
    public cd.h logicalType() {
        jc.q qVar = this.f78938i;
        return qVar != null ? qVar.logicalType() : super.logicalType();
    }

    public abstract Object referenceValue(Object obj);

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        jc.q qVar = this.f78938i;
        if (qVar == null) {
            return null;
        }
        return qVar.supportsUpdate(jVar);
    }

    public abstract Object updateReference(Object obj, Object obj2);

    public abstract p0 withResolved(wc.g gVar, jc.q qVar);

    @Deprecated
    public p0(jc.o oVar, wc.g gVar, jc.q qVar) {
        this(oVar, null, gVar, qVar);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Object objDeserializeWithType;
        Object objDeserializeWithType2;
        jc.j config = kVar.getConfig();
        jc.q qVar = this.f78938i;
        boolean zEquals = qVar.supportsUpdate(config).equals(Boolean.FALSE);
        wc.g gVar = this.f78937h;
        if (!zEquals && gVar == null) {
            Object referenced = getReferenced(obj);
            if (referenced == null) {
                if (gVar == null) {
                    objDeserializeWithType2 = qVar.deserialize(uVar, kVar);
                } else {
                    objDeserializeWithType2 = qVar.deserializeWithType(uVar, kVar, gVar);
                }
                return referenceValue(objDeserializeWithType2);
            }
            objDeserializeWithType = qVar.deserialize(uVar, kVar, referenced);
        } else if (gVar == null) {
            objDeserializeWithType = qVar.deserialize(uVar, kVar);
        } else {
            objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
        }
        return updateReference(obj, objDeserializeWithType);
    }
}
