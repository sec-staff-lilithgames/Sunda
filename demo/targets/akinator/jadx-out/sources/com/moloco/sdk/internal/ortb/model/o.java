package com.moloco.sdk.internal.ortb.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
import j1.m0;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class o {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46156b;

    /* renamed from: c, reason: collision with root package name */
    public final l f46157c;

    /* renamed from: d, reason: collision with root package name */
    public final v f46158d;

    /* renamed from: e, reason: collision with root package name */
    public final long f46159e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f46160f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f46161g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46162a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46163b;

        static {
            a aVar = new a();
            f46162a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("control_size", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            f46163b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o deserialize(Decoder decoder) {
            boolean zDecodeBooleanElement;
            m0 m0Var;
            int i10;
            k0 k0Var;
            l lVar;
            v vVar;
            m0 m0Var2;
            k0 k0Var2;
            boolean z10;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46163b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 6;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
                k0 k0Var3 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, uIntSerializer, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, l.a.f46147a, null);
                v vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, v.a.f46218a, null);
                h hVar = h.f46114a;
                m0 m0Var3 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, hVar, null);
                k0 k0Var4 = (k0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, uIntSerializer, null);
                m0Var = (m0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, hVar, null);
                k0Var2 = k0Var4;
                vVar = vVar2;
                m0Var2 = m0Var3;
                lVar = lVar2;
                k0Var = k0Var3;
                i10 = 127;
            } else {
                boolean z11 = true;
                zDecodeBooleanElement = false;
                k0 k0Var5 = null;
                l lVar3 = null;
                v vVar3 = null;
                m0 m0Var4 = null;
                k0 k0Var6 = null;
                int i12 = 0;
                m0 m0Var5 = null;
                while (z11) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z11 = false;
                        case 0:
                            z10 = true;
                            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            i11 = 6;
                        case 1:
                            z10 = true;
                            k0Var5 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, UIntSerializer.INSTANCE, k0Var5);
                            i12 |= 2;
                            i11 = 6;
                        case 2:
                            lVar3 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, l.a.f46147a, lVar3);
                            i12 |= 4;
                        case 3:
                            vVar3 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, v.a.f46218a, vVar3);
                            i12 |= 8;
                        case 4:
                            m0Var4 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, h.f46114a, m0Var4);
                            i12 |= 16;
                        case 5:
                            k0Var6 = (k0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, UIntSerializer.INSTANCE, k0Var6);
                            i12 |= 32;
                        case 6:
                            m0Var5 = (m0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i11, h.f46114a, m0Var5);
                            i12 |= 64;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                m0Var = m0Var5;
                i10 = i12;
                k0Var = k0Var5;
                lVar = lVar3;
                vVar = vVar3;
                m0Var2 = m0Var4;
                k0Var2 = k0Var6;
            }
            boolean z12 = zDecodeBooleanElement;
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new o(i10, z12, k0Var, lVar, vVar, m0Var2, k0Var2, m0Var, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
            h hVar = h.f46114a;
            return new KSerializer[]{BooleanSerializer.INSTANCE, uIntSerializer, l.a.f46147a, v.a.f46218a, hVar, BuiltinSerializersKt.getNullable(uIntSerializer), BuiltinSerializersKt.getNullable(hVar)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46163b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, o value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46163b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            o.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<o> serializer() {
            return a.f46162a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ o(int i10, boolean z10, k0 k0Var, l lVar, v vVar, m0 m0Var, k0 k0Var2, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, z10, k0Var, lVar, vVar, m0Var, k0Var2, m0Var2, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(o oVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z10 = oVar.f46155a;
        m0 m0Var = oVar.f46161g;
        k0 k0Var = oVar.f46160f;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, z10);
        UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, uIntSerializer, k0.m7055boximpl(oVar.f46156b));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, l.a.f46147a, oVar.f46157c);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, v.a.f46218a, oVar.f46158d);
        h hVar = h.f46114a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, hVar, m0.m4848boximpl(oVar.f46159e));
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || k0Var != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, uIntSerializer, k0Var);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && m0Var == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, hVar, m0Var);
    }

    public final k0 c() {
        return this.f46160f;
    }

    public final long e() {
        return this.f46159e;
    }

    public final l g() {
        return this.f46157c;
    }

    public final boolean i() {
        return this.f46155a;
    }

    public final int k() {
        return this.f46156b;
    }

    public final v m() {
        return this.f46158d;
    }

    public /* synthetic */ o(boolean z10, int i10, l lVar, v vVar, long j10, k0 k0Var, m0 m0Var, kotlin.jvm.internal.u uVar) {
        this(z10, i10, lVar, vVar, j10, k0Var, m0Var);
    }

    public final m0 a() {
        return this.f46161g;
    }

    public /* synthetic */ o(int i10, boolean z10, k0 k0Var, l lVar, v vVar, m0 m0Var, k0 k0Var2, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 31, a.f46162a.getDescriptor());
        }
        this.f46155a = z10;
        this.f46156b = k0Var.m7061unboximpl();
        this.f46157c = lVar;
        this.f46158d = vVar;
        this.f46159e = m0Var.m4868unboximpl();
        if ((i10 & 32) == 0) {
            this.f46160f = null;
        } else {
            this.f46160f = k0Var2;
        }
        if ((i10 & 64) == 0) {
            this.f46161g = null;
        } else {
            this.f46161g = m0Var2;
        }
    }

    public o(boolean z10, int i10, l horizontalAlignment, v verticalAlignment, long j10, k0 k0Var, m0 m0Var) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46155a = z10;
        this.f46156b = i10;
        this.f46157c = horizontalAlignment;
        this.f46158d = verticalAlignment;
        this.f46159e = j10;
        this.f46160f = k0Var;
        this.f46161g = m0Var;
    }

    public /* synthetic */ o(boolean z10, int i10, l lVar, v vVar, long j10, k0 k0Var, m0 m0Var, int i11, kotlin.jvm.internal.u uVar) {
        this(z10, i10, lVar, vVar, j10, (i11 & 32) != 0 ? null : k0Var, (i11 & 64) != 0 ? null : m0Var, null);
    }

    @SerialName("background_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void b() {
    }

    @SerialName("control_size")
    public static /* synthetic */ void d() {
    }

    @SerialName("foreground_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void f() {
    }

    @SerialName("horizontal_alignment")
    public static /* synthetic */ void h() {
    }

    @SerialName(CampaignEx.JSON_NATIVE_VIDEO_MUTE)
    public static /* synthetic */ void j() {
    }

    @SerialName("padding")
    public static /* synthetic */ void l() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void n() {
    }
}
