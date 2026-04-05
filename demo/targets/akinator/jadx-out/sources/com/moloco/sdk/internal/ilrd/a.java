package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import sv.n0;
import tu.o;
import tu.q;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f45938a;

    /* renamed from: b, reason: collision with root package name */
    public final o f45939b;

    /* renamed from: c, reason: collision with root package name */
    public final o f45940c;

    /* renamed from: d, reason: collision with root package name */
    public final o f45941d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f45942e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45943f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C0366a {
        public /* synthetic */ C0366a(u uVar) {
            this();
        }

        public C0366a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class b {
        public static final C0368b Companion = new C0368b(null);

        /* renamed from: a, reason: collision with root package name */
        public final long f45944a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45945b;

        /* renamed from: c, reason: collision with root package name */
        public final int f45946c;

        /* renamed from: d, reason: collision with root package name */
        public final int f45947d;

        /* renamed from: e, reason: collision with root package name */
        public final int f45948e;

        /* renamed from: f, reason: collision with root package name */
        public final int f45949f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0367a implements GeneratedSerializer {

            /* renamed from: a, reason: collision with root package name */
            public static final C0367a f45950a;

            /* renamed from: b, reason: collision with root package name */
            public static final PluginGeneratedSerialDescriptor f45951b;

            static {
                C0367a c0367a = new C0367a();
                f45950a = c0367a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c0367a, 6);
                pluginGeneratedSerialDescriptor.addElement("lastEventReceivedTs", false);
                pluginGeneratedSerialDescriptor.addElement("banner", false);
                pluginGeneratedSerialDescriptor.addElement("mrec", false);
                pluginGeneratedSerialDescriptor.addElement("native", false);
                pluginGeneratedSerialDescriptor.addElement("interstitial", false);
                pluginGeneratedSerialDescriptor.addElement("rewarded", false);
                f45951b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b deserialize(Decoder decoder) {
                int iDecodeIntElement;
                int iDecodeIntElement2;
                int i10;
                int i11;
                int i12;
                int i13;
                long j10;
                e0.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45951b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
                    int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                    int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                    int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                    i10 = iDecodeIntElement4;
                    i11 = iDecodeIntElement5;
                    i12 = iDecodeIntElement3;
                    i13 = 63;
                    j10 = jDecodeLongElement;
                } else {
                    boolean z10 = true;
                    iDecodeIntElement = 0;
                    int iDecodeIntElement6 = 0;
                    int iDecodeIntElement7 = 0;
                    int i14 = 0;
                    long jDecodeLongElement2 = 0;
                    int iDecodeIntElement8 = 0;
                    int iDecodeIntElement9 = 0;
                    while (z10) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                i14 |= 1;
                                continue;
                            case 1:
                                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
                                i14 |= 2;
                                break;
                            case 2:
                                iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                                i14 |= 4;
                                break;
                            case 3:
                                iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                                i14 |= 8;
                                break;
                            case 4:
                                iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                                i14 |= 16;
                                break;
                            case 5:
                                iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                                i14 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    iDecodeIntElement2 = iDecodeIntElement8;
                    i10 = iDecodeIntElement9;
                    i11 = iDecodeIntElement6;
                    i12 = iDecodeIntElement7;
                    i13 = i14;
                    j10 = jDecodeLongElement2;
                }
                int i15 = iDecodeIntElement;
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i13, j10, i15, i12, i10, i11, iDecodeIntElement2, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return f45951b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, b value) {
                e0.checkNotNullParameter(encoder, "encoder");
                e0.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45951b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name */
        public static final class C0368b {
            public C0368b() {
            }

            public final KSerializer<b> serializer() {
                return C0367a.f45950a;
            }

            public /* synthetic */ C0368b(u uVar) {
                this();
            }
        }

        public /* synthetic */ b(int i10, long j10, int i11, int i12, int i13, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i10 & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 63, C0367a.f45950a.getDescriptor());
            }
            this.f45944a = j10;
            this.f45945b = i11;
            this.f45946c = i12;
            this.f45947d = i13;
            this.f45948e = i14;
            this.f45949f = i15;
        }

        public final long a() {
            return this.f45944a;
        }

        public final int b() {
            return this.f45945b;
        }

        public final int c() {
            return this.f45946c;
        }

        public final int d() {
            return this.f45947d;
        }

        public final int e() {
            return this.f45948e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f45944a == bVar.f45944a && this.f45945b == bVar.f45945b && this.f45946c == bVar.f45946c && this.f45947d == bVar.f45947d && this.f45948e == bVar.f45948e && this.f45949f == bVar.f45949f;
        }

        public final int f() {
            return this.f45949f;
        }

        public final int g() {
            return this.f45945b;
        }

        public final int h() {
            return this.f45948e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f45949f) + e3.g.d(this.f45948e, e3.g.d(this.f45947d, e3.g.d(this.f45946c, e3.g.d(this.f45945b, Long.hashCode(this.f45944a) * 31, 31), 31), 31), 31);
        }

        public final long i() {
            return this.f45944a;
        }

        public final int j() {
            return this.f45946c;
        }

        public final int k() {
            return this.f45947d;
        }

        public final int l() {
            return this.f45949f;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ImpressionCounts(lastEventReceivedTs=");
            sb2.append(this.f45944a);
            sb2.append(", banner=");
            sb2.append(this.f45945b);
            sb2.append(", mrec=");
            sb2.append(this.f45946c);
            sb2.append(", native=");
            sb2.append(this.f45947d);
            sb2.append(", interstitial=");
            sb2.append(this.f45948e);
            sb2.append(", rewarded=");
            return e3.g.m(sb2, this.f45949f, ')');
        }

        public b(long j10, int i10, int i11, int i12, int i13, int i14) {
            this.f45944a = j10;
            this.f45945b = i10;
            this.f45946c = i11;
            this.f45947d = i12;
            this.f45948e = i13;
            this.f45949f = i14;
        }

        public final b a(long j10, int i10, int i11, int i12, int i13, int i14) {
            return new b(j10, i10, i11, i12, i13, i14);
        }

        public static /* synthetic */ b a(b bVar, long j10, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                j10 = bVar.f45944a;
            }
            long j11 = j10;
            if ((i15 & 2) != 0) {
                i10 = bVar.f45945b;
            }
            int i16 = i10;
            if ((i15 & 4) != 0) {
                i11 = bVar.f45946c;
            }
            int i17 = i11;
            if ((i15 & 8) != 0) {
                i12 = bVar.f45947d;
            }
            int i18 = i12;
            if ((i15 & 16) != 0) {
                i13 = bVar.f45948e;
            }
            int i19 = i13;
            if ((i15 & 32) != 0) {
                i14 = bVar.f45949f;
            }
            return bVar.a(j11, i16, i17, i18, i19, i14);
        }

        public static final /* synthetic */ void a(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, bVar.f45944a);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, bVar.f45945b);
            compositeEncoder.encodeIntElement(serialDescriptor, 2, bVar.f45946c);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, bVar.f45947d);
            compositeEncoder.encodeIntElement(serialDescriptor, 4, bVar.f45948e);
            compositeEncoder.encodeIntElement(serialDescriptor, 5, bVar.f45949f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class c {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f45952a;

        /* renamed from: b, reason: collision with root package name */
        public final b f45953b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45954c;

        /* renamed from: d, reason: collision with root package name */
        public final long f45955d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C0369a implements GeneratedSerializer {

            /* renamed from: a, reason: collision with root package name */
            public static final C0369a f45956a;

            /* renamed from: b, reason: collision with root package name */
            public static final PluginGeneratedSerialDescriptor f45957b;

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c deserialize(Decoder decoder) {
                int i10;
                boolean zDecodeBooleanElement;
                long jDecodeLongElement;
                String str;
                b bVar;
                e0.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45957b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    b bVar2 = (b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, b.C0367a.f45950a, null);
                    str = strDecodeStringElement;
                    i10 = 15;
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                    bVar = bVar2;
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                } else {
                    long jDecodeLongElement2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    String strDecodeStringElement2 = null;
                    b bVar3 = null;
                    boolean zDecodeBooleanElement2 = false;
                    while (z10) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z10 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i11 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            bVar3 = (b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, b.C0367a.f45950a, bVar3);
                            i11 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                            i11 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    zDecodeBooleanElement = zDecodeBooleanElement2;
                    jDecodeLongElement = jDecodeLongElement2;
                    str = strDecodeStringElement2;
                    bVar = bVar3;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i10, str, bVar, zDecodeBooleanElement, jDecodeLongElement, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{StringSerializer.INSTANCE, b.C0367a.f45950a, BooleanSerializer.INSTANCE, LongSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return f45957b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }

            static {
                C0369a c0369a = new C0369a();
                f45956a = c0369a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c0369a, 4);
                pluginGeneratedSerialDescriptor.addElement(JsonStorageKeyNames.SESSION_ID_KEY, false);
                pluginGeneratedSerialDescriptor.addElement(KGUkpTlXZlJLy.chLshxV, false);
                pluginGeneratedSerialDescriptor.addElement("isExpired", false);
                pluginGeneratedSerialDescriptor.addElement("sessionStartTs", false);
                f45957b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, c value) {
                e0.checkNotNullParameter(encoder, "encoder");
                e0.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45957b;
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
                return C0369a.f45956a;
            }

            public /* synthetic */ b(u uVar) {
                this();
            }
        }

        public /* synthetic */ c(int i10, String str, b bVar, boolean z10, long j10, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i10 & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 15, C0369a.f45956a.getDescriptor());
            }
            this.f45952a = str;
            this.f45953b = bVar;
            this.f45954c = z10;
            this.f45955d = j10;
        }

        public final String a() {
            return this.f45952a;
        }

        public final b b() {
            return this.f45953b;
        }

        public final boolean c() {
            return this.f45954c;
        }

        public final long d() {
            return this.f45955d;
        }

        public final b e() {
            return this.f45953b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e0.areEqual(this.f45952a, cVar.f45952a) && e0.areEqual(this.f45953b, cVar.f45953b) && this.f45954c == cVar.f45954c && this.f45955d == cVar.f45955d;
        }

        public final String f() {
            return this.f45952a;
        }

        public final long g() {
            return this.f45955d;
        }

        public final boolean h() {
            return this.f45954c;
        }

        public int hashCode() {
            return Long.hashCode(this.f45955d) + com.google.android.gms.internal.play_billing.a.c((this.f45953b.hashCode() + (this.f45952a.hashCode() * 31)) * 31, 31, this.f45954c);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SessionData(sessionId=");
            sb2.append(this.f45952a);
            sb2.append(", impressionCounts=");
            sb2.append(this.f45953b);
            sb2.append(", isExpired=");
            sb2.append(this.f45954c);
            sb2.append(", sessionStartTs=");
            return e3.g.n(sb2, this.f45955d, ')');
        }

        public c(String sessionId, b impressionCounts, boolean z10, long j10) {
            e0.checkNotNullParameter(sessionId, "sessionId");
            e0.checkNotNullParameter(impressionCounts, "impressionCounts");
            this.f45952a = sessionId;
            this.f45953b = impressionCounts;
            this.f45954c = z10;
            this.f45955d = j10;
        }

        public final c a(String sessionId, b impressionCounts, boolean z10, long j10) {
            e0.checkNotNullParameter(sessionId, "sessionId");
            e0.checkNotNullParameter(impressionCounts, "impressionCounts");
            return new c(sessionId, impressionCounts, z10, j10);
        }

        public static /* synthetic */ c a(c cVar, String str, b bVar, boolean z10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f45952a;
            }
            if ((i10 & 2) != 0) {
                bVar = cVar.f45953b;
            }
            if ((i10 & 4) != 0) {
                z10 = cVar.f45954c;
            }
            if ((i10 & 8) != 0) {
                j10 = cVar.f45955d;
            }
            boolean z11 = z10;
            return cVar.a(str, bVar, z11, j10);
        }

        public static final /* synthetic */ void a(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.f45952a);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, b.C0367a.f45950a, cVar.f45953b);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, cVar.f45954c);
            compositeEncoder.encodeLongElement(serialDescriptor, 3, cVar.f45955d);
        }
    }

    static {
        new C0366a(null);
    }

    public a(com.moloco.sdk.internal.services.i timeProvider, String str) {
        b bVarE;
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        this.f45938a = timeProvider;
        final int i10 = 0;
        this.f45939b = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f46003c;

            {
                this.f46003c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return a.a(this.f46003c);
                    default:
                        return Long.valueOf(a.b(this.f46003c));
                }
            }
        });
        final int i11 = 1;
        this.f45940c = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f46003c;

            {
                this.f46003c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return a.a(this.f46003c);
                    default:
                        return Long.valueOf(a.b(this.f46003c));
                }
            }
        });
        this.f45941d = q.lazy(new a1.e(str, 6));
        c cVarC = c();
        this.f45942e = new AtomicReference((cVarC == null || (bVarE = cVarC.e()) == null) ? new b(-1L, 0, 0, 0, 0, 0) : bVarE);
        c cVarC2 = c();
        this.f45943f = cVarC2 != null ? cVarC2.h() : false;
    }

    public static final String a(a aVar) {
        String strF;
        c cVarC = aVar.c();
        return (cVarC == null || (strF = cVarC.f()) == null) ? w0.i.c("toString(...)") : strF;
    }

    public final b b() {
        Object obj = this.f45942e.get();
        e0.checkNotNullExpressionValue(obj, "get(...)");
        return (b) obj;
    }

    public final c c() {
        return (c) this.f45941d.getValue();
    }

    public final String d() {
        return (String) this.f45939b.getValue();
    }

    public final long e() {
        return ((Number) this.f45940c.getValue()).longValue();
    }

    public final boolean f() {
        return this.f45943f;
    }

    public final String g() {
        return Json.Default.encodeToString(c.Companion.serializer(), new c(d(), b(), f(), e()));
    }

    public String toString() {
        b bVarB = b();
        return "IlrdActiveSession(id=" + d() + ", startTs=" + e() + ", expired=" + f() + ", impressions=" + (bVarB.l() + bVarB.h() + bVarB.k() + bVarB.j() + bVarB.g()) + " [banner=" + bVarB.g() + ", mrec=" + bVarB.j() + ", native=" + bVarB.k() + ", interstitial=" + bVarB.h() + ", rewarded=" + bVarB.l() + "])";
    }

    public static final long b(a aVar) {
        c cVarC = aVar.c();
        return cVarC != null ? cVarC.g() : aVar.f45938a.a();
    }

    public static final c a(String str) {
        if (str != null) {
            try {
                Json.Default r02 = Json.Default;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(r02.getSerializersModule(), c1.typeOf(c.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (c) r02.decodeFromString(kSerializerSerializer, str);
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Error deserializing session data", e10, false, 8, null);
            }
        }
        return null;
    }

    public /* synthetic */ a(com.moloco.sdk.internal.services.i iVar, String str, int i10, u uVar) {
        this(iVar, (i10 & 2) != 0 ? null : str);
    }

    public final void a(g ilrdData) {
        e0.checkNotNullParameter(ilrdData, "ilrdData");
        if (ilrdData instanceof f) {
            String adFormat = ((f) ilrdData).b().getAdFormat();
            e0.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            String upperCase = adFormat.toUpperCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            a(upperCase, "Applovin");
            return;
        }
        if (ilrdData instanceof e) {
            String adFormat2 = ((e) ilrdData).b().getAdFormat();
            e0.checkNotNullExpressionValue(adFormat2, "getAdFormat(...)");
            String upperCase2 = adFormat2.toUpperCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            a(upperCase2, "Ironsource");
            return;
        }
        throw new t();
    }

    public final boolean a(String str, String str2) {
        b bVarA;
        long jA = this.f45938a.a();
        AtomicReference atomicReference = this.f45942e;
        b bVar = (b) atomicReference.get();
        if (n0.contains$default((CharSequence) str, (CharSequence) com.ironsource.mediationsdk.l.f37554a, false, 2, (Object) null)) {
            bVarA = b.a(bVar, jA, bVar.g() + 1, 0, 0, 0, 0, 60, null);
        } else if (n0.contains$default((CharSequence) str, (CharSequence) "MREC", false, 2, (Object) null)) {
            bVarA = b.a(bVar, jA, 0, bVar.j() + 1, 0, 0, 0, 58, null);
        } else if (n0.contains$default((CharSequence) str, (CharSequence) "NATIVE", false, 2, (Object) null)) {
            bVarA = b.a(bVar, jA, 0, 0, bVar.k() + 1, 0, 0, 54, null);
        } else if (n0.contains$default((CharSequence) str, (CharSequence) "INTER", false, 2, (Object) null)) {
            bVarA = b.a(bVar, jA, 0, 0, 0, bVar.h() + 1, 0, 46, null);
        } else if (n0.contains$default((CharSequence) str, (CharSequence) "REWARD", false, 2, (Object) null)) {
            bVarA = b.a(bVar, jA, 0, 0, 0, 0, bVar.l() + 1, 30, null);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdActiveSession", a.b.m("Unknown ad format for ", str2, ": ", str), null, false, 12, null);
            return false;
        }
        atomicReference.set(bVarA);
        return true;
    }

    public final void a() {
        this.f45943f = true;
    }
}
