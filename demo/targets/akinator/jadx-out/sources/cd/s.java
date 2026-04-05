package cd;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements Serializable {
    public static final n A;

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o[] f12183g = new jc.o[0];

    /* renamed from: h, reason: collision with root package name */
    public static final s f12184h = new s();

    /* renamed from: i, reason: collision with root package name */
    public static final r f12185i = r.emptyBindings();

    /* renamed from: j, reason: collision with root package name */
    public static final Class f12186j = String.class;

    /* renamed from: k, reason: collision with root package name */
    public static final Class f12187k = Object.class;

    /* renamed from: l, reason: collision with root package name */
    public static final Class f12188l = Comparable.class;

    /* renamed from: m, reason: collision with root package name */
    public static final Class f12189m = Enum.class;

    /* renamed from: n, reason: collision with root package name */
    public static final Class f12190n = jc.t.class;

    /* renamed from: o, reason: collision with root package name */
    public static final Class f12191o;

    /* renamed from: p, reason: collision with root package name */
    public static final Class f12192p;

    /* renamed from: q, reason: collision with root package name */
    public static final Class f12193q;

    /* renamed from: r, reason: collision with root package name */
    public static final Class f12194r;

    /* renamed from: s, reason: collision with root package name */
    public static final n f12195s;

    /* renamed from: t, reason: collision with root package name */
    public static final n f12196t;

    /* renamed from: u, reason: collision with root package name */
    public static final n f12197u;

    /* renamed from: v, reason: collision with root package name */
    public static final n f12198v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f12199w;

    /* renamed from: x, reason: collision with root package name */
    public static final n f12200x;

    /* renamed from: y, reason: collision with root package name */
    public static final n f12201y;

    /* renamed from: z, reason: collision with root package name */
    public static final n f12202z;

    /* renamed from: b, reason: collision with root package name */
    public final dd.u f12203b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f12204c;

    /* renamed from: e, reason: collision with root package name */
    public final u f12205e;

    /* renamed from: f, reason: collision with root package name */
    public final ClassLoader f12206f;

    static {
        Class cls = Boolean.TYPE;
        f12191o = cls;
        Class cls2 = Double.TYPE;
        f12192p = cls2;
        Class cls3 = Integer.TYPE;
        f12193q = cls3;
        Class cls4 = Long.TYPE;
        f12194r = cls4;
        f12195s = new n(cls);
        f12196t = new n(cls2);
        f12197u = new n(cls3);
        f12198v = new n(cls4);
        f12199w = new n(String.class);
        f12200x = new n(Object.class);
        f12201y = new n(Comparable.class);
        f12202z = new n(Enum.class);
        A = new n(jc.t.class);
    }

    public s() {
        this.f12203b = new dd.s(16, 200);
        this.f12205e = new u(this);
        this.f12204c = null;
        this.f12206f = null;
    }

    public static n b(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls == f12186j) {
                return f12199w;
            }
            if (cls == f12187k) {
                return f12200x;
            }
            if (cls == f12190n) {
                return A;
            }
            return null;
        }
        if (cls == f12191o) {
            return f12195s;
        }
        if (cls == f12193q) {
            return f12197u;
        }
        if (cls == f12194r) {
            return f12198v;
        }
        if (cls == f12192p) {
            return f12196t;
        }
        return null;
    }

    public static s createDefaultInstance() {
        return new s();
    }

    public static s defaultInstance() {
        return f12184h;
    }

    public static boolean f(jc.o oVar, jc.o oVar2) {
        if (oVar2 instanceof k) {
            ((k) oVar2).actualType(oVar);
            return true;
        }
        if (oVar.getRawClass() == oVar2.getRawClass()) {
            List<jc.o> typeParameters = oVar.getBindings().getTypeParameters();
            List<jc.o> typeParameters2 = oVar2.getBindings().getTypeParameters();
            int size = typeParameters.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (f(typeParameters.get(i10), typeParameters2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Class<?> rawClass(Type type) {
        return type instanceof Class ? (Class) type : type instanceof jc.o ? ((jc.o) type).getRawClass() : type instanceof GenericArrayType ? Array.newInstance(rawClass(((GenericArrayType) type).getGenericComponentType()), 0).getClass() : type instanceof ParameterizedType ? rawClass(((ParameterizedType) type).getRawType()) : type instanceof TypeVariable ? rawClass(((TypeVariable) type).getBounds()[0]) : type instanceof WildcardType ? rawClass(((WildcardType) type).getUpperBounds()[0]) : defaultInstance().constructType(type).getRawClass();
    }

    public static jc.o unknownType() {
        return f12200x;
    }

    public final jc.o a(Type type, jc.o oVar) {
        t[] tVarArr = this.f12204c;
        if (tVarArr == null) {
            return oVar;
        }
        r bindings = oVar.getBindings();
        if (bindings == null) {
            bindings = f12185i;
        }
        int length = tVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            t tVar = tVarArr[i10];
            jc.o oVarModifyType = tVar.modifyType(oVar, type, bindings, this);
            if (oVarModifyType == null) {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", tVar, tVar.getClass().getName(), oVar));
            }
            i10++;
            oVar = oVarModifyType;
        }
        return oVar;
    }

    public final jc.o c(c cVar, Type type, r rVar) {
        jc.o oVarC;
        Type[] bounds;
        r rVarCreate;
        if (type instanceof Class) {
            oVarC = d(cVar, (Class) type, f12185i);
        } else {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                if (cls == f12189m) {
                    oVarC = f12202z;
                } else if (cls == f12188l) {
                    oVarC = f12201y;
                } else {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
                    if (length == 0) {
                        rVarCreate = f12185i;
                    } else {
                        jc.o[] oVarArr = new jc.o[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            oVarArr[i10] = c(cVar, actualTypeArguments[i10], rVar);
                        }
                        rVarCreate = r.create((Class<?>) cls, oVarArr);
                    }
                    oVarC = d(cVar, cls, rVarCreate);
                }
            } else {
                if (type instanceof jc.o) {
                    return (jc.o) type;
                }
                if (type instanceof GenericArrayType) {
                    oVarC = a.construct(c(cVar, ((GenericArrayType) type).getGenericComponentType(), rVar), rVar);
                } else if (type instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) type;
                    String name = typeVariable.getName();
                    if (rVar == null) {
                        throw new IllegalArgumentException(a.b.l("Null `bindings` passed (type variable \"", name, "\")"));
                    }
                    jc.o oVarFindBoundType = rVar.findBoundType(name);
                    if (oVarFindBoundType != null) {
                        oVarC = oVarFindBoundType;
                    } else if (rVar.hasUnbound(name)) {
                        oVarC = f12200x;
                    } else {
                        r rVarWithUnboundVariable = rVar.withUnboundVariable(name);
                        synchronized (typeVariable) {
                            bounds = typeVariable.getBounds();
                        }
                        oVarC = c(cVar, bounds[0], rVarWithUnboundVariable);
                    }
                } else {
                    if (!(type instanceof WildcardType)) {
                        StringBuilder sb2 = new StringBuilder("Unrecognized Type: ");
                        sb2.append(type == null ? "[null]" : type.toString());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    oVarC = c(cVar, ((WildcardType) type).getUpperBounds()[0], rVar);
                }
            }
        }
        return a(type, oVarC);
    }

    public void clearCache() {
        this.f12203b.clear();
    }

    public a constructArrayType(Class<?> cls) {
        return a.construct(c(null, cls, null), null);
    }

    public d constructCollectionLikeType(Class<?> cls, Class<?> cls2) {
        return constructCollectionLikeType(cls, d(null, cls2, f12185i));
    }

    public e constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, d(null, cls2, f12185i));
    }

    public jc.o constructFromCanonical(String str) throws IllegalArgumentException {
        return this.f12205e.parse(str);
    }

    public jc.o constructGeneralizedType(jc.o oVar, Class<?> cls) {
        Class<?> rawClass = oVar.getRawClass();
        if (rawClass == cls) {
            return oVar;
        }
        jc.o oVarFindSuperType = oVar.findSuperType(cls);
        if (oVarFindSuperType != null) {
            return oVarFindSuperType;
        }
        if (cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), oVar));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), oVar));
    }

    public i constructMapLikeType(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        r rVar = f12185i;
        return constructMapLikeType(cls, d(null, cls2, rVar), d(null, cls3, rVar));
    }

    public j constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        jc.o oVarD;
        jc.o oVarD2;
        if (cls == Properties.class) {
            oVarD = f12199w;
            oVarD2 = oVarD;
        } else {
            r rVar = f12185i;
            oVarD = d(null, cls2, rVar);
            oVarD2 = d(null, cls3, rVar);
        }
        return constructMapType(cls, oVarD, oVarD2);
    }

    public jc.o constructParametricType(Class<?> cls, Class<?>... clsArr) {
        int length = clsArr.length;
        jc.o[] oVarArr = new jc.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = d(null, clsArr[i10], f12185i);
        }
        return constructParametricType(cls, oVarArr);
    }

    @Deprecated
    public jc.o constructParametrizedType(Class<?> cls, Class<?> cls2, jc.o... oVarArr) {
        return constructParametricType(cls, oVarArr);
    }

    public d constructRawCollectionLikeType(Class<?> cls) {
        return constructCollectionLikeType(cls, unknownType());
    }

    public e constructRawCollectionType(Class<? extends Collection> cls) {
        return constructCollectionType(cls, unknownType());
    }

    public i constructRawMapLikeType(Class<?> cls) {
        return constructMapLikeType(cls, unknownType(), unknownType());
    }

    public j constructRawMapType(Class<? extends Map> cls) {
        return constructMapType(cls, unknownType(), unknownType());
    }

    public jc.o constructReferenceType(Class<?> cls, jc.o oVar) {
        return l.construct(cls, r.create(cls, oVar), null, null, oVar);
    }

    public jc.o constructSimpleType(Class<?> cls, jc.o[] oVarArr) {
        return d(null, cls, r.create(cls, oVarArr));
    }

    public jc.o constructSpecializedType(jc.o oVar, Class<?> cls) throws IllegalArgumentException {
        return constructSpecializedType(oVar, cls, false);
    }

    public jc.o constructType(Type type) {
        return c(null, type, f12185i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jc.o d(cd.c r18, java.lang.Class r19, cd.r r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.s.d(cd.c, java.lang.Class, cd.r):jc.o");
    }

    public final jc.o[] e(c cVar, Class cls, r rVar) {
        Type[] genericInterfaces = dd.i.getGenericInterfaces(cls);
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f12183g;
        }
        int length = genericInterfaces.length;
        jc.o[] oVarArr = new jc.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = c(cVar, genericInterfaces[i10], rVar);
        }
        return oVarArr;
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Throwable rootCause = null;
        if (str.indexOf(46) < 0) {
            Class<?> cls = "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return Class.forName(str, true, classLoader);
            } catch (Exception e10) {
                rootCause = dd.i.getRootCause(e10);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e11) {
            if (rootCause == null) {
                rootCause = dd.i.getRootCause(e11);
            }
            dd.i.throwIfRTE(rootCause);
            throw new ClassNotFoundException(rootCause.getMessage(), rootCause);
        }
    }

    public jc.o findFirstTypeParameter(jc.o oVar, Class<?> cls) {
        jc.o boundTypeOrNull;
        jc.o oVarFindSuperType = oVar.findSuperType(cls);
        return (oVarFindSuperType == null || (boundTypeOrNull = oVarFindSuperType.getBindings().getBoundTypeOrNull(0)) == null) ? f12200x : boundTypeOrNull;
    }

    public jc.o[] findTypeParameters(jc.o oVar, Class<?> cls) {
        jc.o oVarFindSuperType = oVar.findSuperType(cls);
        return oVarFindSuperType == null ? f12183g : oVarFindSuperType.getBindings().f12180c;
    }

    public ClassLoader getClassLoader() {
        return this.f12206f;
    }

    public jc.o moreSpecificType(jc.o oVar, jc.o oVar2) {
        Class<?> rawClass;
        Class<?> rawClass2;
        return oVar == null ? oVar2 : (oVar2 == null || (rawClass = oVar.getRawClass()) == (rawClass2 = oVar2.getRawClass()) || !rawClass.isAssignableFrom(rawClass2)) ? oVar : oVar2;
    }

    public jc.o resolveMemberType(Type type, r rVar) {
        return c(null, type, rVar);
    }

    @Deprecated
    public jc.o uncheckedSimpleType(Class<?> cls) {
        n nVarB;
        r rVar = f12185i;
        return (!rVar.isEmpty() || (nVarB = b(cls)) == null) ? new n(cls, rVar, null, null) : nVarB;
    }

    @Deprecated
    public s withCache(dd.s sVar) {
        return new s(sVar, this.f12205e, this.f12204c, this.f12206f);
    }

    public s withClassLoader(ClassLoader classLoader) {
        return new s(this.f12203b, this.f12205e, this.f12204c, classLoader);
    }

    public s withModifier(t tVar) {
        t[] tVarArr;
        dd.u uVar = null;
        if (tVar == null) {
            tVarArr = null;
        } else {
            t[] tVarArr2 = this.f12204c;
            if (tVarArr2 == null) {
                tVarArr = new t[]{tVar};
            } else {
                tVarArr = (t[]) dd.d.insertInListNoDup(tVarArr2, tVar);
                uVar = this.f12203b;
            }
        }
        return new s(uVar, this.f12205e, tVarArr, this.f12206f);
    }

    public a constructArrayType(jc.o oVar) {
        return a.construct(oVar, null);
    }

    @Deprecated
    public jc.o constructParametrizedType(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return constructParametricType(cls, clsArr);
    }

    @Deprecated
    public jc.o constructSimpleType(Class<?> cls, Class<?> cls2, jc.o[] oVarArr) {
        return constructSimpleType(cls, oVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r3 == java.util.EnumSet.class) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.o constructSpecializedType(jc.o r17, java.lang.Class<?> r18, boolean r19) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.s.constructSpecializedType(jc.o, java.lang.Class, boolean):jc.o");
    }

    public jc.o constructType(hc.b bVar) {
        throw null;
    }

    public s withCache(dd.u uVar) {
        return new s(uVar, this.f12205e, this.f12204c, this.f12206f);
    }

    @Deprecated
    public jc.o constructType(Type type, r rVar) {
        if (type instanceof Class) {
            return a(type, d(null, (Class) type, rVar));
        }
        return c(null, type, rVar);
    }

    public d constructCollectionLikeType(Class<?> cls, jc.o oVar) {
        jc.o oVarD = d(null, cls, r.createIfNeeded(cls, oVar));
        if (oVarD instanceof d) {
            return (d) oVarD;
        }
        return d.upgradeFrom(oVarD, oVar);
    }

    public e constructCollectionType(Class<? extends Collection> cls, jc.o oVar) {
        r rVarCreateIfNeeded = r.createIfNeeded(cls, oVar);
        e eVar = (e) d(null, cls, rVarCreateIfNeeded);
        if (rVarCreateIfNeeded.isEmpty() && oVar != null) {
            jc.o contentType = eVar.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(oVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", dd.i.nameOf(cls), oVar, contentType));
            }
        }
        return eVar;
    }

    public i constructMapLikeType(Class<?> cls, jc.o oVar, jc.o oVar2) {
        jc.o oVarD = d(null, cls, r.createIfNeeded(cls, new jc.o[]{oVar, oVar2}));
        if (oVarD instanceof i) {
            return (i) oVarD;
        }
        return i.upgradeFrom(oVarD, oVar, oVar2);
    }

    public jc.o constructParametricType(Class<?> cls, jc.o... oVarArr) {
        return constructParametricType(cls, r.create(cls, oVarArr));
    }

    @Deprecated
    public jc.o[] findTypeParameters(Class<?> cls, Class<?> cls2, r rVar) {
        return findTypeParameters(constructType(cls, rVar), cls2);
    }

    public j constructMapType(Class<? extends Map> cls, jc.o oVar, jc.o oVar2) {
        r rVarCreateIfNeeded = r.createIfNeeded(cls, new jc.o[]{oVar, oVar2});
        j jVar = (j) d(null, cls, rVarCreateIfNeeded);
        if (rVarCreateIfNeeded.isEmpty()) {
            jc.o oVarFindSuperType = jVar.findSuperType(Map.class);
            jc.o keyType = oVarFindSuperType.getKeyType();
            if (keyType.equals(oVar)) {
                jc.o contentType = oVarFindSuperType.getContentType();
                if (!contentType.equals(oVar2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", dd.i.nameOf(cls), oVar2, contentType));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", dd.i.nameOf(cls), oVar, keyType));
            }
        }
        return jVar;
    }

    public jc.o constructParametricType(Class<?> cls, r rVar) {
        return a(cls, d(null, cls, rVar));
    }

    @Deprecated
    public jc.o[] findTypeParameters(Class<?> cls, Class<?> cls2) {
        return findTypeParameters(constructType(cls), cls2);
    }

    public s(dd.u uVar, u uVar2, t[] tVarArr, ClassLoader classLoader) {
        this.f12203b = uVar == null ? new dd.s(16, 200) : uVar;
        this.f12205e = uVar2.withFactory(this);
        this.f12204c = tVarArr;
        this.f12206f = classLoader;
    }

    @Deprecated
    public jc.o constructType(Type type, Class<?> cls) {
        return constructType(type, cls == null ? null : constructType(cls));
    }

    @Deprecated
    public jc.o constructType(Type type, jc.o oVar) {
        r bindings;
        if (oVar == null) {
            bindings = f12185i;
        } else {
            r bindings2 = oVar.getBindings();
            if (type.getClass() != Class.class) {
                jc.o superClass = oVar;
                bindings = bindings2;
                while (bindings.isEmpty() && (superClass = superClass.getSuperClass()) != null) {
                    bindings = superClass.getBindings();
                }
            } else {
                bindings = bindings2;
            }
        }
        return c(null, type, bindings);
    }
}
