package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;
import tu.k;
import tu.x0;
import uu.f0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class ContextualSerializer<T> implements KSerializer<T> {
    private final SerialDescriptor descriptor;
    private final KSerializer<T> fallbackSerializer;
    private final KClass<T> serializableClass;
    private final List<KSerializer<?>> typeArgumentsSerializers;

    public ContextualSerializer(KClass<T> serializableClass, KSerializer<T> kSerializer, KSerializer<?>[] typeArgumentsSerializers) {
        e0.checkNotNullParameter(serializableClass, "serializableClass");
        e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = kSerializer;
        this.typeArgumentsSerializers = f0.asList(typeArgumentsSerializers);
        this.descriptor = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new a(this, 0)), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 descriptor$lambda$0(ContextualSerializer contextualSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        SerialDescriptor descriptor;
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        KSerializer<T> kSerializer = contextualSerializer.fallbackSerializer;
        List<Annotation> annotations = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = p0.emptyList();
        }
        buildSerialDescriptor.setAnnotations(annotations);
        return x0.f87415a;
    }

    private final KSerializer<T> serializer(SerializersModule serializersModule) {
        KSerializer<T> contextual = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers);
        if (contextual != null) {
            return contextual;
        }
        KSerializer<T> kSerializer = this.fallbackSerializer;
        if (kSerializer != null) {
            return kSerializer;
        }
        Platform_commonKt.serializerNotRegistered(this.serializableClass);
        throw new k();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.decodeSerializableValue(serializer(decoder.getSerializersModule()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(KClass<T> serializableClass) {
        this(serializableClass, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
        e0.checkNotNullParameter(serializableClass, "serializableClass");
    }
}
