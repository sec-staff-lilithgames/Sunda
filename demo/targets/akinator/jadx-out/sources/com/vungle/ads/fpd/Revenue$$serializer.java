package com.vungle.ads.fpd;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class Revenue$$serializer implements GeneratedSerializer<Revenue> {
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Revenue", revenue$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("total_earnings_usd", true);
        pluginGeneratedSerialDescriptor.addElement("earnings_by_placement_usd", true);
        pluginGeneratedSerialDescriptor.addElement("top_n_adomain", true);
        pluginGeneratedSerialDescriptor.addElement("is_user_a_purchaser", true);
        pluginGeneratedSerialDescriptor.addElement("is_user_a_subscriber", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_total_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_median_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_mean_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_total_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_median_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_mean_spend_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_user_pltv_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_user_ltv_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_user_pltv_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_user_ltv_usd", true);
        pluginGeneratedSerialDescriptor.addElement("last_7_days_placement_fill_rate", true);
        pluginGeneratedSerialDescriptor.addElement("last_30_days_placement_fill_rate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Revenue$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(new ArrayListSerializer(StringSerializer.INSTANCE));
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Revenue deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object obj;
        int i10;
        Object objDecodeNullableSerializableElement9;
        Object obj2;
        Object obj3;
        Object obj4;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        Object obj5;
        Object obj6;
        Object objDecodeNullableSerializableElement14;
        Object obj7;
        Object obj8;
        Object obj9;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, floatSerializer, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, floatSerializer, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new ArrayListSerializer(StringSerializer.INSTANCE), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, booleanSerializer, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, booleanSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, floatSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, floatSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, floatSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, floatSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, floatSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, floatSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, floatSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, floatSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, floatSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, floatSerializer, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, floatSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, floatSerializer, null);
            i10 = 131071;
            obj3 = objDecodeNullableSerializableElement18;
            obj = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
            obj4 = objDecodeNullableSerializableElement19;
            obj2 = objDecodeNullableSerializableElement17;
        } else {
            boolean z10 = true;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object obj10 = null;
            int i11 = 0;
            Object objDecodeNullableSerializableElement34 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj5 = objDecodeNullableSerializableElement34;
                        obj6 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement14 = obj10;
                        obj7 = objDecodeNullableSerializableElement20;
                        z10 = false;
                        objDecodeNullableSerializableElement22 = obj6;
                        objDecodeNullableSerializableElement20 = obj7;
                        obj10 = objDecodeNullableSerializableElement14;
                        objDecodeNullableSerializableElement34 = obj5;
                    case 0:
                        obj5 = objDecodeNullableSerializableElement34;
                        obj6 = objDecodeNullableSerializableElement22;
                        Object obj11 = obj10;
                        obj7 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, FloatSerializer.INSTANCE, obj11);
                        i11 |= 1;
                        objDecodeNullableSerializableElement22 = obj6;
                        objDecodeNullableSerializableElement20 = obj7;
                        obj10 = objDecodeNullableSerializableElement14;
                        objDecodeNullableSerializableElement34 = obj5;
                    case 1:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i11 |= 2;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                    case 2:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new ArrayListSerializer(StringSerializer.INSTANCE), objDecodeNullableSerializableElement34);
                        i11 |= 4;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 3:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i11 |= 8;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 4:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i11 |= 16;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 5:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i11 |= 32;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 6:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i11 |= 64;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 7:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i11 |= 128;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 8:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 9:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i11 |= 512;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 10:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i11 |= 1024;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 11:
                        obj8 = objDecodeNullableSerializableElement22;
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i11 |= 2048;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 12:
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i11 |= 4096;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement = obj9;
                    case 13:
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i11 |= Segment.SIZE;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement32 = objDecodeNullableSerializableElement32;
                        objDecodeNullableSerializableElement = obj9;
                    case 14:
                        obj9 = objDecodeNullableSerializableElement;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i11 |= 16384;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement = obj9;
                    case 15:
                        obj9 = objDecodeNullableSerializableElement;
                        obj8 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i11 |= 32768;
                        objDecodeNullableSerializableElement22 = obj8;
                        objDecodeNullableSerializableElement = obj9;
                    case 16:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        objDecodeNullableSerializableElement = objDecodeNullableSerializableElement;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj12 = objDecodeNullableSerializableElement34;
            Object obj13 = obj10;
            Object obj14 = objDecodeNullableSerializableElement20;
            Object obj15 = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement8 = obj15;
            obj = obj13;
            i10 = i11;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement22;
            obj2 = obj12;
            obj3 = objDecodeNullableSerializableElement21;
            obj4 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement32;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement31;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement13 = obj14;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Revenue(i10, (Float) obj, (Float) objDecodeNullableSerializableElement, (List) obj2, (Boolean) obj3, (Boolean) objDecodeNullableSerializableElement13, (Float) objDecodeNullableSerializableElement5, (Float) objDecodeNullableSerializableElement7, (Float) objDecodeNullableSerializableElement4, (Float) objDecodeNullableSerializableElement6, (Float) objDecodeNullableSerializableElement3, (Float) objDecodeNullableSerializableElement8, (Float) objDecodeNullableSerializableElement2, (Float) objDecodeNullableSerializableElement12, (Float) objDecodeNullableSerializableElement11, (Float) objDecodeNullableSerializableElement10, (Float) obj4, (Float) objDecodeNullableSerializableElement9, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Revenue value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Revenue.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
