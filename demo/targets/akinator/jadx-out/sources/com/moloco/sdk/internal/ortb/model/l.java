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
public final class l {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    public static final tu.o f46139b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f46140c = new l("Start", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final l f46141e = new l("Center", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final l f46142f = new l("End", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final l f46143g = new l("Left", 3);

    /* renamed from: h, reason: collision with root package name */
    public static final l f46144h = new l("Right", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l[] f46145i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46146j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46147a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final EnumDescriptor f46148b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", 5);
            enumDescriptor.addElement("start", false);
            enumDescriptor.addElement(TtmlNode.CENTER, false);
            enumDescriptor.addElement(TtmlNode.END, false);
            enumDescriptor.addElement(TtmlNode.LEFT, false);
            enumDescriptor.addElement(TtmlNode.RIGHT, false);
            f46148b = enumDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l deserialize(Decoder decoder) {
            e0.checkNotNullParameter(decoder, "decoder");
            return l.values()[decoder.decodeEnum(f46148b)];
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return f46148b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, l value) {
            e0.checkNotNullParameter(encoder, "encoder");
            e0.checkNotNullParameter(value, "value");
            encoder.encodeEnum(f46148b, value.ordinal());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) l.f46139b.getValue();
        }

        public final KSerializer<l> serializer() {
            return a();
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    static {
        l[] lVarArrA = a();
        f46145i = lVarArrA;
        f46146j = cv.b.enumEntries(lVarArrA);
        Companion = new b(null);
        f46139b = tu.q.lazy(tu.s.f87404c, (kv.a) new a1.k(9));
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{f46140c, f46141e, f46142f, f46143g, f46144h};
    }

    public static cv.a d() {
        return f46146j;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f46145i.clone();
    }
}
