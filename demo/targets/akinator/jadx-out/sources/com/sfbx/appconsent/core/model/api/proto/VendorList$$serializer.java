package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.model.DataCategoryCore$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
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
public final class VendorList$$serializer implements GeneratedSerializer<VendorList> {
    public static final VendorList$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        VendorList$$serializer vendorList$$serializer = new VendorList$$serializer();
        INSTANCE = vendorList$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.VendorList", vendorList$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("iab_gvl", true);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("data_categories", true);
        pluginGeneratedSerialDescriptor.addElement("vendors", true);
        pluginGeneratedSerialDescriptor.addElement("stacks", true);
        pluginGeneratedSerialDescriptor.addElement("cmp_version", true);
        pluginGeneratedSerialDescriptor.addElement("tcf_policy_version", true);
        pluginGeneratedSerialDescriptor.addElement("publisher_cc", true);
        pluginGeneratedSerialDescriptor.addElement("publisher_restrictions", true);
        pluginGeneratedSerialDescriptor.addElement("geoloc_ad", true);
        pluginGeneratedSerialDescriptor.addElement("geoloc_market", true);
        pluginGeneratedSerialDescriptor.addElement("google_providers", true);
        pluginGeneratedSerialDescriptor.addElement("consent_lifetime", true);
        pluginGeneratedSerialDescriptor.addElement("remove_legintables", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VendorList$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(Consentable$$serializer.INSTANCE);
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(intSerializer, DataCategoryCore$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(Vendor$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer3 = new ArrayListSerializer(Stack$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, arrayListSerializer, linkedHashMapSerializer, arrayListSerializer2, arrayListSerializer3, intSerializer, intSerializer, stringSerializer, stringSerializer, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VendorList deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        int i10;
        int i11;
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement4;
        String str;
        String str2;
        int i12;
        int i13;
        int iDecodeIntElement;
        boolean zDecodeBooleanElement;
        Object objDecodeSerializableElement5;
        Object objDecodeSerializableElement6;
        char c10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i14 = 9;
        int i15 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(Consentable$$serializer.INSTANCE), null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(intSerializer, DataCategoryCore$$serializer.INSTANCE), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(Vendor$$serializer.INSTANCE), null);
            objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(Stack$$serializer.INSTANCE), null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 6);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 7);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 10, new ArrayListSerializer(intSerializer), null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, null);
            i10 = iDecodeIntElement2;
            str = strDecodeStringElement;
            i12 = iDecodeIntElement4;
            i13 = iDecodeIntElement3;
            str2 = strDecodeStringElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            i11 = 16383;
        } else {
            int i16 = 13;
            int i17 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement2 = false;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeNullableSerializableElement2 = null;
            Object objDecodeSerializableElement10 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean z10 = true;
            int iDecodeIntElement8 = 0;
            Object objDecodeSerializableElement11 = null;
            Object objDecodeSerializableElement12 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i16 = 13;
                    case 0:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i17 |= 1;
                        i16 = 13;
                        i14 = 9;
                        i15 = 7;
                    case 1:
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(Consentable$$serializer.INSTANCE), objDecodeSerializableElement7);
                        i17 |= 2;
                        i16 = 13;
                        i14 = 9;
                        i15 = 7;
                    case 2:
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(IntSerializer.INSTANCE, DataCategoryCore$$serializer.INSTANCE), objDecodeSerializableElement8);
                        i17 |= 4;
                        i16 = 13;
                        i14 = 9;
                        i15 = 7;
                    case 3:
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(Vendor$$serializer.INSTANCE), objDecodeSerializableElement11);
                        i17 |= 8;
                        i16 = 13;
                        i14 = 9;
                    case 4:
                        objDecodeSerializableElement12 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(Stack$$serializer.INSTANCE), objDecodeSerializableElement12);
                        i17 |= 16;
                        i16 = 13;
                        i14 = 9;
                    case 5:
                        c10 = 6;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i17 |= 32;
                        i16 = 13;
                    case 6:
                        c10 = 6;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 6);
                        i17 |= 64;
                        i16 = 13;
                    case 7:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i15);
                        i17 |= 128;
                        i16 = 13;
                    case 8:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
                        i17 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        i16 = 13;
                    case 9:
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i14, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement10);
                        i17 |= 512;
                        i16 = 13;
                    case 10:
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 10, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement9);
                        i17 |= 1024;
                        i16 = 13;
                    case 11:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i17 |= 2048;
                        i16 = 13;
                    case 12:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i17 |= 4096;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i16);
                        i17 |= Segment.SIZE;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj = objDecodeSerializableElement8;
            objDecodeSerializableElement = objDecodeSerializableElement11;
            objDecodeSerializableElement2 = objDecodeSerializableElement7;
            objDecodeSerializableElement3 = obj;
            i10 = iDecodeIntElement8;
            i11 = i17;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            objDecodeSerializableElement4 = objDecodeSerializableElement10;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            i12 = iDecodeIntElement5;
            i13 = iDecodeIntElement6;
            iDecodeIntElement = iDecodeIntElement7;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            objDecodeSerializableElement5 = objDecodeSerializableElement9;
            objDecodeSerializableElement6 = objDecodeSerializableElement12;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new VendorList(i11, i10, (List) objDecodeSerializableElement2, (Map) objDecodeSerializableElement3, (List) objDecodeSerializableElement, (List) objDecodeSerializableElement6, i13, i12, str, str2, (List) objDecodeSerializableElement4, (List) objDecodeSerializableElement5, (String) objDecodeNullableSerializableElement, iDecodeIntElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, VendorList value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        VendorList.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
