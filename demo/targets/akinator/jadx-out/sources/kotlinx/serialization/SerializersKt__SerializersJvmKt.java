package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import tu.d0;
import tu.k;
import tu.v;
import uu.k0;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, GenericArrayType genericArrayType, boolean z10) {
        KSerializer<Object> kSerializerSerializerOrNull;
        KClass kotlinClass;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            e0.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) k0.first(upperBounds);
        }
        e0.checkNotNull(genericComponentType);
        if (z10) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, genericComponentType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, genericComponentType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            e0.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = jv.a.getKotlinClass((Class) rawType);
        } else {
            if (!(genericComponentType instanceof KClass)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + c1.getOrCreateKotlinClass(genericComponentType.getClass()));
            }
            kotlinClass = (KClass) genericComponentType;
        }
        e0.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializerSerializerOrNull);
        e0.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            e0.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            e0.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = k0.first(upperBounds);
            e0.checkNotNullExpressionValue(objFirst, "first(...)");
            return prettyClass$SerializersKt__SerializersJvmKt((Type) objFirst);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            e0.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + c1.getOrCreateKotlinClass(type.getClass()));
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<T> cls, List<? extends KSerializer<Object>> list) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(cls, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerConstructSerializerForGivenTypeArgs != null) {
            return kSerializerConstructSerializerForGivenTypeArgs;
        }
        KClass<T> kotlinClass = jv.a.getKotlinClass(cls);
        KSerializer<T> kSerializerBuiltinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(kotlinClass);
        if (kSerializerBuiltinSerializerOrNull != null) {
            return kSerializerBuiltinSerializerOrNull;
        }
        KSerializer<T> contextual = serializersModule.getContextual(kotlinClass, list);
        if (contextual != null) {
            return contextual;
        }
        if (cls.isInterface()) {
            return new PolymorphicSerializer(jv.a.getKotlinClass(cls));
        }
        return null;
    }

    public static final KSerializer<Object> serializer(Type type) {
        e0.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Type type, boolean z10) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt(serializersModule, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt(serializersModule, (Class) type, z10);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                e0.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                Object objFirst = k0.first(upperBounds);
                e0.checkNotNullExpressionValue(objFirst, "first(...)");
                return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(serializersModule, (Type) objFirst, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + c1.getOrCreateKotlinClass(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        e0.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        e0.checkNotNull(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                e0.checkNotNull(type2);
                arrayList.add(SerializersKt.serializer(serializersModule, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                e0.checkNotNull(type3);
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, type3);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(kSerializerSerializerOrNull);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerSetSerializer = BuiltinSerializersKt.SetSerializer((KSerializer) arrayList.get(0));
            e0.checkNotNull(kSerializerSetSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerSetSerializer;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerListSerializer = BuiltinSerializersKt.ListSerializer((KSerializer) arrayList.get(0));
            e0.checkNotNull(kSerializerListSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerListSerializer;
        }
        if (Map.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerMapSerializer = BuiltinSerializersKt.MapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            e0.checkNotNull(kSerializerMapSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapSerializer;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerMapEntrySerializer = BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            e0.checkNotNull(kSerializerMapEntrySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapEntrySerializer;
        }
        if (v.class.isAssignableFrom(cls)) {
            KSerializer<v> kSerializerPairSerializer = BuiltinSerializersKt.PairSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            e0.checkNotNull(kSerializerPairSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerPairSerializer;
        }
        if (d0.class.isAssignableFrom(cls)) {
            KSerializer<d0> kSerializerTripleSerializer = BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
            e0.checkNotNull(kSerializerTripleSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerTripleSerializer;
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        for (KSerializer kSerializer : arrayList) {
            e0.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(kSerializer);
        }
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, arrayList2);
    }

    public static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z10);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        e0.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<?> cls, boolean z10) {
        KSerializer<Object> kSerializerSerializerOrNull;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, p0.emptyList());
        }
        Class<?> componentType = cls.getComponentType();
        e0.checkNotNullExpressionValue(componentType, "getComponentType(...)");
        if (z10) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, componentType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, componentType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        KClass kotlinClass = jv.a.getKotlinClass(componentType);
        e0.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializerSerializerOrNull);
        e0.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerArraySerializer;
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, true);
        if (kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new k();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, false);
    }
}
