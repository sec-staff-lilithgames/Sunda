package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.b;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
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
@Serializable
/* loaded from: classes8.dex */
public final class m {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.b f46149a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46150a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46151b;

        static {
            a aVar = new a();
            f46150a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.MolocoSDKClickMetaData", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            f46151b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m deserialize(Decoder decoder) {
            com.moloco.sdk.internal.ortb.model.b bVar;
            e0.checkNotNullParameter(decoder, QGjYBESwAiCc.Rbx);
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46151b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i10 = 1;
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                bVar = (com.moloco.sdk.internal.ortb.model.b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, b.a.f46086a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                bVar = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        bVar = (com.moloco.sdk.internal.ortb.model.b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, b.a.f46086a, bVar);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new m(i10, bVar, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(b.a.f46086a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46151b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, m value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46151b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            m.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<m> serializer() {
            return a.f46150a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this((com.moloco.sdk.internal.ortb.model.b) null, 1, (kotlin.jvm.internal.u) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void a(m mVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && mVar.f46149a == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, b.a.f46086a, mVar.f46149a);
    }

    public /* synthetic */ m(int i10, com.moloco.sdk.internal.ortb.model.b bVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f46149a = null;
        } else {
            this.f46149a = bVar;
        }
    }

    public final com.moloco.sdk.internal.ortb.model.b a() {
        return this.f46149a;
    }

    public m(com.moloco.sdk.internal.ortb.model.b bVar) {
        this.f46149a = bVar;
    }

    public /* synthetic */ m(com.moloco.sdk.internal.ortb.model.b bVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : bVar);
    }

    @SerialName("banner")
    public static /* synthetic */ void b() {
    }
}
