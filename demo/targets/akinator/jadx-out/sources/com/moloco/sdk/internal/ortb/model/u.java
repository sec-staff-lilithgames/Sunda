package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class u {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f46207a;

    /* renamed from: b, reason: collision with root package name */
    public final l f46208b;

    /* renamed from: c, reason: collision with root package name */
    public final v f46209c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46210a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46211b;

        static {
            a aVar = new a();
            f46210a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            f46211b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u deserialize(Decoder decoder) {
            int i10;
            k0 k0Var;
            l lVar;
            v vVar;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46211b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            k0 k0Var2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                k0 k0Var3 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, UIntSerializer.INSTANCE, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, l.a.f46147a, null);
                k0Var = k0Var3;
                vVar = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, v.a.f46218a, null);
                lVar = lVar2;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                l lVar3 = null;
                v vVar2 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else if (iDecodeElementIndex == 0) {
                        k0Var2 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, UIntSerializer.INSTANCE, k0Var2);
                        i11 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        lVar3 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, l.a.f46147a, lVar3);
                        i11 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, v.a.f46218a, vVar2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                k0Var = k0Var2;
                lVar = lVar3;
                vVar = vVar2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new u(i10, k0Var, lVar, vVar, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{UIntSerializer.INSTANCE, l.a.f46147a, v.a.f46218a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46211b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, u value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46211b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            u.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<u> serializer() {
            return a.f46210a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ u(int i10, l lVar, v vVar, kotlin.jvm.internal.u uVar) {
        this(i10, lVar, vVar);
    }

    public static final /* synthetic */ void a(u uVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, k0.m7055boximpl(uVar.f46207a));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, l.a.f46147a, uVar.f46208b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, v.a.f46218a, uVar.f46209c);
    }

    public final int c() {
        return this.f46207a;
    }

    public final v e() {
        return this.f46209c;
    }

    public /* synthetic */ u(int i10, k0 k0Var, l lVar, v vVar, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, k0Var, lVar, vVar, serializationConstructorMarker);
    }

    public final l a() {
        return this.f46208b;
    }

    public /* synthetic */ u(int i10, k0 k0Var, l lVar, v vVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, a.f46210a.getDescriptor());
        }
        this.f46207a = k0Var.m7061unboximpl();
        this.f46208b = lVar;
        this.f46209c = vVar;
    }

    public u(int i10, l horizontalAlignment, v verticalAlignment) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46207a = i10;
        this.f46208b = horizontalAlignment;
        this.f46209c = verticalAlignment;
    }

    @SerialName("horizontal_alignment")
    public static /* synthetic */ void b() {
    }

    @SerialName("padding")
    public static /* synthetic */ void d() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void f() {
    }
}
