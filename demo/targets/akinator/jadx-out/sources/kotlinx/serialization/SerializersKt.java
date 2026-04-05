package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes10.dex */
public final class SerializersKt {
    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, KClass<?> kClass) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, kClass);
    }

    public static final KSerializer<?> noCompiledSerializer(String str) {
        return SerializersKt__SerializersKt.noCompiledSerializer(str);
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> kClass, List<? extends KSerializer<Object>> list, kv.a aVar) {
        return SerializersKt__SerializersKt.parametrizedSerializerOrNull(kClass, list, aVar);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (KSerializer<T>) serializer((KType) null);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(type);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends KType> list, boolean z10) {
        return SerializersKt__SerializersKt.serializersForParameters(serializersModule, list, z10);
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, KClass<?> kClass, KSerializer<?>[] kSerializerArr) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, kClass, kSerializerArr);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, KClass<?> kClass) {
        return SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, kClass);
    }

    public static final KSerializer<Object> serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        return SerializersKt__SerializersKt.serializerOrNull(kClass);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, KClass<?> kClass, KSerializer<?>[] kSerializerArr) {
        return SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, kClass, kSerializerArr);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        return SerializersKt__SerializersKt.serializer(kClass);
    }

    public static final KSerializer<Object> serializerOrNull(KType kType) {
        return SerializersKt__SerializersKt.serializerOrNull(kType);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> kClass, List<? extends KSerializer<?>> list, boolean z10) {
        return SerializersKt__SerializersKt.serializer(kClass, list, z10);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(serializersModule, type);
    }

    public static final KSerializer<Object> serializer(KType kType) {
        return SerializersKt__SerializersKt.serializer(kType);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.serializerOrNull(serializersModule, kType);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (KSerializer<T>) serializer(serializersModule, (KType) null);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.serializer(serializersModule, type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KClass<?> kClass, List<? extends KSerializer<?>> list, boolean z10) {
        return SerializersKt__SerializersKt.serializer(serializersModule, kClass, list, z10);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.serializer(serializersModule, kType);
    }
}
