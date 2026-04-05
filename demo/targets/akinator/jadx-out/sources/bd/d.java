package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d extends z0 implements zc.j, zc.q {

    /* renamed from: l, reason: collision with root package name */
    public static final zc.d[] f9061l;

    /* renamed from: e, reason: collision with root package name */
    public final jc.o f9062e;

    /* renamed from: f, reason: collision with root package name */
    public final zc.d[] f9063f;

    /* renamed from: g, reason: collision with root package name */
    public final zc.d[] f9064g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9065h;

    /* renamed from: i, reason: collision with root package name */
    public final rc.l f9066i;

    /* renamed from: j, reason: collision with root package name */
    public final ad.l f9067j;

    /* renamed from: k, reason: collision with root package name */
    public final tb.s f9068k;

    static {
        new jc.n0("#object-ref");
        f9061l = new zc.d[0];
    }

    public d(jc.o oVar, zc.f fVar, zc.d[] dVarArr, zc.d[] dVarArr2) {
        super(oVar);
        this.f9062e = oVar;
        this.f9063f = dVarArr;
        this.f9064g = dVarArr2;
        if (fVar == null) {
            this.f9066i = null;
            this.f9065h = null;
            this.f9067j = null;
            this.f9068k = null;
            return;
        }
        this.f9066i = fVar.getTypeId();
        this.f9065h = fVar.getFilterId();
        this.f9067j = fVar.getObjectIdWriter();
        this.f9068k = fVar.getBeanDescription().findExpectedFormat().getShape();
    }

    public static final zc.d[] i(zc.d[] dVarArr, dd.a0 a0Var) {
        if (dVarArr == null || dVarArr.length == 0 || a0Var == null || a0Var == dd.a0.f51985b) {
            return dVarArr;
        }
        int length = dVarArr.length;
        zc.d[] dVarArr2 = new zc.d[length];
        for (int i10 = 0; i10 < length; i10++) {
            zc.d dVar = dVarArr[i10];
            if (dVar != null) {
                dVarArr2[i10] = dVar.rename(a0Var);
            }
        }
        return dVarArr2;
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        if (hVar == null) {
            return;
        }
        hVar.expectObjectFormat(oVar);
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.s shape;
        Object obj;
        tb.s sVar;
        int i10;
        ad.l lVarConstruct;
        Object objFindFilterId;
        Set<String> set;
        Set<String> setFindIgnoredForSerialization;
        int i11;
        d dVarWithFilterId;
        ad.l lVarWithSerializer;
        zc.d[] dVarArr;
        Set<String> set2;
        int i12;
        int i13;
        zc.d dVar;
        rc.t0 t0VarFindObjectReferenceInfo;
        jc.c annotationIntrospector = u0Var.getAnnotationIntrospector();
        rc.l member = (gVar == null || annotationIntrospector == null) ? null : gVar.getMember();
        jc.s0 config = u0Var.getConfig();
        Class cls = this.f9159b;
        tb.t tVarC = z0.c(cls, u0Var, gVar);
        tb.s sVar2 = this.f9068k;
        jc.o oVar = this.f9062e;
        if (tVarC == null || !tVarC.hasShape()) {
            shape = null;
        } else {
            shape = tVarC.getShape();
            if (shape != tb.s.f86775k && shape != sVar2) {
                if (oVar.isEnumType()) {
                    int iOrdinal = shape.ordinal();
                    if (iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 5) {
                        return u0Var.handlePrimaryContextualization(m.construct(oVar.getRawClass(), u0Var.getConfig(), config.introspectClassAnnotations(oVar), tVarC), gVar);
                    }
                } else if (shape == tb.s.f86776l && ((!oVar.isMapLikeType() || !Map.class.isAssignableFrom(cls)) && Map.Entry.class.isAssignableFrom(cls))) {
                    jc.o oVarFindSuperType = oVar.findSuperType(Map.Entry.class);
                    return u0Var.handlePrimaryContextualization(new ad.k(this.f9062e, oVarFindSuperType.containedTypeOrUnknown(0), oVarFindSuperType.containedTypeOrUnknown(1), false, null, gVar), gVar);
                }
            }
        }
        zc.d[] dVarArr2 = this.f9063f;
        ad.l lVar = this.f9067j;
        if (member != null) {
            setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            Set<String> included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            rc.t0 t0VarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (t0VarFindObjectIdInfo == null) {
                if (lVar == null || (t0VarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) == null) {
                    obj = null;
                    set2 = included;
                    lVarConstruct = lVar;
                } else {
                    lVarConstruct = lVar.withAlwaysAsId(t0VarFindObjectReferenceInfo.getAlwaysAsId());
                    obj = null;
                    set2 = included;
                }
                sVar = sVar2;
                i11 = 0;
                i10 = 0;
            } else {
                rc.t0 t0VarFindObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, t0VarFindObjectIdInfo);
                Class<? extends tb.f1> generatorType = t0VarFindObjectReferenceInfo2.getGeneratorType();
                i10 = 0;
                set2 = included;
                jc.o oVar2 = u0Var.getTypeFactory().findTypeParameters(u0Var.constructType(generatorType), tb.f1.class)[0];
                if (generatorType == i1.class) {
                    String simpleName = t0VarFindObjectReferenceInfo2.getPropertyName().getSimpleName();
                    int length = dVarArr2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 == length) {
                            i12 = i14;
                            sVar = sVar2;
                            i13 = length;
                            u0Var.reportBadDefinition(oVar, a.b.m("Invalid Object Id definition for ", dd.i.nameOf((Class<?>) handledType()), ": cannot find property with name ", dd.i.name(simpleName)));
                        } else {
                            i12 = i14;
                            sVar = sVar2;
                            i13 = length;
                        }
                        dVar = dVarArr2[i12];
                        if (simpleName.equals(dVar.getName())) {
                            break;
                        }
                        i14 = i12 + 1;
                        sVar2 = sVar;
                        length = i13;
                    }
                    obj = null;
                    lVarConstruct = ad.l.construct(dVar.getType(), null, new ad.m(t0VarFindObjectReferenceInfo2, dVar), t0VarFindObjectReferenceInfo2.getAlwaysAsId());
                    i11 = i12;
                } else {
                    sVar = sVar2;
                    obj = null;
                    lVarConstruct = ad.l.construct(oVar2, t0VarFindObjectReferenceInfo2.getPropertyName(), u0Var.objectIdGeneratorInstance(member, t0VarFindObjectReferenceInfo2), t0VarFindObjectReferenceInfo2.getAlwaysAsId());
                    i11 = 0;
                }
            }
            objFindFilterId = annotationIntrospector.findFilterId(member);
            if (objFindFilterId == null || objFindFilterId.equals(this.f9065h)) {
                objFindFilterId = obj;
            }
            set = set2;
        } else {
            obj = null;
            sVar = sVar2;
            i10 = 0;
            lVarConstruct = lVar;
            objFindFilterId = null;
            set = null;
            setFindIgnoredForSerialization = null;
            i11 = 0;
        }
        if (i11 > 0) {
            zc.d[] dVarArr3 = (zc.d[]) Arrays.copyOf(dVarArr2, dVarArr2.length);
            zc.d dVar2 = dVarArr3[i11];
            int i15 = i10;
            System.arraycopy(dVarArr3, i15, dVarArr3, 1, i11);
            dVarArr3[i15] = dVar2;
            zc.d[] dVarArr4 = this.f9064g;
            if (dVarArr4 == null) {
                dVarArr = obj;
            } else {
                zc.d[] dVarArr5 = (zc.d[]) Arrays.copyOf(dVarArr4, dVarArr4.length);
                zc.d dVar3 = dVarArr5[i11];
                System.arraycopy(dVarArr5, i15, dVarArr5, 1, i11);
                dVarArr5[i15] = dVar3;
                dVarArr = dVarArr5;
            }
            dVarWithFilterId = m(dVarArr3, dVarArr);
        } else {
            dVarWithFilterId = this;
        }
        if (lVarConstruct != null && (lVarWithSerializer = lVarConstruct.withSerializer(u0Var.findValueSerializer(lVarConstruct.f4278a, gVar))) != lVar) {
            dVarWithFilterId = dVarWithFilterId.withObjectIdWriter(lVarWithSerializer);
        }
        if ((setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty()) || set != null) {
            dVarWithFilterId = dVarWithFilterId.l(setFindIgnoredForSerialization, set);
        }
        if (objFindFilterId != null) {
            dVarWithFilterId = dVarWithFilterId.withFilterId(objFindFilterId);
        }
        return (shape == null ? sVar : shape) == tb.s.f86773i ? dVarWithFilterId.h() : dVarWithFilterId;
    }

    public final void e(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        ad.l lVar = this.f9067j;
        ad.h0 h0VarFindObjectId = u0Var.findObjectId(obj, lVar.f4280c);
        if (h0VarFindObjectId.writeAsId(oVar, u0Var, lVar)) {
            return;
        }
        Object objGenerateId = h0VarFindObjectId.generateId(obj);
        if (lVar.f4282e) {
            lVar.f4281d.serialize(objGenerateId, oVar, u0Var);
            return;
        }
        hc.c cVarG = g(jVar, obj, ub.z.START_OBJECT);
        jVar.writeTypePrefix(oVar, cVarG);
        oVar.assignCurrentValue(obj);
        h0VarFindObjectId.writeAsField(oVar, u0Var, lVar);
        if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
        jVar.writeTypeSuffix(oVar, cVarG);
    }

    public final void f(Object obj, ub.o oVar, jc.u0 u0Var, boolean z10) throws IOException {
        ad.l lVar = this.f9067j;
        ad.h0 h0VarFindObjectId = u0Var.findObjectId(obj, lVar.f4280c);
        if (h0VarFindObjectId.writeAsId(oVar, u0Var, lVar)) {
            return;
        }
        Object objGenerateId = h0VarFindObjectId.generateId(obj);
        if (lVar.f4282e) {
            lVar.f4281d.serialize(objGenerateId, oVar, u0Var);
            return;
        }
        if (z10) {
            oVar.writeStartObject(obj);
        }
        h0VarFindObjectId.writeAsField(oVar, u0Var, lVar);
        if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
        if (z10) {
            oVar.writeEndObject();
        }
    }

    public final hc.c g(wc.j jVar, Object obj, ub.z zVar) throws UnsupportedOperationException, IllegalArgumentException {
        rc.l lVar = this.f9066i;
        if (lVar == null) {
            return jVar.typeId(obj, zVar);
        }
        Object value = lVar.getValue(obj);
        if (value == null) {
            value = "";
        }
        return jVar.typeId(obj, zVar, value);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        String strId;
        yc.v vVarA = z0.a("object");
        vc.b bVar = (vc.b) this.f9159b.getAnnotation(vc.b.class);
        if (bVar != null && (strId = bVar.id()) != null && !strId.isEmpty()) {
            vVarA.put("id", strId);
        }
        yc.v vVarObjectNode = vVarA.objectNode();
        Object obj = this.f9065h;
        zc.o oVarD = obj != null ? d(u0Var, obj, null) : null;
        int i10 = 0;
        while (true) {
            zc.d[] dVarArr = this.f9063f;
            if (i10 >= dVarArr.length) {
                vVarA.set("properties", vVarObjectNode);
                return vVarA;
            }
            zc.d dVar = dVarArr[i10];
            if (oVarD == null) {
                dVar.depositSchemaProperty(vVarObjectNode, u0Var);
            } else {
                oVarD.depositSchemaProperty(dVar, vVarObjectNode, u0Var);
            }
            i10++;
        }
    }

    public abstract d h();

    public final void j(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        zc.d[] dVarArr = this.f9064g;
        if (dVarArr == null || u0Var.getActiveView() == null) {
            dVarArr = this.f9063f;
        }
        int i10 = 0;
        try {
            int length = dVarArr.length;
            while (i10 < length) {
                zc.d dVar = dVarArr[i10];
                if (dVar != null) {
                    dVar.serializeAsField(obj, oVar, u0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, i10 != dVarArr.length ? dVarArr[i10].getName() : "[anySetter]");
        } catch (StackOverflowError e11) {
            jc.r rVar = new jc.r(oVar, "Infinite recursion (StackOverflowError)", e11);
            rVar.prependPath(obj, i10 != dVarArr.length ? dVarArr[i10].getName() : "[anySetter]");
            throw rVar;
        }
    }

    public final void k(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        zc.d[] dVarArr = this.f9064g;
        if (dVarArr == null || u0Var.getActiveView() == null) {
            dVarArr = this.f9063f;
        }
        zc.o oVarD = d(u0Var, this.f9065h, obj);
        if (oVarD == null) {
            j(obj, oVar, u0Var);
            return;
        }
        int i10 = 0;
        try {
            int length = dVarArr.length;
            while (i10 < length) {
                zc.d dVar = dVarArr[i10];
                if (dVar != null) {
                    oVarD.serializeAsField(obj, oVar, u0Var, dVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, i10 != dVarArr.length ? dVarArr[i10].getName() : "[anySetter]");
        } catch (StackOverflowError e11) {
            jc.r rVar = new jc.r(oVar, "Infinite recursion (StackOverflowError)", e11);
            rVar.prependPath(obj, i10 != dVarArr.length ? dVarArr[i10].getName() : "[anySetter]");
            throw rVar;
        }
    }

    public abstract d l(Set set, Set set2);

    public abstract d m(zc.d[] dVarArr, zc.d[] dVarArr2);

    @Override // jc.w
    public Iterator<zc.p> properties() {
        return Arrays.asList(this.f9063f).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    @Override // zc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolve(jc.u0 r12) throws jc.r {
        /*
            r11 = this;
            r0 = 0
            zc.d[] r1 = r11.f9064g
            if (r1 != 0) goto L7
            r2 = r0
            goto L8
        L7:
            int r2 = r1.length
        L8:
            zc.d[] r3 = r11.f9063f
            int r4 = r3.length
            r5 = r0
        Lc:
            if (r5 >= r4) goto Lbf
            r6 = r3[r5]
            boolean r7 = r6.willSuppressNulls()
            if (r7 != 0) goto L2e
            boolean r7 = r6.hasNullSerializer()
            if (r7 != 0) goto L2e
            jc.w r7 = r12.findNullValueSerializer(r6)
            if (r7 == 0) goto L2e
            r6.assignNullSerializer(r7)
            if (r5 >= r2) goto L2e
            r8 = r1[r5]
            if (r8 == 0) goto L2e
            r8.assignNullSerializer(r7)
        L2e:
            boolean r7 = r6.hasSerializer()
            if (r7 == 0) goto L36
            goto Lbb
        L36:
            jc.c r7 = r12.getAnnotationIntrospector()
            r8 = 0
            if (r7 == 0) goto L6c
            rc.l r9 = r6.getMember()
            if (r9 == 0) goto L6c
            java.lang.Object r7 = r7.findSerializationConverter(r9)
            if (r7 == 0) goto L6c
            rc.l r9 = r6.getMember()
            dd.m r7 = r12.converterInstance(r9, r7)
            cd.s r9 = r12.getTypeFactory()
            nc.o r7 = (nc.o) r7
            jc.o r9 = r7.getOutputType(r9)
            boolean r10 = r9.isJavaLangObject()
            if (r10 == 0) goto L62
            goto L66
        L62:
            jc.w r8 = r12.findValueSerializer(r9, r6)
        L66:
            bd.t0 r10 = new bd.t0
            r10.<init>(r7, r9, r8)
            r8 = r10
        L6c:
            if (r8 != 0) goto Lae
            jc.o r7 = r6.getSerializationType()
            if (r7 != 0) goto L8e
            jc.o r7 = r6.getType()
            boolean r8 = r7.isFinal()
            if (r8 != 0) goto L8e
            boolean r8 = r7.isContainerType()
            if (r8 != 0) goto L8a
            int r8 = r7.containedTypeCount()
            if (r8 <= 0) goto Lbb
        L8a:
            r6.setNonTrivialBaseType(r7)
            goto Lbb
        L8e:
            jc.w r8 = r12.findValueSerializer(r7, r6)
            boolean r9 = r7.isContainerType()
            if (r9 == 0) goto Lae
            jc.o r7 = r7.getContentType()
            java.lang.Object r7 = r7.getTypeHandler()
            wc.j r7 = (wc.j) r7
            if (r7 == 0) goto Lae
            boolean r9 = r8 instanceof zc.i
            if (r9 == 0) goto Lae
            zc.i r8 = (zc.i) r8
            zc.i r8 = r8.withValueTypeSerializer(r7)
        Lae:
            if (r5 >= r2) goto Lb8
            r7 = r1[r5]
            if (r7 == 0) goto Lb8
            r7.assignSerializer(r8)
            goto Lbb
        Lb8:
            r6.assignSerializer(r8)
        Lbb:
            int r5 = r5 + 1
            goto Lc
        Lbf:
            int r1 = r3.length
            if (r0 >= r1) goto Ld0
            r1 = r3[r0]
            boolean r2 = r1 instanceof zc.a
            if (r2 == 0) goto Lcd
            zc.a r1 = (zc.a) r1
            r1.resolve(r12)
        Lcd:
            int r0 = r0 + 1
            goto Lbf
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.d.resolve(jc.u0):void");
    }

    @Override // bd.z0, jc.w
    public abstract void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException;

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (this.f9067j != null) {
            e(obj, oVar, u0Var, jVar);
            return;
        }
        hc.c cVarG = g(jVar, obj, ub.z.START_OBJECT);
        jVar.writeTypePrefix(oVar, cVarG);
        oVar.assignCurrentValue(obj);
        if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
        jVar.writeTypeSuffix(oVar, cVarG);
    }

    @Override // jc.w
    public boolean usesObjectId() {
        return this.f9067j != null;
    }

    @Override // jc.w
    public abstract d withFilterId(Object obj);

    public abstract d withObjectIdWriter(ad.l lVar);

    public d(d dVar, zc.d[] dVarArr, zc.d[] dVarArr2) {
        super(dVar.f9159b);
        this.f9062e = dVar.f9062e;
        this.f9063f = dVarArr;
        this.f9064g = dVarArr2;
        this.f9066i = dVar.f9066i;
        this.f9067j = dVar.f9067j;
        this.f9065h = dVar.f9065h;
        this.f9068k = dVar.f9068k;
    }

    public d(d dVar, ad.l lVar) {
        this(dVar, lVar, dVar.f9065h);
    }

    public d(d dVar, ad.l lVar, Object obj) {
        super(dVar.f9159b);
        this.f9062e = dVar.f9062e;
        this.f9063f = dVar.f9063f;
        this.f9064g = dVar.f9064g;
        this.f9066i = dVar.f9066i;
        this.f9067j = lVar;
        this.f9065h = obj;
        this.f9068k = dVar.f9068k;
    }

    public d(d dVar, Set set, Set set2) {
        super(dVar.f9159b);
        this.f9062e = dVar.f9062e;
        zc.d[] dVarArr = dVar.f9063f;
        zc.d[] dVarArr2 = dVar.f9064g;
        int length = dVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = dVarArr2 == null ? null : new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            zc.d dVar2 = dVarArr[i10];
            if (!dd.r.shouldIgnore(dVar2.getName(), set, set2)) {
                arrayList.add(dVar2);
                if (dVarArr2 != null) {
                    arrayList2.add(dVarArr2[i10]);
                }
            }
        }
        this.f9063f = (zc.d[]) arrayList.toArray(new zc.d[arrayList.size()]);
        this.f9064g = arrayList2 != null ? (zc.d[]) arrayList2.toArray(new zc.d[arrayList2.size()]) : null;
        this.f9066i = dVar.f9066i;
        this.f9067j = dVar.f9067j;
        this.f9065h = dVar.f9065h;
        this.f9068k = dVar.f9068k;
    }
}
