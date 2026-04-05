package com.vungle.ads.internal.signals;

import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class SessionData$$serializer implements GeneratedSerializer<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SignaledAd$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, StringSerializer.INSTANCE, longSerializer, arrayListSerializer, longSerializer, intSerializer, arrayListSerializer2, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SessionData deserialize(Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        int iDecodeIntElement;
        int i11;
        int i12;
        int i13;
        int i14;
        int iDecodeIntElement2;
        long j10;
        String str;
        long j11;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i15 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 9);
            i15 = 4095;
            i10 = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
            i11 = iDecodeIntElement7;
            i12 = iDecodeIntElement5;
            i13 = iDecodeIntElement6;
            i14 = iDecodeIntElement4;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
            j10 = jDecodeLongElement2;
            str = strDecodeStringElement;
            j11 = jDecodeLongElement;
        } else {
            int i16 = 11;
            boolean z10 = true;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i16 = 11;
                    case 0:
                        i15 |= 1;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i16 = 11;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i15 |= 2;
                        i16 = 11;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
                        i15 |= 4;
                        i16 = 11;
                    case 3:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), objDecodeSerializableElement4);
                        i15 |= 8;
                        i16 = 11;
                    case 4:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
                        i15 |= 16;
                        i16 = 11;
                    case 5:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i15 |= 32;
                        i16 = 11;
                    case 6:
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), objDecodeSerializableElement3);
                        i15 |= 64;
                        i16 = 11;
                    case 7:
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i15 |= 128;
                    case 8:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i15 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 9);
                        i15 |= 512;
                    case 10:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
                        i15 |= 1024;
                    case 11:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i16);
                        i15 |= 2048;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = iDecodeIntElement8;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            iDecodeIntElement = iDecodeIntElement12;
            i11 = iDecodeIntElement13;
            i12 = iDecodeIntElement14;
            i13 = iDecodeIntElement9;
            i14 = iDecodeIntElement10;
            iDecodeIntElement2 = iDecodeIntElement11;
            j10 = jDecodeLongElement3;
            str = strDecodeStringElement2;
            j11 = jDecodeLongElement4;
        }
        int i17 = i15;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SessionData(i17, i10, str, j11, (List) objDecodeSerializableElement2, j10, i14, (List) objDecodeSerializableElement, i12, i13, i11, iDecodeIntElement, iDecodeIntElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SessionData value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SessionData.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_NOT_FOUND, true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement("102", true);
        pluginGeneratedSerialDescriptor.addElement("104", true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        pluginGeneratedSerialDescriptor.addElement("112", true);
        pluginGeneratedSerialDescriptor.addElement("113", true);
        pluginGeneratedSerialDescriptor.addElement(SUvoXnn.JEbjOOXo, true);
        pluginGeneratedSerialDescriptor.addElement("115", true);
        pluginGeneratedSerialDescriptor.addElement("116", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
