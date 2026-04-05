package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.I18NString$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class ConsentableReducer$$serializer implements GeneratedSerializer<ConsentableReducer> {
    public static final ConsentableReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConsentableReducer$$serializer consentableReducer$$serializer = new ConsentableReducer$$serializer();
        INSTANCE = consentableReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.ConsentableReducer", consentableReducer$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iab_id", true);
        pluginGeneratedSerialDescriptor.addElement("extra_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("description_legal", false);
        pluginGeneratedSerialDescriptor.addElement("illustrations", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("vendors_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentableReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, nullable2, i18NString$$serializer, i18NString$$serializer, i18NString$$serializer, BuiltinSerializersKt.getNullable(i18NString$$serializer), intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConsentableReducer deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement;
        int i10;
        int i11;
        int i12;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i13 = 10;
        int i14 = 9;
        int i15 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, i18NString$$serializer, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, i18NString$$serializer, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, i18NString$$serializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, i18NString$$serializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 9);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, intSerializer, null);
            i15 = 2047;
            i10 = iDecodeIntElement4;
            i11 = iDecodeIntElement2;
            i12 = iDecodeIntElement3;
        } else {
            boolean z10 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            int iDecodeIntElement7 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                        i14 = 9;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i15 |= 1;
                        i13 = 10;
                        i14 = 9;
                    case 1:
                        i15 |= 2;
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i13 = 10;
                        i14 = 9;
                    case 2:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i15 |= 4;
                        i13 = 10;
                        i14 = 9;
                    case 3:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, I18NString$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i15 |= 8;
                        i13 = 10;
                        i14 = 9;
                    case 4:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, I18NString$$serializer.INSTANCE, objDecodeSerializableElement4);
                        i15 |= 16;
                        i13 = 10;
                        i14 = 9;
                    case 5:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, I18NString$$serializer.INSTANCE, objDecodeSerializableElement5);
                        i15 |= 32;
                        i13 = 10;
                        i14 = 9;
                    case 6:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, I18NString$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i15 |= 64;
                        i13 = 10;
                        i14 = 9;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i15 |= 128;
                    case 8:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i15 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i14);
                        i15 |= 512;
                    case 10:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i13, IntSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i15 |= 1024;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeSerializableElement = objDecodeSerializableElement5;
            i10 = iDecodeIntElement7;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement6;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement8;
        }
        int i16 = iDecodeIntElement;
        int i17 = i15;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConsentableReducer(i17, i16, (Integer) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, (I18NString) objDecodeSerializableElement3, (I18NString) objDecodeSerializableElement2, (I18NString) objDecodeSerializableElement, (I18NString) objDecodeNullableSerializableElement2, i11, i12, i10, (Integer) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConsentableReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConsentableReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
