package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import tu.d0;
import tu.k;
import tu.v;
import uu.f0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KSerializer<Object>> list, kv.a aVar) {
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Collection.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(List.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(List.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer(list.get(0));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer(list.get(0));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Set.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(Set.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer(list.get(0));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer(list.get(0), list.get(1));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Map.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(Map.class)) || e0.areEqual(kClass, c1.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer(list.get(0), list.get(1));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer(list.get(0), list.get(1));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(v.class))) {
            return BuiltinSerializersKt.PairSerializer(list.get(0), list.get(1));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(d0.class))) {
            return BuiltinSerializersKt.TripleSerializer(list.get(0), list.get(1), list.get(2));
        }
        if (!PlatformKt.isReferenceArray(kClass)) {
            return null;
        }
        Object objInvoke = aVar.invoke();
        e0.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) objInvoke, list.get(0));
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> kClass) {
        e0.checkNotNullParameter(module, "module");
        e0.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        return contextual$default == null ? new PolymorphicSerializer(kClass) : contextual$default;
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        e0.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> kSerializer, boolean z10) {
        if (z10) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        e0.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> kClass, List<? extends KSerializer<Object>> serializers, kv.a elementClassifierIfArray) {
        e0.checkNotNullParameter(kClass, "<this>");
        e0.checkNotNullParameter(serializers, "serializers");
        e0.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers, elementClassifierIfArray);
        return kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers) : kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<T> kSerializer = (KSerializer<T>) SerializersKt.serializer((KType) null);
        e0.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return kSerializer;
    }

    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KClass<Object> kClass, List<? extends KSerializer<Object>> list, boolean z10) {
        KSerializer<? extends Object> contextual;
        if (list.isEmpty()) {
            contextual = SerializersKt.serializerOrNull(kClass);
            if (contextual == null) {
                contextual = SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kClass, list, new f());
                contextual = kSerializerParametrizedSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : kSerializerParametrizedSerializerOrNull;
            } catch (IndexOutOfBoundsException e10) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e10);
            }
        }
        if (contextual != null) {
            return nullable$SerializersKt__SerializersKt(contextual, z10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByKTypeImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = kotlinx.serialization.internal.Platform_commonKt.kclass(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = uu.q0.collectionSizeOrDefault(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            kotlin.reflect.KType r3 = kotlinx.serialization.internal.Platform_commonKt.typeOrThrow(r3)
            r2.add(r3)
            goto L1d
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4c
            boolean r7 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r7 == 0) goto L47
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L47
        L45:
            r7 = r4
            goto L60
        L47:
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersCacheKt.findCachedSerializer(r0, r1)
            goto L60
        L4c:
            boolean r7 = r6.getHasInterfaceContextualSerializers$kotlinx_serialization_core()
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.Object r7 = kotlinx.serialization.SerializersCacheKt.findParametrizedCachedSerializer(r0, r2, r1)
            boolean r5 = tu.z.m7136isFailureimpl(r7)
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersKt.serializerOrNull(r0)
            if (r7 != 0) goto Laa
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 != 0) goto Laa
            boolean r6 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r6 == 0) goto L82
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
        L80:
            r7 = r6
            goto Laa
        L82:
            r7 = r4
            goto Laa
        L84:
            java.util.List r7 = kotlinx.serialization.SerializersKt.serializersForParameters(r6, r2, r8)
            if (r7 != 0) goto L8b
            goto Lb1
        L8b:
            kotlinx.serialization.g r8 = new kotlinx.serialization.g
            r3 = 0
            r8.<init>(r2, r3)
            kotlinx.serialization.KSerializer r8 = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(r0, r7, r8)
            if (r8 != 0) goto La9
            kotlinx.serialization.KSerializer r7 = r6.getContextual(r0, r7)
            if (r7 != 0) goto Laa
            boolean r6 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r6 == 0) goto L82
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
            goto L80
        La9:
            r7 = r8
        Laa:
            if (r7 == 0) goto Lb1
            kotlinx.serialization.KSerializer r6 = nullable$SerializersKt__SerializersKt(r7, r1)
            return r6
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersKt.serializerByKTypeImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        e0.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends KType> typeArguments, boolean z10) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(typeArguments, "typeArguments");
        if (z10) {
            List<? extends KType> list = typeArguments;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        List<? extends KType> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, (KType) it2.next());
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
            arrayList2.add(kSerializerSerializerOrNull);
        }
        return arrayList2;
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        e0.checkNotNullParameter(module, "module");
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, f0.asList(argSerializers));
        return contextual == null ? new PolymorphicSerializer(kClass) : contextual;
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass) {
        e0.checkNotNullParameter(module, "module");
        e0.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new k();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType type) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        e0.checkNotNullParameter(module, "module");
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, f0.asList(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new k();
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<T> kSerializer = (KSerializer<T>) SerializersKt.serializer(serializersModule, (KType) null);
        e0.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return kSerializer;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> kSerializerCompiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return kSerializerCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : kSerializerCompiledSerializerImpl;
    }

    public static final KSerializer<Object> serializer(KType type) {
        e0.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z10) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, z10);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType type) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new k();
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z10) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt(serializersModule, kClass, typeArgumentsSerializers, z10);
        if (kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new k();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new k();
    }
}
