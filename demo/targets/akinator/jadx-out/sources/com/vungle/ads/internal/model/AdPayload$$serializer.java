package com.vungle.ads.internal.model;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.mbridge.msdk.foundation.entity.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class AdPayload$$serializer implements GeneratedSerializer<AdPayload> {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(b.JSON_KEY_ADS, true);
        pluginGeneratedSerialDescriptor.addElement(DTBMetricsConfiguration.CONFIG_DIR, true);
        pluginGeneratedSerialDescriptor.addElement("mraidFiles", true);
        pluginGeneratedSerialDescriptor.addElement("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.addElement("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.addElement("indexFilePath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE));
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(ConfigPayload$$serializer.INSTANCE);
        KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(ConcurrentHashMap.class);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), new LinkedHashMapSerializer(stringSerializer, stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        boolean z10;
        int i10;
        Object objDecodeNullableSerializableElement3;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 5;
        int i12 = 3;
        int i13 = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 4);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            i10 = 63;
            z10 = zDecodeBooleanElement;
        } else {
            boolean z11 = true;
            boolean zDecodeBooleanElement2 = false;
            int i14 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement4 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            while (z11) {
                int i15 = i13;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i13 = i15;
                    case 0:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objDecodeNullableSerializableElement);
                        i14 |= 1;
                        i11 = 5;
                        i13 = i15;
                        i12 = 3;
                    case 1:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i15, ConfigPayload$$serializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i14 |= 2;
                        i13 = i15;
                        i11 = 5;
                        i12 = 3;
                    case 2:
                        KClass orCreateKotlinClass2 = c1.getOrCreateKotlinClass(ConcurrentHashMap.class);
                        KSerializer[] kSerializerArr = new KSerializer[2];
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        kSerializerArr[0] = stringSerializer2;
                        kSerializerArr[i15] = stringSerializer2;
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ContextualSerializer(orCreateKotlinClass2, null, kSerializerArr), objDecodeSerializableElement4);
                        i14 |= 4;
                        i13 = i15;
                        i11 = 5;
                        i12 = 3;
                    case 3:
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i12, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), objDecodeSerializableElement3);
                        i14 |= 8;
                        i13 = i15;
                        i11 = 5;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i14 |= 16;
                        i13 = i15;
                    case 5:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i14 |= 32;
                        i13 = i15;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            z10 = zDecodeBooleanElement2;
            i10 = i14;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AdPayload(i10, (List) objDecodeNullableSerializableElement, (ConfigPayload) objDecodeNullableSerializableElement3, (ConcurrentHashMap) objDecodeSerializableElement2, (Map) objDecodeSerializableElement, z10, (String) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdPayload value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AdPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
