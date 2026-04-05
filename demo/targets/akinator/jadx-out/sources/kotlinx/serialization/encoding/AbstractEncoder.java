package kotlinx.serialization.encoding;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NoOpEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginCollection(SerialDescriptor serialDescriptor, int i10) {
        return Encoder.DefaultImpls.beginCollection(this, serialDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z10) {
        encodeValue(Boolean.valueOf(z10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor descriptor, int i10, boolean z10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeBoolean(z10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b10) {
        encodeValue(Byte.valueOf(b10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(SerialDescriptor descriptor, int i10, byte b10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeByte(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c10) {
        encodeValue(Character.valueOf(c10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(SerialDescriptor descriptor, int i10, char c10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeChar(c10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d10) {
        encodeValue(Double.valueOf(d10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor descriptor, int i10, double d10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeDouble(d10);
        }
    }

    public boolean encodeElement(SerialDescriptor descriptor, int i10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor enumDescriptor, int i10) {
        e0.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f10) {
        encodeValue(Float.valueOf(f10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor descriptor, int i10, float f10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeFloat(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(SerialDescriptor descriptor, int i10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return encodeElement(descriptor, i10) ? encodeInline(descriptor.getElementDescriptor(i10)) : NoOpEncoder.INSTANCE;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i10) {
        encodeValue(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(SerialDescriptor descriptor, int i10, int i11) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeInt(i11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j10) {
        encodeValue(Long.valueOf(j10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor descriptor, int i10, long j10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeLong(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public void encodeNotNullMark() {
        Encoder.DefaultImpls.encodeNotNullMark(this);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(SerialDescriptor descriptor, int i10, SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeNullableSerializableValue(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t10) {
        Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializationStrategy, t10);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeSerializableElement(SerialDescriptor descriptor, int i10, SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeSerializableValue(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t10) {
        Encoder.DefaultImpls.encodeSerializableValue(this, serializationStrategy, t10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s10) {
        encodeValue(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(SerialDescriptor descriptor, int i10, short s10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeShort(s10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        e0.checkNotNullParameter(value, "value");
        encodeValue(value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor descriptor, int i10, String value) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(value, "value");
        if (encodeElement(descriptor, i10)) {
            encodeString(value);
        }
    }

    public void encodeValue(Object value) {
        e0.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + c1.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + c1.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor, int i10) {
        return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, serialDescriptor, i10);
    }
}
