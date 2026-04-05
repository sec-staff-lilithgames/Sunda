package mc;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import nc.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c0 {
    public boolean canCreateFromBigDecimal() {
        return false;
    }

    public boolean canCreateFromBigInteger() {
        return false;
    }

    public boolean canCreateFromBoolean() {
        return false;
    }

    public boolean canCreateFromDouble() {
        return false;
    }

    public boolean canCreateFromInt() {
        return false;
    }

    public boolean canCreateFromLong() {
        return false;
    }

    public boolean canCreateFromObjectWith() {
        return false;
    }

    public boolean canCreateFromString() {
        return false;
    }

    public boolean canCreateUsingArrayDelegate() {
        return false;
    }

    public boolean canCreateUsingDefault() {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public Object createFromBigDecimal(jc.k kVar, BigDecimal bigDecimal) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
    }

    public Object createFromBigInteger(jc.k kVar, BigInteger bigInteger) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
    }

    public Object createFromBoolean(jc.k kVar, boolean z10) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z10));
    }

    public Object createFromDouble(jc.k kVar, double d10) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d10));
    }

    public Object createFromInt(jc.k kVar, int i10) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i10));
    }

    public Object createFromLong(jc.k kVar, long j10) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j10));
    }

    public Object createFromObjectWith(jc.k kVar, Object[] objArr) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no creator with arguments specified", new Object[0]);
    }

    public Object createFromString(jc.k kVar, String str) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, kVar.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public Object createUsingArrayDelegate(jc.k kVar, Object obj) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no array delegate creator specified", new Object[0]);
    }

    public Object createUsingDefault(jc.k kVar) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object createUsingDefaultOrWithoutArguments(jc.k kVar) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "neither default (no-arguments) nor with-arguments Creator found", new Object[0]);
    }

    public Object createUsingDelegate(jc.k kVar, Object obj) throws IOException {
        return kVar.handleMissingInstantiator(getValueClass(), this, null, "no delegate creator specified", new Object[0]);
    }

    public rc.r getArrayDelegateCreator() {
        return null;
    }

    public jc.o getArrayDelegateType(jc.j jVar) {
        return null;
    }

    public rc.r getDefaultCreator() {
        return null;
    }

    public rc.r getDelegateCreator() {
        return null;
    }

    public jc.o getDelegateType(jc.j jVar) {
        return null;
    }

    public z[] getFromObjectArguments(jc.j jVar) {
        return null;
    }

    public Class<?> getValueClass() {
        return Object.class;
    }

    public String getValueTypeDesc() {
        Class<?> valueClass = getValueClass();
        return valueClass == null ? "UNKNOWN" : valueClass.getName();
    }

    public rc.r getWithArgsCreator() {
        return null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c0 implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Class f74157b;

        public a(Class<?> cls) {
            this.f74157b = cls;
        }

        @Override // mc.c0
        public Class<?> getValueClass() {
            return this.f74157b;
        }

        @Override // mc.c0
        public String getValueTypeDesc() {
            return this.f74157b.getName();
        }

        public a(jc.o oVar) {
            this.f74157b = oVar.getRawClass();
        }
    }

    public Object createFromObjectWith(jc.k kVar, z[] zVarArr, h0 h0Var) throws IOException {
        return createFromObjectWith(kVar, h0Var.getParameters(zVarArr));
    }

    public c0 createContextual(jc.k kVar, jc.d dVar) throws jc.r {
        return this;
    }
}
