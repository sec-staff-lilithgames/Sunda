package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kv.l;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialModuleImpl extends SerializersModule {
    private final Map<KClass<?>, ContextualProvider> class2ContextualFactory;
    private final boolean hasInterfaceContextualSerializers;
    private final Map<KClass<?>, l> polyBase2DefaultDeserializerProvider;
    private final Map<KClass<?>, l> polyBase2DefaultSerializerProvider;
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SerialModuleImpl(Map<KClass<?>, ? extends ContextualProvider> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers, Map<KClass<?>, ? extends l> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends l> polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        e0.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        e0.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        e0.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        e0.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        e0.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z10;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public void dumpTo(SerializersModuleCollector collector) {
        e0.checkNotNullParameter(collector, "collector");
        for (Map.Entry<KClass<?>, ContextualProvider> entry : this.class2ContextualFactory.entrySet()) {
            KClass<?> key = entry.getKey();
            ContextualProvider value = entry.getValue();
            if (value instanceof ContextualProvider.Argless) {
                e0.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> serializer = ((ContextualProvider.Argless) value).getSerializer();
                e0.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.contextual(key, serializer);
            } else {
                if (!(value instanceof ContextualProvider.WithTypeArguments)) {
                    throw new t();
                }
                collector.contextual(key, ((ContextualProvider.WithTypeArguments) value).getProvider());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                e0.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                e0.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                e0.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.polymorphic(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, l> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            l value3 = entry4.getValue();
            e0.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            e0.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultSerializer(key4, (l) h1.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, l> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            l value4 = entry5.getValue();
            e0.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            e0.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultDeserializer(key5, (l) h1.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> KSerializer<T> getContextual(KClass<T> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = this.class2ContextualFactory.get(kClass);
        KSerializer<T> kSerializer = contextualProvider != null ? (KSerializer<T>) contextualProvider.invoke(typeArgumentsSerializers) : null;
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core() {
        return this.hasInterfaceContextualSerializers;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> SerializationStrategy<T> getPolymorphic(KClass<? super T> baseClass, T value) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.polyBase2Serializers.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(c1.getOrCreateKotlinClass(value.getClass())) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l lVar = this.polyBase2DefaultSerializerProvider.get(baseClass);
        l lVar2 = h1.isFunctionOfArity(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (SerializationStrategy) lVar2.invoke(value);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> DeserializationStrategy<T> getPolymorphic(KClass<? super T> baseClass, String str) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        Map<String, KSerializer<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l lVar = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        l lVar2 = h1.isFunctionOfArity(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (DeserializationStrategy) lVar2.invoke(str);
        }
        return null;
    }
}
