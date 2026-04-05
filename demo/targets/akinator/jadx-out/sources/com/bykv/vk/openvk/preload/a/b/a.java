package com.bykv.vk.openvk.preload.a.b;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f16779a = new Type[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a$a, reason: collision with other inner class name */
    public static final class C0055a implements Serializable, GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f16783a;

        public C0055a(Type type) {
            this.f16783a = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.a(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f16783a;
        }

        public final int hashCode() {
            return this.f16783a.hashCode();
        }

        public final String toString() {
            return a.c(this.f16783a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Serializable, ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f16786a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f16787b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f16788c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                com.bykv.vk.openvk.preload.falconx.a.a.a(z10);
            }
            this.f16786a = type == null ? null : a.a(type);
            this.f16787b = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f16788c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(this.f16788c[i10]);
                a.e(this.f16788c[i10]);
                Type[] typeArr3 = this.f16788c;
                typeArr3[i10] = a.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.a(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f16788c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f16786a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f16787b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f16788c) ^ this.f16787b.hashCode()) ^ a.a((Object) this.f16786a);
        }

        public final String toString() {
            int length = this.f16788c.length;
            if (length == 0) {
                return a.c(this.f16787b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(a.c(this.f16787b));
            sb2.append("<");
            sb2.append(a.c(this.f16788c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(a.c(this.f16788c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Serializable, WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f16793a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f16794b;

        public c(Type[] typeArr, Type[] typeArr2) {
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2.length <= 1);
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0]);
                a.e(typeArr[0]);
                this.f16794b = null;
                this.f16793a = a.a(typeArr[0]);
                return;
            }
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2[0]);
            a.e(typeArr2[0]);
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0] == Object.class);
            this.f16794b = a.a(typeArr2[0]);
            this.f16793a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.a(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f16794b;
            return type != null ? new Type[]{type} : a.f16779a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f16793a};
        }

        public final int hashCode() {
            Type type = this.f16794b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16793a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f16794b != null) {
                return "? super " + a.c(this.f16794b);
            }
            if (this.f16793a == Object.class) {
                return "?";
            }
            return "? extends " + a.c(this.f16793a);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0055a(a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0055a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                com.bykv.vk.openvk.preload.falconx.a.a.a(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (!(type instanceof WildcardType)) {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
            }
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return (Class) type;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static void e(Type type) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static GenericArrayType f(Type type) {
        return new C0055a(type);
    }

    public static boolean a(Type type, Type type2) {
        while (type != type2) {
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
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else {
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
        }
        return true;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.bykv.vk.openvk.preload.falconx.a.a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeB = b(type, cls, Map.class);
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:28:0x0051, LOOP_START, PHI: r5
      0x0037: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v4 java.lang.Class<?>) binds: [B:18:0x0035, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r4, java.lang.Class<?> r5, java.lang.Class<?> r6) {
        /*
        L0:
            if (r6 != r5) goto L3
            return r4
        L3:
            boolean r4 = r6.isInterface()
            if (r4 == 0) goto L31
            java.lang.Class[] r4 = r5.getInterfaces()
            int r0 = r4.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            r2 = r4[r1]
            if (r2 != r6) goto L1c
            java.lang.reflect.Type[] r4 = r5.getGenericInterfaces()
            r4 = r4[r1]
            return r4
        L1c:
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L2e
            java.lang.reflect.Type[] r5 = r5.getGenericInterfaces()
            r5 = r5[r1]
            r4 = r4[r1]
        L2a:
            r3 = r5
            r5 = r4
            r4 = r3
            goto L0
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            boolean r4 = r5.isInterface()
            if (r4 != 0) goto L53
        L37:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r5 == r4) goto L53
            java.lang.Class r4 = r5.getSuperclass()
            if (r4 != r6) goto L46
            java.lang.reflect.Type r4 = r5.getGenericSuperclass()
            return r4
        L46:
            boolean r0 = r6.isAssignableFrom(r4)
            if (r0 == 0) goto L51
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
            goto L2a
        L51:
            r5 = r4
            goto L37
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    public static Type a(Type type, Class<?> cls) {
        Type typeB = b(type, cls, Collection.class);
        if (typeB instanceof WildcardType) {
            typeB = ((WildcardType) typeB).getUpperBounds()[0];
        }
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
