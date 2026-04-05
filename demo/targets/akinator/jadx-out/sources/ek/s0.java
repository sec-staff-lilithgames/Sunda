package ek;

import java.util.Map;
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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class s0 implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f54628a;
    private static final SerialDescriptor descriptor;

    static {
        s0 s0Var = new s0();
        f54628a = s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", s0Var, 3);
        pluginGeneratedSerialDescriptor.addElement("sessionDetails", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundTime", true);
        pluginGeneratedSerialDescriptor.addElement("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{w0.f54662a, BuiltinSerializersKt.getNullable(x1.f54674a), BuiltinSerializersKt.getNullable(t0.f54634d[2])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final t0 deserialize(Decoder decoder) {
        int i10;
        x0 x0Var;
        y1 y1Var;
        Map map;
        kotlin.jvm.internal.e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = t0.f54634d;
        x0 x0Var2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            x0 x0Var3 = (x0) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, w0.f54662a, null);
            y1 y1Var2 = (y1) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x1.f54674a, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            x0Var = x0Var3;
            i10 = 7;
            y1Var = y1Var2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            y1 y1Var3 = null;
            Map map2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    x0Var2 = (x0) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, w0.f54662a, x0Var2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    y1Var3 = (y1) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x1.f54674a, y1Var3);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], map2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            x0Var = x0Var2;
            y1Var = y1Var3;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new t0(i10, x0Var, y1Var, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, t0 value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        t0.write$Self$com_google_firebase_firebase_sessions(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
