package kotlinx.serialization.internal;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UIntSerializer implements KSerializer<k0> {
    public static final UIntSerializer INSTANCE = new UIntSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(c0.f71819a));

    private UIntSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return k0.m7055boximpl(m5229deserializeOGnWXxg(decoder));
    }

    /* renamed from: deserialize-OGnWXxg, reason: not valid java name */
    public int m5229deserializeOGnWXxg(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return k0.m7056constructorimpl(decoder.decodeInline(getDescriptor()).decodeInt());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m5230serializeQn1smSk(encoder, ((k0) obj).m7061unboximpl());
    }

    /* renamed from: serialize-Qn1smSk, reason: not valid java name */
    public void m5230serializeQn1smSk(Encoder encoder, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeInt(i10);
    }
}
