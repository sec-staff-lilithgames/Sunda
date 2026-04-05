package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class AdPayload$TemplateSettings$$serializer implements GeneratedSerializer<AdPayload.TemplateSettings> {
    public static final AdPayload$TemplateSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$TemplateSettings$$serializer adPayload$TemplateSettings$$serializer = new AdPayload$TemplateSettings$$serializer();
        INSTANCE = adPayload$TemplateSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.TemplateSettings", adPayload$TemplateSettings$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("normal_replacements", true);
        pluginGeneratedSerialDescriptor.addElement("cacheable_replacements", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdPayload$TemplateSettings$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, AdPayload$CacheableReplacement$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdPayload.TemplateSettings deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int i10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(stringSerializer, AdPayload$CacheableReplacement$$serializer.INSTANCE), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement3 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                    objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeNullableSerializableElement);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdPayload$CacheableReplacement$$serializer.INSTANCE), objDecodeNullableSerializableElement3);
                    i11 |= 2;
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement3;
            i10 = i11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AdPayload.TemplateSettings(i10, (Map) objDecodeNullableSerializableElement, (Map) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdPayload.TemplateSettings value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AdPayload.TemplateSettings.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
