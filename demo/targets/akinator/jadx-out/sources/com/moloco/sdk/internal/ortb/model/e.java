package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.s;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class e {
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f46101b = {new ArrayListSerializer(s.a.f46196a)};

    /* renamed from: a, reason: collision with root package name */
    public final List f46102a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46103a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46104b;

        static {
            a aVar = new a();
            f46103a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.BidResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("seatbid", false);
            f46104b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e deserialize(Decoder decoder) {
            List list;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46104b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = e.f46101b;
            int i10 = 1;
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new e(i10, list, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{e.f46101b[0]};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46104b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, e value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46104b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            e.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<e> serializer() {
            return a.f46103a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ e(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, a.f46103a.getDescriptor());
        }
        this.f46102a = list;
    }

    public final List<s> b() {
        return this.f46102a;
    }

    public e(List<s> seatBid) {
        e0.checkNotNullParameter(seatBid, "seatBid");
        this.f46102a = seatBid;
    }

    public static final /* synthetic */ void a(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, f46101b[0], eVar.f46102a);
    }

    @SerialName("seatbid")
    public static /* synthetic */ void c() {
    }
}
