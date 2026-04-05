package mc;

import dd.k0;
import j1.o2;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nc.h0;
import nc.m0;
import nc.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends f implements Serializable {
    public volatile transient dd.a0 A;

    @Deprecated
    public e(g gVar, jc.d dVar, nc.c cVar, Map<String, z> map, HashSet<String> hashSet, boolean z10, boolean z11) {
        super(gVar, dVar, cVar, map, hashSet, z10, null, z11);
    }

    @Override // mc.f
    public final Object W(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        jc.k kVar2;
        Object objI0;
        nc.a0 a0Var = this.f74167k;
        x xVar = this.f74172p;
        nc.w wVar = this.f74181y;
        h0 h0VarStartBuildingWithAnySetter = xVar != null ? a0Var.startBuildingWithAnySetter(uVar, kVar, wVar, xVar) : a0Var.startBuilding(uVar, kVar, wVar);
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        ub.z zVarCurrentToken = uVar.currentToken();
        ArrayList arrayList = null;
        k0 k0VarBufferForInputBuffering = null;
        while (true) {
            ub.z zVar = ub.z.FIELD_NAME;
            jc.o oVar = this.f74162f;
            if (zVarCurrentToken != zVar) {
                jc.k kVar3 = kVar;
                try {
                    Object objBuild = a0Var.build(kVar3, h0VarStartBuildingWithAnySetter);
                    uVar.assignCurrentValue(objBuild);
                    if (objBuild == null) {
                        l0(null, kVar3, k0VarBufferForInputBuffering, arrayList);
                        return null;
                    }
                    if (this.f74171o != null) {
                        h0(kVar3, objBuild);
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).setBean(objBuild);
                        }
                    }
                    if (k0VarBufferForInputBuffering == null) {
                        return objBuild;
                    }
                    if (objBuild.getClass() != oVar.getRawClass()) {
                        return d0(null, kVar3, uVar.streamReadConstraints(), objBuild, k0VarBufferForInputBuffering);
                    }
                    e0(kVar3, objBuild, k0VarBufferForInputBuffering);
                    return objBuild;
                } catch (Exception e10) {
                    return i0(e10, kVar3);
                }
            }
            String strCurrentName = uVar.currentName();
            uVar.nextToken();
            z zVarFindCreatorProperty = a0Var.findCreatorProperty(strCurrentName);
            if (h0VarStartBuildingWithAnySetter.readIdProperty(strCurrentName) && zVarFindCreatorProperty == null) {
                kVar2 = kVar;
            } else if (zVarFindCreatorProperty != null) {
                if (activeView != null && !zVarFindCreatorProperty.visibleInView(activeView)) {
                    uVar.skipChildren();
                } else if (h0VarStartBuildingWithAnySetter.assignParameter(zVarFindCreatorProperty, j0(uVar, kVar, zVarFindCreatorProperty))) {
                    uVar.nextToken();
                    try {
                        objI0 = a0Var.build(kVar, h0VarStartBuildingWithAnySetter);
                    } catch (Exception e11) {
                        objI0 = i0(e11, kVar);
                    }
                    Object obj = objI0;
                    uVar.assignCurrentValue(obj);
                    if (obj == null) {
                        l0(uVar, kVar, k0VarBufferForInputBuffering, arrayList);
                        return null;
                    }
                    if (obj.getClass() != oVar.getRawClass()) {
                        return d0(uVar, kVar, uVar.streamReadConstraints(), obj, k0VarBufferForInputBuffering);
                    }
                    jc.k kVar4 = kVar;
                    if (k0VarBufferForInputBuffering != null) {
                        e0(kVar4, obj, k0VarBufferForInputBuffering);
                    }
                    return deserialize(uVar, kVar4, obj);
                }
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                z zVarFind = this.f74170n.find(strCurrentName);
                if (zVarFind != null && (!oVar.isRecordType() || (zVarFind instanceof nc.s))) {
                    try {
                        h0VarStartBuildingWithAnySetter.bufferProperty(zVarFind, j0(uVar, kVar2, zVarFind));
                    } catch (a0 e12) {
                        d dVar = new d(kVar2, e12, zVarFind.getType(), zVarFind);
                        e12.getRoid().appendReferring(dVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dVar);
                    }
                } else if (dd.r.shouldIgnore(strCurrentName, this.f74173q, this.f74174r)) {
                    c0(uVar, kVar2, handledType(), strCurrentName);
                } else {
                    x xVar2 = this.f74172p;
                    if (xVar2 != null) {
                        try {
                            if (xVar2.isFieldType() || this.f74172p.isSetterType()) {
                                x xVar3 = this.f74172p;
                                h0VarStartBuildingWithAnySetter.bufferAnyProperty(xVar3, strCurrentName, xVar3.deserialize(uVar, kVar2));
                            } else {
                                x xVar4 = this.f74172p;
                                h0VarStartBuildingWithAnySetter.bufferAnyParameterProperty(xVar4, strCurrentName, xVar4.deserialize(uVar, kVar2));
                            }
                        } catch (Exception e13) {
                            wrapAndThrow(e13, oVar.getRawClass(), strCurrentName, kVar2);
                        }
                    } else if (this.f74175s) {
                        uVar.skipChildren();
                    } else {
                        if (k0VarBufferForInputBuffering == null) {
                            k0VarBufferForInputBuffering = kVar2.bufferForInputBuffering(uVar);
                        }
                        k0VarBufferForInputBuffering.writeFieldName(strCurrentName);
                        k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
                    }
                }
            }
            zVarCurrentToken = uVar.nextToken();
            kVar = kVar2;
        }
    }

    @Override // mc.f
    public final f Z() {
        return new nc.b(this, this.f74170n.getPropertiesInInsertionOrder());
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object objDeserializeFromObject;
        boolean zIsExpectedStartObjectToken = uVar.isExpectedStartObjectToken();
        nc.w wVar = this.f74181y;
        if (zIsExpectedStartObjectToken) {
            if (this.f74169m) {
                uVar.nextToken();
                return n0(uVar, kVar);
            }
            uVar.nextToken();
            return wVar != null ? deserializeFromObject(uVar, kVar) : deserializeFromObject(uVar, kVar);
        }
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken != null) {
            switch (zVarCurrentToken.ordinal()) {
                case 2:
                case 5:
                    return this.f74169m ? n0(uVar, kVar) : wVar != null ? deserializeFromObject(uVar, kVar) : deserializeFromObject(uVar, kVar);
                case 3:
                    return n(uVar, kVar);
                case 6:
                    return deserializeFromEmbedded(uVar, kVar);
                case 7:
                    return deserializeFromString(uVar, kVar);
                case 8:
                    return deserializeFromNumber(uVar, kVar);
                case 9:
                    return deserializeFromDouble(uVar, kVar);
                case 10:
                case 11:
                    return deserializeFromBoolean(uVar, kVar);
                case 12:
                    if (!uVar.requiresCustomCodec()) {
                        return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
                    k0VarBufferForInputBuffering.writeEndObject();
                    ub.u uVarAsParser = k0VarBufferForInputBuffering.asParser(uVar);
                    uVarAsParser.nextToken();
                    if (this.f74169m) {
                        ub.z zVar = ub.z.NOT_AVAILABLE;
                        objDeserializeFromObject = n0(uVarAsParser, kVar);
                    } else {
                        objDeserializeFromObject = deserializeFromObject(uVarAsParser, kVar);
                    }
                    uVarAsParser.close();
                    return objDeserializeFromObject;
            }
        }
        return kVar.handleUnexpectedToken(getValueType(kVar), uVar);
    }

    @Override // mc.f
    public Object deserializeFromObject(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Class<?> activeView;
        Object objI0;
        nc.w wVar = this.f74181y;
        if (wVar != null && wVar.maySerializeAsObject() && uVar.hasTokenId(5) && wVar.isValidReferencePropertyName(uVar.currentName(), uVar)) {
            return a0(uVar, kVar);
        }
        boolean z10 = this.f74168l;
        n0[] n0VarArr = this.f74171o;
        boolean z11 = this.f74176t;
        c0 c0Var = this.f74164h;
        nc.c cVar = this.f74170n;
        if (!z10) {
            Object objCreateUsingDefault = c0Var.createUsingDefault(kVar);
            if (uVar.canReadObjectId()) {
                Object objectId = uVar.getObjectId();
                if (objectId != null) {
                    Y(uVar, kVar, objCreateUsingDefault, objectId);
                }
            } else if (wVar != null && uVar.hasTokenId(2) && kVar.isEnabled(jc.l.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
                kVar.reportUnresolvedObjectId(wVar, objCreateUsingDefault);
            }
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDefault);
            }
            if (z11 && (activeView = kVar.getActiveView()) != null) {
                m0(uVar, kVar, objCreateUsingDefault, activeView);
                return objCreateUsingDefault;
            }
            if (uVar.hasTokenId(5)) {
                uVar.assignCurrentValue(objCreateUsingDefault);
                String strCurrentName = uVar.currentName();
                do {
                    uVar.nextToken();
                    z zVarFind = cVar.find(strCurrentName);
                    if (zVarFind != null) {
                        try {
                            zVarFind.deserializeAndSet(uVar, kVar, objCreateUsingDefault);
                        } catch (Exception e10) {
                            wrapAndThrow(e10, objCreateUsingDefault, strCurrentName, kVar);
                        }
                    } else {
                        g0(uVar, kVar, objCreateUsingDefault, strCurrentName);
                    }
                    strCurrentName = uVar.nextFieldName();
                } while (strCurrentName != null);
            }
            return objCreateUsingDefault;
        }
        m0 m0Var = this.f74179w;
        jc.o oVar = this.f74162f;
        Set set = this.f74173q;
        Set set2 = this.f74174r;
        if (m0Var == null) {
            nc.j jVar = this.f74180x;
            if (jVar == null) {
                return b0(uVar, kVar);
            }
            if (this.f74167k == null) {
                jc.q qVar = this.f74165i;
                return qVar != null ? c0Var.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar)) : k0(uVar, kVar, c0Var.createUsingDefault(kVar), this.f74180x.start());
            }
            nc.j jVarStart = jVar.start();
            nc.a0 a0Var = this.f74167k;
            h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, wVar);
            Class<?> activeView2 = z11 ? kVar.getActiveView() : null;
            ub.z zVarCurrentToken = uVar.currentToken();
            while (zVarCurrentToken == ub.z.FIELD_NAME) {
                String strCurrentName2 = uVar.currentName();
                ub.z zVarNextToken = uVar.nextToken();
                z zVarFindCreatorProperty = a0Var.findCreatorProperty(strCurrentName2);
                if (!h0VarStartBuilding.readIdProperty(strCurrentName2) || zVarFindCreatorProperty != null) {
                    if (zVarFindCreatorProperty == null) {
                        z zVarFind2 = cVar.find(strCurrentName2);
                        if (zVarFind2 != null) {
                            if (zVarNextToken.isScalarValue()) {
                                jVarStart.handleTypePropertyValue(uVar, kVar, strCurrentName2, null);
                            }
                            if (activeView2 == null || zVarFind2.visibleInView(activeView2)) {
                                h0VarStartBuilding.bufferProperty(zVarFind2, zVarFind2.deserialize(uVar, kVar));
                            } else {
                                uVar.skipChildren();
                            }
                        } else if (!jVarStart.handlePropertyValue(uVar, kVar, strCurrentName2, null)) {
                            if (dd.r.shouldIgnore(strCurrentName2, set, set2)) {
                                c0(uVar, kVar, handledType(), strCurrentName2);
                            } else {
                                x xVar = this.f74172p;
                                if (xVar != null) {
                                    h0VarStartBuilding.bufferAnyProperty(xVar, strCurrentName2, xVar.deserialize(uVar, kVar));
                                } else {
                                    f0(uVar, kVar, this.f78945b, strCurrentName2);
                                }
                            }
                        }
                    } else if (!jVarStart.handlePropertyValue(uVar, kVar, strCurrentName2, null) && h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, j0(uVar, kVar, zVarFindCreatorProperty))) {
                        uVar.nextToken();
                        try {
                            Object objBuild = a0Var.build(kVar, h0VarStartBuilding);
                            return objBuild.getClass() != oVar.getRawClass() ? kVar.reportBadDefinition(oVar, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", oVar, objBuild.getClass())) : k0(uVar, kVar, objBuild, jVarStart);
                        } catch (Exception e11) {
                            wrapAndThrow(e11, oVar.getRawClass(), strCurrentName2, kVar);
                        }
                    }
                }
                zVarCurrentToken = uVar.nextToken();
            }
            try {
                return jVarStart.complete(uVar, kVar, h0VarStartBuilding, a0Var);
            } catch (Exception e12) {
                return i0(e12, kVar);
            }
        }
        jc.q qVar2 = this.f74165i;
        if (qVar2 != null) {
            return c0Var.createUsingDelegate(kVar, qVar2.deserialize(uVar, kVar));
        }
        nc.a0 a0Var2 = this.f74167k;
        if (a0Var2 == null) {
            k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            k0VarBufferForInputBuffering.writeStartObject();
            Object objCreateUsingDefault2 = c0Var.createUsingDefault(kVar);
            uVar.assignCurrentValue(objCreateUsingDefault2);
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDefault2);
            }
            Class<?> activeView3 = z11 ? kVar.getActiveView() : null;
            String strCurrentName3 = uVar.hasTokenId(5) ? uVar.currentName() : null;
            while (strCurrentName3 != null) {
                uVar.nextToken();
                z zVarFind3 = cVar.find(strCurrentName3);
                if (zVarFind3 != null) {
                    if (activeView3 == null || zVarFind3.visibleInView(activeView3)) {
                        try {
                            zVarFind3.deserializeAndSet(uVar, kVar, objCreateUsingDefault2);
                        } catch (Exception e13) {
                            wrapAndThrow(e13, objCreateUsingDefault2, strCurrentName3, kVar);
                        }
                    } else {
                        uVar.skipChildren();
                    }
                } else if (dd.r.shouldIgnore(strCurrentName3, set, set2)) {
                    c0(uVar, kVar, objCreateUsingDefault2, strCurrentName3);
                } else if (this.f74172p == null) {
                    k0VarBufferForInputBuffering.writeFieldName(strCurrentName3);
                    k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
                } else {
                    k0 k0VarBufferAsCopyOfValue = kVar.bufferAsCopyOfValue(uVar);
                    k0VarBufferForInputBuffering.writeFieldName(strCurrentName3);
                    k0VarBufferForInputBuffering.append(k0VarBufferAsCopyOfValue);
                    try {
                        this.f74172p.deserializeAndSet(k0VarBufferAsCopyOfValue.asParserOnFirstToken(), kVar, objCreateUsingDefault2, strCurrentName3);
                    } catch (Exception e14) {
                        wrapAndThrow(e14, objCreateUsingDefault2, strCurrentName3, kVar);
                    }
                }
                strCurrentName3 = uVar.nextFieldName();
            }
            k0VarBufferForInputBuffering.writeEndObject();
            this.f74179w.processUnwrapped(uVar, kVar, objCreateUsingDefault2, k0VarBufferForInputBuffering);
            return objCreateUsingDefault2;
        }
        h0 h0VarStartBuilding2 = a0Var2.startBuilding(uVar, kVar, wVar);
        k0 k0VarBufferForInputBuffering2 = kVar.bufferForInputBuffering(uVar);
        k0VarBufferForInputBuffering2.writeStartObject();
        ub.z zVarCurrentToken2 = uVar.currentToken();
        while (zVarCurrentToken2 == ub.z.FIELD_NAME) {
            String strCurrentName4 = uVar.currentName();
            uVar.nextToken();
            z zVarFindCreatorProperty2 = a0Var2.findCreatorProperty(strCurrentName4);
            if (!h0VarStartBuilding2.readIdProperty(strCurrentName4) || zVarFindCreatorProperty2 != null) {
                if (zVarFindCreatorProperty2 == null) {
                    z zVarFind4 = cVar.find(strCurrentName4);
                    if (zVarFind4 != null) {
                        h0VarStartBuilding2.bufferProperty(zVarFind4, j0(uVar, kVar, zVarFind4));
                    } else if (dd.r.shouldIgnore(strCurrentName4, set, set2)) {
                        c0(uVar, kVar, handledType(), strCurrentName4);
                    } else if (this.f74172p == null) {
                        k0VarBufferForInputBuffering2.writeFieldName(strCurrentName4);
                        k0VarBufferForInputBuffering2.copyCurrentStructure(uVar);
                    } else {
                        k0 k0VarBufferAsCopyOfValue2 = kVar.bufferAsCopyOfValue(uVar);
                        k0VarBufferForInputBuffering2.writeFieldName(strCurrentName4);
                        k0VarBufferForInputBuffering2.append(k0VarBufferAsCopyOfValue2);
                        try {
                            x xVar2 = this.f74172p;
                            h0VarStartBuilding2.bufferAnyProperty(xVar2, strCurrentName4, xVar2.deserialize(k0VarBufferAsCopyOfValue2.asParserOnFirstToken(), kVar));
                        } catch (Exception e15) {
                            wrapAndThrow(e15, oVar.getRawClass(), strCurrentName4, kVar);
                        }
                    }
                } else if (h0VarStartBuilding2.assignParameter(zVarFindCreatorProperty2, j0(uVar, kVar, zVarFindCreatorProperty2))) {
                    ub.z zVarNextToken2 = uVar.nextToken();
                    try {
                        objI0 = a0Var2.build(kVar, h0VarStartBuilding2);
                    } catch (Exception e16) {
                        objI0 = i0(e16, kVar);
                    }
                    uVar.assignCurrentValue(objI0);
                    if (objI0 == null) {
                        l0(uVar, kVar, null, null);
                        return null;
                    }
                    while (zVarNextToken2 == ub.z.FIELD_NAME) {
                        k0VarBufferForInputBuffering2.copyCurrentStructure(uVar);
                        zVarNextToken2 = uVar.nextToken();
                    }
                    ub.z zVar = ub.z.END_OBJECT;
                    if (zVarNextToken2 != zVar) {
                        kVar.reportWrongTokenException(this, zVar, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    k0VarBufferForInputBuffering2.writeEndObject();
                    return objI0.getClass() != oVar.getRawClass() ? kVar.reportInputMismatch(zVarFindCreatorProperty2, "Cannot create polymorphic instances with unwrapped values", new Object[0]) : this.f74179w.processUnwrapped(uVar, kVar, objI0, k0VarBufferForInputBuffering2);
                }
            }
            zVarCurrentToken2 = uVar.nextToken();
        }
        try {
            Object objBuild2 = a0Var2.build(kVar, this.f74179w.processUnwrappedCreatorProperties(uVar, kVar, h0VarStartBuilding2, k0VarBufferForInputBuffering2));
            if (objBuild2 == null) {
                return null;
            }
            return this.f74179w.processUnwrapped(uVar, kVar, objBuild2, k0VarBufferForInputBuffering2);
        } catch (Exception e17) {
            return i0(e17, kVar);
        }
    }

    public final Object j0(ub.u uVar, jc.k kVar, z zVar) {
        try {
            return zVar.deserialize(uVar, kVar);
        } catch (Exception e10) {
            return wrapAndThrow(e10, this.f74162f.getRawClass(), zVar.getName(), kVar);
        }
    }

    public final Object k0(ub.u uVar, jc.k kVar, Object obj, nc.j jVar) throws IOException {
        Class<?> activeView = this.f74176t ? kVar.getActiveView() : null;
        ub.z zVarCurrentToken = uVar.currentToken();
        while (zVarCurrentToken == ub.z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            ub.z zVarNextToken = uVar.nextToken();
            z zVarFind = this.f74170n.find(strCurrentName);
            if (zVarFind != null) {
                if (zVarNextToken.isScalarValue()) {
                    jVar.handleTypePropertyValue(uVar, kVar, strCurrentName, obj);
                }
                if (activeView == null || zVarFind.visibleInView(activeView)) {
                    try {
                        zVarFind.deserializeAndSet(uVar, kVar, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, strCurrentName, kVar);
                    }
                } else {
                    uVar.skipChildren();
                }
            } else if (dd.r.shouldIgnore(strCurrentName, this.f74173q, this.f74174r)) {
                c0(uVar, kVar, obj, strCurrentName);
            } else if (!jVar.handlePropertyValue(uVar, kVar, strCurrentName, obj)) {
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
        return jVar.complete(uVar, kVar, obj);
    }

    public final void l0(ub.u uVar, jc.k kVar, k0 k0Var, ArrayList arrayList) throws IOException {
        if (uVar != null) {
            ub.z zVarCurrentToken = uVar.currentToken();
            while (zVarCurrentToken == ub.z.FIELD_NAME) {
                uVar.nextToken();
                uVar.skipChildren();
                zVarCurrentToken = uVar.nextToken();
            }
        }
        if (k0Var != null) {
            e0(kVar, null, k0Var);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).setBean(null);
            }
        }
    }

    public final Object m0(ub.u uVar, jc.k kVar, Object obj, Class cls) throws IOException {
        if (uVar.hasTokenId(5)) {
            uVar.assignCurrentValue(obj);
            String strCurrentName = uVar.currentName();
            do {
                uVar.nextToken();
                z zVarFind = this.f74170n.find(strCurrentName);
                if (zVarFind == null) {
                    g0(uVar, kVar, obj, strCurrentName);
                } else if (zVarFind.visibleInView(cls)) {
                    try {
                        zVarFind.deserializeAndSet(uVar, kVar, obj);
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
                strCurrentName = uVar.nextFieldName();
            } while (strCurrentName != null);
        }
        return obj;
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
            return objCreateUsingArrayDelegate;
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
            if (zIsEnabled) {
                ub.z zVar2 = ub.z.START_ARRAY;
                if (zVarNextToken == zVar2) {
                    jc.o valueType = getValueType(kVar);
                    return kVar.handleUnexpectedToken(valueType, zVar2, uVar2, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", dd.i.getTypeDescription(valueType), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                }
                Object objDeserialize = deserialize(uVar2, kVar);
                if (uVar2.nextToken() != zVar) {
                    T(kVar);
                }
                return objDeserialize;
            }
            kVar2 = kVar;
        } else {
            uVar2 = uVar;
            kVar2 = kVar;
        }
        return kVar2.handleUnexpectedToken(getValueType(kVar2), uVar2);
    }

    public final Object n0(ub.u uVar, jc.k kVar) throws IOException {
        Object objCreateUsingDefault = this.f74164h.createUsingDefault(kVar);
        if (uVar.hasTokenId(5)) {
            uVar.assignCurrentValue(objCreateUsingDefault);
            String strCurrentName = uVar.currentName();
            do {
                uVar.nextToken();
                z zVarFind = this.f74170n.find(strCurrentName);
                if (zVarFind != null) {
                    try {
                        zVarFind.deserializeAndSet(uVar, kVar, objCreateUsingDefault);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objCreateUsingDefault, strCurrentName, kVar);
                    }
                } else {
                    g0(uVar, kVar, objCreateUsingDefault, strCurrentName);
                }
                strCurrentName = uVar.nextFieldName();
            } while (strCurrentName != null);
        }
        return objCreateUsingDefault;
    }

    @Override // mc.f, jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        if (getClass() != e.class || this.A == a0Var) {
            return this;
        }
        this.A = a0Var;
        try {
            return new e(this, a0Var);
        } finally {
            this.A = null;
        }
    }

    @Override // mc.f
    public f withBeanProperties(nc.c cVar) {
        return new e(this, cVar);
    }

    @Override // mc.f
    public /* bridge */ /* synthetic */ f withByNameInclusion(Set set, Set set2) {
        return withByNameInclusion((Set<String>) set, (Set<String>) set2);
    }

    @Override // mc.f
    public f withIgnoreAllUnknown(boolean z10) {
        return new e(this, z10);
    }

    public e(g gVar, jc.d dVar, nc.c cVar, Map<String, z> map, HashSet<String> hashSet, boolean z10, Set<String> set, boolean z11) {
        super(gVar, dVar, cVar, map, hashSet, z10, set, z11);
    }

    @Override // mc.f
    public e withByNameInclusion(Set<String> set, Set<String> set2) {
        return new e(this, set, set2);
    }

    @Override // mc.f
    public e withObjectIdReader(nc.w wVar) {
        return new e(this, wVar);
    }

    public e(f fVar, nc.w wVar) {
        super(fVar, wVar);
    }

    public e(f fVar, Set<String> set, Set<String> set2) {
        super(fVar, set, set2);
    }

    public e(f fVar, nc.c cVar) {
        super(fVar, cVar);
    }

    @Deprecated
    public e(f fVar, Set<String> set) {
        super(fVar, set, fVar.f74174r);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // jc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(ub.u r7, jc.k r8, java.lang.Object r9) throws java.lang.UnsupportedOperationException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            r7.assignCurrentValue(r9)
            nc.n0[] r0 = r6.f74171o
            if (r0 == 0) goto La
            r6.h0(r8, r9)
        La:
            nc.m0 r0 = r6.f74179w
            nc.c r1 = r6.f74170n
            boolean r2 = r6.f74176t
            if (r0 == 0) goto L92
            ub.z r0 = r7.currentToken()
            ub.z r3 = ub.z.START_OBJECT
            if (r0 != r3) goto L1e
            ub.z r0 = r7.nextToken()
        L1e:
            dd.k0 r3 = r8.bufferForInputBuffering(r7)
            r3.writeStartObject()
            if (r2 == 0) goto L2c
            java.lang.Class r2 = r8.getActiveView()
            goto L2d
        L2c:
            r2 = 0
        L2d:
            ub.z r4 = ub.z.FIELD_NAME
            if (r0 != r4) goto L89
            java.lang.String r0 = r7.currentName()
            mc.z r4 = r1.find(r0)
            r7.nextToken()
            if (r4 == 0) goto L53
            if (r2 == 0) goto L4a
            boolean r5 = r4.visibleInView(r2)
            if (r5 != 0) goto L4a
            r7.skipChildren()
            goto L84
        L4a:
            r4.deserializeAndSet(r7, r8, r9)     // Catch: java.lang.Exception -> L4e
            goto L84
        L4e:
            r4 = move-exception
            r6.wrapAndThrow(r4, r9, r0, r8)
            goto L84
        L53:
            java.util.Set r4 = r6.f74173q
            java.util.Set r5 = r6.f74174r
            boolean r4 = dd.r.shouldIgnore(r0, r4, r5)
            if (r4 == 0) goto L61
            r6.c0(r7, r8, r9, r0)
            goto L84
        L61:
            mc.x r4 = r6.f74172p
            if (r4 != 0) goto L6c
            r3.writeFieldName(r0)
            r3.copyCurrentStructure(r7)
            goto L84
        L6c:
            dd.k0 r4 = r8.bufferAsCopyOfValue(r7)
            r3.writeFieldName(r0)
            r3.append(r4)
            mc.x r5 = r6.f74172p     // Catch: java.lang.Exception -> L80
            ub.u r4 = r4.asParserOnFirstToken()     // Catch: java.lang.Exception -> L80
            r5.deserializeAndSet(r4, r8, r9, r0)     // Catch: java.lang.Exception -> L80
            goto L84
        L80:
            r4 = move-exception
            r6.wrapAndThrow(r4, r9, r0, r8)
        L84:
            ub.z r0 = r7.nextToken()
            goto L2d
        L89:
            r3.writeEndObject()
            nc.m0 r0 = r6.f74179w
            r0.processUnwrapped(r7, r8, r9, r3)
            return r9
        L92:
            nc.j r0 = r6.f74180x
            if (r0 == 0) goto L9f
            nc.j r0 = r0.start()
            java.lang.Object r7 = r6.k0(r7, r8, r9, r0)
            return r7
        L9f:
            boolean r0 = r7.isExpectedStartObjectToken()
            if (r0 == 0) goto Lac
            java.lang.String r0 = r7.nextFieldName()
            if (r0 != 0) goto Lb7
            goto Lde
        Lac:
            r0 = 5
            boolean r0 = r7.hasTokenId(r0)
            if (r0 == 0) goto Lde
            java.lang.String r0 = r7.currentName()
        Lb7:
            if (r2 == 0) goto Lc3
            java.lang.Class r2 = r8.getActiveView()
            if (r2 == 0) goto Lc3
            r6.m0(r7, r8, r9, r2)
            return r9
        Lc3:
            r7.nextToken()
            mc.z r2 = r1.find(r0)
            if (r2 == 0) goto Ld5
            r2.deserializeAndSet(r7, r8, r9)     // Catch: java.lang.Exception -> Ld0
            goto Ld8
        Ld0:
            r2 = move-exception
            r6.wrapAndThrow(r2, r9, r0, r8)
            goto Ld8
        Ld5:
            r6.g0(r7, r8, r9, r0)
        Ld8:
            java.lang.String r0 = r7.nextFieldName()
            if (r0 != 0) goto Lc3
        Lde:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.e.deserialize(ub.u, jc.k, java.lang.Object):java.lang.Object");
    }
}
