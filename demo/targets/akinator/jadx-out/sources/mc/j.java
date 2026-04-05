package mc;

import dd.k0;
import j1.o2;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import nc.h0;
import nc.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends f {
    public final rc.m A;
    public final jc.o B;

    public j(g gVar, jc.d dVar, jc.o oVar, nc.c cVar, Map<String, z> map, Set<String> set, boolean z10, boolean z11) {
        this(gVar, dVar, oVar, cVar, map, set, z10, null, z11);
    }

    @Override // mc.f
    public final Object W(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object objI0;
        jc.k kVar2;
        Class<?> activeView;
        nc.a0 a0Var = this.f74167k;
        h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, this.f74181y);
        boolean z10 = this.f74176t;
        Class<?> activeView2 = z10 ? kVar.getActiveView() : null;
        ub.z zVarCurrentToken = uVar.currentToken();
        k0 k0VarBufferForInputBuffering = null;
        while (true) {
            ub.z zVar = ub.z.FIELD_NAME;
            jc.o oVar = this.f74162f;
            if (zVarCurrentToken != zVar) {
                jc.k kVar3 = kVar;
                try {
                    objI0 = a0Var.build(kVar3, h0VarStartBuilding);
                } catch (Exception e10) {
                    objI0 = i0(e10, kVar3);
                }
                Object obj = objI0;
                if (k0VarBufferForInputBuffering == null) {
                    return obj;
                }
                if (obj.getClass() != oVar.getRawClass()) {
                    return d0(null, kVar3, uVar.streamReadConstraints(), obj, k0VarBufferForInputBuffering);
                }
                e0(kVar3, obj, k0VarBufferForInputBuffering);
                return obj;
            }
            String strCurrentName = uVar.currentName();
            uVar.nextToken();
            z zVarFindCreatorProperty = a0Var.findCreatorProperty(strCurrentName);
            if (h0VarStartBuilding.readIdProperty(strCurrentName) && zVarFindCreatorProperty == null) {
                kVar2 = kVar;
            } else {
                nc.c cVar = this.f74170n;
                if (zVarFindCreatorProperty != null) {
                    if (activeView2 != null && !zVarFindCreatorProperty.visibleInView(activeView2)) {
                        uVar.skipChildren();
                    } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                        uVar.nextToken();
                        try {
                            Object objBuild = a0Var.build(kVar, h0VarStartBuilding);
                            if (objBuild.getClass() != oVar.getRawClass()) {
                                return d0(uVar, kVar, uVar.streamReadConstraints(), objBuild, k0VarBufferForInputBuffering);
                            }
                            jc.k kVar4 = kVar;
                            if (k0VarBufferForInputBuffering != null) {
                                e0(kVar4, objBuild, k0VarBufferForInputBuffering);
                            }
                            if (this.f74171o != null) {
                                h0(kVar4, objBuild);
                            }
                            if (this.f74179w != null) {
                                if (uVar.hasToken(ub.z.START_OBJECT)) {
                                    uVar.nextToken();
                                }
                                k0 k0VarBufferForInputBuffering2 = kVar4.bufferForInputBuffering(uVar);
                                k0VarBufferForInputBuffering2.writeStartObject();
                                return k0(uVar, kVar4, objBuild, k0VarBufferForInputBuffering2);
                            }
                            if (this.f74180x != null) {
                                return j0(uVar, kVar4, objBuild);
                            }
                            if (z10 && (activeView = kVar4.getActiveView()) != null) {
                                return l0(uVar, kVar4, objBuild, activeView);
                            }
                            ub.z zVarCurrentToken2 = uVar.currentToken();
                            if (zVarCurrentToken2 == ub.z.START_OBJECT) {
                                zVarCurrentToken2 = uVar.nextToken();
                            }
                            while (zVarCurrentToken2 == ub.z.FIELD_NAME) {
                                String strCurrentName2 = uVar.currentName();
                                uVar.nextToken();
                                z zVarFind = cVar.find(strCurrentName2);
                                if (zVarFind != null) {
                                    try {
                                        objBuild = zVarFind.deserializeSetAndReturn(uVar, kVar4, objBuild);
                                    } catch (Exception e11) {
                                        wrapAndThrow(e11, objBuild, strCurrentName2, kVar4);
                                    }
                                } else {
                                    g0(uVar, kVar4, objBuild, strCurrentName2);
                                }
                                zVarCurrentToken2 = uVar.nextToken();
                            }
                            return objBuild;
                        } catch (Exception e12) {
                            kVar2 = kVar;
                            wrapAndThrow(e12, oVar.getRawClass(), strCurrentName, kVar2);
                        }
                    }
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    z zVarFind2 = cVar.find(strCurrentName);
                    if (zVarFind2 != null) {
                        h0VarStartBuilding.bufferProperty(zVarFind2, zVarFind2.deserialize(uVar, kVar2));
                    } else if (dd.r.shouldIgnore(strCurrentName, this.f74173q, this.f74174r)) {
                        c0(uVar, kVar2, handledType(), strCurrentName);
                    } else {
                        x xVar = this.f74172p;
                        if (xVar != null) {
                            h0VarStartBuilding.bufferAnyProperty(xVar, strCurrentName, xVar.deserialize(uVar, kVar2));
                        } else {
                            if (k0VarBufferForInputBuffering == null) {
                                k0VarBufferForInputBuffering = kVar2.bufferForInputBuffering(uVar);
                            }
                            k0VarBufferForInputBuffering.writeFieldName(strCurrentName);
                            k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
                        }
                    }
                }
            }
            zVarCurrentToken = uVar.nextToken();
            kVar = kVar2;
        }
    }

    @Override // mc.f
    public final f Z() {
        return new nc.a(this, this.B, this.f74170n.getPropertiesInInsertionOrder(), this.A);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (!uVar.isExpectedStartObjectToken()) {
            switch (uVar.currentTokenId()) {
                case 2:
                case 5:
                    return m0(kVar, deserializeFromObject(uVar, kVar));
                case 3:
                    return n(uVar, kVar);
                case 4:
                case 11:
                default:
                    return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                case 6:
                    return m0(kVar, deserializeFromString(uVar, kVar));
                case 7:
                    return m0(kVar, deserializeFromNumber(uVar, kVar));
                case 8:
                    return m0(kVar, deserializeFromDouble(uVar, kVar));
                case 9:
                case 10:
                    return m0(kVar, deserializeFromBoolean(uVar, kVar));
                case 12:
                    return uVar.getEmbeddedObject();
            }
        }
        uVar.nextToken();
        if (!this.f74169m) {
            return m0(kVar, deserializeFromObject(uVar, kVar));
        }
        Object objCreateUsingDefault = this.f74164h.createUsingDefault(kVar);
        while (uVar.currentToken() == ub.z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            uVar.nextToken();
            z zVarFind = this.f74170n.find(strCurrentName);
            if (zVarFind != null) {
                try {
                    objCreateUsingDefault = zVarFind.deserializeSetAndReturn(uVar, kVar, objCreateUsingDefault);
                } catch (Exception e10) {
                    wrapAndThrow(e10, objCreateUsingDefault, strCurrentName, kVar);
                }
            } else {
                g0(uVar, kVar, objCreateUsingDefault, strCurrentName);
            }
            uVar.nextToken();
        }
        return m0(kVar, objCreateUsingDefault);
    }

    @Override // mc.f
    public Object deserializeFromObject(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Class<?> activeView;
        boolean z10 = this.f74168l;
        boolean z11 = this.f74176t;
        n0[] n0VarArr = this.f74171o;
        nc.c cVar = this.f74170n;
        c0 c0Var = this.f74164h;
        if (!z10) {
            Object objCreateUsingDefault = c0Var.createUsingDefault(kVar);
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDefault);
            }
            if (z11 && (activeView = kVar.getActiveView()) != null) {
                return l0(uVar, kVar, objCreateUsingDefault, activeView);
            }
            Object objDeserializeSetAndReturn = objCreateUsingDefault;
            while (uVar.currentToken() == ub.z.FIELD_NAME) {
                String strCurrentName = uVar.currentName();
                uVar.nextToken();
                z zVarFind = cVar.find(strCurrentName);
                if (zVarFind != null) {
                    try {
                        objDeserializeSetAndReturn = zVarFind.deserializeSetAndReturn(uVar, kVar, objDeserializeSetAndReturn);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objDeserializeSetAndReturn, strCurrentName, kVar);
                    }
                } else {
                    g0(uVar, kVar, objDeserializeSetAndReturn, strCurrentName);
                }
                uVar.nextToken();
            }
            return objDeserializeSetAndReturn;
        }
        if (this.f74179w == null) {
            if (this.f74180x == null) {
                return b0(uVar, kVar);
            }
            if (this.f74167k == null) {
                return j0(uVar, kVar, c0Var.createUsingDefault(kVar));
            }
            jc.o oVar = this.B;
            return kVar.reportBadDefinition(oVar, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", oVar));
        }
        jc.q qVar = this.f74165i;
        if (qVar != null) {
            return c0Var.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
        }
        nc.a0 a0Var = this.f74167k;
        Set set = this.f74174r;
        Set set2 = this.f74173q;
        if (a0Var == null) {
            k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            k0VarBufferForInputBuffering.writeStartObject();
            Object objCreateUsingDefault2 = c0Var.createUsingDefault(kVar);
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDefault2);
            }
            Class<?> activeView2 = z11 ? kVar.getActiveView() : null;
            Object objDeserializeSetAndReturn2 = objCreateUsingDefault2;
            while (uVar.currentToken() == ub.z.FIELD_NAME) {
                String strCurrentName2 = uVar.currentName();
                uVar.nextToken();
                z zVarFind2 = cVar.find(strCurrentName2);
                if (zVarFind2 != null) {
                    if (activeView2 == null || zVarFind2.visibleInView(activeView2)) {
                        try {
                            objDeserializeSetAndReturn2 = zVarFind2.deserializeSetAndReturn(uVar, kVar, objDeserializeSetAndReturn2);
                        } catch (Exception e11) {
                            wrapAndThrow(e11, objDeserializeSetAndReturn2, strCurrentName2, kVar);
                        }
                    } else {
                        uVar.skipChildren();
                    }
                } else if (dd.r.shouldIgnore(strCurrentName2, set2, set)) {
                    c0(uVar, kVar, objDeserializeSetAndReturn2, strCurrentName2);
                } else {
                    k0VarBufferForInputBuffering.writeFieldName(strCurrentName2);
                    k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
                    x xVar = this.f74172p;
                    if (xVar != null) {
                        try {
                            xVar.deserializeAndSet(uVar, kVar, objDeserializeSetAndReturn2, strCurrentName2);
                        } catch (Exception e12) {
                            wrapAndThrow(e12, objDeserializeSetAndReturn2, strCurrentName2, kVar);
                        }
                    }
                }
                uVar.nextToken();
            }
            k0VarBufferForInputBuffering.writeEndObject();
            return this.f74179w.processUnwrapped(uVar, kVar, objDeserializeSetAndReturn2, k0VarBufferForInputBuffering);
        }
        jc.o oVar2 = this.f74162f;
        h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, this.f74181y);
        k0 k0VarBufferForInputBuffering2 = kVar.bufferForInputBuffering(uVar);
        k0VarBufferForInputBuffering2.writeStartObject();
        ub.z zVarCurrentToken = uVar.currentToken();
        while (zVarCurrentToken == ub.z.FIELD_NAME) {
            String strCurrentName3 = uVar.currentName();
            uVar.nextToken();
            z zVarFindCreatorProperty = a0Var.findCreatorProperty(strCurrentName3);
            if (!h0VarStartBuilding.readIdProperty(strCurrentName3) || zVarFindCreatorProperty != null) {
                if (zVarFindCreatorProperty == null) {
                    z zVarFind3 = cVar.find(strCurrentName3);
                    if (zVarFind3 != null) {
                        h0VarStartBuilding.bufferProperty(zVarFind3, zVarFind3.deserialize(uVar, kVar));
                    } else if (dd.r.shouldIgnore(strCurrentName3, set2, set)) {
                        c0(uVar, kVar, handledType(), strCurrentName3);
                    } else {
                        k0VarBufferForInputBuffering2.writeFieldName(strCurrentName3);
                        k0VarBufferForInputBuffering2.copyCurrentStructure(uVar);
                        x xVar2 = this.f74172p;
                        if (xVar2 != null) {
                            h0VarStartBuilding.bufferAnyProperty(xVar2, strCurrentName3, xVar2.deserialize(uVar, kVar));
                        }
                    }
                } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                    uVar.nextToken();
                    try {
                        Object objBuild = a0Var.build(kVar, h0VarStartBuilding);
                        return objBuild.getClass() != oVar2.getRawClass() ? d0(uVar, kVar, uVar.streamReadConstraints(), objBuild, k0VarBufferForInputBuffering2) : k0(uVar, kVar, objBuild, k0VarBufferForInputBuffering2);
                    } catch (Exception e13) {
                        wrapAndThrow(e13, oVar2.getRawClass(), strCurrentName3, kVar);
                    }
                } else {
                    continue;
                }
            }
            zVarCurrentToken = uVar.nextToken();
        }
        k0VarBufferForInputBuffering2.writeEndObject();
        try {
            return this.f74179w.processUnwrapped(uVar, kVar, a0Var.build(kVar, h0VarStartBuilding), k0VarBufferForInputBuffering2);
        } catch (Exception e14) {
            return i0(e14, kVar);
        }
    }

    public final Object j0(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        nc.j jVarStart = this.f74180x.start();
        ub.z zVarCurrentToken = uVar.currentToken();
        while (zVarCurrentToken == ub.z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            ub.z zVarNextToken = uVar.nextToken();
            z zVarFind = this.f74170n.find(strCurrentName);
            if (zVarFind != null) {
                if (zVarNextToken.isScalarValue()) {
                    jVarStart.handleTypePropertyValue(uVar, kVar, strCurrentName, obj);
                }
                if (activeView == null || zVarFind.visibleInView(activeView)) {
                    try {
                        obj = zVarFind.deserializeSetAndReturn(uVar, kVar, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, strCurrentName, kVar);
                    }
                } else {
                    uVar.skipChildren();
                }
            } else if (dd.r.shouldIgnore(strCurrentName, this.f74173q, this.f74174r)) {
                c0(uVar, kVar, obj, strCurrentName);
            } else if (!jVarStart.handlePropertyValue(uVar, kVar, strCurrentName, obj)) {
                x xVar = this.f74172p;
                if (xVar != null) {
                    try {
                        xVar.deserializeAndSet(uVar, kVar, obj, strCurrentName);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strCurrentName, kVar);
                    }
                } else {
                    f0(uVar, kVar, obj, strCurrentName);
                }
            }
            zVarCurrentToken = uVar.nextToken();
        }
        return jVarStart.complete(uVar, kVar, obj);
    }

    public final Object k0(ub.u uVar, jc.k kVar, Object obj, k0 k0Var) throws IOException {
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        ub.z zVarCurrentToken = uVar.currentToken();
        while (zVarCurrentToken == ub.z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            z zVarFind = this.f74170n.find(strCurrentName);
            uVar.nextToken();
            if (zVarFind != null) {
                if (activeView == null || zVarFind.visibleInView(activeView)) {
                    try {
                        obj = zVarFind.deserializeSetAndReturn(uVar, kVar, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, strCurrentName, kVar);
                    }
                } else {
                    uVar.skipChildren();
                }
            } else if (dd.r.shouldIgnore(strCurrentName, this.f74173q, this.f74174r)) {
                c0(uVar, kVar, obj, strCurrentName);
            } else {
                k0Var.writeFieldName(strCurrentName);
                k0Var.copyCurrentStructure(uVar);
                x xVar = this.f74172p;
                if (xVar != null) {
                    xVar.deserializeAndSet(uVar, kVar, obj, strCurrentName);
                }
            }
            zVarCurrentToken = uVar.nextToken();
        }
        k0Var.writeEndObject();
        return this.f74179w.processUnwrapped(uVar, kVar, obj, k0Var);
    }

    public final Object l0(ub.u uVar, jc.k kVar, Object obj, Class cls) throws IOException {
        ub.z zVarCurrentToken = uVar.currentToken();
        while (zVarCurrentToken == ub.z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            uVar.nextToken();
            z zVarFind = this.f74170n.find(strCurrentName);
            if (zVarFind == null) {
                g0(uVar, kVar, obj, strCurrentName);
            } else if (zVarFind.visibleInView(cls)) {
                try {
                    obj = zVarFind.deserializeSetAndReturn(uVar, kVar, obj);
                } catch (Exception e10) {
                    wrapAndThrow(e10, obj, strCurrentName, kVar);
                }
            } else {
                if (kVar.isEnabled(jc.l.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES)) {
                    Class<?> clsHandledType = handledType();
                    String strNameOf = dd.i.nameOf(handledType());
                    String name = zVarFind.getName();
                    kVar.reportInputMismatch(clsHandledType, o2.o(b3.h.b("Input mismatch while deserializing ", strNameOf, ". Property '", name, "' is not part of current active view '"), cls.getName(), "' (disable 'DeserializationFeature.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES' to allow)"), new Object[0]);
                }
                uVar.skipChildren();
            }
            zVarCurrentToken = uVar.nextToken();
        }
        return obj;
    }

    public final Object m0(jc.k kVar, Object obj) {
        rc.m mVar = this.A;
        if (mVar == null) {
            return obj;
        }
        try {
            return mVar.getMember().invoke(obj, null);
        } catch (Exception e10) {
            return i0(e10, kVar);
        }
    }

    @Override // oc.s0
    public final Object n(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        ub.u uVar2;
        jc.k kVar2;
        jc.q qVar = this.f74166j;
        if (qVar != null || (qVar = this.f74165i) != null) {
            Object objCreateUsingArrayDelegate = this.f74164h.createUsingArrayDelegate(kVar, qVar.deserialize(uVar, kVar));
            if (this.f74171o != null) {
                h0(kVar, objCreateUsingArrayDelegate);
            }
            return m0(kVar, objCreateUsingArrayDelegate);
        }
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73108g);
        boolean zIsEnabled = kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || cVarFindCoercionAction != lc.c.f73085b) {
            ub.z zVarNextToken = uVar.nextToken();
            ub.z zVar = ub.z.END_ARRAY;
            if (zVarNextToken == zVar) {
                int iOrdinal = cVarFindCoercionAction.ordinal();
                return (iOrdinal == 1 || iOrdinal == 2) ? getNullValue(kVar) : iOrdinal != 3 ? kVar.handleUnexpectedToken(getValueType(kVar), ub.z.START_ARRAY, uVar, (String) null, new Object[0]) : getEmptyValue(kVar);
            }
            uVar2 = uVar;
            kVar2 = kVar;
            if (zIsEnabled) {
                Object objDeserialize = deserialize(uVar2, kVar2);
                if (uVar2.nextToken() != zVar) {
                    T(kVar2);
                }
                return objDeserialize;
            }
        } else {
            uVar2 = uVar;
            kVar2 = kVar;
        }
        return kVar2.handleUnexpectedToken(getValueType(kVar2), uVar2);
    }

    @Override // mc.f, jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.FALSE;
    }

    @Override // mc.f, jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        return new j(this, a0Var);
    }

    @Override // mc.f
    public f withBeanProperties(nc.c cVar) {
        return new j(this, cVar);
    }

    @Override // mc.f
    public f withByNameInclusion(Set<String> set, Set<String> set2) {
        return new j(this, set, set2);
    }

    @Override // mc.f
    public f withIgnoreAllUnknown(boolean z10) {
        return new j(this, z10);
    }

    @Override // mc.f
    public f withObjectIdReader(nc.w wVar) {
        return new j(this, wVar);
    }

    public j(g gVar, jc.d dVar, jc.o oVar, nc.c cVar, Map<String, z> map, Set<String> set, boolean z10, Set<String> set2, boolean z11) {
        super(gVar, dVar, cVar, map, set, z10, set2, z11);
        this.B = oVar;
        this.A = gVar.getBuildMethod();
        if (this.f74181y == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + dVar.getType() + ")");
    }

    @Deprecated
    public j(g gVar, jc.d dVar, nc.c cVar, Map<String, z> map, Set<String> set, boolean z10, boolean z11) {
        this(gVar, dVar, dVar.getType(), cVar, map, set, z10, z11);
    }

    public j(j jVar, boolean z10) {
        super(jVar, z10);
        this.A = jVar.A;
        this.B = jVar.B;
    }

    public j(j jVar, dd.a0 a0Var) {
        super(jVar, a0Var);
        this.A = jVar.A;
        this.B = jVar.B;
    }

    public j(j jVar, nc.w wVar) {
        super(jVar, wVar);
        this.A = jVar.A;
        this.B = jVar.B;
    }

    public j(j jVar, Set<String> set) {
        this(jVar, set, jVar.f74174r);
    }

    public j(j jVar, Set<String> set, Set<String> set2) {
        super(jVar, set, set2);
        this.A = jVar.A;
        this.B = jVar.B;
    }

    public j(j jVar, nc.c cVar) {
        super(jVar, cVar);
        this.A = jVar.A;
        this.B = jVar.B;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Class<?> clsHandledType = handledType();
        Class<?> cls = obj.getClass();
        boolean zIsAssignableFrom = clsHandledType.isAssignableFrom(cls);
        jc.o oVar = this.B;
        if (zIsAssignableFrom) {
            return kVar.reportBadDefinition(oVar, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", oVar, clsHandledType.getName()));
        }
        return kVar.reportBadDefinition(oVar, String.format("Deserialization of %s by passing existing instance (of %s) not supported", oVar, cls.getName()));
    }
}
