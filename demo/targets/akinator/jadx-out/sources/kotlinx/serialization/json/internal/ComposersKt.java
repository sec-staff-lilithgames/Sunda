package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ComposersKt {
    public static final Composer Composer(InternalJsonWriter sb2, Json json) {
        e0.checkNotNullParameter(sb2, "sb");
        e0.checkNotNullParameter(json, "json");
        return json.getConfiguration().getPrettyPrint() ? new ComposerWithPrettyPrint(sb2, json) : new Composer(sb2);
    }
}
