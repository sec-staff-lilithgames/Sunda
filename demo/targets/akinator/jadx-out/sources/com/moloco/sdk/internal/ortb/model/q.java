package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
import j1.m0;
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
public final class q {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f46176a;

    /* renamed from: b, reason: collision with root package name */
    public final l f46177b;

    /* renamed from: c, reason: collision with root package name */
    public final v f46178c;

    /* renamed from: d, reason: collision with root package name */
    public final long f46179d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46180a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46181b;

        static {
            a aVar = new a();
            f46180a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ProgressBar", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            f46181b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q deserialize(Decoder decoder) {
            int i10;
            k0 k0Var;
            l lVar;
            v vVar;
            m0 m0Var;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46181b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            k0 k0Var2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                k0 k0Var3 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, UIntSerializer.INSTANCE, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, l.a.f46147a, null);
                v vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, v.a.f46218a, null);
                k0Var = k0Var3;
                m0Var = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, h.f46114a, null);
                vVar = vVar2;
                lVar = lVar2;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                l lVar3 = null;
                v vVar3 = null;
                m0 m0Var2 = null;
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
                    } else if (iDecodeElementIndex == 2) {
                        vVar3 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, v.a.f46218a, vVar3);
                        i11 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        m0Var2 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, h.f46114a, m0Var2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                k0Var = k0Var2;
                lVar = lVar3;
                vVar = vVar3;
                m0Var = m0Var2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new q(i10, k0Var, lVar, vVar, m0Var, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{UIntSerializer.INSTANCE, l.a.f46147a, v.a.f46218a, h.f46114a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46181b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, q value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46181b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            q.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<q> serializer() {
            return a.f46180a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ q(int i10, l lVar, v vVar, long j10, kotlin.jvm.internal.u uVar) {
        this(i10, lVar, vVar, j10);
    }

    public static final /* synthetic */ void a(q qVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, k0.m7055boximpl(qVar.f46176a));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, l.a.f46147a, qVar.f46177b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, v.a.f46218a, qVar.f46178c);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, h.f46114a, m0.m4848boximpl(qVar.f46179d));
    }

    public final l c() {
        return this.f46177b;
    }

    public final int e() {
        return this.f46176a;
    }

    public final v g() {
        return this.f46178c;
    }

    public /* synthetic */ q(int i10, k0 k0Var, l lVar, v vVar, m0 m0Var, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, k0Var, lVar, vVar, m0Var, serializationConstructorMarker);
    }

    public final long a() {
        return this.f46179d;
    }

    public /* synthetic */ q(int i10, k0 k0Var, l lVar, v vVar, m0 m0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, a.f46180a.getDescriptor());
        }
        this.f46176a = k0Var.m7061unboximpl();
        this.f46177b = lVar;
        this.f46178c = vVar;
        this.f46179d = m0Var.m4868unboximpl();
    }

    public q(int i10, l horizontalAlignment, v verticalAlignment, long j10) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46176a = i10;
        this.f46177b = horizontalAlignment;
        this.f46178c = verticalAlignment;
        this.f46179d = j10;
    }

    @SerialName("foreground_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void b() {
    }

    @SerialName("horizontal_alignment")
    public static /* synthetic */ void d() {
    }

    @SerialName("padding")
    public static /* synthetic */ void f() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void h() {
    }
}
