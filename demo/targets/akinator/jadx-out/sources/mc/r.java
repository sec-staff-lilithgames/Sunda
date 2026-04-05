package mc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import oc.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final dd.u f74217b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f74218c;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f74219e;

    public r() {
        this(2000);
    }

    public static jc.q b(jc.k kVar, s sVar, jc.o oVar) throws jc.r {
        jc.q qVarDeserializerInstance;
        jc.o oVarRefineDeserializationType;
        Object objFindContentDeserializer;
        jc.o keyType;
        Object objFindKeyDeserializer;
        jc.x xVarKeyDeserializerInstance;
        jc.j config = kVar.getConfig();
        if (oVar.isAbstract() || oVar.isMapLikeType() || oVar.isCollectionLikeType()) {
            oVar = sVar.mapAbstractType(config, oVar);
        }
        jc.d dVarIntrospect = config.introspect(oVar);
        rc.e classInfo = dVarIntrospect.getClassInfo();
        Object objFindDeserializer = kVar.getAnnotationIntrospector().findDeserializer(classInfo);
        Object objDeserializerInstance = null;
        if (objFindDeserializer == null) {
            qVarDeserializerInstance = null;
        } else {
            qVarDeserializerInstance = kVar.deserializerInstance(classInfo, objFindDeserializer);
            Object objFindDeserializationConverter = kVar.getAnnotationIntrospector().findDeserializationConverter(classInfo);
            dd.m mVarConverterInstance = objFindDeserializationConverter == null ? null : kVar.converterInstance(classInfo, objFindDeserializationConverter);
            if (mVarConverterInstance != null) {
                qVarDeserializerInstance = new r0(mVarConverterInstance, ((nc.o) mVarConverterInstance).getInputType(kVar.getTypeFactory()), qVarDeserializerInstance);
            }
        }
        if (qVarDeserializerInstance != null) {
            return qVarDeserializerInstance;
        }
        rc.e classInfo2 = dVarIntrospect.getClassInfo();
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            oVarRefineDeserializationType = oVar;
        } else {
            jc.o oVarWithKeyValueHandler = (!oVar.isMapLikeType() || (keyType = oVar.getKeyType()) == null || keyType.getValueHandler() != null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(classInfo2)) == null || (xVarKeyDeserializerInstance = kVar.keyDeserializerInstance(classInfo2, objFindKeyDeserializer)) == null) ? oVar : ((cd.i) oVar).withKeyValueHandler(xVarKeyDeserializerInstance);
            jc.o contentType = oVarWithKeyValueHandler.getContentType();
            if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(classInfo2)) != null) {
                if (objFindContentDeserializer instanceof jc.q) {
                    objDeserializerInstance = (jc.q) objFindContentDeserializer;
                } else {
                    if (!(objFindContentDeserializer instanceof Class)) {
                        throw new IllegalStateException("AnnotationIntrospector.findContentDeserializer() returned value of type " + objFindContentDeserializer.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
                    }
                    Class cls = (Class) objFindContentDeserializer;
                    if (cls == jc.p.class || dd.i.isBogusClass(cls)) {
                        cls = null;
                    }
                    if (cls != null) {
                        objDeserializerInstance = kVar.deserializerInstance(classInfo2, cls);
                    }
                }
                if (objDeserializerInstance != null) {
                    oVarWithKeyValueHandler = oVarWithKeyValueHandler.withContentValueHandler(objDeserializerInstance);
                }
            }
            oVarRefineDeserializationType = annotationIntrospector.refineDeserializationType(kVar.getConfig(), classInfo2, oVarWithKeyValueHandler);
        }
        if (oVarRefineDeserializationType != oVar) {
            dVarIntrospect = config.introspect(oVarRefineDeserializationType);
            oVar = oVarRefineDeserializationType;
        }
        Class<?> clsFindPOJOBuilder = dVarIntrospect.findPOJOBuilder();
        if (clsFindPOJOBuilder != null) {
            return sVar.createBuilderBasedDeserializer(kVar, oVar, dVarIntrospect, clsFindPOJOBuilder);
        }
        dd.m mVarFindDeserializationConverter = dVarIntrospect.findDeserializationConverter();
        if (mVarFindDeserializationConverter == null) {
            return c(kVar, sVar, oVar, dVarIntrospect);
        }
        jc.o inputType = ((nc.o) mVarFindDeserializationConverter).getInputType(kVar.getTypeFactory());
        if (!inputType.hasRawClass(oVar.getRawClass())) {
            dVarIntrospect = config.introspect(inputType);
        }
        return new r0(mVarFindDeserializationConverter, inputType, c(kVar, sVar, inputType, dVarIntrospect));
    }

    public static jc.q c(jc.k kVar, s sVar, jc.o oVar, jc.d dVar) {
        jc.j config = kVar.getConfig();
        if (oVar.isEnumType()) {
            return sVar.createEnumDeserializer(kVar, oVar, dVar);
        }
        if (oVar.isContainerType()) {
            if (oVar.isArrayType()) {
                return sVar.createArrayDeserializer(kVar, (cd.a) oVar, dVar);
            }
            boolean zIsMapLikeType = oVar.isMapLikeType();
            tb.s sVar2 = tb.s.f86774j;
            if (zIsMapLikeType && dVar.findExpectedFormat().getShape() != sVar2) {
                cd.i iVar = (cd.i) oVar;
                return iVar instanceof cd.j ? sVar.createMapDeserializer(kVar, (cd.j) iVar, dVar) : sVar.createMapLikeDeserializer(kVar, iVar, dVar);
            }
            if (oVar.isCollectionLikeType() && dVar.findExpectedFormat().getShape() != sVar2) {
                cd.d dVar2 = (cd.d) oVar;
                return dVar2 instanceof cd.e ? sVar.createCollectionDeserializer(kVar, (cd.e) dVar2, dVar) : sVar.createCollectionLikeDeserializer(kVar, dVar2, dVar);
            }
        }
        return oVar.isReferenceType() ? sVar.createReferenceDeserializer(kVar, (cd.l) oVar, dVar) : jc.t.class.isAssignableFrom(oVar.getRawClass()) ? sVar.createTreeDeserializer(config, oVar, dVar) : sVar.createBeanDeserializer(kVar, oVar, dVar);
    }

    public static boolean d(jc.o oVar) {
        if (!oVar.isContainerType()) {
            return false;
        }
        jc.o contentType = oVar.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return oVar.isMapLikeType() && oVar.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    public final jc.q a(jc.k kVar, s sVar, jc.o oVar) {
        jc.q qVarB;
        jc.q qVar;
        jc.q qVar2;
        HashMap map = this.f74218c;
        boolean zD = d(oVar);
        dd.u uVar = this.f74217b;
        if (!zD && (qVar2 = (jc.q) uVar.get(oVar)) != null) {
            return qVar2;
        }
        ReentrantLock reentrantLock = this.f74219e;
        reentrantLock.lock();
        if (!zD) {
            try {
                jc.q qVar3 = (jc.q) uVar.get(oVar);
                if (qVar3 != null) {
                    return qVar3;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        int size = map.size();
        if (size > 0 && (qVar = (jc.q) map.get(oVar)) != null) {
            return qVar;
        }
        jc.q qVar4 = null;
        try {
            try {
                qVarB = b(kVar, sVar, oVar);
            } catch (IllegalArgumentException e10) {
                kVar.reportBadDefinition(oVar, dd.i.exceptionMessage(e10));
                qVarB = null;
            }
            if (qVarB != null) {
                boolean z10 = !zD && qVarB.isCachable();
                if (qVarB instanceof w) {
                    map.put(oVar, qVarB);
                    try {
                        ((w) qVarB).resolve(kVar);
                        map.remove(oVar);
                    } catch (Throwable th2) {
                        map.remove(oVar);
                        throw th2;
                    }
                }
                if (z10) {
                    uVar.put(oVar, qVarB);
                }
                qVar4 = qVarB;
            }
            return qVar4;
        } finally {
            if (size == 0 && map.size() > 0) {
                map.clear();
            }
        }
    }

    public int cachedDeserializersCount() {
        return this.f74217b.size();
    }

    public r emptyCopy() {
        return new r(this.f74217b.emptyCopy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jc.x findKeyDeserializer(jc.k kVar, s sVar, jc.o oVar) throws jc.r {
        Objects.requireNonNull(oVar, "Null 'type' passed");
        jc.x xVarCreateKeyDeserializer = sVar.createKeyDeserializer(kVar, oVar);
        if (xVarCreateKeyDeserializer == 0) {
            return (jc.x) kVar.reportBadDefinition(oVar, "Cannot find a (Map) Key deserializer for type " + oVar);
        }
        if (xVarCreateKeyDeserializer instanceof w) {
            ((w) xVarCreateKeyDeserializer).resolve(kVar);
        }
        return xVarCreateKeyDeserializer;
    }

    public jc.q findValueDeserializer(jc.k kVar, s sVar, jc.o oVar) throws jc.r {
        Objects.requireNonNull(oVar, "Null 'propertyType' passed");
        jc.q qVar = d(oVar) ? null : (jc.q) this.f74217b.get(oVar);
        if (qVar != null) {
            return qVar;
        }
        jc.q qVarA = a(kVar, sVar, oVar);
        if (qVarA != null) {
            return qVarA;
        }
        if (dd.i.isConcrete(oVar.getRawClass())) {
            return (jc.q) kVar.reportBadDefinition(oVar, "Cannot find a Value deserializer for type " + oVar);
        }
        return (jc.q) kVar.reportBadDefinition(oVar, "Cannot find a Value deserializer for abstract type " + oVar);
    }

    public void flushCachedDeserializers() {
        this.f74217b.clear();
    }

    public boolean hasValueDeserializerFor(jc.k kVar, s sVar, jc.o oVar) throws jc.r {
        Objects.requireNonNull(oVar, "Null 'type' passed");
        jc.q qVarA = d(oVar) ? null : (jc.q) this.f74217b.get(oVar);
        if (qVarA == null) {
            qVarA = a(kVar, sVar, oVar);
        }
        return qVarA != null;
    }

    public r(int i10) {
        this(new dd.s(Math.min(64, i10 >> 2), i10));
    }

    public r(dd.u uVar) {
        this.f74218c = new HashMap(8);
        this.f74219e = new ReentrantLock();
        this.f74217b = uVar;
    }
}
