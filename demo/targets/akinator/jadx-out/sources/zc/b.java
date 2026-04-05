package zc;

import bd.a1;
import bd.d1;
import bd.f1;
import bd.i0;
import bd.t0;
import bd.u0;
import bd.w;
import bd.w0;
import bd.z0;
import dd.k0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import jc.s0;
import jc.v;
import jc.y;
import lc.e0;
import tb.c0;
import tb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends s implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f97756c;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f97757e;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f97758b;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new a1());
        d1 d1Var = d1.f9070e;
        map2.put(StringBuffer.class.getName(), d1Var);
        map2.put(StringBuilder.class.getName(), d1Var);
        map2.put(Character.class.getName(), d1Var);
        map2.put(Character.TYPE.getName(), d1Var);
        bd.e0.addAll(map2);
        map2.put(Boolean.TYPE.getName(), new bd.e(true));
        map2.put(Boolean.class.getName(), new bd.e(false));
        map2.put(BigInteger.class.getName(), new w(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new w(BigDecimal.class));
        map2.put(Calendar.class.getName(), bd.h.f9080h);
        map2.put(Date.class.getName(), bd.k.f9092h);
        for (Map.Entry<Class<?>, Object> entry : u0.all()) {
            Object value = entry.getValue();
            if (value instanceof jc.w) {
                map2.put(entry.getKey().getName(), (jc.w) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(k0.class.getName(), f1.class);
        f97756c = map2;
        f97757e = map;
    }

    public b(e0 e0Var) {
        this.f97758b = e0Var == null ? new e0() : e0Var;
    }

    public static d0 a(jc.u0 u0Var, jc.d dVar, jc.o oVar, Class cls) {
        s0 config = u0Var.getConfig();
        d0 defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, dVar.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        d0 defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(oVar.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            int iOrdinal = defaultPropertyInclusion2.getValueInclusion().ordinal();
            if (iOrdinal == 5) {
                return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
            }
            if (iOrdinal != 6) {
                return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
            }
        }
        return defaultPropertyInclusion;
    }

    public static jc.w c(jc.u0 u0Var, rc.b bVar) {
        Object objFindSerializer = u0Var.getAnnotationIntrospector().findSerializer(bVar);
        if (objFindSerializer == null) {
            return null;
        }
        jc.w wVarSerializerInstance = u0Var.serializerInstance(bVar, objFindSerializer);
        Object objFindSerializationConverter = u0Var.getAnnotationIntrospector().findSerializationConverter(bVar);
        dd.m mVarConverterInstance = objFindSerializationConverter != null ? u0Var.converterInstance(bVar, objFindSerializationConverter) : null;
        if (mVarConverterInstance == null) {
            return wVarSerializerInstance;
        }
        return new t0(mVarConverterInstance, ((nc.o) mVarConverterInstance).getOutputType(u0Var.getTypeFactory()), wVarSerializerInstance);
    }

    public final z0 b(jc.u0 u0Var, jc.o oVar, jc.d dVar) {
        if (v.class.isAssignableFrom(oVar.getRawClass())) {
            return i0.f9089e;
        }
        rc.l lVarFindJsonValueAccessor = dVar.findJsonValueAccessor();
        if (lVarFindJsonValueAccessor == null) {
            return null;
        }
        if (u0Var.canOverrideAccessModifiers()) {
            dd.i.checkAndFixAccess(lVarFindJsonValueAccessor.getMember(), u0Var.isEnabled(y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        jc.o type = lVarFindJsonValueAccessor.getType();
        jc.w wVarC = c(u0Var, lVarFindJsonValueAccessor);
        if (wVarC == null) {
            wVarC = (jc.w) type.getValueHandler();
        }
        wc.j jVarCreateTypeSerializer = (wc.j) type.getTypeHandler();
        if (jVarCreateTypeSerializer == null) {
            jVarCreateTypeSerializer = createTypeSerializer(u0Var.getConfig(), type);
        }
        return bd.s.construct(u0Var.getConfig(), lVarFindJsonValueAccessor, jVarCreateTypeSerializer, wVarC);
    }

    public i buildCollectionSerializer(jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        return new bd.j(oVar, z10, jVar, wVar);
    }

    public jc.w buildEnumSetSerializer(jc.o oVar) {
        return new bd.n(oVar);
    }

    public i buildIndexedListSerializer(jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        return new ad.g(oVar, z10, jVar, wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[PHI: r3
      0x0081: PHI (r3v4 jc.w) = (r3v3 jc.w), (r3v6 jc.w) binds: [B:13:0x0039, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // zc.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createKeySerializer(jc.u0 r7, jc.o r8, jc.w r9) throws jc.r {
        /*
            r6 = this;
            jc.s0 r0 = r7.getConfig()
            jc.d r1 = r0.introspect(r8)
            lc.e0 r2 = r6.f97758b
            boolean r3 = r2.hasKeySerializers()
            if (r3 == 0) goto L24
            java.lang.Iterable r3 = r2.keySerializers()
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L1f
            goto L24
        L1f:
            java.lang.ClassCastException r7 = a.b.c(r3)
            throw r7
        L24:
            rc.e r3 = r1.getClassInfo()
            jc.c r4 = r7.getAnnotationIntrospector()
            java.lang.Object r4 = r4.findKeySerializer(r3)
            r5 = 0
            if (r4 == 0) goto L38
            jc.w r3 = r7.serializerInstance(r3, r4)
            goto L39
        L38:
            r3 = r5
        L39:
            if (r3 != 0) goto L81
            if (r9 != 0) goto L82
            java.lang.Class r3 = r8.getRawClass()
            r4 = 0
            jc.w r3 = bd.w0.getStdKeySerializer(r0, r3, r4)
            if (r3 != 0) goto L81
            rc.l r3 = r1.findJsonKeyAccessor()
            if (r3 != 0) goto L52
            rc.l r3 = r1.findJsonValueAccessor()
        L52:
            if (r3 == 0) goto L74
            jc.o r4 = r3.getType()
            jc.w r7 = r6.createKeySerializer(r7, r4, r9)
            boolean r9 = r0.canOverrideAccessModifiers()
            if (r9 == 0) goto L6f
            java.lang.reflect.Member r9 = r3.getMember()
            jc.y r4 = jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r4 = r0.isEnabled(r4)
            dd.i.checkAndFixAccess(r9, r4)
        L6f:
            bd.s r9 = bd.s.construct(r0, r3, r5, r7)
            goto L82
        L74:
            java.lang.Class r7 = r8.getRawClass()
            rc.e r9 = r1.getClassInfo()
            jc.w r9 = bd.w0.getFallbackKeySerializer(r0, r7, r9)
            goto L82
        L81:
            r9 = r3
        L82:
            boolean r7 = r2.hasSerializerModifiers()
            if (r7 == 0) goto La1
            java.lang.Iterable r7 = r2.serializerModifiers()
            java.util.Iterator r7 = r7.iterator()
        L90:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r7.next()
            zc.h r2 = (zc.h) r2
            jc.w r9 = r2.modifyKeySerializer(r0, r8, r1, r9)
            goto L90
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.b.createKeySerializer(jc.u0, jc.o, jc.w):jc.w");
    }

    @Override // zc.s
    public abstract jc.w createSerializer(jc.u0 u0Var, jc.o oVar) throws jc.r;

    @Override // zc.s
    public wc.j createTypeSerializer(s0 s0Var, jc.o oVar) {
        Collection<wc.c> collectionCollectAndResolveSubtypesByClass;
        rc.e classInfo = s0Var.introspectClassAnnotations(oVar.getRawClass()).getClassInfo();
        wc.i iVarFindTypeResolver = s0Var.getAnnotationIntrospector().findTypeResolver(s0Var, classInfo, oVar);
        if (iVarFindTypeResolver == null) {
            iVarFindTypeResolver = s0Var.getDefaultTyper(oVar);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = s0Var.getSubtypeResolver().collectAndResolveSubtypesByClass(s0Var, classInfo);
        }
        if (iVarFindTypeResolver == null) {
            return null;
        }
        return iVarFindTypeResolver.buildTypeSerializer(s0Var, oVar, collectionCollectAndResolveSubtypesByClass);
    }

    public jc.w findReferenceSerializer(jc.u0 u0Var, cd.l lVar, jc.d dVar, boolean z10) throws jc.r {
        boolean zIncludeFilterSuppressNulls;
        jc.o contentType = lVar.getContentType();
        wc.j jVarCreateTypeSerializer = (wc.j) contentType.getTypeHandler();
        s0 config = u0Var.getConfig();
        if (jVarCreateTypeSerializer == null) {
            jVarCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        jc.w wVar = (jc.w) contentType.getValueHandler();
        Iterator<t> it = ((g) this).f97758b.serializers().iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        Object defaultValue = null;
        if (!lVar.isTypeOrSubTypeOf(AtomicReference.class)) {
            return null;
        }
        jc.o referencedType = lVar.getReferencedType();
        d0 d0VarA = a(u0Var, dVar, referencedType, AtomicReference.class);
        c0 c0Var = c0.f86699h;
        c0 contentInclusion = d0VarA == null ? c0Var : d0VarA.getContentInclusion();
        if (contentInclusion == c0Var || contentInclusion == c0.f86694b) {
            zIncludeFilterSuppressNulls = false;
        } else {
            int iOrdinal = contentInclusion.ordinal();
            zIncludeFilterSuppressNulls = true;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    defaultValue = bd.u.f9129u;
                } else if (iOrdinal == 4) {
                    defaultValue = dd.f.getDefaultValue(referencedType);
                    if (defaultValue != null && defaultValue.getClass().isArray()) {
                        defaultValue = dd.d.getArrayComparator(defaultValue);
                    }
                } else if (iOrdinal == 5 && (defaultValue = u0Var.includeFilterInstance(null, d0VarA.getContentFilter())) != null) {
                    zIncludeFilterSuppressNulls = u0Var.includeFilterSuppressNulls(defaultValue);
                }
            } else if (referencedType.isReferenceType()) {
                defaultValue = bd.u.f9129u;
            }
        }
        return new bd.c(lVar, z10, jVarCreateTypeSerializer, wVar).withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    public e0 getFactoryConfig() {
        return this.f97758b;
    }

    @Override // zc.s
    public final s withAdditionalKeySerializers(t tVar) {
        return withConfig(this.f97758b.withAdditionalKeySerializers(tVar));
    }

    @Override // zc.s
    public final s withAdditionalSerializers(t tVar) {
        return withConfig(this.f97758b.withAdditionalSerializers(tVar));
    }

    public abstract s withConfig(e0 e0Var);

    @Override // zc.s
    public final s withSerializerModifier(h hVar) {
        return withConfig(this.f97758b.withSerializerModifier(hVar));
    }

    @Override // zc.s
    @Deprecated
    public jc.w createKeySerializer(s0 s0Var, jc.o oVar, jc.w wVar) {
        jc.d dVarIntrospect = s0Var.introspect(oVar);
        e0 e0Var = this.f97758b;
        if (e0Var.hasKeySerializers()) {
            Iterator<t> it = e0Var.keySerializers().iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
        if (wVar == null && (wVar = w0.getStdKeySerializer(s0Var, oVar.getRawClass(), false)) == null) {
            wVar = w0.getFallbackKeySerializer(s0Var, oVar.getRawClass(), dVarIntrospect.getClassInfo());
        }
        if (e0Var.hasSerializerModifiers()) {
            Iterator<h> it2 = e0Var.serializerModifiers().iterator();
            while (it2.hasNext()) {
                wVar = it2.next().modifyKeySerializer(s0Var, oVar, dVarIntrospect, wVar);
            }
        }
        return wVar;
    }
}
