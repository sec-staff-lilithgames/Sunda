package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.I18NString$$serializer;
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
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class StackReducer$$serializer implements GeneratedSerializer<StackReducer> {
    public static final StackReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        StackReducer$$serializer stackReducer$$serializer = new StackReducer$$serializer();
        INSTANCE = stackReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.StackReducer", stackReducer$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iab_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("vendors_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StackReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(intSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, i18NString$$serializer, i18NString$$serializer, arrayListSerializer, intSerializer, intSerializer, intSerializer, nullable2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StackReducer deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Object objDecodeNullableSerializableElement;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeNullableSerializableElement2;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i14 = 7;
        int i15 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, i18NString$$serializer, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, i18NString$$serializer, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(intSerializer), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 6);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, intSerializer, null);
            i10 = iDecodeIntElement4;
            i11 = iDecodeIntElement3;
            i12 = iDecodeIntElement2;
            i13 = 511;
        } else {
            boolean z10 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int i16 = 0;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement3 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeSerializableElement6 = null;
            int iDecodeIntElement7 = 0;
            Object objDecodeNullableSerializableElement4 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i14 = 7;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                    case 1:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 6;
                    case 2:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, I18NString$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 6;
                    case 3:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, I18NString$$serializer.INSTANCE, objDecodeSerializableElement5);
                        i16 |= 8;
                        i14 = 7;
                        i15 = 6;
                    case 4:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement4);
                        i16 |= 16;
                        i14 = 7;
                        i15 = 6;
                    case 5:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i16 |= 32;
                    case 6:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i15);
                        i16 |= 64;
                    case 7:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i14);
                        i16 |= 128;
                    case 8:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, IntSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement3;
            i10 = iDecodeIntElement7;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement6;
            i13 = i16;
            objDecodeSerializableElement = objDecodeSerializableElement4;
            objDecodeSerializableElement2 = objDecodeSerializableElement5;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
        }
        int i17 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new StackReducer(i13, i17, (Integer) objDecodeNullableSerializableElement2, (I18NString) objDecodeSerializableElement3, (I18NString) objDecodeSerializableElement2, (List) objDecodeSerializableElement, i12, i11, i10, (Integer) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, StackReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        StackReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
