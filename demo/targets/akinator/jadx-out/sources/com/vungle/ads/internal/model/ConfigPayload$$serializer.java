package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3465td;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.model.ConfigPayload;
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
import kotlinx.serialization.internal.BooleanSerializer;
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
public final class ConfigPayload$$serializer implements GeneratedSerializer<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement(DTBMetricsConfiguration.CONFIG_DIR, true);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement(C3465td.f38951c, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement("ri_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.addElement("auto_redirect", true);
        pluginGeneratedSerialDescriptor.addElement("retry_prioritized_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(ConfigPayload$CleverCache$$serializer.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(ConfigPayload$ConfigSettings$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(ConfigPayload$Endpoints$$serializer.INSTANCE);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(new ArrayListSerializer(Placement$$serializer.INSTANCE));
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(ConfigPayload$UserPrivacy$$serializer.INSTANCE);
        KSerializer<?> nullable7 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer<?> nullable8 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer<?> nullable9 = BuiltinSerializersKt.getNullable(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$AutoRedirect$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConfigPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object obj2;
        Object obj3;
        Object objDecodeNullableSerializableElement3;
        Object obj4;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        int i10;
        Object obj5;
        Object obj6;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, booleanSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, booleanSerializer, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, intSerializer, null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, booleanSerializer, null);
            obj6 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, booleanSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, booleanSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, booleanSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, booleanSerializer, null);
            obj3 = objDecodeNullableSerializableElement15;
            obj = objDecodeNullableSerializableElement20;
            obj4 = objDecodeNullableSerializableElement19;
            obj2 = objDecodeNullableSerializableElement14;
            i10 = 524287;
            obj5 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
        } else {
            boolean z10 = true;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            Object objDecodeNullableSerializableElement36 = null;
            Object objDecodeNullableSerializableElement37 = null;
            int i11 = 0;
            Object objDecodeNullableSerializableElement38 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj7 = objDecodeNullableSerializableElement38;
                        obj8 = objDecodeNullableSerializableElement21;
                        obj9 = objDecodeNullableSerializableElement25;
                        z10 = false;
                        objDecodeNullableSerializableElement25 = obj9;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement21 = obj8;
                    case 0:
                        obj8 = objDecodeNullableSerializableElement21;
                        obj9 = objDecodeNullableSerializableElement25;
                        obj7 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement37 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objDecodeNullableSerializableElement37);
                        i11 |= 1;
                        objDecodeNullableSerializableElement25 = obj9;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement21 = obj8;
                    case 1:
                        obj8 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement38 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement38);
                        i11 |= 2;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement21 = obj8;
                    case 2:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i11 |= 4;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 3:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i11 |= 8;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 4:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), objDecodeNullableSerializableElement);
                        i11 |= 16;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 5:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i11 |= 32;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 6:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i11 |= 64;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 7:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i11 |= 128;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 8:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 9:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i11 |= 512;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 10:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i11 |= 1024;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 11:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i11 |= 2048;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 12:
                        obj10 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i11 |= 4096;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement32 = objDecodeNullableSerializableElement32;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 13:
                        obj10 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i11 |= Segment.SIZE;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 14:
                        obj10 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i11 |= 16384;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 15:
                        obj10 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i11 |= 32768;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement35 = objDecodeNullableSerializableElement35;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 16:
                        obj10 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 17:
                        obj10 = objDecodeNullableSerializableElement38;
                        obj11 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement36);
                        i11 |= 131072;
                        objDecodeNullableSerializableElement25 = obj11;
                        objDecodeNullableSerializableElement38 = obj10;
                    case 18:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i11 |= 262144;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj12 = objDecodeNullableSerializableElement38;
            Object obj13 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement25;
            obj = objDecodeNullableSerializableElement36;
            obj2 = objDecodeNullableSerializableElement37;
            obj3 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement24;
            obj4 = objDecodeNullableSerializableElement35;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement34;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement32;
            objDecodeNullableSerializableElement7 = obj12;
            i10 = i11;
            obj5 = objDecodeNullableSerializableElement31;
            obj6 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement9 = obj13;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement30;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConfigPayload(i10, (ConfigPayload.CleverCache) obj2, (ConfigPayload.ConfigSettings) objDecodeNullableSerializableElement7, (ConfigPayload.Endpoints) objDecodeNullableSerializableElement3, (ConfigPayload.LogMetricsSettings) obj3, (List) objDecodeNullableSerializableElement, (ConfigPayload.UserPrivacy) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement13, (Boolean) objDecodeNullableSerializableElement12, (Boolean) objDecodeNullableSerializableElement11, (Integer) objDecodeNullableSerializableElement10, (Boolean) objDecodeNullableSerializableElement8, (Integer) obj6, (Boolean) obj5, (Boolean) objDecodeNullableSerializableElement6, (Boolean) objDecodeNullableSerializableElement5, (Long) objDecodeNullableSerializableElement4, (ConfigPayload.AutoRedirect) obj4, (Boolean) obj, (Boolean) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConfigPayload value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConfigPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
