package kotlinx.serialization.internal;

import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalSerializationApi
/* loaded from: classes10.dex */
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(CompositeDecoder compositeDecoder) {
        return (T) CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        T t10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        b1 b1Var = new b1();
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            t10 = (T) decodeSequentially(compositeDecoderBeginStructure);
        } else {
            Object objDecodeSerializableElement$default = null;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        b1Var.f71816b = compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) b1Var.f71816b;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iDecodeElementIndex);
                            throw new SerializationException(sb2.toString());
                        }
                        Object obj = b1Var.f71816b;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        b1Var.f71816b = obj;
                        objDecodeSerializableElement$default = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), iDecodeElementIndex, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoderBeginStructure, (String) obj), null, 8, null);
                    }
                } else {
                    if (objDecodeSerializableElement$default == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) b1Var.f71816b)).toString());
                    }
                    e0.checkNotNull(objDecodeSerializableElement$default, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    t10 = (T) objDecodeSerializableElement$default;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return t10;
    }

    @InternalSerializationApi
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String str) {
        e0.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().getPolymorphic((KClass) getBaseClass(), str);
    }

    public abstract KClass<T> getBaseClass();

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        compositeEncoderBeginStructure.encodeStringElement(getDescriptor(), 0, serializationStrategyFindPolymorphicSerializer.getDescriptor().getSerialName());
        SerialDescriptor descriptor2 = getDescriptor();
        e0.checkNotNull(serializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        compositeEncoderBeginStructure.encodeSerializableElement(descriptor2, 1, serializationStrategyFindPolymorphicSerializer, value);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @InternalSerializationApi
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().getPolymorphic((KClass<? super KClass<T>>) getBaseClass(), (KClass<T>) value);
    }
}
