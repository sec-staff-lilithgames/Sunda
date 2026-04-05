package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends zc.i implements zc.j {

    /* renamed from: t, reason: collision with root package name */
    public static final jc.o f9128t = cd.s.unknownType();

    /* renamed from: u, reason: collision with root package name */
    public static final tb.c0 f9129u = tb.c0.f86696e;

    /* renamed from: e, reason: collision with root package name */
    public final jc.g f9130e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9131f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.o f9132g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.o f9133h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.w f9134i;

    /* renamed from: j, reason: collision with root package name */
    public final jc.w f9135j;

    /* renamed from: k, reason: collision with root package name */
    public final wc.j f9136k;

    /* renamed from: l, reason: collision with root package name */
    public ad.t f9137l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f9138m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f9139n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f9140o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f9141p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9142q;

    /* renamed from: r, reason: collision with root package name */
    public final dd.q f9143r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f9144s;

    public u(Set set, Set set2, jc.o oVar, jc.o oVar2, boolean z10, wc.j jVar, jc.w wVar, jc.w wVar2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f9138m = set;
        this.f9139n = set2;
        this.f9132g = oVar;
        this.f9133h = oVar2;
        this.f9131f = z10;
        this.f9136k = jVar;
        this.f9134i = wVar;
        this.f9135j = wVar2;
        this.f9137l = ad.t.emptyForProperties();
        this.f9130e = null;
        this.f9140o = null;
        this.f9144s = false;
        this.f9141p = null;
        this.f9142q = false;
        this.f9143r = dd.r.buildCheckerIfNeeded(set, set2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bd.u construct(java.util.Set<java.lang.String> r11, java.util.Set<java.lang.String> r12, jc.o r13, boolean r14, wc.j r15, jc.w r16, jc.w r17, java.lang.Object r18) {
        /*
            r0 = r18
            if (r13 != 0) goto L9
            jc.o r13 = bd.u.f9128t
            r5 = r13
            r6 = r5
            goto L21
        L9:
            jc.o r1 = r13.getKeyType()
            java.lang.Class<java.util.Properties> r2 = java.util.Properties.class
            boolean r2 = r13.hasRawClass(r2)
            if (r2 == 0) goto L1c
            jc.o r13 = cd.s.unknownType()
        L19:
            r6 = r13
            r5 = r1
            goto L21
        L1c:
            jc.o r13 = r13.getContentType()
            goto L19
        L21:
            r13 = 0
            if (r14 != 0) goto L30
            if (r6 == 0) goto L2d
            boolean r14 = r6.isFinal()
            if (r14 == 0) goto L2d
            r13 = 1
        L2d:
            r14 = r13
        L2e:
            r7 = r14
            goto L39
        L30:
            java.lang.Class r1 = r6.getRawClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L2e
            r7 = r13
        L39:
            bd.u r2 = new bd.u
            r3 = r11
            r4 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L4c
            bd.u r11 = r2.withFilterId(r0)
            return r11
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.u.construct(java.util.Set, java.util.Set, jc.o, boolean, wc.j, jc.w, jc.w, java.lang.Object):bd.u");
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectMapFormat(oVar);
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarSerializerInstance;
        jc.w wVarSerializerInstance2;
        boolean zBooleanValue;
        tb.c0 contentInclusion;
        Object objFindFilterId;
        Boolean feature;
        jc.c annotationIntrospector = u0Var.getAnnotationIntrospector();
        Object defaultValue = null;
        rc.l member = gVar == null ? null : gVar.getMember();
        if (member == null || annotationIntrospector == null) {
            wVarSerializerInstance = null;
            wVarSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            wVarSerializerInstance = objFindKeySerializer != null ? u0Var.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            wVarSerializerInstance2 = objFindContentSerializer != null ? u0Var.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (wVarSerializerInstance2 == null) {
            wVarSerializerInstance2 = this.f9135j;
        }
        jc.w wVarB = z0.b(u0Var, gVar, wVarSerializerInstance2);
        jc.o oVar = this.f9133h;
        if (wVarB == null && this.f9131f && !oVar.isJavaLangObject()) {
            wVarB = u0Var.findContentValueSerializer(oVar, gVar);
        }
        jc.w wVar = wVarB;
        if (wVarSerializerInstance == null) {
            wVarSerializerInstance = this.f9134i;
        }
        jc.w wVarFindKeySerializer = wVarSerializerInstance == null ? u0Var.findKeySerializer(this.f9132g, gVar) : u0Var.handleSecondaryContextualization(wVarSerializerInstance, gVar);
        boolean zIncludeFilterSuppressNulls = false;
        Set<String> hashSet = this.f9138m;
        Set<String> hashSet2 = this.f9139n;
        if (member == null || annotationIntrospector == null) {
            zBooleanValue = false;
        } else {
            jc.s0 config = u0Var.getConfig();
            Set<String> setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            if (setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty()) {
                hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                Iterator<String> it = setFindIgnoredForSerialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            Set<String> included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            if (included != null) {
                hashSet2 = hashSet2 == null ? new HashSet<>() : new HashSet(hashSet2);
                Iterator<String> it2 = included.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(it2.next());
                }
            }
            zBooleanValue = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member));
        }
        Set<String> set = hashSet;
        Set<String> set2 = hashSet2;
        tb.t tVarC = z0.c(Map.class, u0Var, gVar);
        if (tVarC != null && (feature = tVarC.getFeature(tb.q.f86759h)) != null) {
            zBooleanValue = feature.booleanValue();
        }
        u uVarWithResolved = withResolved(gVar, wVarFindKeySerializer, wVar, set, set2, zBooleanValue);
        if (member != null && (objFindFilterId = annotationIntrospector.findFilterId(member)) != null) {
            uVarWithResolved = uVarWithResolved.withFilterId(objFindFilterId);
        }
        tb.d0 d0VarFindPropertyInclusion = gVar != null ? gVar.findPropertyInclusion(u0Var.getConfig(), Map.class) : u0Var.getDefaultPropertyInclusion(Map.class);
        if (d0VarFindPropertyInclusion == null || (contentInclusion = d0VarFindPropertyInclusion.getContentInclusion()) == tb.c0.f86699h) {
            return uVarWithResolved;
        }
        int iOrdinal = contentInclusion.ordinal();
        if (iOrdinal != 1) {
            tb.c0 c0Var = f9129u;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    zIncludeFilterSuppressNulls = true;
                    defaultValue = c0Var;
                } else if (iOrdinal == 4) {
                    defaultValue = dd.f.getDefaultValue(oVar);
                    if (defaultValue != null && defaultValue.getClass().isArray()) {
                        defaultValue = dd.d.getArrayComparator(defaultValue);
                    }
                } else if (iOrdinal == 5) {
                    defaultValue = u0Var.includeFilterInstance(null, d0VarFindPropertyInclusion.getContentFilter());
                    if (defaultValue != null) {
                        zIncludeFilterSuppressNulls = u0Var.includeFilterSuppressNulls(defaultValue);
                    }
                }
            } else if (oVar.isReferenceType()) {
                defaultValue = c0Var;
            }
            zIncludeFilterSuppressNulls = true;
        } else {
            zIncludeFilterSuppressNulls = true;
        }
        return uVarWithResolved.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    public final jc.w e(jc.u0 u0Var, Object obj) throws jc.r {
        Class<?> cls = obj.getClass();
        jc.w wVarSerializerFor = this.f9137l.serializerFor(cls);
        if (wVarSerializerFor != null) {
            return wVarSerializerFor;
        }
        jc.o oVar = this.f9133h;
        boolean zHasGenericTypes = oVar.hasGenericTypes();
        jc.g gVar = this.f9130e;
        if (zHasGenericTypes) {
            ad.t tVar = this.f9137l;
            ad.q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(u0Var.constructSpecializedType(oVar, cls), u0Var, gVar);
            ad.t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
            if (tVar != tVar2) {
                this.f9137l = tVar2;
            }
            return qVarFindAndAddSecondarySerializer.f4291a;
        }
        ad.t tVar3 = this.f9137l;
        ad.q qVarFindAndAddSecondarySerializer2 = tVar3.findAndAddSecondarySerializer(cls, u0Var, gVar);
        ad.t tVar4 = qVarFindAndAddSecondarySerializer2.f4292b;
        if (tVar3 != tVar4) {
            this.f9137l = tVar4;
        }
        return qVarFindAndAddSecondarySerializer2.f4291a;
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return this.f9135j;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return this.f9133h;
    }

    public jc.w getKeySerializer() {
        return this.f9134i;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("object");
    }

    public void serializeFields(Map<?, ?> map, ub.o oVar, jc.u0 u0Var) throws IOException {
        Object obj = null;
        if (this.f9136k != null) {
            serializeTypedFields(map, oVar, u0Var, null);
            return;
        }
        jc.w wVar = this.f9134i;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        u0Var.findNullKeySerializer(this.f9132g, this.f9130e).serialize(null, oVar, u0Var);
                    } else {
                        dd.q qVar = this.f9143r;
                        if (qVar == null || !qVar.shouldIgnore(key)) {
                            wVar.serialize(key, oVar, u0Var);
                        }
                    }
                    if (value == null) {
                        u0Var.defaultSerializeNull(oVar);
                    } else {
                        jc.w wVarE = this.f9135j;
                        if (wVarE == null) {
                            wVarE = e(u0Var, value);
                        }
                        wVarE.serialize(value, oVar, u0Var);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = key;
                    wrapAndThrow(u0Var, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, ub.o oVar, jc.u0 u0Var, jc.w wVar) throws IOException {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            dd.q qVar = this.f9143r;
            if (qVar == null || !qVar.shouldIgnore(key)) {
                if (key == null) {
                    u0Var.findNullKeySerializer(this.f9132g, this.f9130e).serialize(null, oVar, u0Var);
                } else {
                    this.f9134i.serialize(key, oVar, u0Var);
                }
                Object value = entry.getValue();
                if (value == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    wc.j jVar = this.f9136k;
                    if (jVar == null) {
                        try {
                            wVar.serialize(value, oVar, u0Var);
                        } catch (Exception e10) {
                            wrapAndThrow(u0Var, e10, map, String.valueOf(key));
                        }
                    } else {
                        wVar.serializeWithType(value, oVar, u0Var, jVar);
                    }
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(jc.u0 u0Var, ub.o oVar, Object obj, Map<?, ?> map, zc.o oVar2, Object obj2) throws IOException {
        jc.w defaultNullValueSerializer;
        wc.j jVar = this.f9136k;
        jc.g gVar = this.f9130e;
        t tVar = new t(jVar, gVar);
        boolean z10 = f9129u == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            dd.q qVar = this.f9143r;
            if (qVar == null || !qVar.shouldIgnore(key)) {
                jc.w wVarFindNullKeySerializer = key == null ? u0Var.findNullKeySerializer(this.f9132g, gVar) : this.f9134i;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this.f9135j;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = e(u0Var, value);
                    }
                    if (z10) {
                        if (!defaultNullValueSerializer.isEmpty(u0Var, value)) {
                            tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                            oVar2.serializeAsField(obj, oVar, u0Var, tVar);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                        oVar2.serializeAsField(obj, oVar, u0Var, tVar);
                    }
                } else if (!this.f9142q) {
                    defaultNullValueSerializer = u0Var.getDefaultNullValueSerializer();
                    tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        oVar2.serializeAsField(obj, oVar, u0Var, tVar);
                    } catch (Exception e10) {
                        wrapAndThrow(u0Var, e10, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, ub.o oVar, jc.u0 u0Var, zc.o oVar2, Object obj) throws IOException {
        jc.w defaultNullValueSerializer;
        wc.j jVar = this.f9136k;
        jc.g gVar = this.f9130e;
        t tVar = new t(jVar, gVar);
        boolean z10 = f9129u == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            dd.q qVar = this.f9143r;
            if (qVar == null || !qVar.shouldIgnore(key)) {
                jc.w wVarFindNullKeySerializer = key == null ? u0Var.findNullKeySerializer(this.f9132g, gVar) : this.f9134i;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this.f9135j;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = e(u0Var, value);
                    }
                    if (z10) {
                        if (!defaultNullValueSerializer.isEmpty(u0Var, value)) {
                            tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                            oVar2.serializeAsField(map, oVar, u0Var, tVar);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                        oVar2.serializeAsField(map, oVar, u0Var, tVar);
                    }
                } else if (!this.f9142q) {
                    defaultNullValueSerializer = u0Var.getDefaultNullValueSerializer();
                    tVar.reset(key, value, wVarFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        oVar2.serializeAsField(map, oVar, u0Var, tVar);
                    } catch (Exception e10) {
                        wrapAndThrow(u0Var, e10, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0069 A[EXC_TOP_SPLITTER, PHI: r5
      0x0069: PHI (r5v3 jc.w) = (r5v2 jc.w), (r5v5 jc.w), (r5v5 jc.w), (r5v5 jc.w) binds: [B:27:0x004a, B:33:0x005d, B:35:0x0060, B:37:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeOptionalFields(java.util.Map<?, ?> r8, ub.o r9, jc.u0 r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            wc.j r0 = r7.f9136k
            if (r0 == 0) goto L8
            r7.serializeTypedFields(r8, r9, r10, r11)
            return
        L8:
            tb.c0 r0 = bd.u.f9129u
            if (r0 != r11) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L32
            jc.o r4 = r7.f9132g
            jc.g r5 = r7.f9130e
            jc.w r4 = r10.findNullKeySerializer(r4, r5)
            goto L3f
        L32:
            dd.q r4 = r7.f9143r
            if (r4 == 0) goto L3d
            boolean r4 = r4.shouldIgnore(r3)
            if (r4 == 0) goto L3d
            goto L17
        L3d:
            jc.w r4 = r7.f9134i
        L3f:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L4f
            boolean r5 = r7.f9142q
            if (r5 == 0) goto L4a
            goto L17
        L4a:
            jc.w r5 = r10.getDefaultNullValueSerializer()
            goto L69
        L4f:
            jc.w r5 = r7.f9135j
            if (r5 != 0) goto L57
            jc.w r5 = r7.e(r10, r2)
        L57:
            if (r0 == 0) goto L60
            boolean r6 = r5.isEmpty(r10, r2)
            if (r6 == 0) goto L69
            goto L17
        L60:
            if (r11 == 0) goto L69
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L69
            goto L17
        L69:
            r4.serialize(r3, r9, r10)     // Catch: java.lang.Exception -> L70
            r5.serialize(r2, r9, r10)     // Catch: java.lang.Exception -> L70
            goto L17
        L70:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.wrapAndThrow(r10, r2, r8, r3)
            goto L17
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.u.serializeOptionalFields(java.util.Map, ub.o, jc.u0, java.lang.Object):void");
    }

    public void serializeTypedFields(Map<?, ?> map, ub.o oVar, jc.u0 u0Var, Object obj) throws IOException {
        jc.w wVarFindNullKeySerializer;
        jc.w defaultNullValueSerializer;
        boolean z10 = f9129u == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                wVarFindNullKeySerializer = u0Var.findNullKeySerializer(this.f9132g, this.f9130e);
            } else {
                dd.q qVar = this.f9143r;
                if (qVar == null || !qVar.shouldIgnore(key)) {
                    wVarFindNullKeySerializer = this.f9134i;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this.f9135j;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = e(u0Var, value);
                }
                if (z10) {
                    if (!defaultNullValueSerializer.isEmpty(u0Var, value)) {
                        wVarFindNullKeySerializer.serialize(key, oVar, u0Var);
                        defaultNullValueSerializer.serializeWithType(value, oVar, u0Var, this.f9136k);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    wVarFindNullKeySerializer.serialize(key, oVar, u0Var);
                    defaultNullValueSerializer.serializeWithType(value, oVar, u0Var, this.f9136k);
                }
            } else if (!this.f9142q) {
                defaultNullValueSerializer = u0Var.getDefaultNullValueSerializer();
                wVarFindNullKeySerializer.serialize(key, oVar, u0Var);
                try {
                    defaultNullValueSerializer.serializeWithType(value, oVar, u0Var, this.f9136k);
                } catch (Exception e10) {
                    wrapAndThrow(u0Var, e10, map, String.valueOf(key));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4 A[EXC_TOP_SPLITTER, PHI: r7
      0x00c4: PHI (r7v2 jc.w) = (r7v1 jc.w), (r7v5 jc.w), (r7v5 jc.w), (r7v5 jc.w) binds: [B:38:0x00a3, B:45:0x00b8, B:47:0x00bb, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeWithoutTypeInfo(java.util.Map<?, ?> r11, ub.o r12, jc.u0 r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.u.serializeWithoutTypeInfo(java.util.Map, ub.o, jc.u0):void");
    }

    public u withContentInclusion(Object obj, boolean z10) {
        if (obj == this.f9141p && z10 == this.f9142q) {
            return this;
        }
        dd.i.verifyMustOverride(u.class, this, "withContentInclusion");
        return new u(this, this.f9136k, obj, z10);
    }

    public u withResolved(jc.g gVar, jc.w wVar, jc.w wVar2, Set<String> set, Set<String> set2, boolean z10) {
        dd.i.verifyMustOverride(u.class, this, "withResolved");
        u uVar = new u(this, gVar, wVar, wVar2, set, set2);
        return z10 != uVar.f9144s ? new u(uVar, this.f9140o, z10) : uVar;
    }

    @Override // zc.i
    public u _withValueTypeSerializer(wc.j jVar) {
        if (this.f9136k == jVar) {
            return this;
        }
        dd.i.verifyMustOverride(u.class, this, "_withValueTypeSerializer");
        return new u(this, jVar, this.f9141p, this.f9142q);
    }

    @Override // zc.i
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Map<?, ?> map) {
        if (!map.isEmpty()) {
            boolean z10 = this.f9142q;
            Object obj = this.f9141p;
            if (obj != null || z10) {
                boolean z11 = f9129u == obj;
                jc.w wVar = this.f9135j;
                if (wVar != null) {
                    for (Object obj2 : map.values()) {
                        if (obj2 == null) {
                            if (z10) {
                            }
                        } else if (z11) {
                            if (!wVar.isEmpty(u0Var, obj2)) {
                            }
                        } else if (obj == null || !obj.equals(map)) {
                        }
                    }
                } else {
                    for (Object obj3 : map.values()) {
                        if (obj3 != null) {
                            try {
                                jc.w wVarE = e(u0Var, obj3);
                                if (z11) {
                                    if (!wVarE.isEmpty(u0Var, obj3)) {
                                    }
                                } else if (obj == null || !obj.equals(map)) {
                                }
                            } catch (jc.i unused) {
                            }
                        } else if (z10) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // bd.z0, jc.w
    public void serialize(Map<?, ?> map, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeStartObject(map);
        serializeWithoutTypeInfo(map, oVar, u0Var);
        oVar.writeEndObject();
    }

    @Override // jc.w
    public void serializeWithType(Map<?, ?> map, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        oVar.assignCurrentValue(map);
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(map, ub.z.START_OBJECT));
        serializeWithoutTypeInfo(map, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    @Override // jc.w
    public u withFilterId(Object obj) {
        if (this.f9140o == obj) {
            return this;
        }
        dd.i.verifyMustOverride(u.class, this, "withFilterId");
        return new u(this, obj, this.f9144s);
    }

    @Deprecated
    public u withContentInclusion(Object obj) {
        return new u(this, this.f9136k, obj, this.f9142q);
    }

    public u withResolved(jc.g gVar, jc.w wVar, jc.w wVar2, Set<String> set, boolean z10) {
        return withResolved(gVar, wVar, wVar2, set, null, z10);
    }

    public static u construct(Set<String> set, jc.o oVar, boolean z10, wc.j jVar, jc.w wVar, jc.w wVar2, Object obj) {
        return construct(set, null, oVar, z10, jVar, wVar, wVar2, obj);
    }

    @Deprecated
    public static u construct(String[] strArr, jc.o oVar, boolean z10, wc.j jVar, jc.w wVar, jc.w wVar2, Object obj) {
        return construct(dd.d.arrayToSet(strArr), oVar, z10, jVar, wVar, wVar2, obj);
    }

    public u(u uVar, jc.g gVar, jc.w wVar, jc.w wVar2, Set set, Set set2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f9138m = set;
        this.f9139n = set2;
        this.f9132g = uVar.f9132g;
        this.f9133h = uVar.f9133h;
        this.f9131f = uVar.f9131f;
        this.f9136k = uVar.f9136k;
        this.f9134i = wVar;
        this.f9135j = wVar2;
        this.f9137l = ad.t.emptyForProperties();
        this.f9130e = gVar;
        this.f9140o = uVar.f9140o;
        this.f9144s = uVar.f9144s;
        this.f9141p = uVar.f9141p;
        this.f9142q = uVar.f9142q;
        this.f9143r = dd.r.buildCheckerIfNeeded(set, set2);
    }

    public u(u uVar, wc.j jVar, Object obj, boolean z10) {
        super(Map.class, 0);
        this.f9138m = uVar.f9138m;
        this.f9139n = uVar.f9139n;
        this.f9132g = uVar.f9132g;
        this.f9133h = uVar.f9133h;
        this.f9131f = uVar.f9131f;
        this.f9136k = jVar;
        this.f9134i = uVar.f9134i;
        this.f9135j = uVar.f9135j;
        this.f9137l = uVar.f9137l;
        this.f9130e = uVar.f9130e;
        this.f9140o = uVar.f9140o;
        this.f9144s = uVar.f9144s;
        this.f9141p = obj;
        this.f9142q = z10;
        this.f9143r = uVar.f9143r;
    }

    public u(u uVar, Object obj, boolean z10) {
        super(Map.class, 0);
        this.f9138m = uVar.f9138m;
        this.f9139n = uVar.f9139n;
        this.f9132g = uVar.f9132g;
        this.f9133h = uVar.f9133h;
        this.f9131f = uVar.f9131f;
        this.f9136k = uVar.f9136k;
        this.f9134i = uVar.f9134i;
        this.f9135j = uVar.f9135j;
        this.f9137l = ad.t.emptyForProperties();
        this.f9130e = uVar.f9130e;
        this.f9140o = obj;
        this.f9144s = z10;
        this.f9141p = uVar.f9141p;
        this.f9142q = uVar.f9142q;
        this.f9143r = uVar.f9143r;
    }
}
