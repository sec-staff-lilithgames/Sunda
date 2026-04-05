package com.sfbx.appconsent.core.model.api.proto;

import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.ConsentStatus;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class Stack$$serializer implements GeneratedSerializer<Stack> {
    public static final Stack$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Stack$$serializer stack$$serializer = new Stack$$serializer();
        INSTANCE = stack$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.Stack", stack$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iab_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("vendors_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Stack$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(intSerializer);
        KSerializer<?> kSerializerCreateSimpleEnumSerializer = EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values());
        KSerializer<?> kSerializerCreateSimpleEnumSerializer2 = EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values());
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, i18NString$$serializer, i18NString$$serializer, arrayListSerializer, kSerializerCreateSimpleEnumSerializer, kSerializerCreateSimpleEnumSerializer2, nullable2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Stack deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Object objDecodeNullableSerializableElement;
        Object objH;
        Object objH2;
        Object objDecodeSerializableElement;
        int i10;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, i18NString$$serializer, null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, i18NString$$serializer, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(intSerializer), null);
            objH2 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 5, null);
            objH = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 6, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, intSerializer, null);
            i10 = 255;
        } else {
            boolean z10 = true;
            iDecodeIntElement = 0;
            Object objDecodeNullableSerializableElement3 = null;
            Object objH3 = null;
            Object objH4 = null;
            Object objDecodeNullableSerializableElement4 = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            int i12 = 0;
            Object objDecodeSerializableElement6 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i12 |= 1;
                        i11 = 7;
                    case 1:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i12 |= 2;
                        i11 = 7;
                    case 2:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, I18NString$$serializer.INSTANCE, objDecodeSerializableElement4);
                        i12 |= 4;
                        i11 = 7;
                    case 3:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, I18NString$$serializer.INSTANCE, objDecodeSerializableElement5);
                        i12 |= 8;
                        i11 = 7;
                    case 4:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement6);
                        i12 |= 16;
                        i11 = 7;
                    case 5:
                        objH4 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 5, objH4);
                        i12 |= 32;
                    case 6:
                        objH3 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 6, objH3);
                        i12 |= 64;
                    case 7:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i12 |= 128;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement3;
            objH = objH3;
            objH2 = objH4;
            objDecodeSerializableElement = objDecodeSerializableElement6;
            i10 = i12;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            objDecodeSerializableElement3 = objDecodeSerializableElement5;
        }
        int i13 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Stack(i10, i13, (Integer) objDecodeNullableSerializableElement2, (I18NString) objDecodeSerializableElement2, (I18NString) objDecodeSerializableElement3, (List) objDecodeSerializableElement, (ConsentStatus) objH2, (ConsentStatus) objH, (Integer) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Stack value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Stack.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
