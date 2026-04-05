package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LongSerializer implements KSerializer<Long> {
    public static final LongSerializer INSTANCE = new LongSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.Long", PrimitiveKind.LONG.INSTANCE);

    private LongSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Long deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    public void serialize(Encoder encoder, long j10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeLong(j10);
    }
}
