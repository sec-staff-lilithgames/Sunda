package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonPrimitiveDecoder extends AbstractJsonTreeDecoder {
    private final JsonElement value;

    public /* synthetic */ JsonPrimitiveDecoder(Json json, JsonElement jsonElement, String str, int i10, u uVar) {
        this(json, jsonElement, (i10 & 4) != 0 ? null : str);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        if (tag == TreeJsonEncoderKt.PRIMITIVE_TAG) {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveDecoder(Json json, JsonElement value, String str) {
        super(json, value, str, null);
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(value, "value");
        this.value = value;
        pushTag(TreeJsonEncoderKt.PRIMITIVE_TAG);
    }
}
