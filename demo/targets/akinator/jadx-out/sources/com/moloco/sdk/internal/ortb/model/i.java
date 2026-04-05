package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
import j1.m0;
import j1.o0;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class i {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46116a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46118c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f46119d;

    /* renamed from: e, reason: collision with root package name */
    public final l f46120e;

    /* renamed from: f, reason: collision with root package name */
    public final v f46121f;

    /* renamed from: g, reason: collision with root package name */
    public final long f46122g;

    /* renamed from: h, reason: collision with root package name */
    public final long f46123h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46124a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46125b;

        static {
            a aVar = new a();
            f46124a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.CountDownTimer", aVar, 8);
            pluginGeneratedSerialDescriptor.addElement("custom_timer_desc", true);
            pluginGeneratedSerialDescriptor.addElement("is_default_timer", true);
            pluginGeneratedSerialDescriptor.addElement("control_size", true);
            pluginGeneratedSerialDescriptor.addElement("padding", true);
            pluginGeneratedSerialDescriptor.addElement("horizontal_alignment", true);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", true);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            f46125b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i deserialize(Decoder decoder) {
            boolean z10;
            m0 m0Var;
            m0 m0Var2;
            v vVar;
            int i10;
            String str;
            k0 k0Var;
            Integer num;
            l lVar;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46125b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 7;
            int i12 = 6;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, null);
                boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                k0 k0Var2 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, UIntSerializer.INSTANCE, null);
                Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, null);
                l lVar2 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, l.a.f46147a, null);
                v vVar2 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, v.a.f46218a, null);
                h hVar = h.f46114a;
                m0 m0Var3 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, hVar, null);
                str = str2;
                m0Var = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, hVar, null);
                m0Var2 = m0Var3;
                vVar = vVar2;
                num = num2;
                lVar = lVar2;
                k0Var = k0Var2;
                z10 = zDecodeBooleanElement;
                i10 = 255;
            } else {
                boolean z11 = true;
                boolean zDecodeBooleanElement2 = false;
                m0 m0Var4 = null;
                m0 m0Var5 = null;
                String str3 = null;
                k0 k0Var3 = null;
                Integer num3 = null;
                l lVar3 = null;
                int i13 = 0;
                v vVar3 = null;
                while (z11) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                        case 0:
                            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str3);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 6;
                        case 1:
                            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                            i13 |= 2;
                            i11 = 7;
                        case 2:
                            k0Var3 = (k0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, UIntSerializer.INSTANCE, k0Var3);
                            i13 |= 4;
                            i11 = 7;
                        case 3:
                            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, num3);
                            i13 |= 8;
                            i11 = 7;
                        case 4:
                            lVar3 = (l) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, l.a.f46147a, lVar3);
                            i13 |= 16;
                        case 5:
                            vVar3 = (v) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, v.a.f46218a, vVar3);
                            i13 |= 32;
                        case 6:
                            m0Var5 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i12, h.f46114a, m0Var5);
                            i13 |= 64;
                        case 7:
                            m0Var4 = (m0) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i11, h.f46114a, m0Var4);
                            i13 |= 128;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                z10 = zDecodeBooleanElement2;
                m0Var = m0Var4;
                m0Var2 = m0Var5;
                vVar = vVar3;
                i10 = i13;
                str = str3;
                k0Var = k0Var3;
                num = num3;
                lVar = lVar3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new i(i10, str, z10, k0Var, num, lVar, vVar, m0Var2, m0Var, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
            h hVar = h.f46114a;
            return new KSerializer[]{nullable, BooleanSerializer.INSTANCE, UIntSerializer.INSTANCE, nullable2, l.a.f46147a, v.a.f46218a, hVar, hVar};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46125b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, i value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46125b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            i.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<i> serializer() {
            return a.f46124a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ i(int i10, String str, boolean z10, k0 k0Var, Integer num, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.u uVar) {
        this(i10, str, z10, k0Var, num, lVar, vVar, m0Var, m0Var2, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(i iVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || iVar.f46116a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, iVar.f46116a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !iVar.f46117b) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, iVar.f46117b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || iVar.f46118c != 30) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, UIntSerializer.INSTANCE, k0.m7055boximpl(iVar.f46118c));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || iVar.f46119d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, iVar.f46119d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || iVar.f46120e != l.f46144h) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, l.a.f46147a, iVar.f46120e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || iVar.f46121f != v.f46213c) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, v.a.f46218a, iVar.f46121f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !m0.m4859equalsimpl0(iVar.f46122g, o0.Color(Color.parseColor("#FF4285f4")))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, h.f46114a, m0.m4848boximpl(iVar.f46122g));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && m0.m4859equalsimpl0(iVar.f46123h, o0.Color(Color.parseColor("#FFFFFFFF")))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, h.f46114a, m0.m4848boximpl(iVar.f46123h));
    }

    public final int c() {
        return this.f46118c;
    }

    public final String e() {
        return this.f46116a;
    }

    public final long g() {
        return this.f46122g;
    }

    public final l i() {
        return this.f46120e;
    }

    public final Integer k() {
        return this.f46119d;
    }

    public final v m() {
        return this.f46121f;
    }

    public final boolean o() {
        return this.f46117b;
    }

    public /* synthetic */ i(String str, boolean z10, int i10, Integer num, l lVar, v vVar, long j10, long j11, kotlin.jvm.internal.u uVar) {
        this(str, z10, i10, num, lVar, vVar, j10, j11);
    }

    public /* synthetic */ i(int i10, String str, boolean z10, k0 k0Var, Integer num, l lVar, v vVar, m0 m0Var, m0 m0Var2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f46116a = null;
        } else {
            this.f46116a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46117b = true;
        } else {
            this.f46117b = z10;
        }
        this.f46118c = (i10 & 4) == 0 ? 30 : k0Var.m7061unboximpl();
        if ((i10 & 8) == 0) {
            this.f46119d = null;
        } else {
            this.f46119d = num;
        }
        if ((i10 & 16) == 0) {
            this.f46120e = l.f46144h;
        } else {
            this.f46120e = lVar;
        }
        if ((i10 & 32) == 0) {
            this.f46121f = v.f46213c;
        } else {
            this.f46121f = vVar;
        }
        this.f46122g = (i10 & 64) == 0 ? o0.Color(Color.parseColor("#FF4285f4")) : m0Var.m4868unboximpl();
        this.f46123h = (i10 & 128) == 0 ? o0.Color(Color.parseColor("#FFFFFFFF")) : m0Var2.m4868unboximpl();
    }

    public final long a() {
        return this.f46123h;
    }

    public i(String str, boolean z10, int i10, Integer num, l horizontalAlignment, v verticalAlignment, long j10, long j11) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f46116a = str;
        this.f46117b = z10;
        this.f46118c = i10;
        this.f46119d = num;
        this.f46120e = horizontalAlignment;
        this.f46121f = verticalAlignment;
        this.f46122g = j10;
        this.f46123h = j11;
    }

    @SerialName("background_color")
    @Serializable(with = h.class)
    public static /* synthetic */ void b() {
    }

    @SerialName("control_size")
    public static /* synthetic */ void d() {
    }

    @SerialName("custom_timer_desc")
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

    @SerialName("is_default_timer")
    public static /* synthetic */ void p() {
    }

    public /* synthetic */ i(String str, boolean z10, int i10, Integer num, l lVar, v vVar, long j10, long j11, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? 30 : i10, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? l.f46144h : lVar, (i11 & 32) != 0 ? v.f46213c : vVar, (i11 & 64) != 0 ? o0.Color(Color.parseColor("#FF4285f4")) : j10, (i11 & 128) != 0 ? o0.Color(Color.parseColor("#FFFFFFFF")) : j11, null);
    }
}
