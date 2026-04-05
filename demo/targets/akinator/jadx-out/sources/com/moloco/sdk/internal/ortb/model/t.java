package com.moloco.sdk.internal.ortb.model;

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
import kotlinx.serialization.internal.UIntSerializer;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class t {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f46198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46200c;

    /* renamed from: d, reason: collision with root package name */
    public final l f46201d;

    /* renamed from: e, reason: collision with root package name */
    public final v f46202e;

    /* renamed from: f, reason: collision with root package name */
    public final long f46203f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f46204g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46205a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46206b;

        static {
            a aVar = new a();
            f46205a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SkipClose", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("delay_seconds", false);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("control_size", false);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            f46206b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t deserialize(Decoder decoder) {
            int i10;
            m0 m0Var;
            k0 k0Var;
            k0 k0Var2;
            k0 k0Var3;
            l lVar;
            v vVar;
            m0 m0Var2;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46206b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 6;
            k0 k0Var4 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
                k0 k0Var5 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, uIntSerializer, null);
                k0 k0Var6 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, uIntSerializer, null);
                k0 k0Var7 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, uIntSerializer, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, l.a.f46147a, null);
                v vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, v.a.f46218a, null);
                h hVar = h.f46114a;
                m0 m0Var3 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, hVar, null);
                k0Var3 = k0Var7;
                m0Var = (m0) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, hVar, null);
                m0Var2 = m0Var3;
                lVar = lVar2;
                vVar = vVar2;
                i10 = 127;
                k0Var2 = k0Var6;
                k0Var = k0Var5;
            } else {
                boolean z10 = true;
                int i12 = 0;
                m0 m0Var4 = null;
                k0 k0Var8 = null;
                k0 k0Var9 = null;
                l lVar3 = null;
                v vVar3 = null;
                m0 m0Var5 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                        case 0:
                            k0Var4 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, UIntSerializer.INSTANCE, k0Var4);
                            i12 |= 1;
                            i11 = 6;
                        case 1:
                            k0Var8 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, UIntSerializer.INSTANCE, k0Var8);
                            i12 |= 2;
                            i11 = 6;
                        case 2:
                            k0Var9 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, UIntSerializer.INSTANCE, k0Var9);
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
                k0Var = k0Var4;
                k0Var2 = k0Var8;
                k0Var3 = k0Var9;
                lVar = lVar3;
                vVar = vVar3;
                m0Var2 = m0Var5;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new t(i10, k0Var, k0Var2, k0Var3, lVar, vVar, m0Var2, m0Var, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            h hVar = h.f46114a;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(hVar);
            UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
            return new KSerializer[]{uIntSerializer, uIntSerializer, uIntSerializer, l.a.f46147a, v.a.f46218a, hVar, nullable};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46206b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, t value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46206b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            t.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<t> serializer() {
            return a.f46205a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ t(int i10, int i11, int i12, l lVar, v vVar, long j10, m0 m0Var, kotlin.jvm.internal.u uVar) {
        this(i10, i11, i12, lVar, vVar, j10, m0Var);
    }

    public static final /* synthetic */ void a(t tVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
        int i10 = tVar.f46198a;
        m0 m0Var = tVar.f46204g;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, uIntSerializer, k0.m7055boximpl(i10));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, uIntSerializer, k0.m7055boximpl(tVar.f46199b));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, uIntSerializer, k0.m7055boximpl(tVar.f46200c));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, l.a.f46147a, tVar.f46201d);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, v.a.f46218a, tVar.f46202e);
        h hVar = h.f46114a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, hVar, m0.m4848boximpl(tVar.f46203f));
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && m0Var == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, hVar, m0Var);
    }

    public final int c() {
        return this.f46200c;
    }

    public final int e() {
        return this.f46198a;
    }

    public final long g() {
        return this.f46203f;
    }

    public final l i() {
        return this.f46201d;
    }

    public final int k() {
        return this.f46199b;
    }

    public final v m() {
        return this.f46202e;
    }

    public /* synthetic */ t(int i10, k0 k0Var, k0 k0Var2, k0 k0Var3, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, k0Var, k0Var2, k0Var3, lVar, vVar, m0Var, m0Var2, serializationConstructorMarker);
    }

    public final m0 a() {
        return this.f46204g;
    }

    public /* synthetic */ t(int i10, k0 k0Var, k0 k0Var2, k0 k0Var3, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 63, a.f46205a.getDescriptor());
        }
        this.f46198a = k0Var.m7061unboximpl();
        this.f46199b = k0Var2.m7061unboximpl();
        this.f46200c = k0Var3.m7061unboximpl();
        this.f46201d = lVar;
        this.f46202e = vVar;
        this.f46203f = m0Var.m4868unboximpl();
        if ((i10 & 64) == 0) {
            this.f46204g = null;
        } else {
            this.f46204g = m0Var2;
        }
    }

    public t(int i10, int i11, int i12, l horizontalAlignment, v verticalAlignment, long j10, m0 m0Var) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46198a = i10;
        this.f46199b = i11;
        this.f46200c = i12;
        this.f46201d = horizontalAlignment;
        this.f46202e = verticalAlignment;
        this.f46203f = j10;
        this.f46204g = m0Var;
    }

    public /* synthetic */ t(int i10, int i11, int i12, l lVar, v vVar, long j10, m0 m0Var, int i13, kotlin.jvm.internal.u uVar) {
        this(i10, i11, i12, lVar, vVar, j10, (i13 & 64) != 0 ? null : m0Var, null);
    }

    @SerialName("background_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void b() {
    }

    @SerialName("control_size")
    public static /* synthetic */ void d() {
    }

    @SerialName("delay_seconds")
    public static /* synthetic */ void f() {
    }

    @SerialName("foreground_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void h() {
    }

    @SerialName("horizontal_alignment")
    public static /* synthetic */ void j() {
    }

    @SerialName("padding")
    public static /* synthetic */ void l() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void n() {
    }
}
