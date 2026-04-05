package com.sfbx.appconsent.core.model.reducer;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class VendorListReducer$$serializer implements GeneratedSerializer<VendorListReducer> {
    public static final VendorListReducer$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        VendorListReducer$$serializer vendorListReducer$$serializer = new VendorListReducer$$serializer();
        INSTANCE = vendorListReducer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.reducer.VendorListReducer", vendorListReducer$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("is_service_specific", true);
        pluginGeneratedSerialDescriptor.addElement("iab_gvl", true);
        pluginGeneratedSerialDescriptor.addElement("cmp_version", true);
        pluginGeneratedSerialDescriptor.addElement("tcf_policy_version", true);
        pluginGeneratedSerialDescriptor.addElement("publisher_cc", true);
        pluginGeneratedSerialDescriptor.addElement("publisher_restrictions", true);
        pluginGeneratedSerialDescriptor.addElement("geoloc_ad", true);
        pluginGeneratedSerialDescriptor.addElement("geoloc_market", true);
        pluginGeneratedSerialDescriptor.addElement("google_providers", true);
        pluginGeneratedSerialDescriptor.addElement("remove_legintables", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VendorListReducer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(intSerializer);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, arrayListSerializer, arrayListSerializer2, stringSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VendorListReducer deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        String str2;
        String str3;
        char c10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i13 = 9;
        int i14 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(intSerializer), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(intSerializer), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 9);
            i14 = IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE;
            z10 = zDecodeBooleanElement2;
            str2 = strDecodeStringElement2;
            i10 = iDecodeIntElement3;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            i11 = iDecodeIntElement2;
            i12 = iDecodeIntElement;
        } else {
            boolean z11 = true;
            zDecodeBooleanElement = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement3 = false;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i13 = 9;
                    case 0:
                        i14 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i13 = 9;
                    case 1:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
                        i14 |= 2;
                        i13 = 9;
                    case 2:
                        c10 = 3;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                        i14 |= 4;
                        i13 = 9;
                    case 3:
                        c10 = 3;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                        i14 |= 8;
                        i13 = 9;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i14 |= 16;
                        i13 = 9;
                    case 5:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
                        i14 |= 32;
                        i13 = 9;
                    case 6:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement4);
                        i14 |= 64;
                        i13 = 9;
                    case 7:
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement3);
                        i14 |= 128;
                        i13 = 9;
                    case 8:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
                        i14 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i13);
                        i14 |= 512;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            z10 = zDecodeBooleanElement3;
            i10 = iDecodeIntElement4;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement6;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        boolean z12 = zDecodeBooleanElement;
        int i15 = i14;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new VendorListReducer(i15, z12, i12, i11, i10, str, str2, (List) objDecodeSerializableElement2, (List) objDecodeSerializableElement, str3, z10, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, VendorListReducer value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        VendorListReducer.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
