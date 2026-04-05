package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonLiteral extends JsonPrimitive {
    private final SerialDescriptor coerceToInlineType;
    private final String content;
    private final boolean isString;

    public /* synthetic */ JsonLiteral(Object obj, boolean z10, SerialDescriptor serialDescriptor, int i10, u uVar) {
        this(obj, z10, (i10 & 4) != 0 ? null : serialDescriptor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonLiteral.class != obj.getClass()) {
            return false;
        }
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        return isString() == jsonLiteral.isString() && e0.areEqual(getContent(), jsonLiteral.getContent());
    }

    public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() {
        return this.coerceToInlineType;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String getContent() {
        return this.content;
    }

    public int hashCode() {
        return getContent().hashCode() + (Boolean.hashCode(isString()) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return this.isString;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!isString()) {
            return getContent();
        }
        StringBuilder sb2 = new StringBuilder();
        StringOpsKt.printQuoted(sb2, getContent());
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLiteral(Object body, boolean z10, SerialDescriptor serialDescriptor) {
        super(null);
        e0.checkNotNullParameter(body, "body");
        this.isString = z10;
        this.coerceToInlineType = serialDescriptor;
        this.content = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
