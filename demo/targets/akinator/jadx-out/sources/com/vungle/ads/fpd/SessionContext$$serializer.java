package com.vungle.ads.fpd;

import androidx.core.app.NotificationCompat;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class SessionContext$$serializer implements GeneratedSerializer<SessionContext> {
    public static final SessionContext$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SessionContext$$serializer sessionContext$$serializer = new SessionContext$$serializer();
        INSTANCE = sessionContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.SessionContext", sessionContext$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("level_percentile", true);
        pluginGeneratedSerialDescriptor.addElement("page", true);
        pluginGeneratedSerialDescriptor.addElement("time_spent", true);
        pluginGeneratedSerialDescriptor.addElement("signup_date", true);
        pluginGeneratedSerialDescriptor.addElement("user_score_percentile", true);
        pluginGeneratedSerialDescriptor.addElement("user_id", true);
        pluginGeneratedSerialDescriptor.addElement("friends", true);
        pluginGeneratedSerialDescriptor.addElement("user_level_percentile", true);
        pluginGeneratedSerialDescriptor.addElement("health_percentile", true);
        pluginGeneratedSerialDescriptor.addElement("session_start_time", true);
        pluginGeneratedSerialDescriptor.addElement("session_duration", true);
        pluginGeneratedSerialDescriptor.addElement("in_game_purchases_usd", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionContext$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(floatSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SessionContext deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object obj;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        int i10;
        Object obj2;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, floatSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, intSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, intSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, floatSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new ArrayListSerializer(stringSerializer), null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, floatSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, floatSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, intSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, floatSerializer, null);
            i10 = 4095;
            obj = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement14;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement23 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = i11;
                    case 0:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i11 |= 1;
                    case 1:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i11 |= 2;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 2:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i11 |= 4;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 3:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, IntSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i11 |= 8;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 4:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i11 |= 16;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 5:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i11 |= 32;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 6:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new ArrayListSerializer(StringSerializer.INSTANCE), objDecodeNullableSerializableElement19);
                        i11 |= 64;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 7:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i11 |= 128;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 8:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 9:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i11 |= 512;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 10:
                        obj2 = objDecodeNullableSerializableElement12;
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, IntSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i11 |= 1024;
                        objDecodeNullableSerializableElement12 = obj2;
                    case 11:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i11 |= 2048;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            int i12 = i11;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
            obj = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement21;
            i10 = i12;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SessionContext(i10, (Float) objDecodeNullableSerializableElement6, (String) obj, (Integer) objDecodeNullableSerializableElement10, (Integer) objDecodeNullableSerializableElement5, (Float) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement9, (List) objDecodeNullableSerializableElement3, (Float) objDecodeNullableSerializableElement11, (Float) objDecodeNullableSerializableElement8, (Integer) objDecodeNullableSerializableElement, (Integer) objDecodeNullableSerializableElement7, (Float) objDecodeNullableSerializableElement4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SessionContext value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SessionContext.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
