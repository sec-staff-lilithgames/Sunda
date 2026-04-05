package oc;

import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a0 extends j implements mc.k, mc.w {

    /* renamed from: j, reason: collision with root package name */
    public final jc.x f78781j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f78782k;

    /* renamed from: l, reason: collision with root package name */
    public final jc.q f78783l;

    /* renamed from: m, reason: collision with root package name */
    public final wc.g f78784m;

    /* renamed from: n, reason: collision with root package name */
    public final mc.c0 f78785n;

    /* renamed from: o, reason: collision with root package name */
    public jc.q f78786o;

    /* renamed from: p, reason: collision with root package name */
    public nc.a0 f78787p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f78788q;

    /* renamed from: r, reason: collision with root package name */
    public Set f78789r;

    /* renamed from: s, reason: collision with root package name */
    public Set f78790s;

    /* renamed from: t, reason: collision with root package name */
    public dd.q f78791t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f78792u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f78793a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f78794b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f78795c = new ArrayList();

        public a(Class<?> cls, Map<Object, Object> map) {
            this.f78793a = cls;
            this.f78794b = map;
        }

        public i0.a handleUnresolvedReference(mc.a0 a0Var, Object obj) {
            z zVar = new z(this, a0Var, this.f78793a, obj);
            this.f78795c.add(zVar);
            return zVar;
        }

        public void put(Object obj, Object obj2) {
            ArrayList arrayList = this.f78795c;
            if (arrayList.isEmpty()) {
                this.f78794b.put(obj, obj2);
            } else {
                ((z) o2.e(1, arrayList)).f78967d.put(obj, obj2);
            }
        }

        public void resolveForwardReference(Object obj, Object obj2) throws IOException {
            Iterator it = this.f78795c.iterator();
            Map map = this.f78794b;
            while (it.hasNext()) {
                z zVar = (z) it.next();
                boolean zHasId = zVar.hasId(obj);
                LinkedHashMap linkedHashMap = zVar.f78967d;
                if (zHasId) {
                    it.remove();
                    map.put(zVar.f78968e, obj2);
                    map.putAll(linkedHashMap);
                    return;
                }
                map = linkedHashMap;
            }
            throw new IllegalArgumentException(o2.k(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
        }
    }

    public a0(jc.o oVar, mc.c0 c0Var, jc.x xVar, jc.q qVar, wc.g gVar) {
        super(oVar, (mc.v) null, (Boolean) null);
        this.f78781j = xVar;
        this.f78783l = qVar;
        this.f78784m = gVar;
        this.f78785n = c0Var;
        this.f78788q = c0Var.canCreateUsingDefault();
        this.f78786o = null;
        this.f78787p = null;
        this.f78782k = X(oVar, xVar);
        this.f78791t = null;
        this.f78792u = oVar.getContentType().hasRawClass(Object.class);
    }

    public static boolean X(jc.o oVar, jc.x xVar) {
        jc.o keyType;
        if (xVar == null || (keyType = oVar.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && dd.i.isJacksonStdImpl(xVar);
    }

    public final Object W(ub.u uVar, jc.k kVar) {
        jc.q qVar = this.f78783l;
        wc.g gVar = this.f78784m;
        return gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
    }

    public final void Y(ub.u uVar, jc.k kVar, Map map) throws IOException {
        String strCurrentName;
        jc.k kVar2;
        Map map2;
        Exception exc;
        Object objW;
        Object obj;
        boolean z10 = this.f78783l.getObjectIdReader() != null;
        a aVar = z10 ? new a(this.f78873f.getContentType().getRawClass(), map) : null;
        if (uVar.isExpectedStartObjectToken()) {
            strCurrentName = uVar.nextFieldName();
        } else {
            ub.z zVarCurrentToken = uVar.currentToken();
            ub.z zVar = ub.z.FIELD_NAME;
            if (zVarCurrentToken != zVar) {
                if (zVarCurrentToken != ub.z.END_OBJECT) {
                    kVar.reportWrongTokenException(this, zVar, (String) null, new Object[0]);
                }
            }
            strCurrentName = uVar.currentName();
        }
        String strNextFieldName = strCurrentName;
        while (strNextFieldName != null) {
            Object objDeserializeKey = this.f78781j.deserializeKey(strNextFieldName, kVar);
            ub.z zVarNextToken = uVar.nextToken();
            dd.q qVar = this.f78791t;
            if (qVar == null || !qVar.shouldIgnore(strNextFieldName)) {
                try {
                    try {
                        ub.z zVar2 = ub.z.VALUE_NULL;
                        boolean z11 = this.f78875h;
                        if (zVarNextToken != zVar2) {
                            objW = W(uVar, kVar);
                        } else if (!z11) {
                            objW = null;
                        }
                        if (objW == null) {
                            try {
                                objW = this.f78874g.getNullValue(kVar);
                                if (objW != null || !z11) {
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                kVar2 = kVar;
                                map2 = map;
                                j.V(kVar2, exc, map2, strNextFieldName);
                                throw null;
                            }
                        }
                        obj = objW;
                    } catch (Exception e11) {
                        e = e11;
                        kVar2 = kVar;
                        map2 = map;
                    }
                } catch (mc.a0 e12) {
                    e = e12;
                    kVar2 = kVar;
                    map2 = map;
                }
                if (z10) {
                    aVar.put(objDeserializeKey, obj);
                } else {
                    Object objPut = map.put(objDeserializeKey, obj);
                    if (objPut != null) {
                        kVar2 = kVar;
                        map2 = map;
                        try {
                            Z(kVar2, map2, objDeserializeKey, objPut, obj);
                        } catch (mc.a0 e13) {
                            e = e13;
                            a0(kVar2, aVar, objDeserializeKey, e);
                            strNextFieldName = uVar.nextFieldName();
                            kVar = kVar2;
                            map = map2;
                        } catch (Exception e14) {
                            e = e14;
                            exc = e;
                            j.V(kVar2, exc, map2, strNextFieldName);
                            throw null;
                        }
                    }
                    strNextFieldName = uVar.nextFieldName();
                    kVar = kVar2;
                    map = map2;
                }
            } else {
                uVar.skipChildren();
            }
            kVar2 = kVar;
            map2 = map;
            strNextFieldName = uVar.nextFieldName();
            kVar = kVar2;
            map = map2;
        }
    }

    public final void Z(jc.k kVar, Map map, Object obj, Object obj2, Object obj3) {
        if (this.f78792u && kVar.isEnabled(ub.d0.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    public Map<Object, Object> _deserializeUsingCreator(ub.u uVar, jc.k kVar) throws IOException {
        Object objW;
        nc.a0 a0Var = this.f78787p;
        nc.h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, null);
        String strNextFieldName = uVar.isExpectedStartObjectToken() ? uVar.nextFieldName() : uVar.hasToken(ub.z.FIELD_NAME) ? uVar.currentName() : null;
        while (true) {
            jc.o oVar = this.f78873f;
            if (strNextFieldName == null) {
                try {
                    return (Map) a0Var.build(kVar, h0VarStartBuilding);
                } catch (Exception e10) {
                    j.V(kVar, e10, oVar.getRawClass(), strNextFieldName);
                    throw null;
                }
            }
            ub.z zVarNextToken = uVar.nextToken();
            dd.q qVar = this.f78791t;
            if (qVar == null || !qVar.shouldIgnore(strNextFieldName)) {
                mc.z zVarFindCreatorProperty = a0Var.findCreatorProperty(strNextFieldName);
                if (zVarFindCreatorProperty == null) {
                    Object objDeserializeKey = this.f78781j.deserializeKey(strNextFieldName, kVar);
                    try {
                        ub.z zVar = ub.z.VALUE_NULL;
                        boolean z10 = this.f78875h;
                        if (zVarNextToken != zVar) {
                            objW = W(uVar, kVar);
                        } else if (!z10) {
                            objW = null;
                        }
                        if (objW != null || (objW = this.f78874g.getNullValue(kVar)) != null || !z10) {
                            h0VarStartBuilding.bufferMapProperty(objDeserializeKey, objW);
                        }
                    } catch (Exception e11) {
                        j.V(kVar, e11, oVar.getRawClass(), strNextFieldName);
                        throw null;
                    }
                } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                    uVar.nextToken();
                    try {
                        Map<Object, Object> map = (Map) a0Var.build(kVar, h0VarStartBuilding);
                        Y(uVar, kVar, map);
                        return map;
                    } catch (Exception e12) {
                        j.V(kVar, e12, oVar.getRawClass(), strNextFieldName);
                        throw null;
                    }
                }
            } else {
                uVar.skipChildren();
            }
            strNextFieldName = uVar.nextFieldName();
        }
    }

    public final void a0(jc.k kVar, a aVar, Object obj, mc.a0 a0Var) throws jc.r {
        if (aVar == null) {
            kVar.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + a0Var, new Object[0]);
        }
        a0Var.getRoid().appendReferring(aVar.handleUnresolvedReference(a0Var, obj));
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        rc.l member;
        Set<String> included;
        jc.o oVar = this.f78873f;
        jc.x xVar = this.f78781j;
        jc.x xVarFindKeyDeserializer = xVar == null ? kVar.findKeyDeserializer(oVar.getKeyType(), gVar) : xVar;
        jc.q qVar = this.f78783l;
        jc.q qVarQ = gVar != null ? s0.Q(kVar, gVar, qVar) : qVar;
        jc.o contentType = oVar.getContentType();
        jc.q qVarFindContextualValueDeserializer = qVarQ == null ? kVar.findContextualValueDeserializer(contentType, gVar) : kVar.handleSecondaryContextualization(qVarQ, gVar, contentType);
        wc.g gVar2 = this.f78784m;
        wc.g gVarForProperty = gVar2 != null ? gVar2.forProperty(gVar) : gVar2;
        Set hashSet = this.f78789r;
        Set hashSet2 = this.f78790s;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        if (annotationIntrospector != null && gVar != null && (member = gVar.getMember()) != null) {
            jc.j config = kVar.getConfig();
            tb.z zVarFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (zVarFindPropertyIgnoralByName != null) {
                Set<String> setFindIgnoredForDeserialization = zVarFindPropertyIgnoralByName.findIgnoredForDeserialization();
                if (!setFindIgnoredForDeserialization.isEmpty()) {
                    if (hashSet == null) {
                        hashSet = new HashSet(setFindIgnoredForDeserialization);
                    } else {
                        HashSet hashSet3 = new HashSet(hashSet);
                        hashSet3.addAll(setFindIgnoredForDeserialization);
                        hashSet = hashSet3;
                    }
                }
            }
            tb.f0 f0VarFindPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (f0VarFindPropertyInclusionByName != null && (included = f0VarFindPropertyInclusionByName.getIncluded()) != null) {
                HashSet hashSet4 = new HashSet();
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(included);
                } else {
                    for (String str : included) {
                        if (hashSet2.contains(str)) {
                            hashSet4.add(str);
                        }
                    }
                    hashSet2 = hashSet4;
                }
            }
        }
        Set set = hashSet;
        Set set2 = hashSet2;
        mc.v vVarP = s0.P(kVar, gVar, qVarFindContextualValueDeserializer);
        return (xVar == xVarFindKeyDeserializer && qVar == qVarFindContextualValueDeserializer && gVar2 == gVarForProperty && this.f78874g == vVarP && this.f78789r == set && this.f78790s == set2) ? this : new a0(this, xVarFindKeyDeserializer, qVarFindContextualValueDeserializer, gVarForProperty, vVarP, set, set2);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromObject(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78783l;
    }

    public final Class<?> getMapClass() {
        return this.f78873f.getRawClass();
    }

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78785n;
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78783l == null && this.f78781j == null && this.f78784m == null && this.f78789r == null && this.f78790s == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12141e;
    }

    @Override // mc.w
    public void resolve(jc.k kVar) throws jc.r {
        mc.c0 c0Var = this.f78785n;
        boolean zCanCreateUsingDelegate = c0Var.canCreateUsingDelegate();
        jc.o oVar = this.f78873f;
        if (zCanCreateUsingDelegate) {
            jc.o delegateType = c0Var.getDelegateType(kVar.getConfig());
            if (delegateType == null) {
                kVar.reportBadDefinition(oVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", oVar, c0Var.getClass().getName()));
            }
            this.f78786o = kVar.findContextualValueDeserializer(delegateType, null);
        } else if (c0Var.canCreateUsingArrayDelegate()) {
            jc.o arrayDelegateType = c0Var.getArrayDelegateType(kVar.getConfig());
            if (arrayDelegateType == null) {
                kVar.reportBadDefinition(oVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", oVar, c0Var.getClass().getName()));
            }
            this.f78786o = kVar.findContextualValueDeserializer(arrayDelegateType, null);
        }
        if (c0Var.canCreateFromObjectWith()) {
            this.f78787p = nc.a0.construct(kVar, c0Var, c0Var.getFromObjectArguments(kVar.getConfig()), kVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.f78782k = X(oVar, this.f78781j);
    }

    @Deprecated
    public void setIgnorableProperties(String[] strArr) {
        HashSet hashSetArrayToSet = (strArr == null || strArr.length == 0) ? null : dd.d.arrayToSet(strArr);
        this.f78789r = hashSetArrayToSet;
        this.f78791t = dd.r.buildCheckerIfNeeded(hashSetArrayToSet, this.f78790s);
    }

    public void setIncludableProperties(Set<String> set) {
        this.f78790s = set;
        this.f78791t = dd.r.buildCheckerIfNeeded(this.f78789r, set);
    }

    @Override // jc.q
    public Map<Object, Object> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        String strCurrentName;
        Exception exc;
        Object objW;
        Object obj;
        if (this.f78787p != null) {
            return _deserializeUsingCreator(uVar, kVar);
        }
        jc.q qVar = this.f78786o;
        mc.c0 c0Var = this.f78785n;
        if (qVar != null) {
            return (Map) c0Var.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
        }
        if (!this.f78788q) {
            return (Map) kVar.handleMissingInstantiator(getMapClass(), getValueInstantiator(), uVar, "no default constructor found", new Object[0]);
        }
        jc.k kVar2 = kVar;
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId != 1 && iCurrentTokenId != 2) {
            if (iCurrentTokenId == 3) {
                return (Map) n(uVar, kVar2);
            }
            if (iCurrentTokenId != 5) {
                if (iCurrentTokenId != 6) {
                    return (Map) kVar2.handleUnexpectedToken(getValueType(kVar2), uVar);
                }
                return (Map) p(uVar, kVar2);
            }
        }
        Map<Object, Object> map = (Map) c0Var.createUsingDefault(kVar2);
        if (this.f78782k) {
            boolean z10 = this.f78783l.getObjectIdReader() != null;
            a aVar = z10 ? new a(this.f78873f.getContentType().getRawClass(), map) : null;
            if (uVar.isExpectedStartObjectToken()) {
                strCurrentName = uVar.nextFieldName();
            } else {
                ub.z zVarCurrentToken = uVar.currentToken();
                if (zVarCurrentToken != ub.z.END_OBJECT) {
                    ub.z zVar = ub.z.FIELD_NAME;
                    if (zVarCurrentToken != zVar) {
                        kVar2.reportWrongTokenException(this, zVar, (String) null, new Object[0]);
                    }
                    strCurrentName = uVar.currentName();
                }
                return map;
            }
            String strNextFieldName = strCurrentName;
            while (strNextFieldName != null) {
                ub.z zVarNextToken = uVar.nextToken();
                dd.q qVar2 = this.f78791t;
                if (qVar2 != null && qVar2.shouldIgnore(strNextFieldName)) {
                    uVar.skipChildren();
                } else {
                    try {
                        try {
                            ub.z zVar2 = ub.z.VALUE_NULL;
                            boolean z11 = this.f78875h;
                            if (zVarNextToken != zVar2) {
                                objW = W(uVar, kVar2);
                            } else if (!z11) {
                                objW = null;
                            }
                            if (objW == null) {
                                try {
                                    objW = this.f78874g.getNullValue(kVar2);
                                    if (objW != null || !z11) {
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    j.V(kVar2, exc, map, strNextFieldName);
                                    throw null;
                                }
                            }
                            obj = objW;
                        } catch (mc.a0 e11) {
                            e = e11;
                        }
                        if (z10) {
                            aVar.put(strNextFieldName, obj);
                        } else {
                            Object objPut = map.put(strNextFieldName, obj);
                            if (objPut != null) {
                                jc.k kVar3 = kVar2;
                                try {
                                    Z(kVar3, map, strNextFieldName, objPut, obj);
                                } catch (mc.a0 e12) {
                                    e = e12;
                                    kVar2 = kVar3;
                                    a0(kVar2, aVar, strNextFieldName, e);
                                    strNextFieldName = uVar.nextFieldName();
                                } catch (Exception e13) {
                                    e = e13;
                                    kVar2 = kVar3;
                                    exc = e;
                                    j.V(kVar2, exc, map, strNextFieldName);
                                    throw null;
                                }
                            }
                            strNextFieldName = uVar.nextFieldName();
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                }
                strNextFieldName = uVar.nextFieldName();
            }
            return map;
        }
        Y(uVar, kVar2, map);
        return map;
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.isEmpty()) {
            set = null;
        }
        this.f78789r = set;
        this.f78791t = dd.r.buildCheckerIfNeeded(set, this.f78790s);
    }

    public a0(a0 a0Var, jc.x xVar, jc.q qVar, wc.g gVar, mc.v vVar, Set set, Set set2) {
        super(a0Var, vVar, a0Var.f78876i);
        this.f78781j = xVar;
        this.f78783l = qVar;
        this.f78784m = gVar;
        this.f78785n = a0Var.f78785n;
        this.f78787p = a0Var.f78787p;
        this.f78786o = a0Var.f78786o;
        this.f78788q = a0Var.f78788q;
        this.f78789r = set;
        this.f78790s = set2;
        this.f78791t = dd.r.buildCheckerIfNeeded(set, set2);
        this.f78782k = X(this.f78873f, xVar);
        this.f78792u = a0Var.f78792u;
    }

    @Override // jc.q
    public Map<Object, Object> deserialize(ub.u uVar, jc.k kVar, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object objW;
        String strCurrentName2;
        Object objW2;
        uVar.assignCurrentValue(map);
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken != ub.z.START_OBJECT && zVarCurrentToken != ub.z.FIELD_NAME) {
            return (Map) kVar.handleUnexpectedToken(getMapClass(), uVar);
        }
        boolean z10 = this.f78782k;
        wc.g gVar = this.f78784m;
        jc.q qVar = this.f78783l;
        boolean z11 = this.f78875h;
        mc.v vVar = this.f78874g;
        if (z10) {
            if (uVar.isExpectedStartObjectToken()) {
                strCurrentName2 = uVar.nextFieldName();
            } else {
                ub.z zVarCurrentToken2 = uVar.currentToken();
                if (zVarCurrentToken2 != ub.z.END_OBJECT) {
                    ub.z zVar = ub.z.FIELD_NAME;
                    if (zVarCurrentToken2 != zVar) {
                        kVar.reportWrongTokenException(this, zVar, (String) null, new Object[0]);
                    }
                    strCurrentName2 = uVar.currentName();
                }
            }
            while (strCurrentName2 != null) {
                ub.z zVarNextToken = uVar.nextToken();
                dd.q qVar2 = this.f78791t;
                if (qVar2 != null && qVar2.shouldIgnore(strCurrentName2)) {
                    uVar.skipChildren();
                } else {
                    try {
                        if (zVarNextToken != ub.z.VALUE_NULL) {
                            Object obj = map.get(strCurrentName2);
                            if (obj == null) {
                                objW2 = W(uVar, kVar);
                            } else if (gVar == null) {
                                objW2 = qVar.deserialize(uVar, kVar, obj);
                            } else {
                                objW2 = qVar.deserializeWithType(uVar, kVar, gVar, obj);
                            }
                            if ((objW2 != null || (objW2 = vVar.getNullValue(kVar)) != null || !z11) && objW2 != obj) {
                                map.put(strCurrentName2, objW2);
                            }
                        } else if (!z11) {
                            map.put(strCurrentName2, vVar.getNullValue(kVar));
                        }
                    } catch (Exception e10) {
                        j.V(kVar, e10, map, strCurrentName2);
                        throw null;
                    }
                }
                strCurrentName2 = uVar.nextFieldName();
            }
        } else {
            if (uVar.isExpectedStartObjectToken()) {
                strCurrentName = uVar.nextFieldName();
            } else {
                ub.z zVarCurrentToken3 = uVar.currentToken();
                if (zVarCurrentToken3 != ub.z.END_OBJECT) {
                    ub.z zVar2 = ub.z.FIELD_NAME;
                    if (zVarCurrentToken3 != zVar2) {
                        kVar.reportWrongTokenException(this, zVar2, (String) null, new Object[0]);
                    }
                    strCurrentName = uVar.currentName();
                }
            }
            while (strCurrentName != null) {
                Object objDeserializeKey = this.f78781j.deserializeKey(strCurrentName, kVar);
                ub.z zVarNextToken2 = uVar.nextToken();
                dd.q qVar3 = this.f78791t;
                if (qVar3 != null && qVar3.shouldIgnore(strCurrentName)) {
                    uVar.skipChildren();
                } else {
                    try {
                        if (zVarNextToken2 != ub.z.VALUE_NULL) {
                            Object obj2 = map.get(objDeserializeKey);
                            if (obj2 == null) {
                                objW = W(uVar, kVar);
                            } else if (gVar == null) {
                                objW = qVar.deserialize(uVar, kVar, obj2);
                            } else {
                                objW = qVar.deserializeWithType(uVar, kVar, gVar, obj2);
                            }
                            if ((objW != null || (objW = vVar.getNullValue(kVar)) != null || !z11) && objW != obj2) {
                                map.put(objDeserializeKey, objW);
                            }
                        } else if (!z11) {
                            map.put(objDeserializeKey, vVar.getNullValue(kVar));
                        }
                    } catch (Exception e11) {
                        j.V(kVar, e11, map, strCurrentName);
                        throw null;
                    }
                }
                strCurrentName = uVar.nextFieldName();
            }
        }
        return map;
    }
}
