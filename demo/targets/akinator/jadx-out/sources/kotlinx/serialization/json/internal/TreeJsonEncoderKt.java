package kotlinx.serialization.json.internal;

import j1.o2;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import tu.x0;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TreeJsonEncoderKt {
    public static final String PRIMITIVE_TAG = "primitive";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof PrimitiveKind) || serialDescriptor.getKind() == SerialKind.ENUM.INSTANCE;
    }

    @JsonFriendModuleApi
    public static final <T> JsonElement writeJson(Json json, T t10, SerializationStrategy<? super T> serializer) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(serializer, "serializer");
        b1 b1Var = new b1();
        new JsonTreeEncoder(json, new a(b1Var, 1)).encodeSerializableValue(serializer, t10);
        Object obj = b1Var.f71816b;
        if (obj != null) {
            return (JsonElement) obj;
        }
        e0.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 writeJson$lambda$0(b1 b1Var, JsonElement it) {
        e0.checkNotNullParameter(it, "it");
        b1Var.f71816b = it;
        return x0.f87415a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, kv.a path) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(path, "path");
        String str = QpyI.vBTYhcr;
        e0.reifiedOperationMarker(3, str);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        e0.reifiedOperationMarker(4, str);
        o2.y(JsonElement.class, sb2, ", but had ", value, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append((String) path.invoke());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }
}
