package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerializersCacheKt {
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE;
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE;
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE;
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE;

    static {
        final int i10 = 0;
        SERIALIZERS_CACHE = CachingKt.createCache(new l() { // from class: kotlinx.serialization.c
            @Override // kv.l
            public final Object invoke(Object obj) {
                KClass kClass = (KClass) obj;
                switch (i10) {
                    case 0:
                        return SerializersCacheKt.SERIALIZERS_CACHE$lambda$0(kClass);
                    default:
                        return SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1(kClass);
                }
            }
        });
        final int i11 = 1;
        SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new l() { // from class: kotlinx.serialization.c
            @Override // kv.l
            public final Object invoke(Object obj) {
                KClass kClass = (KClass) obj;
                switch (i11) {
                    case 0:
                        return SerializersCacheKt.SERIALIZERS_CACHE$lambda$0(kClass);
                    default:
                        return SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1(kClass);
                }
            }
        });
        final int i12 = 0;
        PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new p() { // from class: kotlinx.serialization.d
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                switch (i12) {
                    case 0:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(kClass, list);
                    default:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(kClass, list);
                }
            }
        });
        final int i13 = 1;
        PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new p() { // from class: kotlinx.serialization.d
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                switch (i13) {
                    case 0:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(kClass, list);
                    default:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(kClass, list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, List types) {
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        e0.checkNotNull(listSerializersForParameters);
        return SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, new e(types, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, List types) {
        KSerializer nullable;
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        e0.checkNotNull(listSerializersForParameters);
        KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, new e(types, 1));
        if (kSerializerParametrizedSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerParametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
        e0.checkNotNullParameter(it, "it");
        KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        if (PlatformKt.isInterface(it)) {
            return new PolymorphicSerializer(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
        KSerializer nullable;
        e0.checkNotNullParameter(it, "it");
        KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (kSerializerSerializerOrNull == null) {
            kSerializerSerializerOrNull = PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null;
        }
        if (kSerializerSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    public static final KSerializer<Object> findCachedSerializer(KClass<Object> clazz, boolean z10) {
        e0.checkNotNullParameter(clazz, "clazz");
        if (z10) {
            return SERIALIZERS_CACHE_NULLABLE.get(clazz);
        }
        KSerializer<? extends Object> kSerializer = SERIALIZERS_CACHE.get(clazz);
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    public static final Object findParametrizedCachedSerializer(KClass<Object> clazz, List<? extends KType> types, boolean z10) {
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(types, "types");
        return !z10 ? PARAMETRIZED_SERIALIZERS_CACHE.mo5210getgIAlus(clazz, types) : PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo5210getgIAlus(clazz, types);
    }

    public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(KClass<?> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        if (PlatformKt.isInterface(kClass)) {
            return new PolymorphicSerializer<>(kClass);
        }
        return null;
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }
}
