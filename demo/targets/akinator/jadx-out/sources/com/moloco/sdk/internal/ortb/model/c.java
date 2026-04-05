package com.moloco.sdk.internal.ortb.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3352n2;
import com.moloco.sdk.internal.ortb.model.d;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class c {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46088a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46089b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46090c;

    /* renamed from: d, reason: collision with root package name */
    public final d f46091d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46092a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46093b;

        static {
            a aVar = new a();
            f46092a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Bid", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("adm", false);
            pluginGeneratedSerialDescriptor.addElement("price", false);
            pluginGeneratedSerialDescriptor.addElement(C3352n2.f37931y, true);
            pluginGeneratedSerialDescriptor.addElement(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS, false);
            f46093b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c deserialize(Decoder decoder) {
            float f10;
            int i10;
            String str;
            String str2;
            d dVar;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46093b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(pluginGeneratedSerialDescriptor, 1);
                String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
                str = strDecodeStringElement;
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, d.a.f46099a, null);
                str2 = str3;
                f10 = fDecodeFloatElement;
                i10 = 15;
            } else {
                float fDecodeFloatElement2 = 0.0f;
                boolean z10 = true;
                String strDecodeStringElement2 = null;
                String str4 = null;
                d dVar2 = null;
                int i11 = 0;
                while (z10) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i11 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(pluginGeneratedSerialDescriptor, 1);
                        i11 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str4);
                        i11 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        dVar2 = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, d.a.f46099a, dVar2);
                        i11 |= 8;
                    }
                }
                f10 = fDecodeFloatElement2;
                i10 = i11;
                str = strDecodeStringElement2;
                str2 = str4;
                dVar = dVar2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new c(i10, str, f10, str2, dVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), d.a.f46099a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46093b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, c value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46093b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            c.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<c> serializer() {
            return a.f46092a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ c(int i10, String str, float f10, String str2, d dVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i10 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 11, a.f46092a.getDescriptor());
        }
        this.f46088a = str;
        this.f46089b = f10;
        if ((i10 & 4) == 0) {
            this.f46090c = null;
        } else {
            this.f46090c = str2;
        }
        this.f46091d = dVar;
    }

    public static final /* synthetic */ void a(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        String str = cVar.f46088a;
        String str2 = cVar.f46090c;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, cVar.f46089b);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || str2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, d.a.f46099a, cVar.f46091d);
    }

    public final String c() {
        return this.f46090c;
    }

    public final d e() {
        return this.f46091d;
    }

    public final float g() {
        return this.f46089b;
    }

    public final String a() {
        return this.f46088a;
    }

    public c(String adm, float f10, String str, d ext) {
        e0.checkNotNullParameter(adm, "adm");
        e0.checkNotNullParameter(ext, "ext");
        this.f46088a = adm;
        this.f46089b = f10;
        this.f46090c = str;
        this.f46091d = ext;
    }

    public /* synthetic */ c(String str, float f10, String str2, d dVar, int i10, kotlin.jvm.internal.u uVar) {
        this(str, f10, (i10 & 4) != 0 ? null : str2, dVar);
    }

    @SerialName("adm")
    public static /* synthetic */ void b() {
    }

    @SerialName(C3352n2.f37931y)
    public static /* synthetic */ void d() {
    }

    @SerialName(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS)
    public static /* synthetic */ void f() {
    }

    @SerialName("price")
    public static /* synthetic */ void h() {
    }
}
