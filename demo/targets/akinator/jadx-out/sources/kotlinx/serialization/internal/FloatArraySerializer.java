package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FloatArraySerializer extends PrimitiveArraySerializer<Float, float[], FloatArrayBuilder> implements KSerializer<float[]> {
    public static final FloatArraySerializer INSTANCE = new FloatArraySerializer();

    private FloatArraySerializer() {
        super(BuiltinSerializersKt.serializer(w.f71862a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(float[] fArr) {
        e0.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public float[] empty() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public FloatArrayBuilder toBuilder(float[] fArr) {
        e0.checkNotNullParameter(fArr, "<this>");
        return new FloatArrayBuilder(fArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, float[] content, int i10) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeFloatElement(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i10, FloatArrayBuilder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeFloatElement(getDescriptor(), i10));
    }
}
