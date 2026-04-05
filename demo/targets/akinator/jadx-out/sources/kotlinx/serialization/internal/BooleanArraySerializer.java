package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder> implements KSerializer<boolean[]> {
    public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer();

    private BooleanArraySerializer() {
        super(BuiltinSerializersKt.serializer(m.f71852a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(boolean[] zArr) {
        e0.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public boolean[] empty() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public BooleanArrayBuilder toBuilder(boolean[] zArr) {
        e0.checkNotNullParameter(zArr, "<this>");
        return new BooleanArrayBuilder(zArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, boolean[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeBooleanElement(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, BooleanArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeBooleanElement(getDescriptor(), i10));
    }
}
