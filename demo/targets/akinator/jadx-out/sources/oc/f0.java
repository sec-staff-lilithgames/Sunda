package oc;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f0 extends j implements mc.k {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f78855j;

    /* renamed from: k, reason: collision with root package name */
    public final Class f78856k;

    /* renamed from: l, reason: collision with root package name */
    public final jc.q f78857l;

    /* renamed from: m, reason: collision with root package name */
    public final wc.g f78858m;

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f78859n;

    public f0(jc.o oVar, jc.q qVar, wc.g gVar) {
        super(oVar, (mc.v) null, (Boolean) null);
        cd.a aVar = (cd.a) oVar;
        Class<?> rawClass = aVar.getContentType().getRawClass();
        this.f78856k = rawClass;
        this.f78855j = rawClass == Object.class;
        this.f78857l = qVar;
        this.f78858m = gVar;
        this.f78859n = aVar.getEmptyArray();
    }

    public final Object W(ub.u uVar, jc.k kVar) throws IOException {
        Object objDeserialize;
        lc.c cVarFindCoercionFromBlankString;
        Boolean bool = Boolean.TRUE;
        Class cls = this.f78856k;
        Boolean bool2 = this.f78876i;
        if (bool2 != bool && (bool2 != null || !kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!uVar.hasToken(ub.z.VALUE_STRING)) {
                return kVar.handleUnexpectedToken(this.f78873f, uVar);
            }
            if (cls != Byte.class) {
                return p(uVar, kVar);
            }
            byte[] binaryValue = uVar.getBinaryValue(kVar.getBase64Variant());
            Byte[] bArr = new Byte[binaryValue.length];
            int length = binaryValue.length;
            for (int i10 = 0; i10 < length; i10++) {
                bArr[i10] = Byte.valueOf(binaryValue[i10]);
            }
            return bArr;
        }
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        boolean z10 = this.f78875h;
        if (zHasToken) {
            if (!z10) {
                objDeserialize = null;
            }
            return this.f78859n;
        }
        if (uVar.hasToken(ub.z.VALUE_STRING)) {
            String text = uVar.getText();
            boolean zIsEmpty = text.isEmpty();
            lc.c cVar = lc.c.f73085b;
            if (zIsEmpty) {
                lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73109h);
                if (cVarFindCoercionAction != cVar) {
                    return (Object[]) o(kVar, cVarFindCoercionAction, handledType());
                }
            } else if (s0.r(text) && (cVarFindCoercionFromBlankString = kVar.findCoercionFromBlankString(logicalType(), handledType(), cVar)) != cVar) {
                return (Object[]) o(kVar, cVarFindCoercionFromBlankString, handledType());
            }
        }
        jc.q qVar = this.f78857l;
        wc.g gVar = this.f78858m;
        objDeserialize = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
        if (objDeserialize != null || (objDeserialize = this.f78874g.getNullValue(kVar)) != null || !z10) {
            Object[] objArr = this.f78855j ? new Object[1] : (Object[]) Array.newInstance((Class<?>) cls, 1);
            objArr[0] = objDeserialize;
            return objArr;
        }
        return this.f78859n;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.o oVar = this.f78873f;
        Boolean boolR = s0.R(kVar, gVar, oVar.getRawClass(), tb.q.f86754b);
        jc.q qVarQ = s0.Q(kVar, gVar, this.f78857l);
        jc.o contentType = oVar.getContentType();
        jc.q qVarFindContextualValueDeserializer = qVarQ == null ? kVar.findContextualValueDeserializer(contentType, gVar) : kVar.handleSecondaryContextualization(qVarQ, gVar, contentType);
        wc.g gVarForProperty = this.f78858m;
        if (gVarForProperty != null) {
            gVarForProperty = gVarForProperty.forProperty(gVar);
        }
        return withResolved(gVarForProperty, qVarFindContextualValueDeserializer, s0.P(kVar, gVar, qVarFindContextualValueDeserializer), boolR);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        Object objDeserialize;
        if (!uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar);
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart();
        int i10 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    break;
                }
                ub.z zVar = ub.z.VALUE_NULL;
                boolean z10 = this.f78875h;
                if (zVarNextToken != zVar) {
                    jc.q qVar = this.f78857l;
                    wc.g gVar = this.f78858m;
                    objDeserialize = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
                } else if (z10) {
                    continue;
                } else {
                    objDeserialize = null;
                }
                if (objDeserialize != null || (objDeserialize = this.f78874g.getNullValue(kVar)) != null || !z10) {
                    if (i10 >= objArrResetAndStart.length) {
                        objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                        i10 = 0;
                    }
                    int i11 = i10 + 1;
                    try {
                        objArrResetAndStart[i10] = objDeserialize;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw jc.r.wrapWithPath(e, objArrResetAndStart, d0VarLeaseObjectBuffer.bufferedSize() + i10);
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        Object[] objArrCompleteAndClearBuffer = this.f78855j ? d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i10) : d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i10, this.f78856k);
        kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return (Object[]) gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78857l;
    }

    @Override // oc.j, jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51982c;
    }

    @Override // oc.j, jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return this.f78859n;
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78857l == null && this.f78858m == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12139b;
    }

    public f0 withDeserializer(wc.g gVar, jc.q qVar) {
        return withResolved(gVar, qVar, this.f78874g, this.f78876i);
    }

    public f0 withResolved(wc.g gVar, jc.q qVar, mc.v vVar, Boolean bool) {
        return (Objects.equals(bool, this.f78876i) && vVar == this.f78874g && qVar == this.f78857l && gVar == this.f78858m) ? this : new f0(this, qVar, gVar, vVar, bool);
    }

    public f0(f0 f0Var, jc.q qVar, wc.g gVar, mc.v vVar, Boolean bool) {
        super(f0Var, vVar, bool);
        this.f78856k = f0Var.f78856k;
        this.f78855j = f0Var.f78855j;
        this.f78859n = f0Var.f78859n;
        this.f78857l = qVar;
        this.f78858m = gVar;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Object[] objArrCompleteAndClearBuffer;
        Object objDeserializeWithType;
        Object[] objArr = (Object[]) obj;
        if (!uVar.isExpectedStartArrayToken()) {
            Object[] objArr2 = (Object[]) W(uVar, kVar);
            if (objArr2 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr2.length + length);
            System.arraycopy(objArr2, 0, objArrCopyOf, length, objArr2.length);
            return objArrCopyOf;
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart(objArr, length2);
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    break;
                }
                ub.z zVar = ub.z.VALUE_NULL;
                boolean z10 = this.f78875h;
                if (zVarNextToken != zVar) {
                    jc.q qVar = this.f78857l;
                    wc.g gVar = this.f78858m;
                    if (gVar == null) {
                        objDeserializeWithType = qVar.deserialize(uVar, kVar);
                    } else {
                        objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
                    }
                } else if (z10) {
                    continue;
                } else {
                    objDeserializeWithType = null;
                }
                if (objDeserializeWithType != null || (objDeserializeWithType = this.f78874g.getNullValue(kVar)) != null || !z10) {
                    if (length2 >= objArrResetAndStart.length) {
                        objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                        length2 = 0;
                    }
                    int i10 = length2 + 1;
                    try {
                        objArrResetAndStart[length2] = objDeserializeWithType;
                        length2 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        length2 = i10;
                        throw jc.r.wrapWithPath(e, objArrResetAndStart, d0VarLeaseObjectBuffer.bufferedSize() + length2);
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (this.f78855j) {
            objArrCompleteAndClearBuffer = d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2);
        } else {
            objArrCompleteAndClearBuffer = d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2, this.f78856k);
        }
        kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }
}
