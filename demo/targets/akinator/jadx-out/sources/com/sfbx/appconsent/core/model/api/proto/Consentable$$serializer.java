package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.sfbx.appconsent.core.model.ConsentStatus;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

    private Consentable$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
        return new KSerializer[]{intSerializer, nullable, nullable2, i18NString$$serializer, i18NString$$serializer, i18NString$$serializer, BuiltinSerializersKt.getNullable(i18NString$$serializer), intSerializer, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Consentable deserialize(Decoder decoder) {
        Object objH;
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        int i10;
        int i11;
        int i12;
        Object objDecodeNullableSerializableElement4;
        Object objH2;
        Object obj;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i13 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            I18NString$$serializer i18NString$$serializer = I18NString$$serializer.INSTANCE;
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, i18NString$$serializer, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, i18NString$$serializer, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, i18NString$$serializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, i18NString$$serializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            objH = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 8, null);
            objH2 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 9, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, intSerializer, null);
            i12 = iDecodeIntElement;
            i11 = iDecodeIntElement2;
            i10 = 2047;
        } else {
            int i14 = 10;
            boolean z10 = true;
            int iDecodeIntElement3 = 0;
            Object objH3 = null;
            Object objH4 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            int iDecodeIntElement4 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj = objDecodeNullableSerializableElement8;
                        z10 = false;
                        i14 = 10;
                        objDecodeNullableSerializableElement8 = obj;
                    case 0:
                        obj = objDecodeNullableSerializableElement8;
                        i13 |= 1;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i14 = 10;
                        objDecodeNullableSerializableElement8 = obj;
                    case 1:
                        i13 |= 2;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i14 = 10;
                    case 2:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i13 |= 4;
                        i14 = 10;
                    case 3:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, I18NString$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i13 |= 8;
                        i14 = 10;
                    case 4:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, I18NString$$serializer.INSTANCE, objDecodeSerializableElement4);
                        i13 |= 16;
                        i14 = 10;
                    case 5:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, I18NString$$serializer.INSTANCE, objDecodeSerializableElement5);
                        i13 |= 32;
                        i14 = 10;
                    case 6:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, I18NString$$serializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i13 |= 64;
                        i14 = 10;
                    case 7:
                        i13 |= 128;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i14 = 10;
                    case 8:
                        objH4 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 8, objH4);
                        i13 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        i14 = 10;
                    case 9:
                        objH3 = a.h("com.sfbx.appconsent.core.model.ConsentStatus", compositeDecoderBeginStructure, descriptor2, 9, objH3);
                        i13 |= 512;
                    case 10:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i14, IntSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i13 |= 1024;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj2 = objDecodeNullableSerializableElement8;
            int i15 = iDecodeIntElement3;
            Object obj3 = objDecodeNullableSerializableElement6;
            objH = objH4;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            objDecodeSerializableElement = objDecodeSerializableElement5;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
            objDecodeNullableSerializableElement2 = obj3;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            i10 = i13;
            i11 = iDecodeIntElement4;
            i12 = i15;
            objDecodeNullableSerializableElement4 = obj2;
            objH2 = objH3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Consentable(i10, i12, (Integer) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, (I18NString) objDecodeSerializableElement3, (I18NString) objDecodeSerializableElement2, (I18NString) objDecodeSerializableElement, (I18NString) objDecodeNullableSerializableElement, i11, (ConsentStatus) objH, (ConsentStatus) objH2, (Integer) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
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

    static {
        Consentable$$serializer consentable$$serializer = new Consentable$$serializer();
        INSTANCE = consentable$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.Consentable", consentable$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("iab_id", true);
        pluginGeneratedSerialDescriptor.addElement("extra_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("description_legal", false);
        pluginGeneratedSerialDescriptor.addElement("illustrations", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement(SUvoXnn.PvMhqDw, true);
        pluginGeneratedSerialDescriptor.addElement("legintStatus", true);
        pluginGeneratedSerialDescriptor.addElement("vendors_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
