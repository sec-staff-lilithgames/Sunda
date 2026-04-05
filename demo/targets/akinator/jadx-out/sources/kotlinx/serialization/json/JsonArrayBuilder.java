package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@JsonDslMarker
/* loaded from: classes10.dex */
public final class JsonArrayBuilder {
    private final List<JsonElement> content = new ArrayList();

    public final boolean add(JsonElement element) {
        e0.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    @ExperimentalSerializationApi
    public final boolean addAll(Collection<? extends JsonElement> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.content.addAll(elements);
    }

    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
