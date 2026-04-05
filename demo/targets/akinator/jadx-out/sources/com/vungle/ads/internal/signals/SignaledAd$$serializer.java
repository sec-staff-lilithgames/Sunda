package com.vungle.ads.internal.signals;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class SignaledAd$$serializer implements GeneratedSerializer<SignaledAd> {
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("500", true);
        pluginGeneratedSerialDescriptor.addElement("109", false);
        pluginGeneratedSerialDescriptor.addElement("107", true);
        pluginGeneratedSerialDescriptor.addElement("110", true);
        pluginGeneratedSerialDescriptor.addElement("108", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SignaledAd$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, longSerializer, nullable2, longSerializer, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SignaledAd deserialize(Decoder decoder) {
        long jDecodeLongElement;
        long jDecodeLongElement2;
        int i10;
        Object objDecodeNullableSerializableElement;
        int iDecodeIntElement;
        Object objDecodeNullableSerializableElement2;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
            i10 = 31;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            jDecodeLongElement2 = jDecodeLongElement3;
            jDecodeLongElement = jDecodeLongElement4;
        } else {
            jDecodeLongElement = 0;
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            Object objDecodeNullableSerializableElement3 = null;
            Object objDecodeNullableSerializableElement4 = null;
            jDecodeLongElement2 = 0;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                    i12 |= 4;
                } else if (iDecodeElementIndex == i11) {
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, i11);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                    i12 |= 16;
                }
                i11 = 3;
            }
            i10 = i12;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement3;
            iDecodeIntElement = iDecodeIntElement2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SignaledAd(i10, (String) objDecodeNullableSerializableElement, jDecodeLongElement2, (String) objDecodeNullableSerializableElement2, jDecodeLongElement, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SignaledAd value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SignaledAd.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
