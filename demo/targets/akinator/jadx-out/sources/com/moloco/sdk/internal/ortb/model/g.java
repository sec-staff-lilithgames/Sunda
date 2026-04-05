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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class g {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46107c;

    /* renamed from: d, reason: collision with root package name */
    public final l f46108d;

    /* renamed from: e, reason: collision with root package name */
    public final v f46109e;

    /* renamed from: f, reason: collision with root package name */
    public final long f46110f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f46111g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46112a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46113b;

        static {
            a aVar = new a();
            f46112a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.CTA", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("text", false);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_KEY_IMAGE_URL, true);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            f46113b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g deserialize(Decoder decoder) {
            int i10;
            m0 m0Var;
            String str;
            String str2;
            k0 k0Var;
            l lVar;
            v vVar;
            m0 m0Var2;
            boolean z10;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46113b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 6;
            String strDecodeStringElement = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, null);
                k0 k0Var2 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, UIntSerializer.INSTANCE, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, l.a.f46147a, null);
                v vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, v.a.f46218a, null);
                h hVar = h.f46114a;
                m0 m0Var3 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, hVar, null);
                str = strDecodeStringElement2;
                m0Var = (m0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, hVar, null);
                m0Var2 = m0Var3;
                lVar = lVar2;
                vVar = vVar2;
                k0Var = k0Var2;
                str2 = str3;
                i10 = 127;
            } else {
                boolean z11 = true;
                int i12 = 0;
                m0 m0Var4 = null;
                String str4 = null;
                k0 k0Var3 = null;
                l lVar3 = null;
                v vVar3 = null;
                m0 m0Var5 = null;
                while (z11) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z11 = false;
                        case 0:
                            z10 = true;
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            i11 = 6;
                        case 1:
                            z10 = true;
                            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str4);
                            i12 |= 2;
                            i11 = 6;
                        case 2:
                            k0Var3 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, UIntSerializer.INSTANCE, k0Var3);
                            i12 |= 4;
                        case 3:
                            lVar3 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, l.a.f46147a, lVar3);
                            i12 |= 8;
                        case 4:
                            vVar3 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, v.a.f46218a, vVar3);
                            i12 |= 16;
                        case 5:
                            m0Var5 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, h.f46114a, m0Var5);
                            i12 |= 32;
                        case 6:
                            m0Var4 = (m0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i11, h.f46114a, m0Var4);
                            i12 |= 64;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                i10 = i12;
                m0Var = m0Var4;
                str = strDecodeStringElement;
                str2 = str4;
                k0Var = k0Var3;
                lVar = lVar3;
                vVar = vVar3;
                m0Var2 = m0Var5;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new g(i10, str, str2, k0Var, lVar, vVar, m0Var2, m0Var, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
            h hVar = h.f46114a;
            return new KSerializer[]{stringSerializer, nullable, UIntSerializer.INSTANCE, l.a.f46147a, v.a.f46218a, hVar, BuiltinSerializersKt.getNullable(hVar)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46113b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, g value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46113b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            g.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<g> serializer() {
            return a.f46112a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ g(int i10, String str, String str2, k0 k0Var, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, str, str2, k0Var, lVar, vVar, m0Var, m0Var2, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(g gVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        String str = gVar.f46105a;
        m0 m0Var = gVar.f46111g;
        String str2 = gVar.f46106b;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str2);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, UIntSerializer.INSTANCE, k0.m7055boximpl(gVar.f46107c));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, l.a.f46147a, gVar.f46108d);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, v.a.f46218a, gVar.f46109e);
        h hVar = h.f46114a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, hVar, m0.m4848boximpl(gVar.f46110f));
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && m0Var == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, hVar, m0Var);
    }

    public final long c() {
        return this.f46110f;
    }

    public final l e() {
        return this.f46108d;
    }

    public final String g() {
        return this.f46106b;
    }

    public final int i() {
        return this.f46107c;
    }

    public final String k() {
        return this.f46105a;
    }

    public final v m() {
        return this.f46109e;
    }

    public /* synthetic */ g(String str, String str2, int i10, l lVar, v vVar, long j10, m0 m0Var, kotlin.jvm.internal.u uVar) {
        this(str, str2, i10, lVar, vVar, j10, m0Var);
    }

    public final m0 a() {
        return this.f46111g;
    }

    public /* synthetic */ g(int i10, String str, String str2, k0 k0Var, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker) {
        if (61 != (i10 & 61)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 61, a.f46112a.getDescriptor());
        }
        this.f46105a = str;
        if ((i10 & 2) == 0) {
            this.f46106b = null;
        } else {
            this.f46106b = str2;
        }
        this.f46107c = k0Var.m7061unboximpl();
        this.f46108d = lVar;
        this.f46109e = vVar;
        this.f46110f = m0Var.m4868unboximpl();
        if ((i10 & 64) == 0) {
            this.f46111g = null;
        } else {
            this.f46111g = m0Var2;
        }
    }

    public g(String text, String str, int i10, l horizontalAlignment, v verticalAlignment, long j10, m0 m0Var) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46105a = text;
        this.f46106b = str;
        this.f46107c = i10;
        this.f46108d = horizontalAlignment;
        this.f46109e = verticalAlignment;
        this.f46110f = j10;
        this.f46111g = m0Var;
    }

    public /* synthetic */ g(String str, String str2, int i10, l lVar, v vVar, long j10, m0 m0Var, int i11, kotlin.jvm.internal.u uVar) {
        this(str, (i11 & 2) != 0 ? null : str2, i10, lVar, vVar, j10, (i11 & 64) != 0 ? null : m0Var, null);
    }

    @SerialName("background_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void b() {
    }

    @SerialName("foreground_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void d() {
    }

    @SerialName("horizontal_alignment")
    public static /* synthetic */ void f() {
    }

    @SerialName(CampaignEx.JSON_KEY_IMAGE_URL)
    public static /* synthetic */ void h() {
    }

    @SerialName("padding")
    public static /* synthetic */ void j() {
    }

    @SerialName("text")
    public static /* synthetic */ void l() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void n() {
    }
}
