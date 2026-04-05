package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder> implements KSerializer<double[]> {
    public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer();

    private DoubleArraySerializer() {
        super(BuiltinSerializersKt.serializer(v.f71861a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(double[] dArr) {
        e0.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public double[] empty() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public DoubleArrayBuilder toBuilder(double[] dArr) {
        e0.checkNotNullParameter(dArr, "<this>");
        return new DoubleArrayBuilder(dArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, double[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeDoubleElement(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, DoubleArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeDoubleElement(getDescriptor(), i10));
    }
}
