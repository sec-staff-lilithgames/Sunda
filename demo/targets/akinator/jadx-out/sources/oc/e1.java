package oc;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 extends s0 implements mc.k {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f78843j = new String[0];

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f78844k = new e1();

    /* renamed from: f, reason: collision with root package name */
    public final jc.q f78845f;

    /* renamed from: g, reason: collision with root package name */
    public final mc.v f78846g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f78847h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78848i;

    public e1() {
        this(null, null, null);
    }

    public final String[] V(ub.u uVar, jc.k kVar, String[] strArr) throws jc.r {
        int length;
        Object[] objArrResetAndStart;
        String str;
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        if (strArr == null) {
            objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart();
            length = 0;
        } else {
            length = strArr.length;
            objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart(strArr, length);
        }
        while (true) {
            try {
                String strNextTextValue = uVar.nextTextValue();
                boolean z10 = this.f78848i;
                jc.q qVar = this.f78845f;
                if (strNextTextValue == null) {
                    ub.z zVarCurrentToken = uVar.currentToken();
                    if (zVarCurrentToken == ub.z.END_ARRAY) {
                        String[] strArr2 = (String[]) d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length, String.class);
                        kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
                        return strArr2;
                    }
                    if (zVarCurrentToken != ub.z.VALUE_NULL) {
                        str = (String) qVar.deserialize(uVar, kVar);
                    } else if (!z10) {
                        str = null;
                    }
                } else {
                    str = (String) qVar.deserialize(uVar, kVar);
                }
                if (str != null || (str = (String) this.f78846g.getNullValue(kVar)) != null || !z10) {
                    if (length >= objArrResetAndStart.length) {
                        objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                        length = 0;
                    }
                    int i10 = length + 1;
                    try {
                        objArrResetAndStart[length] = str;
                        length = i10;
                    } catch (Exception e10) {
                        e = e10;
                        length = i10;
                        throw jc.r.wrapWithPath(e, String.class, length);
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    public final String[] W(ub.u uVar, jc.k kVar) throws IOException {
        String strK;
        lc.c cVarFindCoercionFromBlankString;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f78847h;
        if (bool2 != bool && (bool2 != null || !kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return uVar.hasToken(ub.z.VALUE_STRING) ? (String[]) p(uVar, kVar) : (String[]) kVar.handleUnexpectedToken(this.f78945b, uVar);
        }
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        mc.v vVar = this.f78846g;
        if (zHasToken) {
            strK = (String) vVar.getNullValue(kVar);
        } else {
            if (uVar.hasToken(ub.z.VALUE_STRING)) {
                String text = uVar.getText();
                boolean zIsEmpty = text.isEmpty();
                lc.c cVar = lc.c.f73085b;
                if (zIsEmpty) {
                    lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73109h);
                    if (cVarFindCoercionAction != cVar) {
                        return (String[]) o(kVar, cVarFindCoercionAction, handledType());
                    }
                } else if (s0.r(text) && (cVarFindCoercionFromBlankString = kVar.findCoercionFromBlankString(logicalType(), handledType(), cVar)) != cVar) {
                    return (String[]) o(kVar, cVarFindCoercionFromBlankString, handledType());
                }
            }
            strK = K(uVar, kVar, vVar);
        }
        return new String[]{strK};
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.q qVar = this.f78845f;
        jc.q qVarQ = s0.Q(kVar, gVar, qVar);
        jc.o oVarConstructType = kVar.constructType(String.class);
        jc.q qVarFindContextualValueDeserializer = qVarQ == null ? kVar.findContextualValueDeserializer(oVarConstructType, gVar) : kVar.handleSecondaryContextualization(qVarQ, gVar, oVarConstructType);
        tb.t tVarS = s0.S(kVar, gVar, String[].class);
        Boolean feature = tVarS != null ? tVarS.getFeature(tb.q.f86754b) : null;
        mc.v vVarP = s0.P(kVar, gVar, qVarFindContextualValueDeserializer);
        if (qVarFindContextualValueDeserializer != null && dd.i.isJacksonStdImpl(qVarFindContextualValueDeserializer)) {
            qVarFindContextualValueDeserializer = null;
        }
        return (qVar == qVarFindContextualValueDeserializer && Objects.equals(this.f78847h, feature) && this.f78846g == vVarP) ? this : new e1(qVarFindContextualValueDeserializer, vVarP, feature);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51982c;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return f78843j;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12139b;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    public e1(jc.q qVar, mc.v vVar, Boolean bool) {
        super(String[].class);
        this.f78845f = qVar;
        this.f78846g = vVar;
        this.f78847h = bool;
        this.f78848i = nc.u.isSkipper(vVar);
    }

    @Override // jc.q
    public String[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar);
        }
        if (this.f78845f != null) {
            return V(uVar, kVar, null);
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                String strNextTextValue = uVar.nextTextValue();
                try {
                    if (strNextTextValue == null) {
                        ub.z zVarCurrentToken = uVar.currentToken();
                        if (zVarCurrentToken == ub.z.END_ARRAY) {
                            String[] strArr = (String[]) d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i11, String.class);
                            kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
                            return strArr;
                        }
                        ub.z zVar = ub.z.VALUE_NULL;
                        mc.v vVar = this.f78846g;
                        boolean z10 = this.f78848i;
                        if (zVarCurrentToken != zVar) {
                            strNextTextValue = K(uVar, kVar, vVar);
                        } else if (z10) {
                            continue;
                        }
                        if (strNextTextValue != null || (strNextTextValue = (String) vVar.getNullValue(kVar)) != null || !z10) {
                        }
                    }
                    objArrResetAndStart[i11] = strNextTextValue;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, objArrResetAndStart, d0VarLeaseObjectBuffer.bufferedSize() + i11);
                }
                if (i11 >= objArrResetAndStart.length) {
                    objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    i11 = 0;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    @Override // jc.q
    public String[] deserialize(ub.u uVar, jc.k kVar, String[] strArr) throws IOException {
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            String[] strArrW = W(uVar, kVar);
            if (strArrW == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrW.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrW, 0, strArr2, length, strArrW.length);
            return strArr2;
        }
        if (this.f78845f != null) {
            return V(uVar, kVar, strArr);
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart(strArr, length2);
        while (true) {
            try {
                String strNextTextValue = uVar.nextTextValue();
                try {
                    if (strNextTextValue == null) {
                        ub.z zVarCurrentToken = uVar.currentToken();
                        if (zVarCurrentToken == ub.z.END_ARRAY) {
                            String[] strArr3 = (String[]) d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2, String.class);
                            kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
                            return strArr3;
                        }
                        ub.z zVar = ub.z.VALUE_NULL;
                        mc.v vVar = this.f78846g;
                        boolean z10 = this.f78848i;
                        if (zVarCurrentToken != zVar) {
                            strNextTextValue = K(uVar, kVar, vVar);
                        } else if (z10) {
                            return f78843j;
                        }
                        if (strNextTextValue != null || (strNextTextValue = (String) vVar.getNullValue(kVar)) != null || !z10) {
                        }
                    }
                    objArrResetAndStart[length2] = strNextTextValue;
                    length2 = i10;
                } catch (Exception e10) {
                    e = e10;
                    length2 = i10;
                    throw jc.r.wrapWithPath(e, objArrResetAndStart, d0VarLeaseObjectBuffer.bufferedSize() + length2);
                }
                if (length2 >= objArrResetAndStart.length) {
                    objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    length2 = 0;
                }
                i10 = length2 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
