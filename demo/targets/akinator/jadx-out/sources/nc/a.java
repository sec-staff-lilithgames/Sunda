package nc;

import java.io.IOException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends mc.f {
    public final mc.f A;
    public final mc.z[] B;
    public final rc.m C;
    public final jc.o D;

    public a(mc.f fVar, jc.o oVar, mc.z[] zVarArr, rc.m mVar) {
        super(fVar);
        this.A = fVar;
        this.D = oVar;
        this.B = zVarArr;
        this.C = mVar;
    }

    @Override // mc.f
    public final Object W(ub.u uVar, jc.k kVar) throws IOException {
        jc.o oVar = this.f74162f;
        a0 a0Var = this.f74167k;
        h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, this.f74181y);
        mc.z[] zVarArr = this.B;
        int length = zVarArr.length;
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        int i10 = 0;
        Object objDeserializeSetAndReturn = null;
        while (uVar.nextToken() != ub.z.END_ARRAY) {
            mc.z zVar = i10 < length ? zVarArr[i10] : null;
            if (zVar == null) {
                uVar.skipChildren();
            } else if (activeView != null && !zVar.visibleInView(activeView)) {
                uVar.skipChildren();
            } else if (objDeserializeSetAndReturn != null) {
                try {
                    objDeserializeSetAndReturn = zVar.deserializeSetAndReturn(uVar, kVar, objDeserializeSetAndReturn);
                } catch (Exception e10) {
                    wrapAndThrow(e10, objDeserializeSetAndReturn, zVar.getName(), kVar);
                }
            } else {
                String name = zVar.getName();
                mc.z zVarFindCreatorProperty = a0Var.findCreatorProperty(name);
                if (!h0VarStartBuilding.readIdProperty(name) || zVarFindCreatorProperty != null) {
                    if (zVarFindCreatorProperty == null) {
                        h0VarStartBuilding.bufferProperty(zVar, zVar.deserialize(uVar, kVar));
                    } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                        try {
                            objDeserializeSetAndReturn = a0Var.build(kVar, h0VarStartBuilding);
                            if (objDeserializeSetAndReturn.getClass() != oVar.getRawClass()) {
                                return kVar.reportBadDefinition(oVar, a.b.m("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ", dd.i.getTypeDescription(oVar), ", actual type ", objDeserializeSetAndReturn.getClass().getName()));
                            }
                        } catch (Exception e11) {
                            wrapAndThrow(e11, oVar.getRawClass(), name, kVar);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
        }
        if (objDeserializeSetAndReturn != null) {
            return objDeserializeSetAndReturn;
        }
        try {
            return a0Var.build(kVar, h0VarStartBuilding);
        } catch (Exception e12) {
            return i0(e12, kVar);
        }
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object objCreateUsingDefault;
        if (!uVar.isExpectedStartArrayToken()) {
            return j0(kVar, kVar.handleUnexpectedToken(getValueType(kVar), uVar.currentToken(), uVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.f74162f.getRawClass().getName(), uVar.currentToken()));
        }
        boolean z10 = this.f74169m;
        boolean z11 = this.f74175s;
        int i10 = 0;
        mc.z[] zVarArr = this.B;
        mc.c0 c0Var = this.f74164h;
        if (z10) {
            Object objCreateUsingDefault2 = c0Var.createUsingDefault(kVar);
            int length = zVarArr.length;
            int i11 = 0;
            while (uVar.nextToken() != ub.z.END_ARRAY) {
                if (i11 == length) {
                    if (!z11 && kVar.isEnabled(jc.l.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        kVar.reportInputMismatch(handledType(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    }
                    while (uVar.nextToken() != ub.z.END_ARRAY) {
                        uVar.skipChildren();
                    }
                    return j0(kVar, objCreateUsingDefault2);
                }
                mc.z zVar = zVarArr[i11];
                if (zVar != null) {
                    try {
                        objCreateUsingDefault2 = zVar.deserializeSetAndReturn(uVar, kVar, objCreateUsingDefault2);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objCreateUsingDefault2, zVar.getName(), kVar);
                    }
                } else {
                    uVar.skipChildren();
                }
                i11++;
            }
            return j0(kVar, objCreateUsingDefault2);
        }
        if (!this.f74168l) {
            objCreateUsingDefault = c0Var.createUsingDefault(kVar);
            if (this.f74171o != null) {
                h0(kVar, objCreateUsingDefault);
            }
            Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
            int length2 = zVarArr.length;
            while (true) {
                ub.z zVarNextToken = uVar.nextToken();
                ub.z zVar2 = ub.z.END_ARRAY;
                if (zVarNextToken == zVar2) {
                    break;
                }
                if (i10 == length2) {
                    if (!z11 && kVar.isEnabled(jc.l.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        kVar.reportWrongTokenException(this, zVar2, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    }
                    while (uVar.nextToken() != ub.z.END_ARRAY) {
                        uVar.skipChildren();
                    }
                } else {
                    mc.z zVar3 = zVarArr[i10];
                    int i12 = i10 + 1;
                    if (zVar3 == null || !(activeView == null || zVar3.visibleInView(activeView))) {
                        uVar.skipChildren();
                    } else {
                        try {
                            zVar3.deserializeSetAndReturn(uVar, kVar, objCreateUsingDefault);
                        } catch (Exception e11) {
                            wrapAndThrow(e11, objCreateUsingDefault, zVar3.getName(), kVar);
                        }
                    }
                    i10 = i12;
                }
            }
        } else {
            objCreateUsingDefault = b0(uVar, kVar);
        }
        return j0(kVar, objCreateUsingDefault);
    }

    @Override // mc.f
    public Object deserializeFromObject(ub.u uVar, jc.k kVar) throws IOException {
        return kVar.handleUnexpectedToken(getValueType(kVar), uVar.currentToken(), uVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.f74162f.getRawClass().getName(), uVar.currentToken());
    }

    public final Object j0(jc.k kVar, Object obj) {
        try {
            return this.C.getMember().invoke(obj, null);
        } catch (Exception e10) {
            return i0(e10, kVar);
        }
    }

    @Override // mc.f, jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.FALSE;
    }

    @Override // mc.f, jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        return this.A.unwrappingDeserializer(a0Var);
    }

    @Override // mc.f
    public mc.f withBeanProperties(c cVar) {
        return new a(this.A.withBeanProperties(cVar), this.D, this.B, this.C);
    }

    @Override // mc.f
    public mc.f withByNameInclusion(Set<String> set, Set<String> set2) {
        return new a(this.A.withByNameInclusion(set, set2), this.D, this.B, this.C);
    }

    @Override // mc.f
    public mc.f withIgnoreAllUnknown(boolean z10) {
        return new a(this.A.withIgnoreAllUnknown(z10), this.D, this.B, this.C);
    }

    @Override // mc.f
    public mc.f withObjectIdReader(w wVar) {
        return new a(this.A.withObjectIdReader(wVar), this.D, this.B, this.C);
    }

    @Override // mc.f
    public final mc.f Z() {
        return this;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return this.A.deserialize(uVar, kVar, obj);
    }
}
