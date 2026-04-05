package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@JsonDslMarker
/* loaded from: classes10.dex */
public final class JsonObjectBuilder {
    private final Map<String, JsonElement> content = new LinkedHashMap();

    public final JsonObject build() {
        return new JsonObject(this.content);
    }

    public final JsonElement put(String key, JsonElement element) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }
}
