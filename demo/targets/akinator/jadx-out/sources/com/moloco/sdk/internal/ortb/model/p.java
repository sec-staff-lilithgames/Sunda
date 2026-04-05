package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.ortb.model.a;
import com.moloco.sdk.internal.ortb.model.g;
import com.moloco.sdk.internal.ortb.model.i;
import com.moloco.sdk.internal.ortb.model.j;
import com.moloco.sdk.internal.ortb.model.o;
import com.moloco.sdk.internal.ortb.model.q;
import com.moloco.sdk.internal.ortb.model.t;
import com.moloco.sdk.internal.ortb.model.u;
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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class p {
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final t f46164a;

    /* renamed from: b, reason: collision with root package name */
    public final t f46165b;

    /* renamed from: c, reason: collision with root package name */
    public final q f46166c;

    /* renamed from: d, reason: collision with root package name */
    public final o f46167d;

    /* renamed from: e, reason: collision with root package name */
    public final g f46168e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f46169f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.a f46170g;

    /* renamed from: h, reason: collision with root package name */
    public final u f46171h;

    /* renamed from: i, reason: collision with root package name */
    public final j f46172i;

    /* renamed from: j, reason: collision with root package name */
    public final i f46173j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46174a;

        /* renamed from: b, reason: collision with root package name */
        public static final PluginGeneratedSerialDescriptor f46175b;

        static {
            a aVar = new a();
            f46174a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Player", aVar, 10);
            pluginGeneratedSerialDescriptor.addElement("skip", true);
            pluginGeneratedSerialDescriptor.addElement("close", false);
            pluginGeneratedSerialDescriptor.addElement("progress_bar", true);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            pluginGeneratedSerialDescriptor.addElement(C3191e4.h.G0, true);
            pluginGeneratedSerialDescriptor.addElement("is_all_area_clickable", false);
            pluginGeneratedSerialDescriptor.addElement("auto_store", true);
            pluginGeneratedSerialDescriptor.addElement("vast_privacy_icon", true);
            pluginGeneratedSerialDescriptor.addElement("dec", true);
            pluginGeneratedSerialDescriptor.addElement("countdown_timer", true);
            f46175b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p deserialize(Decoder decoder) {
            boolean z10;
            i iVar;
            j jVar;
            com.moloco.sdk.internal.ortb.model.a aVar;
            u uVar;
            g gVar;
            o oVar;
            q qVar;
            int i10;
            t tVar;
            t tVar2;
            e0.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46175b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i11 = 9;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                t.a aVar2 = t.a.f46205a;
                t tVar3 = (t) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, aVar2, null);
                t tVar4 = (t) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, aVar2, null);
                q qVar2 = (q) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, q.a.f46180a, null);
                o oVar2 = (o) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, o.a.f46162a, null);
                g gVar2 = (g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, g.a.f46112a, null);
                boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                com.moloco.sdk.internal.ortb.model.a aVar3 = (com.moloco.sdk.internal.ortb.model.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, a.C0373a.f46082a, null);
                u uVar2 = (u) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, u.a.f46210a, null);
                j jVar2 = (j) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, j.a.f46134a, null);
                tVar2 = tVar4;
                iVar = (i) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 9, i.a.f46124a, null);
                uVar = uVar2;
                aVar = aVar3;
                z10 = zDecodeBooleanElement;
                oVar = oVar2;
                jVar = jVar2;
                gVar = gVar2;
                qVar = qVar2;
                i10 = 1023;
                tVar = tVar3;
            } else {
                boolean z11 = true;
                boolean zDecodeBooleanElement2 = false;
                i iVar2 = null;
                j jVar3 = null;
                com.moloco.sdk.internal.ortb.model.a aVar4 = null;
                u uVar3 = null;
                g gVar3 = null;
                o oVar3 = null;
                t tVar5 = null;
                t tVar6 = null;
                int i12 = 0;
                q qVar3 = null;
                while (z11) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z11 = false;
                        case 0:
                            tVar5 = (t) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, t.a.f46205a, tVar5);
                            i12 |= 1;
                            i11 = 9;
                        case 1:
                            tVar6 = (t) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, t.a.f46205a, tVar6);
                            i12 |= 2;
                            i11 = 9;
                        case 2:
                            qVar3 = (q) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, q.a.f46180a, qVar3);
                            i12 |= 4;
                            i11 = 9;
                        case 3:
                            oVar3 = (o) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, o.a.f46162a, oVar3);
                            i12 |= 8;
                            i11 = 9;
                        case 4:
                            gVar3 = (g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, g.a.f46112a, gVar3);
                            i12 |= 16;
                            i11 = 9;
                        case 5:
                            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                            i12 |= 32;
                            i11 = 9;
                        case 6:
                            aVar4 = (com.moloco.sdk.internal.ortb.model.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, a.C0373a.f46082a, aVar4);
                            i12 |= 64;
                            i11 = 9;
                        case 7:
                            uVar3 = (u) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, u.a.f46210a, uVar3);
                            i12 |= 128;
                            i11 = 9;
                        case 8:
                            jVar3 = (j) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, j.a.f46134a, jVar3);
                            i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        case 9:
                            iVar2 = (i) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i11, i.a.f46124a, iVar2);
                            i12 |= 512;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                z10 = zDecodeBooleanElement2;
                iVar = iVar2;
                jVar = jVar3;
                aVar = aVar4;
                uVar = uVar3;
                gVar = gVar3;
                oVar = oVar3;
                qVar = qVar3;
                i10 = i12;
                tVar = tVar5;
                tVar2 = tVar6;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new p(i10, tVar, tVar2, qVar, oVar, gVar, z10, aVar, uVar, jVar, iVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            t.a aVar = t.a.f46205a;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(aVar), aVar, BuiltinSerializersKt.getNullable(q.a.f46180a), o.a.f46162a, BuiltinSerializersKt.getNullable(g.a.f46112a), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(a.C0373a.f46082a), BuiltinSerializersKt.getNullable(u.a.f46210a), BuiltinSerializersKt.getNullable(j.a.f46134a), BuiltinSerializersKt.getNullable(i.a.f46124a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46175b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, p value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46175b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            p.a(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final KSerializer<p> serializer() {
            return a.f46174a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public /* synthetic */ p(int i10, t tVar, t tVar2, q qVar, o oVar, g gVar, boolean z10, com.moloco.sdk.internal.ortb.model.a aVar, u uVar, j jVar, i iVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (42 != (i10 & 42)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 42, a.f46174a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f46164a = null;
        } else {
            this.f46164a = tVar;
        }
        this.f46165b = tVar2;
        if ((i10 & 4) == 0) {
            this.f46166c = null;
        } else {
            this.f46166c = qVar;
        }
        this.f46167d = oVar;
        if ((i10 & 16) == 0) {
            this.f46168e = null;
        } else {
            this.f46168e = gVar;
        }
        this.f46169f = z10;
        if ((i10 & 64) == 0) {
            this.f46170g = null;
        } else {
            this.f46170g = aVar;
        }
        if ((i10 & 128) == 0) {
            this.f46171h = null;
        } else {
            this.f46171h = uVar;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.f46172i = null;
        } else {
            this.f46172i = jVar;
        }
        if ((i10 & 512) == 0) {
            this.f46173j = null;
        } else {
            this.f46173j = iVar;
        }
    }

    public static final /* synthetic */ void a(p pVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pVar.f46164a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, t.a.f46205a, pVar.f46164a);
        }
        t.a aVar = t.a.f46205a;
        t tVar = pVar.f46165b;
        i iVar = pVar.f46173j;
        j jVar = pVar.f46172i;
        u uVar = pVar.f46171h;
        com.moloco.sdk.internal.ortb.model.a aVar2 = pVar.f46170g;
        g gVar = pVar.f46168e;
        q qVar = pVar.f46166c;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, aVar, tVar);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || qVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, q.a.f46180a, qVar);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, o.a.f46162a, pVar.f46167d);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, g.a.f46112a, gVar);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, pVar.f46169f);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || aVar2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, a.C0373a.f46082a, aVar2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, u.a.f46210a, uVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || jVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, j.a.f46134a, jVar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && iVar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, i.a.f46124a, iVar);
    }

    public final t c() {
        return this.f46165b;
    }

    public final i e() {
        return this.f46173j;
    }

    public final g g() {
        return this.f46168e;
    }

    public final j i() {
        return this.f46172i;
    }

    public final o k() {
        return this.f46167d;
    }

    public final q m() {
        return this.f46166c;
    }

    public final t o() {
        return this.f46164a;
    }

    public final u q() {
        return this.f46171h;
    }

    public final boolean s() {
        return this.f46169f;
    }

    public final com.moloco.sdk.internal.ortb.model.a a() {
        return this.f46170g;
    }

    public p(t tVar, t close, q qVar, o mute, g gVar, boolean z10, com.moloco.sdk.internal.ortb.model.a aVar, u uVar, j jVar, i iVar) {
        e0.checkNotNullParameter(close, "close");
        e0.checkNotNullParameter(mute, "mute");
        this.f46164a = tVar;
        this.f46165b = close;
        this.f46166c = qVar;
        this.f46167d = mute;
        this.f46168e = gVar;
        this.f46169f = z10;
        this.f46170g = aVar;
        this.f46171h = uVar;
        this.f46172i = jVar;
        this.f46173j = iVar;
    }

    @SerialName("auto_store")
    public static /* synthetic */ void b() {
    }

    @SerialName("close")
    public static /* synthetic */ void d() {
    }

    @SerialName("countdown_timer")
    public static /* synthetic */ void f() {
    }

    @SerialName(C3191e4.h.G0)
    public static /* synthetic */ void h() {
    }

    @SerialName("dec")
    public static /* synthetic */ void j() {
    }

    @SerialName(CampaignEx.JSON_NATIVE_VIDEO_MUTE)
    public static /* synthetic */ void l() {
    }

    @SerialName("progress_bar")
    public static /* synthetic */ void n() {
    }

    @SerialName("skip")
    public static /* synthetic */ void p() {
    }

    @SerialName("vast_privacy_icon")
    public static /* synthetic */ void r() {
    }

    @SerialName("is_all_area_clickable")
    public static /* synthetic */ void t() {
    }

    public /* synthetic */ p(t tVar, t tVar2, q qVar, o oVar, g gVar, boolean z10, com.moloco.sdk.internal.ortb.model.a aVar, u uVar, j jVar, i iVar, int i10, kotlin.jvm.internal.u uVar2) {
        this((i10 & 1) != 0 ? null : tVar, tVar2, (i10 & 4) != 0 ? null : qVar, oVar, (i10 & 16) != 0 ? null : gVar, z10, (i10 & 64) != 0 ? null : aVar, (i10 & 128) != 0 ? null : uVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : jVar, (i10 & 512) != 0 ? null : iVar);
    }
}
