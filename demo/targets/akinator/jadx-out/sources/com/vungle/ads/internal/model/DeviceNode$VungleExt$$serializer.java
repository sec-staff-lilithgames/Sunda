package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbDeviceData;
import com.applovin.shadow.okio.Segment;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.model.DeviceNode;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class DeviceNode$VungleExt$$serializer implements GeneratedSerializer<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(Q6.U0, true);
        pluginGeneratedSerialDescriptor.addElement("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.addElement("sit", true);
        pluginGeneratedSerialDescriptor.addElement("oit", true);
        pluginGeneratedSerialDescriptor.addElement("ort", true);
        pluginGeneratedSerialDescriptor.addElement("obt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable10 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable11 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable12 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable13 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable14 = BuiltinSerializersKt.getNullable(longSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, nullable, nullable2, floatSerializer, nullable3, intSerializer, nullable4, nullable5, nullable6, nullable7, nullable8, floatSerializer, intSerializer, booleanSerializer, intSerializer, booleanSerializer, nullable9, nullable10, nullable11, nullable12, nullable13, nullable14};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DeviceNode.VungleExt deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object obj2;
        Object objDecodeNullableSerializableElement3;
        int i10;
        Object objDecodeNullableSerializableElement4;
        Object obj3;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        boolean z10;
        float f10;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        float f11;
        Object objDecodeNullableSerializableElement11;
        Object obj4;
        int i14;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i15 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
            obj = objDecodeNullableSerializableElement12;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            obj3 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, longSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, longSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, longSerializer, null);
            f10 = fDecodeFloatElement;
            i10 = 4194303;
            i11 = iDecodeIntElement2;
            i13 = iDecodeIntElement;
            f11 = fDecodeFloatElement2;
            z10 = zDecodeBooleanElement3;
            i12 = iDecodeIntElement3;
            z12 = zDecodeBooleanElement2;
            z11 = zDecodeBooleanElement;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, longSerializer, null);
            obj2 = objDecodeNullableSerializableElement13;
        } else {
            objDecodeNullableSerializableElement = null;
            boolean z13 = true;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            float fDecodeFloatElement3 = 0.0f;
            float fDecodeFloatElement4 = 0.0f;
            Object objDecodeNullableSerializableElement27 = null;
            while (z13) {
                Object obj10 = objDecodeNullableSerializableElement16;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj5 = objDecodeNullableSerializableElement18;
                        obj6 = objDecodeNullableSerializableElement26;
                        z13 = false;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement26 = obj6;
                        objDecodeNullableSerializableElement18 = obj5;
                    case 0:
                        obj5 = objDecodeNullableSerializableElement18;
                        obj6 = objDecodeNullableSerializableElement26;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i15 |= 1;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement26 = obj6;
                        objDecodeNullableSerializableElement18 = obj5;
                    case 1:
                        obj7 = objDecodeNullableSerializableElement17;
                        obj8 = objDecodeNullableSerializableElement18;
                        i15 |= 2;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement18 = obj8;
                        objDecodeNullableSerializableElement17 = obj7;
                    case 2:
                        obj7 = objDecodeNullableSerializableElement17;
                        obj8 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, obj10);
                        i15 |= 4;
                        objDecodeNullableSerializableElement18 = obj8;
                        objDecodeNullableSerializableElement17 = obj7;
                    case 3:
                        obj9 = objDecodeNullableSerializableElement17;
                        fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i15 |= 8;
                        objDecodeNullableSerializableElement17 = obj9;
                        objDecodeNullableSerializableElement16 = obj10;
                    case 4:
                        obj9 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i15 |= 16;
                        objDecodeNullableSerializableElement17 = obj9;
                        objDecodeNullableSerializableElement16 = obj10;
                    case 5:
                        obj4 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i15 |= 32;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 6:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i15 |= 64;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 7:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i15 |= 128;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 8:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i15 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 9:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i15 |= 512;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 10:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i15 |= 1024;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 11:
                        obj4 = objDecodeNullableSerializableElement20;
                        fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
                        i15 |= 2048;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 12:
                        obj4 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i15 |= 4096;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 13:
                        obj4 = objDecodeNullableSerializableElement20;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
                        i15 |= Segment.SIZE;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 14:
                        obj4 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
                        i15 |= 16384;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 15:
                        obj4 = objDecodeNullableSerializableElement20;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
                        i15 |= 32768;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 16:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i14 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 17:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i14 = 131072;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 18:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i14 = 262144;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 19:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i14 = 524288;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 20:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i14 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    case 21:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i14 = 2097152;
                        i15 |= i14;
                        objDecodeNullableSerializableElement16 = obj10;
                        objDecodeNullableSerializableElement20 = obj4;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj11 = objDecodeNullableSerializableElement18;
            Object obj12 = objDecodeNullableSerializableElement26;
            Object obj13 = objDecodeNullableSerializableElement16;
            obj = obj12;
            obj2 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement20;
            i10 = i15;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement21;
            obj3 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement25;
            z10 = zDecodeBooleanElement4;
            f10 = fDecodeFloatElement3;
            objDecodeNullableSerializableElement8 = obj13;
            objDecodeNullableSerializableElement9 = obj11;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement17;
            i11 = iDecodeIntElement4;
            z11 = zDecodeBooleanElement5;
            z12 = zDecodeBooleanElement6;
            i12 = iDecodeIntElement5;
            i13 = iDecodeIntElement6;
            f11 = fDecodeFloatElement4;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement27;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new DeviceNode.VungleExt(i10, z11, (String) obj, (Integer) objDecodeNullableSerializableElement8, f10, (String) objDecodeNullableSerializableElement3, i13, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, f11, i11, z12, i12, z10, (String) obj2, (String) obj3, (Long) objDecodeNullableSerializableElement4, (Long) objDecodeNullableSerializableElement, (Long) objDecodeNullableSerializableElement11, (Long) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DeviceNode.VungleExt value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DeviceNode.VungleExt.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
