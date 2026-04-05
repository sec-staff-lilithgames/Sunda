package mc;

import b0.e2;
import dd.k0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import jc.n0;
import nc.m0;
import oc.f1;
import oc.g1;
import oc.l1;
import rc.c1;
import rc.d1;
import rc.j1;
import tb.e1;
import tb.f0;
import tb.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends s implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final lc.t f74156b;

    public c(lc.t tVar) {
        this.f74156b = tVar;
    }

    public static boolean b(nc.f fVar, rc.r rVar, boolean z10, boolean z11) {
        Class<?> rawParameterType = rVar.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CharSequence.class) {
            if (z10 || z11) {
                fVar.addStringCreator(rVar, z10);
                return true;
            }
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z10 || z11) {
                fVar.addIntCreator(rVar, z10);
                return true;
            }
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z10 || z11) {
                fVar.addLongCreator(rVar, z10);
                return true;
            }
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z10 || z11) {
                fVar.addDoubleCreator(rVar, z10);
                return true;
            }
        } else {
            if (rawParameterType != Boolean.TYPE && rawParameterType != Boolean.class) {
                if (rawParameterType == BigInteger.class && (z10 || z11)) {
                    fVar.addBigIntegerCreator(rVar, z10);
                }
                if (rawParameterType == BigDecimal.class && (z10 || z11)) {
                    fVar.addBigDecimalCreator(rVar, z10);
                }
                if (!z10) {
                    return false;
                }
                fVar.addDelegatingCreator(rVar, z10, null, 0);
                return true;
            }
            if (z10 || z11) {
                fVar.addBooleanCreator(rVar, z10);
                return true;
            }
        }
        return true;
    }

    public static dd.n d(jc.j jVar, jc.d dVar) {
        rc.l lVarFindJsonValueAccessor = dVar.findJsonValueAccessor();
        if (lVarFindJsonValueAccessor == null) {
            return dd.n.constructFor(jVar, dVar.getClassInfo());
        }
        if (jVar.canOverrideAccessModifiers()) {
            dd.i.checkAndFixAccess(lVarFindJsonValueAccessor.getMember(), jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return dd.n.constructUsingMethod(jVar, dVar.getClassInfo(), lVarFindJsonValueAccessor);
    }

    public static jc.q e(jc.k kVar, rc.b bVar) {
        Object objFindDeserializer;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(bVar)) == null) {
            return null;
        }
        return kVar.deserializerInstance(bVar, objFindDeserializer);
    }

    public c0 _valueInstantiatorInstance(jc.j jVar, rc.b bVar, Object obj) throws jc.r {
        c0 c0VarValueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof c0) {
            return (c0) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (dd.i.isBogusClass(cls)) {
            return null;
        }
        if (!c0.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(e2.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<ValueInstantiator>"));
        }
        lc.v handlerInstantiator = jVar.getHandlerInstantiator();
        return (handlerInstantiator == null || (c0VarValueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(jVar, bVar, cls)) == null) ? (c0) dd.i.createInstance(cls, jVar.canOverrideAccessModifiers()) : c0VarValueInstantiatorInstance;
    }

    public final c0 a(jc.k kVar, jc.d dVar) throws jc.r {
        rc.g gVarFindDefaultConstructor;
        d1 d1Var;
        jc.c cVar;
        nc.e eVar;
        z[] zVarArr;
        d1 d1Var2;
        jc.c cVar2;
        int i10;
        int i11;
        z[] zVarArr2;
        tb.c cVar3;
        n0 n0Var;
        c cVar4;
        jc.k kVar2 = kVar;
        jc.d dVar2 = dVar;
        jc.j config = kVar2.getConfig();
        d1 potentialCreators = dVar2.getPotentialCreators();
        lc.l constructorDetector = config.getConstructorDetector();
        j1 defaultVisibilityChecker = config.getDefaultVisibilityChecker(dVar2.getBeanClass(), dVar2.getClassInfo());
        nc.f fVar = new nc.f(dVar2, config);
        boolean zB = true;
        if (potentialCreators.hasPropertiesBased()) {
            c1 c1Var = potentialCreators.f84152a;
            if (c1Var.paramCount() == 0) {
                fVar.setDefaultCreator(c1Var.creator());
            } else {
                nc.e eVarConstruct = nc.e.construct(config.getAnnotationIntrospector(), c1Var.creator(), c1Var.propertyDefs());
                int iParamCount = eVarConstruct.paramCount();
                z[] zVarArr3 = new z[iParamCount];
                int i12 = 0;
                int i13 = -1;
                while (i12 < iParamCount) {
                    tb.c cVarInjection = eVarConstruct.injection(i12);
                    rc.q qVarParameter = eVarConstruct.parameter(i12);
                    n0 n0VarParamName = eVarConstruct.paramName(i12);
                    if (!Boolean.TRUE.equals(kVar2.getAnnotationIntrospector().hasAnySetter(qVarParameter))) {
                        if (n0VarParamName == null) {
                            if (kVar2.getAnnotationIntrospector().findUnwrappingNameTransformer(qVarParameter) != null) {
                                zVarArr2 = zVarArr3;
                                zVarArr2[i12] = c(kVar2, dVar2, m0.creatorParamName(i12), i12, qVarParameter, null);
                            } else {
                                zVarArr2 = zVarArr3;
                            }
                            if (n0VarParamName == null && cVarInjection == null) {
                                kVar2.reportBadTypeDefinition(dVar2, "Argument #%d of Creator %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i12), eVarConstruct);
                            }
                        }
                        cVar4 = this;
                        cVar3 = cVarInjection;
                        n0Var = n0VarParamName;
                        zVarArr2[i12] = cVar4.c(kVar2, dVar2, n0Var, i12, qVarParameter, cVar3);
                        i12++;
                        kVar2 = kVar;
                        dVar2 = dVar;
                        zVarArr3 = zVarArr2;
                    } else if (i13 >= 0) {
                        kVar2.reportBadTypeDefinition(dVar2, "More than one 'any-setter' specified (parameter #%d vs #%d)", Integer.valueOf(i13), Integer.valueOf(i12));
                    } else {
                        zVarArr2 = zVarArr3;
                        i13 = i12;
                        cVar3 = cVarInjection;
                        n0Var = n0VarParamName;
                        cVar4 = this;
                        zVarArr2[i12] = cVar4.c(kVar2, dVar2, n0Var, i12, qVarParameter, cVar3);
                        i12++;
                        kVar2 = kVar;
                        dVar2 = dVar;
                        zVarArr3 = zVarArr2;
                    }
                    zVarArr2 = zVarArr3;
                    cVar4 = this;
                    cVar3 = cVarInjection;
                    n0Var = n0VarParamName;
                    zVarArr2[i12] = cVar4.c(kVar2, dVar2, n0Var, i12, qVarParameter, cVar3);
                    i12++;
                    kVar2 = kVar;
                    dVar2 = dVar;
                    zVarArr3 = zVarArr2;
                }
                fVar.addPropertyCreator(eVarConstruct.creator(), true, zVarArr3);
            }
        }
        List<c1> explicitDelegating = potentialCreators.getExplicitDelegating();
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        Iterator<c1> it = explicitDelegating.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            nc.e eVarConstruct2 = nc.e.construct(annotationIntrospector, it.next().creator(), null);
            int iParamCount2 = eVarConstruct2.paramCount();
            z[] zVarArr4 = new z[iParamCount2];
            if (iParamCount2 == 0) {
                fVar.addPropertyCreator(eVarConstruct2.creator(), zB, zVarArr4);
                d1Var = potentialCreators;
                cVar = annotationIntrospector;
            } else {
                int i14 = -1;
                int i15 = 0;
                while (i15 < iParamCount2) {
                    rc.q qVarParameter2 = eVarConstruct2.parameter(i15);
                    tb.c cVarInjection2 = eVarConstruct2.injection(i15);
                    if (cVarInjection2 != null) {
                        eVar = eVarConstruct2;
                        zVarArr = zVarArr4;
                        cVar2 = annotationIntrospector;
                        i11 = i14;
                        d1Var2 = potentialCreators;
                        i10 = iParamCount2;
                        zVarArr[i15] = c(kVar, dVar, null, i15, qVarParameter2, cVarInjection2);
                    } else {
                        eVar = eVarConstruct2;
                        zVarArr = zVarArr4;
                        d1Var2 = potentialCreators;
                        cVar2 = annotationIntrospector;
                        i10 = iParamCount2;
                        i11 = i14;
                        if (i11 < 0) {
                            i14 = i15;
                            i15++;
                            iParamCount2 = i10;
                            eVarConstruct2 = eVar;
                            zVarArr4 = zVarArr;
                            potentialCreators = d1Var2;
                            annotationIntrospector = cVar2;
                        } else {
                            kVar.reportBadTypeDefinition(dVar, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i11), Integer.valueOf(i15), eVar);
                        }
                    }
                    i14 = i11;
                    i15++;
                    iParamCount2 = i10;
                    eVarConstruct2 = eVar;
                    zVarArr4 = zVarArr;
                    potentialCreators = d1Var2;
                    annotationIntrospector = cVar2;
                }
                nc.e eVar2 = eVarConstruct2;
                z[] zVarArr5 = zVarArr4;
                d1Var = potentialCreators;
                cVar = annotationIntrospector;
                int i16 = iParamCount2;
                int i17 = i14;
                if (i17 < 0) {
                    kVar.reportBadTypeDefinition(dVar, "No argument left as delegating for Creator %s: exactly one required", eVar2);
                }
                if (i16 == 1) {
                    zB = b(fVar, eVar2.creator(), true, true);
                } else {
                    fVar.addDelegatingCreator(eVar2.creator(), true, zVarArr5, i17);
                    zB = true;
                }
            }
            z10 |= zB;
            potentialCreators = d1Var;
            annotationIntrospector = cVar;
            zB = true;
        }
        jc.k kVar3 = kVar;
        jc.d dVar3 = dVar;
        d1 d1Var3 = potentialCreators;
        if (dVar3.getType().isConcrete() && !dVar3.isNonStaticInnerClass()) {
            if (!fVar.hasDefaultCreator() && (gVarFindDefaultConstructor = dVar3.findDefaultConstructor()) != null) {
                fVar.setDefaultCreator(gVarFindDefaultConstructor);
            }
            if (constructorDetector.shouldIntrospectorImplicitConstructors(dVar3.getBeanClass())) {
                List<c1> implicitDelegatingConstructors = d1Var3.getImplicitDelegatingConstructors();
                jc.c annotationIntrospector2 = kVar3.getAnnotationIntrospector();
                for (c1 c1Var2 : implicitDelegatingConstructors) {
                    int iParamCount3 = c1Var2.paramCount();
                    rc.r rVarCreator = c1Var2.creator();
                    if (iParamCount3 == 1) {
                        b(fVar, rVarCreator, false, defaultVisibilityChecker.isCreatorVisible(rVarCreator));
                    } else {
                        z[] zVarArr6 = new z[iParamCount3];
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < iParamCount3) {
                            rc.q parameter = rVarCreator.getParameter(i18);
                            tb.c cVarFindInjectableValue = annotationIntrospector2.findInjectableValue(parameter);
                            if (cVarFindInjectableValue != null) {
                                i19++;
                                zVarArr6[i18] = c(kVar3, dVar3, null, i18, parameter, cVarFindInjectableValue);
                            } else {
                                if (annotationIntrospector2.findUnwrappingNameTransformer(parameter) != null) {
                                    kVar3 = kVar;
                                    zVarArr6[i18] = c(kVar3, dVar, m0.creatorParamName(i18), i18, parameter, null);
                                }
                                i18++;
                                dVar3 = dVar;
                            }
                            kVar3 = kVar;
                            i18++;
                            dVar3 = dVar;
                        }
                        if (i19 + 1 == iParamCount3) {
                            fVar.addDelegatingCreator(rVarCreator, false, zVarArr6, 0);
                        }
                        dVar3 = dVar;
                    }
                }
            }
        }
        if (!z10) {
            for (c1 c1Var3 : d1Var3.getImplicitDelegatingFactories()) {
                int iParamCount4 = c1Var3.paramCount();
                rc.r rVarCreator2 = c1Var3.creator();
                if (iParamCount4 == 1) {
                    b(fVar, rVarCreator2, false, defaultVisibilityChecker.isCreatorVisible(rVarCreator2));
                }
            }
        }
        return fVar.constructValueInstantiator(kVar3);
    }

    public final z c(jc.k kVar, jc.d dVar, n0 n0Var, int i10, rc.q qVar, tb.c cVar) throws jc.r {
        n0 n0VarFindWrapperName;
        jc.m0 m0VarWithNulls;
        e1 e1VarNonDefaultContentNulls;
        q0 q0VarFindSetterInfo;
        jc.j config = kVar.getConfig();
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        e1 e1VarNonDefaultValueNulls = null;
        if (annotationIntrospector == null) {
            m0VarWithNulls = jc.m0.f69373l;
            n0VarFindWrapperName = null;
        } else {
            jc.m0 m0VarConstruct = jc.m0.construct(annotationIntrospector.hasRequiredMarker(qVar), annotationIntrospector.findPropertyDescription(qVar), annotationIntrospector.findPropertyIndex(qVar), annotationIntrospector.findPropertyDefaultValue(qVar));
            n0VarFindWrapperName = annotationIntrospector.findWrapperName(qVar);
            m0VarWithNulls = m0VarConstruct;
        }
        jc.o oVarF = f(kVar, qVar, qVar.getType());
        jc.f fVar = new jc.f(n0Var, oVarF, n0VarFindWrapperName, qVar, m0VarWithNulls);
        wc.g gVarFindTypeDeserializer = (wc.g) oVarF.getTypeHandler();
        if (gVarFindTypeDeserializer == null) {
            gVarFindTypeDeserializer = findTypeDeserializer(config, oVarF);
        }
        wc.g gVar = gVarFindTypeDeserializer;
        jc.c annotationIntrospector2 = config.getAnnotationIntrospector();
        rc.b member = fVar.getMember();
        if (member != null) {
            if (annotationIntrospector2 == null || (q0VarFindSetterInfo = annotationIntrospector2.findSetterInfo(member)) == null) {
                e1VarNonDefaultContentNulls = null;
            } else {
                e1VarNonDefaultValueNulls = q0VarFindSetterInfo.nonDefaultValueNulls();
                e1VarNonDefaultContentNulls = q0VarFindSetterInfo.nonDefaultContentNulls();
            }
            q0 setterInfo = config.getConfigOverride(fVar.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (e1VarNonDefaultValueNulls == null) {
                    e1VarNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                }
                if (e1VarNonDefaultContentNulls == null) {
                    e1VarNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            e1VarNonDefaultContentNulls = null;
        }
        q0 defaultSetterInfo = config.getDefaultSetterInfo();
        if (e1VarNonDefaultValueNulls == null) {
            e1VarNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (e1VarNonDefaultContentNulls == null) {
            e1VarNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        if (e1VarNonDefaultValueNulls != null || e1VarNonDefaultContentNulls != null) {
            m0VarWithNulls = m0VarWithNulls.withNulls(e1VarNonDefaultValueNulls, e1VarNonDefaultContentNulls);
        }
        l lVarConstruct = l.construct(n0Var, oVarF, fVar.getWrapperName(), gVar, dVar.getClassAnnotations(), qVar, i10, cVar, m0VarWithNulls);
        jc.q qVarE = e(kVar, qVar);
        if (qVarE == null) {
            qVarE = (jc.q) oVarF.getValueHandler();
        }
        return qVarE != null ? lVarConstruct.withValueDeserializer(kVar.handlePrimaryContextualization(qVarE, lVarConstruct, oVarF)) : lVarConstruct;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // mc.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.q createArrayDeserializer(jc.k r7, cd.a r8, jc.d r9) throws jc.r {
        /*
            r6 = this;
            jc.j r7 = r7.getConfig()
            jc.o r0 = r8.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            jc.q r1 = (jc.q) r1
            java.lang.Object r2 = r0.getTypeHandler()
            wc.g r2 = (wc.g) r2
            if (r2 != 0) goto L1a
            wc.g r2 = r6.findTypeDeserializer(r7, r0)
        L1a:
            lc.t r3 = r6.f74156b
            java.lang.Iterable r4 = r3.deserializers()
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L6e
            if (r1 != 0) goto L46
            boolean r4 = r0.isPrimitive()
            if (r4 == 0) goto L3b
            java.lang.Class r0 = r0.getRawClass()
            jc.q r0 = oc.o0.forType(r0)
            goto L47
        L3b:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r0 = r0.hasRawClass(r4)
            if (r0 == 0) goto L46
            oc.e1 r0 = oc.e1.f78844k
            goto L47
        L46:
            r0 = 0
        L47:
            if (r0 != 0) goto L4e
            oc.f0 r0 = new oc.f0
            r0.<init>(r8, r1, r2)
        L4e:
            boolean r1 = r3.hasDeserializerModifiers()
            if (r1 == 0) goto L6d
            java.lang.Iterable r1 = r3.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            mc.i r2 = (mc.i) r2
            jc.q r0 = r2.modifyArrayDeserializer(r7, r8, r9, r0)
            goto L5c
        L6d:
            return r0
        L6e:
            java.lang.ClassCastException r7 = a.b.c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.c.createArrayDeserializer(jc.k, cd.a, jc.d):jc.q");
    }

    @Override // mc.s
    public jc.q createCollectionDeserializer(jc.k kVar, cd.e eVar, jc.d dVar) throws jc.r {
        jc.o contentType = eVar.getContentType();
        jc.q qVar = (jc.q) contentType.getValueHandler();
        jc.j config = kVar.getConfig();
        wc.g gVarFindTypeDeserializer = (wc.g) contentType.getTypeHandler();
        if (gVarFindTypeDeserializer == null) {
            gVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        lc.t tVar = this.f74156b;
        Iterator<t> it = tVar.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        jc.q oVar = (qVar == null && EnumSet.class.isAssignableFrom(eVar.getRawClass())) ? new oc.o(contentType, null) : null;
        if (oVar == null) {
            if (eVar.isInterface() || eVar.isAbstract()) {
                Class<?> clsFindCollectionFallback = b.findCollectionFallback(eVar);
                cd.e eVar2 = clsFindCollectionFallback != null ? (cd.e) config.getTypeFactory().constructSpecializedType(eVar, clsFindCollectionFallback, true) : null;
                if (eVar2 != null) {
                    dVar = config.introspectForCreation(eVar2);
                    eVar = eVar2;
                }
            }
            if (oVar == null) {
                c0 c0VarFindValueInstantiator = findValueInstantiator(kVar, dVar);
                if (!c0VarFindValueInstantiator.canCreateUsingDefault()) {
                    if (eVar.hasRawClass(ArrayBlockingQueue.class)) {
                        return new oc.a(eVar, qVar, gVarFindTypeDeserializer, c0VarFindValueInstantiator);
                    }
                    jc.q qVarFindForCollection = nc.p.findForCollection(kVar, eVar);
                    if (qVarFindForCollection != null) {
                        return qVarFindForCollection;
                    }
                }
                oVar = contentType.hasRawClass(String.class) ? new f1(eVar, qVar, c0VarFindValueInstantiator) : new oc.i(eVar, qVar, gVarFindTypeDeserializer, c0VarFindValueInstantiator);
            }
        }
        if (tVar.hasDeserializerModifiers()) {
            Iterator<i> it2 = tVar.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                oVar = it2.next().modifyCollectionDeserializer(config, eVar, dVar, oVar);
            }
        }
        return oVar;
    }

    @Override // mc.s
    public jc.q createCollectionLikeDeserializer(jc.k kVar, cd.d dVar, jc.d dVar2) throws jc.r {
        jc.o contentType = dVar.getContentType();
        jc.j config = kVar.getConfig();
        if (((wc.g) contentType.getTypeHandler()) == null) {
            findTypeDeserializer(config, contentType);
        }
        Iterator<t> it = this.f74156b.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        return null;
    }

    @Override // mc.s
    public jc.q createEnumDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.r {
        jc.q qVarModifyEnumDeserializer;
        tb.m mVarFindCreatorAnnotation;
        jc.j config = kVar.getConfig();
        Class<?> rawClass = oVar.getRawClass();
        lc.t tVar = this.f74156b;
        Iterator<t> it = tVar.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        if (rawClass == Enum.class) {
            return a.constructForNonPOJO(dVar);
        }
        c0 c0VarA = a(kVar, dVar);
        z[] fromObjectArguments = c0VarA == null ? null : c0VarA.getFromObjectArguments(kVar.getConfig());
        Iterator<rc.m> it2 = dVar.getFactoryMethods().iterator();
        while (true) {
            if (!it2.hasNext()) {
                qVarModifyEnumDeserializer = null;
                break;
            }
            rc.m next = it2.next();
            jc.c annotationIntrospector = config.getAnnotationIntrospector();
            if (annotationIntrospector != null && (mVarFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(config, next)) != null && mVarFindCreatorAnnotation != tb.m.f86751f) {
                if (next.getParameterCount() == 0) {
                    qVarModifyEnumDeserializer = oc.m.deserializerForNoArgsCreator(config, rawClass, next);
                } else {
                    if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                        kVar.reportBadDefinition(oVar, "Invalid `@JsonCreator` annotated Enum factory method [" + next.toString() + "]: needs to return compatible type");
                    }
                    qVarModifyEnumDeserializer = oc.m.deserializerForCreator(config, rawClass, next, c0VarA, fromObjectArguments, d(config, dVar));
                }
            }
        }
        if (qVarModifyEnumDeserializer == null) {
            dd.n nVarD = d(config, dVar);
            boolean zIsEnabled = config.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Object objFindEnumNamingStrategy = config.getAnnotationIntrospector().findEnumNamingStrategy(config, dVar.getClassInfo());
            boolean zCanOverrideAccessModifiers = config.canOverrideAccessModifiers();
            config.getEnumNamingStrategy();
            rc.n0.createEnumNamingStrategyInstance(objFindEnumNamingStrategy, zCanOverrideAccessModifiers, null);
            qVarModifyEnumDeserializer = new oc.m(nVarD, zIsEnabled, (dd.n) null, dd.n.constructUsingToString(config, dVar.getClassInfo()));
        }
        if (tVar.hasDeserializerModifiers()) {
            Iterator<i> it3 = tVar.deserializerModifiers().iterator();
            while (it3.hasNext()) {
                qVarModifyEnumDeserializer = it3.next().modifyEnumDeserializer(config, oVar, dVar, qVarModifyEnumDeserializer);
            }
        }
        return qVarModifyEnumDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        r14 = new java.lang.StringBuilder("Unsuitable method (");
        r14.append(r9);
        r14.append(") decorated with @JsonCreator (for Enum type ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
    
        throw new java.lang.IllegalArgumentException(b0.e2.k(r2, r14, ")"));
     */
    @Override // mc.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.x createKeyDeserializer(jc.k r13, jc.o r14) throws jc.r {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.c.createKeyDeserializer(jc.k, jc.o):jc.x");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [jc.q] */
    /* JADX WARN: Type inference failed for: r4v14, types: [jc.q] */
    /* JADX WARN: Type inference failed for: r4v16, types: [oc.n] */
    @Override // mc.s
    public jc.q createMapDeserializer(jc.k kVar, cd.j jVar, jc.d dVar) throws jc.r {
        cd.j jVar2;
        oc.a0 a0Var;
        jc.j config = kVar.getConfig();
        jc.o keyType = jVar.getKeyType();
        jc.o contentType = jVar.getContentType();
        jc.q qVar = (jc.q) contentType.getValueHandler();
        jc.x xVar = (jc.x) keyType.getValueHandler();
        wc.g gVarFindTypeDeserializer = (wc.g) contentType.getTypeHandler();
        if (gVarFindTypeDeserializer == null) {
            gVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        wc.g gVar = gVarFindTypeDeserializer;
        lc.t tVar = this.f74156b;
        Iterator<t> it = tVar.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        Class<?> rawClass = jVar.getRawClass();
        if (EnumMap.class.isAssignableFrom(rawClass)) {
            c0 c0VarFindValueInstantiator = rawClass == EnumMap.class ? null : findValueInstantiator(kVar, dVar);
            if (!keyType.isEnumImplType()) {
                throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
            }
            jVar2 = jVar;
            a0Var = new oc.n(jVar2, c0VarFindValueInstantiator, null, qVar, gVar, null);
        } else {
            jVar2 = jVar;
            a0Var = null;
        }
        if (a0Var == null) {
            if (jVar2.isInterface() || jVar2.isAbstract()) {
                Class<?> clsFindMapFallback = b.findMapFallback(jVar2);
                cd.j jVar3 = clsFindMapFallback != null ? (cd.j) config.getTypeFactory().constructSpecializedType(jVar2, clsFindMapFallback, true) : null;
                if (jVar3 != null) {
                    jVar3.getRawClass();
                    dVar = config.introspectForCreation(jVar3);
                } else {
                    jVar3 = jVar2;
                }
                jVar2 = jVar3;
                a0Var = a0Var;
            } else {
                ?? FindForMap = nc.p.findForMap(kVar, jVar2);
                a0Var = FindForMap;
                if (FindForMap != 0) {
                    return FindForMap;
                }
            }
            if (a0Var == null) {
                a0Var = new oc.a0(jVar2, findValueInstantiator(kVar, dVar), xVar, qVar, gVar);
                tb.z defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, dVar.getClassInfo());
                a0Var.setIgnorableProperties(defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForDeserialization());
                f0 defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, dVar.getClassInfo());
                a0Var.setIncludableProperties(defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null);
            }
        }
        cd.j jVar4 = jVar2;
        if (tVar.hasDeserializerModifiers()) {
            Iterator<i> it2 = tVar.deserializerModifiers().iterator();
            a0Var = a0Var;
            while (it2.hasNext()) {
                a0Var = it2.next().modifyMapDeserializer(config, jVar4, dVar, a0Var);
            }
        }
        return a0Var;
    }

    @Override // mc.s
    public jc.q createMapLikeDeserializer(jc.k kVar, cd.i iVar, jc.d dVar) throws jc.r {
        jc.o keyType = iVar.getKeyType();
        jc.o contentType = iVar.getContentType();
        jc.j config = kVar.getConfig();
        if (((wc.g) contentType.getTypeHandler()) == null) {
            findTypeDeserializer(config, contentType);
        }
        Iterator<t> it = this.f74156b.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        return null;
    }

    @Override // mc.s
    public jc.q createReferenceDeserializer(jc.k kVar, cd.l lVar, jc.d dVar) throws jc.r {
        jc.o contentType = lVar.getContentType();
        jc.q qVar = (jc.q) contentType.getValueHandler();
        jc.j config = kVar.getConfig();
        wc.g gVarFindTypeDeserializer = (wc.g) contentType.getTypeHandler();
        if (gVarFindTypeDeserializer == null) {
            gVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        Iterator<t> it = this.f74156b.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        if (lVar.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new oc.e(lVar, lVar.getRawClass() != AtomicReference.class ? findValueInstantiator(kVar, dVar) : null, gVarFindTypeDeserializer, qVar);
        }
        return null;
    }

    @Override // mc.s
    public jc.q createTreeDeserializer(jc.j jVar, jc.o oVar, jc.d dVar) throws jc.r {
        Class<?> rawClass = oVar.getRawClass();
        Iterator<t> it = this.f74156b.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        return oc.y.getDeserializer(rawClass);
    }

    public final jc.o f(jc.k kVar, rc.l lVar, jc.o oVar) {
        jc.x xVarKeyDeserializerInstance;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return oVar;
        }
        if (oVar.isMapLikeType() && oVar.getKeyType() != null && (xVarKeyDeserializerInstance = kVar.keyDeserializerInstance(lVar, annotationIntrospector.findKeyDeserializer(lVar))) != null) {
            oVar = ((cd.i) oVar).withKeyValueHandler(xVarKeyDeserializerInstance);
            oVar.getKeyType();
        }
        if (oVar.hasContentType()) {
            jc.q qVarDeserializerInstance = kVar.deserializerInstance(lVar, annotationIntrospector.findContentDeserializer(lVar));
            if (qVarDeserializerInstance != null) {
                oVar = oVar.withContentValueHandler(qVarDeserializerInstance);
            }
            wc.g gVarFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(kVar.getConfig(), oVar, lVar);
            if (gVarFindPropertyContentTypeDeserializer != null) {
                oVar = oVar.withContentTypeHandler(gVarFindPropertyContentTypeDeserializer);
            }
        }
        wc.g gVarFindPropertyTypeDeserializer = findPropertyTypeDeserializer(kVar.getConfig(), oVar, lVar);
        if (gVarFindPropertyTypeDeserializer != null) {
            oVar = oVar.withTypeHandler(gVarFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(kVar.getConfig(), lVar, oVar);
    }

    public jc.q findDefaultDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.r {
        jc.o oVar2;
        Class<?> rawClass = oVar.getRawClass();
        if (rawClass == Object.class || rawClass == Serializable.class) {
            jc.j config = kVar.getConfig();
            jc.o oVar3 = null;
            if (this.f74156b.hasAbstractTypeResolvers()) {
                jc.o oVarMapAbstractType = mapAbstractType(config, config.constructType(List.class));
                if (oVarMapAbstractType == null || oVarMapAbstractType.hasRawClass(List.class)) {
                    oVarMapAbstractType = null;
                }
                jc.o oVarMapAbstractType2 = mapAbstractType(config, config.constructType(Map.class));
                if (oVarMapAbstractType2 != null && !oVarMapAbstractType2.hasRawClass(Map.class)) {
                    oVar3 = oVarMapAbstractType2;
                }
                oVar2 = oVar3;
                oVar3 = oVarMapAbstractType;
            } else {
                oVar2 = null;
            }
            return new l1(oVar3, oVar2);
        }
        if (rawClass == String.class || rawClass == CharSequence.class) {
            return g1.f78863f;
        }
        if (rawClass == Iterable.class) {
            cd.s typeFactory = kVar.getTypeFactory();
            jc.o[] oVarArrFindTypeParameters = typeFactory.findTypeParameters(oVar, Iterable.class);
            return createCollectionDeserializer(kVar, typeFactory.constructCollectionType(Collection.class, (oVarArrFindTypeParameters == null || oVarArrFindTypeParameters.length != 1) ? cd.s.unknownType() : oVarArrFindTypeParameters[0]), dVar);
        }
        if (rawClass == Map.Entry.class) {
            jc.o oVarContainedTypeOrUnknown = oVar.containedTypeOrUnknown(0);
            jc.o oVarContainedTypeOrUnknown2 = oVar.containedTypeOrUnknown(1);
            wc.g gVarFindTypeDeserializer = (wc.g) oVarContainedTypeOrUnknown2.getTypeHandler();
            if (gVarFindTypeDeserializer == null) {
                gVarFindTypeDeserializer = findTypeDeserializer(kVar.getConfig(), oVarContainedTypeOrUnknown2);
            }
            return new oc.b0(oVar, (jc.x) oVarContainedTypeOrUnknown.getValueHandler(), (jc.q) oVarContainedTypeOrUnknown2.getValueHandler(), gVarFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            jc.q qVarFind = oc.d0.find(rawClass, name);
            if (qVarFind == null) {
                qVarFind = oc.k.find(rawClass, name);
            }
            if (qVarFind != null) {
                return qVarFind;
            }
        }
        if (rawClass == k0.class) {
            return new oc.j1();
        }
        jc.q qVarFindDeserializer = qc.g.f82739h.findDeserializer(oVar, kVar.getConfig(), dVar);
        return qVarFindDeserializer != null ? qVarFindDeserializer : oc.u.find(kVar, rawClass, name);
    }

    public wc.g findPropertyContentTypeDeserializer(jc.j jVar, jc.o oVar, rc.l lVar) throws jc.r {
        wc.i iVarFindPropertyContentTypeResolver = jVar.getAnnotationIntrospector().findPropertyContentTypeResolver(jVar, lVar, oVar);
        jc.o contentType = oVar.getContentType();
        return iVarFindPropertyContentTypeResolver == null ? findTypeDeserializer(jVar, contentType) : iVarFindPropertyContentTypeResolver.buildTypeDeserializer(jVar, contentType, jVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(jVar, lVar, contentType));
    }

    public wc.g findPropertyTypeDeserializer(jc.j jVar, jc.o oVar, rc.l lVar) throws jc.r {
        wc.i iVarFindPropertyTypeResolver = jVar.getAnnotationIntrospector().findPropertyTypeResolver(jVar, lVar, oVar);
        if (iVarFindPropertyTypeResolver == null) {
            return findTypeDeserializer(jVar, oVar);
        }
        try {
            return iVarFindPropertyTypeResolver.buildTypeDeserializer(jVar, oVar, jVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(jVar, lVar, oVar));
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw pc.b.from((ub.u) null, dd.i.exceptionMessage(e10), oVar).withCause(e10);
        }
    }

    @Override // mc.s
    public wc.g findTypeDeserializer(jc.j jVar, jc.o oVar) throws jc.r {
        jc.o oVarMapAbstractType;
        rc.e classInfo = jVar.introspectClassAnnotations(oVar.getRawClass()).getClassInfo();
        wc.i iVarFindTypeResolver = jVar.getAnnotationIntrospector().findTypeResolver(jVar, classInfo, oVar);
        if (iVarFindTypeResolver == null && (iVarFindTypeResolver = jVar.getDefaultTyper(oVar)) == null) {
            return null;
        }
        Collection<wc.c> collectionCollectAndResolveSubtypesByTypeId = jVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(jVar, classInfo);
        if (iVarFindTypeResolver.getDefaultImpl() == null && oVar.isAbstract() && (oVarMapAbstractType = mapAbstractType(jVar, oVar)) != null && !oVarMapAbstractType.hasRawClass(oVar.getRawClass())) {
            iVarFindTypeResolver = iVarFindTypeResolver.withDefaultImpl(oVarMapAbstractType.getRawClass());
        }
        try {
            return iVarFindTypeResolver.buildTypeDeserializer(jVar, oVar, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw pc.b.from((ub.u) null, dd.i.exceptionMessage(e10), oVar).withCause(e10);
        }
    }

    @Override // mc.s
    public c0 findValueInstantiator(jc.k kVar, jc.d dVar) throws jc.r {
        jc.j config = kVar.getConfig();
        rc.e classInfo = dVar.getClassInfo();
        Object objFindValueInstantiator = config.getAnnotationIntrospector().findValueInstantiator(classInfo);
        c0 c0Var_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, objFindValueInstantiator) : null;
        if (c0Var_valueInstantiatorInstance == null && (c0Var_valueInstantiatorInstance = nc.n.findStdValueInstantiator(config, dVar.getBeanClass())) == null) {
            c0Var_valueInstantiatorInstance = a(kVar, dVar);
        }
        lc.t tVar = this.f74156b;
        if (tVar.hasValueInstantiators()) {
            Iterator<e0> it = tVar.valueInstantiators().iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
        return c0Var_valueInstantiatorInstance != null ? c0Var_valueInstantiatorInstance.createContextual(kVar, dVar) : c0Var_valueInstantiatorInstance;
    }

    public lc.t getFactoryConfig() {
        return this.f74156b;
    }

    @Override // mc.s
    public boolean hasExplicitDeserializerFor(jc.j jVar, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (!name.startsWith("java.")) {
            return name.startsWith("com.fasterxml.") ? jc.t.class.isAssignableFrom(cls) || cls == k0.class : qc.g.f82739h.hasDeserializerFor(cls);
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return true;
        }
        return Number.class.isAssignableFrom(cls) ? oc.d0.find(cls, name) != null : oc.u.hasDeserializerFor(cls) || cls == String.class || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || oc.k.hasDeserializerFor(cls);
    }

    @Override // mc.s
    public jc.o mapAbstractType(jc.j jVar, jc.o oVar) throws jc.r {
        jc.o oVar2;
        while (true) {
            Class<?> rawClass = oVar.getRawClass();
            lc.t tVar = this.f74156b;
            if (tVar.hasAbstractTypeResolvers()) {
                Iterator<jc.a> it = tVar.abstractTypeResolvers().iterator();
                while (it.hasNext()) {
                    jc.o oVarFindTypeMapping = it.next().findTypeMapping(jVar, oVar);
                    if (oVarFindTypeMapping != null && !oVarFindTypeMapping.hasRawClass(rawClass)) {
                        oVar2 = oVarFindTypeMapping;
                        break;
                    }
                }
                oVar2 = null;
            } else {
                oVar2 = null;
            }
            if (oVar2 == null) {
                return oVar;
            }
            Class<?> rawClass2 = oVar.getRawClass();
            Class<?> rawClass3 = oVar2.getRawClass();
            if (rawClass2 == rawClass3 || !rawClass2.isAssignableFrom(rawClass3)) {
                break;
            }
            oVar = oVar2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + oVar + " to " + oVar2 + ": latter is not a subtype of former");
    }

    @Override // mc.s
    public final s withAbstractTypeResolver(jc.a aVar) {
        return withConfig(this.f74156b.withAbstractTypeResolver(aVar));
    }

    @Override // mc.s
    public final s withAdditionalDeserializers(t tVar) {
        return withConfig(this.f74156b.withAdditionalDeserializers(tVar));
    }

    @Override // mc.s
    public final s withAdditionalKeyDeserializers(u uVar) {
        return withConfig(this.f74156b.withAdditionalKeyDeserializers(uVar));
    }

    public abstract s withConfig(lc.t tVar);

    @Override // mc.s
    public final s withDeserializerModifier(i iVar) {
        return withConfig(this.f74156b.withDeserializerModifier(iVar));
    }

    @Override // mc.s
    public final s withValueInstantiators(e0 e0Var) {
        return withConfig(this.f74156b.withValueInstantiators(e0Var));
    }
}
