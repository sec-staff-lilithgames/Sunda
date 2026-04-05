package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n1 extends s0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f78916g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public static final n1 f78917h = new n1();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78918f;

    public n1() {
        this(false);
    }

    public static n1 instance(boolean z10) {
        return z10 ? new n1(true) : f78917h;
    }

    public final Object V(ub.u uVar, jc.k kVar, int i10) {
        switch (i10) {
            case 6:
                return uVar.getText();
            case 7:
                return kVar.isEnabled(jc.l.USE_BIG_INTEGER_FOR_INTS) ? uVar.getBigIntegerValue() : uVar.getNumberValue();
            case 8:
                return W(uVar, kVar);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return uVar.getEmbeddedObject();
            default:
                return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
        }
    }

    public final Number W(ub.u uVar, jc.k kVar) throws IOException {
        ub.t numberTypeFP = uVar.getNumberTypeFP();
        return numberTypeFP == ub.t.f88358e ? uVar.getDecimalValue() : (uVar.isNaN() || !kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == ub.t.f88356b ? Float.valueOf(uVar.getFloatValue()) : Double.valueOf(uVar.getDoubleValue()) : uVar.getDecimalValue();
    }

    public final Object X(ub.u uVar, jc.k kVar, m1 m1Var) throws IOException {
        Object text;
        Object text2;
        boolean zHasSomeOfFeatures = kVar.hasSomeOfFeatures(s0.f78944e);
        boolean zIsEnabled = kVar.isEnabled(jc.l.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        m1 m1VarFinishBranchObject = m1Var;
        while (true) {
            if (m1VarFinishBranchObject.isObject()) {
                String strNextFieldName = uVar.nextFieldName();
                while (true) {
                    if (strNextFieldName != null) {
                        ub.z zVarNextToken = uVar.nextToken();
                        if (zVarNextToken == null) {
                            zVarNextToken = ub.z.NOT_AVAILABLE;
                        }
                        int iId = zVarNextToken.id();
                        if (iId == 1) {
                            m1VarFinishBranchObject = m1VarFinishBranchObject.childObject(strNextFieldName);
                        } else if (iId != 3) {
                            switch (iId) {
                                case 6:
                                    text = uVar.getText();
                                    break;
                                case 7:
                                    if (!zHasSomeOfFeatures) {
                                        text = uVar.getNumberValue();
                                        break;
                                    } else {
                                        text = s0.l(uVar, kVar);
                                        break;
                                    }
                                case 8:
                                    text = W(uVar, kVar);
                                    break;
                                case 9:
                                    text = Boolean.TRUE;
                                    break;
                                case 10:
                                    text = Boolean.FALSE;
                                    break;
                                case 11:
                                    text = null;
                                    break;
                                case 12:
                                    text = uVar.getEmbeddedObject();
                                    break;
                                default:
                                    return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                            }
                            m1VarFinishBranchObject.putValue(strNextFieldName, text);
                        } else {
                            m1VarFinishBranchObject = m1VarFinishBranchObject.childArray(strNextFieldName);
                        }
                        strNextFieldName = uVar.nextFieldName();
                    } else {
                        if (m1VarFinishBranchObject == m1Var) {
                            return m1VarFinishBranchObject.finishRootObject();
                        }
                        m1VarFinishBranchObject = m1VarFinishBranchObject.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    ub.z zVarNextToken2 = uVar.nextToken();
                    if (zVarNextToken2 == null) {
                        zVarNextToken2 = ub.z.NOT_AVAILABLE;
                    }
                    switch (zVarNextToken2.id()) {
                        case 1:
                            m1VarFinishBranchObject = m1VarFinishBranchObject.childObject();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                        case 3:
                            m1VarFinishBranchObject = m1VarFinishBranchObject.childArray();
                            continue;
                        case 4:
                            if (m1VarFinishBranchObject == m1Var) {
                                return m1VarFinishBranchObject.finishRootArray(zIsEnabled);
                            }
                            m1VarFinishBranchObject = m1VarFinishBranchObject.finishBranchArray(zIsEnabled);
                            continue;
                        case 6:
                            text2 = uVar.getText();
                            break;
                        case 7:
                            if (!zHasSomeOfFeatures) {
                                text2 = uVar.getNumberValue();
                                break;
                            } else {
                                text2 = s0.l(uVar, kVar);
                                break;
                            }
                        case 8:
                            text2 = W(uVar, kVar);
                            break;
                        case 9:
                            text2 = Boolean.TRUE;
                            break;
                        case 10:
                            text2 = Boolean.FALSE;
                            break;
                        case 11:
                            text2 = null;
                            break;
                        case 12:
                            text2 = uVar.getEmbeddedObject();
                            break;
                    }
                    m1VarFinishBranchObject.addValue(text2);
                }
            }
        }
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        Object objX;
        switch (uVar.currentTokenId()) {
            case 1:
                return X(uVar, kVar, m1.rootObjectScope(kVar.isEnabled(ub.d0.DUPLICATE_PROPERTIES)));
            case 2:
                return m1.emptyMap();
            case 3:
                return X(uVar, kVar, m1.rootArrayScope());
            case 4:
            default:
                return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
            case 5:
                m1 m1VarRootObjectScope = m1.rootObjectScope(kVar.isEnabled(ub.d0.DUPLICATE_PROPERTIES));
                String strCurrentName = uVar.currentName();
                while (strCurrentName != null) {
                    ub.z zVarNextToken = uVar.nextToken();
                    if (zVarNextToken == null) {
                        zVarNextToken = ub.z.NOT_AVAILABLE;
                    }
                    int iId = zVarNextToken.id();
                    if (iId == 1) {
                        objX = X(uVar, kVar, m1VarRootObjectScope.childObject());
                    } else {
                        if (iId == 2) {
                            return m1VarRootObjectScope.finishRootObject();
                        }
                        objX = iId != 3 ? V(uVar, kVar, zVarNextToken.id()) : X(uVar, kVar, m1VarRootObjectScope.childArray());
                    }
                    m1VarRootObjectScope.putValue(strCurrentName, objX);
                    strCurrentName = uVar.nextFieldName();
                }
                return m1VarRootObjectScope.finishRootObject();
            case 6:
                return uVar.getText();
            case 7:
                return kVar.hasSomeOfFeatures(s0.f78944e) ? s0.l(uVar, kVar) : uVar.getNumberValue();
            case 8:
                return W(uVar, kVar);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return uVar.getEmbeddedObject();
        }
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        int iCurrentTokenId = uVar.currentTokenId();
        return (iCurrentTokenId == 1 || iCurrentTokenId == 3 || iCurrentTokenId == 5) ? gVar.deserializeTypedFromAny(uVar, kVar) : V(uVar, kVar, uVar.currentTokenId());
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12143g;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        if (this.f78918f) {
            return Boolean.FALSE;
        }
        return null;
    }

    public n1(boolean z10) {
        super(Object.class);
        this.f78918f = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r5.nextToken() == ub.z.END_OBJECT) goto L28;
     */
    @Override // jc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(ub.u r5, jc.k r6, java.lang.Object r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4.f78918f
            if (r0 == 0) goto L9
            java.lang.Object r5 = r4.deserialize(r5, r6)
            return r5
        L9:
            int r0 = r5.currentTokenId()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            ub.z r0 = r5.nextToken()
            ub.z r1 = ub.z.END_ARRAY
            if (r0 != r1) goto L26
            goto L45
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.deserialize(r5, r6)
            r0.add(r1)
            ub.z r1 = r5.nextToken()
            ub.z r2 = ub.z.END_ARRAY
            if (r1 != r2) goto L2d
            return r7
        L3d:
            ub.z r0 = r5.nextToken()
            ub.z r1 = ub.z.END_OBJECT
            if (r0 != r1) goto L46
        L45:
            return r7
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.currentName()
        L51:
            r5.nextToken()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.deserialize(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.deserialize(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.nextFieldName()
            if (r1 != 0) goto L51
            return r7
        L6f:
            java.lang.Object r5 = r4.deserialize(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.n1.deserialize(ub.u, jc.k, java.lang.Object):java.lang.Object");
    }
}
