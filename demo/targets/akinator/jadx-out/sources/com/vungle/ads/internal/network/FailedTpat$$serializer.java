package com.vungle.ads.internal.network;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class FailedTpat$$serializer implements GeneratedSerializer<FailedTpat> {
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("retryAttempt", true);
        pluginGeneratedSerialDescriptor.addElement("retryCount", false);
        pluginGeneratedSerialDescriptor.addElement("tpatKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FailedTpat$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer));
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{HttpMethod$$serializer.INSTANCE, nullable, nullable2, intSerializer, intSerializer, nullable3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public FailedTpat deserialize(Decoder decoder) {
        int i10;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        int i11;
        int i12;
        Object objDecodeSerializableElement;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i13 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            i12 = iDecodeIntElement;
            i11 = iDecodeIntElement2;
            i10 = 63;
        } else {
            boolean z10 = true;
            int iDecodeIntElement3 = 0;
            int i14 = 0;
            Object objDecodeSerializableElement2 = null;
            Object objDecodeNullableSerializableElement4 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            int iDecodeIntElement4 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objDecodeSerializableElement2);
                        i14 |= 1;
                        i13 = 5;
                        continue;
                    case 1:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeNullableSerializableElement4);
                        i14 |= 2;
                        i13 = 5;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i14 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i14;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
            i11 = iDecodeIntElement4;
            i12 = iDecodeIntElement3;
            objDecodeSerializableElement = objDecodeSerializableElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new FailedTpat(i10, (HttpMethod) objDecodeSerializableElement, (Map) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, i12, i11, (String) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, FailedTpat failedTpat) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(failedTpat, wHkgq.gYqyaBFfgbmwtq);
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        FailedTpat.write$Self(failedTpat, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
