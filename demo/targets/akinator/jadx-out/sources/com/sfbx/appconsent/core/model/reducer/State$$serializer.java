package com.sfbx.appconsent.core.model.reducer;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class State$$serializer implements GeneratedSerializer<State> {
    public static final State$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        State$$serializer state$$serializer = new State$$serializer();
        INSTANCE = state$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.State", state$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("consents", false);
        pluginGeneratedSerialDescriptor.addElement("vendorlist", true);
        pluginGeneratedSerialDescriptor.addElement("consentstring", true);
        pluginGeneratedSerialDescriptor.addElement("CMP_VERSION", true);
        pluginGeneratedSerialDescriptor.addElement("events", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private State$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ConsentReducer$$serializer.INSTANCE, VendorListReducer$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), IntSerializer.INSTANCE, new ArrayListSerializer(EventReducer$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public State deserialize(Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement2;
        int i11;
        Object objDecodeSerializableElement3;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, ConsentReducer$$serializer.INSTANCE, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, VendorListReducer$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(EventReducer$$serializer.INSTANCE), null);
            i10 = 31;
            i11 = iDecodeIntElement;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeNullableSerializableElement2 = null;
            Object objDecodeSerializableElement6 = null;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, ConsentReducer$$serializer.INSTANCE, objDecodeSerializableElement4);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, VendorListReducer$$serializer.INSTANCE, objDecodeSerializableElement5);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(EventReducer$$serializer.INSTANCE), objDecodeSerializableElement6);
                    i12 |= 16;
                }
            }
            i10 = i12;
            objDecodeSerializableElement = objDecodeSerializableElement5;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            objDecodeSerializableElement2 = objDecodeSerializableElement6;
            i11 = iDecodeIntElement2;
            objDecodeSerializableElement3 = objDecodeSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new State(i10, (ConsentReducer) objDecodeSerializableElement3, (VendorListReducer) objDecodeSerializableElement, (String) objDecodeNullableSerializableElement, i11, (List) objDecodeSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, State value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        State.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
