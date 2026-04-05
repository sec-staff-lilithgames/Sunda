package kotlinx.serialization.encoding;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kv.a;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DecodingKt {
    public static final <T> T decodeIfNullable(Decoder decoder, DeserializationStrategy<? extends T> deserializer, a block) {
        e0.checkNotNullParameter(decoder, "<this>");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(block, "block");
        return (deserializer.getDescriptor().isNullable() || decoder.decodeNotNullMark()) ? (T) block.invoke() : (T) decoder.decodeNull();
    }

    public static final <T> T decodeStructure(Decoder decoder, SerialDescriptor descriptor, l block) {
        e0.checkNotNullParameter(decoder, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(block, "block");
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        T t10 = (T) block.invoke(compositeDecoderBeginStructure);
        compositeDecoderBeginStructure.endStructure(descriptor);
        return t10;
    }
}
