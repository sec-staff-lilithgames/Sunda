package nc;

import java.io.IOException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends mc.f {
    public final mc.f A;
    public final mc.z[] B;

    public b(mc.f fVar, mc.z[] zVarArr) {
        super(fVar);
        this.A = fVar;
        this.B = zVarArr;
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
        Object objBuild = null;
        while (uVar.nextToken() != ub.z.END_ARRAY) {
            mc.z zVar = i10 < length ? zVarArr[i10] : null;
            if (zVar == null) {
                uVar.skipChildren();
            } else if (activeView != null && !zVar.visibleInView(activeView)) {
                uVar.skipChildren();
            } else if (objBuild != null) {
                try {
                    zVar.deserializeAndSet(uVar, kVar, objBuild);
                } catch (Exception e10) {
                    wrapAndThrow(e10, objBuild, zVar.getName(), kVar);
                }
            } else {
                String name = zVar.getName();
                mc.z zVarFindCreatorProperty = a0Var.findCreatorProperty(name);
                if (!h0VarStartBuilding.readIdProperty(name) || zVarFindCreatorProperty != null) {
                    if (zVarFindCreatorProperty == null) {
                        h0VarStartBuilding.bufferProperty(zVar, zVar.deserialize(uVar, kVar));
                    } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                        try {
                            objBuild = a0Var.build(kVar, h0VarStartBuilding);
                            uVar.assignCurrentValue(objBuild);
                            if (objBuild.getClass() != oVar.getRawClass()) {
                                kVar.reportBadDefinition(oVar, a.b.m("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ", dd.i.getTypeDescription(oVar), ", actual type ", dd.i.getClassDescription(objBuild)));
                            }
                        } catch (Exception e11) {
                            wrapAndThrow(e11, oVar.getRawClass(), name, kVar);
                        }
                    }
                }
            }
            i10++;
        }
        if (objBuild != null) {
            return objBuild;
        }
        try {
            return a0Var.build(kVar, h0VarStartBuilding);
        } catch (Exception e12) {
            return i0(e12, kVar);
        }
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (!uVar.isExpectedStartArrayToken()) {
            return j0(uVar, kVar);
        }
        boolean z10 = this.f74169m;
        boolean z11 = this.f74175s;
        int i10 = 0;
        mc.z[] zVarArr = this.B;
        mc.c0 c0Var = this.f74164h;
        if (z10) {
            Object objCreateUsingDefault = c0Var.createUsingDefault(kVar);
            uVar.assignCurrentValue(objCreateUsingDefault);
            int length = zVarArr.length;
            while (true) {
                ub.z zVarNextToken = uVar.nextToken();
                ub.z zVar = ub.z.END_ARRAY;
                if (zVarNextToken == zVar) {
                    break;
                }
                if (i10 == length) {
                    if (!z11 && kVar.isEnabled(jc.l.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        kVar.reportWrongTokenException(this, zVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    }
                    do {
                        uVar.skipChildren();
                    } while (uVar.nextToken() != ub.z.END_ARRAY);
                } else {
                    mc.z zVar2 = zVarArr[i10];
                    if (zVar2 != null) {
                        try {
                            zVar2.deserializeAndSet(uVar, kVar, objCreateUsingDefault);
                        } catch (Exception e10) {
                            wrapAndThrow(e10, objCreateUsingDefault, zVar2.getName(), kVar);
                        }
                    } else {
                        uVar.skipChildren();
                    }
                    i10++;
                }
            }
            return objCreateUsingDefault;
        }
        if (this.f74168l) {
            return b0(uVar, kVar);
        }
        Object objCreateUsingDefault2 = c0Var.createUsingDefault(kVar);
        uVar.assignCurrentValue(objCreateUsingDefault2);
        if (this.f74171o != null) {
            h0(kVar, objCreateUsingDefault2);
        }
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        int length2 = zVarArr.length;
        while (true) {
            ub.z zVarNextToken2 = uVar.nextToken();
            ub.z zVar3 = ub.z.END_ARRAY;
            if (zVarNextToken2 == zVar3) {
                break;
            }
            if (i10 == length2) {
                if (!z11 && kVar.isEnabled(jc.l.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    kVar.reportWrongTokenException(this, zVar3, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                }
                do {
                    uVar.skipChildren();
                } while (uVar.nextToken() != ub.z.END_ARRAY);
            } else {
                mc.z zVar4 = zVarArr[i10];
                i10++;
                if (zVar4 == null || !(activeView == null || zVar4.visibleInView(activeView))) {
                    uVar.skipChildren();
                } else {
                    try {
                        zVar4.deserializeAndSet(uVar, kVar, objCreateUsingDefault2);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault2, zVar4.getName(), kVar);
                    }
                }
            }
        }
        return objCreateUsingDefault2;
    }

    @Override // mc.f
    public Object deserializeFromObject(ub.u uVar, jc.k kVar) throws IOException {
        return j0(uVar, kVar);
    }

    public final Object j0(ub.u uVar, jc.k kVar) {
        return kVar.handleUnexpectedToken(getValueType(kVar), uVar.currentToken(), uVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", dd.i.getTypeDescription(this.f74162f), uVar.currentToken());
    }

    @Override // mc.f, jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        return this.A.unwrappingDeserializer(a0Var);
    }

    @Override // mc.f
    public mc.f withBeanProperties(c cVar) {
        return new b(this.A.withBeanProperties(cVar), this.B);
    }

    @Override // mc.f
    public mc.f withByNameInclusion(Set<String> set, Set<String> set2) {
        return new b(this.A.withByNameInclusion(set, set2), this.B);
    }

    @Override // mc.f
    public mc.f withIgnoreAllUnknown(boolean z10) {
        return new b(this.A.withIgnoreAllUnknown(z10), this.B);
    }

    @Override // mc.f
    public mc.f withObjectIdReader(w wVar) {
        return new b(this.A.withObjectIdReader(wVar), this.B);
    }

    @Override // mc.f
    public final mc.f Z() {
        return this;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        uVar.assignCurrentValue(obj);
        if (!uVar.isExpectedStartArrayToken()) {
            return j0(uVar, kVar);
        }
        if (this.f74171o != null) {
            h0(kVar, obj);
        }
        mc.z[] zVarArr = this.B;
        int length = zVarArr.length;
        int i10 = 0;
        while (true) {
            ub.z zVarNextToken = uVar.nextToken();
            ub.z zVar = ub.z.END_ARRAY;
            if (zVarNextToken == zVar) {
                break;
            }
            if (i10 == length) {
                if (!this.f74175s && kVar.isEnabled(jc.l.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    kVar.reportWrongTokenException(this, zVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    uVar.skipChildren();
                } while (uVar.nextToken() != ub.z.END_ARRAY);
            } else {
                mc.z zVar2 = zVarArr[i10];
                if (zVar2 != null) {
                    try {
                        zVar2.deserializeAndSet(uVar, kVar, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, zVar2.getName(), kVar);
                    }
                } else {
                    uVar.skipChildren();
                }
                i10++;
            }
        }
        return obj;
    }
}
