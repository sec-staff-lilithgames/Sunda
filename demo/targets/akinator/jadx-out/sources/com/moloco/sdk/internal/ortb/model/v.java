package com.moloco.sdk.internal.ortb.model;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class v {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    public static final tu.o f46212b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f46213c = new v("Top", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f46214e = new v("Center", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final v f46215f = new v("Bottom", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f46216g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46217h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46218a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final EnumDescriptor f46219b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.moloco.sdk.internal.ortb.model.VerticalAlignment", 3);
            enumDescriptor.addElement("top", false);
            enumDescriptor.addElement(TtmlNode.CENTER, false);
            enumDescriptor.addElement("bottom", false);
            f46219b = enumDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v deserialize(Decoder decoder) {
            e0.checkNotNullParameter(decoder, "decoder");
            return v.values()[decoder.decodeEnum(f46219b)];
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46219b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, v value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            encoder.encodeEnum(f46219b, value.ordinal());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) v.f46212b.getValue();
        }

        public final KSerializer<v> serializer() {
            return a();
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    static {
        v[] vVarArrA = a();
        f46216g = vVarArrA;
        f46217h = cv.b.enumEntries(vVarArrA);
        Companion = new b(null);
        f46212b = tu.q.lazy(tu.s.f87404c, (kv.a) new a1.k(10));
    }

    public v(String str, int i10) {
    }

    public static final /* synthetic */ v[] a() {
        return new v[]{f46213c, f46214e, f46215f};
    }

    public static cv.a d() {
        return f46217h;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f46216g.clone();
    }
}
