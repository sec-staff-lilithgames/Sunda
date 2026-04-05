package oc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l1 extends s0 implements mc.w, mc.k {

    /* renamed from: n, reason: collision with root package name */
    public static final Object[] f78884n = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public jc.q f78885f;

    /* renamed from: g, reason: collision with root package name */
    public jc.q f78886g;

    /* renamed from: h, reason: collision with root package name */
    public jc.q f78887h;

    /* renamed from: i, reason: collision with root package name */
    public jc.q f78888i;

    /* renamed from: j, reason: collision with root package name */
    public final jc.x f78889j;

    /* renamed from: k, reason: collision with root package name */
    public final jc.o f78890k;

    /* renamed from: l, reason: collision with root package name */
    public final jc.o f78891l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f78892m;

    @Deprecated
    public l1() {
        this((jc.o) null, (jc.o) null);
    }

    public final Number V(ub.u uVar, jc.k kVar) throws IOException {
        ub.t numberTypeFP = uVar.getNumberTypeFP();
        return numberTypeFP == ub.t.f88358e ? uVar.getDecimalValue() : (uVar.isNaN() || !kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == ub.t.f88356b ? Float.valueOf(uVar.getFloatValue()) : Double.valueOf(uVar.getDoubleValue()) : uVar.getDecimalValue();
    }

    public final void W(ub.u uVar, jc.k kVar, LinkedHashMap linkedHashMap, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean zIsEnabled = kVar.isEnabled(ub.d0.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                linkedHashMap.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                linkedHashMap.put(str, arrayList);
            }
        }
        while (str2 != null) {
            uVar.nextToken();
            Object objDeserialize = deserialize(uVar, kVar);
            Object objPut = linkedHashMap.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                if (objPut instanceof List) {
                    ((List) objPut).add(objDeserialize);
                    linkedHashMap.put(str, objPut);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(objPut);
                    arrayList2.add(objDeserialize);
                    linkedHashMap.put(str, arrayList2);
                }
            }
            String strNextFieldName = uVar.nextFieldName();
            jc.x xVar = this.f78889j;
            if (xVar != null && strNextFieldName != null) {
                strNextFieldName = (String) xVar.deserializeKey(strNextFieldName, kVar);
            }
            str2 = strNextFieldName;
        }
    }

    public final ArrayList X(ub.u uVar, jc.k kVar) throws IOException {
        ub.z zVarNextToken = uVar.nextToken();
        ub.z zVar = ub.z.END_ARRAY;
        int i10 = 2;
        if (zVarNextToken == zVar) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(uVar, kVar);
        if (uVar.nextToken() == zVar) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(uVar, kVar);
        if (uVar.nextToken() == zVar) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart();
        objArrResetAndStart[0] = objDeserialize;
        objArrResetAndStart[1] = objDeserialize2;
        int i11 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(uVar, kVar);
            i10++;
            if (i11 >= objArrResetAndStart.length) {
                objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                i11 = 0;
            }
            int i12 = i11 + 1;
            objArrResetAndStart[i11] = objDeserialize3;
            if (uVar.nextToken() == ub.z.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i10);
                d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i12, arrayList3);
                kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
                return arrayList3;
            }
            i11 = i12;
        }
    }

    public final Object[] Y(ub.u uVar, jc.k kVar) throws IOException {
        if (uVar.nextToken() == ub.z.END_ARRAY) {
            return f78884n;
        }
        dd.d0 d0VarLeaseObjectBuffer = kVar.leaseObjectBuffer();
        Object[] objArrResetAndStart = d0VarLeaseObjectBuffer.resetAndStart();
        int i10 = 0;
        while (true) {
            Object objDeserialize = deserialize(uVar, kVar);
            if (i10 >= objArrResetAndStart.length) {
                objArrResetAndStart = d0VarLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                i10 = 0;
            }
            int i11 = i10 + 1;
            objArrResetAndStart[i10] = objDeserialize;
            if (uVar.nextToken() == ub.z.END_ARRAY) {
                Object[] objArrCompleteAndClearBuffer = d0VarLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i11);
                kVar.returnObjectBuffer(d0VarLeaseObjectBuffer);
                return objArrCompleteAndClearBuffer;
            }
            i10 = i11;
        }
    }

    public final Object Z(ub.u uVar, jc.k kVar) throws IOException {
        String strCurrentName;
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.START_OBJECT) {
            strCurrentName = uVar.nextFieldName();
        } else if (zVarCurrentToken == ub.z.FIELD_NAME) {
            strCurrentName = uVar.currentName();
        } else {
            if (zVarCurrentToken != ub.z.END_OBJECT) {
                return kVar.handleUnexpectedToken(handledType(), uVar);
            }
            strCurrentName = null;
        }
        if (strCurrentName == null) {
            return new LinkedHashMap(2);
        }
        jc.x xVar = this.f78889j;
        if (xVar != null) {
            strCurrentName = (String) xVar.deserializeKey(strCurrentName, kVar);
        }
        uVar.nextToken();
        Object objDeserialize = deserialize(uVar, kVar);
        String strNextFieldName = uVar.nextFieldName();
        if (strNextFieldName == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(strCurrentName, objDeserialize);
            return linkedHashMap;
        }
        if (xVar != null) {
            strNextFieldName = (String) xVar.deserializeKey(strNextFieldName, kVar);
        }
        uVar.nextToken();
        Object objDeserialize2 = deserialize(uVar, kVar);
        String strNextFieldName2 = uVar.nextFieldName();
        if (strNextFieldName2 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(strCurrentName, objDeserialize);
            if (linkedHashMap2.put(strNextFieldName, objDeserialize2) == null) {
                return linkedHashMap2;
            }
            W(uVar, kVar, linkedHashMap2, strCurrentName, objDeserialize, objDeserialize2, strNextFieldName2);
            return linkedHashMap2;
        }
        String str = strCurrentName;
        if (xVar != null) {
            strNextFieldName2 = (String) xVar.deserializeKey(strNextFieldName2, kVar);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, objDeserialize);
        if (linkedHashMap3.put(strNextFieldName, objDeserialize2) != null) {
            W(uVar, kVar, linkedHashMap3, str, objDeserialize, objDeserialize2, strNextFieldName2);
            return linkedHashMap3;
        }
        String str2 = strNextFieldName2;
        do {
            uVar.nextToken();
            Object objDeserialize3 = deserialize(uVar, kVar);
            Object objPut = linkedHashMap3.put(str2, objDeserialize3);
            if (objPut != null) {
                String strNextFieldName3 = uVar.nextFieldName();
                if (xVar != null && strNextFieldName3 != null) {
                    strNextFieldName3 = (String) xVar.deserializeKey(strNextFieldName3, kVar);
                }
                W(uVar, kVar, linkedHashMap3, str2, objPut, objDeserialize3, strNextFieldName3);
                return linkedHashMap3;
            }
            String strNextFieldName4 = uVar.nextFieldName();
            if (xVar != null && strNextFieldName4 != null) {
                strNextFieldName4 = (String) xVar.deserializeKey(strNextFieldName4, kVar);
            }
            str2 = strNextFieldName4;
        } while (str2 != null);
        return linkedHashMap3;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        boolean z10 = gVar == null && Boolean.FALSE.equals(kVar.getConfig().getDefaultMergeable(Object.class));
        jc.x xVarFindKeyDeserializer = kVar.findKeyDeserializer(kVar.constructType(Object.class), gVar);
        if (xVarFindKeyDeserializer != null && dd.i.isJacksonStdImpl(xVarFindKeyDeserializer)) {
            xVarFindKeyDeserializer = null;
        }
        if (this.f78887h == null && this.f78888i == null && this.f78885f == null && this.f78886g == null && xVarFindKeyDeserializer == null && getClass() == l1.class) {
            return n1.instance(z10);
        }
        l1 l1Var = z10 != this.f78892m ? new l1(this, z10) : this;
        return xVarFindKeyDeserializer != null ? new l1(l1Var, xVarFindKeyDeserializer) : l1Var;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        switch (uVar.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                jc.q qVar = this.f78885f;
                return qVar != null ? qVar.deserialize(uVar, kVar) : Z(uVar, kVar);
            case 3:
                if (kVar.isEnabled(jc.l.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return Y(uVar, kVar);
                }
                jc.q qVar2 = this.f78886g;
                return qVar2 != null ? qVar2.deserialize(uVar, kVar) : X(uVar, kVar);
            case 4:
            default:
                return kVar.handleUnexpectedToken(Object.class, uVar);
            case 6:
                jc.q qVar3 = this.f78887h;
                return qVar3 != null ? qVar3.deserialize(uVar, kVar) : uVar.getText();
            case 7:
                jc.q qVar4 = this.f78888i;
                return qVar4 != null ? qVar4.deserialize(uVar, kVar) : kVar.hasSomeOfFeatures(s0.f78944e) ? s0.l(uVar, kVar) : uVar.getNumberValue();
            case 8:
                jc.q qVar5 = this.f78888i;
                return qVar5 != null ? qVar5.deserialize(uVar, kVar) : V(uVar, kVar);
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
        if (iCurrentTokenId != 1 && iCurrentTokenId != 3) {
            switch (iCurrentTokenId) {
                case 5:
                    break;
                case 6:
                    jc.q qVar = this.f78887h;
                    return qVar != null ? qVar.deserialize(uVar, kVar) : uVar.getText();
                case 7:
                    jc.q qVar2 = this.f78888i;
                    return qVar2 != null ? qVar2.deserialize(uVar, kVar) : kVar.hasSomeOfFeatures(s0.f78944e) ? s0.l(uVar, kVar) : uVar.getNumberValue();
                case 8:
                    jc.q qVar3 = this.f78888i;
                    return qVar3 != null ? qVar3.deserialize(uVar, kVar) : V(uVar, kVar);
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return uVar.getEmbeddedObject();
                default:
                    return kVar.handleUnexpectedToken(Object.class, uVar);
            }
        }
        return gVar.deserializeTypedFromAny(uVar, kVar);
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12143g;
    }

    @Override // mc.w
    public void resolve(jc.k kVar) throws jc.r {
        jc.o oVarConstructType = kVar.constructType(Object.class);
        jc.o oVarConstructType2 = kVar.constructType(String.class);
        cd.s typeFactory = kVar.getTypeFactory();
        jc.o oVar = this.f78890k;
        if (oVar == null) {
            jc.q qVarFindNonContextualValueDeserializer = kVar.findNonContextualValueDeserializer(typeFactory.constructCollectionType(List.class, oVarConstructType));
            if (dd.i.isJacksonStdImpl(qVarFindNonContextualValueDeserializer)) {
                qVarFindNonContextualValueDeserializer = null;
            }
            this.f78886g = qVarFindNonContextualValueDeserializer;
        } else {
            this.f78886g = kVar.findNonContextualValueDeserializer(oVar);
        }
        jc.o oVar2 = this.f78891l;
        if (oVar2 == null) {
            jc.q qVarFindNonContextualValueDeserializer2 = kVar.findNonContextualValueDeserializer(typeFactory.constructMapType(Map.class, oVarConstructType2, oVarConstructType));
            if (dd.i.isJacksonStdImpl(qVarFindNonContextualValueDeserializer2)) {
                qVarFindNonContextualValueDeserializer2 = null;
            }
            this.f78885f = qVarFindNonContextualValueDeserializer2;
        } else {
            this.f78885f = kVar.findNonContextualValueDeserializer(oVar2);
        }
        jc.q qVarFindNonContextualValueDeserializer3 = kVar.findNonContextualValueDeserializer(oVarConstructType2);
        if (dd.i.isJacksonStdImpl(qVarFindNonContextualValueDeserializer3)) {
            qVarFindNonContextualValueDeserializer3 = null;
        }
        this.f78887h = qVarFindNonContextualValueDeserializer3;
        jc.q qVarFindNonContextualValueDeserializer4 = kVar.findNonContextualValueDeserializer(typeFactory.constructType(Number.class));
        if (dd.i.isJacksonStdImpl(qVarFindNonContextualValueDeserializer4)) {
            qVarFindNonContextualValueDeserializer4 = null;
        }
        this.f78888i = qVarFindNonContextualValueDeserializer4;
        jc.o oVarUnknownType = cd.s.unknownType();
        this.f78885f = kVar.handleSecondaryContextualization(this.f78885f, null, oVarUnknownType);
        this.f78886g = kVar.handleSecondaryContextualization(this.f78886g, null, oVarUnknownType);
        this.f78887h = kVar.handleSecondaryContextualization(this.f78887h, null, oVarUnknownType);
        this.f78888i = kVar.handleSecondaryContextualization(this.f78888i, null, oVarUnknownType);
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return null;
    }

    public l1(jc.o oVar, jc.o oVar2) {
        super(Object.class);
        this.f78890k = oVar;
        this.f78891l = oVar2;
        this.f78892m = false;
    }

    public l1(l1 l1Var, jc.q qVar, jc.q qVar2, jc.q qVar3, jc.q qVar4) {
        super(Object.class);
        this.f78885f = qVar;
        this.f78886g = qVar2;
        this.f78887h = qVar3;
        this.f78888i = qVar4;
        this.f78890k = l1Var.f78890k;
        this.f78891l = l1Var.f78891l;
        this.f78889j = l1Var.f78889j;
        this.f78892m = l1Var.f78892m;
    }

    public l1(l1 l1Var, boolean z10) {
        super(Object.class);
        this.f78885f = l1Var.f78885f;
        this.f78886g = l1Var.f78886g;
        this.f78887h = l1Var.f78887h;
        this.f78888i = l1Var.f78888i;
        this.f78890k = l1Var.f78890k;
        this.f78891l = l1Var.f78891l;
        this.f78889j = l1Var.f78889j;
        this.f78892m = z10;
    }

    public l1(l1 l1Var, jc.x xVar) {
        super(Object.class);
        this.f78885f = l1Var.f78885f;
        this.f78886g = l1Var.f78886g;
        this.f78887h = l1Var.f78887h;
        this.f78888i = l1Var.f78888i;
        this.f78890k = l1Var.f78890k;
        this.f78891l = l1Var.f78891l;
        this.f78892m = l1Var.f78892m;
        this.f78889j = xVar;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Object objDeserialize;
        if (this.f78892m) {
            return deserialize(uVar, kVar);
        }
        switch (uVar.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                jc.q qVar = this.f78885f;
                if (qVar == null) {
                    if (!(obj instanceof Map)) {
                        break;
                    } else {
                        Map map = (Map) obj;
                        ub.z zVarCurrentToken = uVar.currentToken();
                        if (zVarCurrentToken == ub.z.START_OBJECT) {
                            zVarCurrentToken = uVar.nextToken();
                        }
                        if (zVarCurrentToken != ub.z.END_OBJECT) {
                            String strCurrentName = uVar.currentName();
                            do {
                                uVar.nextToken();
                                Object obj2 = map.get(strCurrentName);
                                if (obj2 != null) {
                                    objDeserialize = deserialize(uVar, kVar, obj2);
                                } else {
                                    objDeserialize = deserialize(uVar, kVar);
                                }
                                if (objDeserialize != obj2) {
                                    map.put(strCurrentName, objDeserialize);
                                }
                                strCurrentName = uVar.nextFieldName();
                            } while (strCurrentName != null);
                        }
                    }
                } else {
                    break;
                }
                break;
            case 3:
                jc.q qVar2 = this.f78886g;
                if (qVar2 == null) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        while (uVar.nextToken() != ub.z.END_ARRAY) {
                            collection.add(deserialize(uVar, kVar));
                        }
                        break;
                    } else if (!kVar.isEnabled(jc.l.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 6:
                jc.q qVar3 = this.f78887h;
                if (qVar3 == null) {
                    break;
                } else {
                    break;
                }
            case 7:
                jc.q qVar4 = this.f78888i;
                if (qVar4 == null) {
                    if (!kVar.hasSomeOfFeatures(s0.f78944e)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                jc.q qVar5 = this.f78888i;
                if (qVar5 == null) {
                    break;
                } else {
                    break;
                }
        }
        return deserialize(uVar, kVar);
    }
}
