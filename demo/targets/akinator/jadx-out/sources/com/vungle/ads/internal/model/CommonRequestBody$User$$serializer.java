package com.vungle.ads.internal.model;

import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import com.vungle.ads.internal.model.CommonRequestBody;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class CommonRequestBody$User$$serializer implements GeneratedSerializer<CommonRequestBody.User> {
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        pluginGeneratedSerialDescriptor.addElement("ccpa", true);
        pluginGeneratedSerialDescriptor.addElement("coppa", true);
        pluginGeneratedSerialDescriptor.addElement("fpd", true);
        pluginGeneratedSerialDescriptor.addElement("iab", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommonRequestBody$User$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CommonRequestBody$GDPR$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CommonRequestBody$CCPA$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CommonRequestBody$COPPA$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FirstPartyData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CommonRequestBody$IAB$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CommonRequestBody.User deserialize(Decoder decoder) {
        int i10;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, objDecodeNullableSerializableElement7);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, objDecodeNullableSerializableElement8);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, objDecodeNullableSerializableElement9);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, objDecodeNullableSerializableElement10);
                    i11 |= 16;
                }
            }
            Object obj = objDecodeNullableSerializableElement6;
            i10 = i11;
            objDecodeNullableSerializableElement = obj;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement10;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new CommonRequestBody.User(i10, (CommonRequestBody.GDPR) objDecodeNullableSerializableElement, (CommonRequestBody.CCPA) objDecodeNullableSerializableElement2, (CommonRequestBody.COPPA) objDecodeNullableSerializableElement3, (FirstPartyData) objDecodeNullableSerializableElement4, (CommonRequestBody.IAB) objDecodeNullableSerializableElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CommonRequestBody.User value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        CommonRequestBody.User.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
