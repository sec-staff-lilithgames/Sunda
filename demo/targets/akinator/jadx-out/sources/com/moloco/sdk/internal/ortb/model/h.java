package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import j1.m0;
import j1.o0;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final h f46114a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f46115b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING.INSTANCE);

    public long a(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return o0.Color(Color.parseColor(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return m0.m4848boximpl(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f46115b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        a(encoder, ((m0) obj).m4868unboximpl());
    }

    public void a(Encoder encoder, long j10) {
        e0.checkNotNullParameter(encoder, "encoder");
        throw new tu.u("Color encoding is not supported");
    }
}
