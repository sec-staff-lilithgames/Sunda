package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonTreeMapDecoder extends JsonTreeDecoder {
    private final List<String> keys;
    private int position;
    private final int size;
    private final JsonObject value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapDecoder(Json json, JsonObject value) {
        super(json, value, null, null, 12, null);
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(value, "value");
        this.value = value;
        List<String> list = y0.toList(getValue().keySet());
        this.keys = list;
        this.size = list.size() * 2;
        this.position = -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        return this.position % 2 == 0 ? JsonElementKt.JsonPrimitive(tag) : (JsonElement) p1.getValue(getValue(), tag);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.position;
        if (i10 >= this.size - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.position = i11;
        return i11;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return this.keys.get(i10 / 2);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }
}
