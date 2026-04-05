package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UByteSerializer implements KSerializer<g0> {
    public static final UByteSerializer INSTANCE = new UByteSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UByte", BuiltinSerializersKt.serializer(n.f71853a));

    private UByteSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return g0.m7030boximpl(m5221deserializeWa3L5BU(decoder));
    }

    /* renamed from: deserialize-Wa3L5BU, reason: not valid java name */
    public byte m5221deserializeWa3L5BU(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return g0.m7031constructorimpl(decoder.decodeInline(getDescriptor()).decodeByte());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m5222serializeEK6454(encoder, ((g0) obj).m7036unboximpl());
    }

    /* renamed from: serialize-EK-6454, reason: not valid java name */
    public void m5222serializeEK6454(Encoder encoder, byte b10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(b10);
    }
}
