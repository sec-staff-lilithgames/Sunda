package com.sfbx.appconsent.core.model.reducer;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
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
public final class ConsentReducer$$serializer implements GeneratedSerializer<ConsentReducer> {
    public static final ConsentReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConsentReducer$$serializer consentReducer$$serializer = new ConsentReducer$$serializer();
        INSTANCE = consentReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.ConsentReducer", consentReducer$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("vendors", true);
        pluginGeneratedSerialDescriptor.addElement("stacks", true);
        pluginGeneratedSerialDescriptor.addElement("uuid", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("dataCategories", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(ConsentableReducer$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(VendorReducer$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer3 = new ArrayListSerializer(StackReducer$$serializer.INSTANCE);
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{arrayListSerializer, arrayListSerializer2, arrayListSerializer3, nullable, BuiltinSerializersKt.getNullable(intSerializer), new LinkedHashMapSerializer(intSerializer, DataCategoryReducer$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConsentReducer deserialize(Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement4;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 5;
        char c10 = 2;
        boolean z10 = true;
        Object objDecodeSerializableElement5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(ConsentableReducer$$serializer.INSTANCE), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(VendorReducer$$serializer.INSTANCE), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(StackReducer$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, intSerializer, null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(intSerializer, DataCategoryReducer$$serializer.INSTANCE), null);
            i10 = 63;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeNullableSerializableElement3 = null;
            Object objDecodeNullableSerializableElement4 = null;
            Object objDecodeSerializableElement8 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i11 = 5;
                    case 0:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(ConsentableReducer$$serializer.INSTANCE), objDecodeSerializableElement5);
                        i12 |= 1;
                        c10 = c10;
                        z10 = z10;
                        i11 = 5;
                    case 1:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(VendorReducer$$serializer.INSTANCE), objDecodeSerializableElement6);
                        i12 |= 2;
                        c10 = c10;
                        z10 = true;
                    case 2:
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(StackReducer$$serializer.INSTANCE), objDecodeSerializableElement7);
                        i12 |= 4;
                        c10 = 2;
                        z10 = true;
                    case 3:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i12 |= 8;
                        c10 = 2;
                        z10 = true;
                    case 4:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i12 |= 16;
                        c10 = 2;
                        z10 = true;
                    case 5:
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i11, new LinkedHashMapSerializer(IntSerializer.INSTANCE, DataCategoryReducer$$serializer.INSTANCE), objDecodeSerializableElement8);
                        i12 |= 32;
                        c10 = 2;
                        z10 = true;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj = objDecodeSerializableElement5;
            i10 = i12;
            objDecodeSerializableElement = obj;
            objDecodeSerializableElement2 = objDecodeSerializableElement6;
            objDecodeSerializableElement3 = objDecodeSerializableElement7;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement3;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
            objDecodeSerializableElement4 = objDecodeSerializableElement8;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConsentReducer(i10, (List) objDecodeSerializableElement, (List) objDecodeSerializableElement2, (List) objDecodeSerializableElement3, (String) objDecodeNullableSerializableElement, (Integer) objDecodeNullableSerializableElement2, (Map) objDecodeSerializableElement4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConsentReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConsentReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
