package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.IABConstants;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class MobileTcfStorage$$serializer implements GeneratedSerializer<MobileTcfStorage> {
    public static final MobileTcfStorage$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        MobileTcfStorage$$serializer mobileTcfStorage$$serializer = new MobileTcfStorage$$serializer();
        INSTANCE = mobileTcfStorage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.MobileTcfStorage", mobileTcfStorage$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.CMP_SDK_ID, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.CMP_SDK_VERSION, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.POLICY_VERSION, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PUBLISHER_CC, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PURPOSE_ONE_TREATMENT, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.USE_NON_STANDARD_STACKS, false);
        pluginGeneratedSerialDescriptor.addElement("IABTCF_TCString", false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.VENDOR_CONSENTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.VENDOR_LEGITIMATE_INTERESTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PURPOSE_CONSENTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PURPOSE_LEGITIMATE_INTERESTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.SPECIAL_FEATURE_OPT_INS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PUBLISHER_CONSENT, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PUBLISHER_LEGITIMATE_INTERESTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PUBLISHER_CUSTOM_PURPOSES_CONSENTS, false);
        pluginGeneratedSerialDescriptor.addElement(IABConstants.PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileTcfStorage$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileTcfStorage deserialize(Decoder decoder) {
        int i10;
        int i11;
        String strDecodeStringElement;
        int i12;
        int i13;
        String str;
        String strDecodeStringElement2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i14;
        int i15;
        String str8;
        String str9;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i16 = 2;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 11);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 12);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 13);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 14);
            i12 = iDecodeIntElement3;
            i13 = iDecodeIntElement2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 15);
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement4;
            i14 = iDecodeIntElement5;
            i15 = iDecodeIntElement4;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement11;
            str = strDecodeStringElement3;
            i11 = iDecodeIntElement;
            i10 = 65535;
        } else {
            int i17 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            boolean z10 = true;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            int iDecodeIntElement10 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i16 = 2;
                    case 0:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i17 |= 1;
                        i16 = 2;
                    case 1:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
                        i17 |= 2;
                        i16 = 2;
                    case 2:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i16);
                        i17 |= 4;
                    case 3:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        i17 |= 8;
                    case 4:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i17 |= 16;
                    case 5:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i17 |= 32;
                    case 6:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 6);
                        i17 |= 64;
                    case 7:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 7);
                        i17 |= 128;
                    case 8:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
                        i17 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 9);
                        i17 |= 512;
                    case 10:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 10);
                        i17 |= 1024;
                    case 11:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 11);
                        i17 |= 2048;
                    case 12:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 12);
                        i17 |= 4096;
                    case 13:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 13);
                        i17 |= Segment.SIZE;
                    case 14:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 14);
                        i17 |= 16384;
                    case 15:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 15);
                        i17 |= 32768;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i17;
            i11 = iDecodeIntElement10;
            strDecodeStringElement = strDecodeStringElement12;
            i12 = iDecodeIntElement6;
            i13 = iDecodeIntElement7;
            str = strDecodeStringElement13;
            strDecodeStringElement2 = strDecodeStringElement14;
            str2 = strDecodeStringElement15;
            str3 = strDecodeStringElement16;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            i14 = iDecodeIntElement8;
            i15 = iDecodeIntElement9;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new MobileTcfStorage(i10, i11, i13, i12, str, i15, i14, str7, str6, str8, str5, str4, str3, str2, str9, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, MobileTcfStorage value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        MobileTcfStorage.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
