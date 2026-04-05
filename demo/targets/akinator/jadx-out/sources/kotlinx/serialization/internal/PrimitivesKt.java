package kotlinx.serialization.internal;

import e3.g;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sv.d0;
import sv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PrimitivesKt {
    private static final Map<KClass<?>, KSerializer<?>> BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

    public static final SerialDescriptor PrimitiveDescriptorSafe(String serialName, PrimitiveKind kind) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(kind, "kind");
        checkName(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }

    public static final <T> KSerializer<T> builtinSerializerOrNull(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) BUILTIN_SERIALIZERS.get(kClass);
    }

    private static final String capitalize(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? f.titlecase(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    private static final void checkName(String str) {
        for (KSerializer<?> kSerializer : BUILTIN_SERIALIZERS.values()) {
            if (e0.areEqual(str, kSerializer.getDescriptor().getSerialName())) {
                StringBuilder sbO = g.o("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbO.append(c1.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                sbO.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(d0.trimIndent(sbO.toString()));
            }
        }
    }
}
