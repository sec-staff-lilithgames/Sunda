package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringJsonLexerKt {
    public static final StringJsonLexer StringJsonLexer(Json json, String source) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(source, "source");
        return !json.getConfiguration().getAllowComments() ? new StringJsonLexer(source) : new StringJsonLexerWithComments(source);
    }
}
