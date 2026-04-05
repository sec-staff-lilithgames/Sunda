package com.vungle.ads.internal.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.ui.AdActivity;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class RtbToken$$serializer implements GeneratedSerializer<RtbToken> {
    public static final RtbToken$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RtbToken$$serializer rtbToken$$serializer = new RtbToken$$serializer();
        INSTANCE = rtbToken$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", rtbToken$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(C3191e4.h.G, false);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS, true);
        pluginGeneratedSerialDescriptor.addElement(AdActivity.REQUEST_KEY_EXTRA, true);
        pluginGeneratedSerialDescriptor.addElement("ordinal_view", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RtbToken$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DeviceNode$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(CommonRequestBody$User$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CommonRequestBody$RequestExt$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RtbRequest$$serializer.INSTANCE), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public RtbToken deserialize(Decoder decoder) {
        int i10;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        int iDecodeIntElement;
        Object objDecodeSerializableElement;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, RtbRequest$$serializer.INSTANCE, null);
            i10 = 31;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            Object objDecodeSerializableElement2 = null;
            Object objDecodeNullableSerializableElement4 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objDecodeSerializableElement2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, objDecodeNullableSerializableElement4);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, objDecodeNullableSerializableElement5);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, RtbRequest$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
            iDecodeIntElement = iDecodeIntElement2;
            objDecodeSerializableElement = objDecodeSerializableElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new RtbToken(i10, (DeviceNode) objDecodeSerializableElement, (CommonRequestBody.User) objDecodeNullableSerializableElement, (CommonRequestBody.RequestExt) objDecodeNullableSerializableElement2, (RtbRequest) objDecodeNullableSerializableElement3, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, RtbToken value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        RtbToken.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
