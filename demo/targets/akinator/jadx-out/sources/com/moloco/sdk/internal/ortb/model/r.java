package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
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
public final class r {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46182a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46183b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46184c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46185d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46186e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46187f;

    /* renamed from: g, reason: collision with root package name */
    public final String f46188g;

    /* renamed from: h, reason: collision with root package name */
    public final String f46189h;

    /* renamed from: i, reason: collision with root package name */
    public final String f46190i;

    /* renamed from: j, reason: collision with root package name */
    public final String f46191j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46192a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46193b;

        static {
            a aVar = new a();
            f46192a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SdkEvents", aVar, 10);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_start", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_failed", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_success", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_show_failed", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_show_success", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_clicked", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_hidden", true);
            pluginGeneratedSerialDescriptor.addElement("on_user_rewarded", true);
            pluginGeneratedSerialDescriptor.addElement("on_rewarded_video_started", true);
            pluginGeneratedSerialDescriptor.addElement("on_rewarded_video_completed", true);
            f46193b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r deserialize(Decoder decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46193b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 9;
            String str11 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
                String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
                String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
                String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
                String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
                String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, stringSerializer, null);
                String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, stringSerializer, null);
                String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, stringSerializer, null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 9, stringSerializer, null);
                i10 = 1023;
                str4 = str19;
                str3 = str18;
                str5 = str17;
                str7 = str15;
                str2 = str20;
                str6 = str16;
                str10 = str14;
                str9 = str13;
                str8 = str12;
            } else {
                boolean z10 = true;
                int i12 = 0;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z10 = false;
                            i11 = 9;
                        case 0:
                            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str11);
                            i12 |= 1;
                            i11 = 9;
                        case 1:
                            str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str28);
                            i12 |= 2;
                            i11 = 9;
                        case 2:
                            str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str29);
                            i12 |= 4;
                            i11 = 9;
                        case 3:
                            str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str27);
                            i12 |= 8;
                            i11 = 9;
                        case 4:
                            str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str26);
                            i12 |= 16;
                            i11 = 9;
                        case 5:
                            str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, StringSerializer.INSTANCE, str25);
                            i12 |= 32;
                            i11 = 9;
                        case 6:
                            str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, StringSerializer.INSTANCE, str23);
                            i12 |= 64;
                            i11 = 9;
                        case 7:
                            str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, StringSerializer.INSTANCE, str24);
                            i12 |= 128;
                            i11 = 9;
                        case 8:
                            str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, StringSerializer.INSTANCE, str22);
                            i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        case 9:
                            str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i11, StringSerializer.INSTANCE, str21);
                            i12 |= 512;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                i10 = i12;
                str = str21;
                str2 = str22;
                str3 = str23;
                str4 = str24;
                str5 = str25;
                str6 = str26;
                str7 = str27;
                str8 = str11;
                str9 = str28;
                str10 = str29;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new r(i10, str8, str9, str10, str7, str6, str5, str3, str4, str2, str, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46193b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, r value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46193b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            r.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<r> serializer() {
            return a.f46192a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public r() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (kotlin.jvm.internal.u) null);
    }

    public static final /* synthetic */ void a(r rVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rVar.f46182a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rVar.f46182a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rVar.f46183b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rVar.f46183b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rVar.f46184c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rVar.f46184c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rVar.f46185d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rVar.f46185d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rVar.f46186e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rVar.f46186e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rVar.f46187f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rVar.f46187f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || rVar.f46188g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rVar.f46188g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rVar.f46189h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, rVar.f46189h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rVar.f46190i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, rVar.f46190i);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && rVar.f46191j == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, rVar.f46191j);
    }

    public final String c() {
        return this.f46188g;
    }

    public final String e() {
        return this.f46183b;
    }

    public final String g() {
        return this.f46182a;
    }

    public final String i() {
        return this.f46184c;
    }

    public final String k() {
        return this.f46185d;
    }

    public final String m() {
        return this.f46186e;
    }

    public final String o() {
        return this.f46191j;
    }

    public final String q() {
        return this.f46190i;
    }

    public final String s() {
        return this.f46189h;
    }

    public /* synthetic */ r(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.f46182a = null;
        } else {
            this.f46182a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46183b = null;
        } else {
            this.f46183b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f46184c = null;
        } else {
            this.f46184c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f46185d = null;
        } else {
            this.f46185d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f46186e = null;
        } else {
            this.f46186e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f46187f = null;
        } else {
            this.f46187f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f46188g = null;
        } else {
            this.f46188g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f46189h = null;
        } else {
            this.f46189h = str8;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.f46190i = null;
        } else {
            this.f46190i = str9;
        }
        if ((i10 & 512) == 0) {
            this.f46191j = null;
        } else {
            this.f46191j = str10;
        }
    }

    public final String a() {
        return this.f46187f;
    }

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f46182a = str;
        this.f46183b = str2;
        this.f46184c = str3;
        this.f46185d = str4;
        this.f46186e = str5;
        this.f46187f = str6;
        this.f46188g = str7;
        this.f46189h = str8;
        this.f46190i = str9;
        this.f46191j = str10;
    }

    @SerialName("on_ad_clicked")
    public static /* synthetic */ void b() {
    }

    @SerialName("on_ad_hidden")
    public static /* synthetic */ void d() {
    }

    @SerialName("on_ad_load_failed")
    public static /* synthetic */ void f() {
    }

    @SerialName("on_ad_load_start")
    public static /* synthetic */ void h() {
    }

    @SerialName("on_ad_load_success")
    public static /* synthetic */ void j() {
    }

    @SerialName("on_ad_show_failed")
    public static /* synthetic */ void l() {
    }

    @SerialName("on_ad_show_success")
    public static /* synthetic */ void n() {
    }

    @SerialName("on_rewarded_video_completed")
    public static /* synthetic */ void p() {
    }

    @SerialName("on_rewarded_video_started")
    public static /* synthetic */ void r() {
    }

    @SerialName("on_user_rewarded")
    public static /* synthetic */ void t() {
    }

    public /* synthetic */ r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10);
    }
}
