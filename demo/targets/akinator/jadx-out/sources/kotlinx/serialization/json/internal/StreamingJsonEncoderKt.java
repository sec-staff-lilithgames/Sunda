package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;
import tu.g0;
import tu.k0;
import tu.o0;
import tu.t0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StreamingJsonEncoderKt {
    private static final Set<SerialDescriptor> unsignedNumberDescriptors = c2.setOf((Object[]) new SerialDescriptor[]{BuiltinSerializersKt.serializer(k0.f87387c).getDescriptor(), BuiltinSerializersKt.serializer(o0.f87397c).getDescriptor(), BuiltinSerializersKt.serializer(g0.f87381c).getDescriptor(), BuiltinSerializersKt.serializer(t0.f87408c).getDescriptor()});

    public static final boolean isUnquotedLiteral(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && e0.areEqual(serialDescriptor, JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }

    public static final boolean isUnsignedNumber(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && unsignedNumberDescriptors.contains(serialDescriptor);
    }
}
