package com.sfbx.appconsent.core.model.api;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class PackageInstalled$$serializer implements GeneratedSerializer<PackageInstalled> {
    public static final PackageInstalled$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PackageInstalled$$serializer packageInstalled$$serializer = new PackageInstalled$$serializer();
        INSTANCE = packageInstalled$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.api.PackageInstalled", packageInstalled$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("collectTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("installTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("updateTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PackageInstalled$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, longSerializer, longSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PackageInstalled deserialize(Decoder decoder) {
        String strDecodeStringElement;
        long jDecodeLongElement;
        long j10;
        long j11;
        int i10;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
            j10 = jDecodeLongElement2;
            j11 = jDecodeLongElement3;
            i10 = 15;
        } else {
            strDecodeStringElement = null;
            long jDecodeLongElement4 = 0;
            boolean z10 = true;
            int i11 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
                    i11 |= 8;
                }
            }
            jDecodeLongElement = jDecodeLongElement4;
            j10 = jDecodeLongElement5;
            j11 = jDecodeLongElement6;
            i10 = i11;
        }
        String str = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PackageInstalled(i10, str, j10, j11, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PackageInstalled value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PackageInstalled.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
