package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonSchemaCacheKt {
    public static final DescriptorSchemaCache getSchemaCache(Json json) {
        e0.checkNotNullParameter(json, "<this>");
        return json.get_schemaCache$kotlinx_serialization_json();
    }

    public static /* synthetic */ void getSchemaCache$annotations(Json json) {
    }
}
