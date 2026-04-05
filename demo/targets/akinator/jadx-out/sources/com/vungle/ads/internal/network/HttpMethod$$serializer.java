package com.vungle.ads.internal.network;

import com.ironsource.C3271ic;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class HttpMethod$$serializer implements GeneratedSerializer<HttpMethod> {
    public static final HttpMethod$$serializer INSTANCE = new HttpMethod$$serializer();
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.vungle.ads.internal.network.HttpMethod", 2);
        enumDescriptor.addElement(C3271ic.f36943a, false);
        enumDescriptor.addElement(C3271ic.f36944b, false);
        descriptor = enumDescriptor;
    }

    private HttpMethod$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public HttpMethod deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return HttpMethod.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, HttpMethod value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
