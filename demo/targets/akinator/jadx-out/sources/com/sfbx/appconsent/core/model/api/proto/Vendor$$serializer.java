package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsent.core.model.ConsentStatus;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.Vendor", vendor$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iab_id", true);
        pluginGeneratedSerialDescriptor.addElement("extra_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("policy_url", false);
        pluginGeneratedSerialDescriptor.addElement("urls", true);
        pluginGeneratedSerialDescriptor.addElement("dataRetention", true);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("legintables", true);
        pluginGeneratedSerialDescriptor.addElement("flexibles", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("cookieMaxAgeSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("usesNonCookieAccess", true);
        pluginGeneratedSerialDescriptor.addElement("google_atp_id", true);
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
        return new KSerializer[]{intSerializer, nullable, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE), DataRetention$$serializer.INSTANCE, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), new ArrayListSerializer(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Vendor deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        Object obj;
        int i10;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        String str;
        Object objDecodeSerializableElement2;
        int i11;
        String str2;
        Object obj2;
        Object objDecodeSerializableElement3;
        Object objH;
        Object objDecodeSerializableElement4;
        Object objDecodeNullableSerializableElement4;
        Object obj3;
        Object objDecodeSerializableElement5;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            Object objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, DataRetention$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(intSerializer), null);
            objH = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 10, null);
            Object objH2 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 11, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, intSerializer, null);
            obj2 = objDecodeNullableSerializableElement5;
            i10 = 65535;
            obj = objDecodeSerializableElement6;
            str2 = strDecodeStringElement;
            str = strDecodeStringElement2;
            i11 = iDecodeIntElement;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 15, new ArrayListSerializer(intSerializer), null);
            obj3 = objH2;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objH3 = null;
            Object objH4 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Object objDecodeNullableSerializableElement10 = null;
            int i12 = 0;
            Object objDecodeSerializableElement11 = null;
            while (z10) {
                Object obj9 = objDecodeNullableSerializableElement7;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj6 = objDecodeSerializableElement7;
                        obj7 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement7 = obj9;
                        z10 = false;
                        objDecodeSerializableElement7 = obj6;
                        objDecodeSerializableElement11 = obj7;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 0:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj6 = objDecodeSerializableElement7;
                        obj7 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement7 = obj9;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i12 |= 1;
                        objDecodeSerializableElement7 = obj6;
                        objDecodeSerializableElement11 = obj7;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 1:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj7 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement7 = obj9;
                        obj6 = objDecodeSerializableElement7;
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i12 |= 2;
                        objDecodeSerializableElement7 = obj6;
                        objDecodeSerializableElement11 = obj7;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 2:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj7 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj9);
                        i12 |= 4;
                        objDecodeSerializableElement11 = obj7;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 3:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj8 = objDecodeSerializableElement11;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        i12 |= 8;
                        objDecodeSerializableElement11 = obj8;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 4:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj8 = objDecodeSerializableElement11;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i12 |= 16;
                        objDecodeSerializableElement11 = obj8;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 5:
                        obj5 = objDecodeNullableSerializableElement6;
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(StringSerializer.INSTANCE, VendorUrl$$serializer.INSTANCE), objDecodeSerializableElement11);
                        i12 |= 32;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeNullableSerializableElement6 = obj5;
                    case 6:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, DataRetention$$serializer.INSTANCE, objDecodeSerializableElement8);
                        i12 |= 64;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 7:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement7);
                        i12 |= 128;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 8:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement9);
                        i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 9:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement10);
                        i12 |= 512;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 10:
                        obj4 = objDecodeSerializableElement11;
                        objH4 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 10, objH4);
                        i12 |= 1024;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 11:
                        obj4 = objDecodeSerializableElement11;
                        objH3 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 11, objH3);
                        i12 |= 2048;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 12:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, LongSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i12 |= 4096;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 13:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i12 |= Segment.SIZE;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 14:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, IntSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i12 |= 16384;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    case 15:
                        obj4 = objDecodeSerializableElement11;
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 15, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement);
                        i12 |= 32768;
                        objDecodeNullableSerializableElement7 = obj9;
                        objDecodeSerializableElement11 = obj4;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj10 = objDecodeSerializableElement7;
            obj = objDecodeSerializableElement11;
            i10 = i12;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement9;
            str = strDecodeStringElement3;
            objDecodeSerializableElement2 = obj10;
            i11 = iDecodeIntElement2;
            str2 = strDecodeStringElement4;
            obj2 = objDecodeNullableSerializableElement6;
            objDecodeSerializableElement3 = objDecodeSerializableElement8;
            objH = objH4;
            objDecodeSerializableElement4 = objDecodeSerializableElement10;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            obj3 = objH3;
            objDecodeSerializableElement5 = objDecodeSerializableElement9;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Vendor(i10, i11, (Integer) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement, str2, str, (Map) obj, (DataRetention) objDecodeSerializableElement3, (List) objDecodeSerializableElement2, (List) objDecodeSerializableElement5, (List) objDecodeSerializableElement4, (ConsentStatus) objH, (ConsentStatus) obj3, (Long) objDecodeNullableSerializableElement2, (Boolean) obj2, (Integer) objDecodeNullableSerializableElement3, (List) objDecodeSerializableElement, (SerializationConstructorMarker) null);
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
