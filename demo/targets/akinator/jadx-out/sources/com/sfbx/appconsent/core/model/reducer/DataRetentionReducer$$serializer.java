package com.sfbx.appconsent.core.model.reducer;

import hr.kNq.ikJMrW;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final class DataRetentionReducer$$serializer implements GeneratedSerializer<DataRetentionReducer> {
    public static final DataRetentionReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    private DataRetentionReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, new LinkedHashMapSerializer(stringSerializer, intSerializer), new LinkedHashMapSerializer(stringSerializer, intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DataRetentionReducer deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(stringSerializer, intSerializer), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(stringSerializer, intSerializer), null);
            i10 = 7;
        } else {
            boolean z10 = true;
            iDecodeIntElement = 0;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), objDecodeSerializableElement3);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), objDecodeSerializableElement4);
                    i11 |= 4;
                }
            }
            i10 = i11;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
        }
        int i12 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new DataRetentionReducer(i10, i12, (Map) objDecodeSerializableElement, (Map) objDecodeSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DataRetentionReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DataRetentionReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    static {
        DataRetentionReducer$$serializer dataRetentionReducer$$serializer = new DataRetentionReducer$$serializer();
        INSTANCE = dataRetentionReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.DataRetentionReducer", dataRetentionReducer$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("stdRetention", true);
        pluginGeneratedSerialDescriptor.addElement(ikJMrW.DuaP, true);
        pluginGeneratedSerialDescriptor.addElement("specialPurposes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
