package com.moloco.sdk.internal.ortb.model;

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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class a {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46080b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46081c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.ortb.model.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0373a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final C0373a f46082a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46083b;

        static {
            C0373a c0373a = new C0373a();
            f46082a = c0373a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AutoStore", c0373a, 3);
            pluginGeneratedSerialDescriptor.addElement("enabled", false);
            pluginGeneratedSerialDescriptor.addElement("on_skip", true);
            pluginGeneratedSerialDescriptor.addElement("event_link", true);
            f46083b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a deserialize(Decoder decoder) {
            boolean zDecodeBooleanElement;
            boolean z10;
            int i10;
            String str;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46083b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
                z10 = zDecodeBooleanElement2;
                i10 = 7;
            } else {
                boolean z11 = true;
                zDecodeBooleanElement = false;
                int i11 = 0;
                String str2 = null;
                boolean zDecodeBooleanElement3 = false;
                while (z11) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z11 = false;
                    } else if (iDecodeElementIndex == 0) {
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                        i11 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                        i11 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str2);
                        i11 |= 4;
                    }
                }
                z10 = zDecodeBooleanElement3;
                i10 = i11;
                str = str2;
            }
            boolean z12 = zDecodeBooleanElement;
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i10, z12, z10, str, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            return new KSerializer[]{booleanSerializer, booleanSerializer, nullable};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46083b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, a value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46083b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            a.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<a> serializer() {
            return C0373a.f46082a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ a(int i10, boolean z10, boolean z11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, C0373a.f46082a.getDescriptor());
        }
        this.f46079a = z10;
        if ((i10 & 2) == 0) {
            this.f46080b = true;
        } else {
            this.f46080b = z11;
        }
        if ((i10 & 4) == 0) {
            this.f46081c = null;
        } else {
            this.f46081c = str;
        }
    }

    public static final /* synthetic */ void a(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z10 = aVar.f46079a;
        String str = aVar.f46081c;
        boolean z11 = aVar.f46080b;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, z10);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !z11) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, z11);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && str == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
    }

    public final String c() {
        return this.f46081c;
    }

    public final boolean e() {
        return this.f46080b;
    }

    public final boolean a() {
        return this.f46079a;
    }

    public a(boolean z10, boolean z11, String str) {
        this.f46079a = z10;
        this.f46080b = z11;
        this.f46081c = str;
    }

    public /* synthetic */ a(boolean z10, boolean z11, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? null : str);
    }

    @SerialName("enabled")
    public static /* synthetic */ void b() {
    }

    @SerialName("event_link")
    public static /* synthetic */ void d() {
    }

    @SerialName("on_skip")
    public static /* synthetic */ void f() {
    }
}
