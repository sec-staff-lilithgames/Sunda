package rc;

import com.ironsource.C3191e4;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import jc.c;
import jc.w;
import jc.x;
import qm.zMPW.GalEuEfxjome;
import tb.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o0 extends jc.c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f84236e = {kc.l.class, tb.d1.class, tb.u.class, tb.z0.class, tb.o0.class, tb.b1.class, tb.k.class, tb.i0.class};

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f84237f = {kc.f.class, tb.d1.class, tb.u.class, tb.z0.class, tb.b1.class, tb.k.class, tb.i0.class, tb.j0.class};

    /* renamed from: g, reason: collision with root package name */
    public static final qc.c f84238g;

    /* renamed from: b, reason: collision with root package name */
    public final transient dd.s f84239b = new dd.s(48, 48);

    /* renamed from: c, reason: collision with root package name */
    public boolean f84240c = true;

    static {
        qc.c cVarInstance;
        try {
            cVarInstance = qc.c.instance();
        } catch (Throwable th2) {
            dd.p.rethrowIfFatal(th2);
            cVarInstance = null;
        }
        f84238g = cVarInstance;
    }

    public static Class a(Class cls) {
        if (cls == null || dd.i.isBogusClass(cls)) {
            return null;
        }
        return cls;
    }

    public static jc.r b(IllegalArgumentException illegalArgumentException, String str) {
        return new jc.r((Closeable) null, str, illegalArgumentException);
    }

    public static boolean d(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == dd.i.primitiveType(cls2) : cls2.isPrimitive() && cls2 == dd.i.primitiveType(cls);
    }

    public static boolean e(Class cls, jc.o oVar) {
        return oVar.isPrimitive() ? oVar.hasRawClass(dd.i.primitiveType(cls)) : cls.isPrimitive() && cls == dd.i.primitiveType(oVar.getRawClass());
    }

    public final wc.i c(lc.z zVar, b bVar, jc.o oVar) {
        wc.i qVar;
        tb.y0 y0VarFindPolymorphicTypeInfo = findPolymorphicTypeInfo(zVar, bVar);
        kc.n nVar = (kc.n) bVar.getAnnotation(kc.n.class);
        if (nVar != null) {
            if (y0VarFindPolymorphicTypeInfo == null) {
                return null;
            }
            qVar = zVar.typeResolverBuilderInstance(bVar, nVar.value());
        } else {
            if (y0VarFindPolymorphicTypeInfo == null) {
                return null;
            }
            if (y0VarFindPolymorphicTypeInfo.getIdType() == tb.w0.f86793c) {
                return xc.q.noTypeInfoBuilder();
            }
            qVar = new xc.q(y0VarFindPolymorphicTypeInfo);
        }
        kc.m mVar = (kc.m) bVar.getAnnotation(kc.m.class);
        wc.h hVarTypeIdResolverInstance = mVar != null ? zVar.typeIdResolverInstance(bVar, mVar.value()) : null;
        if (hVarTypeIdResolverInstance != null) {
            hVarTypeIdResolverInstance.init(oVar);
        }
        if (y0VarFindPolymorphicTypeInfo.getInclusionType() == tb.v0.f86790f && (bVar instanceof e)) {
            y0VarFindPolymorphicTypeInfo = y0VarFindPolymorphicTypeInfo.withInclusionType(tb.v0.f86787b);
        }
        Class<?> defaultImpl = y0VarFindPolymorphicTypeInfo.getDefaultImpl();
        if (defaultImpl != null && defaultImpl != tb.x0.class && !defaultImpl.isAnnotation()) {
            y0VarFindPolymorphicTypeInfo = y0VarFindPolymorphicTypeInfo.withDefaultImpl(defaultImpl);
        }
        return qVar.init(y0VarFindPolymorphicTypeInfo, hVarTypeIdResolverInstance);
    }

    @Override // jc.c
    public void findAndAddVirtualProperties(lc.z zVar, e eVar, List<zc.d> list) {
        kc.e eVar2 = (kc.e) eVar.getAnnotation(kc.e.class);
        if (eVar2 == null) {
            return;
        }
        boolean zPrepend = eVar2.prepend();
        kc.c[] cVarArrAttrs = eVar2.attrs();
        int length = cVarArrAttrs.length;
        jc.o oVarConstructType = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (oVarConstructType == null) {
                oVarConstructType = zVar.constructType(Object.class);
            }
            kc.c cVar = cVarArrAttrs[i10];
            jc.m0 m0Var = cVar.required() ? jc.m0.f69371j : jc.m0.f69372k;
            String strValue = cVar.value();
            String strPropName = cVar.propName();
            String strPropNamespace = cVar.propNamespace();
            jc.n0 n0VarConstruct = strPropName.isEmpty() ? jc.n0.f69381f : (strPropNamespace == null || strPropNamespace.isEmpty()) ? jc.n0.construct(strPropName) : jc.n0.construct(strPropName, strPropNamespace);
            if (!n0VarConstruct.hasSimpleName()) {
                n0VarConstruct = jc.n0.construct(strValue);
            }
            ad.a aVarConstruct = ad.a.construct(strValue, dd.i0.construct(zVar, new h1(eVar, eVar.getRawType(), strValue, oVarConstructType), n0VarConstruct, m0Var, cVar.include()), eVar.getAnnotations(), oVarConstructType);
            if (zPrepend) {
                list.add(i10, aVarConstruct);
            } else {
                list.add(aVarConstruct);
            }
        }
        kc.d[] dVarArrProps = eVar2.props();
        int length2 = dVarArrProps.length;
        for (int i11 = 0; i11 < length2; i11++) {
            kc.d dVar = dVarArrProps[i11];
            jc.m0 m0Var2 = dVar.required() ? jc.m0.f69371j : jc.m0.f69372k;
            String strName = dVar.name();
            String strNamespace = dVar.namespace();
            jc.n0 n0VarConstruct2 = strName.isEmpty() ? jc.n0.f69381f : (strNamespace == null || strNamespace.isEmpty()) ? jc.n0.construct(strName) : jc.n0.construct(strName, strNamespace);
            jc.o oVarConstructType2 = zVar.constructType((Class<?>) dVar.type());
            dd.i0 i0VarConstruct = dd.i0.construct(zVar, new h1(eVar, eVar.getRawType(), n0VarConstruct2.getSimpleName(), oVarConstructType2), n0VarConstruct2, m0Var2, dVar.include());
            Class clsValue = dVar.value();
            lc.v handlerInstantiator = zVar.getHandlerInstantiator();
            zc.u uVarVirtualPropertyWriterInstance = handlerInstantiator == null ? null : handlerInstantiator.virtualPropertyWriterInstance(zVar, clsValue);
            if (uVarVirtualPropertyWriterInstance == null) {
                uVarVirtualPropertyWriterInstance = (zc.u) dd.i.createInstance(clsValue, zVar.canOverrideAccessModifiers());
            }
            zc.u uVarWithConfig = uVarVirtualPropertyWriterInstance.withConfig(zVar, eVar, i0VarConstruct, oVarConstructType2);
            if (zPrepend) {
                list.add(i11, uVarWithConfig);
            } else {
                list.add(uVarWithConfig);
            }
        }
    }

    @Override // jc.c
    public j1 findAutoDetectVisibility(e eVar, j1 j1Var) {
        tb.j jVar = (tb.j) eVar.getAnnotation(tb.j.class);
        return jVar == null ? j1Var : j1Var.with(jVar);
    }

    @Override // jc.c
    public String findClassDescription(e eVar) {
        tb.l lVar = (tb.l) eVar.getAnnotation(tb.l.class);
        if (lVar == null) {
            return null;
        }
        return lVar.value();
    }

    @Override // jc.c
    public Object findContentDeserializer(b bVar) {
        Class clsContentUsing;
        kc.f fVar = (kc.f) bVar.getAnnotation(kc.f.class);
        if (fVar == null || (clsContentUsing = fVar.contentUsing()) == jc.p.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // jc.c
    public Object findContentSerializer(b bVar) {
        Class clsContentUsing;
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null || (clsContentUsing = lVar.contentUsing()) == w.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // jc.c
    public tb.m findCreatorAnnotation(lc.z zVar, b bVar) {
        tb.m mVarMode;
        qc.c cVar;
        Boolean boolHasCreatorAnnotation;
        tb.n nVar = (tb.n) bVar.getAnnotation(tb.n.class);
        if (nVar == null) {
            mVarMode = null;
        } else {
            mVarMode = nVar.mode();
            if (mVarMode != tb.m.f86748b) {
                return mVarMode;
            }
        }
        return (this.f84240c && zVar.isEnabled(jc.y.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (bVar instanceof g) && (cVar = f84238g) != null && (boolHasCreatorAnnotation = cVar.hasCreatorAnnotation(bVar)) != null && boolHasCreatorAnnotation.booleanValue()) ? tb.m.f86750e : mVarMode;
    }

    @Override // jc.c
    @Deprecated
    public tb.m findCreatorBinding(b bVar) {
        tb.n nVar = (tb.n) bVar.getAnnotation(tb.n.class);
        if (nVar == null) {
            return null;
        }
        return nVar.mode();
    }

    @Override // jc.c
    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return dd.i.findFirstAnnotatedEnumValue(cls, tb.o.class);
    }

    @Override // jc.c
    public Object findDeserializationContentConverter(l lVar) {
        Class clsA;
        kc.f fVar = (kc.f) lVar.getAnnotation(kc.f.class);
        if (fVar == null || (clsA = a(fVar.contentConverter())) == null || clsA == dd.l.class) {
            return null;
        }
        return clsA;
    }

    @Override // jc.c
    public Object findDeserializationConverter(b bVar) {
        Class clsA;
        kc.f fVar = (kc.f) bVar.getAnnotation(kc.f.class);
        if (fVar == null || (clsA = a(fVar.converter())) == null || clsA == dd.l.class) {
            return null;
        }
        return clsA;
    }

    @Override // jc.c
    public Object findDeserializer(b bVar) {
        Class clsUsing;
        kc.f fVar = (kc.f) bVar.getAnnotation(kc.f.class);
        if (fVar == null || (clsUsing = fVar.using()) == jc.p.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // jc.c
    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        tb.e eVar;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (eVar = (tb.e) field.getAnnotation(tb.e.class)) != null) {
                String[] strArrValue = eVar.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (name.equals(enumArr[i10].name())) {
                            strArr[i10] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // jc.c
    public Object findEnumNamingStrategy(lc.z zVar, e eVar) {
        kc.a aVar = (kc.a) eVar.getAnnotation(kc.a.class);
        if (aVar == null) {
            return null;
        }
        return aVar.value();
    }

    @Override // jc.c
    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        tb.l0 l0Var;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (l0Var = (tb.l0) field.getAnnotation(tb.l0.class)) != null) {
                String strValue = l0Var.value();
                if (map == null) {
                    map = new HashMap();
                }
                map.put(field.getName(), strValue);
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = (String) map.get(enumArr[i10].name());
                if (str != null) {
                    strArr[i10] = str;
                }
            }
        }
        return strArr;
    }

    @Override // jc.c
    public Object findFilterId(b bVar) {
        tb.p pVar = (tb.p) bVar.getAnnotation(tb.p.class);
        if (pVar == null) {
            return null;
        }
        String strValue = pVar.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // jc.c
    public tb.t findFormat(b bVar) {
        tb.u uVar = (tb.u) bVar.getAnnotation(tb.u.class);
        if (uVar == null) {
            return null;
        }
        return tb.t.from(uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // jc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String findImplicitPropertyName(rc.l r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof rc.q
            r1 = 0
            if (r0 == 0) goto L18
            rc.q r3 = (rc.q) r3
            rc.r r0 = r3.getOwner()
            if (r0 == 0) goto L18
            qc.c r0 = rc.o0.f84238g
            if (r0 == 0) goto L18
            jc.n0 r3 = r0.findConstructorName(r3)
            if (r3 == 0) goto L18
            goto L19
        L18:
            r3 = r1
        L19:
            if (r3 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r3 = r3.getSimpleName()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.o0.findImplicitPropertyName(rc.l):java.lang.String");
    }

    @Override // jc.c
    public tb.c findInjectableValue(l lVar) {
        String name;
        tb.d dVar = (tb.d) lVar.getAnnotation(tb.d.class);
        if (dVar == null) {
            return null;
        }
        tb.c cVarFrom = tb.c.from(dVar);
        if (cVarFrom.hasId()) {
            return cVarFrom;
        }
        if (lVar instanceof m) {
            m mVar = (m) lVar;
            name = mVar.getParameterCount() == 0 ? lVar.getRawType().getName() : mVar.getRawParameterType(0).getName();
        } else {
            name = lVar.getRawType().getName();
        }
        return cVarFrom.withId(name);
    }

    @Override // jc.c
    @Deprecated
    public Object findInjectableValueId(l lVar) {
        tb.c cVarFindInjectableValue = findInjectableValue(lVar);
        if (cVarFindInjectableValue == null) {
            return null;
        }
        return cVarFindInjectableValue.getId();
    }

    @Override // jc.c
    public Object findKeyDeserializer(b bVar) {
        Class clsKeyUsing;
        kc.f fVar = (kc.f) bVar.getAnnotation(kc.f.class);
        if (fVar == null || (clsKeyUsing = fVar.keyUsing()) == x.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // jc.c
    public Object findKeySerializer(b bVar) {
        Class clsKeyUsing;
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null || (clsKeyUsing = lVar.keyUsing()) == w.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // jc.c
    public Boolean findMergeInfo(b bVar) {
        tb.j0 j0Var = (tb.j0) bVar.getAnnotation(tb.j0.class);
        if (j0Var == null) {
            return null;
        }
        return j0Var.value().asBoolean();
    }

    @Override // jc.c
    public jc.n0 findNameForDeserialization(b bVar) {
        boolean z10;
        tb.r0 r0Var = (tb.r0) bVar.getAnnotation(tb.r0.class);
        if (r0Var != null) {
            String strValue = r0Var.value();
            if (!strValue.isEmpty()) {
                return jc.n0.construct(strValue);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        tb.l0 l0Var = (tb.l0) bVar.getAnnotation(tb.l0.class);
        if (l0Var != null) {
            String strNamespace = l0Var.namespace();
            return jc.n0.construct(l0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z10 || bVar.hasOneOf(f84237f)) {
            return jc.n0.f69381f;
        }
        return null;
    }

    @Override // jc.c
    public jc.n0 findNameForSerialization(b bVar) {
        boolean z10;
        tb.v vVar = (tb.v) bVar.getAnnotation(tb.v.class);
        if (vVar != null) {
            String strValue = vVar.value();
            if (!strValue.isEmpty()) {
                return jc.n0.construct(strValue);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        tb.l0 l0Var = (tb.l0) bVar.getAnnotation(tb.l0.class);
        if (l0Var != null) {
            String strNamespace = l0Var.namespace();
            return jc.n0.construct(l0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z10 || bVar.hasOneOf(f84236e)) {
            return jc.n0.f69381f;
        }
        return null;
    }

    @Override // jc.c
    public Object findNamingStrategy(e eVar) {
        kc.g gVar = (kc.g) eVar.getAnnotation(kc.g.class);
        if (gVar == null) {
            return null;
        }
        return gVar.value();
    }

    @Override // jc.c
    public Object findNullSerializer(b bVar) {
        Class clsNullsUsing;
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null || (clsNullsUsing = lVar.nullsUsing()) == w.a.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // jc.c
    public t0 findObjectIdInfo(b bVar) {
        tb.w wVar = (tb.w) bVar.getAnnotation(tb.w.class);
        if (wVar == null || wVar.generator() == tb.h1.class) {
            return null;
        }
        return new t0(jc.n0.construct(wVar.property()), wVar.scope(), wVar.generator(), wVar.resolver());
    }

    @Override // jc.c
    public t0 findObjectReferenceInfo(b bVar, t0 t0Var) {
        tb.x xVar = (tb.x) bVar.getAnnotation(tb.x.class);
        if (xVar == null) {
            return t0Var;
        }
        if (t0Var == null) {
            t0Var = t0.empty();
        }
        return t0Var.withAlwaysAsId(xVar.alwaysAsId());
    }

    @Override // jc.c
    public Class<?> findPOJOBuilder(e eVar) {
        kc.f fVar = (kc.f) eVar.getAnnotation(kc.f.class);
        if (fVar == null) {
            return null;
        }
        return a(fVar.builder());
    }

    @Override // jc.c
    public kc.h findPOJOBuilderConfig(e eVar) {
        kc.i iVar = (kc.i) eVar.getAnnotation(kc.i.class);
        if (iVar == null) {
            return null;
        }
        return new kc.h(iVar);
    }

    @Override // jc.c
    public tb.y0 findPolymorphicTypeInfo(lc.z zVar, b bVar) {
        tb.z0 z0Var = (tb.z0) bVar.getAnnotation(tb.z0.class);
        if (z0Var == null) {
            return null;
        }
        return tb.y0.from(z0Var);
    }

    @Override // jc.c
    public tb.k0 findPropertyAccess(b bVar) {
        tb.l0 l0Var = (tb.l0) bVar.getAnnotation(tb.l0.class);
        if (l0Var != null) {
            return l0Var.access();
        }
        return null;
    }

    @Override // jc.c
    public List<jc.n0> findPropertyAliases(b bVar) {
        tb.e eVar = (tb.e) bVar.getAnnotation(tb.e.class);
        if (eVar == null) {
            return null;
        }
        String[] strArrValue = eVar.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(jc.n0.construct(str));
        }
        return arrayList;
    }

    @Override // jc.c
    public wc.i findPropertyContentTypeResolver(lc.z zVar, l lVar, jc.o oVar) {
        if (oVar.getContentType() != null) {
            return c(zVar, lVar, oVar);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + oVar + ")");
    }

    @Override // jc.c
    public String findPropertyDefaultValue(b bVar) {
        tb.l0 l0Var = (tb.l0) bVar.getAnnotation(tb.l0.class);
        if (l0Var == null) {
            return null;
        }
        String strDefaultValue = l0Var.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    @Override // jc.c
    public String findPropertyDescription(b bVar) {
        tb.m0 m0Var = (tb.m0) bVar.getAnnotation(tb.m0.class);
        if (m0Var == null) {
            return null;
        }
        return m0Var.value();
    }

    @Override // jc.c
    public tb.z findPropertyIgnoralByName(lc.z zVar, b bVar) {
        tb.a0 a0Var = (tb.a0) bVar.getAnnotation(tb.a0.class);
        return a0Var == null ? tb.z.empty() : tb.z.from(a0Var);
    }

    @Override // jc.c
    @Deprecated
    public tb.z findPropertyIgnorals(b bVar) {
        return findPropertyIgnoralByName(null, bVar);
    }

    @Override // jc.c
    public tb.d0 findPropertyInclusion(b bVar) {
        kc.l lVar;
        tb.e0 e0Var = (tb.e0) bVar.getAnnotation(tb.e0.class);
        tb.d0 d0VarEmpty = e0Var == null ? tb.d0.empty() : tb.d0.from(e0Var);
        if (d0VarEmpty.getValueInclusion() == tb.c0.f86699h && (lVar = (kc.l) bVar.getAnnotation(kc.l.class)) != null) {
            int iOrdinal = lVar.include().ordinal();
            if (iOrdinal == 0) {
                return d0VarEmpty.withValueInclusion(tb.c0.f86694b);
            }
            if (iOrdinal == 1) {
                return d0VarEmpty.withValueInclusion(tb.c0.f86695c);
            }
            if (iOrdinal == 2) {
                return d0VarEmpty.withValueInclusion(tb.c0.f86697f);
            }
            if (iOrdinal == 3) {
                return d0VarEmpty.withValueInclusion(tb.c0.f86696e);
            }
        }
        return d0VarEmpty;
    }

    @Override // jc.c
    public tb.f0 findPropertyInclusionByName(lc.z zVar, b bVar) {
        tb.g0 g0Var = (tb.g0) bVar.getAnnotation(tb.g0.class);
        return g0Var == null ? tb.f0.all() : tb.f0.from(g0Var);
    }

    @Override // jc.c
    public Integer findPropertyIndex(b bVar) {
        int iIndex;
        tb.l0 l0Var = (tb.l0) bVar.getAnnotation(tb.l0.class);
        if (l0Var == null || (iIndex = l0Var.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // jc.c
    public wc.i findPropertyTypeResolver(lc.z zVar, l lVar, jc.o oVar) {
        if (oVar.isContainerType() || oVar.isReferenceType()) {
            return null;
        }
        return c(zVar, lVar, oVar);
    }

    @Override // jc.c
    public c.a findReferenceType(l lVar) {
        tb.i0 i0Var = (tb.i0) lVar.getAnnotation(tb.i0.class);
        if (i0Var != null) {
            return c.a.managed(i0Var.value());
        }
        tb.k kVar = (tb.k) lVar.getAnnotation(tb.k.class);
        if (kVar != null) {
            return c.a.back(kVar.value());
        }
        return null;
    }

    @Override // jc.c
    public jc.n0 findRenameByField(lc.z zVar, i iVar, jc.n0 n0Var) {
        return null;
    }

    @Override // jc.c
    public jc.n0 findRootName(e eVar) {
        tb.p0 p0Var = (tb.p0) eVar.getAnnotation(tb.p0.class);
        if (p0Var == null) {
            return null;
        }
        String strNamespace = p0Var.namespace();
        return jc.n0.construct(p0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // jc.c
    public Object findSerializationContentConverter(l lVar) {
        Class clsA;
        kc.l lVar2 = (kc.l) lVar.getAnnotation(kc.l.class);
        if (lVar2 == null || (clsA = a(lVar2.contentConverter())) == null || clsA == dd.l.class) {
            return null;
        }
        return clsA;
    }

    @Override // jc.c
    public Object findSerializationConverter(b bVar) {
        Class clsA;
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null || (clsA = a(lVar.converter())) == null || clsA == dd.l.class) {
            return null;
        }
        return clsA;
    }

    @Override // jc.c
    public String[] findSerializationPropertyOrder(e eVar) {
        tb.n0 n0Var = (tb.n0) eVar.getAnnotation(tb.n0.class);
        if (n0Var == null) {
            return null;
        }
        return n0Var.value();
    }

    @Override // jc.c
    public Boolean findSerializationSortAlphabetically(b bVar) {
        tb.n0 n0Var = (tb.n0) bVar.getAnnotation(tb.n0.class);
        if (n0Var == null || !n0Var.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // jc.c
    public kc.k findSerializationTyping(b bVar) {
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null) {
            return null;
        }
        return lVar.typing();
    }

    @Override // jc.c
    public Object findSerializer(b bVar) {
        Class clsUsing;
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar != null && (clsUsing = lVar.using()) != w.a.class) {
            return clsUsing;
        }
        tb.o0 o0Var = (tb.o0) bVar.getAnnotation(tb.o0.class);
        if (o0Var == null || !o0Var.value()) {
            return null;
        }
        return new bd.g0(bVar.getRawType());
    }

    @Override // jc.c
    public tb.q0 findSetterInfo(b bVar) {
        return tb.q0.from((tb.r0) bVar.getAnnotation(tb.r0.class));
    }

    @Override // jc.c
    public List<wc.c> findSubtypes(b bVar) {
        tb.t0 t0Var = (tb.t0) bVar.getAnnotation(tb.t0.class);
        if (t0Var == null) {
            return null;
        }
        tb.s0[] s0VarArrValue = t0Var.value();
        if (!t0Var.failOnRepeatedNames()) {
            ArrayList arrayList = new ArrayList(s0VarArrValue.length);
            for (tb.s0 s0Var : s0VarArrValue) {
                arrayList.add(new wc.c(s0Var.value(), s0Var.name()));
                for (String str : s0Var.names()) {
                    arrayList.add(new wc.c(s0Var.value(), str));
                }
            }
            return arrayList;
        }
        String name = bVar.getName();
        ArrayList arrayList2 = new ArrayList(s0VarArrValue.length);
        HashSet hashSet = new HashSet();
        for (tb.s0 s0Var2 : s0VarArrValue) {
            String strName = s0Var2.name();
            if (!strName.isEmpty() && hashSet.contains(strName)) {
                throw new IllegalArgumentException(e3.g.l("Annotated type [", name, "] got repeated subtype name [", strName, C3191e4.i.f36531e));
            }
            hashSet.add(strName);
            arrayList2.add(new wc.c(s0Var2.value(), strName));
            for (String str2 : s0Var2.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException(e3.g.l("Annotated type [", name, "] got repeated subtype name [", str2, C3191e4.i.f36531e));
                }
                hashSet.add(str2);
                arrayList2.add(new wc.c(s0Var2.value(), str2));
            }
        }
        return arrayList2;
    }

    @Override // jc.c
    public String findTypeName(e eVar) {
        tb.a1 a1Var = (tb.a1) eVar.getAnnotation(tb.a1.class);
        if (a1Var == null) {
            return null;
        }
        return a1Var.value();
    }

    @Override // jc.c
    public wc.i findTypeResolver(lc.z zVar, e eVar, jc.o oVar) {
        return c(zVar, eVar, oVar);
    }

    @Override // jc.c
    public dd.a0 findUnwrappingNameTransformer(l lVar) {
        tb.b1 b1Var = (tb.b1) lVar.getAnnotation(tb.b1.class);
        if (b1Var == null || !b1Var.enabled()) {
            return null;
        }
        return dd.a0.simpleTransformer(b1Var.prefix(), b1Var.suffix());
    }

    @Override // jc.c
    public Object findValueInstantiator(e eVar) {
        kc.o oVar = (kc.o) eVar.getAnnotation(kc.o.class);
        if (oVar == null) {
            return null;
        }
        return oVar.value();
    }

    @Override // jc.c
    public Class<?>[] findViews(b bVar) {
        tb.d1 d1Var = (tb.d1) bVar.getAnnotation(tb.d1.class);
        if (d1Var == null) {
            return null;
        }
        return d1Var.value();
    }

    @Override // jc.c
    public Boolean hasAnyGetter(b bVar) {
        tb.f fVar = (tb.f) bVar.getAnnotation(tb.f.class);
        if (fVar == null) {
            return null;
        }
        return Boolean.valueOf(fVar.enabled());
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAnyGetterAnnotation(m mVar) {
        return mVar.hasAnnotation(tb.f.class);
    }

    @Override // jc.c
    public Boolean hasAnySetter(b bVar) {
        tb.g gVar = (tb.g) bVar.getAnnotation(tb.g.class);
        if (gVar == null) {
            return null;
        }
        return Boolean.valueOf(gVar.enabled());
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAnySetterAnnotation(m mVar) {
        return mVar.hasAnnotation(tb.g.class);
    }

    @Override // jc.c
    public Boolean hasAsKey(lc.z zVar, b bVar) {
        tb.h0 h0Var = (tb.h0) bVar.getAnnotation(tb.h0.class);
        if (h0Var == null) {
            return null;
        }
        return Boolean.valueOf(h0Var.value());
    }

    @Override // jc.c
    public Boolean hasAsValue(b bVar) {
        tb.c1 c1Var = (tb.c1) bVar.getAnnotation(tb.c1.class);
        if (c1Var == null) {
            return null;
        }
        return Boolean.valueOf(c1Var.value());
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAsValueAnnotation(m mVar) {
        tb.c1 c1Var = (tb.c1) mVar.getAnnotation(tb.c1.class);
        return c1Var != null && c1Var.value();
    }

    @Override // jc.c
    @Deprecated
    public boolean hasCreatorAnnotation(b bVar) {
        qc.c cVar;
        Boolean boolHasCreatorAnnotation;
        tb.n nVar = (tb.n) bVar.getAnnotation(tb.n.class);
        if (nVar != null) {
            return nVar.mode() != tb.m.f86751f;
        }
        if (!this.f84240c || !(bVar instanceof g) || (cVar = f84238g) == null || (boolHasCreatorAnnotation = cVar.hasCreatorAnnotation(bVar)) == null) {
            return false;
        }
        return boolHasCreatorAnnotation.booleanValue();
    }

    @Override // jc.c
    public boolean hasIgnoreMarker(l lVar) {
        Boolean boolFindTransient;
        tb.y yVar = (tb.y) lVar.getAnnotation(tb.y.class);
        if (yVar != null) {
            return yVar.value();
        }
        qc.c cVar = f84238g;
        if (cVar == null || (boolFindTransient = cVar.findTransient(lVar)) == null) {
            return false;
        }
        return boolFindTransient.booleanValue();
    }

    @Override // jc.c
    public Boolean hasRequiredMarker(l lVar) {
        tb.l0 l0Var = (tb.l0) lVar.getAnnotation(tb.l0.class);
        if (l0Var == null) {
            return null;
        }
        k1 k1VarIsRequired = l0Var.isRequired();
        return k1VarIsRequired != k1.f86738e ? k1VarIsRequired.asBoolean() : Boolean.valueOf(l0Var.required());
    }

    @Override // jc.c
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        String name = clsAnnotationType.getName();
        dd.s sVar = this.f84239b;
        Boolean boolValueOf = (Boolean) sVar.get(name);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(tb.b.class) != null);
            sVar.putIfAbsent(name, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // jc.c
    public Boolean isIgnorableType(e eVar) {
        tb.b0 b0Var = (tb.b0) eVar.getAnnotation(tb.b0.class);
        if (b0Var == null) {
            return null;
        }
        return Boolean.valueOf(b0Var.value());
    }

    @Override // jc.c
    public Boolean isTypeId(l lVar) {
        return Boolean.valueOf(lVar.hasAnnotation(tb.u0.class));
    }

    @Override // jc.c
    public jc.o refineDeserializationType(lc.z zVar, b bVar, jc.o oVar) throws jc.r {
        cd.s typeFactory = zVar.getTypeFactory();
        kc.f fVar = (kc.f) bVar.getAnnotation(kc.f.class);
        Class<?> clsA = fVar == null ? null : a(fVar.as());
        if (clsA != null && !oVar.hasRawClass(clsA) && !e(clsA, oVar)) {
            try {
                oVar = typeFactory.constructSpecializedType(oVar, clsA);
            } catch (IllegalArgumentException e10) {
                throw b(e10, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", oVar, clsA.getName(), bVar.getName(), e10.getMessage()));
            }
        }
        if (oVar.isMapLikeType()) {
            jc.o keyType = oVar.getKeyType();
            Class<?> clsA2 = fVar == null ? null : a(fVar.keyAs());
            if (clsA2 != null && !e(clsA2, keyType)) {
                try {
                    oVar = ((cd.i) oVar).withKeyType(typeFactory.constructSpecializedType(keyType, clsA2));
                } catch (IllegalArgumentException e11) {
                    throw b(e11, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", oVar, clsA2.getName(), bVar.getName(), e11.getMessage()));
                }
            }
        }
        jc.o contentType = oVar.getContentType();
        if (contentType != null) {
            Class<?> clsA3 = fVar != null ? a(fVar.contentAs()) : null;
            if (clsA3 != null && !e(clsA3, contentType)) {
                try {
                    return oVar.withContentType(typeFactory.constructSpecializedType(contentType, clsA3));
                } catch (IllegalArgumentException e12) {
                    throw b(e12, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", oVar, clsA3.getName(), bVar.getName(), e12.getMessage()));
                }
            }
        }
        return oVar;
    }

    @Override // jc.c
    public m resolveSetterConflict(lc.z zVar, m mVar, m mVar2) {
        Class<?> rawParameterType = mVar.getRawParameterType(0);
        Class<?> rawParameterType2 = mVar2.getRawParameterType(0);
        if (!rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                if (rawParameterType == String.class) {
                    if (rawParameterType2 != String.class) {
                    }
                } else if (rawParameterType2 == String.class) {
                }
                return null;
            }
            return mVar2;
        }
        if (rawParameterType2.isPrimitive()) {
            return null;
        }
        return mVar;
    }

    public o0 setConstructorPropertiesImpliesCreator(boolean z10) {
        this.f84240c = z10;
        return this;
    }

    @Override // jc.c, ub.q0
    public ub.p0 version() {
        return lc.d0.f73093b;
    }

    @Override // jc.c
    public Enum<?> findDefaultEnumValue(e eVar, Enum<?>[] enumArr) {
        for (i iVar : eVar.fields()) {
            if (iVar.getType().isEnumType() && ((tb.o) iVar.getAnnotation(tb.o.class)) != null) {
                for (Enum<?> r32 : enumArr) {
                    if (r32.name().equals(iVar.getName())) {
                        return r32;
                    }
                }
            }
        }
        return null;
    }

    @Override // jc.c
    public jc.o refineSerializationType(lc.z zVar, b bVar, jc.o oVar) throws jc.r {
        Class<?> clsA;
        Class<?> clsA2;
        jc.o oVarWithStaticTyping;
        Class<?> clsA3;
        jc.o oVarWithStaticTyping2;
        cd.s typeFactory = zVar.getTypeFactory();
        kc.l lVar = (kc.l) bVar.getAnnotation(kc.l.class);
        if (lVar == null) {
            clsA = null;
        } else {
            clsA = a(lVar.as());
        }
        if (clsA != null) {
            if (oVar.hasRawClass(clsA)) {
                oVar = oVar.withStaticTyping();
            } else {
                Class<?> rawClass = oVar.getRawClass();
                try {
                    if (clsA.isAssignableFrom(rawClass)) {
                        oVar = typeFactory.constructGeneralizedType(oVar, clsA);
                    } else if (rawClass.isAssignableFrom(clsA)) {
                        oVar = typeFactory.constructSpecializedType(oVar, clsA);
                    } else if (d(rawClass, clsA)) {
                        oVar = oVar.withStaticTyping();
                    } else {
                        throw new jc.r((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", oVar, clsA.getName()));
                    }
                } catch (IllegalArgumentException e10) {
                    throw b(e10, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", oVar, clsA.getName(), bVar.getName(), e10.getMessage()));
                }
            }
        }
        if (oVar.isMapLikeType()) {
            jc.o keyType = oVar.getKeyType();
            if (lVar == null) {
                clsA3 = null;
            } else {
                clsA3 = a(lVar.keyAs());
            }
            if (clsA3 != null) {
                if (keyType.hasRawClass(clsA3)) {
                    oVarWithStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (clsA3.isAssignableFrom(rawClass2)) {
                            oVarWithStaticTyping2 = typeFactory.constructGeneralizedType(keyType, clsA3);
                        } else if (rawClass2.isAssignableFrom(clsA3)) {
                            oVarWithStaticTyping2 = typeFactory.constructSpecializedType(keyType, clsA3);
                        } else if (d(rawClass2, clsA3)) {
                            oVarWithStaticTyping2 = keyType.withStaticTyping();
                        } else {
                            throw new jc.r((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", keyType, clsA3.getName()));
                        }
                    } catch (IllegalArgumentException e11) {
                        throw b(e11, String.format(GalEuEfxjome.fpVkyWSmrl, oVar, clsA3.getName(), bVar.getName(), e11.getMessage()));
                    }
                }
                oVar = ((cd.i) oVar).withKeyType(oVarWithStaticTyping2);
            }
        }
        jc.o contentType = oVar.getContentType();
        if (contentType != null) {
            if (lVar == null) {
                clsA2 = null;
            } else {
                clsA2 = a(lVar.contentAs());
            }
            if (clsA2 != null) {
                if (contentType.hasRawClass(clsA2)) {
                    oVarWithStaticTyping = contentType.withStaticTyping();
                } else {
                    Class<?> rawClass3 = contentType.getRawClass();
                    try {
                        if (clsA2.isAssignableFrom(rawClass3)) {
                            oVarWithStaticTyping = typeFactory.constructGeneralizedType(contentType, clsA2);
                        } else if (rawClass3.isAssignableFrom(clsA2)) {
                            oVarWithStaticTyping = typeFactory.constructSpecializedType(contentType, clsA2);
                        } else if (d(rawClass3, clsA2)) {
                            oVarWithStaticTyping = contentType.withStaticTyping();
                        } else {
                            throw new jc.r((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", contentType, clsA2.getName()));
                        }
                    } catch (IllegalArgumentException e12) {
                        throw b(e12, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", oVar, clsA2.getName(), bVar.getName(), e12.getMessage()));
                    }
                }
                return oVar.withContentType(oVarWithStaticTyping);
            }
        }
        return oVar;
    }

    @Override // jc.c
    public void findEnumAliases(lc.z zVar, e eVar, Enum<?>[] enumArr, String[][] strArr) {
        HashMap map = new HashMap();
        for (i iVar : eVar.fields()) {
            tb.e eVar2 = (tb.e) iVar.getAnnotation(tb.e.class);
            if (eVar2 != null) {
                map.putIfAbsent(iVar.getName(), eVar2.value());
            }
        }
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = (String[]) map.getOrDefault(enumArr[i10].name(), new String[0]);
        }
    }

    @Override // jc.c
    public String[] findEnumValues(lc.z zVar, e eVar, Enum<?>[] enumArr, String[] strArr) {
        String strValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (i iVar : eVar.fields()) {
            tb.l0 l0Var = (tb.l0) iVar.getAnnotation(tb.l0.class);
            if (l0Var != null && (strValue = l0Var.value()) != null) {
                linkedHashMap.put(iVar.getName(), strValue);
            }
        }
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = (String) linkedHashMap.get(enumArr[i10].name());
            if (str != null) {
                strArr[i10] = str;
            }
        }
        return strArr;
    }
}
