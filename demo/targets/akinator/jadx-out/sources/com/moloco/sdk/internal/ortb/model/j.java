package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.k;
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
public final class j {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46127b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46128c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46129d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46130e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46131f;

    /* renamed from: g, reason: collision with root package name */
    public final String f46132g;

    /* renamed from: h, reason: collision with root package name */
    public final k f46133h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46134a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46135b;

        static {
            a aVar = new a();
            f46134a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DEC", aVar, 8);
            pluginGeneratedSerialDescriptor.addElement("app_icon_url", true);
            pluginGeneratedSerialDescriptor.addElement("app_name", true);
            pluginGeneratedSerialDescriptor.addElement("imp_link", true);
            pluginGeneratedSerialDescriptor.addElement("click_through", true);
            pluginGeneratedSerialDescriptor.addElement("click_tracking", true);
            pluginGeneratedSerialDescriptor.addElement("cta_text", true);
            pluginGeneratedSerialDescriptor.addElement("skip_event", true);
            pluginGeneratedSerialDescriptor.addElement("close", true);
            f46135b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j deserialize(Decoder decoder) {
            int i10;
            k kVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46135b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 7;
            String str8 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
                String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
                String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
                String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
                String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, stringSerializer, null);
                kVar = (k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, k.a.f46137a, null);
                i10 = 255;
                str2 = str14;
                str6 = str12;
                str7 = str13;
                str5 = str11;
                str4 = str10;
                str3 = str9;
            } else {
                boolean z10 = true;
                int i12 = 0;
                k kVar2 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z10 = false;
                            i11 = 7;
                        case 0:
                            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str8);
                            i12 |= 1;
                            i11 = 7;
                        case 1:
                            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str17);
                            i12 |= 2;
                            i11 = 7;
                        case 2:
                            str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str18);
                            i12 |= 4;
                            i11 = 7;
                        case 3:
                            str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str19);
                            i12 |= 8;
                            i11 = 7;
                        case 4:
                            str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str20);
                            i12 |= 16;
                        case 5:
                            str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, StringSerializer.INSTANCE, str16);
                            i12 |= 32;
                        case 6:
                            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, StringSerializer.INSTANCE, str15);
                            i12 |= 64;
                        case 7:
                            kVar2 = (k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i11, k.a.f46137a, kVar2);
                            i12 |= 128;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                i10 = i12;
                kVar = kVar2;
                str = str15;
                str2 = str16;
                str3 = str8;
                str4 = str17;
                str5 = str18;
                str6 = str19;
                str7 = str20;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new j(i10, str3, str4, str5, str6, str7, str2, str, kVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(k.a.f46137a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46135b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, j value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46135b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            j.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<j> serializer() {
            return a.f46134a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public j() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (k) null, 255, (kotlin.jvm.internal.u) null);
    }

    public static final /* synthetic */ void a(j jVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || jVar.f46126a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, jVar.f46126a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || jVar.f46127b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, jVar.f46127b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || jVar.f46128c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, jVar.f46128c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || jVar.f46129d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, jVar.f46129d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || jVar.f46130e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, jVar.f46130e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || jVar.f46131f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, jVar.f46131f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || jVar.f46132g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, jVar.f46132g);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && jVar.f46133h == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, k.a.f46137a, jVar.f46133h);
    }

    public final String c() {
        return this.f46127b;
    }

    public final k e() {
        return this.f46133h;
    }

    public final String g() {
        return this.f46131f;
    }

    public final String i() {
        return this.f46130e;
    }

    public final String k() {
        return this.f46129d;
    }

    public final String m() {
        return this.f46128c;
    }

    public final String o() {
        return this.f46132g;
    }

    public /* synthetic */ j(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, k kVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f46126a = null;
        } else {
            this.f46126a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46127b = null;
        } else {
            this.f46127b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f46128c = null;
        } else {
            this.f46128c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f46129d = null;
        } else {
            this.f46129d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f46130e = null;
        } else {
            this.f46130e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f46131f = null;
        } else {
            this.f46131f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f46132g = null;
        } else {
            this.f46132g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f46133h = null;
        } else {
            this.f46133h = kVar;
        }
    }

    public final String a() {
        return this.f46126a;
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, k kVar) {
        this.f46126a = str;
        this.f46127b = str2;
        this.f46128c = str3;
        this.f46129d = str4;
        this.f46130e = str5;
        this.f46131f = str6;
        this.f46132g = str7;
        this.f46133h = kVar;
    }

    @SerialName("app_icon_url")
    public static /* synthetic */ void b() {
    }

    @SerialName("app_name")
    public static /* synthetic */ void d() {
    }

    @SerialName("close")
    public static /* synthetic */ void f() {
    }

    @SerialName("cta_text")
    public static /* synthetic */ void h() {
    }

    @SerialName("click_tracking")
    public static /* synthetic */ void j() {
    }

    @SerialName("click_through")
    public static /* synthetic */ void l() {
    }

    @SerialName("imp_link")
    public static /* synthetic */ void n() {
    }

    @SerialName("skip_event")
    public static /* synthetic */ void p() {
    }

    public /* synthetic */ j(String str, String str2, String str3, String str4, String str5, String str6, String str7, k kVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : kVar);
    }
}
