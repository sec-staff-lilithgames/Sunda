package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ULongSerializer implements KSerializer<o0> {
    public static final ULongSerializer INSTANCE = new ULongSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializersKt.serializer(g0.f71833a));

    private ULongSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return o0.m7080boximpl(m5237deserializeI7RO_PI(decoder));
    }

    /* renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public long m5237deserializeI7RO_PI(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return o0.m7081constructorimpl(decoder.decodeInline(getDescriptor()).decodeLong());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m5238serialize2TYgG_w(encoder, ((o0) obj).m7086unboximpl());
    }

    /* renamed from: serialize-2TYgG_w, reason: not valid java name */
    public void m5238serialize2TYgG_w(Encoder encoder, long j10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeLong(j10);
    }
}
