package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonTreeListEncoder extends AbstractJsonTreeEncoder {
    private final ArrayList<JsonElement> array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListEncoder(Json json, l nodeConsumer) {
        super(json, nodeConsumer, null);
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.array = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int i10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement getCurrent() {
        return new JsonArray(this.array);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void putElement(String key, JsonElement element) throws NumberFormatException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(element, "element");
        this.array.add(Integer.parseInt(key), element);
    }
}
