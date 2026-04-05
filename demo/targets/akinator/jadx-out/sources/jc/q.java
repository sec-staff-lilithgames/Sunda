package jc;

import java.io.IOException;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q implements mc.v {
    public Object a(k kVar) {
        return getNullValue(kVar);
    }

    public abstract Object deserialize(ub.u uVar, k kVar) throws IOException;

    public Object deserialize(ub.u uVar, k kVar, Object obj) throws IOException {
        kVar.handleBadMerge(this);
        return deserialize(uVar, kVar);
    }

    public Object deserializeWithType(ub.u uVar, k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromAny(uVar, kVar);
    }

    public mc.z findBackReference(String str) {
        StringBuilder sbO = e3.g.o("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        sbO.append(getClass().getName());
        sbO.append(" does not support them");
        throw new IllegalArgumentException(sbO.toString());
    }

    @Override // mc.v
    public Object getAbsentValue(k kVar) throws r {
        return getNullValue(kVar);
    }

    public q getDelegatee() {
        return null;
    }

    public dd.a getEmptyAccessPattern() {
        return dd.a.f51983e;
    }

    public Object getEmptyValue(k kVar) throws r {
        return getNullValue(kVar);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    @Override // mc.v
    public dd.a getNullAccessPattern() {
        return dd.a.f51982c;
    }

    @Override // mc.v
    public Object getNullValue(k kVar) throws r {
        return getNullValue();
    }

    public nc.w getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public cd.h logicalType() {
        return null;
    }

    public q replaceDelegatee(q qVar) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(j jVar) {
        return null;
    }

    public Object deserializeWithType(ub.u uVar, k kVar, wc.g gVar, Object obj) throws IOException {
        kVar.handleBadMerge(this);
        return deserializeWithType(uVar, kVar, gVar);
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    @Deprecated
    public Object getNullValue() {
        return null;
    }

    public q unwrappingDeserializer(dd.a0 a0Var) {
        return this;
    }
}
