package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import tu.i0;
import tu.k;
import tu.k0;
import tu.m0;
import tu.o0;
import tu.q0;
import tu.t0;
import tu.v0;
import tu.x0;
import tv.f;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> kClass, KSerializer<Object>... args) {
        e0.checkNotNullParameter(kClass, "<this>");
        e0.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(jv.a.getJavaClass((KClass) kClass), (KSerializer<Object>[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        e0.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        e0.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerInvokeSerializerOnCompanion;
        Object objFindNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (objFindNamedCompanionByAnnotation != null && (kSerializerInvokeSerializerOnCompanion = invokeSerializerOnCompanion(objFindNamedCompanionByAnnotation, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerInvokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            e0.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (e0.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        e0.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(NamedCompanion.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return companionOrNull(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.serialization.KSerializer<T> findObjectSerializer(java.lang.Class<T> r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = sv.k0.startsWith$default(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = sv.k0.startsWith$default(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.e0.areEqual(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.e0.areEqual(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.e0.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = kotlin.jvm.internal.e0.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto Lae
            kotlinx.serialization.KSerializer r11 = (kotlinx.serialization.KSerializer) r11
            return r11
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.findObjectSerializer(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final <T> T getChecked(T[] tArr, int i10) {
        e0.checkNotNullParameter(tArr, "<this>");
        return tArr[i10];
    }

    public static final Map<KClass<?>, KSerializer<?>> initBuiltins() {
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(g1.f71834a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(q.f71856a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(v.f71861a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(w.f71862a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(g0.f71833a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(o0.class), BuiltinSerializersKt.serializer(o0.f87397c));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(c0.f71819a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(k0.class), BuiltinSerializersKt.serializer(k0.f87387c));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(e1.f71827a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(t0.class), BuiltinSerializersKt.serializer(t0.f87408c));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(n.f71853a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(tu.g0.class), BuiltinSerializersKt.serializer(tu.g0.f87381c));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(m.f71852a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(x0.class), BuiltinSerializersKt.serializer(x0.f87415a));
        mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(f.class), BuiltinSerializersKt.serializer(f.f87433c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(q0.class), BuiltinSerializersKt.ULongArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(m0.class), BuiltinSerializersKt.UIntArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(v0.class), BuiltinSerializersKt.UShortArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(i0.class), BuiltinSerializersKt.UByteArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(c1.getOrCreateKotlinClass(vv.b.class), BuiltinSerializersKt.serializer(vv.b.f89658e));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return o1.build(mapCreateMapBuilder);
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objCompanionOrNull = companionOrNull(cls, "Companion");
        if (objCompanionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(objCompanionOrNull, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean isInterface(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        return jv.a.getJavaClass((KClass) kClass).isInterface();
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        return serializable != null && e0.areEqual(c1.getOrCreateKotlinClass(serializable.with()), c1.getOrCreateKotlinClass(PolymorphicSerializer.class));
    }

    public static final boolean isReferenceArray(KClass<Object> rootClass) {
        e0.checkNotNullParameter(rootClass, "rootClass");
        return jv.a.getJavaClass((KClass) rootClass).isArray();
    }

    private static final void loadSafe(kv.a aVar) {
        try {
            aVar.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new k();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        e0.checkNotNullParameter(cls, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage((KClass<?>) jv.a.getKotlinClass(cls)));
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, KClass<T> eClass) throws NegativeArraySizeException {
        e0.checkNotNullParameter(arrayList, "<this>");
        e0.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) jv.a.getJavaClass((KClass) eClass), arrayList.size());
        e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        e0.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> cls, KSerializer<Object>... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(cls, "<this>");
        e0.checkNotNullParameter(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        KSerializer<T> kSerializerInvokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerInvokeSerializerOnDefaultCompanion != null) {
            return kSerializerInvokeSerializerOnDefaultCompanion;
        }
        KSerializer<T> kSerializerFindObjectSerializer = findObjectSerializer(cls);
        if (kSerializerFindObjectSerializer != null) {
            return kSerializerFindObjectSerializer;
        }
        KSerializer<T> kSerializerFindInNamedCompanion = findInNamedCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerFindInNamedCompanion != null) {
            return kSerializerFindInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new PolymorphicSerializer(jv.a.getKotlinClass(cls));
        }
        return null;
    }

    public static final boolean getChecked(boolean[] zArr, int i10) {
        e0.checkNotNullParameter(zArr, "<this>");
        return zArr[i10];
    }
}
