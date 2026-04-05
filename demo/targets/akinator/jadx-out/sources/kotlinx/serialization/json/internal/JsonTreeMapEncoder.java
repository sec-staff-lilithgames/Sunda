package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import kv.l;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonTreeMapEncoder extends JsonTreeEncoder {
    private boolean isKey;
    private String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapEncoder(Json json, l nodeConsumer) {
        super(json, nodeConsumer);
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement getCurrent() {
        return new JsonObject(getContent());
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void putElement(String key, JsonElement element) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(element, "element");
        if (!this.isKey) {
            Map<String, JsonElement> content = getContent();
            String str = this.tag;
            if (str == null) {
                e0.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            content.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof JsonObject) {
                throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new t();
            }
            throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
        }
    }
}
