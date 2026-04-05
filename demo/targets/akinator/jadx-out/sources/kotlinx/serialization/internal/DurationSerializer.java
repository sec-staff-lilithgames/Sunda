package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DurationSerializer implements KSerializer<f> {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.INSTANCE);

    private DurationSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return f.m7182boximpl(m5211deserialize5sfh64U(decoder));
    }

    /* renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m5211deserialize5sfh64U(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return f.f87433c.m7179parseIsoStringUwyO8pc(decoder.decodeString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m5212serializeHG0u8IE(encoder, ((f) obj).m7225unboximpl());
    }

    /* renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m5212serializeHG0u8IE(Encoder encoder, long j10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeString(f.m7217toIsoStringimpl(j10));
    }
}
