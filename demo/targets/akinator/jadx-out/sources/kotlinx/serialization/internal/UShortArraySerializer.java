package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import tu.t0;
import tu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer<t0, v0, UShortArrayBuilder> implements KSerializer<v0> {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    private UShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(t0.f87408c));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m5241collectionSizerL5Bavg(((v0) obj).m7129unboximpl());
    }

    /* renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    public int m5241collectionSizerL5Bavg(short[] collectionSize) {
        e0.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return v0.m7121getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ v0 empty() {
        return v0.m7113boximpl(m5242emptyamswpOA());
    }

    /* renamed from: empty-amswpOA, reason: not valid java name */
    public short[] m5242emptyamswpOA() {
        return v0.m7114constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m5243toBuilderrL5Bavg(((v0) obj).m7129unboximpl());
    }

    /* renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    public UShortArrayBuilder m5243toBuilderrL5Bavg(short[] toBuilder) {
        e0.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UShortArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, v0 v0Var, int i10) {
        m5244writeContenteny0XGE(compositeEncoder, v0Var.m7129unboximpl(), i10);
    }

    /* renamed from: writeContent-eny0XGE, reason: not valid java name */
    public void m5244writeContenteny0XGE(CompositeEncoder encoder, short[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeShort(v0.m7120getMh2AYeg(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, UShortArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.m5239appendxj2QHRw$kotlinx_serialization_core(t0.m7106constructorimpl(decoder.decodeInlineElement(getDescriptor(), i10).decodeShort()));
    }
}
