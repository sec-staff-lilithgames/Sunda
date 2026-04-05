package kotlinx.serialization.encoding;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CompositeEncoder {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(CompositeEncoder compositeEncoder, SerialDescriptor descriptor, int i10) {
            e0.checkNotNullParameter(descriptor, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(SerialDescriptor serialDescriptor, int i10, boolean z10);

    void encodeByteElement(SerialDescriptor serialDescriptor, int i10, byte b10);

    void encodeCharElement(SerialDescriptor serialDescriptor, int i10, char c10);

    void encodeDoubleElement(SerialDescriptor serialDescriptor, int i10, double d10);

    void encodeFloatElement(SerialDescriptor serialDescriptor, int i10, float f10);

    Encoder encodeInlineElement(SerialDescriptor serialDescriptor, int i10);

    void encodeIntElement(SerialDescriptor serialDescriptor, int i10, int i11);

    void encodeLongElement(SerialDescriptor serialDescriptor, int i10, long j10);

    @ExperimentalSerializationApi
    <T> void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i10, SerializationStrategy<? super T> serializationStrategy, T t10);

    <T> void encodeSerializableElement(SerialDescriptor serialDescriptor, int i10, SerializationStrategy<? super T> serializationStrategy, T t10);

    void encodeShortElement(SerialDescriptor serialDescriptor, int i10, short s10);

    void encodeStringElement(SerialDescriptor serialDescriptor, int i10, String str);

    void endStructure(SerialDescriptor serialDescriptor);

    SerializersModule getSerializersModule();

    @ExperimentalSerializationApi
    boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor, int i10);
}
