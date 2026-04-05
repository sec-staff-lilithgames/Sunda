package com.sfbx.appconsent.core.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.play_billing.a;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class Vendor$$serializer implements GeneratedSerializer<Vendor> {
    public static final Vendor$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Vendor$$serializer vendor$$serializer = new Vendor$$serializer();
        INSTANCE = vendor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.Vendor", vendor$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iabId", true);
        pluginGeneratedSerialDescriptor.addElement("extraId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("policyUrl", true);
        pluginGeneratedSerialDescriptor.addElement("dataRetention", true);
        pluginGeneratedSerialDescriptor.addElement("urls", true);
        pluginGeneratedSerialDescriptor.addElement("isLegVendor", true);
        pluginGeneratedSerialDescriptor.addElement("isExtraVendor", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legIntStatus", true);
        pluginGeneratedSerialDescriptor.addElement("cookieMaxAgeSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("usesNonCookieAccess", true);
        pluginGeneratedSerialDescriptor.addElement("googleAtpId", true);
        pluginGeneratedSerialDescriptor.addElement("data_declaration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Vendor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, nullable2, stringSerializer, stringSerializer, DataRetentionCore$$serializer.INSTANCE, linkedHashMapSerializer, booleanSerializer, booleanSerializer, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), new ArrayListSerializer(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Vendor deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeNullableSerializableElement;
        int i10;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object objH;
        Object obj2;
        Object objH2;
        String str;
        boolean z10;
        boolean z11;
        int i11;
        String str2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeSerializableElement3;
        String str3;
        String str4;
        String str5;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String str6 = "com.sfbx.appconsent.core.model.ConsentStatus";
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, DataRetentionCore$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 7);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 8);
            objH2 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 9, null);
            objH = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 10, null);
            Object objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, intSerializer, null);
            obj = objDecodeNullableSerializableElement5;
            i10 = 32767;
            z10 = zDecodeBooleanElement;
            z11 = zDecodeBooleanElement2;
            str2 = strDecodeStringElement;
            str = strDecodeStringElement2;
            i11 = iDecodeIntElement;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 14, new ArrayListSerializer(intSerializer), null);
            obj2 = objDecodeNullableSerializableElement4;
        } else {
            boolean z12 = true;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objH3 = null;
            String strDecodeStringElement3 = null;
            Object objDecodeNullableSerializableElement10 = null;
            Object objH4 = null;
            String strDecodeStringElement4 = null;
            int i12 = 0;
            Object objDecodeSerializableElement5 = null;
            while (true) {
                int i13 = iDecodeIntElement2;
                if (z12) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z12 = false;
                            iDecodeIntElement2 = i13;
                        case 0:
                            str4 = str6;
                            str5 = strDecodeStringElement3;
                            i12 |= 1;
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 1:
                            str4 = str6;
                            str5 = strDecodeStringElement3;
                            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                            i12 |= 2;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 2:
                            str4 = str6;
                            str5 = strDecodeStringElement3;
                            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                            i12 |= 4;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 3:
                            str4 = str6;
                            i12 |= 8;
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                            iDecodeIntElement2 = i13;
                            str6 = str4;
                        case 4:
                            str4 = str6;
                            str5 = strDecodeStringElement3;
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                            i12 |= 16;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 5:
                            str4 = str6;
                            str5 = strDecodeStringElement3;
                            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, DataRetentionCore$$serializer.INSTANCE, objDecodeSerializableElement5);
                            i12 |= 32;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 6:
                            str5 = strDecodeStringElement3;
                            str4 = str6;
                            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new LinkedHashMapSerializer(StringSerializer.INSTANCE, VendorUrl$$serializer.INSTANCE), objDecodeSerializableElement4);
                            i12 |= 64;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str5;
                            str6 = str4;
                        case 7:
                            str3 = strDecodeStringElement3;
                            zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 7);
                            i12 |= 128;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 8:
                            str3 = strDecodeStringElement3;
                            zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 8);
                            i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 9:
                            str3 = strDecodeStringElement3;
                            objH4 = a.h(str6, compositeDecoderBeginStructure, descriptor2, 9, objH4);
                            i12 |= 512;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 10:
                            str3 = strDecodeStringElement3;
                            objH3 = a.h(str6, compositeDecoderBeginStructure, descriptor2, 10, objH3);
                            i12 |= 1024;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 11:
                            str3 = strDecodeStringElement3;
                            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, LongSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                            i12 |= 2048;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 12:
                            str3 = strDecodeStringElement3;
                            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                            i12 |= 4096;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 13:
                            str3 = strDecodeStringElement3;
                            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, IntSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                            i12 |= Segment.SIZE;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        case 14:
                            str3 = strDecodeStringElement3;
                            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 14, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement);
                            i12 |= 16384;
                            iDecodeIntElement2 = i13;
                            strDecodeStringElement3 = str3;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    String str7 = strDecodeStringElement3;
                    Object obj3 = objDecodeNullableSerializableElement6;
                    objDecodeSerializableElement2 = objDecodeSerializableElement4;
                    objDecodeNullableSerializableElement = obj3;
                    i10 = i12;
                    objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
                    obj = objDecodeNullableSerializableElement9;
                    objH = objH3;
                    obj2 = objDecodeNullableSerializableElement10;
                    objH2 = objH4;
                    str = strDecodeStringElement4;
                    z10 = zDecodeBooleanElement3;
                    z11 = zDecodeBooleanElement4;
                    i11 = i13;
                    str2 = str7;
                    objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
                    objDecodeSerializableElement3 = objDecodeSerializableElement5;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Vendor(i10, i11, (Integer) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement3, str2, str, (DataRetentionCore) objDecodeSerializableElement3, (Map) objDecodeSerializableElement2, z10, z11, (ConsentStatus) objH2, (ConsentStatus) objH, (Long) obj2, (Boolean) obj, (Integer) objDecodeNullableSerializableElement2, (List) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Vendor value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Vendor.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
