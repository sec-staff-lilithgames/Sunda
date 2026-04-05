package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UShortSerializer implements KSerializer<t0> {
    public static final UShortSerializer INSTANCE = new UShortSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UShort", BuiltinSerializersKt.serializer(e1.f71827a));

    private UShortSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return t0.m7105boximpl(m5245deserializeBwKQO78(decoder));
    }

    /* renamed from: deserialize-BwKQO78, reason: not valid java name */
    public short m5245deserializeBwKQO78(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return t0.m7106constructorimpl(decoder.decodeInline(getDescriptor()).decodeShort());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m5246serializei8woANY(encoder, ((t0) obj).m7111unboximpl());
    }

    /* renamed from: serialize-i8woANY, reason: not valid java name */
    public void m5246serializei8woANY(Encoder encoder, short s10) {
        e0.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeShort(s10);
    }
}
