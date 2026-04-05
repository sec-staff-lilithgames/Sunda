package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3284j8;
import hr.kNq.ikJMrW;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final class Configuration$$serializer implements GeneratedSerializer<Configuration> {
    public static final Configuration$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    private Configuration$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(intSerializer);
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer, I18NString$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, arrayListSerializer, linkedHashMapSerializer, booleanSerializer, intSerializer, booleanSerializer, booleanSerializer, new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, intSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, booleanSerializer), booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Configuration deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        boolean zDecodeBooleanElement;
        String str;
        Object obj;
        Object objDecodeSerializableElement2;
        int i10;
        Object objDecodeSerializableElement3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        int i12;
        char c10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i13 = 7;
        int i14 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(intSerializer), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(stringSerializer, I18NString$$serializer.INSTANCE), null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 5);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 6);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new LinkedHashMapSerializer(stringSerializer, intSerializer), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 10, new LinkedHashMapSerializer(stringSerializer, BooleanSerializer.INSTANCE), null);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 11);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 12);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            str = strDecodeStringElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 14);
            z10 = zDecodeBooleanElement5;
            z11 = zDecodeBooleanElement2;
            z12 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement3;
            i11 = iDecodeIntElement;
            z14 = zDecodeBooleanElement6;
            z15 = zDecodeBooleanElement7;
            obj = objDecodeSerializableElement6;
            i10 = 32767;
        } else {
            int i15 = 14;
            int i16 = 0;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean z16 = true;
            Object objDecodeSerializableElement7 = null;
            String strDecodeStringElement2 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            Object objDecodeSerializableElement11 = null;
            boolean zDecodeBooleanElement14 = false;
            Object objDecodeSerializableElement12 = null;
            while (z16) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        i15 = 14;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i16 |= 1;
                        i15 = 14;
                        i13 = 7;
                        i14 = 6;
                    case 1:
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement8);
                        i16 |= 2;
                        i15 = 14;
                        i13 = 7;
                        i14 = 6;
                    case 2:
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new LinkedHashMapSerializer(StringSerializer.INSTANCE, I18NString$$serializer.INSTANCE), objDecodeSerializableElement9);
                        i16 |= 4;
                        i15 = 14;
                        i13 = 7;
                        i14 = 6;
                    case 3:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i16 |= 8;
                        i15 = 14;
                        i14 = 6;
                    case 4:
                        i12 = i14;
                        c10 = 5;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i16 |= 16;
                        i14 = i12;
                        i15 = 14;
                    case 5:
                        i12 = i14;
                        c10 = 5;
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i16 |= 32;
                        i14 = i12;
                        i15 = 14;
                    case 6:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i14);
                        i16 |= 64;
                        i15 = 14;
                    case 7:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement12 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i13, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeSerializableElement12);
                        i16 |= 128;
                        i15 = 14;
                        i14 = 6;
                    case 8:
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 8, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), objDecodeSerializableElement7);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        i15 = 14;
                        i14 = 6;
                    case 9:
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), objDecodeSerializableElement11);
                        i16 |= 512;
                        i15 = 14;
                        i14 = 6;
                    case 10:
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 10, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), objDecodeSerializableElement10);
                        i16 |= 1024;
                        i15 = 14;
                        i14 = 6;
                    case 11:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 11);
                        i16 |= 2048;
                        i15 = 14;
                    case 12:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 12);
                        i16 |= 4096;
                        i15 = 14;
                    case 13:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
                        i16 |= Segment.SIZE;
                    case 14:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i15);
                        i16 |= 16384;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeSerializableElement = objDecodeSerializableElement12;
            zDecodeBooleanElement = zDecodeBooleanElement14;
            str = strDecodeStringElement2;
            obj = objDecodeSerializableElement9;
            objDecodeSerializableElement2 = objDecodeSerializableElement10;
            i10 = i16;
            objDecodeSerializableElement3 = objDecodeSerializableElement11;
            z10 = zDecodeBooleanElement8;
            z11 = zDecodeBooleanElement9;
            z12 = zDecodeBooleanElement10;
            z13 = zDecodeBooleanElement11;
            i11 = iDecodeIntElement2;
            z14 = zDecodeBooleanElement12;
            z15 = zDecodeBooleanElement13;
            objDecodeSerializableElement4 = objDecodeSerializableElement7;
            objDecodeSerializableElement5 = objDecodeSerializableElement8;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Configuration(i10, str, (List) objDecodeSerializableElement5, (Map) obj, z11, i11, z13, z12, (Map) objDecodeSerializableElement, (Map) objDecodeSerializableElement4, (Map) objDecodeSerializableElement3, (Map) objDecodeSerializableElement2, z10, z14, z15, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Configuration value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Configuration.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    static {
        Configuration$$serializer configuration$$serializer = new Configuration$$serializer();
        INSTANCE = configuration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.Configuration", configuration$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("fallback_language", true);
        pluginGeneratedSerialDescriptor.addElement("xchange_vendors", true);
        pluginGeneratedSerialDescriptor.addElement("texts", true);
        pluginGeneratedSerialDescriptor.addElement(ikJMrW.fDheeVN, true);
        pluginGeneratedSerialDescriptor.addElement("ctaLayout", true);
        pluginGeneratedSerialDescriptor.addElement("highlightAcceptAllButton", true);
        pluginGeneratedSerialDescriptor.addElement("useSuccessScreen", true);
        pluginGeneratedSerialDescriptor.addElement("images", true);
        pluginGeneratedSerialDescriptor.addElement("actions", true);
        pluginGeneratedSerialDescriptor.addElement("colors", true);
        pluginGeneratedSerialDescriptor.addElement(C3284j8.f37015p, true);
        pluginGeneratedSerialDescriptor.addElement("enableLegintOnRefuseAll", true);
        pluginGeneratedSerialDescriptor.addElement("continueWithoutAccepting", true);
        pluginGeneratedSerialDescriptor.addElement("enableIllustrations", true);
        pluginGeneratedSerialDescriptor.addElement("not_banner_display_purposes_list", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
