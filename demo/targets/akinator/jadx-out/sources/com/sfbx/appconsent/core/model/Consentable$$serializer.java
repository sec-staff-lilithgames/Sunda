package com.sfbx.appconsent.core.model;

import androidx.core.app.NotificationCompat;
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
import kotlinx.serialization.internal.EnumsKt;
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
public final class Consentable$$serializer implements GeneratedSerializer<Consentable> {
    public static final Consentable$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Consentable$$serializer consentable$$serializer = new Consentable$$serializer();
        INSTANCE = consentable$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.Consentable", consentable$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iabId", true);
        pluginGeneratedSerialDescriptor.addElement("extraId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("descriptionLegal", true);
        pluginGeneratedSerialDescriptor.addElement("illustrations", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("bannerType", true);
        pluginGeneratedSerialDescriptor.addElement("vendors", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legIntStatus", true);
        pluginGeneratedSerialDescriptor.addElement("vendorsNumber", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Consentable$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, BuiltinSerializersKt.getNullable(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), ConsentableType.Companion.serializer(), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.BannerType", BannerType.values()), new ArrayListSerializer(Vendor$$serializer.INSTANCE), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Consentable deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objH;
        int i11;
        Object objDecodeSerializableElement3;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        Object objH2;
        Object objDecodeSerializableElement6;
        Object objDecodeSerializableElement7;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, ConsentableType.Companion.serializer(), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.BannerType", BannerType.values()), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(Vendor$$serializer.INSTANCE), null);
            objH2 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 10, null);
            objH = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 11, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, intSerializer, null);
            i10 = 8191;
            i11 = iDecodeIntElement;
        } else {
            boolean z10 = true;
            int i12 = 0;
            int iDecodeIntElement2 = 0;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            Object objDecodeSerializableElement11 = null;
            Object objDecodeSerializableElement12 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeSerializableElement13 = null;
            Object objDecodeSerializableElement14 = null;
            Object objH3 = null;
            Object objH4 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj = objDecodeSerializableElement8;
                        obj2 = objH4;
                        obj3 = objDecodeNullableSerializableElement4;
                        obj4 = objDecodeNullableSerializableElement6;
                        z10 = false;
                        objDecodeSerializableElement8 = obj;
                        objDecodeNullableSerializableElement6 = obj4;
                        objDecodeNullableSerializableElement4 = obj3;
                        objH4 = obj2;
                    case 0:
                        obj = objDecodeSerializableElement8;
                        obj2 = objH4;
                        obj3 = objDecodeNullableSerializableElement4;
                        obj4 = objDecodeNullableSerializableElement6;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i12 |= 1;
                        objDecodeSerializableElement8 = obj;
                        objDecodeNullableSerializableElement6 = obj4;
                        objDecodeNullableSerializableElement4 = obj3;
                        objH4 = obj2;
                    case 1:
                        i12 |= 2;
                        objDecodeSerializableElement8 = objDecodeSerializableElement8;
                        objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement4;
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        objH4 = objH4;
                    case 2:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i12 |= 4;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 3:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeSerializableElement8);
                        i12 |= 8;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 4:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement14 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), objDecodeSerializableElement14);
                        i12 |= 16;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 5:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement12 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), objDecodeSerializableElement12);
                        i12 |= 32;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 6:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement13 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), objDecodeSerializableElement13);
                        i12 |= 64;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 7:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, ConsentableType.Companion.serializer(), objDecodeSerializableElement11);
                        i12 |= 128;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 8:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.BannerType", BannerType.values()), objDecodeSerializableElement10);
                        i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 9:
                        obj5 = objDecodeNullableSerializableElement6;
                        obj2 = objH4;
                        obj6 = objDecodeNullableSerializableElement4;
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(Vendor$$serializer.INSTANCE), objDecodeSerializableElement9);
                        i12 |= 512;
                        objDecodeNullableSerializableElement4 = obj6;
                        objDecodeNullableSerializableElement6 = obj5;
                        objH4 = obj2;
                    case 10:
                        obj7 = objDecodeNullableSerializableElement6;
                        objH3 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 10, objH3);
                        i12 |= 1024;
                        objDecodeNullableSerializableElement6 = obj7;
                    case 11:
                        obj7 = objDecodeNullableSerializableElement6;
                        objH4 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 11, objH4);
                        i12 |= 2048;
                        objDecodeNullableSerializableElement6 = obj7;
                    case 12:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i12 |= 4096;
                        objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement6;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeSerializableElement8;
            Object obj9 = objH4;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement6;
            i10 = i12;
            objDecodeSerializableElement = objDecodeSerializableElement10;
            objDecodeSerializableElement2 = objDecodeSerializableElement13;
            objH = obj9;
            i11 = iDecodeIntElement2;
            objDecodeSerializableElement3 = objDecodeSerializableElement9;
            objDecodeSerializableElement4 = objDecodeSerializableElement11;
            objDecodeSerializableElement5 = objDecodeSerializableElement12;
            objH2 = objH3;
            objDecodeSerializableElement6 = objDecodeSerializableElement14;
            objDecodeSerializableElement7 = obj8;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Consentable(i10, i11, (Integer) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, (Map) objDecodeSerializableElement7, (Map) objDecodeSerializableElement6, (Map) objDecodeSerializableElement5, (Map) objDecodeSerializableElement2, (ConsentableType) objDecodeSerializableElement4, (BannerType) objDecodeSerializableElement, (List) objDecodeSerializableElement3, (ConsentStatus) objH2, (ConsentStatus) objH, (Integer) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Consentable value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Consentable.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
