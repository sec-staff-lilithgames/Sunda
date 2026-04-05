package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlinx.serialization.internal.DoubleSerializer;
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
public final class VendorReducer$$serializer implements GeneratedSerializer<VendorReducer> {
    public static final VendorReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        VendorReducer$$serializer vendorReducer$$serializer = new VendorReducer$$serializer();
        INSTANCE = vendorReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.VendorReducer", vendorReducer$$serializer, 17);
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
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("cookieMaxAgeSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("usesNonCookieAccess", true);
        pluginGeneratedSerialDescriptor.addElement("google_atp_id", true);
        pluginGeneratedSerialDescriptor.addElement("data_declaration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VendorReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE), DataRetentionReducer$$serializer.INSTANCE, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), new ArrayListSerializer(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VendorReducer deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object objDecodeSerializableElement4;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        Object objDecodeSerializableElement5;
        Object objDecodeSerializableElement6;
        String str3;
        int i15;
        Object obj5;
        String str4;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer, VendorUrl$$serializer.INSTANCE), null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, DataRetentionReducer$$serializer.INSTANCE, null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(intSerializer), null);
            Object objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(intSerializer), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            Object objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, DoubleSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, intSerializer, null);
            obj3 = objDecodeNullableSerializableElement5;
            i10 = 131071;
            i11 = iDecodeIntElement4;
            i12 = iDecodeIntElement2;
            str2 = strDecodeStringElement;
            str = strDecodeStringElement2;
            i13 = iDecodeIntElement3;
            obj = objDecodeNullableSerializableElement2;
            i14 = iDecodeIntElement;
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 16, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement = objDecodeSerializableElement7;
            obj4 = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement6;
            obj2 = objDecodeNullableSerializableElement3;
        } else {
            boolean z10 = true;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            String strDecodeStringElement3 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            objDecodeSerializableElement = null;
            Object objDecodeSerializableElement10 = null;
            objDecodeSerializableElement2 = null;
            String strDecodeStringElement4 = null;
            int i16 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            Object objDecodeSerializableElement11 = null;
            int iDecodeIntElement8 = 0;
            while (z10) {
                int i17 = iDecodeIntElement8;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj5 = objDecodeSerializableElement8;
                        z10 = false;
                        iDecodeIntElement8 = i17;
                        objDecodeSerializableElement8 = obj5;
                    case 0:
                        obj5 = objDecodeSerializableElement8;
                        str4 = strDecodeStringElement3;
                        i16 |= 1;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        strDecodeStringElement3 = str4;
                        objDecodeSerializableElement8 = obj5;
                    case 1:
                        obj5 = objDecodeSerializableElement8;
                        str4 = strDecodeStringElement3;
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i16 |= 2;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str4;
                        objDecodeSerializableElement8 = obj5;
                    case 2:
                        obj5 = objDecodeSerializableElement8;
                        str4 = strDecodeStringElement3;
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i16 |= 4;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str4;
                        objDecodeSerializableElement8 = obj5;
                    case 3:
                        obj5 = objDecodeSerializableElement8;
                        i16 |= 8;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        iDecodeIntElement8 = i17;
                        objDecodeSerializableElement8 = obj5;
                    case 4:
                        obj5 = objDecodeSerializableElement8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i16 |= 16;
                        iDecodeIntElement8 = i17;
                        objDecodeSerializableElement8 = obj5;
                    case 5:
                        str4 = strDecodeStringElement3;
                        obj5 = objDecodeSerializableElement8;
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(StringSerializer.INSTANCE, VendorUrl$$serializer.INSTANCE), objDecodeSerializableElement11);
                        i16 |= 32;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str4;
                        objDecodeSerializableElement8 = obj5;
                    case 6:
                        str3 = strDecodeStringElement3;
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, DataRetentionReducer$$serializer.INSTANCE, objDecodeSerializableElement8);
                        i16 |= 64;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 7:
                        str3 = strDecodeStringElement3;
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement9);
                        i16 |= 128;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 8:
                        str3 = strDecodeStringElement3;
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 9:
                        str3 = strDecodeStringElement3;
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement10);
                        i16 |= 512;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 10:
                        str3 = strDecodeStringElement3;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
                        i16 |= 1024;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 11:
                        str3 = strDecodeStringElement3;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
                        i16 |= 2048;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 12:
                        str3 = strDecodeStringElement3;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i16 |= 4096;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 13:
                        str3 = strDecodeStringElement3;
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, DoubleSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i16 |= Segment.SIZE;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 14:
                        str3 = strDecodeStringElement3;
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i16 |= 16384;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 15:
                        str3 = strDecodeStringElement3;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i15 = 32768;
                        i16 |= i15;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    case 16:
                        str3 = strDecodeStringElement3;
                        objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 16, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement2);
                        i15 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i16 |= i15;
                        iDecodeIntElement8 = i17;
                        strDecodeStringElement3 = str3;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj6 = objDecodeSerializableElement8;
            int i18 = iDecodeIntElement8;
            String str5 = strDecodeStringElement3;
            objDecodeSerializableElement3 = objDecodeSerializableElement9;
            i10 = i16;
            obj = objDecodeNullableSerializableElement7;
            obj2 = objDecodeNullableSerializableElement8;
            obj3 = objDecodeNullableSerializableElement9;
            obj4 = objDecodeNullableSerializableElement10;
            objDecodeSerializableElement4 = objDecodeSerializableElement10;
            str = strDecodeStringElement4;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement6;
            i13 = iDecodeIntElement7;
            i14 = i18;
            str2 = str5;
            objDecodeSerializableElement5 = obj6;
            objDecodeSerializableElement6 = objDecodeSerializableElement11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new VendorReducer(i10, i14, (Integer) obj, (String) obj2, str2, str, (Map) objDecodeSerializableElement6, (DataRetentionReducer) objDecodeSerializableElement5, (List) objDecodeSerializableElement3, (List) objDecodeSerializableElement, (List) objDecodeSerializableElement4, i12, i13, i11, (Double) obj4, (Boolean) obj3, (Integer) objDecodeNullableSerializableElement, (List) objDecodeSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, VendorReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        VendorReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
