package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.m;
import com.moloco.sdk.internal.ortb.model.n;
import com.moloco.sdk.internal.ortb.model.p;
import com.moloco.sdk.internal.ortb.model.r;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class d {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final p f46094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46095b;

    /* renamed from: c, reason: collision with root package name */
    public final n f46096c;

    /* renamed from: d, reason: collision with root package name */
    public final r f46097d;

    /* renamed from: e, reason: collision with root package name */
    public final m f46098e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46099a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46100b;

        static {
            a aVar = new a();
            f46099a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.BidExt", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("player", true);
            pluginGeneratedSerialDescriptor.addElement("mtid", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_configs", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_events", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_click_metadata", true);
            f46100b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d deserialize(Decoder decoder) {
            int i10;
            p pVar;
            String str;
            n nVar;
            r rVar;
            m mVar;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46100b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            p pVar2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                p pVar3 = (p) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, p.a.f46174a, null);
                String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, null);
                n nVar2 = (n) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, n.a.f46153a, null);
                pVar = pVar3;
                rVar = (r) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, r.a.f46192a, null);
                mVar = (m) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, m.a.f46150a, null);
                nVar = nVar2;
                str = str2;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str3 = null;
                n nVar3 = null;
                r rVar2 = null;
                m mVar2 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else if (iDecodeElementIndex == 0) {
                        pVar2 = (p) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, p.a.f46174a, pVar2);
                        i11 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str3);
                        i11 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        nVar3 = (n) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, n.a.f46153a, nVar3);
                        i11 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        rVar2 = (r) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, r.a.f46192a, rVar2);
                        i11 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        mVar2 = (m) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, m.a.f46150a, mVar2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                pVar = pVar2;
                str = str3;
                nVar = nVar3;
                rVar = rVar2;
                mVar = mVar2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new d(i10, pVar, str, nVar, rVar, mVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(p.a.f46174a), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(n.a.f46153a), BuiltinSerializersKt.getNullable(r.a.f46192a), BuiltinSerializersKt.getNullable(m.a.f46150a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46100b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, d value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46100b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            d.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<d> serializer() {
            return a.f46099a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public d() {
        this((p) null, (String) null, (n) null, (r) null, (m) null, 31, (kotlin.jvm.internal.u) null);
    }

    public static final /* synthetic */ void a(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dVar.f46094a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, p.a.f46174a, dVar.f46094a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dVar.f46095b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dVar.f46095b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dVar.f46096c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, n.a.f46153a, dVar.f46096c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dVar.f46097d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, r.a.f46192a, dVar.f46097d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dVar.f46098e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, m.a.f46150a, dVar.f46098e);
    }

    public final m c() {
        return this.f46098e;
    }

    public final String e() {
        return this.f46095b;
    }

    public final p g() {
        return this.f46094a;
    }

    public final r i() {
        return this.f46097d;
    }

    public /* synthetic */ d(int i10, p pVar, String str, n nVar, r rVar, m mVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f46094a = null;
        } else {
            this.f46094a = pVar;
        }
        if ((i10 & 2) == 0) {
            this.f46095b = null;
        } else {
            this.f46095b = str;
        }
        if ((i10 & 4) == 0) {
            this.f46096c = null;
        } else {
            this.f46096c = nVar;
        }
        if ((i10 & 8) == 0) {
            this.f46097d = null;
        } else {
            this.f46097d = rVar;
        }
        if ((i10 & 16) == 0) {
            this.f46098e = null;
        } else {
            this.f46098e = mVar;
        }
    }

    public final n a() {
        return this.f46096c;
    }

    public d(p pVar, String str, n nVar, r rVar, m mVar) {
        this.f46094a = pVar;
        this.f46095b = str;
        this.f46096c = nVar;
        this.f46097d = rVar;
        this.f46098e = mVar;
    }

    public /* synthetic */ d(p pVar, String str, n nVar, r rVar, m mVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : pVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : rVar, (i10 & 16) != 0 ? null : mVar);
    }

    @SerialName("moloco_sdk_configs")
    public static /* synthetic */ void b() {
    }

    @SerialName("moloco_sdk_click_metadata")
    public static /* synthetic */ void d() {
    }

    @SerialName("mtid")
    public static /* synthetic */ void f() {
    }

    @SerialName("player")
    public static /* synthetic */ void h() {
    }

    @SerialName("moloco_sdk_events")
    public static /* synthetic */ void j() {
    }
}
