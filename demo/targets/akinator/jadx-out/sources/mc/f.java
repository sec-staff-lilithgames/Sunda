package mc;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jc.n0;
import nc.i0;
import nc.k0;
import nc.m0;
import oc.s0;
import rc.t0;
import tb.e1;
import tb.f1;
import tb.i1;
import tb.j1;
import tb.q0;
import ub.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f extends s0 implements k, w, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final n0 f74161z = new n0("#temporary-name");

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f74162f;

    /* renamed from: g, reason: collision with root package name */
    public final tb.s f74163g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f74164h;

    /* renamed from: i, reason: collision with root package name */
    public jc.q f74165i;

    /* renamed from: j, reason: collision with root package name */
    public jc.q f74166j;

    /* renamed from: k, reason: collision with root package name */
    public nc.a0 f74167k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f74168l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f74169m;

    /* renamed from: n, reason: collision with root package name */
    public final nc.c f74170n;

    /* renamed from: o, reason: collision with root package name */
    public final nc.n0[] f74171o;

    /* renamed from: p, reason: collision with root package name */
    public x f74172p;

    /* renamed from: q, reason: collision with root package name */
    public final Set f74173q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f74174r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f74175s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f74176t;

    /* renamed from: u, reason: collision with root package name */
    public final Map f74177u;

    /* renamed from: v, reason: collision with root package name */
    public transient ConcurrentHashMap f74178v;

    /* renamed from: w, reason: collision with root package name */
    public m0 f74179w;

    /* renamed from: x, reason: collision with root package name */
    public nc.j f74180x;

    /* renamed from: y, reason: collision with root package name */
    public final nc.w f74181y;

    public f(g gVar, jc.d dVar, nc.c cVar, Map map, Set set, boolean z10, Set set2, boolean z11) {
        super(dVar.getType());
        this.f74162f = dVar.getType();
        c0 valueInstantiator = gVar.getValueInstantiator();
        this.f74164h = valueInstantiator;
        nc.n0[] n0VarArr = null;
        this.f74165i = null;
        this.f74166j = null;
        this.f74167k = null;
        this.f74170n = cVar;
        this.f74177u = map;
        this.f74173q = set;
        this.f74175s = z10;
        this.f74174r = set2;
        this.f74172p = gVar.getAnySetter();
        List<nc.n0> injectables = gVar.getInjectables();
        if (injectables != null && !injectables.isEmpty()) {
            n0VarArr = (nc.n0[]) injectables.toArray(new nc.n0[injectables.size()]);
        }
        this.f74171o = n0VarArr;
        nc.w objectIdReader = gVar.getObjectIdReader();
        this.f74181y = objectIdReader;
        this.f74168l = this.f74179w != null || valueInstantiator.canCreateUsingDelegate() || valueInstantiator.canCreateFromObjectWith() || !valueInstantiator.canCreateUsingDefault();
        this.f74163g = dVar.findExpectedFormat().getShape();
        this.f74176t = z11;
        this.f74169m = !this.f74168l && n0VarArr == null && !z11 && objectIdReader == null;
    }

    public static jc.q X(jc.k kVar, jc.o oVar, rc.r rVar) throws jc.r {
        jc.o oVar2;
        jc.f fVar;
        e1 e1VarNonDefaultValueNulls;
        e1 e1VarNonDefaultContentNulls;
        q0 q0VarFindSetterInfo;
        n0 n0Var = f74161z;
        if (rVar == null || rVar.getParameterCount() != 1) {
            oVar2 = oVar;
            fVar = new jc.f(n0Var, oVar2, null, rVar, jc.m0.f69372k);
        } else {
            rc.q parameter = rVar.getParameter(0);
            jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
            jc.j config = kVar.getConfig();
            jc.m0 m0VarWithNulls = jc.m0.f69372k;
            if (annotationIntrospector == null || (q0VarFindSetterInfo = annotationIntrospector.findSetterInfo(parameter)) == null) {
                e1VarNonDefaultValueNulls = null;
                e1VarNonDefaultContentNulls = null;
            } else {
                e1VarNonDefaultValueNulls = q0VarFindSetterInfo.nonDefaultValueNulls();
                e1VarNonDefaultContentNulls = q0VarFindSetterInfo.nonDefaultContentNulls();
            }
            q0 setterInfo = config.getConfigOverride(oVar.getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (e1VarNonDefaultValueNulls == null) {
                    e1VarNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                }
                if (e1VarNonDefaultContentNulls == null) {
                    e1VarNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                }
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
            jc.m0 m0Var = m0VarWithNulls;
            oVar2 = oVar;
            fVar = new jc.f(n0Var, oVar2, null, parameter, m0Var);
        }
        wc.g gVarFindTypeDeserializer = (wc.g) oVar2.getTypeHandler();
        if (gVarFindTypeDeserializer == null) {
            gVarFindTypeDeserializer = kVar.getConfig().findTypeDeserializer(oVar2);
        }
        jc.q qVar = (jc.q) oVar2.getValueHandler();
        jc.q qVarFindContextualValueDeserializer = qVar == null ? kVar.findContextualValueDeserializer(oVar2, fVar) : kVar.handleSecondaryContextualization(qVar, fVar, oVar2);
        return gVarFindTypeDeserializer != null ? new k0(gVarFindTypeDeserializer.forProperty(fVar), qVarFindContextualValueDeserializer) : qVarFindContextualValueDeserializer;
    }

    public final jc.q V() {
        jc.q qVar = this.f74165i;
        return qVar == null ? this.f74166j : qVar;
    }

    public abstract Object W(ub.u uVar, jc.k kVar);

    public final Object Y(ub.u uVar, jc.k kVar, Object obj, Object obj2) throws IOException {
        nc.w wVar = this.f74181y;
        jc.q deserializer = wVar.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            dd.k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            if (obj2 instanceof String) {
                k0VarBufferForInputBuffering.writeString((String) obj2);
            } else if (obj2 instanceof Long) {
                k0VarBufferForInputBuffering.writeNumber(((Long) obj2).longValue());
            } else if (obj2 instanceof Integer) {
                k0VarBufferForInputBuffering.writeNumber(((Integer) obj2).intValue());
            } else {
                k0VarBufferForInputBuffering.writeObject(obj2);
            }
            ub.u uVarAsParser = k0VarBufferForInputBuffering.asParser(uVar.streamReadConstraints());
            uVarAsParser.nextToken();
            obj2 = deserializer.deserialize(uVarAsParser, kVar);
        }
        kVar.findObjectId(obj2, wVar.f75968e, wVar.f75969f).bindItem(obj);
        z zVar = wVar.f75971h;
        return zVar != null ? zVar.setAndReturn(obj, obj2) : obj;
    }

    public abstract f Z();

    public final Object a0(ub.u uVar, jc.k kVar) throws IOException {
        nc.w wVar = this.f74181y;
        Object objectReference = wVar.readObjectReference(uVar, kVar);
        i0 i0VarFindObjectId = kVar.findObjectId(objectReference, wVar.f75968e, wVar.f75969f);
        Object objResolve = i0VarFindObjectId.resolve();
        if (objResolve != null) {
            return objResolve;
        }
        throw new a0(uVar, "Could not resolve Object Id [" + objectReference + "] (for " + this.f74162f + ").", uVar.currentLocation(), i0VarFindObjectId);
    }

    public final Object b0(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        jc.q qVar = (this.f74165i == null && this.f74166j != null && (uVar.hasToken(ub.z.START_ARRAY) || this.f74167k == null)) ? this.f74166j : this.f74165i;
        if (qVar != null) {
            Object objCreateUsingDelegate = this.f74164h.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
            if (this.f74171o != null) {
                h0(kVar, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (this.f74167k != null) {
            return W(uVar, kVar);
        }
        Class<?> rawClass = this.f74162f.getRawClass();
        return dd.i.isNonStaticInnerClass(rawClass) ? kVar.handleMissingInstantiator(rawClass, null, uVar, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]) : dd.c0.needsReflectionConfiguration(rawClass) ? kVar.handleMissingInstantiator(rawClass, null, uVar, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]) : kVar.handleMissingInstantiator(rawClass, getValueInstantiator(), uVar, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public final void c0(ub.u uVar, jc.k kVar, Object obj, String str) throws IOException {
        if (kVar.isEnabled(jc.l.FAIL_ON_IGNORED_PROPERTIES)) {
            throw pc.a.from(uVar, obj, str, getKnownPropertyNames());
        }
        uVar.skipChildren();
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        nc.w wVarConstruct;
        t0 t0VarFindObjectIdInfo;
        z zVar;
        jc.o oVar;
        f1 f1VarObjectIdGeneratorInstance;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        rc.l member = (gVar == null || annotationIntrospector == null) ? null : gVar.getMember();
        nc.w wVar = this.f74181y;
        if (member == null || (t0VarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) == null) {
            wVarConstruct = wVar;
        } else {
            t0 t0VarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, t0VarFindObjectIdInfo);
            Class<? extends f1> generatorType = t0VarFindObjectReferenceInfo.getGeneratorType();
            j1 j1VarObjectIdResolverInstance = kVar.objectIdResolverInstance(member, t0VarFindObjectReferenceInfo);
            if (generatorType == i1.class) {
                n0 propertyName = t0VarFindObjectReferenceInfo.getPropertyName();
                z zVarFindProperty = findProperty(propertyName);
                if (zVarFindProperty == null) {
                    return (jc.q) kVar.reportBadDefinition(this.f74162f, a.b.m("Invalid Object Id definition for ", dd.i.nameOf(handledType()), ": cannot find property with name ", dd.i.name(propertyName)));
                }
                jc.o type = zVarFindProperty.getType();
                zVar = zVarFindProperty;
                f1VarObjectIdGeneratorInstance = new nc.b0(t0VarFindObjectReferenceInfo.getScope());
                oVar = type;
            } else {
                zVar = null;
                oVar = kVar.getTypeFactory().findTypeParameters(kVar.constructType((Class<?>) generatorType), f1.class)[0];
                f1VarObjectIdGeneratorInstance = kVar.objectIdGeneratorInstance(member, t0VarFindObjectReferenceInfo);
            }
            wVarConstruct = nc.w.construct(oVar, t0VarFindObjectReferenceInfo.getPropertyName(), f1VarObjectIdGeneratorInstance, kVar.findRootValueDeserializer(oVar), zVar, j1VarObjectIdResolverInstance);
        }
        f fVarWithObjectIdReader = (wVarConstruct == null || wVarConstruct == wVar) ? this : withObjectIdReader(wVarConstruct);
        if (member != null) {
            jc.j config = kVar.getConfig();
            tb.z zVarFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (zVarFindPropertyIgnoralByName.getIgnoreUnknown() && !this.f74175s) {
                fVarWithObjectIdReader = fVarWithObjectIdReader.withIgnoreAllUnknown(true);
            }
            Set<String> setFindIgnoredForDeserialization = zVarFindPropertyIgnoralByName.findIgnoredForDeserialization();
            Set<String> set = fVarWithObjectIdReader.f74173q;
            if (setFindIgnoredForDeserialization.isEmpty()) {
                setFindIgnoredForDeserialization = set;
            } else if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet(set);
                hashSet.addAll(setFindIgnoredForDeserialization);
                setFindIgnoredForDeserialization = hashSet;
            }
            Set<String> set2 = fVarWithObjectIdReader.f74174r;
            Set<String> setCombineNamesToInclude = dd.r.combineNamesToInclude(set2, annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded());
            if (setFindIgnoredForDeserialization != set || setCombineNamesToInclude != set2) {
                fVarWithObjectIdReader = fVarWithObjectIdReader.withByNameInclusion(setFindIgnoredForDeserialization, setCombineNamesToInclude);
            }
        }
        tb.t tVarS = s0.S(kVar, gVar, handledType());
        if (tVarS != null) {
            shape = tVarS.hasShape() ? tVarS.getShape() : null;
            Boolean feature = tVarS.getFeature(tb.q.f86755c);
            if (feature != null) {
                boolean zBooleanValue = feature.booleanValue();
                nc.c cVar = this.f74170n;
                nc.c cVarWithCaseInsensitivity = cVar.withCaseInsensitivity(zBooleanValue);
                if (cVarWithCaseInsensitivity != cVar) {
                    fVarWithObjectIdReader = fVarWithObjectIdReader.withBeanProperties(cVarWithCaseInsensitivity);
                }
            }
        }
        if (shape == null) {
            shape = this.f74163g;
        }
        return shape == tb.s.f86773i ? fVarWithObjectIdReader.Z() : fVarWithObjectIdReader;
    }

    public Iterator<z> creatorProperties() {
        nc.a0 a0Var = this.f74167k;
        return a0Var == null ? Collections.EMPTY_LIST.iterator() : a0Var.properties().iterator();
    }

    public final Object d0(ub.u uVar, jc.k kVar, f0 f0Var, Object obj, dd.k0 k0Var) throws IOException {
        cd.b bVar = new cd.b(obj.getClass());
        ConcurrentHashMap concurrentHashMap = this.f74178v;
        jc.q qVarFindRootValueDeserializer = concurrentHashMap == null ? null : (jc.q) concurrentHashMap.get(bVar);
        if (qVarFindRootValueDeserializer == null && (qVarFindRootValueDeserializer = kVar.findRootValueDeserializer(kVar.constructType(obj.getClass()))) != null) {
            if (this.f74178v == null) {
                synchronized (this) {
                    try {
                        if (this.f74178v == null) {
                            this.f74178v = new ConcurrentHashMap();
                        }
                    } finally {
                    }
                }
            }
            this.f74178v.put(bVar, qVarFindRootValueDeserializer);
        }
        if (qVarFindRootValueDeserializer == null) {
            if (k0Var != null) {
                e0(kVar, obj, k0Var);
            }
            return uVar != null ? deserialize(uVar, kVar, obj) : obj;
        }
        if (k0Var != null) {
            k0Var.writeEndObject();
            ub.u uVarAsParser = k0Var.asParser(f0Var);
            uVarAsParser.nextToken();
            obj = qVarFindRootValueDeserializer.deserialize(uVarAsParser, kVar, obj);
        }
        return uVar != null ? qVarFindRootValueDeserializer.deserialize(uVar, kVar, obj) : obj;
    }

    @Deprecated
    public Object deserializeFromArray(ub.u uVar, jc.k kVar) throws IOException {
        return n(uVar, kVar);
    }

    public Object deserializeFromBoolean(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        jc.q qVarV = V();
        c0 c0Var = this.f74164h;
        if (qVarV == null || c0Var.canCreateFromBoolean()) {
            return c0Var.createFromBoolean(kVar, uVar.currentToken() == ub.z.VALUE_TRUE);
        }
        Object objCreateUsingDelegate = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
        if (this.f74171o != null) {
            h0(kVar, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromDouble(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        ub.s numberType = uVar.getNumberType();
        ub.s sVar = ub.s.f88353g;
        nc.n0[] n0VarArr = this.f74171o;
        c0 c0Var = this.f74164h;
        if (numberType == sVar || numberType == ub.s.f88352f) {
            jc.q qVarV = V();
            if (qVarV == null || c0Var.canCreateFromDouble()) {
                return c0Var.createFromDouble(kVar, uVar.getDoubleValue());
            }
            Object objCreateUsingDelegate = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (numberType != ub.s.f88354h) {
            return kVar.handleMissingInstantiator(handledType(), getValueInstantiator(), uVar, "no suitable creator method found to deserialize from Number value (%s)", uVar.getNumberValue());
        }
        jc.q qVarV2 = V();
        if (qVarV2 == null || c0Var.canCreateFromBigDecimal()) {
            return c0Var.createFromBigDecimal(kVar, uVar.getDecimalValue());
        }
        Object objCreateUsingDelegate2 = c0Var.createUsingDelegate(kVar, qVarV2.deserialize(uVar, kVar));
        if (n0VarArr != null) {
            h0(kVar, objCreateUsingDelegate2);
        }
        return objCreateUsingDelegate2;
    }

    public Object deserializeFromEmbedded(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (this.f74181y != null) {
            return a0(uVar, kVar);
        }
        jc.q qVarV = V();
        if (qVarV != null) {
            c0 c0Var = this.f74164h;
            if (!c0Var.canCreateFromString()) {
                Object objCreateUsingDelegate = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
                if (this.f74171o != null) {
                    h0(kVar, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
        }
        Object embeddedObject = uVar.getEmbeddedObject();
        if (embeddedObject != null) {
            Class<?> cls = embeddedObject.getClass();
            jc.o oVar = this.f74162f;
            if (!oVar.isTypeOrSuperTypeOf(cls)) {
                return kVar.handleWeirdNativeValue(oVar, embeddedObject, uVar);
            }
        }
        return embeddedObject;
    }

    public Object deserializeFromNumber(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (this.f74181y != null) {
            return a0(uVar, kVar);
        }
        jc.q qVarV = V();
        ub.s numberType = uVar.getNumberType();
        ub.s sVar = ub.s.f88349b;
        nc.n0[] n0VarArr = this.f74171o;
        c0 c0Var = this.f74164h;
        if (numberType == sVar) {
            if (qVarV == null || c0Var.canCreateFromInt()) {
                return c0Var.createFromInt(kVar, uVar.getIntValue());
            }
            Object objCreateUsingDelegate = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (numberType == ub.s.f88350c) {
            if (qVarV == null || c0Var.canCreateFromInt()) {
                return c0Var.createFromLong(kVar, uVar.getLongValue());
            }
            Object objCreateUsingDelegate2 = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
            if (n0VarArr != null) {
                h0(kVar, objCreateUsingDelegate2);
            }
            return objCreateUsingDelegate2;
        }
        if (numberType != ub.s.f88351e) {
            return kVar.handleMissingInstantiator(handledType(), getValueInstantiator(), uVar, "no suitable creator method found to deserialize from Number value (%s)", uVar.getNumberValue());
        }
        if (qVarV == null || c0Var.canCreateFromBigInteger()) {
            return c0Var.createFromBigInteger(kVar, uVar.getBigIntegerValue());
        }
        Object objCreateUsingDelegate3 = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
        if (n0VarArr != null) {
            h0(kVar, objCreateUsingDelegate3);
        }
        return objCreateUsingDelegate3;
    }

    public abstract Object deserializeFromObject(ub.u uVar, jc.k kVar) throws IOException;

    public Object deserializeFromString(ub.u uVar, jc.k kVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (this.f74181y != null) {
            return a0(uVar, kVar);
        }
        jc.q qVarV = V();
        if (qVarV != null) {
            c0 c0Var = this.f74164h;
            if (!c0Var.canCreateFromString()) {
                Object objCreateUsingDelegate = c0Var.createUsingDelegate(kVar, qVarV.deserialize(uVar, kVar));
                if (this.f74171o != null) {
                    h0(kVar, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
        }
        return p(uVar, kVar);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        Object objectId;
        nc.w wVar = this.f74181y;
        if (wVar != null) {
            if (uVar.canReadObjectId() && (objectId = uVar.getObjectId()) != null) {
                return Y(uVar, kVar, gVar.deserializeTypedFromObject(uVar, kVar), objectId);
            }
            ub.z zVarCurrentToken = uVar.currentToken();
            if (zVarCurrentToken != null) {
                if (zVarCurrentToken.isScalarValue()) {
                    return a0(uVar, kVar);
                }
                if (zVarCurrentToken == ub.z.START_OBJECT) {
                    zVarCurrentToken = uVar.nextToken();
                }
                if (zVarCurrentToken == ub.z.FIELD_NAME && wVar.maySerializeAsObject() && wVar.isValidReferencePropertyName(uVar.currentName(), uVar)) {
                    return a0(uVar, kVar);
                }
            }
        }
        return gVar.deserializeTypedFromObject(uVar, kVar);
    }

    public final void e0(jc.k kVar, Object obj, dd.k0 k0Var) throws IOException {
        k0Var.writeEndObject();
        ub.u uVarAsParser = k0Var.asParser();
        while (uVarAsParser.nextToken() != ub.z.END_OBJECT) {
            String strCurrentName = uVarAsParser.currentName();
            uVarAsParser.nextToken();
            f0(uVarAsParser, kVar, obj, strCurrentName);
        }
    }

    public final void f0(ub.u uVar, jc.k kVar, Object obj, String str) throws IOException {
        if (this.f74175s) {
            uVar.skipChildren();
            return;
        }
        if (dd.r.shouldIgnore(str, this.f74173q, this.f74174r)) {
            c0(uVar, kVar, obj, str);
        }
        if (obj == null) {
            obj = handledType();
        }
        if (kVar.handleUnknownProperty(uVar, this, obj, str)) {
            return;
        }
        uVar.skipChildren();
    }

    @Override // jc.q
    public z findBackReference(String str) {
        Map map = this.f74177u;
        if (map == null) {
            return null;
        }
        return (z) map.get(str);
    }

    public z findProperty(n0 n0Var) {
        return findProperty(n0Var.getSimpleName());
    }

    public final void g0(ub.u uVar, jc.k kVar, Object obj, String str) throws IOException {
        if (dd.r.shouldIgnore(str, this.f74173q, this.f74174r)) {
            c0(uVar, kVar, obj, str);
            return;
        }
        x xVar = this.f74172p;
        if (xVar == null) {
            f0(uVar, kVar, obj, str);
            return;
        }
        try {
            xVar.deserializeAndSet(uVar, kVar, obj, str);
        } catch (Exception e10) {
            wrapAndThrow(e10, obj, str, kVar);
        }
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this.f74162f.getRawClass();
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        try {
            return this.f74164h.createUsingDefaultOrWithoutArguments(kVar);
        } catch (IOException e10) {
            return dd.i.throwAsMappingException(kVar, e10);
        }
    }

    @Override // jc.q
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<z> it = this.f74170n.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // jc.q, mc.v
    public dd.a getNullAccessPattern() {
        return dd.a.f51981b;
    }

    @Override // jc.q
    public nc.w getObjectIdReader() {
        return this.f74181y;
    }

    public int getPropertyCount() {
        return this.f74170n.size();
    }

    @Override // oc.s0, mc.d0
    public c0 getValueInstantiator() {
        return this.f74164h;
    }

    @Override // oc.s0
    public jc.o getValueType() {
        return this.f74162f;
    }

    public final void h0(jc.k kVar, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        for (nc.n0 n0Var : this.f74171o) {
            n0Var.inject(kVar, obj);
        }
    }

    @Override // oc.s0, jc.q
    public Class<?> handledType() {
        return this.f74162f.getRawClass();
    }

    public boolean hasProperty(String str) {
        return this.f74170n.find(str) != null;
    }

    public boolean hasViews() {
        return this.f74176t;
    }

    public final Object i0(Exception exc, jc.k kVar) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        dd.i.throwIfError(cause);
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (kVar == null) {
            throw new IllegalArgumentException(cause.getMessage(), cause);
        }
        if (!kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
            dd.i.throwIfRTE(cause);
        }
        return kVar.handleInstantiationProblem(this.f74162f.getRawClass(), null, cause);
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    public boolean isCaseInsensitive() {
        return this.f74170n.isCaseInsensitive();
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12142f;
    }

    public Iterator<z> properties() {
        nc.c cVar = this.f74170n;
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public void replaceProperty(z zVar, z zVar2) {
        this.f74170n.replace(zVar, zVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d6, code lost:
    
        if (r5 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026d A[EDGE_INSN: B:182:0x026d->B:116:0x026d BREAK  A[LOOP:3: B:106:0x023d->B:115:0x026a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    @Override // mc.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolve(jc.k r23) throws java.lang.SecurityException, jc.r {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.f.resolve(jc.k):void");
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    @Override // jc.q
    public abstract jc.q unwrappingDeserializer(dd.a0 a0Var);

    public f withBeanProperties(nc.c cVar) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract f withByNameInclusion(Set<String> set, Set<String> set2);

    @Deprecated
    public f withIgnorableProperties(Set<String> set) {
        return withByNameInclusion(set, this.f74174r);
    }

    public abstract f withIgnoreAllUnknown(boolean z10);

    public abstract f withObjectIdReader(nc.w wVar);

    public <T> T wrapAndThrow(Throwable th2, Object obj, String str, jc.k kVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        dd.i.throwIfError(th2);
        boolean z10 = kVar == null || kVar.isEnabled(jc.l.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof ub.h)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            dd.i.throwIfRTE(th2);
        }
        throw jc.r.wrapWithPath(th2, obj, str);
    }

    public z findProperty(String str) {
        nc.a0 a0Var;
        nc.c cVar = this.f74170n;
        z zVarFind = cVar == null ? null : cVar.find(str);
        return (zVarFind != null || (a0Var = this.f74167k) == null) ? zVarFind : a0Var.findCreatorProperty(str);
    }

    public z findProperty(int i10) {
        nc.a0 a0Var;
        nc.c cVar = this.f74170n;
        z zVarFind = cVar == null ? null : cVar.find(i10);
        return (zVarFind != null || (a0Var = this.f74167k) == null) ? zVarFind : a0Var.findCreatorProperty(i10);
    }

    public f(f fVar) {
        this(fVar, fVar.f74175s);
    }

    public f(f fVar, boolean z10) {
        super(fVar.f74162f);
        this.f74162f = fVar.f74162f;
        this.f74164h = fVar.f74164h;
        this.f74165i = fVar.f74165i;
        this.f74166j = fVar.f74166j;
        this.f74167k = fVar.f74167k;
        this.f74170n = fVar.f74170n;
        this.f74177u = fVar.f74177u;
        this.f74173q = fVar.f74173q;
        this.f74175s = z10;
        this.f74174r = fVar.f74174r;
        this.f74172p = fVar.f74172p;
        this.f74171o = fVar.f74171o;
        this.f74181y = fVar.f74181y;
        this.f74168l = fVar.f74168l;
        this.f74179w = fVar.f74179w;
        this.f74176t = fVar.f74176t;
        this.f74163g = fVar.f74163g;
        this.f74169m = fVar.f74169m;
        this.f74180x = fVar.f74180x;
    }

    public f(f fVar, dd.a0 a0Var) {
        super(fVar.f74162f);
        this.f74162f = fVar.f74162f;
        this.f74164h = fVar.f74164h;
        this.f74165i = fVar.f74165i;
        this.f74166j = fVar.f74166j;
        this.f74177u = fVar.f74177u;
        this.f74173q = fVar.f74173q;
        this.f74175s = a0Var != null || fVar.f74175s;
        this.f74174r = fVar.f74174r;
        this.f74172p = fVar.f74172p;
        this.f74171o = fVar.f74171o;
        this.f74181y = fVar.f74181y;
        this.f74168l = fVar.f74168l;
        m0 m0VarRenameAll = fVar.f74179w;
        nc.a0 a0VarRenameAll = fVar.f74167k;
        if (a0Var != null) {
            m0VarRenameAll = m0VarRenameAll != null ? m0VarRenameAll.renameAll(a0Var) : m0VarRenameAll;
            a0VarRenameAll = a0VarRenameAll != null ? a0VarRenameAll.renameAll(a0Var) : a0VarRenameAll;
            this.f74170n = fVar.f74170n.renameAll(a0Var);
        } else {
            this.f74170n = fVar.f74170n;
        }
        this.f74167k = a0VarRenameAll;
        this.f74179w = m0VarRenameAll;
        this.f74176t = fVar.f74176t;
        this.f74163g = fVar.f74163g;
        this.f74169m = false;
        this.f74180x = fVar.f74180x;
    }

    public f(f fVar, nc.w wVar) {
        super(fVar.f74162f);
        this.f74162f = fVar.f74162f;
        this.f74164h = fVar.f74164h;
        this.f74165i = fVar.f74165i;
        this.f74166j = fVar.f74166j;
        this.f74167k = fVar.f74167k;
        this.f74177u = fVar.f74177u;
        this.f74173q = fVar.f74173q;
        this.f74175s = fVar.f74175s;
        this.f74174r = fVar.f74174r;
        this.f74172p = fVar.f74172p;
        this.f74171o = fVar.f74171o;
        this.f74168l = fVar.f74168l;
        this.f74179w = fVar.f74179w;
        this.f74176t = fVar.f74176t;
        this.f74163g = fVar.f74163g;
        this.f74181y = wVar;
        if (wVar == null) {
            this.f74170n = fVar.f74170n;
            this.f74169m = fVar.f74169m;
        } else {
            this.f74170n = fVar.f74170n.withProperty(new nc.y(wVar, jc.m0.f69371j));
            this.f74169m = false;
        }
        this.f74180x = fVar.f74180x;
    }

    public f(f fVar, Set<String> set, Set<String> set2) {
        super(fVar.f74162f);
        this.f74162f = fVar.f74162f;
        this.f74164h = fVar.f74164h;
        this.f74165i = fVar.f74165i;
        this.f74166j = fVar.f74166j;
        this.f74167k = fVar.f74167k;
        this.f74177u = fVar.f74177u;
        this.f74173q = set;
        this.f74175s = fVar.f74175s;
        this.f74174r = set2;
        this.f74172p = fVar.f74172p;
        this.f74171o = fVar.f74171o;
        this.f74168l = fVar.f74168l;
        this.f74179w = fVar.f74179w;
        this.f74176t = fVar.f74176t;
        this.f74163g = fVar.f74163g;
        this.f74169m = fVar.f74169m;
        this.f74181y = fVar.f74181y;
        this.f74170n = fVar.f74170n.withoutProperties(set, set2);
        this.f74180x = fVar.f74180x;
    }

    public f(f fVar, nc.c cVar) {
        super(fVar.f74162f);
        this.f74162f = fVar.f74162f;
        this.f74164h = fVar.f74164h;
        this.f74165i = fVar.f74165i;
        this.f74166j = fVar.f74166j;
        this.f74167k = fVar.f74167k;
        this.f74170n = cVar;
        this.f74177u = fVar.f74177u;
        this.f74173q = fVar.f74173q;
        this.f74175s = fVar.f74175s;
        this.f74174r = fVar.f74174r;
        this.f74172p = fVar.f74172p;
        this.f74171o = fVar.f74171o;
        this.f74181y = fVar.f74181y;
        this.f74168l = fVar.f74168l;
        this.f74179w = fVar.f74179w;
        this.f74176t = fVar.f74176t;
        this.f74163g = fVar.f74163g;
        this.f74169m = fVar.f74169m;
        this.f74180x = fVar.f74180x;
    }
}
