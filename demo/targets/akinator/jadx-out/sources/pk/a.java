package pk;

import b0.e2;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Objects;
import mk.e0;
import mk.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f81481a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f81482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81483c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeCanonicalize = g.canonicalize(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    b(typeCanonicalize);
                }
                this.f81482b = typeCanonicalize;
                this.f81481a = g.getRawType(typeCanonicalize);
                this.f81483c = typeCanonicalize.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + e0.createUrl("type-token-raw"));
        }
        throw new IllegalStateException(KGUkpTlXZlJLy.tZhkGYmhA);
    }

    public static boolean a(Type type, ParameterizedType parameterizedType, HashMap map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> rawType = g.getRawType(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                TypeVariable<Class<?>> typeVariable = typeParameters[i10];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (parameterizedType2.getRawType().equals(parameterizedType.getRawType())) {
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                Type[] actualTypeArguments3 = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments2.length; i11++) {
                    Type type3 = actualTypeArguments2[i11];
                    Type type4 = actualTypeArguments3[i11];
                    if (type4.equals(type3) || ((type3 instanceof TypeVariable) && type4.equals(map.get(((TypeVariable) type3).getName())))) {
                    }
                }
                return true;
            }
        }
        for (Type type5 : rawType.getGenericInterfaces()) {
            if (a(type5, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return a(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static void b(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + e0.createUrl("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            b(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                b(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                b(actualTypeArguments[i10]);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            b(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i10 < length2) {
            b(upperBounds[i10]);
            i10++;
        }
    }

    public static a<?> get(Type type) {
        return new a<>(type);
    }

    public static a<?> getArray(Type type) {
        return new a<>(g.arrayOf(type));
    }

    public static a<?> getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return get(cls);
        }
        if (g.requiresOwnerType(type)) {
            throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Raw type "), " is not supported because it requires specifying an owner type"));
        }
        for (int i10 = 0; i10 < length; i10++) {
            Type type2 = typeArr[i10];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Type type3 = type2;
            Class<?> rawType = g.getRawType(type3);
            TypeVariable<Class<T>> typeVariable = typeParameters[i10];
            for (Type type4 : typeVariable.getBounds()) {
                if (!g.getRawType(type4).isAssignableFrom(rawType)) {
                    throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a<>(g.newParameterizedTypeWithOwner(null, cls, typeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return g.equals(this.f81482b, ((a) obj).f81482b);
        }
        return false;
    }

    public final Class<? super T> getRawType() {
        return this.f81481a;
    }

    public final Type getType() {
        return this.f81482b;
    }

    public final int hashCode() {
        return this.f81483c;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return g.typeToString(this.f81482b);
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Deprecated
    public boolean isAssignableFrom(Type type) {
        boolean zA;
        if (type != 0) {
            Type type2 = this.f81482b;
            if (!type2.equals(type)) {
                boolean z10 = type2 instanceof Class;
                Class cls = this.f81481a;
                if (z10) {
                    return cls.isAssignableFrom(g.getRawType(type));
                }
                if (type2 instanceof ParameterizedType) {
                    return a(type, (ParameterizedType) type2, new HashMap());
                }
                if (!(type2 instanceof GenericArrayType)) {
                    Class[] clsArr = {Class.class, ParameterizedType.class, GenericArrayType.class};
                    StringBuilder sb2 = new StringBuilder("Unsupported type, expected one of: ");
                    for (int i10 = 0; i10 < 3; i10++) {
                        sb2.append(clsArr[i10].getName());
                        sb2.append(", ");
                    }
                    sb2.append("but got: ");
                    sb2.append(type2.getClass().getName());
                    sb2.append(", for type token: ");
                    sb2.append(type2.toString());
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (cls.isAssignableFrom(g.getRawType(type))) {
                    Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                    if (genericComponentType instanceof ParameterizedType) {
                        if (type instanceof GenericArrayType) {
                            type = ((GenericArrayType) type).getGenericComponentType();
                        } else if (type instanceof Class) {
                            type = (Class) type;
                            while (type.isArray()) {
                                type = type.getComponentType();
                            }
                        }
                        zA = a(type, (ParameterizedType) genericComponentType, new HashMap());
                    } else {
                        zA = true;
                    }
                    if (zA) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeCanonicalize = g.canonicalize(type);
        this.f81482b = typeCanonicalize;
        this.f81481a = g.getRawType(typeCanonicalize);
        this.f81483c = typeCanonicalize.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
