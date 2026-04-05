package com.sfbx.appconsent.core.model.api.proto;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
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
public final class Consent$$serializer implements GeneratedSerializer<Consent> {
    public static final Consent$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    private Consent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Consent deserialize(Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeSerializableElement2;
        String str;
        int i11;
        Object objDecodeSerializableElement3;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        Object objDecodeSerializableElement6;
        int i12;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new ArrayListSerializer(intSerializer), null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, intSerializer, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 11, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            str = strDecodeStringElement2;
            i11 = iDecodeIntElement;
            i10 = 4095;
        } else {
            boolean z10 = true;
            int i13 = 0;
            int i14 = 0;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            Object objDecodeSerializableElement11 = null;
            Object objDecodeSerializableElement12 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i12 = i13;
                        z10 = false;
                        i13 = i12;
                    case 0:
                        i12 = i13;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i14 |= 1;
                        i13 = i12;
                    case 1:
                        i12 = i13;
                        objDecodeSerializableElement12 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement12);
                        i14 |= 2;
                        i13 = i12;
                    case 2:
                        i12 = i13;
                        objDecodeSerializableElement11 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement11);
                        i14 |= 4;
                        i13 = i12;
                    case 3:
                        i12 = i13;
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement10);
                        i14 |= 8;
                        i13 = i12;
                    case 4:
                        i12 = i13;
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement8);
                        i14 |= 16;
                        i13 = i12;
                    case 5:
                        i12 = i13;
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement9);
                        i14 |= 32;
                        i13 = i12;
                    case 6:
                        i12 = i13;
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i14 |= 64;
                        i13 = i12;
                    case 7:
                        i12 = i13;
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i14 |= 128;
                        i13 = i12;
                    case 8:
                        int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i14 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        i13 = iDecodeIntElement2;
                    case 9:
                        i12 = i13;
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i14 |= 512;
                        i13 = i12;
                    case 10:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, IntSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i14 |= 1024;
                        i13 = i13;
                    case 11:
                        i12 = i13;
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 11, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeSerializableElement7);
                        i14 |= 2048;
                        i13 = i12;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i14;
            objDecodeSerializableElement = objDecodeSerializableElement7;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement8;
            objDecodeSerializableElement2 = objDecodeSerializableElement9;
            str = strDecodeStringElement;
            i11 = i13;
            objDecodeSerializableElement3 = objDecodeSerializableElement8;
            objDecodeSerializableElement4 = objDecodeSerializableElement10;
            objDecodeSerializableElement5 = objDecodeSerializableElement11;
            objDecodeSerializableElement6 = objDecodeSerializableElement12;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Consent(i10, str, (List) objDecodeSerializableElement6, (List) objDecodeSerializableElement5, (List) objDecodeSerializableElement4, (List) objDecodeSerializableElement3, (List) objDecodeSerializableElement2, (Integer) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement2, i11, (String) objDecodeNullableSerializableElement, (Integer) objDecodeNullableSerializableElement4, (Map) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Consent value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Consent.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    static {
        Consent$$serializer consent$$serializer = new Consent$$serializer();
        INSTANCE = consent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.proto.Consent", consent$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("iab_cs", true);
        pluginGeneratedSerialDescriptor.addElement("special_features", true);
        pluginGeneratedSerialDescriptor.addElement("purposes", true);
        pluginGeneratedSerialDescriptor.addElement("purposes_legint", true);
        pluginGeneratedSerialDescriptor.addElement("vendors", true);
        pluginGeneratedSerialDescriptor.addElement("vendors_legint", true);
        pluginGeneratedSerialDescriptor.addElement("cmp_version", true);
        pluginGeneratedSerialDescriptor.addElement("uuid", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("cmp_hash", true);
        pluginGeneratedSerialDescriptor.addElement("cmp_hash_version", true);
        pluginGeneratedSerialDescriptor.addElement(QFzuMMDfrzagDN.rzI, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
