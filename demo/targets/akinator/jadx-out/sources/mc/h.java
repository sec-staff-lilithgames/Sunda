package mc;

import b0.e2;
import dd.i0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc.c;
import jc.m0;
import jc.n0;
import jc.o0;
import nc.j0;
import nc.l0;
import rc.t0;
import tb.f1;
import tb.i1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends c implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f74197c = {Throwable.class};

    /* renamed from: e, reason: collision with root package name */
    public static final h f74198e = new h(new lc.t());

    public h(lc.t tVar) {
        super(tVar);
    }

    public static void i(jc.d dVar, g gVar) throws jc.i {
        Map<Object, rc.l> mapFindInjectables = dVar.findInjectables();
        if (mapFindInjectables != null) {
            for (Map.Entry<Object, rc.l> entry : mapFindInjectables.entrySet()) {
                rc.l value = entry.getValue();
                gVar.addInjectable(n0.construct(value.getName()), value.getType(), dVar.getClassAnnotations(), value, entry.getKey());
            }
        }
    }

    public static void j(jc.k kVar, jc.d dVar, g gVar) throws jc.r {
        z zVarFindProperty;
        f1 f1VarObjectIdGeneratorInstance;
        jc.o oVar;
        t0 objectIdInfo = dVar.getObjectIdInfo();
        if (objectIdInfo == null) {
            return;
        }
        Class<? extends f1> generatorType = objectIdInfo.getGeneratorType();
        j1 j1VarObjectIdResolverInstance = kVar.objectIdResolverInstance(dVar.getClassInfo(), objectIdInfo);
        if (generatorType == i1.class) {
            n0 propertyName = objectIdInfo.getPropertyName();
            zVarFindProperty = gVar.findProperty(propertyName);
            if (zVarFindProperty == null) {
                throw new IllegalArgumentException(a.b.m("Invalid Object Id definition for ", dd.i.getTypeDescription(dVar.getType()), ": cannot find property with name ", dd.i.name(propertyName)));
            }
            jc.o type = zVarFindProperty.getType();
            oVar = type;
            f1VarObjectIdGeneratorInstance = new nc.b0(objectIdInfo.getScope());
        } else {
            jc.o oVar2 = kVar.getTypeFactory().findTypeParameters(kVar.constructType((Class<?>) generatorType), f1.class)[0];
            zVarFindProperty = null;
            f1VarObjectIdGeneratorInstance = kVar.objectIdGeneratorInstance(dVar.getClassInfo(), objectIdInfo);
            oVar = oVar2;
        }
        z zVar = zVarFindProperty;
        gVar.setObjectIdReader(nc.w.construct(oVar, objectIdInfo.getPropertyName(), f1VarObjectIdGeneratorInstance, kVar.findRootValueDeserializer(oVar), zVar, j1VarObjectIdResolverInstance));
    }

    public jc.q buildBeanDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.i {
        try {
            c0 c0VarFindValueInstantiator = findValueInstantiator(kVar, dVar);
            g gVar = new g(dVar, kVar);
            gVar.setValueInstantiator(c0VarFindValueInstantiator);
            h(kVar, dVar, gVar);
            j(kVar, dVar, gVar);
            g(kVar, dVar, gVar);
            i(dVar, gVar);
            jc.j config = kVar.getConfig();
            lc.t tVar = this.f74156b;
            if (tVar.hasDeserializerModifiers()) {
                Iterator<i> it = tVar.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    gVar = it.next().updateBuilder(config, dVar, gVar);
                }
            }
            jc.q qVarBuild = (!oVar.isAbstract() || c0VarFindValueInstantiator.canInstantiate()) ? gVar.build() : gVar.buildAbstract();
            if (tVar.hasDeserializerModifiers()) {
                Iterator<i> it2 = tVar.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    qVarBuild = it2.next().modifyDeserializer(config, dVar, qVarBuild);
                }
            }
            return qVarBuild;
        } catch (IllegalArgumentException e10) {
            throw pc.b.from(kVar.getParser(), dd.i.exceptionMessage(e10), dVar, (rc.d0) null).withCause(e10);
        } catch (NoClassDefFoundError e11) {
            return new nc.g(e11);
        }
    }

    public jc.q buildThrowableDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.i {
        jc.j config = kVar.getConfig();
        g gVar = new g(dVar, kVar);
        gVar.setValueInstantiator(findValueInstantiator(kVar, dVar));
        h(kVar, dVar, gVar);
        Iterator<z> properties = gVar.getProperties();
        while (true) {
            if (!properties.hasNext()) {
                break;
            }
            if ("setCause".equals(properties.next().getMember().getName())) {
                properties.remove();
                break;
            }
        }
        rc.m mVarFindMethod = dVar.findMethod("initCause", f74197c);
        if (mVarFindMethod != null) {
            z zVarFindProperty = gVar.findProperty(n0.construct("cause"));
            if (zVarFindProperty instanceof l) {
                ((l) zVarFindProperty).setFallbackSetter(null);
            } else {
                o0 propertyNamingStrategy = config.getPropertyNamingStrategy();
                z zVarL = l(kVar, dVar, i0.construct(kVar.getConfig(), mVarFindMethod, new n0(propertyNamingStrategy != null ? propertyNamingStrategy.nameForSetterMethod(config, mVarFindMethod, "cause") : "cause")), mVarFindMethod.getParameterType(0));
                if (zVarL != null) {
                    gVar.addOrReplaceProperty(zVarL, true);
                }
            }
        }
        lc.t tVar = this.f74156b;
        if (tVar.hasDeserializerModifiers()) {
            Iterator<i> it = tVar.deserializerModifiers().iterator();
            while (it.hasNext()) {
                gVar = it.next().updateBuilder(config, dVar, gVar);
            }
        }
        jc.q qVarBuild = gVar.build();
        if (qVarBuild instanceof e) {
            qVarBuild = oc.i1.construct(kVar, (e) qVarBuild);
        }
        if (tVar.hasDeserializerModifiers()) {
            Iterator<i> it2 = tVar.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                qVarBuild = it2.next().modifyDeserializer(config, dVar, qVarBuild);
            }
        }
        return qVarBuild;
    }

    @Override // mc.s
    public jc.q createBeanDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.r {
        jc.o oVarResolveAbstractType;
        jc.j config = kVar.getConfig();
        lc.t tVar = this.f74156b;
        Iterator<t> it = tVar.deserializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        if (oVar.isThrowable()) {
            return buildThrowableDeserializer(kVar, oVar, dVar);
        }
        l0 l0Var = null;
        if (oVar.isAbstract() && !oVar.isPrimitive() && !oVar.isEnumType()) {
            Iterator<jc.a> it2 = tVar.abstractTypeResolvers().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    oVarResolveAbstractType = null;
                    break;
                }
                oVarResolveAbstractType = it2.next().resolveAbstractType(kVar.getConfig(), dVar);
                if (oVarResolveAbstractType != null) {
                    break;
                }
            }
            if (oVarResolveAbstractType != null) {
                return buildBeanDeserializer(kVar, oVarResolveAbstractType, config.introspect(oVarResolveAbstractType));
            }
        }
        jc.q qVarFindDefaultDeserializer = findDefaultDeserializer(kVar, oVar, dVar);
        if (qVarFindDefaultDeserializer != null && tVar.hasDeserializerModifiers()) {
            Iterator<i> it3 = tVar.deserializerModifiers().iterator();
            while (it3.hasNext()) {
                qVarFindDefaultDeserializer = it3.next().modifyDeserializer(kVar.getConfig(), dVar, qVarFindDefaultDeserializer);
            }
        }
        if (qVarFindDefaultDeserializer != null) {
            return qVarFindDefaultDeserializer;
        }
        Class<?> rawClass = oVar.getRawClass();
        String strCanBeABeanType = dd.i.canBeABeanType(rawClass);
        if (strCanBeABeanType != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + rawClass.getName() + " (of type " + strCanBeABeanType + ") as a Bean");
        }
        if (dd.i.isProxyType(rawClass)) {
            throw new IllegalArgumentException(e2.k(rawClass, new StringBuilder("Cannot deserialize Proxy class "), " as a Bean"));
        }
        String strIsLocalType = dd.i.isLocalType(rawClass, true);
        if (strIsLocalType == null) {
            xc.r.instance().validateSubType(kVar, oVar, dVar);
            String strCheckUnsupportedType = dd.f.checkUnsupportedType(kVar.getConfig(), oVar);
            if (strCheckUnsupportedType != null && kVar.getConfig().findMixInClassFor(oVar.getRawClass()) == null) {
                l0Var = new l0(oVar, strCheckUnsupportedType);
            }
            return l0Var != null ? l0Var : buildBeanDeserializer(kVar, oVar, dVar);
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + rawClass.getName() + " (of type " + strIsLocalType + ") as a Bean");
    }

    @Override // mc.s
    public jc.q createBuilderBasedDeserializer(jc.k kVar, jc.o oVar, jc.d dVar, Class<?> cls) throws jc.i {
        jc.d dVarIntrospectForBuilder = kVar.getConfig().introspectForBuilder(kVar.isEnabled(jc.y.INFER_BUILDER_TYPE_BINDINGS) ? kVar.getTypeFactory().constructParametricType(cls, oVar.getBindings()) : kVar.constructType(cls), dVar);
        try {
            c0 c0VarFindValueInstantiator = findValueInstantiator(kVar, dVarIntrospectForBuilder);
            jc.j config = kVar.getConfig();
            g gVar = new g(dVarIntrospectForBuilder, kVar);
            gVar.setValueInstantiator(c0VarFindValueInstantiator);
            h(kVar, dVarIntrospectForBuilder, gVar);
            j(kVar, dVarIntrospectForBuilder, gVar);
            g(kVar, dVarIntrospectForBuilder, gVar);
            i(dVarIntrospectForBuilder, gVar);
            kc.h hVarFindPOJOBuilderConfig = dVarIntrospectForBuilder.findPOJOBuilderConfig();
            String str = hVarFindPOJOBuilderConfig == null ? "build" : hVarFindPOJOBuilderConfig.f70787a;
            rc.m mVarFindMethod = dVarIntrospectForBuilder.findMethod(str, null);
            if (mVarFindMethod != null && config.canOverrideAccessModifiers()) {
                dd.i.checkAndFixAccess(mVarFindMethod.getMember(), config.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            gVar.setPOJOBuilder(mVarFindMethod, hVarFindPOJOBuilderConfig);
            lc.t tVar = this.f74156b;
            if (tVar.hasDeserializerModifiers()) {
                Iterator<i> it = tVar.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    gVar = it.next().updateBuilder(config, dVarIntrospectForBuilder, gVar);
                }
            }
            jc.q qVarBuildBuilderBased = gVar.buildBuilderBased(oVar, str);
            if (tVar.hasDeserializerModifiers()) {
                Iterator<i> it2 = tVar.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    qVarBuildBuilderBased = it2.next().modifyDeserializer(config, dVarIntrospectForBuilder, qVarBuildBuilderBased);
                }
            }
            return qVarBuildBuilderBased;
        } catch (IllegalArgumentException e10) {
            throw pc.b.from(kVar.getParser(), dd.i.exceptionMessage(e10), dVarIntrospectForBuilder, (rc.d0) null);
        } catch (NoClassDefFoundError e11) {
            return new nc.g(e11);
        }
    }

    public final void g(jc.k kVar, jc.d dVar, g gVar) throws jc.i {
        List<rc.d0> listFindBackReferences = dVar.findBackReferences();
        if (listFindBackReferences != null) {
            for (rc.d0 d0Var : listFindBackReferences) {
                gVar.addBackReferenceProperty(d0Var.findReferenceName(), l(kVar, dVar, d0Var, d0Var.getPrimaryType()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [mc.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(jc.k r19, jc.d r20, mc.g r21) throws jc.r {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.h.h(jc.k, jc.d, mc.g):void");
    }

    public final x k(jc.k kVar, jc.d dVar, rc.l lVar) throws jc.r {
        jc.o contentType;
        jc.f fVar;
        rc.l lVar2;
        jc.o keyType;
        jc.o oVarF;
        Object objFindContentDeserializer;
        Object objFindKeyDeserializer;
        boolean z10 = lVar instanceof rc.i;
        boolean z11 = lVar instanceof rc.q;
        int i10 = -1;
        if (lVar instanceof rc.m) {
            rc.m mVar = (rc.m) lVar;
            keyType = mVar.getParameterType(0);
            oVarF = f(kVar, lVar, mVar.getParameterType(1));
            fVar = new jc.f(n0.construct(lVar.getName()), oVarF, null, lVar, m0.f69372k);
            lVar2 = lVar;
        } else {
            if (z10) {
                jc.o type = ((rc.i) lVar).getType();
                if (!type.isMapLikeType()) {
                    if (type.hasRawClass(jc.t.class) || type.hasRawClass(yc.v.class)) {
                        jc.o oVarF2 = f(kVar, lVar, type);
                        jc.o oVarConstructType = kVar.constructType(jc.t.class);
                        return x.constructForJsonNodeField(kVar, new jc.f(n0.construct(lVar.getName()), oVarF2, null, lVar, m0.f69372k), lVar, oVarConstructType, kVar.findRootValueDeserializer(oVarConstructType));
                    }
                    return (x) kVar.reportBadDefinition(dVar.getType(), "Unsupported type for any-setter: " + dd.i.getTypeDescription(type) + " -- only support `Map`s, `JsonNode` and `ObjectNode` ");
                }
                jc.o oVarF3 = f(kVar, lVar, type);
                keyType = oVarF3.getKeyType();
                contentType = oVarF3.getContentType();
                fVar = new jc.f(n0.construct(lVar.getName()), oVarF3, null, lVar, m0.f69372k);
                lVar2 = lVar;
            } else {
                if (!z11) {
                    return (x) kVar.reportBadDefinition(dVar.getType(), "Unrecognized mutator type for any-setter: " + dd.i.nameOf(lVar.getClass()));
                }
                rc.q qVar = (rc.q) lVar;
                jc.o type2 = qVar.getType();
                int index = qVar.getIndex();
                if (!type2.isMapLikeType()) {
                    if (type2.hasRawClass(jc.t.class) || type2.hasRawClass(yc.v.class)) {
                        jc.o oVarF4 = f(kVar, lVar, type2);
                        jc.o oVarConstructType2 = kVar.constructType(jc.t.class);
                        return x.constructForJsonNodeParameter(kVar, new jc.f(n0.construct(lVar.getName()), oVarF4, null, lVar, m0.f69372k), lVar, oVarConstructType2, kVar.findRootValueDeserializer(oVarConstructType2), index);
                    }
                    return (x) kVar.reportBadDefinition(dVar.getType(), "Unsupported type for any-setter: " + dd.i.getTypeDescription(type2) + " -- only support `Map`s, `JsonNode` and `ObjectNode` ");
                }
                jc.o oVarF5 = f(kVar, lVar, type2);
                jc.o keyType2 = oVarF5.getKeyType();
                contentType = oVarF5.getContentType();
                fVar = new jc.f(n0.construct(lVar.getName()), oVarF5, null, lVar, m0.f69372k);
                lVar2 = lVar;
                keyType = keyType2;
                i10 = index;
            }
            oVarF = contentType;
        }
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        jc.q qVarHandlePrimaryContextualization = null;
        jc.x xVarKeyDeserializerInstance = (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(lVar)) == null) ? null : kVar.keyDeserializerInstance(lVar, objFindKeyDeserializer);
        if (xVarKeyDeserializerInstance == null) {
            xVarKeyDeserializerInstance = (jc.x) keyType.getValueHandler();
        }
        if (xVarKeyDeserializerInstance == null) {
            xVarKeyDeserializerInstance = kVar.findKeyDeserializer(keyType, fVar);
        }
        jc.c annotationIntrospector2 = kVar.getAnnotationIntrospector();
        if (annotationIntrospector2 != null && (objFindContentDeserializer = annotationIntrospector2.findContentDeserializer(lVar)) != null) {
            qVarHandlePrimaryContextualization = kVar.deserializerInstance(lVar, objFindContentDeserializer);
        }
        if (qVarHandlePrimaryContextualization == null) {
            qVarHandlePrimaryContextualization = (jc.q) oVarF.getValueHandler();
        }
        if (qVarHandlePrimaryContextualization != null) {
            qVarHandlePrimaryContextualization = kVar.handlePrimaryContextualization(qVarHandlePrimaryContextualization, fVar, oVarF);
        }
        wc.g gVar = (wc.g) oVarF.getTypeHandler();
        return z10 ? x.constructForMapField(kVar, fVar, lVar2, oVarF, xVarKeyDeserializerInstance, qVarHandlePrimaryContextualization, gVar) : z11 ? x.constructForMapParameter(kVar, fVar, lVar, oVarF, xVarKeyDeserializerInstance, qVarHandlePrimaryContextualization, gVar, i10) : x.constructForMethod(kVar, fVar, lVar, oVarF, xVarKeyDeserializerInstance, qVarHandlePrimaryContextualization, gVar);
    }

    public final z l(jc.k kVar, jc.d dVar, rc.d0 d0Var, jc.o oVar) throws jc.r {
        rc.d0 d0Var2;
        z lVar;
        rc.l nonConstructorMutator = d0Var.getNonConstructorMutator();
        if (nonConstructorMutator == null) {
            kVar.reportBadPropertyDefinition(dVar, d0Var, "No non-constructor mutator available", new Object[0]);
        }
        jc.o oVarF = f(kVar, nonConstructorMutator, oVar);
        wc.g gVar = (wc.g) oVarF.getTypeHandler();
        if (nonConstructorMutator instanceof rc.m) {
            d0Var2 = d0Var;
            lVar = new nc.s(d0Var2, oVarF, gVar, dVar.getClassAnnotations(), (rc.m) nonConstructorMutator);
        } else {
            d0Var2 = d0Var;
            lVar = new nc.l(d0Var2, oVarF, gVar, dVar.getClassAnnotations(), (rc.i) nonConstructorMutator);
        }
        jc.q qVarE = c.e(kVar, nonConstructorMutator);
        if (qVarE == null) {
            qVarE = (jc.q) oVarF.getValueHandler();
        }
        if (qVarE != null) {
            lVar = lVar.withValueDeserializer(kVar.handlePrimaryContextualization(qVarE, lVar, oVarF));
        }
        c.a aVarFindReferenceType = d0Var2.findReferenceType();
        if (aVarFindReferenceType != null && aVarFindReferenceType.isManagedReference()) {
            lVar.setManagedReferenceName(aVarFindReferenceType.getName());
        }
        t0 t0VarFindObjectIdInfo = d0Var2.findObjectIdInfo();
        if (t0VarFindObjectIdInfo != null) {
            lVar.setObjectIdInfo(t0VarFindObjectIdInfo);
        }
        return lVar;
    }

    public final z m(jc.k kVar, jc.d dVar, rc.d0 d0Var) {
        rc.m getter = d0Var.getGetter();
        jc.o oVarF = f(kVar, getter, getter.getType());
        j0 j0Var = new j0(d0Var, oVarF, (wc.g) oVarF.getTypeHandler(), dVar.getClassAnnotations(), getter);
        jc.q qVarE = c.e(kVar, getter);
        if (qVarE == null) {
            qVarE = (jc.q) oVarF.getValueHandler();
        }
        return qVarE != null ? j0Var.withValueDeserializer(kVar.handlePrimaryContextualization(qVarE, j0Var, oVarF)) : j0Var;
    }

    @Override // mc.c
    public s withConfig(lc.t tVar) {
        if (this.f74156b == tVar) {
            return this;
        }
        dd.i.verifyMustOverride(h.class, this, "withConfig");
        return new h(tVar);
    }
}
