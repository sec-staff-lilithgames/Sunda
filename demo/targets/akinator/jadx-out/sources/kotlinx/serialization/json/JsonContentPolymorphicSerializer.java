package kotlinx.serialization.json;

import e3.g;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {
    private final KClass<T> baseClass;
    private final SerialDescriptor descriptor;

    public JsonContentPolymorphicSerializer(KClass<T> baseClass) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + '>', PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(KClass<?> kClass, KClass<?> kClass2) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throw new SerializationException(g.l("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass2.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoderAsJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        JsonElement jsonElementDecodeJsonElement = jsonDecoderAsJsonDecoder.decodeJsonElement();
        DeserializationStrategy<T> deserializationStrategySelectDeserializer = selectDeserializer(jsonElementDecodeJsonElement);
        e0.checkNotNull(deserializationStrategySelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) jsonDecoderAsJsonDecoder.getJson().decodeFromJsonElement((KSerializer) deserializationStrategySelectDeserializer, jsonElementDecodeJsonElement);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract DeserializationStrategy<T> selectDeserializer(JsonElement jsonElement);

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerializationStrategy<T> polymorphic = encoder.getSerializersModule().getPolymorphic((KClass<? super KClass<T>>) this.baseClass, (KClass<T>) value);
        if (polymorphic == null && (polymorphic = SerializersKt.serializerOrNull(c1.getOrCreateKotlinClass(value.getClass()))) == null) {
            throwSubtypeNotRegistered(c1.getOrCreateKotlinClass(value.getClass()), this.baseClass);
            throw new k();
        }
        ((KSerializer) polymorphic).serialize(encoder, value);
    }
}
