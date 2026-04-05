package io.odeeo.internal.y1;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p0.o2;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f67739a = new Type[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f67740a;

        public a(Type type) {
            this.f67740a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && w.a(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f67740a;
        }

        public int hashCode() {
            return this.f67740a.hashCode();
        }

        public String toString() {
            return w.d(this.f67740a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f67741a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f67742b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f67743c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                w.a(type3, "typeArgument == null");
                w.a(type3);
            }
            this.f67741a = type;
            this.f67742b = type2;
            this.f67743c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && w.a(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f67743c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f67741a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f67742b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f67743c) ^ this.f67742b.hashCode();
            Type type = this.f67741a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f67743c;
            if (typeArr.length == 0) {
                return w.d(this.f67742b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(w.d(this.f67742b));
            sb2.append("<");
            sb2.append(w.d(this.f67743c[0]));
            for (int i10 = 1; i10 < this.f67743c.length; i10++) {
                sb2.append(", ");
                sb2.append(w.d(this.f67743c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f67744a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f67745b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                w.a(type);
                this.f67745b = null;
                this.f67744a = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            w.a(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f67745b = typeArr2[0];
            this.f67744a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && w.a(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f67745b;
            return type != null ? new Type[]{type} : w.f67739a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f67744a};
        }

        public int hashCode() {
            Type type = this.f67745b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f67744a.hashCode() + 31);
        }

        public String toString() {
            if (this.f67745b != null) {
                return "? super " + w.d(this.f67745b);
            }
            if (this.f67744a == Object.class) {
                return "?";
            }
            return "? extends " + w.d(this.f67744a);
        }
    }

    public static RuntimeException a(Method method, String str, Object... objArr) {
        return a(method, (Throwable) null, str, objArr);
    }

    public static Class<?> b(Type type) {
        a(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return b(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static RuntimeException a(Method method, Throwable th2, String str, Object... objArr) {
        StringBuilder sbT = a.b.t(String.format(str, objArr), "\n    for method ");
        sbT.append(method.getDeclaringClass().getSimpleName());
        sbT.append(".");
        sbT.append(method.getName());
        return new IllegalArgumentException(sbT.toString(), th2);
    }

    public static boolean c(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (c(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return c(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? PtLatqAYjEFT.peBlvQriwmXKgh : type.getClass().getName()));
    }

    public static RuntimeException a(Method method, Throwable th2, int i10, String str, Object... objArr) {
        StringBuilder sbT = a.b.t(str, " (parameter #");
        sbT.append(i10 + 1);
        sbT.append(")");
        return a(method, th2, sbT.toString(), objArr);
    }

    public static RuntimeException a(Method method, int i10, String str, Object... objArr) {
        StringBuilder sbT = a.b.t(str, " (parameter #");
        sbT.append(i10 + 1);
        sbT.append(")");
        return a(method, sbT.toString(), objArr);
    }

    public static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static Type b(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbT = o2.t(i10, "Index ", " not in range [0,");
        sbT.append(actualTypeArguments.length);
        sbT.append(") for ");
        sbT.append(parameterizedType);
        throw new IllegalArgumentException(sbT.toString());
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return a(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static int a(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeA = a(type, cls, (TypeVariable<?>) typeVariable);
            if (typeA == typeVariable) {
                return typeA;
            }
            type3 = typeA;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeA2 = a(type, cls, (Type) componentType);
                return componentType == typeA2 ? cls2 : new a(typeA2);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeA3 = a(type, cls, genericComponentType);
            return genericComponentType == typeA3 ? genericArrayType : new a(typeA3);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeA4 = a(type, cls, ownerType);
            boolean z10 = typeA4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeA5 = a(type, cls, actualTypeArguments[i10]);
                if (typeA5 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeA5;
                }
            }
            return z10 ? new b(typeA4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeA6 = a(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeA6 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeA6});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeA7 = a(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeA7 != upperBounds[0]) {
                        return new c(new Type[]{typeA7}, f67739a);
                    }
                }
            }
        }
        return type4;
    }

    public static Type a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsA = a(typeVariable);
        if (clsA != null) {
            Type typeA = a(type, cls, clsA);
            if (typeA instanceof ParameterizedType) {
                return ((ParameterizedType) typeA).getActualTypeArguments()[a(clsA.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static Class<?> a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T a(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static w0 a(w0 w0Var) throws IOException {
        pw.g gVar = new pw.g();
        w0Var.source().readAll(gVar);
        return w0.create(w0Var.contentType(), w0Var.contentLength(), gVar);
    }

    public static <T> void a(Class<T> cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length > 0) {
                throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public static Type a(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static void a(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (th2 instanceof LinkageError) {
                    throw ((LinkageError) th2);
                }
                return;
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }
}
