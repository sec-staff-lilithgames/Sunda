package com.sfbx.appconsent.core.model.api;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3144bb;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class XChangeData$$serializer implements GeneratedSerializer<XChangeData> {
    public static final XChangeData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        XChangeData$$serializer xChangeData$$serializer = new XChangeData$$serializer();
        INSTANCE = xChangeData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.XChangeData", xChangeData$$serializer, 43);
        pluginGeneratedSerialDescriptor.addElement("age", false);
        pluginGeneratedSerialDescriptor.addElement("appNameBundle", false);
        pluginGeneratedSerialDescriptor.addElement("consentString", false);
        pluginGeneratedSerialDescriptor.addElement(b.JSON_KEY_CSP, false);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.addElement("deviceCountryCode", false);
        pluginGeneratedSerialDescriptor.addElement("deviceManufacturer", false);
        pluginGeneratedSerialDescriptor.addElement(C3144bb.f36078o, false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("floor", false);
        pluginGeneratedSerialDescriptor.addElement("postCode", false);
        pluginGeneratedSerialDescriptor.addElement("deviceCarrier", false);
        pluginGeneratedSerialDescriptor.addElement("deviceSimCode", false);
        pluginGeneratedSerialDescriptor.addElement("deviceCarrierCode", false);
        pluginGeneratedSerialDescriptor.addElement("deviceModel", false);
        pluginGeneratedSerialDescriptor.addElement(C3191e4.i.f36549n, false);
        pluginGeneratedSerialDescriptor.addElement("emailMD5", false);
        pluginGeneratedSerialDescriptor.addElement("emailSHA1", false);
        pluginGeneratedSerialDescriptor.addElement("emailSHA256", false);
        pluginGeneratedSerialDescriptor.addElement("externalId", false);
        pluginGeneratedSerialDescriptor.addElement("firstName", false);
        pluginGeneratedSerialDescriptor.addElement(InneractiveMediationDefs.KEY_GENDER, false);
        pluginGeneratedSerialDescriptor.addElement("household", false);
        pluginGeneratedSerialDescriptor.addElement("ipv4Address", false);
        pluginGeneratedSerialDescriptor.addElement("ipv6Address", false);
        pluginGeneratedSerialDescriptor.addElement("lastName", false);
        pluginGeneratedSerialDescriptor.addElement("macAddress", false);
        pluginGeneratedSerialDescriptor.addElement("maid", false);
        pluginGeneratedSerialDescriptor.addElement("maidType", false);
        pluginGeneratedSerialDescriptor.addElement("networkType", false);
        pluginGeneratedSerialDescriptor.addElement("phoneMD5", false);
        pluginGeneratedSerialDescriptor.addElement("phoneSHA1", false);
        pluginGeneratedSerialDescriptor.addElement("phoneSHA256", false);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_REGION, false);
        pluginGeneratedSerialDescriptor.addElement("revenues", false);
        pluginGeneratedSerialDescriptor.addElement("signalStrength", false);
        pluginGeneratedSerialDescriptor.addElement("streetName", false);
        pluginGeneratedSerialDescriptor.addElement("streetNo", false);
        pluginGeneratedSerialDescriptor.addElement("streetType", false);
        pluginGeneratedSerialDescriptor.addElement("timestampCollect", false);
        pluginGeneratedSerialDescriptor.addElement("town", false);
        pluginGeneratedSerialDescriptor.addElement("unstructuredData", false);
        pluginGeneratedSerialDescriptor.addElement("wifiSSID", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private XChangeData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // kotlinx.serialization.DeserializationStrategy
    public com.sfbx.appconsent.core.model.api.XChangeData deserialize(kotlinx.serialization.encoding.Decoder r119) {
        /*
            Method dump skipped, instructions count: 3000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.model.api.XChangeData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sfbx.appconsent.core.model.api.XChangeData");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, XChangeData xChangeData) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(xChangeData, LJjmO.cAEZGPUy);
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        XChangeData.write$Self(xChangeData, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
