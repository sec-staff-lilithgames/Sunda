package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import tu.o0;
import tu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer<o0, q0, ULongArrayBuilder> implements KSerializer<q0> {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(o0.f87397c));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m5233collectionSizeQwZRm1k(((q0) obj).m7104unboximpl());
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    public int m5233collectionSizeQwZRm1k(long[] collectionSize) {
        e0.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return q0.m7096getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ q0 empty() {
        return q0.m7088boximpl(m5234emptyY2RjT0g());
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    public long[] m5234emptyY2RjT0g() {
        return q0.m7089constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m5235toBuilderQwZRm1k(((q0) obj).m7104unboximpl());
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    public ULongArrayBuilder m5235toBuilderQwZRm1k(long[] toBuilder) {
        e0.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new ULongArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, q0 q0Var, int i10) {
        m5236writeContent0q3Fkuo(compositeEncoder, q0Var.m7104unboximpl(), i10);
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    public void m5236writeContent0q3Fkuo(CompositeEncoder encoder, long[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeLong(q0.m7095getsVKNKU(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, ULongArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.m5231appendVKZWuLQ$kotlinx_serialization_core(o0.m7081constructorimpl(decoder.decodeInlineElement(getDescriptor(), i10).decodeLong()));
    }
}
