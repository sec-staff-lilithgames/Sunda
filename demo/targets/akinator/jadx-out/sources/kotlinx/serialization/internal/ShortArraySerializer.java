package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ShortArraySerializer extends PrimitiveArraySerializer<Short, short[], ShortArrayBuilder> implements KSerializer<short[]> {
    public static final ShortArraySerializer INSTANCE = new ShortArraySerializer();

    private ShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(e1.f71827a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(short[] sArr) {
        e0.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public short[] empty() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ShortArrayBuilder toBuilder(short[] sArr) {
        e0.checkNotNullParameter(sArr, "<this>");
        return new ShortArrayBuilder(sArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, short[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeShortElement(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, ShortArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeShortElement(getDescriptor(), i10));
    }
}
