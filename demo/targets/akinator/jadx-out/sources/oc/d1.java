package oc;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d1 extends mc.c0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final String f78821b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f78822c;

    /* renamed from: e, reason: collision with root package name */
    public rc.r f78823e;

    /* renamed from: f, reason: collision with root package name */
    public rc.r f78824f;

    /* renamed from: g, reason: collision with root package name */
    public mc.z[] f78825g;

    /* renamed from: h, reason: collision with root package name */
    public jc.o f78826h;

    /* renamed from: i, reason: collision with root package name */
    public rc.r f78827i;

    /* renamed from: j, reason: collision with root package name */
    public mc.z[] f78828j;

    /* renamed from: k, reason: collision with root package name */
    public jc.o f78829k;

    /* renamed from: l, reason: collision with root package name */
    public rc.r f78830l;

    /* renamed from: m, reason: collision with root package name */
    public mc.z[] f78831m;

    /* renamed from: n, reason: collision with root package name */
    public rc.r f78832n;

    /* renamed from: o, reason: collision with root package name */
    public rc.r f78833o;

    /* renamed from: p, reason: collision with root package name */
    public rc.r f78834p;

    /* renamed from: q, reason: collision with root package name */
    public rc.r f78835q;

    /* renamed from: r, reason: collision with root package name */
    public rc.r f78836r;

    /* renamed from: s, reason: collision with root package name */
    public rc.r f78837s;

    /* renamed from: t, reason: collision with root package name */
    public rc.r f78838t;

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class, java.lang.Class<?>] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1(jc.j r1, java.lang.Class r2) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.String r1 = dd.i.nameOf(r2)
            r0.f78821b = r1
            if (r2 != 0) goto Ld
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
        Ld:
            r0.f78822c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.d1.<init>(jc.j, java.lang.Class):void");
    }

    public final Object a(rc.r rVar, mc.z[] zVarArr, jc.k kVar, Object obj) throws jc.r {
        if (rVar == null) {
            throw new IllegalStateException("No delegate constructor for " + getValueTypeDesc());
        }
        try {
            if (zVarArr == null) {
                return rVar.call1(obj);
            }
            int length = zVarArr.length;
            Object[] objArr = new Object[length];
            for (int i10 = 0; i10 < length; i10++) {
                mc.z zVar = zVarArr[i10];
                if (zVar == null) {
                    objArr[i10] = obj;
                } else {
                    objArr[i10] = kVar.findInjectableValue(zVar.getInjectableValueId(), zVar, null);
                }
            }
            return rVar.call(objArr);
        } catch (Exception e10) {
            throw b(e10, kVar);
        }
    }

    public final jc.r b(Exception exc, jc.k kVar) {
        Throwable cause;
        if ((exc instanceof InvocationTargetException) && (cause = exc.getCause()) != null) {
            exc = cause;
        }
        return exc instanceof jc.r ? (jc.r) exc : kVar.instantiationException(getValueClass(), exc);
    }

    @Override // mc.c0
    public boolean canCreateFromBigDecimal() {
        return this.f78837s != null;
    }

    @Override // mc.c0
    public boolean canCreateFromBigInteger() {
        return this.f78835q != null;
    }

    @Override // mc.c0
    public boolean canCreateFromBoolean() {
        return this.f78838t != null;
    }

    @Override // mc.c0
    public boolean canCreateFromDouble() {
        return this.f78836r != null;
    }

    @Override // mc.c0
    public boolean canCreateFromInt() {
        return this.f78833o != null;
    }

    @Override // mc.c0
    public boolean canCreateFromLong() {
        return this.f78834p != null;
    }

    @Override // mc.c0
    public boolean canCreateFromObjectWith() {
        return this.f78824f != null;
    }

    @Override // mc.c0
    public boolean canCreateFromString() {
        return this.f78832n != null;
    }

    @Override // mc.c0
    public boolean canCreateUsingArrayDelegate() {
        return this.f78829k != null;
    }

    @Override // mc.c0
    public boolean canCreateUsingDefault() {
        return this.f78823e != null;
    }

    @Override // mc.c0
    public boolean canCreateUsingDelegate() {
        return this.f78826h != null;
    }

    @Override // mc.c0
    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public void configureFromArraySettings(rc.r rVar, jc.o oVar, mc.z[] zVarArr) {
        this.f78830l = rVar;
        this.f78829k = oVar;
        this.f78831m = zVarArr;
    }

    public void configureFromBigDecimalCreator(rc.r rVar) {
        this.f78837s = rVar;
    }

    public void configureFromBigIntegerCreator(rc.r rVar) {
        this.f78835q = rVar;
    }

    public void configureFromBooleanCreator(rc.r rVar) {
        this.f78838t = rVar;
    }

    public void configureFromDoubleCreator(rc.r rVar) {
        this.f78836r = rVar;
    }

    public void configureFromIntCreator(rc.r rVar) {
        this.f78833o = rVar;
    }

    public void configureFromLongCreator(rc.r rVar) {
        this.f78834p = rVar;
    }

    public void configureFromObjectSettings(rc.r rVar, rc.r rVar2, jc.o oVar, mc.z[] zVarArr, rc.r rVar3, mc.z[] zVarArr2) {
        this.f78823e = rVar;
        this.f78827i = rVar2;
        this.f78826h = oVar;
        this.f78828j = zVarArr;
        this.f78824f = rVar3;
        this.f78825g = zVarArr2;
    }

    public void configureFromStringCreator(rc.r rVar) {
        this.f78832n = rVar;
    }

    @Override // mc.c0
    public Object createFromBigDecimal(jc.k kVar, BigDecimal bigDecimal) throws IOException {
        rc.r rVar = this.f78837s;
        if (rVar != null) {
            try {
                return rVar.call1(bigDecimal);
            } catch (Exception e10) {
                return kVar.handleInstantiationProblem(this.f78837s.getDeclaringClass(), bigDecimal, b(e10, kVar));
            }
        }
        if (this.f78836r != null) {
            double dDoubleValue = bigDecimal.doubleValue();
            Double dValueOf = Double.isInfinite(dDoubleValue) ? null : Double.valueOf(dDoubleValue);
            if (dValueOf != null) {
                try {
                    return this.f78836r.call1(dValueOf);
                } catch (Exception e11) {
                    return kVar.handleInstantiationProblem(this.f78836r.getDeclaringClass(), dValueOf, b(e11, kVar));
                }
            }
        }
        return super.createFromBigDecimal(kVar, bigDecimal);
    }

    @Override // mc.c0
    public Object createFromBigInteger(jc.k kVar, BigInteger bigInteger) throws IOException {
        rc.r rVar = this.f78835q;
        if (rVar == null) {
            return super.createFromBigInteger(kVar, bigInteger);
        }
        try {
            return rVar.call1(bigInteger);
        } catch (Exception e10) {
            return kVar.handleInstantiationProblem(this.f78835q.getDeclaringClass(), bigInteger, b(e10, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromBoolean(jc.k kVar, boolean z10) throws IOException {
        if (this.f78838t == null) {
            return super.createFromBoolean(kVar, z10);
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            return this.f78838t.call1(boolValueOf);
        } catch (Exception e10) {
            return kVar.handleInstantiationProblem(this.f78838t.getDeclaringClass(), boolValueOf, b(e10, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromDouble(jc.k kVar, double d10) throws IOException {
        if (this.f78836r != null) {
            Double dValueOf = Double.valueOf(d10);
            try {
                return this.f78836r.call1(dValueOf);
            } catch (Exception e10) {
                return kVar.handleInstantiationProblem(this.f78836r.getDeclaringClass(), dValueOf, b(e10, kVar));
            }
        }
        if (this.f78837s == null) {
            return super.createFromDouble(kVar, d10);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10);
        try {
            return this.f78837s.call1(bigDecimalValueOf);
        } catch (Exception e11) {
            return kVar.handleInstantiationProblem(this.f78837s.getDeclaringClass(), bigDecimalValueOf, b(e11, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromInt(jc.k kVar, int i10) throws IOException {
        if (this.f78833o != null) {
            Integer numValueOf = Integer.valueOf(i10);
            try {
                return this.f78833o.call1(numValueOf);
            } catch (Exception e10) {
                return kVar.handleInstantiationProblem(this.f78833o.getDeclaringClass(), numValueOf, b(e10, kVar));
            }
        }
        if (this.f78834p != null) {
            Long lValueOf = Long.valueOf(i10);
            try {
                return this.f78834p.call1(lValueOf);
            } catch (Exception e11) {
                return kVar.handleInstantiationProblem(this.f78834p.getDeclaringClass(), lValueOf, b(e11, kVar));
            }
        }
        if (this.f78835q != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
            try {
                return this.f78835q.call1(bigIntegerValueOf);
            } catch (Exception e12) {
                return kVar.handleInstantiationProblem(this.f78835q.getDeclaringClass(), bigIntegerValueOf, b(e12, kVar));
            }
        }
        if (this.f78836r == null) {
            return super.createFromInt(kVar, i10);
        }
        Double dValueOf = Double.valueOf(i10);
        try {
            return this.f78836r.call1(dValueOf);
        } catch (Exception e13) {
            return kVar.handleInstantiationProblem(this.f78836r.getDeclaringClass(), dValueOf, b(e13, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromLong(jc.k kVar, long j10) throws IOException {
        if (this.f78834p != null) {
            Long lValueOf = Long.valueOf(j10);
            try {
                return this.f78834p.call1(lValueOf);
            } catch (Exception e10) {
                return kVar.handleInstantiationProblem(this.f78834p.getDeclaringClass(), lValueOf, b(e10, kVar));
            }
        }
        if (this.f78835q != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
            try {
                return this.f78835q.call1(bigIntegerValueOf);
            } catch (Exception e11) {
                return kVar.handleInstantiationProblem(this.f78835q.getDeclaringClass(), bigIntegerValueOf, b(e11, kVar));
            }
        }
        if (this.f78836r == null) {
            return super.createFromLong(kVar, j10);
        }
        Double dValueOf = Double.valueOf(j10);
        try {
            return this.f78836r.call1(dValueOf);
        } catch (Exception e12) {
            return kVar.handleInstantiationProblem(this.f78836r.getDeclaringClass(), dValueOf, b(e12, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromObjectWith(jc.k kVar, Object[] objArr) throws IOException {
        rc.r rVar = this.f78824f;
        if (rVar == null) {
            return super.createFromObjectWith(kVar, objArr);
        }
        try {
            return rVar.call(objArr);
        } catch (Exception e10) {
            return kVar.handleInstantiationProblem(this.f78822c, objArr, b(e10, kVar));
        }
    }

    @Override // mc.c0
    public Object createFromString(jc.k kVar, String str) throws IOException {
        rc.r rVar = this.f78832n;
        if (rVar == null) {
            return super.createFromString(kVar, str);
        }
        try {
            return rVar.call1(str);
        } catch (Exception e10) {
            return kVar.handleInstantiationProblem(this.f78832n.getDeclaringClass(), str, b(e10, kVar));
        }
    }

    @Override // mc.c0
    public Object createUsingArrayDelegate(jc.k kVar, Object obj) throws IOException {
        rc.r rVar = this.f78830l;
        return (rVar != null || this.f78827i == null) ? a(rVar, this.f78831m, kVar, obj) : createUsingDelegate(kVar, obj);
    }

    @Override // mc.c0
    public Object createUsingDefault(jc.k kVar) throws IOException {
        rc.r rVar = this.f78823e;
        if (rVar == null) {
            return super.createUsingDefault(kVar);
        }
        try {
            return rVar.call();
        } catch (Exception e10) {
            return kVar.handleInstantiationProblem(this.f78822c, null, b(e10, kVar));
        }
    }

    @Override // mc.c0
    public Object createUsingDefaultOrWithoutArguments(jc.k kVar) throws IOException {
        return this.f78823e != null ? createUsingDefault(kVar) : this.f78824f != null ? createFromObjectWith(kVar, new Object[this.f78825g.length]) : super.createUsingDefaultOrWithoutArguments(kVar);
    }

    @Override // mc.c0
    public Object createUsingDelegate(jc.k kVar, Object obj) throws IOException {
        rc.r rVar;
        rc.r rVar2 = this.f78827i;
        return (rVar2 != null || (rVar = this.f78830l) == null) ? a(rVar2, this.f78828j, kVar, obj) : a(rVar, this.f78831m, kVar, obj);
    }

    @Override // mc.c0
    public rc.r getArrayDelegateCreator() {
        return this.f78830l;
    }

    @Override // mc.c0
    public jc.o getArrayDelegateType(jc.j jVar) {
        return this.f78829k;
    }

    @Override // mc.c0
    public rc.r getDefaultCreator() {
        return this.f78823e;
    }

    @Override // mc.c0
    public rc.r getDelegateCreator() {
        return this.f78827i;
    }

    @Override // mc.c0
    public jc.o getDelegateType(jc.j jVar) {
        return this.f78826h;
    }

    @Override // mc.c0
    public mc.z[] getFromObjectArguments(jc.j jVar) {
        return this.f78825g;
    }

    @Override // mc.c0
    public Class<?> getValueClass() {
        return this.f78822c;
    }

    @Override // mc.c0
    public String getValueTypeDesc() {
        return this.f78821b;
    }

    @Override // mc.c0
    public rc.r getWithArgsCreator() {
        return this.f78824f;
    }

    public d1(jc.j jVar, jc.o oVar) {
        this.f78821b = oVar == null ? "UNKNOWN TYPE" : oVar.toString();
        this.f78822c = oVar == null ? Object.class : oVar.getRawClass();
    }
}
