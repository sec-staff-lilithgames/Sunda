package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import tu.g0;
import tu.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UByteArraySerializer extends PrimitiveArraySerializer<g0, i0, UByteArrayBuilder> implements KSerializer<i0> {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(g0.f87381c));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m5217collectionSizeGBYM_sE(((i0) obj).m7054unboximpl());
    }

    /* renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    public int m5217collectionSizeGBYM_sE(byte[] collectionSize) {
        e0.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return i0.m7046getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ i0 empty() {
        return i0.m7038boximpl(m5218emptyTcUX1vc());
    }

    /* renamed from: empty-TcUX1vc, reason: not valid java name */
    public byte[] m5218emptyTcUX1vc() {
        return i0.m7039constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m5219toBuilderGBYM_sE(((i0) obj).m7054unboximpl());
    }

    /* renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    public UByteArrayBuilder m5219toBuilderGBYM_sE(byte[] toBuilder) {
        e0.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UByteArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, i0 i0Var, int i10) {
        m5220writeContentCoi6ktg(compositeEncoder, i0Var.m7054unboximpl(), i10);
    }

    /* renamed from: writeContent-Coi6ktg, reason: not valid java name */
    public void m5220writeContentCoi6ktg(CompositeEncoder encoder, byte[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeByte(i0.m7045getw2LRezQ(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, UByteArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.m5215append7apg3OU$kotlinx_serialization_core(g0.m7031constructorimpl(decoder.decodeInlineElement(getDescriptor(), i10).decodeByte()));
    }
}
