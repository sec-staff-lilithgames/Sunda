package kotlinx.serialization.internal;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import tu.k0;
import tu.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UIntArraySerializer extends PrimitiveArraySerializer<k0, m0, UIntArrayBuilder> implements KSerializer<m0> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(k0.f87387c));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m5225collectionSizeajY9A(((m0) obj).m7079unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ m0 empty() {
        return m0.m7063boximpl(m5226emptyhP7Qyg());
    }

    /* renamed from: empty--hP7Qyg, reason: not valid java name */
    public int[] m5226emptyhP7Qyg() {
        return m0.m7064constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m5227toBuilderajY9A(((m0) obj).m7079unboximpl());
    }

    /* renamed from: toBuilder--ajY-9A, reason: not valid java name */
    public UIntArrayBuilder m5227toBuilderajY9A(int[] toBuilder) {
        e0.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UIntArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, m0 m0Var, int i10) {
        m5228writeContentCPlH8fI(compositeEncoder, m0Var.m7079unboximpl(), i10);
    }

    /* renamed from: writeContent-CPlH8fI, reason: not valid java name */
    public void m5228writeContentCPlH8fI(CompositeEncoder encoder, int[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeInt(m0.m7070getpVg5ArA(content, i11));
        }
    }

    /* renamed from: collectionSize--ajY-9A, reason: not valid java name */
    public int m5225collectionSizeajY9A(int[] iArr) {
        e0.checkNotNullParameter(iArr, OcvDtWCQ.GjPgJ);
        return m0.m7071getSizeimpl(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, UIntArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.m5223appendWZ4Q5Ns$kotlinx_serialization_core(k0.m7056constructorimpl(decoder.decodeInlineElement(getDescriptor(), i10).decodeInt()));
    }
}
